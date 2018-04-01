package com.vastsum.utils;

import com.vastsum.entity.HistoryInfo;
import com.vastsum.entity.HistoryMessage;
import com.vastsum.enums.HistoryInfoEnum;

/**
 * 历史数据通信协议解析工具
* @author shensj
* @date 2018年3月28日 下午9:12:20
 */
public class HistoryMessageUtils {
	
	private HistoryMessageUtils(){};
	
	public static HistoryMessage getHistoryMessage(String message){
		if(message == null || message.length() != 40){
			return null;
		}
		String historyNo = message.substring(0, 15);
		String sn = message.substring(15, 32);
		String sensorNo = message.substring(32,34);
		String data = message.substring(34, 40);
		HistoryMessage historyMessage = new HistoryMessage();
		historyMessage.setHistoryNo(historyNo);
		historyMessage.setSn(sn);
		historyMessage.setSensorNo(sensorNo);
		historyMessage.setData(data);
		return historyMessage;
	}
	
	
	/**
	 * ONE_TEMPERATURE(11,"第一层温度"),
	ONE_HUMIDITY(12,"第一层湿度"),
	ONE_YY(13,"第一层营养液"),
	ONE_LED1(14,"第一层LED1"),
	ONE_LED2(15,"第一层LED2"),
	ONE_LED3(16,"第一层LED3"),
	ONE_IMAGE(17,"第一层图片"),
	TWO_TEMPERATURE(21,"第二层温度"),
	TWO_HUMIDITY(22,"第二层湿度"),
	TWO_YY(23,"第二层营养液"),
	TWO_LED1(24,"第二层LED1"),
	TWO_LED2(25,"第二层LED2"),
	TWO_LED3(26,"第二层LED3"),
	TWO_IMAGE(27,"第二层图片"),
	THREE_TEMPERATURE(31,"第三层温度"),
	THREE_HUMIDITY(32,"第三层湿度"),
	THREE_YY(33,"第三层营养液"),
	THREE_LED1(34,"第三层LED1"),
	THREE_LED2(35,"第三层LED2"),
	THREE_LED3(36,"第三层LED3"),
	THREE_IMAGE(37,"第三层图片");
	 * @param message
	 * @return
	 */
	public static HistoryInfo getHistoryInfo(String message){
		HistoryMessage historyMessage = getHistoryMessage(message);
		HistoryInfo historyInfo = new HistoryInfo();
		historyInfo.setHistoryNo(historyMessage.getHistoryNo());
		historyInfo.setSn(historyMessage.getSn());
		int sNo = Integer.parseInt(historyMessage.getSensorNo());
		String data = historyMessage.getData().toString();
		switch (sNo) {
		case 11:
			historyInfo.setOneTemperature(data);
			break;
		case 12:
			historyInfo.setOneHumidity(data);
			break;	
		case 13:
			historyInfo.setOneYy(data);
			break;
		case 14:
			historyInfo.setOneLed1(data);
			break;
		case 15:
			historyInfo.setOneLed2(data);
			break;
		case 16:
			historyInfo.setOneLed3(data);
			break;
		case 21:
			historyInfo.setTwoTemperature(data);
			break;
		case 22:
			historyInfo.setTwoHumidity(data);
			break;
		case 23:
			historyInfo.setTwoYy(data);
			break;
		case 24:
			historyInfo.setTwoLed1(data);
			break;
		case 25:
			historyInfo.setTwoLed2(data);
			break;
		case 26:
			historyInfo.setTwoLed3(data);
			break;
		case 31:
			historyInfo.setThreeTemperature(data);
			break;
		case 32:
			historyInfo.setThreeHumidity(data);
			break;
		case 33:
			historyInfo.setThreeYy(data);
			break;
		case 34:
			historyInfo.setThreeLed1(data);
			break;
		case 35:
			historyInfo.setThreeLed2(data);
			break;
		case 36:
			historyInfo.setThreeLed3(data);
			break;
		default:
			break;
		}
		return historyInfo;
	}

}
