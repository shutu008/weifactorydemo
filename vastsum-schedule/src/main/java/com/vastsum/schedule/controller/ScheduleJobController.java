package com.vastsum.schedule.controller;

import org.apache.commons.lang.StringUtils;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/schedule")
@Api(tags = "定时任务管理")
public class ScheduleJobController {

	
	@Autowired
	private ScheduleJobService scheduleJobService;
	@Autowired
	private Scheduler scheduler;
	
	@PostMapping("/list")
	@ApiOperation("获取定时任务列表@20180420")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query",name="scheduleName" , value="任务名称", required = false),
		@ApiImplicitParam(paramType = "query",name="beanName" , value="bean名称", required = false),
		@ApiImplicitParam(paramType = "query",name="methodName" , value="方法名称", required = false),
		@ApiImplicitParam(paramType = "query",name="status" , value="状态", required = false),
		@ApiImplicitParam(paramType = "query",name="page" , value="页数", required = true),
		@ApiImplicitParam(paramType = "query",name="pageSize" , value="每页条数", required = true)
	})
	public ResponseEntity<ResultModel> list(@ModelAttribute ScheduleJobEntity scheduleJobEntity, 
				Integer page, Integer pageSize){
		return R.ok(scheduleJobService.listAll(scheduleJobEntity, page, pageSize));
	}
	
	@ApiIgnore
	@GetMapping("/jobId/{jobId}")
	@ApiOperation(value = "根据jobId获取任务详情@20180420")
	@ApiImplicitParam(paramType = "path",name="jobId" , value="任务id", required = true)
	public ResponseEntity<ResultModel> getByJobId(@PathVariable Long jobId){
		if (jobId == null) {
			return R.error("jobId不能为空");
		}
		return R.ok(scheduleJobService.getByJobId(jobId));
	}
	
	
	//添加一个任务，添加任务首先要保证代码中有这个任务方法
	@PostMapping("/addOrUpdate")
	@ApiOperation("添加或更新一个定时任务,并立即执行@20180420")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query",name="jobId" , value="任务id", required = false),
		@ApiImplicitParam(paramType = "query",name="scheduleName" , value="任务名称", required = true),
		@ApiImplicitParam(paramType = "query",name="beanName" , value="bean名称", required = true),
		@ApiImplicitParam(paramType = "query",name="methodName" , value="方法名称", required = true),
		@ApiImplicitParam(paramType = "query",name="cronExpression" , value="cron表达式", required = true),
		@ApiImplicitParam(paramType = "query",name="status" , value="状态", required = false),
		@ApiImplicitParam(paramType = "query",name="remark" , value="备注", required = false)
	})
	public ResponseEntity<ResultModel> addOrUpdate(@ModelAttribute ScheduleJobEntity scheduleJobEntity){
		if (scheduleJobEntity == null) {
			return R.error("参数不能为空");
		}
		if (StringUtils.isBlank(scheduleJobEntity.getScheduleName())) {
			return R.error("任务名称不能为空");
		}
		if (StringUtils.isBlank(scheduleJobEntity.getBeanName())) {
			return R.error("beanName不能为空");
		}
		if (StringUtils.isBlank(scheduleJobEntity.getMethodName())) {
			return R.error("methodName不能为空");
		}
		if (StringUtils.isBlank(scheduleJobEntity.getCronExpression())) {
			return R.error("cron表达式不能为空");
		}
		scheduleJobEntity.setStatus("1");//立即执行
		if (scheduleJobEntity.getJobId() == null) {
			ScheduleJobEntity jobEntity = scheduleJobService.save(scheduleJobEntity);
			//添加完成并立即启动
			ScheduleUtils.createScheduleJob(scheduler, jobEntity);
		}else {
			//暂停
			Long[] jobIds = new Long[] {scheduleJobEntity.getJobId()};
			scheduleJobService.pause(jobIds);
			//更新
			scheduleJobService.update(scheduleJobEntity);
			//恢复
			scheduleJobService.resume(jobIds);
		}
		
		return R.ok();
	}
	
	@PostMapping("/option")
	@ApiOperation(value = "批量任务操作@20180420", notes="2:删除；3:暂停；4:恢复")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query",name="scheduleOption" , value="操作", required = true),
	})
	public ResponseEntity<ResultModel> option(@ApiParam("任务id")@RequestParam("jobIds[]") Long[] jobIds
			, Integer scheduleOption){
		if (jobIds == null) {
			return R.error("参数不能为空");
		}
		if (scheduleOption == null) {
			return R.error("操作状态不能为空");
		}
		switch (scheduleOption) {
		case 2:
			scheduleJobService.deleteBatch(jobIds);
			break;
		case 3:
			scheduleJobService.pause(jobIds);
			break;
		case 4:
			scheduleJobService.resume(jobIds);
			break;
		default:
			break;
		}
		return R.ok();
	}
	
	@ApiIgnore
	@PostMapping("/pause")
	@ApiOperation("批量暂停定时任务@20180420")
	public ResponseEntity<ResultModel> pause(@ApiParam("任务id")@RequestParam("jobIds[]") Long[] jobIds){
		if (jobIds == null) {
			return ResponseEntity.ok(ResultModel.error(ResultStatus.defaultOf("参数不能为空")));
		}
		scheduleJobService.pause(jobIds);
		return R.ok();
	}

	@ApiIgnore
	@PostMapping("/delete")
	@ApiOperation("批量删除定时任务@20180420")
	public ResponseEntity<ResultModel> delete(@ApiParam("任务id")@RequestParam("jobIds[]") Long[] jobIds){
		if (jobIds == null) {
			return R.error("参数不能为空");
		}
		scheduleJobService.deleteBatch(jobIds);
		return R.ok();
	}
	
	@ApiIgnore
	@PostMapping("/resume")
	@ApiOperation("恢复定时任务@20180420")
	public ResponseEntity<ResultModel> resume(@ApiParam("任务id")@RequestParam("jobIds[]") Long[] jobIds){
		if (jobIds == null) {
			return R.error("参数不能为空");
		}
		scheduleJobService.resume(jobIds);
		return R.ok();
	}
	
	@ApiIgnore
	@PostMapping("/run")
	@ApiOperation(value = "立即运行定时任务", notes="值为逗号分割的数组")
	public ResponseEntity<ResultModel> run(@ApiParam("任务id")@RequestParam("jobIds[]") Long[] jobIds){
		if (jobIds == null) {
			return R.error("参数不能为空");
		}
		scheduleJobService.run(jobIds);
		return R.ok();
	}
	
	
}
