package com.vastsum.schedule.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.criteria.Predicate;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.vastsum.schedule.dao.ScheduleJobLogRepository;
import com.vastsum.schedule.entity.ScheduleJobLog;
import com.vastsum.schedule.service.ScheduleJobLogService;

@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl implements ScheduleJobLogService {
	
	@Autowired
	private ScheduleJobLogRepository scheduleJobLogRepository;

	@Override
	public ScheduleJobLog save(ScheduleJobLog scheduleJobLog) {
		
		return scheduleJobLogRepository.save(scheduleJobLog);
	}

	//批量删除
	@Override
	public void deleteBatch(Long[] logIds) {
		
		scheduleJobLogRepository.delete(
				Arrays.asList(logIds).stream().map(logId -> {
					ScheduleJobLog s = new ScheduleJobLog();
					s.setLogId(logId);
					return s;
					}).collect(Collectors.toList()));
	}

	@Override
	public ScheduleJobLog getByLogId(Long logId) {
		return scheduleJobLogRepository.findOne(logId);
	}

	@Override
	public Page<ScheduleJobLog> listAll(Pageable pageable) {
		return scheduleJobLogRepository.findAll(pageable);
	}

	//添加查询
	@Override
	public Page<ScheduleJobLog> listAll(ScheduleJobLog scheduleJobLog, Pageable pageable) {
		Specification<ScheduleJobLog> specification =
				(root, query,criteriaBuilder)->{
					List<Predicate> predicates = new ArrayList<>();
					if (StringUtils.isNotBlank(scheduleJobLog.getBeanName())) {						
						String beanName = scheduleJobLog.getBeanName();
						predicates.add(criteriaBuilder.like(root.get("beanName"), "%"+beanName+"%"));
					}
					if (StringUtils.isNotBlank(scheduleJobLog.getMethodName())) {
						String methodName = scheduleJobLog.getMethodName();
						predicates.add(criteriaBuilder.like(root.get("methodName"), "%"+methodName+"%"));
					}
					if (StringUtils.isNotBlank(scheduleJobLog.getStatus())) {
						String status = scheduleJobLog.getStatus();
						predicates.add(criteriaBuilder.equal(root.get("status"), status));
					}
					return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
 					
				};

		Page<ScheduleJobLog> page = scheduleJobLogRepository.findAll(specification, pageable);
		return page;
	}

}
