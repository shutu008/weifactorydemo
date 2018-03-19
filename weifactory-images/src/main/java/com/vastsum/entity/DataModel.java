package com.vastsum.entity;

public class DataModel {
	
	//#ZWGC2017100800003#M001#JPG#99999999#.......#
	/**
	 * 设备序列号
	 */
	private String sn;
	/**
	 * 模块名称
	 */
	private String module;
	/**
	 * 文件名后缀
	 */
	private String suffix;
	/**
	 * 数据长度
	 */
	private Integer dataLen;
	/**
	 * 数据内容
	 */
	private byte[] data;

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Integer getDataLen() {
		return dataLen;
	}

	public void setDataLen(Integer dataLen) {
		this.dataLen = dataLen;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
