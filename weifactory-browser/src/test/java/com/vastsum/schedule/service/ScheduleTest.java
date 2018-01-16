package com.vastsum.schedule.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vastsum.WeifactoryApplication;
import com.vastsum.core.utils.SpringContextUtils;
import com.vastsum.schedule.entity.ScheduleJobEntity;
import com.vastsum.schedule.utils.ScheduleUtils;

@SpringBootTest(classes = WeifactoryApplication.class)
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class ScheduleTest {
	
	
	@Autowired
	private	ScheduleJobService scheduleJobService;
	
	@Autowired
	private Scheduler scheduler;
	
	@Test
	public void test1() {
		ScheduleJobEntity scheduleJobEntity = new ScheduleJobEntity();
		scheduleJobEntity.setBeanName("ceshi");
		scheduleJobEntity.setCronExpression("* * * *");
		scheduleJobEntity.setGmtCreate(new Date());
		scheduleJobEntity.setMethodName("方法ming");
		scheduleJobEntity.setParams("avc");
		scheduleJobEntity.setStatus("1");
		scheduleJobService.save(scheduleJobEntity);
	}
	
	@Test
	public void test2(){
		
		ScheduleJobEntity scheduleJobEntity = scheduleJobService.getByJobId(1L);
		//scheduleJobEntity.setJobId(2L);
		//ScheduleUtils.createScheduleJob(scheduler, scheduleJobEntity);
		ScheduleUtils.run(scheduler, scheduleJobEntity);
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
