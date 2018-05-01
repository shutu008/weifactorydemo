package com.vastsum.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.core.service.HandRemoteService;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.service.DeviceService;
import com.vastsum.service.TrustService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 托管管理
* @author shensj 
* @date 2018年3月14日 下午9:47:01
 */
@RestController
@RequestMapping(value = "/trust")
@Api(value = "/trust",tags={"设备托管管理"})
public class TrustController {


	@Autowired
	private TrustService trustService;
	@Autowired
	private HandRemoteService handRemoteService;
	@Autowired
	private DeviceService deviceService;
	
	private static Logger logger = LoggerFactory.getLogger(TrustController.class);
	
	//托管设备
	@GetMapping("/device/{deviceId}/trustStatus/{trustStatus}")
	@ApiOperation(value = " 托管设备@2018-04-15")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id",required = true),
            @ApiImplicitParam(paramType = "path",name = "trustStatus",value = "托管状态",required = true)
    })
    public  ResponseEntity<ResultModel> save(@PathVariable Integer deviceId, 
    		@PathVariable String trustStatus){
		
		if (deviceId == null) {
			return V.error("设备ID不能为空");
		}
		if (trustStatus == null) {
			return V.error("托管状态不能为空");
		}
		String sn = deviceService.getSnByDeviceId(deviceId);
//		ArrayList<String> deviceList = handRemoteService.getOnlineDeviceList();
//		if (!deviceList.contains(sn)) {
//			return V.error("当前设备不在线，无法进行手动控制！");
//		}
		HashMap<String, Object> hashMap  = new HashMap<>();
		hashMap.put("sn", sn);
		hashMap.put("T0006001", trustStatus);
		//1,代表手动控制模块
		handRemoteService.sendOrder(hashMap);
		logger.info("托管数据下发成功");
		
		trustService.trust(deviceId, trustStatus);
		
		return V.ok();
    }
	
		//取消托管
		@GetMapping("/cancle/deviceId/{deviceId}")
		@ApiOperation(value = "取消设备托管@2018-04-15")
	    @ApiImplicitParams({
	            @ApiImplicitParam(paramType = "path",name = "deviceId",value = "设备id",required = true),
	    })
	    public  ResponseEntity<ResultModel> cancleTrust(@PathVariable Integer deviceId){
			
			if (deviceId == null) {
				return V.error("设备ID不能为空");
			}
			String sn = deviceService.getSnByDeviceId(deviceId);
//			ArrayList<String> deviceList = handRemoteService.getOnlineDeviceList();
//			if (!deviceList.contains(sn)) {
//				return V.error("当前设备不在线，无法进行手动控制！");
//			}
			HashMap<String, Object> hashMap  = new HashMap<>();
			hashMap.put("sn", sn);
			hashMap.put("T0006002", "1");
			//1,代表手动控制模块
			handRemoteService.sendOrder(hashMap);
			logger.info("取消托管数据下发成功");
			
			//取消设备托管
			trustService.cancelTrust(deviceId);
			return V.ok();
	    }
	
	
	
}
