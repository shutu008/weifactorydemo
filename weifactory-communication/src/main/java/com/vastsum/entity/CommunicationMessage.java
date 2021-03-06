package com.vastsum.entity;

import java.util.Date;

public class CommunicationMessage {
	private String msg = null;
	private String protocolName;
	private Integer dataLength;
	private Integer model;
	private Integer function;
	private String data;
	private Date time;
	private String sn;
	private String parserResult="解析成功";
	
	public CommunicationMessage() {
		
	}
	
	/**
	 * 用
	 * @param msg
	 */
	public CommunicationMessage(String sn, String msg) {
		this.setMsg(msg);
		this.sn = sn;
		String submsg = msg.substring(1);
		System.out.println(submsg);
		String[] values = submsg.split("#");
		this.setProtocolName(values[0]);
		this.dataLength = Integer.valueOf(values[1]);
		
		this.setModel(Integer.valueOf(values[2]));
		this.setFunction(Integer.valueOf(values[3]));
		this.data = values[4];
		this.setTime(new Date(Long.parseLong(values[5])));
		System.out.println("数据长度："+this.dataLength+"操作模块："+this.model+"函数："+this.function+"数据："+this.data);
		if(this.data.length() != this.dataLength) {
			this.setParserResult("格式错误，数据长度不一致");
			return;
		}
	}
	
	/**
	 * 此构造器，sn即为data部分
	 * @param msg
	 */
	public CommunicationMessage(String msg) {
		this.setMsg(msg);
		String submsg = msg.substring(1);
		System.out.println(submsg);
		String[] values = submsg.split("#");
		this.setProtocolName(values[0]);
		this.dataLength = Integer.valueOf(values[1]);
		this.setModel(Integer.valueOf(values[2]));
		this.setFunction(Integer.valueOf(values[3]));
		this.data = values[4];
		this.sn = data;
		this.setTime(new Date(Long.parseLong(values[5])));
		System.out.println("数据长度："+this.dataLength+"操作模块："+this.model+"函数："+this.function+"数据："+this.data);
		if(this.data.length() != this.dataLength) {
			this.setParserResult("格式错误，数据长度不一致");
			return;
		}
	}
	
	private String getMessage() {
		StringBuilder sb = new StringBuilder("#");
		// 数据检验位
		sb.append(protocolName+"#");
		// 数据长度位
		sb.append(String.format("%08d", dataLength)+"#");
		// 模块
		sb.append(String.format("%04d", model)+"#");
		// 功能
		sb.append(String.format("%03d", function)+"#");
		// 数据
		sb.append(data+"#");
		// 时间戳
		sb.append(time.getTime()+"$");
		return sb.toString();
	}
	
	public Boolean isFirstConnect() {
		return (model == 5 && function == 1);
	}
	
	public Boolean parserOk() {
		return parserResult.equals("解析成功");
	}
	
	public CommunicationMessage(String sn, Integer model,Integer function, String data) {
		this.sn = sn;
		this.protocolName = "ZWGC";
		this.dataLength = data.length();
		this.model = model;
		this.function = function;
		this.data = data;
		this.time = new Date();
		this.setMsg(getMessage());
	}

	public String getProtocolName() {
		return protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public Integer getFunction() {
		return function;
	}

	public void setFunction(Integer function) {
		this.function = function;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getParserResult() {
		return parserResult;
	}

	public void setParserResult(String parserResult) {
		this.parserResult = parserResult;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
