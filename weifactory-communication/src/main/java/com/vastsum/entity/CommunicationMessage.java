package com.vastsum.entity;

import java.util.Date;

public class CommunicationMessage {
	private String protocolName;
	private Integer dataLength;
	private Integer function;
	private String operation;
	private String data;
	private Date time;
	public String getProtocolName() {
		return protocolName;
	}
	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}
	public Integer getDataLength() {
		return dataLength;
	}
	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}
	public Integer getFunction() {
		return function;
	}
	public void setFunction(Integer function) {
		this.function = function;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
