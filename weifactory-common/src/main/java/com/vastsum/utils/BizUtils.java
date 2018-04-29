package com.vastsum.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

/**
 * 业务处理工具类
 * @author shutu008
 *
 */
public class BizUtils {
	
	/**
	 * 处理温湿度值，eg:1~010;1.1~110;12.1~121;0.1~001
	 * @param data
	 * @return String
	 */
	public static String handle3data(String data) {
		String tmp = null;
		if (StringUtils.isBlank(data)) {
			return null;
		}
		int i = data.indexOf(".");
		if (i>0) {
			String[] split = data.split(".");
			Integer a = Integer.parseInt(split[0]);
			tmp = a+split[1];
			tmp = String.format("%03d", Integer.parseInt(tmp));
		}else if (i<0) {
			tmp = String.format("%03d", Integer.parseInt(data));
		}
		return tmp;
	}
	
	/**
	 * 处理指定的时间格式 12:23:46 ～12.23.46 12:23 ～12.23.00
	 * @param data
	 * @return String
	 */
	public static String timeFormat(String data) {
		
		if (StringUtils.isBlank(data)) {
			return null;
		}
		if (data.length() <= 2) {
			return data+"."+"00.00";
		}
		String result = null;
		String[] split = data.split(":");
		for (int i = 0; i<split.length; i++) {
			String str = String.format("%02d", split[i]);
			result = str+".";
		}
		return result.substring(0, result.length()-1);
		
		
	}
	
	/**
	 * 处理指定的日期格式 
	 * @param date
	 * @return String
	 */
	public static String dateFormat(Date date) {
		
		if (date == null) {
			return null;
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		String result = dateFormat.format(date);
		return result;
		
		
	}
	
	//转化适配器，将Java对象字段，转换成对应的数据 
	
	

}
