package com.vastsum.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.HistoryData;
import com.vastsum.entity.Image;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.properties.WeifactoryProperties;
import com.vastsum.service.HistoryDataService;
import com.vastsum.service.ImageServer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


/**
 * 历史数据控制
* @author shensj
* @date 2018年3月19日 下午8:22:53
 */
@RestController
@RequestMapping(value = "/history")
@Api(value = "/history",tags={"历史数据管理"})
public class HistoryController extends BaseController {
	
	
	@Autowired
	private HistoryDataService historyDataService;
	
	@Autowired
	private ImageServer imageServer;
	
    @Autowired
    private WeifactoryProperties weifactoryProperties;
	

	//获取报表图表数据
	@PostMapping("/data")
	@ApiOperation(value = "历史数据图表接口@2018-04-18")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = true),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "开始时间",required = true),
            @ApiImplicitParam(paramType = "query",name = "endTime",value = "结束时间",required = true),
            @ApiImplicitParam(paramType = "query",name = "type",value = "查看数据类型，参考字典历史数据信息",required = true)
    })
	 public  ResponseEntity<ResultModel> save(String sn,
			 								  Date startTime,
			 								  Date endTime,
			 								  String type){
		if (StringUtils.isBlank(sn)) {
			return V.error("设备序列号不能为空");
		}
		if (startTime == null) {
			return V.error("开始时间不能为空");
		}
		if (endTime == null) {
			return V.error("结束时间不能为空");
		}
		if (type == null) {
			return V.error("类型参数不能为空");
		}
		String identity = null;
		switch (type) {
		case "11":
			identity = "104";
			break;
		case "12":
			identity = "105";
			break;
		case "13":
			identity = "106";
			break;
		case "14":
			identity = "101";
			break;
		case "15":
			identity = "102";
			break;
		case "16":
			identity = "103";
			break;
		case "21":
			identity = "204";
			break;
		case "22":
			identity = "205";
			break;
		case "23":
			identity = "206";
			break;
		case "24":
			identity = "201";
			break;
		case "25":
			identity = "202";
			break;
		case "26":
			identity = "203";
			break;
		case "31":
			identity = "304";
			break;
		case "32":
			identity = "305";
			break;
		case "33":
			identity = "306";
			break;
		case "34":
			identity = "301";
			break;
		case "35":
			identity = "302";
			break;
		case "36":
			identity = "303";
			break;			
		default:
			identity = "";
			break;
		}

		List<HistoryData> list = historyDataService.listByTime(sn, identity, startTime, endTime);
		
		//横坐标
		List<Object> x = new ArrayList<>();
		for (HistoryData historyData : list) {
			x.add(historyData.getServerTime());
		}
		//纵坐标
		List<Object> y = new ArrayList<>();
		for (HistoryData historyData: list) {
			y.add(historyData.getValue());
		}
		
		Map<String, List<Object>> data = new HashMap<>();
		data.put("x", x);
		data.put("y", y);
		return V.ok(data);
    }

	
	//获取图片地址
	@PostMapping("/image")
	@ApiOperation(value = "获取图片数据@2018-04-18")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "sn",value = "设备序列号",required = true),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "日期，精确到天",required = true)
           
    })
	public ResponseEntity<ResultModel> queryImage(String sn,
												  Date startTime ){
		if ( StringUtils.isBlank(sn)) {
			return V.error("设备序列好不能为空");
		}
		if (startTime == null) {
			return V.error("开始时间不能为空");
		}
		
		//根据批次和选择日期
		Image image = imageServer.getImageByDate(sn, startTime);
		if(image == null){
			return V.ok();
		}
		String hostDir = weifactoryProperties.getImage().getHostUrl();
		String imageUrl = hostDir + image.getOnePicName();
		return V.ok(imageUrl);
	}
	
}
