package com.vastsum.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.BizControl;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.pojo.AskBody;
import com.vastsum.service.BatchService;
import com.vastsum.service.BizControlService;
import com.vastsum.service.ControlService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author ssj
 * @create 2017-11-18 11:13
 */
@RestController
@RequestMapping("/control")
@Api(value="/control",tags = {"远程控制管理"})
public class ControlController extends BaseController {
    @Autowired
    private ControlService controlService;  //rpc
    @Autowired
    private BizControlService bizControlService; //控制管理

    @Autowired
    private BatchService batchService;
    
    @PostMapping(value = "/sensor")
    @ApiOperation(value = "设备执行机构控制@20171118")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "sn", value = "设备序列号",required = true),
            @ApiImplicitParam(paramType = "query", name = "sensorId", value = "传感器Id", required = true),
            @ApiImplicitParam(paramType = "query", name = "status", value = "开关状态1，0", required = true),
            @ApiImplicitParam(paramType = "query", name = "timeVal", value = "是否永久执行标识"),
            @ApiImplicitParam(paramType = "query", name = "startTime", value = "执行开始时间"),
            @ApiImplicitParam(paramType = "query", name = "endTime", value = "执行结束时间")
    })
    public ResponseEntity<ResultModel> control(String sn, String sensorId, String status, String timeVal, Date startTime, Date endTime){
        if (sn == null || "".equals(sn)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_SN_NULL));
        }
        if (sensorId == null || "".equals(sensorId)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.SENSOR_ID_NOT_NULL));
        }
        if (status == null || "".equals(status)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.STATUS_NOT_NULL));
        }
        boolean timeEx = (startTime != null && endTime != null);
        if ( timeVal == null && !timeEx){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.SENSOR_TIME));
        }
        long time = 0L;
        if (timeVal != null){
            if (Integer.parseInt(timeVal) == 1){
                time = Long.MAX_VALUE;
                //如果永久执行，则将开始执行时间和关闭执行时间空
                startTime = null;
                endTime = null;
            }else {
                return ResponseEntity.ok(ResultModel.error(ResultStatus.ENABLED_NUMBER));
            }
        }else if (timeEx){
            //获取执行时长,时长单位为秒
            time = (endTime.getTime()-startTime.getTime())/1000;
            //将永久执行状态设置为空
            timeVal = null;
        }
        //更新数据库中的状态
        BizControl bizControl = new BizControl();
        bizControl.setSn(sn);
        int actuatorId = Integer.parseInt(sensorId);
        bizControl.setActuatorId(actuatorId);
        //从数据库中查询这条控制的数据
        BizControl control = bizControlService.getByBizControlExample(bizControl);
        bizControl.setControlId(control.getControlId());
        bizControl.setActuatorName(control.getActuatorName());
        bizControl.setPosition(control.getPosition());
        bizControl.setEnabled(control.getEnabled());
        bizControl.setGmtCreate(control.getGmtCreate());
        bizControl.setStatus(status);
        bizControl.setTimeval(timeVal);
        bizControl.setStartTime(startTime);
        bizControl.setEndTime(endTime);
        bizControl.setGmtModified(new Date());
        //执行更新
        bizControlService.update(bizControl);
        AskBody askBody = controlService.controlMsg(sn, sensorId, status, time);
        if (askBody !=null){
            if (askBody.getSuccess()){
                return ResponseEntity.ok(ResultModel.ok());
            }
        }
        return ResponseEntity.ok(new ResultModel(askBody.getCode(),askBody.getMessage(), askBody.getData(),askBody.getSuccess()));

    }


    @RequestMapping(value = "/list/{sn}",method = RequestMethod.GET)
    @ApiOperation(value = "根据设备序列号，获取对应所有的开关@20171118")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "sn",value = "设备序列号",required = true)
    })
    public ResponseEntity<ResultModel> list(@PathVariable String sn){
        List<BizControl> bizControls = bizControlService.listBySn(sn);
        return ResponseEntity.ok(ResultModel.ok(bizControls));
    }
    
    //设备托管给服务器
    @GetMapping(value = "/trust/{batchId}")
    @ApiOperation(value = "设备托管给服务器@20180330")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id",required = true)
    })
    public ResponseEntity<ResultModel> trustStatus(@PathVariable Long batchId){

    	int i = batchService.updateTrustStatusByDeviceId(batchId);
    	
    	return V.ok(i);
    }
    
    
    
}
