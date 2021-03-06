package com.vastsum.utils;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vastsum.entity.CommunicationMessage;

public class ParserMessageUtils {
	
	private static Logger logger = LoggerFactory.getLogger(ParserMessageUtils.class);
	
	public static ArrayList<CommunicationMessage> encodeHashMap(HashMap<String, Object> hashMap) {
		ArrayList<CommunicationMessage> listCM = new ArrayList<>();
		
		if (hashMap != null) {
			logger.info("准备下发的初始数据："+hashMap.toString());
		}else {
			logger.info("下发了空参数：hashmap="+null);
		}
		String sn = (String)(hashMap.get("sn"));
		hashMap.forEach((k,v)->{
			try {
				if(!"sn".equals(k) && k != null) {
					if (k.length() != 8) {
						logger.info("指令集中有不符合要求的数据,数据为："+k);
						return;
					}
					Integer commandNumber = Integer.valueOf(k.substring(5));//k为8位，后三位为命令号
					CommunicationMessage cm = new CommunicationMessage(sn, Integer.valueOf(k.substring(1, 5)), commandNumber, v.toString());
					listCM.add(cm);
					logger.info("编码的指令为："+cm.getMsg());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return listCM;
	}
	
//	public static void main(String[] args) {
//		Integer aInteger = 12;
//		Double float1 = 12.3;
//		System.out.println(aInteger.toString());
//		System.out.println(float1.toString());
//	}
}
