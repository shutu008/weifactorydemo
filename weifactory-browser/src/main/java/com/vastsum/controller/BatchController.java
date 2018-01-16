package com.vastsum.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.Batch;
import com.vastsum.entity.Image;
import com.vastsum.entity.vo.BatchInfo;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.properties.WeifactoryProperties;
import com.vastsum.service.BatchService;
import com.vastsum.service.ControlService;
import com.vastsum.service.DeviceService;
import com.vastsum.service.ImageServer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author ssj
 * @create 2017-09-09 22:13
 */
@RestController
@RequestMapping(value = "/batch")
@Api(value = "/batch",tags={"批次管理"})
public class BatchController {

    @Autowired
    private BatchService batchService;
    @Autowired
    private ImageServer imageServer;
    @Autowired
    private DeviceService deviceService;
    @Autowired(required = false)
    private ControlService controlService;
    @Autowired
    private WeifactoryProperties weifactoryProperties;

    
	
    @RequestMapping(value = "/{deviceId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据设备id获取最新的批次信息，也就是主界面控制的批次-用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id",required = true)
    })
    public ResponseEntity<ResultModel> lastBatch(@PathVariable Integer deviceId) {
    	//默认图片
    	String defaultFileName = weifactoryProperties.getImage().getDefaultImage();
    	 //默认图片服务器
    	String hostDir = weifactoryProperties.getImage().getDefaultImage();
        if (deviceId == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        Batch batch = batchService.selectLastBatchByDeviceId(deviceId);
        if (batch == null){
            return ResponseEntity.ok(ResultModel.ok(batch));
        }
        //先更新一下批次里面的图片，然后再显示给客户端
        String sn = deviceService.getSnByDeviceId(deviceId);
        Image m001 = imageServer.getLastBySnAndSensorType(sn, "M001");
        Image m002 = imageServer.getLastBySnAndSensorType(sn, "M002");
        Image m003 = imageServer.getLastBySnAndSensorType(sn, "M003");
        if (m001 == null){
           batch.setVideoOne(defaultFileName);
        }else {
            batch.setVideoOne(m001.getPath());
        }
        if (m002 == null){
            batch.setVideoTwo(defaultFileName);
        }else {
            batch.setVideoTwo(m002.getPath());
        }
        if (m003 == null){
            batch.setVideoThree(defaultFileName);
        }else {
            batch.setVideoThree(m003.getPath());
        }
        //将图片更新到数据库
        batchService.updateBatch(batch);
        //重新读取最新数据
        Batch batch1 = batchService.selectBatchBybatchId(batch.getBatchId());
        if (m001 == null){
            batch1.setVideoOne(hostDir+batch1.getVideoOne());
        }else {
            batch1.setVideoOne(batch1.getVideoOne());
        }
        if (m002 == null){
            batch1.setVideoTwo(hostDir+batch1.getVideoTwo());
        }else {
            batch1.setVideoTwo(batch1.getVideoTwo());
        }
        if (m003 == null){
            batch1.setVideoThree(hostDir+batch1.getVideoThree());
        }else {
            batch1.setVideoThree(batch1.getVideoThree());
        }

        return ResponseEntity.ok(ResultModel.ok(batch1,ResultStatus.BATCH_SELECT_SUCCESS));
    }


    @RequestMapping(value = "/history/{deviceId}/{page}/{pageSize}",method = RequestMethod.GET)
    @ApiOperation(value = "根据设备id获取历史上所有的批次信息-管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id",required = true),
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数",required = true)
    })
    @ApiIgnore
    public ResponseEntity<ResultModel> batchList(@PathVariable Integer deviceId,
                                                 @PathVariable Integer page,
                                                 @PathVariable Integer pageSize){
        if (deviceId == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        PageInfo<Batch> batchPageInfo = batchService.selectBatchsByDeviceId(deviceId, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(batchPageInfo,ResultStatus.BATCH_SELECT_SUCCESS));
    }


    @RequestMapping(value = "/history/{page}/{pageSize}",method = RequestMethod.GET)
    @ApiOperation(value = "根据获取历史上所有的批次信息(批次管理列表)-管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "页数",required = true)
    })
    public ResponseEntity<ResultModel> adminBatchList(@PathVariable Integer page, @PathVariable Integer pageSize){
        PageInfo<Batch> batchPageInfo = batchService.selectAllBatch(page,pageSize);
        return ResponseEntity.ok(ResultModel.ok(batchPageInfo,ResultStatus.BATCH_SELECT_SUCCESS));
    }

    @RequestMapping(value = "/delete/{batchId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据批次id删除批次信息-管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id",required = true)
    })
    public ResponseEntity<ResultModel> delete(@PathVariable Integer batchId){
        if (batchId == null) {
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.BATCH_ID_NULL), HttpStatus.BAD_REQUEST);
        }
        int i = batchService.deleteBatch(batchId);
        return  i>0? ResponseEntity.ok(ResultModel.ok(ResultStatus.BATCH_DELETE_SUCCESS)):
                    ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_DELETE_FAILED));
    }

    @RequestMapping(value ="detail/{batchId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据批次id获取批次详细信息-管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id",required = true)
    })
    public ResponseEntity<ResultModel> detail(@PathVariable Integer batchId){
        if (batchId == null) {
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.BATCH_ID_NULL), HttpStatus.BAD_REQUEST);
        }
        Batch batch = batchService.selectBatchBybatchId(batchId);
        return ResponseEntity.ok(ResultModel.ok(batch));
    }

    @RequestMapping(value ="/saveOrUpdate",method = RequestMethod.POST)
    @ApiOperation(value = "添加或更新批次信息-用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "batchId",value = "批次id"),
            @ApiImplicitParam(paramType = "query",name = "deviceId",value = "设备id",required = true),
            @ApiImplicitParam(paramType = "query",name = "plantOne",value = "第一层蔬菜名称",required = true),
            @ApiImplicitParam(paramType = "query",name = "cultModelOne",value = "第一层栽培模式",required = true),
            @ApiImplicitParam(paramType = "query",name = "temperatureOne",value = "第一层的温度管理",required = true),
            @ApiImplicitParam(paramType = "query",name = "humidityOne",value = "第一层的湿度管理",required = true),
            @ApiImplicitParam(paramType = "query",name = "ecOne",value = "第一层的ec值",required = true),
            @ApiImplicitParam(paramType = "query",name = "phOne",value = "第一层的ph值",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledOneLeft",value = "第一层左边led灯,0:关闭，1:打开",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledOneMiddle",value = "第一层中间led灯,0:关闭，1:打开",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledOneRight",value = "第一层右边led灯,0:关闭，1:打开",required = true),

            @ApiImplicitParam(paramType = "query",name = "plantTwo",value = "第二层蔬菜名称",required = true),
            @ApiImplicitParam(paramType = "query",name = "cultModelTwo",value = "第二层栽培模式",required = true),
            @ApiImplicitParam(paramType = "query",name = "temperatureTwo",value = "第二层的温度管理",required = true),
            @ApiImplicitParam(paramType = "query",name = "humidityTwo",value = "第二层的湿度管理",required = true),
            @ApiImplicitParam(paramType = "query",name = "ecTwo",value = "第二层的ec值",required = true),
            @ApiImplicitParam(paramType = "query",name = "phTwo",value = "第二层的ph值",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledTwoLeft",value = "第二层左边led灯,0:关闭，1:打开",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledTwoMiddle",value = "第二层中间led灯,0:关闭，1:打开",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledTwoRight",value = "第二层右边led灯,0:关闭，1:打开",required = true),

            @ApiImplicitParam(paramType = "query",name = "plantThree",value = "第三层蔬菜名称",required = true),
            @ApiImplicitParam(paramType = "query",name = "cultModelThree",value = "第三层栽培模式",required = true),
            @ApiImplicitParam(paramType = "query",name = "temperatureThree",value = "第三层的温度管理",required = true),
            @ApiImplicitParam(paramType = "query",name = "humidityThree",value = "第三层的湿度管理",required = true),
            @ApiImplicitParam(paramType = "query",name = "ecThree",value = "第三层的ec值",required = true),
            @ApiImplicitParam(paramType = "query",name = "phThree",value = "第三层的ph值",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledThreeLeft",value = "第三层左边led灯,0:关闭，1:打开",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledThreeMiddle",value = "第三层中间led灯,0:关闭，1:打开",required = true),
            @ApiImplicitParam(paramType = "query",name = "ledThreeRight",value = "第三层右边led灯,0:关闭，1:打开",required = true)

    })
    public  ResponseEntity<ResultModel> saveOrUpdate(@ModelAttribute Batch batch){
    	//默认图片
    	String defaultFileName = weifactoryProperties.getImage().getDefaultImage();
        if (batch == null) {
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.BATCH_NULL), HttpStatus.BAD_REQUEST);
        }
        if (batch.getPlantOne() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_PLANT_ONE_NAME_NULL));
        }
        if (batch.getCultModelOne() == null ) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_CULT_MODEL_ONE_NULL));
        }
        if (batch.getTemperatureOne() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_TEMPERATURE_ONE_NULL));
        }
        if (batch.getHumidityOne() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_HUMIDITY_ONE_NULL));
        }
        if (batch.getEcOne() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_EC_ONE_NULL));
        }
        if (batch.getPhOne() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_PH_ONE_NULL));
        }
        if (batch.getLedOneLeft() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_ONE_LEFT_NULL));
        }
        if (batch.getLedOneMiddle() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_ONE_MIDDLE_NULL));
        }
        if (batch.getLedOneRight() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_ONE_RIGHT_NULL));
        }

        if (batch.getPlantTwo() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_PLANT_TWO_NAME_NULL));
        }
        if (batch.getCultModelTwo() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_CULT_MODEL_TWO_NULL));
        }
        if (batch.getTemperatureTwo() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_TEMPERATURE_TWO_NULL));
        }
        if (batch.getHumidityTwo() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_HUMIDITY_TWO_NULL));
        }
        if (batch.getEcTwo() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_EC_TWO_NULL));
        }
        if (batch.getPhTwo() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_PH_TWO_NULL));
        }
        if (batch.getLedTwoLeft() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_TWO_LEFT_NULL));
        }
        if (batch.getLedTwoMiddle() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_TWO_MIDDLE_NULL));
        }
        if (batch.getLedTwoRight() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_TWO_RIGHT_NULL));
        }

        if (batch.getPlantThree() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_PLANT_THREE_NAME_NULL));
        }
        if (batch.getCultModelThree() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_CULT_MODEL_THREE_NULL));
        }
        if (batch.getTemperatureThree() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_TEMPERATURE_THREE_NULL));
        }
        if (batch.getHumidityThree() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_HUMIDITY_THREE_NULL));
        }
        if (batch.getEcThree() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_EC_THREE_NULL));
        }
        if (batch.getPhThree() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_PH_THREE_NULL));
        }
        if (batch.getLedThreeLeft() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_THREE_LEFT_NULL));
        }
        if (batch.getLedThreeMiddle() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_THREE_MIDDLE_NULL));
        }
        if (batch.getLedThreeRight() == null) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_LED_THREE_RIGHT_NULL));
        }

        //将指令发送给设备
        //根据设备id获取设备序列号
        String sn = deviceService.getSnByDeviceId(batch.getDeviceId());
        if (sn  == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
        }
        //栽培模式
        controlService.controlData(sn,"C001","0000","1", batch.getCultModelOne(),"0");
        controlService.controlData(sn,"C001","0000", "2",batch.getCultModelTwo(),"0");
        controlService.controlData(sn,"C001","0000", "3",batch.getCultModelThree(),"0");

        //温度
        controlService.controlData(sn, "V001","0000", "1","T",batch.getTemperatureOne().toString());
        controlService.controlData(sn, "V001","0000", "2","T",batch.getTemperatureTwo().toString());
        controlService.controlData(sn, "V001","0000", "3","T",batch.getTemperatureThree().toString());

        //湿度
        controlService.controlData(sn, "V001","0000", "1","H",batch.getHumidityOne().toString());
        controlService.controlData(sn, "V001","0000", "2","H",batch.getHumidityTwo().toString());
        controlService.controlData(sn, "V001","0000", "3","H",batch.getHumidityThree().toString());

        //EC
        controlService.controlData(sn, "V001","0000", "1","E",batch.getEcOne().toString());
        controlService.controlData(sn, "V001","0000", "2","E",batch.getEcTwo().toString());
        controlService.controlData(sn, "V001","0000", "3","E",batch.getEcThree().toString());

        //PH
        controlService.controlData(sn, "V001","0000", "1","P",batch.getPhOne().toString());
        controlService.controlData(sn, "V001","0000", "2","P",batch.getPhTwo().toString());
        controlService.controlData(sn, "V001","0000", "3","P",batch.getPhThree().toString());

        //灯
        controlService.controlData(sn, "V001","0000", "1","L",batch.getLedOneLeft().toString());
        controlService.controlData(sn, "V001","0000", "2","L",batch.getLedTwoLeft().toString());
        controlService.controlData(sn, "V001","0000", "3","L",batch.getLedThreeLeft().toString());

        controlService.controlData(sn, "V001","0000", "1","C",batch.getLedOneMiddle().toString());
        controlService.controlData(sn, "V001","0000", "2","C",batch.getLedTwoMiddle().toString());
        controlService.controlData(sn, "V001","0000", "3","C",batch.getLedThreeMiddle().toString());

        controlService.controlData(sn, "V001","0000", "1","Y",batch.getLedOneRight().toString());
        controlService.controlData(sn, "V001","0000", "2","Y",batch.getLedTwoRight().toString());
        controlService.controlData(sn, "V001","0000", "3","Y",batch.getLedThreeRight().toString());


        if (batch.getBatchId() != null){
            batch.setGmtModified(new Date());
            int i = batchService.updateBatch(batch);
            return i>0?ResponseEntity.ok(ResultModel.ok(ResultStatus.BATCH_UPDATE_SUCCESS)):
                    ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_UPDATE_FAILED));
        }else {
            batch.setGmtModified(new Date());
            batch.setGmtCreate(new Date());
            //如果是添加 ，则没有图片信息，直接添加默认图片
           batch.setVideoOne(defaultFileName);
           batch.setVideoTwo(defaultFileName);
           batch.setVideoThree(defaultFileName);

            int i = batchService.addBatch(batch);
            return i>0?ResponseEntity.ok(ResultModel.ok(ResultStatus.BATCH_ADD_SUCCESS)):
                    ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_ADD_FAILEED));
        }
    }

    @GetMapping(value = "/{userId}/{page}/{pageSize}")
    @ApiOperation(value = "根据用户id获取用户的批次信息@20171022")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "userId", value = "用户ID", required = true),
            @ApiImplicitParam(paramType = "path", name = "page", value = "页码", required = true),
            @ApiImplicitParam(paramType = "path", name = "pageSize", value = "行数", required = true)
    })
    public ResponseEntity<ResultModel> listBatchsByUserId(@PathVariable Integer userId,
                                                          @PathVariable Integer page,
                                                          @PathVariable Integer pageSize){
        if (userId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        PageInfo<BatchInfo> batchInfos = batchService.listBatchsByUserId(userId, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(batchInfos));
    }

    @GetMapping(value = "/association/{batchId}/{modelId}")
    @ApiOperation(value = "批次与模型关联@20171118")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "batchId", value = "批次ID", required = true),
            @ApiImplicitParam(paramType = "path", name = "modelId", value = "模型ID", required = true)
    })
    public ResponseEntity<ResultModel> assoc(@PathVariable Integer batchId,
                                             @PathVariable Integer modelId){
        if (batchId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_ID_NULL));
        }
        if (modelId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_ID_NOT_NULL));
        }
        int i = batchService.updateBatchModel(batchId, modelId);
        if (i > 0){
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
    }


    @GetMapping(value = "/remove/{batchId}")
    @ApiOperation(value = "废弃批次信息@20171022")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "batchId", value = "批次ID", required = true)
    })
    public ResponseEntity<ResultModel> updateStatus(@PathVariable Integer batchId){
        if (batchId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_ID_NULL));
        }
        Batch batch = new Batch();
        batch.setBatchId(batchId);
        batch.setStatus("0");
        int i = batchService.updateBatch(batch);
        if (i > 0){
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
    }


    @PostMapping(value = "/updateOrderStatus")
    @ApiOperation(value = "更新批次中的订单状态@20171203")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "orderNumber", value = "订单号", required = true),
            @ApiImplicitParam(paramType = "query", name = "orderStatus", value = "订单状态", required = true)
    })
    public ResponseEntity<ResultModel> updateOrderStatus(String orderNumber, String orderStatus){
       if (orderNumber == null){
           return ResponseEntity.ok(ResultModel.error(ResultStatus.ORDER_NUMBER_NULL));
       }
       if (orderStatus == null){
           return  ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
       }
       //根据订单号查询出批次信息
        Batch batch1 = batchService.getBatchByOrderNumber(orderNumber);
        if (batch1 == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
        }
        batch1.setOrderStatus(orderStatus);
        int i = batchService.updateBatch(batch1);
        if (i > 0){
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
    }


}
