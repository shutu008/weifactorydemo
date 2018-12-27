package com.vastsum.enums;

/**
 * 机器从上到下为第一层第二层第三层
* @author shensj
* @date 2018年4月1日 上午8:34:11
 */
public enum ImageSensorEnum {
	
	IMAGE_ONE("POO1"),
	IMAGE_TWO("POO2"),
	IMAGE_THREE("P003");

	private String code;

	private ImageSensorEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
