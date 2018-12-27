package com.vastsum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	
	
	public void test2(String a, String b){
		String c=null;
		c = a;
		a = b;
		b = c;
	}
	
	@Test
	public void test3(){
		String a = "a_1";
		String b = "b_2";
		test2(a, b);
		System.out.println(a+b);
	}

}
