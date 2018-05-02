package com.vastsum.controller;

import com.github.pagehelper.PageInfo;
import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.Model;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.ModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author ssj
 * @create 2017-10-22 10:39
 */
@RestController
@RequestMapping(value = "/model")
@Api(value = "/model",tags = {"参数阈值库"})
public class ModelController extends BaseController {

    @Autowired
    private ModelService modelService;

    @PostMapping(value = "/list")
    @ApiOperation(value = "当前用户根据参数阈值名获取列表@20171104")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "userId",value = "用户ID",required = true),
            @ApiImplicitParam(paramType = "query",name = "modelName",value = "参数阈值库名称",required = false),
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "行数",required = true)
    })
    public ResponseEntity<ResultModel> list(Integer userId,
                                            String modelName,
                                            Integer page,
                                            Integer pageSize){
        if (userId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
       if (modelName == null || "".equals(modelName)){
           modelName = "";
       }
        Model model = new Model();
        model.setModelName(modelName);
        model.setUserId(userId);
        PageInfo<Model> listModels = modelService.listModels(model, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(listModels));
    }

    @ApiIgnore
    @GetMapping(value = "/list/{userId}/{page}/{pageSize}")
    @ApiOperation(value = "根据用户id查询参数阈值库列表@20171022")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "userId",value = "用户id",required = true),
            @ApiImplicitParam(paramType = "path",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "path",name = "pageSize",value = "行数",required = true)
    })
    public ResponseEntity<ResultModel> listByUserId(@PathVariable Integer userId,
                                                    @PathVariable Integer page,
                                                    @PathVariable Integer pageSize){
        if (userId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.USER_ID_NULL));
        }
        Model model = new Model();
        model.setUserId(userId);
        PageInfo<Model> listModels = modelService.listModelsByUserId(userId, page, pageSize);
        return ResponseEntity.ok(ResultModel.ok(listModels));
    }

    @GetMapping(value = "/delete/{modelId}")
    @ApiOperation(value = "根据模型库id，删除参数阈值库@20171022")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "modelId",value = "模型库Id",required = true)
    })
    public ResponseEntity<ResultModel> delete(@PathVariable Integer modelId){
        if (modelId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_ID_NOT_NULL));
        }
        Model model = new Model();
        model.setModelId(modelId);
        model.setStatus(false);
        Integer result = modelService.updateModel(model);//逻辑删除
        if (result >0){
            return ResponseEntity.ok(ResultModel.ok());
        }
        return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
    }

    @PostMapping(value = "/saveOrUpdate")
    @ApiOperation(value = "添加或修改参数阈值库@20171022")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", value = "用户id", required = true),
            @ApiImplicitParam(paramType = "query", name = "modelName", value = "参数阈值库名称", required = true),
            @ApiImplicitParam(paramType = "query", name = "temperatureUp", value = "温度上限",required = true),
            @ApiImplicitParam(paramType = "query", name = "temperatureDown", value = "温度下限", required = true),
            @ApiImplicitParam(paramType = "query", name = "humidityUp", value = "湿度上限", required = true),
            @ApiImplicitParam(paramType = "query", name = "humidityDown", value = "湿度下限",required = true),
            @ApiImplicitParam(paramType = "query", name = "illuminationUp", value = "光照强度上限", required = true),
            @ApiImplicitParam(paramType = "query", name = "illuminationDown", value = "光照强度下限", required = true),
            @ApiImplicitParam(paramType = "query", name = "co2Up", value = "二氧化碳浓度上限",required = true),
            @ApiImplicitParam(paramType = "query", name = "co2Down", value = "二氧化碳浓度下限", required = true),
            @ApiImplicitParam(paramType = "query", name = "ecUp", value = "EC值上限", required = true),
            @ApiImplicitParam(paramType = "query", name = "ecDown", value = "EC值下限",required = true),
            @ApiImplicitParam(paramType = "query", name = "phUp", value = "ph值上限", required = true),
            @ApiImplicitParam(paramType = "query", name = "phDown", value = "ph值下限", required = true),
            @ApiImplicitParam(paramType = "query", name = "modelId", value = "模型ID", required = false)
    })
    public ResponseEntity<ResultModel> addOrUpdate(@ModelAttribute Model model){
        if (model == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_NOT_NULL));
        }
        if (model.getModelName() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_MODELNAME_NOT_NULL));
        }
        if (model.getTemperatureUp() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_TEMPERATUREUP_NOT_NULL));
        }
        if (model.getTemperatureDown() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_TEMPERATUREDOWN_NOT_NULL));
        }
        if (model.getHumidityUp() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_HUMIDITYUP_NOT_NULL));
        }
        if (model.getHumidityDown() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_HUMIDITYDOWN_NOT_NULL));
        }
        if (model.getIlluminationUp() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_ILLUMINATIONUP_NOT_NULL));
        }
        if (model.getIlluminationDown() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_ILLUMINATIONDOWN_NOT_NULL));
        }
        if (model.getCo2Up() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_CO2UP_NOT_NULL));
        }
        if (model.getCo2Down() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_CO2DOWN_NOT_NULL));
        }
        if (model.getEcUp() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_ECUP_NOT_NULL));
        }
        if (model.getEcDown() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_ECDOWN_NOT_NULL));
        }
        if (model.getPhUp() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_PHUP_NOT_NULL));
        }
        if (model.getPhDown() == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_PHDOWN_NOT_NULL));
        }
        //更新
        if(model.getModelId() != null){
            Integer updateModel = modelService.updateModel(model);
            if (updateModel >0){
                return ResponseEntity.ok(ResultModel.ok());
            }
            return ResponseEntity.ok(ResultModel.error(ResultStatus.ERROR));
        }else {
        	modelService.saveModel(model);
        }
        
        return V.ok();
    }

    @GetMapping(value = "/detail/{modelId}")
    @ApiImplicitParam(paramType = "path", name = "modelId", value = "模型ID", required = true)
    @ApiOperation(value = "查看参数阈值库详情@20171022")
    public ResponseEntity<ResultModel> detail(@PathVariable Integer modelId){
        if (modelId == null){
            return ResponseEntity.ok(ResultModel.error(ResultStatus.MODEL_ID_NOT_NULL));
        }
        Model modelById = modelService.getModelById(modelId);
        return ResponseEntity.ok(ResultModel.ok(modelById));
    }

}
