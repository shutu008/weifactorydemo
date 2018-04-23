package com.vastsum.utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.vastsum.entity.CommunicationMessage;

public class ParserMessageUtils {
	
	public static ArrayList<CommunicationMessage> encodeHashMap(HashMap<String, Object> hashMap) {
		ArrayList<CommunicationMessage> listCM = new ArrayList<>();
		String sn = (String)(hashMap.get("sn"));
		hashMap.forEach((k,v)->{
			try {
				if(!k.equals("sn")) {
				Integer commandNumber = Integer.valueOf(ResourceProperty.getProperty(k));
				listCM.add(new CommunicationMessage(sn, 1, commandNumber, (String)v));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return listCM;
	}
}
