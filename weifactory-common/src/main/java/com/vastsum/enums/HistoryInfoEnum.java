package com.vastsum.enums;


/**
 * 定义历史数据字段与参数对应
* @author shensj
* @date 2018年3月15日 下午8:17:37
 */
public enum HistoryInfoEnum {
	
	ONE_TEMPERATURE(11,"第一层温度"),
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
	
	private int code;
	
	private String name;

	private HistoryInfoEnum(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
