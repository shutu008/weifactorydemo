package com.vastsum.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.controller.system.BaseController;
import com.vastsum.core.service.HandRemoteService;
import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.entity.ParamSet;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.ParamSetService;
import com.vastsum.service.SensorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(value = "/paramSet")
@Api(value = "/paramSet",tags={"业务参数设置"})
public class ParamSetController extends BaseController {
	
	@Autowired
	private ParamSetService paramSetService;
	@Autowired
	private SensorService sensorService;
	@Autowired
	private HandRemoteService handRemoteService;

	//添加或更新参数设置信息
	@PostMapping("/saveOrUpdate")
	@ApiOperation(value = "添加或更新参数设置信息@2018-04-17")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = true),
            @ApiImplicitParam(paramType = "query",name = "paramSetId",value = "参数设置id,修改时带上"),
            
            @ApiImplicitParam(paramType = "query",name = "daySet",value = "植物工厂时间"),
            @ApiImplicitParam(paramType = "query",name = "checkTime",value = "是否同步植物工厂时间与服务器时间相同"),
            @ApiImplicitParam(paramType = "query",name = "dateLength",value = "日长"),
            @ApiImplicitParam(paramType = "query",name = "dateYi",value = "时移"),

            @ApiImplicitParam(paramType = "query",name = "dayStartTime",value = "白天开始时间"),
            @ApiImplicitParam(paramType = "query",name = "dayEndTime",value = "白天结束时间"),
            @ApiImplicitParam(paramType = "query",name = "nightStartTime",value = "晚上开始时间"),
            @ApiImplicitParam(paramType = "query",name = "nightEndTime",value = "晚上结束时间"),
            @ApiImplicitParam(paramType = "query",name = "dayNewWindLength",value = "白天换新风时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayNewWindTime",value = "白天换新风间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightNewWindLength",value = "晚上换新风时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightNewWindTime",value = "晚上换新风间隔/分钟"),
            
            //TODO 蔬菜名称和生长模式可以修改吗？蔬菜名称就不下发给机器了，汉字无法编码，因为有自定义的
            @ApiImplicitParam(paramType = "query",name = "plantName1",value = "第一层植物名称"),
            @ApiImplicitParam(paramType = "query",name = "growthPattern1",value = "第一层生长模式"),
            @ApiImplicitParam(paramType = "query",name = "dayTemperature1",value = "第一层白天温度"),
            @ApiImplicitParam(paramType = "query",name = "nightTemperature1",value = "第一层晚上温度"),
            @ApiImplicitParam(paramType = "query",name = "dayHumidity1",value = "第一层白天湿度"),
            @ApiImplicitParam(paramType = "query",name = "nightHumidity1",value = "第一层晚上湿度"),
            @ApiImplicitParam(paramType = "query",name = "dayBgLenght1",value = "第一层白天补光灯时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayBgCycle1",value = "第一层白天补光灯间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgLenght1",value = "第一层晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgCycle1",value = "第一层晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyLength1",value = "第一层白天营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyCycle1",value = "第一层白天营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyLength1",value = "第一层晚上营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyCycle1",value = "第一层晚上营养液循环间隔/分钟"),
            
            @ApiImplicitParam(paramType = "query",name = "plantName2",value = "第二层植物名称"),
            @ApiImplicitParam(paramType = "query",name = "growthPattern2",value = "第二层生长模式"),
            @ApiImplicitParam(paramType = "query",name = "dayTemperature2",value = "第二层白天温度"),
            @ApiImplicitParam(paramType = "query",name = "nightTemperature2",value = "第二层晚上温度"),
            @ApiImplicitParam(paramType = "query",name = "dayHumidity2",value = "第二层白天湿度"),
            @ApiImplicitParam(paramType = "query",name = "nightHumidity2",value = "第一层晚上湿度"),
            @ApiImplicitParam(paramType = "query",name = "dayBgLenght2",value = "第二层白天补光灯时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayBgCycle2",value = "第二层白天补光灯间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgLenght2",value = "第二层晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgCycle2",value = "第二层晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyLength2",value = "第二层白天营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyCycle2",value = "第二层白天营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyLength2",value = "第二层晚上营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyCycle2",value = "第二层晚上营养液循环间隔/分钟"),
            
            @ApiImplicitParam(paramType = "query",name = "plantName3",value = "第三层植物名称"),
            @ApiImplicitParam(paramType = "query",name = "growthPattern3",value = "第三层生长模式"),
            @ApiImplicitParam(paramType = "query",name = "dayTemperature3",value = "第三层白天温度"),
            @ApiImplicitParam(paramType = "query",name = "nightTemperature3",value = "第三层晚上温度"),
            @ApiImplicitParam(paramType = "query",name = "dayHumidity3",value = "第三层白天湿度"),
            @ApiImplicitParam(paramType = "query",name = "nightHumidity3",value = "第三层晚上湿度"),
            @ApiImplicitParam(paramType = "query",name = "dayBgLenght3",value = "第三层白天补光灯时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayBgCycle3",value = "第三层白天补光灯间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgLenght3",value = "第三层晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightBgCycle3",value = "第三层晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyLength3",value = "第三层白天营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayYyCycle3",value = "第三层白天营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyLength3",value = "第三层晚上营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightYyCycle3",value = "第三层晚上营养液循环间隔/分钟"),
            
            //育苗室
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgTime",value = "育苗室白天开启时间/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgLength",value = "育苗室白天补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgTime",value = "育苗室晚上开启时间/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgLength",value = "育苗室晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterLength",value = "喷淋阀白天开启时间/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterCycle",value = "喷淋阀白天开启时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterLength",value = "喷淋阀晚上开启时间/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterCycle",value = "喷淋阀晚上开启时长/分钟"),
    })
    public  ResponseEntity<ResultModel> saveOrUpdate(@ModelAttribute ParamSet paramSet){
		if (paramSet == null) {
			return V.error("参数设置不能为空");
		}
		if(paramSet.getSn() == null){
			return V.error("设备序列号不能为空");
		}
		ArrayList<String> deviceList = handRemoteService.getOnlineDeviceList();
		if (!deviceList.contains(paramSet.getSn())) {
			return V.error("当前设备不在线，无法下发参数信息！");
		}
		
		//下发参数设置其他数据
		handRemoteService.sendOrder(sensorService.changeOrder(paramSet), 2);
		paramSetService.saveOrUpdate(paramSet);
		return V.ok("数据下发成功！");
    }
	
	
	//添加或更新生长参数设置信息
	@PostMapping("/growth/saveOrUpdate")
	@ApiOperation(value = "添加或更新生长模式参数设置信息@2018-04-17")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "growthId",value = "生长模式参数id",required = true),
            @ApiImplicitParam(paramType = "query",name = "days",value = "生长天数",required = true),
            
            @ApiImplicitParam(paramType = "query",name = "growthOrder",value = "生长序号",required = true),
            @ApiImplicitParam(paramType = "query",name = "growthName",value = "名称",required = true),
            @ApiImplicitParam(paramType = "query",name = "growthNo",value = "生长模式",required = true),
            @ApiImplicitParam(paramType = "query",name = "aSc",value = "时长"),
            @ApiImplicitParam(paramType = "query",name = "aSy",value = "时移"),
            @ApiImplicitParam(paramType = "query",name = "aDayStart",value = "白天开始时间"),
            @ApiImplicitParam(paramType = "query",name = "aDayEnd",value = "白天结束时间"),
            @ApiImplicitParam(paramType = "query",name = "aNightStart",value = "晚上开始时间"),
            @ApiImplicitParam(paramType = "query",name = "aNightEnd",value = "晚上结束时间"),
            @ApiImplicitParam(paramType = "query",name = "aDayWindLen",value = "白天换新风时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "aDayWindInterval",value = "白天换新风间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "aNigthWindLen",value = "晚上换新风时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "aNightWindInterval",value = "晚上换新风间隔/分钟"),
            
            
            @ApiImplicitParam(paramType = "query",name = "bDayBgLen",value = "白天补光灯时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bDayBgInterval",value = "白天补光灯间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bNightBgLen",value = "晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bNightBgInterval",value = "晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bDayYyLen",value = "白天营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bDayYyInterval",value = "白天营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bNightYyLen",value = "晚上营养液循环时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bNightYyInterval",value = "晚上营养液循环间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "bDayTemperature",value = "白天温度"),
            @ApiImplicitParam(paramType = "query",name = "bNightTemperature",value = "晚上温度"),
            @ApiImplicitParam(paramType = "query",name = "bDayHumidity",value = "白天湿度"),
            @ApiImplicitParam(paramType = "query",name = "bNightHumidity",value = "晚上湿度")
    })
    public  ResponseEntity<ResultModel> saveOrUpdateGrowthParam(@ModelAttribute GrowthPatternParam growthPatternParam){
		if (growthPatternParam == null) {
			return V.error("参数设置不能为空");
		}
		
		if (growthPatternParam.getDays() == null) {
			return V.error("生长天数不能为空");
		}
		
		if (growthPatternParam.getGrowthOrder() == null) {
			return V.error("生长序号不能为空");
		}
		if (growthPatternParam.getGrowthName() == null) {
			return V.error("名称不能为空");
		}
		if (growthPatternParam.getGrowthNo() == null) {
			return V.error("生长模式不能为空");
		}
		paramSetService.saveOrUpdateGrowthParam(growthPatternParam);
		return V.ok();
    }
	
	
	
	// 获取生长模式对应的生长参数列表
		@GetMapping("/growth/{growthNo}")
		@ApiOperation(value = "根据生长模式获取对应的生长模式列表@2018-04-17")
	    @ApiImplicitParams({
	            @ApiImplicitParam(paramType = "path",name = "growthNo",value = "生长模式",required = true)
	    })
	    public ResponseEntity<ResultModel> getLastSeed( @PathVariable Integer growthNo){
	        if (growthNo == null) {
	            return V.error("生长模式不能为空");
	        }
	       return V.ok(paramSetService.listByGrowthNo(growthNo));
	    }
	
	
	
	//获取最新的参数设置信息
	@ApiIgnore
	@GetMapping("/{batchId}")
	@ApiOperation(value = "根据批次查看参数设置信息@2018-03-16")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id——eg:6",required = true)
    })
    public ResponseEntity<ResultModel> getLastParamSetByBatchId( @PathVariable Long batchId){
        if (batchId == null) {
            return V.error("批次id不能等于空");
        }
       ParamSet paramSet = paramSetService.getByBatchId(batchId);
      return  V.ok(paramSet);
    }
	
	//根据设备序列号获取最新的参数设置信息
	@GetMapping("/device/{sn}")
	@ApiOperation(value = "根据设备序列号获取最新的参数设置信息@2018-04-17")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "sn",value = "设备序列号",required = true)
    })
    public ResponseEntity<ResultModel> getLastParamSetBySn( @PathVariable String sn){
        if (StringUtils.isBlank(sn) ) {
            return V.error("设备序列号不能等于空");
        }
        //先判断当前设备是否在线
        ArrayList<String> deviceList = handRemoteService.getOnlineDeviceList();
        if (deviceList.contains(sn)) {
        	//当前设备在线
        	//远程请求植物工厂时间
            HashMap<String,Object> deviceTime = sensorService.getDeviceTime(sn);
    		handRemoteService.sendOrder(deviceTime, 2);
       	}
      
       ParamSet paramSet = paramSetService.getLastBySn(sn);
      return  V.ok(paramSet);
    }
	


}
