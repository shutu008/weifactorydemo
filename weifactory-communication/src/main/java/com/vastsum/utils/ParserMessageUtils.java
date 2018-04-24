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
			logger.info(hashMap.toString());
		}else {
			logger.info("下发了空参数：hashmap="+null);
		}
		String sn = (String)(hashMap.get("sn"));
		hashMap.forEach((k,v)->{
			try {
				if(!k.equals("sn")) {
					Integer commandNumber = Integer.valueOf(ResourceProperty.getProperty(k));
					CommunicationMessage cm = new CommunicationMessage(sn, 1, commandNumber, (String)v);
					listCM.add(cm);
					System.out.println("编码的指令为："+cm.getMsg());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return listCM;
	}
}
