package com.vastsum.schedule.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vastsum.schedule.entity.ScheduleJobLog;

public interface ScheduleJobLogRepository extends JpaRepository<ScheduleJobLog, Long>
												,JpaSpecificationExecutor<ScheduleJobLog>  {

}
