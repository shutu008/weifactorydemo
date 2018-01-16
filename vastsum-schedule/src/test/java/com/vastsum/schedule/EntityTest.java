package com.vastsum.schedule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vastsum.schedule.service.ScheduleJobService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EntityTest {
	
	@Autowired
	private	ScheduleJobService scheduleJobService;

	@Test
	private void test() {
		scheduleJobService.getByJobId(1L);
	}
	
}
