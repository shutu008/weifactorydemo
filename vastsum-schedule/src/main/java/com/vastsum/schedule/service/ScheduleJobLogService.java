package com.vastsum.schedule.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.schedule.entity.ScheduleJobLog;

public interface ScheduleJobLogService {

	/**
	 * 保存调度日志（更新或修改，根据主键区分）
	 * @param scheduleJobLog
	 * @return ScheduleJobLog
	 */
	void save(ScheduleJobLog scheduleJobLog);
	
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
	 * 单表条件分页查询
	 * @param scheduleJobLog
	 * @param page
	 * @param pageSize
	 * @return PageInfo<ScheduleJobLog>
	 */
	PageInfo<ScheduleJobLog> listAll(ScheduleJobLog scheduleJobLog, Integer page, Integer pageSize);
}
