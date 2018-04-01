package com.vastsum.entity;

import com.vastsum.enums.HistoryInfoEnum;

/**
 * 基础消息，历史数据信息
 * 通信协议：历史数据标识位数15个字节（时间戳+两位），sn:17个字节，sensorNo: 2位 传感器标识（@see {@link HistoryInfoEnum}）data,8个字节
* @author shensj
* @date 2018年3月28日 下午8:46:09
 */
public class HistoryMessage {
	
	private String historyNo;
	
	private String sn;
	
	private String sensorNo;
	
	private Object data;

	public String getHistoryNo() {
		return historyNo;
	}

	public void setHistoryNo(String historyNo) {
		this.historyNo = historyNo;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getSensorNo() {
		return sensorNo;
	}

	public void setSensorNo(String sensorNo) {
		this.sensorNo = sensorNo;
	}
	
	

}
