package com.vastsum.schedule.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.schedule.dao.ScheduleJobEntityMapper;
import com.vastsum.schedule.entity.ScheduleJobEntity;
import com.vastsum.schedule.entity.ScheduleJobEntityExample;
import com.vastsum.schedule.entity.ScheduleJobEntityExample.Criteria;
import com.vastsum.schedule.service.ScheduleJobService;
import com.vastsum.schedule.utils.ScheduleUtils;


@Service
public class ScheduleJobServiceImpl implements ScheduleJobService {
	
	@Autowired
	private Scheduler scheduler;

	@Autowired
	private ScheduleJobEntityMapper scheduleJobEntityMapper;
	
	@Override
	public ScheduleJobEntity getByJobId(Long jobId) {
		return scheduleJobEntityMapper.selectByPrimaryKey(jobId);
	}
	
	
	//批量更新
	@Override
	public void updateBatch(List<ScheduleJobEntity> list) {
		for (ScheduleJobEntity scheduleJobEntity : list) {
			scheduleJobEntityMapper.updateByPrimaryKeySelective(scheduleJobEntity);
		}
	}

	@Override
	public  ScheduleJobEntity save(ScheduleJobEntity scheduleJobEntity) {
		int i = scheduleJobEntityMapper.insertSelective(scheduleJobEntity);
		return scheduleJobEntity;
	}

	//批量删除
	@Override
	public void deleteBatch(Long[] jobIds) {
		for (Long id : jobIds) {
			ScheduleUtils.deleteScheduleJob(scheduler, id);
			scheduleJobEntityMapper.deleteByPrimaryKey(id);
		}
		
		
	}

	@Override
	public void updateBatch(Long[] jobIds, String status) {
		for (Long long1 : jobIds) {
			ScheduleJobEntity scheduleJobEntity = new ScheduleJobEntity();
			scheduleJobEntity.setJobId(long1);
			scheduleJobEntity.setStatus(status);
			scheduleJobEntityMapper.updateByPrimaryKeySelective(scheduleJobEntity);
		}
	}

	//运行
	@Override
	public void run(Long[] jobIds) {
		Arrays.asList(jobIds).stream().forEach(jobId -> ScheduleUtils.run(scheduler, getByJobId(jobId)));
	}

	//暂停
	@Override
	public void pause(Long[] jobIds) {
		Arrays.asList(jobIds).stream().forEach(jobId -> ScheduleUtils.pauseJob(scheduler, jobId));
	}

	//恢复
	@Override
	public void resume(Long[] jobIds) {
		Arrays.asList(jobIds).stream().forEach(jobId -> ScheduleUtils.resumeJob(scheduler, jobId));
	}



	//条件搜索定时任务
	@Override
	public PageInfo<ScheduleJobEntity> listAll(ScheduleJobEntity scheduleJobEntity, Integer page, Integer pageSize) {
		ScheduleJobEntityExample scheduleJobEntityExample = new ScheduleJobEntityExample();
		scheduleJobEntityExample.setOrderByClause("gmt_create desc");
		Criteria criteria = scheduleJobEntityExample.createCriteria();
		if (scheduleJobEntity != null) {
			if (StringUtils.isNotBlank(scheduleJobEntity.getBeanName())) {
				criteria.andBeanNameLike(scheduleJobEntity.getBeanName());
			}
			if (StringUtils.isNotBlank(scheduleJobEntity.getMethodName())) {
				criteria.andMethodNameLike(scheduleJobEntity.getMethodName());
			}
			if (StringUtils.isNotBlank(scheduleJobEntity.getStatus())) {
				criteria.andStatusEqualTo(scheduleJobEntity.getStatus());
			}
			if (StringUtils.isNotBlank(scheduleJobEntity.getScheduleName())) {
				criteria.andScheduleNameLike(scheduleJobEntity.getScheduleName());
			}
		}
		//查询条件
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
		List<ScheduleJobEntity> list = scheduleJobEntityMapper.selectByExample(scheduleJobEntityExample);
		return new PageInfo<>(list);
	}


}
