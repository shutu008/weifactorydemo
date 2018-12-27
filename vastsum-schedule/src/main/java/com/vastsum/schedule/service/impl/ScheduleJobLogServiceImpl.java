package com.vastsum.schedule.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.schedule.dao.ScheduleJobLogMapper;
import com.vastsum.schedule.entity.ScheduleJobLog;
import com.vastsum.schedule.entity.ScheduleJobLogExample;
import com.vastsum.schedule.entity.ScheduleJobLogExample.Criteria;
import com.vastsum.schedule.service.ScheduleJobLogService;

@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl implements ScheduleJobLogService {
	
	@Autowired
	private ScheduleJobLogMapper scheduleJobLogMapper;

	@Override
	public void save(ScheduleJobLog scheduleJobLog) {
		 scheduleJobLogMapper.insert(scheduleJobLog);
	}

	//批量删除定时任务日志
	@Override
	public void deleteBatch(Long[] logIds) {
		for (Long logId : logIds) {
			scheduleJobLogMapper.deleteByPrimaryKey(logId);
		}
	}

	@Override
	public ScheduleJobLog getByLogId(Long logIds) {
		return scheduleJobLogMapper.selectByPrimaryKey(logIds);
	}

	@Override
	public PageInfo<ScheduleJobLog> listAll(ScheduleJobLog scheduleJobLog, Integer page, Integer pageSize) {
		ScheduleJobLogExample scheduleJobLogExample = new ScheduleJobLogExample();
		Criteria criteria = scheduleJobLogExample.createCriteria();
		if (scheduleJobLog != null) {
			if (StringUtils.isNotBlank(scheduleJobLog.getBeanName())) {
				criteria.andBeanNameLike("%"+scheduleJobLog.getBeanName()+"%");
			}
			if (StringUtils.isNotBlank(scheduleJobLog.getMethodName())) {
				criteria.andMethodNameLike("%"+scheduleJobLog.getMethodName()+"%");
			}
			if (StringUtils.isNotBlank(scheduleJobLog.getStatus())) {
				criteria.andStatusEqualTo(scheduleJobLog.getStatus());
			}
			if (StringUtils.isNotBlank(scheduleJobLog.getScheduleName())) {
				criteria.andScheduleNameLike("%"+scheduleJobLog.getScheduleName()+"%");
			}
		}
		
		//查询条件
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        PageHelper.startPage(page,pageSize);
		List<ScheduleJobLog> list = scheduleJobLogMapper.selectByExample(scheduleJobLogExample);
		return new PageInfo<>(list);
		
	}

	
}
