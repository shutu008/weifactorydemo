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
import com.vastsum.model.V;
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

    
	//根据设备id获取最新的批次信息，设备管理显示界面20180311
    @GetMapping(value = "/{deviceId}")
    @ApiOperation(value = "根据设备id获取最新的批次信息，设备管理显示界面20180311")
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
        Image image = imageServer.getLastImageByDate(sn);
        if (image != null) {
        	//iamge != null 说明 第一场图片有图，将第一章图片拷贝到第二张和第三张中
			batch.setVideoOne(hostDir+image.getOnePicName());
			if (image.getTwoPicName() == null) {
				image.setTwoPicName(image.getOnePicName());
			}
			batch.setVideoTwo(hostDir+image.getTwoPicName());
			
			if (image.getThreePicName() == null) {
				image.setThreePicName(image.getOnePicName());
			}
			batch.setVideoThree(hostDir+image.getThreePicName());
		}else {
			batch.setVideoOne(defaultFileName);
			batch.setVideoTwo(defaultFileName);
			batch.setVideoThree(defaultFileName);
		}
        
        //将图片更新到数据库
        batchService.updateBatch(batch);
        //重新读取最新数据
        Batch batch1 = batchService.selectBatchBybatchId(batch.getBatchId());
        return V.ok(batch1);
    }


    //根据设备id获取历史上所有的批次信息-管理员
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


    //获取历史上所有的批次信息(批次管理列表)-管理员
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

    //根据批次id删除批次信息
    @RequestMapping(value = "/delete/{batchId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据批次id删除批次信息-管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id",required = true)
    })
    public ResponseEntity<ResultModel> delete(@PathVariable Long batchId){
        if (batchId == null) {
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.BATCH_ID_NULL), HttpStatus.BAD_REQUEST);
        }
        int i = batchService.deleteBatch(batchId);
        return  i>0? ResponseEntity.ok(ResultModel.ok(ResultStatus.BATCH_DELETE_SUCCESS)):
                    ResponseEntity.ok(ResultModel.error(ResultStatus.BATCH_DELETE_FAILED));
    }

    //根据批次id获取批次详细信息
    @RequestMapping(value ="detail/{batchId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据批次id获取批次详细信息-管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id",required = true)
    })
    public ResponseEntity<ResultModel> detail(@PathVariable Long batchId){
        if (batchId == null) {
            return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.BATCH_ID_NULL), HttpStatus.BAD_REQUEST);
        }
        Batch batch = batchService.selectBatchBybatchId(batchId);
        return ResponseEntity.ok(ResultModel.ok(batch));
    }

    
    //添加批次
    @PostMapping(value ="/save")
    @ApiOperation(value = "添加批次信息-用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "deviceId",value = "设备id",required = true),
            
            @ApiImplicitParam(paramType = "query",name = "plantOne",value = "第一层蔬菜名称",required = true),
            @ApiImplicitParam(paramType = "query",name = "cultModelOne",value = "第一层生长模式",required = true),
            @ApiImplicitParam(paramType = "query",name = "onePlantingTime",value = "第一层定植日期",required = true),
            @ApiImplicitParam(paramType = "query",name = "oneRecoveryTime",value = "第一层采收日期",required = true),

            @ApiImplicitParam(paramType = "query",name = "plantTwo",value = "第二层蔬菜名称",required = true),
            @ApiImplicitParam(paramType = "query",name = "cultModelTwo",value = "第二层栽培模式",required = true),
            @ApiImplicitParam(paramType = "query",name = "twoPlantingTime",value = "第二层定植日期",required = true),
            @ApiImplicitParam(paramType = "query",name = "twoRecoveryTime",value = "第二层采收日期",required = true),

            @ApiImplicitParam(paramType = "query",name = "plantThree",value = "第三层蔬菜名称",required = true),
            @ApiImplicitParam(paramType = "query",name = "cultModelThree",value = "第三层栽培模式",required = true),
            @ApiImplicitParam(paramType = "query",name = "threePlantingTime",value = "第一层定植日期",required = true),
            @ApiImplicitParam(paramType = "query",name = "threeRecoveryTime",value = "第一层采收日期",required = true)

    })
    public  ResponseEntity<ResultModel> saveOrUpdate(@ModelAttribute Batch batch){
    	//默认图片
    	String defaultFileName = weifactoryProperties.getImage().getDefaultImage();
        if (batch == null) {
            return V.error("数据不能为空");
        }
        if (batch.getPlantOne() == null) {
			return V.error("第一层植物名称不能为空");
		}
        if (batch.getCultModelOne() == null) {
			return V.error("第一层生长模式不能为空");
		}
        if (batch.getOnePlantingTime() == null) {
			return V.error("第一层定植如期不能为空");
		}
        if (batch.getOneRecoveryTime() == null) {
        	return V.error("第一层采收日期不能为空");
		}
        if (batch.getPlantTwo() == null) {
			return V.error("第二层植物名称不能为空");
		}
        if (batch.getCultModelTwo() == null) {
			return V.error("第二层生长模式不能为空");
		}
        if (batch.getTwoPlantingTime() == null) {
			return V.error("第二层定植如期不能为空");
		}
        if (batch.getTwoRecoveryTime() == null) {
        	return V.error("第二层采收日期不能为空");
		}
        if (batch.getPlantThree() == null) {
			return V.error("第三层植物名称不能为空");
		}
        if (batch.getCultModelThree() == null) {
			return V.error("第三层生长模式不能为空");
		}
        if (batch.getThreePlantingTime() == null) {
			return V.error("第三层定植如期不能为空");
		}
        if (batch.getThreeRecoveryTime() == null) {
        	return V.error("第三层采收日期不能为空");
		}

       
            batch.setGmtModified(new Date());
            batch.setGmtCreate(new Date());
           //首次添加默认图片信息，等待采集
           batch.setVideoOne(defaultFileName);
           batch.setVideoTwo(defaultFileName);
           batch.setVideoThree(defaultFileName);
           batchService.addBatch(batch);
           return V.ok(batch);
    }
    
    //根据用户id获取用户的批次信息@20171022
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

    //批次与模型关联@20171118
    @GetMapping(value = "/association/{batchId}/{modelId}")
    @ApiOperation(value = "批次与模型关联@20171118")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "batchId", value = "批次ID", required = true),
            @ApiImplicitParam(paramType = "path", name = "modelId", value = "模型ID", required = true)
    })
    public ResponseEntity<ResultModel> assoc(@PathVariable Long batchId,
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

    //废弃批次信息
    @GetMapping(value = "/remove/{batchId}")
    @ApiOperation(value = "废弃批次信息@20171022")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "batchId", value = "批次ID", required = true)
    })
    public ResponseEntity<ResultModel> updateStatus(@PathVariable Long batchId){
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


    //更新批次中的订单状态@20171203
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
