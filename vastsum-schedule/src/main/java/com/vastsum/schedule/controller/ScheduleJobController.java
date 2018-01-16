package com.vastsum.schedule.controller;

import org.apache.commons.lang.StringUtils;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastsum.core.model.R;
import com.vastsum.core.model.ResultModel;
import com.vastsum.core.model.ResultStatus;
import com.vastsum.schedule.entity.ScheduleJobEntity;
import com.vastsum.schedule.service.ScheduleJobService;
import com.vastsum.schedule.utils.ScheduleUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/schedule")
@Api(tags = "定时任务管理")
public class ScheduleJobController {

	
	@Autowired
	private ScheduleJobService scheduleJobService;
	@Autowired
	private Scheduler scheduler;
	
	@GetMapping("/list")
	@ApiOperation("获取定时任务列表:排序入参sort=jobId,DESC@20180203")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query",name="beanName" , value="bean名称", required = false),
		@ApiImplicitParam(paramType = "query",name="methodName" , value="方法名称", required = false),
		@ApiImplicitParam(paramType = "query",name="status" , value="状态", required = false),
		@ApiImplicitParam(paramType = "query",name="page" , value="页数", required = false),
		@ApiImplicitParam(paramType = "query",name="size" , value="每页条数", required = false),
		@ApiImplicitParam(paramType = "query",name="sort" , value="排序", required = false)
	})
	public ResponseEntity<ResultModel> list(@ModelAttribute ScheduleJobEntity scheduleJobEntity, 
				@PageableDefault(page=0,size=10,sort={"jobId"},direction = Sort.Direction.ASC)
				Pageable pageable){
		
		if (scheduleJobEntity == null) {
			Page<ScheduleJobEntity> listAll = scheduleJobService.listAll(pageable);
			return R.ok(listAll);
		}
		Page<ScheduleJobEntity> page = scheduleJobService.listAll(scheduleJobEntity, pageable);
		return R.ok(page);
	}
	
	@GetMapping("/{jobId}")
	@ApiOperation(value = "根据jobId获取任务详情@20180203")
	@ApiImplicitParam(paramType = "path",name="jobId" , value="任务id", required = true)
	public ResponseEntity<ResultModel> getByJobId(@PathVariable Long jobId){
		if (jobId == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("jobId不能为空")));
		}
		ScheduleJobEntity jobEntity = scheduleJobService.getByJobId(jobId);
		return ResponseEntity.ok(ResultModel.ok(jobEntity));
	}
	
	
	//添加一个任务，添加任务首先要保证代码中有这个任务方法
	@PostMapping("/addOrUpdate")
	@ApiOperation("添加或更新一个定时任务,并立即执行@20180203")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query",name="jobId" , value="任务id", required = false),
		@ApiImplicitParam(paramType = "query",name="beanName" , value="bean名称", required = true),
		@ApiImplicitParam(paramType = "query",name="methodName" , value="方法名称", required = true),
		@ApiImplicitParam(paramType = "query",name="cronExpression" , value="cron表达式", required = true),
		@ApiImplicitParam(paramType = "query",name="status" , value="状态", required = false),
		@ApiImplicitParam(paramType = "query",name="remark" , value="备注", required = false)
	})
	public ResponseEntity<ResultModel> addOrUpdate(@ModelAttribute ScheduleJobEntity scheduleJobEntity){
		if (scheduleJobEntity == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("参数不能为空")));
		}
		if (StringUtils.isBlank(scheduleJobEntity.getBeanName())) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("beanName不能为空")));
		}
		if (StringUtils.isBlank(scheduleJobEntity.getMethodName())) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("methodName不能为空")));
		}
		if (StringUtils.isBlank(scheduleJobEntity.getCronExpression())) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("cron表达式不能为空")));
		}
		ScheduleJobEntity jobEntity = scheduleJobService.save(scheduleJobEntity);
		//添加完成并立即启动
		ScheduleUtils.createScheduleJob(scheduler, jobEntity);
		return ResponseEntity.ok(ResultModel.ok());
	}
	
	@PostMapping("/pause")
	@ApiOperation("批量暂停定时任务@20180203")
	public ResponseEntity<ResultModel> pause(@ApiParam("任务id") Long[] jobIds){
		if (jobIds == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("参数不能为空")));
		}
		scheduleJobService.pause(jobIds);
		return ResponseEntity.ok(ResultModel.ok());
	}

	@PostMapping("/delete")
	@ApiOperation("批量删除定时任务@20180203")
	public ResponseEntity<ResultModel> delete(@ApiParam("任务id") Long[] jobIds){
		if (jobIds == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("参数不能为空")));
		}
		scheduleJobService.deleteBatch(jobIds);
		return ResponseEntity.ok(ResultModel.ok());
	}
	
	@PostMapping("/resume")
	@ApiOperation("恢复定时任务@20180203")
	public ResponseEntity<ResultModel> resume(@ApiParam("任务id") Long[] jobIds){
		if (jobIds == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("参数不能为空")));
		}
		scheduleJobService.resume(jobIds);
		return ResponseEntity.ok(ResultModel.ok());
	}
	
	@PostMapping("/run")
	@ApiOperation("立即运行定时任务")
	public ResponseEntity<ResultModel> run(@ApiParam("任务id") Long[] jobIds){
		if (jobIds == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("参数不能为空")));
		}
		scheduleJobService.run(jobIds);
		return ResponseEntity.ok(ResultModel.ok());
	}
	
	
}
