package com.vastsum.utils;

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
	

}
