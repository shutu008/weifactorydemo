package com.vastsum.schedule.dao;

import com.vastsum.schedule.entity.ScheduleJobEntity;
import com.vastsum.schedule.entity.ScheduleJobEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleJobEntityMapper {
    long countByExample(ScheduleJobEntityExample example);

    int deleteByExample(ScheduleJobEntityExample example);

    int deleteByPrimaryKey(Long jobId);

    int insert(ScheduleJobEntity record);

    int insertSelective(ScheduleJobEntity record);

    List<ScheduleJobEntity> selectByExample(ScheduleJobEntityExample example);

    ScheduleJobEntity selectByPrimaryKey(Long jobId);

    int updateByExampleSelective(@Param("record") ScheduleJobEntity record, @Param("example") ScheduleJobEntityExample example);

    int updateByExample(@Param("record") ScheduleJobEntity record, @Param("example") ScheduleJobEntityExample example);

    int updateByPrimaryKeySelective(ScheduleJobEntity record);

    int updateByPrimaryKey(ScheduleJobEntity record);
}