package com.vastsum.controller;

import java.util.ArrayList;
import java.util.HashMap;
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

import com.vastsum.controller.system.BaseController;
import com.vastsum.core.service.HandRemoteService;
import com.vastsum.entity.Batch;
import com.vastsum.entity.Device;
import com.vastsum.entity.FeedParamSet;
import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.entity.ParamSet;
import com.vastsum.entity.Seed;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.BatchService;
import com.vastsum.service.DeviceService;
import com.vastsum.service.ParamSetService;
import com.vastsum.service.SeedService;
import com.vastsum.service.SensorService;
import com.vastsum.utils.GrowthParamCache;

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
	@Autowired
	private BatchService batchService;
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private SeedService seedService;

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
            @ApiImplicitParam(paramType = "query",name = "feedName",value = "育苗室植物名称"),
            @ApiImplicitParam(paramType = "query",name = "feedPlantingTime",value = "育苗播种时间"),
            @ApiImplicitParam(paramType = "query",name = "feedRecoveryTime",value = "育苗室预计可值日期"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgLength",value = "育苗室白天补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgTime",value = "育苗室白天补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgLength",value = "育苗室晚上补光时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgTime",value = "育苗室晚上补光间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterLength",value = "喷淋阀白天执行时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterCycle",value = "喷淋阀白天执行间隔/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterLength",value = "喷淋阀晚上开启时长/分钟"),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterCycle",value = "喷淋阀晚上开启间隔/分钟")
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
		
		//先判断批次号是否存在，如果存在则不修改和添加，如果不存在则生成 1+13
		Device device = deviceService.getDeviceBySn(paramSet.getSn());
		Batch batch = batchService.selectLastBatchByDeviceId(device.getDeviceId());
		if (paramSet.getParamSetId() == null) {
			if (StringUtils.isNotBlank(batch.getPlantOne())) {
				paramSet.setBatchNo1("1"+System.currentTimeMillis());
			}
			if (StringUtils.isNotBlank(batch.getPlantTwo())) {
				paramSet.setBatchNo1("2"+System.currentTimeMillis());
			}
			if (StringUtils.isNotBlank(batch.getPlantThree())) {
				paramSet.setBatchNo1("3"+System.currentTimeMillis());
			}
		}else {
			ParamSet set = paramSetService.getById(paramSet.getParamSetId());
			if (StringUtils.isNotBlank(batch.getPlantOne())) {
				if (StringUtils.isBlank(set.getBatchNo1())) {
					paramSet.setBatchNo1("1"+System.currentTimeMillis());
				}
			}
			if (StringUtils.isNotBlank(batch.getPlantTwo())) {
				if (StringUtils.isBlank(set.getBatchNo2())) {
					paramSet.setBatchNo1("2"+System.currentTimeMillis());
				}
			}
			
			if (StringUtils.isNotBlank(batch.getPlantThree())) {
				if (StringUtils.isBlank(set.getBatchNo3())) {
					paramSet.setBatchNo1("3"+System.currentTimeMillis());
				}
			}
			
		}
		
		//下发参数设置其他数据
		handRemoteService.sendOrder(sensorService.changeOrder(paramSet));
		paramSetService.saveOrUpdate(paramSet);
		return V.ok("数据下发成功！");
    }
	
	
	//添加或更新生长参数设置信息
	@PostMapping("/growth/saveOrUpdate")
	@ApiOperation(value = "添加或更新生长模式参数设置信息@2018-04-17")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "growthId",value = "生长模式参数id",required = true),
            @ApiImplicitParam(paramType = "query",name = "plantNo",value = "植物名称代号",required = true),
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
		
		
		if (StringUtils.isBlank(growthPatternParam.getPlantNo())) {
			return V.error("植物名称代号");
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
		//重新加载缓存
		GrowthParamCache.loadCache();
		return V.ok();
    }
	
	
	
	// 获取生长模式对应的生长参数列表
		@GetMapping("/growth/{growthNo}/plantNo/{plantNo}")
		@ApiOperation(value = "根据生长模式和植物代号获取对应的生长模式列表@2018-04-17")
	    @ApiImplicitParams({
	            @ApiImplicitParam(paramType = "path",name = "growthNo",value = "生长模式",required = true),
	            @ApiImplicitParam(paramType = "path",name = "plantNo",value = "植物名称代号",required = true)
	    })
	    public ResponseEntity<ResultModel> getLastSeed( @PathVariable Integer growthNo,
	    		 @PathVariable String plantNo){
	        if (growthNo == null) {
	            return V.error("生长模式不能为空");
	        }
	        if (StringUtils.isBlank(plantNo)) {
	            return V.error("植物ID不能为空");
	        }
	       return V.ok(paramSetService.listByGrowthNo(plantNo ,growthNo));
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
    		handRemoteService.sendOrder(deviceTime);
       	}
        //请求结果落表，在通信中间层解决
        //根据设备序列号去数据库查询数据，如果存在参数设置数据就读取出来，如果不存在就读取默认的值
       ParamSet paramSet = paramSetService.getLastBySn(sn);
       if (paramSet == null) {
		paramSet = new ParamSet();
		//根据设备序列号去查询对饮的批次
		Device device = deviceService.getDeviceBySn(sn);
		Batch batch = batchService.selectLastBatchByDeviceId(device.getDeviceId());
		if (StringUtils.isNotBlank(batch.getPlantOne()) && StringUtils.isNotBlank(batch.getCultModelOne())) {
			List<GrowthPatternParam> list = null;
			if ("0".equals(batch.getCultModelOne())) {
				//如果生长模式是无，自动选择节能模式参数
				list = paramSetService.listByGrowthNo(batch.getPlantOne(), 1);
			}else {
				list = paramSetService.listByGrowthNo(batch.getPlantOne(), Integer.parseInt(batch.getCultModelOne()));
			}
			
			if (list != null && !list.isEmpty() ) {
				GrowthPatternParam param = list.get(0);
				paramSet.setDayTemperature1(param.getbDayTemperature());
				paramSet.setNightTemperature1(param.getbNightTemperature());
				paramSet.setDayHumidity1(param.getbDayHumidity());
				paramSet.setNightHumidity1(param.getbNightHumidity());
				
				paramSet.setDayBgLenght1(Integer.parseInt(param.getbDayBgLen()));
				paramSet.setDayBgCycle1(Integer.parseInt(param.getbDayBgInterval()));
				paramSet.setNightBgLenght1(Integer.parseInt(param.getbNightBgLen()));
				paramSet.setNightBgCycle1(Integer.parseInt(param.getbNightBgInterval()));
				
				paramSet.setDayYyLength1(Integer.parseInt(param.getbDayYyLen()));
				paramSet.setDayYyCycle1(Integer.parseInt(param.getbDayYyInterval()));
				paramSet.setNightYyLength1(Integer.parseInt(param.getbNightYyLen()));
				paramSet.setNightYyCycle1(Integer.parseInt(param.getbNightYyInterval()));
			}
		}
		
		
		if (StringUtils.isNotBlank(batch.getPlantTwo()) && StringUtils.isNotBlank(batch.getCultModelTwo())) {
			List<GrowthPatternParam> list = null;
			if ("0".equals(batch.getCultModelTwo())) {
				//如果生长模式是无，自动选择节能模式参数
				list = paramSetService.listByGrowthNo(batch.getPlantTwo(), 1);
			}else {
				list = paramSetService.listByGrowthNo(batch.getPlantTwo(), Integer.parseInt(batch.getCultModelTwo()));
			}
			if (list != null && !list.isEmpty() ) {
				GrowthPatternParam param = list.get(0);
				paramSet.setDayTemperature2(param.getbDayTemperature());
				paramSet.setNightTemperature2(param.getbNightTemperature());
				paramSet.setDayHumidity2(param.getbDayHumidity());
				paramSet.setNightHumidity2(param.getbNightHumidity());
				
				paramSet.setDayBgLenght2(Integer.parseInt(param.getbDayBgLen()));
				paramSet.setDayBgCycle2(Integer.parseInt(param.getbDayBgInterval()));
				paramSet.setNightBgLenght2(Integer.parseInt(param.getbNightBgLen()));
				paramSet.setNightBgCycle2(Integer.parseInt(param.getbNightBgInterval()));
				
				paramSet.setDayYyLength2(Integer.parseInt(param.getbDayYyLen()));
				paramSet.setDayYyCycle2(Integer.parseInt(param.getbDayYyInterval()));
				paramSet.setNightYyLength2(Integer.parseInt(param.getbNightYyLen()));
				paramSet.setNightYyCycle2(Integer.parseInt(param.getbNightYyInterval()));
			}
		}
		
		if (StringUtils.isNotBlank(batch.getPlantThree()) && StringUtils.isNotBlank(batch.getCultModelThree())) {
			List<GrowthPatternParam> list = null;
			if ("0".equals(batch.getCultModelThree())) {
				//如果生长模式是无，自动选择节能模式参数
				list = paramSetService.listByGrowthNo(batch.getPlantThree(), 1);
			}else {
				list = paramSetService.listByGrowthNo(batch.getPlantThree(), Integer.parseInt(batch.getCultModelThree()));
			}
			if (list != null && !list.isEmpty() ) {
				GrowthPatternParam param = list.get(0);
				paramSet.setDayTemperature3(param.getbDayTemperature());
				paramSet.setNightTemperature3(param.getbNightTemperature());
				paramSet.setDayHumidity3(param.getbDayHumidity());
				paramSet.setNightHumidity3(param.getbNightHumidity());
				
				paramSet.setDayBgLenght3(Integer.parseInt(param.getbDayBgLen()));
				paramSet.setDayBgCycle3(Integer.parseInt(param.getbDayBgInterval()));
				paramSet.setNightBgLenght3(Integer.parseInt(param.getbNightBgLen()));
				paramSet.setNightBgCycle3(Integer.parseInt(param.getbNightBgInterval()));
				
				paramSet.setDayYyLength3(Integer.parseInt(param.getbDayYyLen()));
				paramSet.setDayYyCycle3(Integer.parseInt(param.getbDayYyInterval()));
				paramSet.setNightYyLength3(Integer.parseInt(param.getbNightYyLen()));
				paramSet.setNightYyCycle3(Integer.parseInt(param.getbNightYyInterval()));
			}
		}
		
		//育苗室
		Seed seed = seedService.getLastByBatchId(batch.getBatchId());
		if (StringUtils.isNotBlank(seed.getSeedRoomPlant())) {
			FeedParamSet feedParamSet = paramSetService.getByPlantId(seed.getSeedRoomPlant());
			if (feedParamSet !=null) {
				paramSet.setDayFeedBgLength(feedParamSet.getDayFeedBgLength());
				paramSet.setDayFeedBgTime(feedParamSet.getDayFeedBgInterval());
				paramSet.setNightFeedBgLength(feedParamSet.getNightFeedBgLength());
				paramSet.setNightFeedBgTime(feedParamSet.getNightFeedBgInterval());
				
				paramSet.setDayFeedWaterLength(feedParamSet.getDayFeedWaterLength());
				paramSet.setDayFeedWaterCycle(feedParamSet.getDayFeedWaterInterval());
				paramSet.setNightFeedWaterLength(feedParamSet.getNightFeedWaterLength());
				paramSet.setNightFeedWaterCycle(feedParamSet.getNightFeedWaterInterval());
			}
			
		}
		
		//整体参数设置 （在植物参数设置表中有个默认 , 默认数据库中有这条记录）
		List<GrowthPatternParam> list = paramSetService.listByGrowthNo("AAA", 999999);
		if (list != null && !list.isEmpty()) {
			GrowthPatternParam param = list.get(0);
			if (param !=null) {
				paramSet.setDateLength(Integer.parseInt(param.getaSc()));
				paramSet.setDateYi(Integer.parseInt(param.getaSy()));
				paramSet.setDayStartTime(param.getaDayStart());
				paramSet.setDayEndTime(param.getaDayEnd());
				
				paramSet.setNightStartTime(param.getaNightStart());
				paramSet.setNightEndTime(param.getaNightEnd());
				
				paramSet.setDayNewWindLength(Integer.parseInt(param.getaDayWindLen()));
				paramSet.setDayNewWindTime(Integer.parseInt(param.getaDayWindInterval()));
				paramSet.setNightNewWindLength(Integer.parseInt(param.getaNigthWindLen()));
				paramSet.setNightNewWindTime(Integer.parseInt(param.getaNightWindInterval()));
				
			}
		}
		
	}
      return  V.ok(paramSet);
    }
	
	
	
	
	//添加或更新生长参数设置信息
	@PostMapping("/feedParamSet/saveOrUpdate")
	@ApiOperation(value = "添加或更新育苗室参数设置信息@2018-05-20")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "feedParamId",value = "育苗室生长模式参数id",required = true),
            @ApiImplicitParam(paramType = "query",name = "plantId",value = "植物名称代号",required = true),
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgLength",value = "育苗灯白天补光时长",required = false),
            @ApiImplicitParam(paramType = "query",name = "dayFeedBgInterval",value = "育苗室白天补光间隔",required = false),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgLength",value = "育苗室晚上补光时长",required = false),
            @ApiImplicitParam(paramType = "query",name = "nightFeedBgInterval",value = "育苗室晚上补光间隔",required = false),
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterLength",value = "喷淋阀白天执行时长",required = false),
            @ApiImplicitParam(paramType = "query",name = "dayFeedWaterInterval",value = "喷淋阀白天执行间隔",required = false),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterLength",value = "喷淋阀晚上开启时长",required = false),
            @ApiImplicitParam(paramType = "query",name = "nightFeedWaterInterval",value = "喷淋阀晚上开启间隔",required = false)
           
    })
    public  ResponseEntity<ResultModel> saveOrUpdateFeedParamSet(@ModelAttribute FeedParamSet feedParamSet){
		if (feedParamSet == null) {
			return V.error("育苗室参数设置不能为空");
		}
		if (StringUtils.isBlank(feedParamSet.getPlantId())){
			return V.error("植物名称代号");
		}
		paramSetService.saveOrUpdateFeedParamSet(feedParamSet);
		return V.ok();
    }
	
	
	
	// 获取生长模式对应的生长参数列表
		@GetMapping("/feed/{plantId}")
		@ApiOperation(value = "根据植物名称ID获取育苗参数设置信息@2018-05-20")
	    @ApiImplicitParams({
	            @ApiImplicitParam(paramType = "path",name = "plantId",value = "植物名称代号",required = true)
	    })
	    public ResponseEntity<ResultModel> getFeedParamSetByPlantNo( @PathVariable String plantId){
	        if (StringUtils.isBlank(plantId)) {
	            return V.error("植物ID不能为空");
	        }
	       return V.ok(paramSetService.getByPlantId(plantId));
	    }
	


}
