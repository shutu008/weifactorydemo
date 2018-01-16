package com.vastsum.schedule.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vastsum.schedule.entity.ScheduleJobEntity;

/**
 * 定时任务查询
 * @author shutu008
 *
 */
public interface ScheduleJobEntityRepository extends JpaRepository<ScheduleJobEntity, Long>,JpaSpecificationExecutor<ScheduleJobEntity>{

	ScheduleJobEntity findByJobId(Long jobId);
	
}
