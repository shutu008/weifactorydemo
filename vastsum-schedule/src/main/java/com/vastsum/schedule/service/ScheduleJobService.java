package com.vastsum.schedule.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vastsum.schedule.entity.ScheduleJobEntity;

/**
 * 定时任务管理
 * @author shutu008
 *
 */
public interface ScheduleJobService {
	
	/**
	 * 根据任务id查询任务信息
	 * @param jobId
	 * @return ScheduleJobEntity
	 */
	ScheduleJobEntity getByJobId(Long jobId);
		
	/**
	 * 更新一组任务状态
	 * @param list
	 * @return ScheduleJobEntity
	 */
	List<ScheduleJobEntity> updateBatch(List<ScheduleJobEntity> list);
	
	/**
	 * 保存 一个定时任务
	 * @param scheduleJobEntity
	 * @return ScheduleJobEntity
	 */
	ScheduleJobEntity save(ScheduleJobEntity scheduleJobEntity);
	
	/**
	 * 删除一组定时任务
	 * @param jobIds
	 */
	void deleteBatch(Long[] jobIds); 
	
	/**
	 * 批量更新定时任务状态
	 */
	List<ScheduleJobEntity> updateBatch(Long[] jobIds, String status);
	
	/**
	 * 立即执行
	 * @param jobIds
	 */
	void run(Long[] jobIds);
	
	/**
	 * 暂停运行
	 * @param jobIds
	 */
	void pause(Long[] jobIds);
	
	/**
	 * 恢复运行
	 * @param jobIds
	 */
	void resume(Long[] jobIds);
	
	/**
	 * 根据条件列出所有的调度任务
	 * @param scheduleJobEntity
	 * @param pageable
	 * @return Pageable
	 */
	Page<ScheduleJobEntity> listAll(ScheduleJobEntity scheduleJobEntity, Pageable pageable);
	
	/**
	 * 分页列出所有的定时任务
	 * @param pageable
	 * @return Page<ScheduleJobEntity>
	 */
	Page<ScheduleJobEntity> listAll(Pageable pageable);
	
	
	

}
