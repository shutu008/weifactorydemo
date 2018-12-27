package com.vastsum.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.core.service.HandRemoteService;
import com.vastsum.entity.Device;
import com.vastsum.entity.DeviceSn;
import com.vastsum.entity.Role;
import com.vastsum.entity.User;
import com.vastsum.entity.vo.UserDevice;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.pojo.PageCondition;
import com.vastsum.service.BatchService;
import com.vastsum.service.BizControlService;
import com.vastsum.service.DeviceService;
import com.vastsum.service.HistoryDataService;
import com.vastsum.service.ImageServer;
import com.vastsum.service.OrderService;
import com.vastsum.service.ParamSetService;
import com.vastsum.service.RoleService;
import com.vastsum.service.UserService;
import com.vastsum.utils.DateTimeUtils;
import com.vastsum.utils.PageUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 设备控制器，用于对设备表做增删改查
 * @author ssj
 */
@RestController
@RequestMapping("/device")
@Api(value="/device",tags = {"设备管理"})
public class DeviceController extends BaseController {
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private BizControlService bizControlService;
    @Autowired
    private BatchService batchService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private HistoryDataService historyDataService;
    @Autowired
    private ImageServer imageServer;
    @Autowired
    private OrderService orderService;
    @Autowired
    private ParamSetService paramSetService;
    @Autowired
    private UserService userService;
    //远程服务
    @Autowired
    private HandRemoteService handRemoteService;

    @RequestMapping(value="/deviceList/{userId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据用户id查询设备",notes = "根据用户id查询设备")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "userId",value = "用户id",required = true)
    })
    public ResponseEntity<ResultModel> deviceList(@PathVariable Integer userId)
    {
        if (userId == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        //判断用户角色，如果是普通用户，获取用户设备，如果是专家，获取托管给专家的设备
        Role role = roleService.selectRoleByUserId(userId);
        if (role == null) {
			return V.error(" 此用户无角色！");
		}
        List<Device> devices = null;
        if ("ROLE_USER".equals(role.getRoleName())) {
        	devices = deviceService.findDevicesByuserId(userId);
		}else if ("ROLE_EXPERT".equals(role.getRoleName())) {
			devices = deviceService.turstDevicesByExpertId(userId);
		}
        //获取在线设备
        ArrayList<String> onlineDeviceList = handRemoteService.getOnlineDeviceList();
        //增加在线状态
        for (String onDevice : onlineDeviceList) {
			for (Device device : devices) {
				if (onDevice != null && onDevice.equals(device.getSn())) {
					device.setOnlineStatus("1");
				}
			}
		}
        return ResponseEntity.ok(ResultModel.ok(devices));
    }
    
    @GetMapping(value="/deviceInfo/{deviceId}")
    @ApiOperation(value = "获取设备详情@20180423")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id",required = true)
    })
    public ResponseEntity<ResultModel> deviceId(
            @PathVariable Integer deviceId)
    {
        if (deviceId == null) {
           return V.error("设备ID不能为空");
        }
       return V.ok(deviceService.getById(deviceId));
    }


    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ApiOperation(value="添加设备")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号", required = true),
            @ApiImplicitParam(paramType = "query",name = "deviceType",value = "设备规格",required = false),
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户id",required = false),
            @ApiImplicitParam(paramType = "query",name = "note",value = "备注信息",required = false)
    })
    public ResponseEntity<ResultModel> add(
            @RequestParam(value = "sn",required = true)String sn,
            @RequestParam(value = "deviceType",required = false)String deviceType,
            @RequestParam(value = "userId",required = false)Integer userId,
            @RequestParam(value = "note",required = false)String note
    )
    {
        if (sn==null || "".equals(sn)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
        }
        Device device1 = deviceService.getDeviceBySn(sn);
        //判断设备是否被绑定过
        if (device1 != null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_BINDED));
        }
        //判断输入的设备号是否是激活的设备
        DeviceSn deviceSn = deviceService.getBySn(sn);

        //设备序列号是否存在
        if (deviceSn == null){
           return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NOT_FOUND)) ;
        }
        //设备是否被激活
        if (!deviceSn.getStatus()){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_NOT_ACTIVATE));
        }

        Device device = new Device();
        device.setSn(sn);
        device.setDeviceType(deviceType);
        device.setUserId(userId);
        device.setNote(note);
        device.setGmtCreate(new Date());
        device.setGmtModified(new Date());

        //添加设备，返回状态
        int i = deviceService.add(device);
        //初始化控制机构
        bizControlService.intActuator(sn);
        if(i>0) {
            return ResponseEntity.ok(ResultModel.ok(ResultStatus.DEVICE_ADD_SUCCESS));
        } else {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ADD_FAILED));
        }
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "根据id删除设备")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "id",value = "设备id",required = true)
    })
    public ResponseEntity<ResultModel> delete(@PathVariable Integer id){
        if (id == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        Device device = new Device();
        device.setDeviceId(id);
        //根据设备id获取设备的序列号信息
        String  sn = deviceService.getSnByDeviceId(id);

        deviceService.deleteByDeviceId(device);
        //删除设备的控制机构信息
        bizControlService.deleteBySn(sn);
        //删除和批次相关的信息
        batchService.deleteByDeviceId(id);
        historyDataService.deleteBySn(sn);
       orderService.deleteBySn(sn);
       imageServer.deleteBySn(sn);
       paramSetService.deleteBySn(sn);

        return ResponseEntity.ok(ResultModel.ok(ResultStatus.DEVICE_DELETE_SUCCESS));

    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "根据id修改设备")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",value = "设备id",required = true),
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = false),
            @ApiImplicitParam(paramType = "query",name = "deviceType",value = "设备规格",required = false),
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户id",required = false),
            @ApiImplicitParam(paramType = "query",name = "note",value = "备注信息",required = false)
    })
    public ResponseEntity<ResultModel> modify(
            @RequestParam(name = "id") Integer id,
            @RequestParam(name = "sn",required = false)String sn,
            @RequestParam(name = "deviceType",required = false)String deviceType,
            @RequestParam(name = "userId",required = false)Integer userId,
            @RequestParam(name = "note",required = false)String note
    ){
        Device device = new Device();
        if(id == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        device.setDeviceId(id);
        device.setSn(sn);
        device.setDeviceType(deviceType);
        device.setUserId(userId);
        device.setNote(note);
        //调用修改程序
        int i = deviceService.update(device);
        if (i>0){
            return ResponseEntity.ok(ResultModel.ok());
        }else {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_CHANGE_FAILED));
        }
    }


    @PostMapping(value = "/search")
    @ApiOperation(value = "根据条件查询设备列表@20180520")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = false),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "每页显示信息数目",required = false),
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = false),
            @ApiImplicitParam(paramType = "query",name = "deviceType",value = "设备类型",required = false),
            @ApiImplicitParam(paramType = "query",name = "username",value = "用户名",required = false)
    })
    public ResponseEntity<ResultModel> list(Device device,String username, PageCondition pageCondition){
       PageInfo<Device> pageInfo = deviceService.pageByDevice(device, username, pageCondition);
       PageInfo<UserDevice> userDevicePageInfo = new PageInfo<>();
       List<UserDevice> deviceList = new ArrayList<>();
       userDevicePageInfo = PageUtils.convert(pageInfo, deviceList);
       
       userDevicePageInfo.setList(deviceList);
       List<Device> list = pageInfo.getList();
       if (list == null || list.isEmpty()) {
		return V.ok(userDevicePageInfo);
       }
       for (Device d : list) {
		User user = userService.findUserByUserId(d.getUserId());
		UserDevice userDevice = new UserDevice();
		userDevice.setDeviceId(d.getDeviceId());
		userDevice.setDeviceType(d.getDeviceType());
		userDevice.setGmtCreate(d.getGmtCreate());
		userDevice.setNote(d.getNote());
		
		userDevice.setSn(d.getSn());
		if (user !=null) {
			userDevice.setRealname(user.getRealname());
			userDevice.setUserEmail(user.getUserEmail());
			userDevice.setUserId(user.getUserId());
			userDevice.setUsername(user.getUserName());
			userDevice.setUserPhone(user.getUserPhone());
		}
		deviceList.add(userDevice);
	}
       
       
       return V.ok(userDevicePageInfo);
	}
    
    //管理员获取所有的设备列表
    @GetMapping(value = "/listAll/{page}/{pageSize}")
    @ApiOperation(value = "管理员获取所有的设备列表@20180403", 
    notes="用户名-username；用户真实姓名-realname；手机号-userPhone；邮箱-userEmail；设备序列号-sn；设备类型-deviceType；创建时间-gmtCreate；"
    		+ "如果用户真实姓名为空，显示用户名，设备类型根据字典获取，展示中文名；")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = false),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "每页显示信息数目",required = false)
    })
    public ResponseEntity<ResultModel> listUserDevice(@PathVariable Integer page,@PathVariable Integer pageSize){
        PageInfo<UserDevice> pageInfoDevice = deviceService.findByPage(page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(pageInfoDevice));
    }

    @ApiIgnore
    @GetMapping(value = "/list/trust/{exportId}/{page}/{pageSize}")
    @ApiOperation(value = "根据专家id获取托管设备列表@20171118")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "exportId",value = "专家id",required = true),
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> pageTrustDevice(@PathVariable Integer exportId,
                                                       @PathVariable Integer page,
                                                       @PathVariable Integer pageSize){
        PageInfo<Device> pageInfoDevice = deviceService.pageTurstDevicesByExpertId(exportId, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(pageInfoDevice));
    }



    @GetMapping(value = "/list/onDevice")
    @ApiOperation(value = "获取所有的在线设备列表@20180427")
    public ResponseEntity<ResultModel> listOnDevice(){
    	ArrayList<String> deviceList = handRemoteService.getOnlineDeviceList();
        return V.ok(deviceList);
    }

    @GetMapping(value = "/{sn}")
    @ApiOperation(value = "关闭设备与服务器之间的连接@20171021")
    @ApiImplicitParam(paramType = "path", name = "sn", value = "设备序列号", required = true)
    public ResponseEntity<ResultModel> closeDevice(@PathVariable String sn){
       return V.ok();
    }

    @ApiIgnore
    @PostMapping(value = "/sensor")
    @ApiOperation(value = "设备执行机构控制@20171021")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "sn", value = "设备序列号",required = true),
            @ApiImplicitParam(paramType = "query", name = "sensorId", value = "传感器Id", required = true),
            @ApiImplicitParam(paramType = "query", name = "status", value = "开关状态1，0", required = true),
            @ApiImplicitParam(paramType = "query", name = "timeVal", value = "是否永久执行标识"),
            @ApiImplicitParam(paramType = "query", name = "startTime", value = "执行开始时间"),
            @ApiImplicitParam(paramType = "query", name = "endTime", value = "执行结束时间")
    })
    public ResponseEntity<ResultModel> control(String sn, String sensorId, String status,String timeVal, Date startTime, Date endTime){
        if (sn == null || "".equals(sn)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
        }
        if (sensorId == null || "".equals(sensorId)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.SENSOR_ID_NOT_NULL));
        }
        if (status == null || "".equals("status")){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.STATUS_NOT_NULL));
        }
        if ( timeVal == null && (startTime == null || endTime == null)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.SENSOR_TIME));
        }
        long time = 0L;
        if (timeVal != null){
            if (Integer.parseInt(timeVal) == 1){

                time = Long.MAX_VALUE;
                System.out.println("timeVal:"+timeVal+";time:"+time);

            }
        }else {
            //获取执行时长
             time = endTime.getTime()-startTime.getTime();
        }
        return V.ok();
    }
    
    @PostMapping("/sn/search")
    @ApiOperation(value = "查询设备序列号列表@20180520")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = false),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "每页显示信息数目",required = false),
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号", required = false),
            @ApiImplicitParam(paramType = "query",name = "status",value = "设备状态", required = false),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "添加开始时间", required = false),
            @ApiImplicitParam(paramType = "query",name = "endTime",value = "添加结束时间", required = false)
    })
    public ResponseEntity<ResultModel> listDeviceSn(DeviceSn deviceSn,Date startTime,Date endTime,PageCondition pageCondition){
    	if (startTime != null && endTime != null) {
			endTime = DateTimeUtils.getOffsetHourDate(endTime, 24);
		}
        PageInfo<DeviceSn> pageInfoDevice = deviceService.pageByDeviceSn(deviceSn, startTime, endTime, pageCondition);
        return ResponseEntity.ok(ResultModel.ok(pageInfoDevice));
    }
    
    
    
    @PostMapping("/sn/add")
    @ApiOperation(value="添加设备序列号@20180104")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号", required = true)
    })
    public ResponseEntity<ResultModel> add(String sn){
       if (StringUtils.isBlank(sn)) {
    	   return V.error("设备序列号不能为空");
       }
       if (sn.length() != 17) {
		return V.error("设备序列号必须为17位有效字符");
	}
       //判断系统中是否已经有了这个序列号，如果有的话，不能在添加
       boolean b = deviceService.hasDeviceSn(sn);
       if (b) {
		//系统中有了设备序列号
    	   return V.error("系统中已存在次设备序列号");
       }
       DeviceSn deviceSn = new DeviceSn();
       deviceSn.setGmtCreate(new Date());
       deviceSn.setStatus(false);
       deviceSn.setSn(sn);
       deviceService.addDeviceSn(deviceSn);
       return V.ok();
    }
    
    
    @PostMapping("/sn/addBatch")
    @ApiOperation("批量生成设备序列号@20180104")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType = "query",name = "num",value = "设备序列号生成数量，1<=number<=10000", required = true),
        @ApiImplicitParam(paramType = "query",name = "date",value = "时间", required = true)
	})
    public ResponseEntity<ResultModel>addBatch(Integer num, Date date){
    	if (num == null || num<=0 || num>10000) {
			return V.error("请填入合法数值");
		}
    	if (date == null) {
			return V.error("时间不能为空");
		}
    	
    	for (int i = 0; i < num; i++) {
    		//生成一个序列号ZWGC+出厂日期（20180104）+随机值(5位)
    		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    		String dateStr = dateFormat.format(date);
    		String numeric = RandomStringUtils.randomNumeric(5);
    		String sn = "ZWGC"+dateStr+numeric;
			boolean b = deviceService.hasDeviceSn(sn);
	       if (b) {
			//系统中有了设备序列号
	    	   continue;
	       }
	       DeviceSn deviceSn = new DeviceSn();
	       deviceSn.setSn(sn);
	       deviceSn.setGmtCreate(new Date());
	       deviceSn.setStatus(false);
	       deviceService.addDeviceSn(deviceSn);
		}
    	return V.ok();
    }

}
