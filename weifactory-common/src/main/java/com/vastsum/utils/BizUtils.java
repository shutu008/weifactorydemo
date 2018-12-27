package com.vastsum.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.bytebuddy.asm.Advice.This;

/**
 * 业务处理工具类
 * @author shutu008
 *
 */
public class BizUtils {
	
	private static Logger logger = LoggerFactory.getLogger(BizUtils.class);
	
	/**
	 * 处理温湿度值，eg:1~010;1.1~110;12.1~121;0.1~001
	 * @param data
	 * @return String
	 */
	public static String handle3data(String data) {
		logger.info("原始数据："+data);
		String tmp = null;
		if (StringUtils.isBlank(data)) {
			return null;
		}
		int i = data.indexOf(".");
		if (i>0) {
			String[] split = data.split("\\.");
			Integer a = Integer.parseInt(split[0]);
			tmp = a+split[1];
			tmp = String.format("%03d", Integer.parseInt(tmp));
		}else if (i<0) {
			tmp = String.format("%03d", Integer.parseInt(data)*10);
		}
		logger.info("处理过的数据："+data);
		return tmp;
	}
	
	/**
	 * 处理指定的时间格式 12:23:46 ～12.23.46 12:23 ～12.23.00
	 * @param data
	 * @return String
	 */
	public static String timeFormat(String data) {
		logger.info("原始数据："+data);
		if (StringUtils.isBlank(data)) {
			return null;
		}
		if (data.length() <= 2) {
			return data+"."+"00.00";
		}
		StringBuffer sb = new StringBuffer();
		
		String[] split = data.split(":");
		for (int i = 0; i<split.length; i++) {
			String  str= String.format("%02d", Integer.parseInt(split[i]));
			sb.append(str+".");
		}
		String result = sb.toString();
		logger.info("处理过的数据："+data);
		return result.substring(0, result.length()-1);
		
	}
	
	/**
	 * 处理指定的日期格式 
	 * @param date
	 * @return String
	 */
	public static String dateFormat(Date date) {
		logger.info("原始数据："+date);
		if (date == null) {
			return null;
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		String result = dateFormat.format(date);
		logger.info("处理过的数据："+date);
		return result;
		
		
	}
	
	/**
	 * 解析数据为正常数据 320 ～32.0
	 * @param data
	 * @return Double
	 */
	public static Double parseData(String data) {
		if (StringUtils.isBlank(data) || data.length() !=3) {
			return 0.0;
		}
		String num = data.substring(0, 2);
		String smaill = data.substring(2);
		Double result = Double.parseDouble(num+"."+smaill);
		return result;
	}
	
	public static void main(String[] args) {
		String timeFormat = timeFormat("12:23:46");
		System.out.println(timeFormat);
	}
	
	
	

}
