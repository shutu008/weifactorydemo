package com.vastsum.entity;

public class ImageData {

	/**
	 * 设备序列号
	 */
	private String sn;
	
	/**
	 * 采集设备类型
	 */
	private String sensorType;
	
	/**
	 * 图片格式
	 */
	private String picType;
	
	/**
	 * 数据长度
	 */
	private Integer dataLen;
	
	/**
	 * 图片字节
	 */
	private byte[] imageByte;

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public String getPicType() {
		return picType;
	}

	public void setPicType(String picType) {
		this.picType = picType;
	}

	public Integer getDataLen() {
		return dataLen;
	}

	public void setDataLen(Integer dataLen) {
		this.dataLen = dataLen;
	}

	public byte[] getImageByte() {
		return imageByte;
	}

	public void setImageByte(byte[] imageByte) {
		this.imageByte = imageByte;
	}
	
	
	
	
	
	
	
}
