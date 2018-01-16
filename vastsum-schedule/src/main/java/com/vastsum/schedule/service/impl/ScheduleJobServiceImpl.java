package com.vastsum.schedule.service.impl;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.Predicate;

import org.apache.commons.lang.StringUtils;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.vastsum.schedule.dao.ScheduleJobEntityRepository;
import com.vastsum.schedule.entity.ScheduleJobEntity;
import com.vastsum.schedule.service.ScheduleJobService;
import com.vastsum.schedule.utils.ScheduleUtils;


@Service
public class ScheduleJobServiceImpl implements ScheduleJobService {
	
	@Autowired
	private Scheduler scheduler;

	@Autowired
	private ScheduleJobEntityRepository scheduleJobEntityRepository;
	
	@Override
	public ScheduleJobEntity getByJobId(Long jobId) {
		return scheduleJobEntityRepository.findByJobId(jobId);
	}
	
	

	@Override
	public List<ScheduleJobEntity> updateBatch(List<ScheduleJobEntity> list) {
		List<ScheduleJobEntity> scheduleJobEntities = scheduleJobEntityRepository.save(list);
		return scheduleJobEntities;
	}

	@Override
	public ScheduleJobEntity save(ScheduleJobEntity scheduleJobEntity) {
		ScheduleJobEntity jobEntity = scheduleJobEntityRepository.save(scheduleJobEntity);
		return jobEntity;
	}

	@Override
	public void deleteBatch(Long[] jobIds) {
		List<Long> asList = Arrays.asList(jobIds);
		List<ScheduleJobEntity> list = asList.stream().map(s -> {
			ScheduleJobEntity entity = new ScheduleJobEntity();
			entity.setJobId(s);
			return entity;
		}).collect(toList());
		//先删除任务再删除数据库
		Arrays.asList(jobIds).stream().forEach(jobId -> ScheduleUtils.deleteScheduleJob(scheduler, jobId));
		scheduleJobEntityRepository.delete(list);
		
		
	}

	@Override
	public List<ScheduleJobEntity> updateBatch(Long[] jobIds, String status) {
		List<ScheduleJobEntity> list = Arrays.asList(jobIds).stream().map(s -> {
			ScheduleJobEntity entity = new ScheduleJobEntity();
			entity.setStatus(status);
			entity.setJobId(s);
			return entity;
		}).collect(toList());
		List<ScheduleJobEntity> save = scheduleJobEntityRepository.save(list);
		return save;
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



	@Override
	public Page<ScheduleJobEntity> listAll(ScheduleJobEntity scheduleJobEntity, Pageable pageable) {
		Specification<ScheduleJobEntity> specification =
				(root, query,criteriaBuilder)->{
					List<Predicate> predicates = new ArrayList<>();
					if (StringUtils.isNotBlank(scheduleJobEntity.getBeanName())) {						
						String beanName = scheduleJobEntity.getBeanName();
						predicates.add(criteriaBuilder.like(root.get("beanName"), "%"+beanName+"%"));
					}
					if (StringUtils.isNotBlank(scheduleJobEntity.getMethodName())) {
						String methodName = scheduleJobEntity.getMethodName();
						predicates.add(criteriaBuilder.like(root.get("methodName"), "%"+methodName+"%"));
					}
					if (StringUtils.isNotBlank(scheduleJobEntity.getStatus())) {
						String status = scheduleJobEntity.getStatus();
						predicates.add(criteriaBuilder.equal(root.get("status"), status));
					}
					return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
 					
				};

		Page<ScheduleJobEntity> page = scheduleJobEntityRepository.findAll(specification, pageable);
		return page;
	}



	@Override
	public Page<ScheduleJobEntity> listAll(Pageable pageable) {
		Page<ScheduleJobEntity> page = scheduleJobEntityRepository.findAll(pageable);
		return page;
	}

}
