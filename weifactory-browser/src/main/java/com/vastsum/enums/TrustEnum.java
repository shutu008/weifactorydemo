package com.vastsum.enums;

/**
 * 托管类型
* @author shensj
* @date 2018年3月26日 下午9:05:17
 */
public enum TrustEnum {

	//没被托管
	NOT_TRUST("0"),
	
	//托管给服务器
	SERVER("1"),
	
	//托管给专家
	EXPERT("2");
	
	private String status;


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	TrustEnum(String status) {
		this.status = status;
	}
	
	
}
