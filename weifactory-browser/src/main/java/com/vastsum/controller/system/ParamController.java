package com.vastsum.controller.system;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.vastsum.core.service.HandRemoteService;
import com.vastsum.entity.SysParam;
import com.vastsum.enums.ResultStatus;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.SysParamService;
import com.vastsum.utils.ParamHelper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/param")
@Api(tags="参数管理")
public class ParamController extends BaseController {
	@Autowired
	private SysParamService sysParamService;
	@Autowired
	private HandRemoteService handRemoteService;

	//列出所有可用的参数列表
	@GetMapping("/listAll")
	@ApiOperation(value = "获取所有参数的列表@20171223")
	public  ResponseEntity<ResultModel> listParam(){
		SysParam sysParam = new SysParam();
		sysParam.setStatus("1");
		List<SysParam> list = sysParamService.list(sysParam);
		return ResponseEntity.ok(ResultModel.ok(list));
	}
	
	//根据条件获取参数列表
	@PostMapping(value = "/list")
    @ApiOperation(value = "根据条件获取参数列表@20180409")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "paramName",value = "参数名称",required = false),
            @ApiImplicitParam(paramType = "query",name = "paramCode",value = "参数code",required = false),
            @ApiImplicitParam(paramType = "query",name = "paramValue",value = "参数值",required = false),
            @ApiImplicitParam(paramType = "query",name = "status",value = "参数状态",required = false),
            @ApiImplicitParam(paramType = "query",name = "page",value = "页码",required = true),
            @ApiImplicitParam(paramType = "query",name = "pageSize",value = "行数",required = true)
    })
    public ResponseEntity<ResultModel> list(@ModelAttribute SysParam sysParam, Integer page, Integer pageSize){
        
       PageInfo<SysParam> pageInfo = sysParamService.listByPage(sysParam, page, pageSize);
       return V.ok(pageInfo);
        
    }
	
	@PostMapping(value="saveOrUpdate")
	@ApiOperation(value="保存或修改参数列表@20171223")
	@ApiImplicitParams({
		   @ApiImplicitParam(paramType = "query",name = "paramId",value = "参数id",required = false),
           @ApiImplicitParam(paramType = "query",name = "paramName",value = "参数名称",required = true),
           @ApiImplicitParam(paramType = "query",name = "paramCode",value = "参数code值",required = true),
           @ApiImplicitParam(paramType = "query",name = "paramValue",value = "参数值",required = true),
           @ApiImplicitParam(paramType = "query",name = "status",value = "状态",required = true),
           @ApiImplicitParam(paramType = "query",name = "sort",value = "排序",required = false)
	})
	public ResponseEntity<ResultModel> saveOrUpdate(@ModelAttribute SysParam sysParam){
		if (sysParam == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.PARAM_NOT_NULL));
		}
		if (StringUtils.isBlank(sysParam.getParamName())) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.PARAM_NAME_NOT_NULL));
		}
		if (StringUtils.isBlank(sysParam.getParamValue())) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.PARAM_VALUE_NOT_NULL));
		}
		if (StringUtils.isBlank(sysParam.getParamCode())) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.PARAM_CODE_NOT_NULL));
		}
		if (StringUtils.isBlank(sysParam.getStatus())) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.PARAM_STATUS_NOT_NULL));
		}
		if (sysParam.getParamId() != null) {
			sysParamService.update(sysParam);
		}else {
			sysParamService.save(sysParam);
		}
		
		//更新缓存
		ParamHelper.loadCache();
		//更新远程系统的缓存
		handRemoteService.updateParamHelper();
		return	ResponseEntity.ok(ResultModel.ok());
		
	}
	
	@GetMapping("/{paramId}")
	@ApiOperation(value="查看参数详情@20171223")
	@ApiImplicitParam(paramType = "path" ,name = "paramId",value = "参数id",required = false)
	public ResponseEntity<ResultModel> getById(@PathVariable Long paramId) throws Exception{
		if (paramId == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.PARAM_ID_NOT_NULL));
		}
		SysParam sysParam = sysParamService.getByParamId(paramId);
		return ResponseEntity.ok(ResultModel.ok(sysParam));
	}
	

}
