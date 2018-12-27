package com.vastsum.controller;

import static com.vastsum.utils.OrderUtil.getOrderBody;
import static com.vastsum.utils.OrderUtil.getOutTradeOrder;
import static com.vastsum.utils.OrderUtil.getTotalFee;

import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.BizOrder;
import com.vastsum.entity.Device;
import com.vastsum.entity.Role;
import com.vastsum.entity.User;
import com.vastsum.entity.vo.BizOrderVO;
import com.vastsum.entity.vo.OrderVO;
import com.vastsum.enums.ResultStatus;
import com.vastsum.exception.OrderException;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.pojo.PageCondition;
import com.vastsum.service.DeviceService;
import com.vastsum.service.OrderService;
import com.vastsum.service.RoleService;
import com.vastsum.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author ssj
 * @create 2017-10-15 21:08
 */
@RestController
@RequestMapping(value = "/order")
@Api(value = "/order",tags = {"订单管理"})
public class OrderController extends BaseController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/device/{deviceId}")
    @ApiOperation(value = "根据设备id获取托管信息视图(点击申请专家托管)@20180422")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id-@5",required = true)
    })
    public ResponseEntity<ResultModel> getOrderVO(@PathVariable Integer deviceId){
        if (deviceId == null){
            return V.error(getText("weifactory.device.deviceId.notNull"));
        }
        
        Device deviceC = deviceService.getById(deviceId);
        if (deviceC != null) {
			if (!"0".equals(deviceC.getTrustStatus())) {
				 //支付成功之后，不能再支付
	        	logger.info("设备已托管，不能再次托管,托管状态："+deviceC.getTrustStatus());
	            return V.error("本设备已经被托管");
			}
		}
        
        OrderVO orderVO = new OrderVO();
        Device device = deviceService.getById(deviceId);
        if (device == null) {
			return V.error(getText("weifactory.device.notFound"));
		}
        orderVO.setSn(device.getSn());
        orderVO.setDeviceType(device.getDeviceType());
        return V.ok(orderVO);
    }

    //根据相关参数生成订单信息
    @PostMapping(value = "/pay")
    @ApiOperation(value="根据相关参数生成订单信息@20180409")//{sn}/{batchId}/{deposit}/{exportId}
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "deviceId", value = "设备id", required = true),
            @ApiImplicitParam(paramType = "query",name = "deposit",value = "托管方式",required = true),
            @ApiImplicitParam(paramType = "query",name = "exportId",value = "专家id",required = true),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "托管开始时间",required = false),
            @ApiImplicitParam(paramType = "query",name = "endTime",value = "托管结束时间",required = false)
    })
    public ResponseEntity<ResultModel> getOrder(Integer deviceId, 
    		String deposit, 
    		Integer exportId,
    		Date startTime,
    		Date endTime) throws OrderException{
        if (deviceId == null) {
        	return V.error(getText("weifactory.device.deviceId.notNull"));
		}
        if (StringUtils.isBlank(deposit)) {
        	return  ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_DEPOSIT_NOT_NULL));
		}
        if (exportId == null) {
        	return  ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_EXPORTID_NOT_NUL));
		}
        
        /**
         * 0.查询是否已经被托管
         * 1.保存订单状态（订单表和设备表）
         * 2.计算价格
         * 3.保存订单
         */
        
      // boolean b = orderService.hasBizOrderByDeviceId(deviceId);
        Device deviceC = deviceService.getById(deviceId);
        if (deviceC != null) {
			if (!"0".equals(deviceC.getTrustStatus())) {
				 //支付成功之后，不能再支付
	        	logger.info("设备已托管，不能再次托管,托管状态："+deviceC.getTrustStatus());
	            return V.error("本设备已经被托管");
			}
		}
        
        //生成订单
        BizOrder bizOrder = new BizOrder();
        bizOrder.setDeposit(deposit);
        bizOrder.setExpertId(exportId);
        bizOrder.setOrderBody(getOrderBody());
        String orderNumber = getOutTradeOrder();
        bizOrder.setOrderNumber(orderNumber);
        bizOrder.setOrderPrice(getTotalFee(deposit, startTime, endTime));
        bizOrder.setOrderStart(new Date());
        bizOrder.setOrderState(new Byte("1"));
        //获取设备序列号
        Device device = deviceService.getById(deviceId);
        bizOrder.setSn(device.getSn());
        orderService.saveBizOrder(bizOrder);
        //更改设备的订单状态标识
        device.setOrderStatus("1");
        device.setGmtModified(new Date());
        deviceService.update(device);
        //获取保存好的订单
        BizOrderVO bizOrderVO = new BizOrderVO();
        try {
			BeanUtils.copyProperties(bizOrderVO, bizOrder);
		} catch (Exception e) {
			logger.error("订单拷贝异常",e);
			return ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_ERROR));
		}
        //根据转接id获取专家信息,专家没有昵称就用用户名
        User user = userService.findUserByUserId(exportId);
        String userName = user.getUserName();
        bizOrderVO.setExpertName(userName);
        bizOrderVO.setStartTime(startTime);
        bizOrderVO.setEndTime(endTime);
        return V.ok(bizOrderVO);
    }


    @PostMapping(value = "/list/search")
    @ApiOperation(value = "根据用户id获取订单列表（普通用户和管理员用统一接口）@20170520")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户ID",required = true),
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = false),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "页数",required = false),
            @ApiImplicitParam(paramType = "query",name = "orderNumber",value = "订单号",required = false),
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = false),
            @ApiImplicitParam(paramType = "query",name = "orderState",value = "订单状态",required = false)
    })
    public ResponseEntity<ResultModel> listOrderByUserId(Integer userId,
                                                         PageCondition pageCondition,BizOrder bizOrder){
        if (userId == null){
           return V.error("用户ID不能为空");
        }
        //根据用户id获取用户权限，如果权限为管理员，则查询出所有的订单
        Role role = roleService.selectRoleByUserId(userId);
        if (role.getRoleName()!= null && "ROLE_ADMIN".equals(role.getRoleName())){
            PageInfo<BizOrder> bizOrderPageInfo = orderService.pageByOrder(bizOrder, pageCondition);
            return ResponseEntity.ok(ResultModel.ok(bizOrderPageInfo));
        }
        PageInfo<BizOrder> bizOrderPageInfo = orderService.pageOrderByUser(userId, bizOrder, pageCondition);
        return ResponseEntity.ok(ResultModel.ok(bizOrderPageInfo));
    }
    

    @GetMapping(value = "/{orderId}")
    @ApiOperation(value = "查看订单详情@20171029")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "orderId",value = "订单ID",required = true)
    })
    public ResponseEntity<ResultModel> getOrderById(@PathVariable Integer orderId){
        if (orderId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_ID_NULL));
        }
        BizOrder bizOrder = orderService.getOrderById(orderId);
        User user = userService.findUserByUserId(bizOrder.getExpertId());
        String username = user.getUserName();
        BizOrderVO bizOrderVO = new BizOrderVO();
        bizOrderVO.setExpertName(username);
       try {
		BeanUtils.copyProperties(bizOrderVO, bizOrder);
	} catch (Exception e) {
		logger.error("beanUtils拷贝异常");
	}
        return ResponseEntity.ok(ResultModel.ok(bizOrderVO));
    }
    
    
    @GetMapping(value = "/cancel/{orderId}")
    @ApiOperation(value = "取消订单@20171029")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "orderId",value = "订单ID",required = true)
    })
    public ResponseEntity<ResultModel> cancelOrder(@PathVariable Integer orderId){
        if (orderId == null){
            return V.error("订单ID不能为空");
        }
       orderService.updateBizOrderStatus(orderId, "4");
    return V.ok();
    }
}
