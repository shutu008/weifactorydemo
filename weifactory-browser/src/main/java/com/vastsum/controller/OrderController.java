package com.vastsum.controller;

import static com.vastsum.utils.OrderUtil.getOrderBody;
import static com.vastsum.utils.OrderUtil.getOutTradeOrder;
import static com.vastsum.utils.OrderUtil.getTotalFee;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.vastsum.entity.Batch;
import com.vastsum.entity.BizOrder;
import com.vastsum.entity.Role;
import com.vastsum.entity.User;
import com.vastsum.entity.vo.BizOrderVO;
import com.vastsum.entity.vo.OrderVO;
import com.vastsum.enums.DepositEnum;
import com.vastsum.enums.ResultStatus;
import com.vastsum.exception.OrderException;
import com.vastsum.model.ResultModel;
import com.vastsum.service.BatchService;
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
    private BatchService batchService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/device/{deviceId}")
    @ApiOperation(value = "根据设备id获取托管信息视图@20170115")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id-@5",required = true)
    })
    public ResponseEntity<ResultModel> getOrderVO(@PathVariable Integer deviceId){
        //获取专家
        if (deviceId == null || "".equals(deviceId)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        List<User> experts = userService.listExperts();
        //封装托管方式
        Map<String, String> deposit = new HashMap<>();
        deposit.put(""+DepositEnum.DEPOSIT_ALL.getValue(), DepositEnum.DEPOSIT_ALL.getName());
        deposit.put(""+DepositEnum.DEPOSIT_SELF.getValue(), DepositEnum.DEPOSIT_SELF.getName());

        //根据设备id获取最新的批次信息
        Batch batch = batchService.selectLastBatchByDeviceId(deviceId);
        //分装返回的视图对象
        OrderVO orderVO = new OrderVO();
        orderVO.setBatchId(batch.getBatchId());
        orderVO.setPlantOne(batch.getPlantOne());
        orderVO.setPlantTwo(batch.getPlantTwo());
        orderVO.setPlantThree(batch.getPlantThree());
        orderVO.setCost(0.01);
        orderVO.setDeposit(deposit);
        orderVO.setExports(experts);
        orderVO.setSn(deviceService.getSnByDeviceId(batch.getDeviceId()));
        return ResponseEntity.ok(ResultModel.ok(orderVO));
    }

    @PostMapping(value = "/pay")
    @ApiOperation(value="根据相关参数生成订单信息@20171016")//{sn}/{batchId}/{deposit}/{exportId}
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn", value = "设备序列号", required = true, dataType = "string"),
            @ApiImplicitParam(paramType = "query",name = "batchId", value = "批次id", required = true, dataType = "string"),
            @ApiImplicitParam(paramType = "query",name = "deposit",value = "托管方式",required = true),
            @ApiImplicitParam(paramType = "query",name = "exportId",value = "专家id",required = true),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "托管开始时间",required = false),
            @ApiImplicitParam(paramType = "query",name = "endTime",value = "托管结束时间",required = false)
    })
    public ResponseEntity<ResultModel> getOrder(String sn, 
    		Integer batchId, 
    		String deposit, 
    		Integer exportId,
    		Date startTime,
    		Date endTime) throws OrderException{
        if (batchId == null){
            return  ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_ID_NULL));
        }
        if (StringUtils.isBlank(sn)) {
			return  ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
		}
        if (StringUtils.isBlank(deposit)) {
        	return  ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_DEPOSIT_NOT_NULL));
		}
        if (exportId == null) {
        	return  ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_EXPORTID_NOT_NUL));
		}
        
        boolean b = orderService.hasBizOrderBybatchId(batchId);
        if (b){
            //支付成功之后，不能再支付
        	logger.info("已有支付成功的订单，设备已托管，不能再次托管");
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_EXIST));
        }
        Batch batch = batchService.selectBatchBybatchId(batchId);
        if (batch == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_NULL));
        }
        //生成订单
        BizOrder bizOrder = new BizOrder();
        bizOrder.setPlantOne(batch.getPlantOne());
        bizOrder.setPlantThree(batch.getPlantThree());
        bizOrder.setPlantTwo(batch.getPlantTwo());
        bizOrder.setBatchId(batchId);
        bizOrder.setDeposit(deposit);
        bizOrder.setExpertId(exportId);
        bizOrder.setOrderBody(getOrderBody());
        String orderNumber = getOutTradeOrder();
        bizOrder.setOrderNumber(orderNumber);
        bizOrder.setOrderPrice(getTotalFee(deposit, startTime, endTime));
        bizOrder.setOrderStart(new Date());
        bizOrder.setOrderState(new Byte("0"));
        bizOrder.setSn(sn);
        Integer saveBizOrder = orderService.saveBizOrder(bizOrder);
        //更改批次的订单状态标识
        Batch batch1 = new Batch();
        batch1.setStatus("1");
        batch1.setBatchId(batchId);
        int i = batchService.updateBatch(batch1);
        if (i == 0){
            //更改批次数据库中订单状态出错
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
        }
        if (saveBizOrder == 0){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_ERROR));
        }
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
        String userName = user.getRealname();
        if ( userName!= null && "".equals(userName)){
            bizOrderVO.setExpertName(userName);
        }else {
            String name = user.getUserName();
            bizOrderVO.setExpertName(name);
        }
        return ResponseEntity.ok(ResultModel.ok(bizOrderVO));
    }


    @GetMapping(value = "list/{userId}/{page}/{pageSize}")
    @ApiOperation(value = "根据用户id获取订单列表（普通用户和管理员用统一接口）@20171029")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "userId",value = "用户ID",required = true),
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> listOrderByUserId(@PathVariable Integer userId,
                                                          @PathVariable Integer page,
                                                          @PathVariable Integer pageSize){
        if (userId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        //根据用户id获取用户权限，如果权限为管理员，则查询出所有的订单
        Role role = roleService.selectRoleByUserId(userId);
        if (role.getRoleName()!= null && "ROLE_ADMIN".equals(role.getRoleName())){
            PageInfo<BizOrder> bizOrderPageInfo = orderService.listAllOrder(page, pageSize);
            return ResponseEntity.ok(ResultModel.ok(bizOrderPageInfo));
        }
        PageInfo<BizOrder> bizOrderPageInfo = orderService.listOrderByUserId(userId, page, pageSize);
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
}
