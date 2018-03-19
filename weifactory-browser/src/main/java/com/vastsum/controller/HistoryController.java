package com.vastsum.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.HistoryInfo;
import com.vastsum.entity.Image;
import com.vastsum.model.ResultModel;
import com.vastsum.model.V;
import com.vastsum.properties.WeifactoryProperties;
import com.vastsum.service.HistoryInfoService;
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
	private HistoryInfoService historyInfoService;
	
	@Autowired
	private ImageServer imageServer;
	
    @Autowired
    private WeifactoryProperties weifactoryProperties;
	

	//获取报表图表数据
	@PostMapping("/data")
	@ApiOperation(value = "历史数据图表接口@2018-03-19")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "batchId",value = "批次id",required = true),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "开始时间",required = true),
            @ApiImplicitParam(paramType = "query",name = "endTime",value = "结束时间",required = true),
            @ApiImplicitParam(paramType = "query",name = "type",value = "查看数据类型，参考字典历史数据信息",required = true)
    })
	 public  ResponseEntity<ResultModel> save(Long batchId,
			 								  Date startTime,
			 								  Date endTime,
			 								  String type){
		if (batchId == null) {
			return V.error("批次id不能为空");
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
		
		List<HistoryInfo> list = historyInfoService.listByTime(batchId, startTime, endTime);
		
		//横坐标
		List<Object> x = new ArrayList<>();
		//纵坐标
		List<Object> y = new ArrayList<>();
		
		for (HistoryInfo historyInfo : list) {
			
			x.add(historyInfo.getGmtCreate());
			switch (type) {
			case "11":
				y.add(historyInfo.getOneTemperature());
				break;
			case "12":
				y.add(historyInfo.getOneHumidity());
				break;
			case "13":
				y.add(historyInfo.getOneYy());
				break;
			case "14":
				y.add(historyInfo.getOneLed1());
				break;
			case "15":
				y.add(historyInfo.getOneLed2());
				break;
			case "16":
				y.add(historyInfo.getOneLed3());
				break;
			case "21":
				y.add(historyInfo.getTwoTemperature());
				break;
			case "22":
				y.add(historyInfo.getTwoHumidity());
				break;
			case "23":
				y.add(historyInfo.getTwoYy());
				break;
			case "24":
				y.add(historyInfo.getTwoLed1());
				break;
			case "25":
				y.add(historyInfo.getTwoLed2());
				break;
			case "26":
				y.add(historyInfo.getTwoLed3());
				break;
			case "31":
				y.add(historyInfo.getThreeTemperature());
				break;
			case "32":
				y.add(historyInfo.getThreeHumidity());
				break;
			case "33":
				y.add(historyInfo.getThreeYy());
				break;
			case "34":
				y.add(historyInfo.getThreeLed1());
				break;
			case "35":
				y.add(historyInfo.getThreeLed2());
				break;
			case "36":
				y.add(historyInfo.getThreeLed3());
				break;
			default:
				break;
			}
			
		}
		Map<String, List<Object>> data = new HashMap<>();
		data.put("x", x);
		data.put("y", y);
		return V.ok(data);
    }

	
	//获取图片地址
	@PostMapping("/image")
	@ApiOperation(value = "获取图片数据@2018-03-19")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "batchId",value = "批次id",required = true),
            @ApiImplicitParam(paramType = "query",name = "startTime",value = "日期，精确到天",required = true)
           
    })
	public ResponseEntity<ResultModel> queryImage(Long batchId,
												  Date startTime ){
		if (batchId == null) {
			return V.error("批次id不能为空");
		}
		if (startTime == null) {
			return V.error("开始时间不能为空");
		}
		
		//根据批次和选择日期
		Image image = imageServer.getImageByBatchAndDate(batchId, startTime);
		String hostDir = weifactoryProperties.getImage().getHostUrl();
		String imageUrl = hostDir + image.getOnePicName();
		return V.ok(imageUrl);
	}
	
}
