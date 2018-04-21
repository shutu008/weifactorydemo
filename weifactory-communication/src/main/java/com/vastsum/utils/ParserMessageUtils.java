package com.vastsum.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.vastsum.entity.CommunicationMessage;

public class ParserMessageUtils {
	public static CommunicationMessage parser(String msg) throws IOException {
		// 验证最后一位
		if (msg.charAt(msg.length()) != '$') {
			throw new IOException("协议错误");
		}
		String[] values = msg.split("#");
		CommunicationMessage cm = new CommunicationMessage();
		cm.setProtocolName(values[0]);
		cm.setDataLength(Integer.valueOf(values[1]));
		cm.setFunction(Integer.valueOf(values[2]));
		cm.setOperation(values[3]);
		cm.setData(values[4]);
		cm.setTime(new Date(Long.parseLong(values[5])));
		if(cm.getData().length() != cm.getDataLength()) {
			throw new IOException("协议错误");
		}
		return cm;
	}
	
	public static String encodeMessage(CommunicationMessage cm) {
		StringBuilder sb = new StringBuilder();
		// 数据检验位
		sb.append(cm.getProtocolName()+"#");
		// 数据长度位
		String len = cm.getDataLength().toString();
		while(len.length() < 8) {
			len = '0'+len;
		}
		sb.append(len+"#");
		// 功能标识
		
		String function = cm.getFunction().toString();
		
		while(function.length() < 4) {
			function = '0'+function;
		}
		
		sb.append(function+"#");
		// 字段含义标识
		String operation;
		operation = cm.getOperation();
		sb.append(operation+"#");
		
		// 数据
		sb.append(cm.getData()+"#");
		// 时间戳
		sb.append(cm.getTime().getTime()+"$");
		return sb.toString();
	}
	
	public static ArrayList<CommunicationMessage> encodeHashMap(HashMap<String, Object> hashMap) {
		ArrayList<CommunicationMessage> listCM = new ArrayList<>();
		hashMap.forEach((k,v)->{
			try {
				CommunicationMessage cm = new CommunicationMessage();
				// 数据检验位
				cm.setProtocolName("ZWGC");
				// 数据和长度位
				String data = v.toString();
				cm.setData(data);
				cm.setDataLength(data.length());
				// 功能标识
				cm.setFunction(1);
				// 字段含义标识
				String commandNumber = ProtocolUtils.getCommandNumber(k);
				while(commandNumber.length() < 4) {
					commandNumber = "0"+commandNumber;
				}
				cm.setOperation(commandNumber);
				// 时间戳
				cm.setTime(new Date());
				
				listCM.add(cm);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		return listCM;
	}
}
