package com.vastsum.entity;

import java.io.Serializable;
import java.util.Date;

public class DataEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 455814579362510975L;

	private String mark = "ZWGC";
	
	/**
	 * 数据长度
	 */
	private Integer dataLen;
	
	/**
	 * 模块标识
	 */
	private String moduleType;
	
	/**
	 * 基本标识
	 */
	private String sensorType;
	/**
	 * 数据
	 */
	private byte[] data;
	/**
	 * 植物工厂时间
	 */
	private Date date;
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public Integer getDataLen() {
		return dataLen;
	}
	public void setDataLen(Integer dataLen) {
		this.dataLen = dataLen;
	}
	public String getModuleType() {
		return moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}
	public String getSensorType() {
		return sensorType;
	}
	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
