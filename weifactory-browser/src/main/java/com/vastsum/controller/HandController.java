package com.vastsum.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.vastsum.entity.HandControl;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.BatchService;
import com.vastsum.service.DeviceService;
import com.vastsum.service.HandControlService;
import com.vastsum.service.SensorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/hand")
@Api(value = "/hand",tags={"手动控制"})
public class HandController  extends BaseController  {
	
	private static Logger logger = LoggerFactory.getLogger(HandController.class);

	@Autowired
	private HandControlService handControlService;
	
	@Autowired
	private HandRemoteService handRemoteService;
	@Autowired
	private SensorService sensorService;
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private BatchService batchService;
	
	@GetMapping("/test")
	@ApiOperation(value = "test")
	public  ResponseEntity<ResultModel> saveOrUpdate(){
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("sn", "ZWGC2018032665194");
		hashMap.put("kqxh1","1");
		System.out.println("正在向"+(String)(hashMap.get("sn"))+"发送指令");
		handRemoteService.sendOrder(hashMap);
		return V.ok();
    }
	
	
	//手动控制设置
	@PostMapping("/saveOrUpdate")
	@ApiOperation(value = "手动控制设置@2018-03-29")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "handControlId",value = "手动控制id，修改手动控制信息时带上"),
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = true),
            @ApiImplicitParam(paramType = "query",name = "wd1",value = "第一层温度"),
            @ApiImplicitParam(paramType = "query",name = "kqxh1",value = "第一层空气循环"),
            @ApiImplicitParam(paramType = "query",name = "kqxd1",value = "第一层空气消毒"),
            @ApiImplicitParam(paramType = "query",name = "hxf1",value = "第一层换新风"),
            @ApiImplicitParam(paramType = "query",name = "syyy1",value = "第一层施营养液"),
            @ApiImplicitParam(paramType = "query",name = "pyyy1",value = "第一层排营养液"),
            @ApiImplicitParam(paramType = "query",name = "yyyxd1",value = "第一层营养液消毒"),
            @ApiImplicitParam(paramType = "query",name = "led11",value = "第一层led1"),
            @ApiImplicitParam(paramType = "query",name = "led12",value = "第一层led2"),
            @ApiImplicitParam(paramType = "query",name = "led13",value = "第一层led3"),
            
            @ApiImplicitParam(paramType = "query",name = "wd2",value = "第二层温度"),
            @ApiImplicitParam(paramType = "query",name = "kqxh2",value = "第二层空气循环"),
            @ApiImplicitParam(paramType = "query",name = "kqxd2",value = "第二层空气消毒"),
            @ApiImplicitParam(paramType = "query",name = "hxf2",value = "第二层换新风"),
            @ApiImplicitParam(paramType = "query",name = "syyy2",value = "第二层施营养液"),
            @ApiImplicitParam(paramType = "query",name = "pyyy2",value = "第二层排营养液"),
            @ApiImplicitParam(paramType = "query",name = "yyyxd2",value = "第二层营养液消毒"),
            @ApiImplicitParam(paramType = "query",name = "led21",value = "第二层led1"),
            @ApiImplicitParam(paramType = "query",name = "led22",value = "第二层led2"),
            @ApiImplicitParam(paramType = "query",name = "led23",value = "第二层led3"),
            
            @ApiImplicitParam(paramType = "query",name = "wd3",value = "第三层温度"),
            @ApiImplicitParam(paramType = "query",name = "kqxh3",value = "第二层空气循环"),
            @ApiImplicitParam(paramType = "query",name = "kqxd3",value = "第二层空气消毒"),
            @ApiImplicitParam(paramType = "query",name = "hxf3",value = "第二层换新风"),
            @ApiImplicitParam(paramType = "query",name = "syyy3",value = "第二层施营养液"),
            @ApiImplicitParam(paramType = "query",name = "pyyy3",value = "第二层排营养液"),
            @ApiImplicitParam(paramType = "query",name = "yyyxd3",value = "第二层营养液消毒"),
            @ApiImplicitParam(paramType = "query",name = "led31",value = "第二层led1"),
            @ApiImplicitParam(paramType = "query",name = "led32",value = "第二层led2"),
            @ApiImplicitParam(paramType = "query",name = "led33",value = "第二层led3"),
            
            @ApiImplicitParam(paramType = "query",name = "ymbg",value = "育苗补光"),
            @ApiImplicitParam(paramType = "query",name = "mpjs",value = "苗盘浇水")
    })
    public  ResponseEntity<ResultModel> saveOrUpdate(@ModelAttribute HandControl handControl){
		if(handControl == null){
			return V.error("手动控制参数不能为空");
		}
		ArrayList<String> deviceList = handRemoteService.getOnlineDeviceList();
		if (!deviceList.contains(handControl.getSn())) {
			return V.error("当前设备不在线，无法进行手动控制！");
		}
		//1,代表手动控制模块
		handRemoteService.sendOrder(sensorService.changeOrder(handControl));
		logger.info("手动控制数据下发成功");
		//手动控制保存成功
		//获取当前批次
		Device device = deviceService.getDeviceBySn(handControl.getSn());
		Batch batch = batchService.selectLastBatchByDeviceId(device.getDeviceId());
		handControl.setBatchId(batch.getBatchId());
		handControlService.saveOrUpdate(handControl);
		
		return V.ok();
    }
	
	
	
	//获取最新的手动控制信息
	@GetMapping("/{batchId}")
	@ApiOperation(value = "获取手动控制信息@2018-03-29")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "batchId",value = "批次id——eg:31",required = true)
    })
    public ResponseEntity<ResultModel> getLastSeed( @PathVariable Long batchId){
        if (batchId == null) {
            return V.error("批次id不能等于空");
        }
     HandControl handControl = handControlService.getByBatchId(batchId);
     return V.ok(handControl);
    }


}
