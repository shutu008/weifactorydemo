package com.vastsum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DemoTest {
	
	
	@Test
	public void test1(){
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String format = dateFormat.format(date);
		System.out.println(format);
	}

}
