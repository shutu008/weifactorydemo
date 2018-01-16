package com.vastsum.controller;

import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.Experiment;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.service.ExperimentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/experiment")
@Api(value = "description", tags = {"实验管理"})
@ApiIgnore
public class ExperimentController extends BaseController {
    @Autowired
    private ExperimentService experimentService;

    @RequestMapping(value = "/getExperiment/{deviceId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据设备id获取试验数据")
    @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id",required = true)
    public ResponseEntity<ResultModel> getExperimentData(
            @PathVariable Integer deviceId
    ){
        if(deviceId == null || "".equals(deviceId)){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        List<Experiment> experiment = experimentService.findByDeviceId(deviceId);
        return ResponseEntity.ok(ResultModel.ok(experiment));
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value = "添加实验")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "deviceId",value = "设备id",required = true),
            @ApiImplicitParam(paramType = "query",name = "cropName1",value = "设备上层作物名称"),
            @ApiImplicitParam(paramType = "query",name = "plantTime1",value = "设备上层作物定植日期" ),
            @ApiImplicitParam(paramType = "query",name = "harvestTime1",value = "设备上层作物预计采收时间"),
            @ApiImplicitParam(paramType = "query",name = "plantNumber1",value = "设备上层作物植株棵树"),
            @ApiImplicitParam(paramType = "query",name = "leaveNumber1",value = "设备上层定植是叶片数"),
            @ApiImplicitParam(paramType = "query",name = "controlModel1",value = "设备上层控制模式(下拉框目前只有两个：1代表自定义运行状态，2代表托管状态)"),
            @ApiImplicitParam(paramType = "query",name = "cropName2",value = "设备中层作物名称"),
            @ApiImplicitParam(paramType = "query",name = "plantTime2",value = "设备中层作物定植日期"),
            @ApiImplicitParam(paramType = "query",name = "harvestTime2",value = "设备中层作物预计采收时间"),
            @ApiImplicitParam(paramType = "query",name = "plantNumber2",value = "设备中层作物植株棵树"),
            @ApiImplicitParam(paramType = "query",name = "leaveNumber2",value = "设备中层定植是叶片数"),
            @ApiImplicitParam(paramType = "query",name = "controlModel2",value = "设备中层控制模式(下拉框目前只有两个：1代表自定义运行状态，2代表托管状态)"),
            @ApiImplicitParam(paramType = "query",name = "cropName3",value = "设备下层作物名称"),
            @ApiImplicitParam(paramType = "query",name = "plantTime3",value = "设备下层作物定植日期"),
            @ApiImplicitParam(paramType = "query",name = "harvestTime3",value = "设备下层作物预计采收时间"),
            @ApiImplicitParam(paramType = "query",name = "plantNumber3",value = "设备下层作物植株棵树"),
            @ApiImplicitParam(paramType = "query",name = "leaveNumber3",value = "设备下层定植是叶片数"),
            @ApiImplicitParam(paramType = "query",name = "controlModel3",value = "设备下层控制模式(下拉框目前只有两个：1代表自定义运行状态，2代表托管状态)"),
            @ApiImplicitParam(paramType = "query",name = "seedingName",value = "育苗室作物名称")
    })
    public ResponseEntity<ResultModel> addExperiment(@ModelAttribute Experiment experiment){
        if (experiment == null || "".equals(experiment)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_NULL));
        }
        if (experiment.getDeviceId() == null ||"".equals(experiment.getDeviceId())) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.DEVICE_ID_NULL));
        }
        experiment.setGmtModified(new Date());
        experiment.setGmtCreate(new Date());
        int i = experimentService.add(experiment);
        if(i>0) {
            return ResponseEntity.ok(ResultModel.ok(ResultStatus.EXPERIMENT_ADD_SUCCESS));
        }
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_ADD_FAILED));
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改实验")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "experimentId",value = "实验id",required = true),
            @ApiImplicitParam(paramType = "query",name = "deviceId",value = "设备id"),
            @ApiImplicitParam(paramType = "query",name = "cropName1",value = "设备上层作物名称"),
            @ApiImplicitParam(paramType = "query",name = "plantTime1",value = "设备上层作物定植日期" ),
            @ApiImplicitParam(paramType = "query",name = "harvestTime1",value = "设备上层作物预计采收时间"),
            @ApiImplicitParam(paramType = "query",name = "plantNumber1",value = "设备上层作物植株棵树"),
            @ApiImplicitParam(paramType = "query",name = "leaveNumber1",value = "设备上层定植是叶片数"),
            @ApiImplicitParam(paramType = "query",name = "controlModel1",value = "设备上层控制模式(下拉框目前只有两个：1代表自定义运行状态，2代表托管状态)"),
            @ApiImplicitParam(paramType = "query",name = "cropName2",value = "设备中层作物名称"),
            @ApiImplicitParam(paramType = "query",name = "plantTime2",value = "设备中层作物定植日期"),
            @ApiImplicitParam(paramType = "query",name = "harvestTime2",value = "设备中层作物预计采收时间"),
            @ApiImplicitParam(paramType = "query",name = "plantNumber2",value = "设备中层作物植株棵树"),
            @ApiImplicitParam(paramType = "query",name = "leaveNumber2",value = "设备中层定植是叶片数"),
            @ApiImplicitParam(paramType = "query",name = "controlModel2",value = "设备中层控制模式(下拉框目前只有两个：1代表自定义运行状态，2代表托管状态)"),
            @ApiImplicitParam(paramType = "query",name = "cropName3",value = "设备下层作物名称"),
            @ApiImplicitParam(paramType = "query",name = "plantTime3",value = "设备下层作物定植日期"),
            @ApiImplicitParam(paramType = "query",name = "harvestTime3",value = "设备下层作物预计采收时间"),
            @ApiImplicitParam(paramType = "query",name = "plantNumber3",value = "设备下层作物植株棵树"),
            @ApiImplicitParam(paramType = "query",name = "leaveNumber3",value = "设备下层定植是叶片数"),
            @ApiImplicitParam(paramType = "query",name = "controlModel3",value = "设备下层控制模式(下拉框目前只有两个：1代表自定义运行状态，2代表托管状态)"),
            @ApiImplicitParam(paramType = "query",name = "seedingName",value = "育苗室作物名称")
    })
    public ResponseEntity<ResultModel> updateExperiment(@ModelAttribute Experiment experiment){
        if (experiment == null || "".equals(experiment)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_NULL));
        }
        if (experiment.getExperimentId() == null ||"".equals(experiment.getExperimentId())) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_ID_NULL));
        }
        experiment.setGmtModified(new Date());
        int i = experimentService.update(experiment);
        if(i>0) {
            return ResponseEntity.ok(ResultModel.ok(ResultStatus.EXPERIMENT_CHANGE_SUCCESS));
        }
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_CHANGE_FAILED));
    }


    @RequestMapping(value = "/delete/{experimentId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据实验id删除实验")
    @ApiImplicitParam(paramType = "path",name = "experimentId",value ="实验id",required = true)
    public ResponseEntity<ResultModel> delete(@PathVariable Integer experimentId){
        if (experimentId == null || "".equals(experimentId)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_ID_NULL));
        }
        int i = experimentService.deleteExperimentByexperId(experimentId);
        return i>0?
                ResponseEntity.ok(ResultModel.ok(ResultStatus.EXPERIMENT_DELETE_SUCCESS)):
                ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_DELETE_FAILED));
    }


    @RequestMapping(value = "/detail/{experimentId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据实验id查询实验详情")
    @ApiImplicitParam(paramType = "path",name = "experimentId",value ="实验id",required = true)
    public ResponseEntity<ResultModel> detail(@PathVariable Integer experimentId){
        if (experimentId == null || "".equals(experimentId)) {
            return ResponseEntity.ok(ResultModel.error(ResultStatus.EXPERIMENT_ID_NULL));
        }
        Experiment experiment = experimentService.findExperimentByexperId(experimentId);
        return ResponseEntity.ok(ResultModel.ok(experiment));

    }
}