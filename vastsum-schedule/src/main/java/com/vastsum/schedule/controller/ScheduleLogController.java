package com.vastsum.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.core.model.R;
import com.vastsum.core.model.ResultModel;
import com.vastsum.schedule.entity.ScheduleJobLog;
import com.vastsum.schedule.service.ScheduleJobLogService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/scheduleLog")
@Api(tags = "定时任务日志")
@RestController
public class ScheduleLogController {
	
	@Autowired
	private ScheduleJobLogService scheduleJobLogService;

	
	@PostMapping("/list")
	@ApiOperation("获取定时任务日志列表@20180420")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query",name="scheduleName" , value="任务名称", required = false),
		@ApiImplicitParam(paramType = "query",name="beanName" , value="bean名称", required = false),
		@ApiImplicitParam(paramType = "query",name="methodName" , value="方法名称", required = false),
		@ApiImplicitParam(paramType = "query",name="status" , value="状态", required = false),
		@ApiImplicitParam(paramType = "query",name="page" , value="页数", required = true),
		@ApiImplicitParam(paramType = "query",name="pageSize" , value="每页条数", required = true)
	})
	public ResponseEntity<ResultModel> list(@ModelAttribute ScheduleJobLog scheduleJobLog
				,Integer page, Integer pageSize){
		return R.ok(scheduleJobLogService.listAll(scheduleJobLog, page, pageSize));
	}
}
