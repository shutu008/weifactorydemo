package com.vastsum.service;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vastsum.WeifactoryApplication;
import com.vastsum.schedule.entity.ScheduleJobEntity;
import com.vastsum.schedule.service.ScheduleJobService;


@SpringBootTest(classes = WeifactoryApplication.class)
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class EntityTest {
	
	@Autowired
	private	ScheduleJobService scheduleJobService;

	@Test
	public void test1() {
		ScheduleJobEntity byJobId = scheduleJobService.getByJobId(1L);
		System.out.println(ReflectionToStringBuilder.toString(byJobId));
	}
	
	@Test
	public void test2() {
		System.out.println("test");

	}
	
}
