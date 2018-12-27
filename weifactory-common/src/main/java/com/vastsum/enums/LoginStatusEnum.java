package com.vastsum.enums;


/**
 * 登陆状态
* @author shensj
* @date 2018年3月26日 下午8:48:53
 */
public enum LoginStatusEnum {
	
	//在线
	ONLINE("1"),
	
	//退出
	LOGOUT("0"),
	
	
	//专家正在审核
	AUDIT("2");
	
	private String loginStatus;

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	private LoginStatusEnum(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	

}
