package com.vastsum.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
* @Description: 时间处理工具
* @author shensj 
* @date 2018年3月13日 下午10:50:18 
*
 */
public class DateTimeUtils {
	
	private DateTimeUtils(){};
	
	
	/**
	 * 获取一天中的开始时间
	 * @param date
	 * @return Date
	 */
	public static Date getStartTime(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);  
		calendar.set(Calendar.MINUTE, 0);  
		calendar.set(Calendar.SECOND, 0);  
		calendar.set(Calendar.MILLISECOND, 0);  
        return calendar.getTime();
	}
	
	/**
	 * 获取一天中的结束时间
	 * @param date
	 * @return Date
	 */
	public static Date getEndTime(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);  
		calendar.set(Calendar.MINUTE, 59);  
		calendar.set(Calendar.SECOND, 59);  
		calendar.set(Calendar.MILLISECOND, 999);  
        return calendar.getTime();
	}
	
	/**
	 * 获取当前时间的一天开始时间
	 * @returnDate
	 */
	public static Date getNowStartTime(){
		return getStartTime(new Date());
	}
	
	/**
	 * 获取当前时间的结束时间
	 * @return Date
	 */
	public static Date getNowEndTime(){
		return getEndTime(new Date());
	}
	
	/**
	 * 获取当前时间字符串 yyyy-MM-dd HH:mm:ss
	 * @return String
	 */
	public static String nowLocaleDateString() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = dateFormat.format(date);
		return format;
	}

}
