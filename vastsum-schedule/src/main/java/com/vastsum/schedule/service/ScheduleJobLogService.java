package com.vastsum.schedule.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vastsum.schedule.entity.ScheduleJobLog;

public interface ScheduleJobLogService {

	/**
	 * 保存调度日志（更新或修改，根据主键区分）
	 * @param scheduleJobLog
	 * @return ScheduleJobLog
	 */
	ScheduleJobLog save(ScheduleJobLog scheduleJobLog);
	
	/**
	 * 批量删除调度日志（不要轻易使用）
	 * @param logIds
	 */
	void deleteBatch(Long[] logIds);	
	
	/**
	 * 查看调度日志详情
	 * @param logIds
	 * @return ScheduleJobLog
	 */
	ScheduleJobLog getByLogId(Long logIds);
	
	/**
	 * 查看所有的调度日志信息
	 * @param pageable
	 * @return Page<ScheduleJobLog>
	 */
	Page<ScheduleJobLog> listAll(Pageable pageable);
	
	/**
	 * 单表条件分页查询
	 * @param scheduleJobLog
	 * @param pageable
	 * @return Page<ScheduleJobLog>
	 */
	Page<ScheduleJobLog> listAll(ScheduleJobLog scheduleJobLog, Pageable pageable);
}
