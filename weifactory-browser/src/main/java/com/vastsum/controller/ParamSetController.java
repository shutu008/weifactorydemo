package com.vastsum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.ParamSet;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.ParamSetService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/paramSet")
@Api(value = "/paramSet",tags={"参数设置"})
public class ParamSetController extends BaseController {
	
	@Autowired
	private ParamSetService paramSetService;

	//添加或更新参数设置信息
	@PostMapping("/saveOrUpdate")
	@ApiOperation(value = "添加或更新参数设置信息@2018-03-15")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "batchId",value = "批次id",required = true),
            @ApiImplicitParam(paramType = "query",name = "paramSetId",value = "参数设置id,修改时带上"),
            
            @ApiImplicitParam(paramType = "query",name = "daySet",value = "时间设置"),
            @ApiImplicitParam(paramType = "query",name = "dateLength",value = "日长"),
            @ApiImplicitParam(paramType = "query",name = "dateYi",value = "时移"),
            @ApiImplicitParam(paramType = "query",name = "dayTemperature",value = "白天温度"),
            @ApiImplicitParam(paramType = "query",name = "nightTemperature",value = "晚上温度"),
            @ApiImplicitParam(paramType = "query",name = "dayHumidity",value = "白天湿度"),
            @ApiImplicitParam(paramType = "query",name = "nightHumidity",value = "晚上湿度"),
            @ApiImplicitParam(paramType = "query",name = "dayStartTime",value = "白天开始时间"),
            @ApiImplicitParam(paramType = "query",name = "dayEndTime",value = "白天结束时间"),
            @ApiImplicitParam(paramType = "query",name = "nightStartTime",value = "晚上开始时间"),
            @ApiImplicitParam(paramType = "query",name = "nightEndTime",value = "晚上结束时间"),
            @ApiImplicitParam(paramType = "query",name = "dayNewWindLength",value = "白天换新风时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayNewWindTime",value = "白天换新风间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightNewWindLength",value = "晚上换新风时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightNewWindTime",value = "晚上换新风间隔/分钟"),
            
            //TODO 蔬菜名称和生长模式可以修改吗？蔬菜名称就不下发给机器了，汉字无法编码，因为有自定义的
            @ApiImplicitParam(paramType = "query",name = "dayBgLenght1",value = "第一层白天补光灯时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayBgCycle1",value = "第一层白天补光灯间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgLenght1",value = "第一层晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgCycle1",value = "第一层晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyLength1",value = "第一层白天营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyCycle1",value = "第一层白天营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyLength1",value = "第一层晚上营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyCycle1",value = "第一层晚上营养液循环间隔/分钟"),
            
            @ApiImplicitParam(paramType = "query",name = "dayBgLenght2",value = "第二层白天补光灯时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayBgCycle2",value = "第二层白天补光灯间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgLenght2",value = "第二层晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgCycle2",value = "第二层晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyLength2",value = "第二层白天营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyCycle2",value = "第二层白天营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyLength2",value = "第二层晚上营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyCycle2",value = "第二层晚上营养液循环间隔/分钟"),
            
            @ApiImplicitParam(paramType = "query",name = "dayBgLenght2",value = "第三层白天补光灯时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayBgCycle2",value = "第三层白天补光灯间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgLenght2",value = "第三层晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgCycle2",value = "第三层晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyLength2",value = "第三层白天营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyCycle2",value = "第三层白天营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyLength2",value = "第三层晚上营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyCycle2",value = "第三层晚上营养液循环间隔/分钟"),
            
            //育苗室
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgTime",value = "育苗室白天开启时间/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgLength",value = "育苗室白天补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgTime",value = "育苗室晚上开启时间/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgLength",value = "育苗室晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterLength",value = "喷淋阀白天开启时间/分钟"),
            //时间的单位为什么是分钟呢？ TODO 
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterCycle",value = "喷淋阀白天开启时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterLength",value = "喷淋阀晚上开启时间/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterCycle",value = "喷淋阀晚上开启时长/分钟"),
    })
    public  ResponseEntity<ResultModel> saveOrUpdate(@ModelAttribute ParamSet paramSet){
		if (paramSet == null) {
			return V.error("参数设置不能为空");
		}
		if(paramSet.getBatchId() == null){
			return V.error("批次ID不能为空");
		}
		paramSetService.saveOrUpdate(paramSet);
		
		//远程方法 TODO 
		return V.ok();
    }
	
	
	
	//获取最新的参数设置信息
	@GetMapping("/{batchId}")
	@ApiOperation(value = "根据批次查看参数设置信息@2018-03-16")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id——eg:6",required = true)
    })
    public ResponseEntity<ResultModel> getLastSeed( @PathVariable Long batchId){
        if (batchId == null) {
            return V.error("批次id不能等于空");
        }
       ParamSet paramSet = paramSetService.getByBatchId(batchId);
      return  V.ok(paramSet);
    }


}
