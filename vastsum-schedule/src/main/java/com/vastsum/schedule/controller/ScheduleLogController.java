package com.vastsum.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	
	@GetMapping("/list")
	@ApiOperation("获取定时任务日志列表@20180202")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query",name="beanName" , value="bean名称", required = false),
		@ApiImplicitParam(paramType = "query",name="methodName" , value="方法名称", required = false),
		@ApiImplicitParam(paramType = "query",name="status" , value="状态", required = false),
		@ApiImplicitParam(paramType = "query",name="page" , value="页数", required = false),
		@ApiImplicitParam(paramType = "query",name="size" , value="每页条数", required = false),
		@ApiImplicitParam(paramType = "query",name="sort" , value="排序", required = false)
	})
	public ResponseEntity<ResultModel> list(@ModelAttribute ScheduleJobLog scheduleJobLog, 
				@PageableDefault(page=0,size=10,sort={"logId"},direction = Sort.Direction.ASC)
				Pageable pageable){
		
		if (scheduleJobLog == null) {
			Page<ScheduleJobLog> listAll = scheduleJobLogService.listAll(pageable);
			return R.ok(listAll);
		}
		Page<ScheduleJobLog> page = scheduleJobLogService.listAll(scheduleJobLog, pageable);
		return R.ok(page);
	}
}
