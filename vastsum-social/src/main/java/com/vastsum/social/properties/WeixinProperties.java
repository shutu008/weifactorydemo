package com.vastsum.social.properties;

import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * 标识微信登录，注意这里继承的抽象类
 * @author shutu008
 *
 */
public class WeixinProperties extends SocialProperties {
	

	/**
	 * 第三方id，用来决定发起第三方登陆的url,默认是微信
	 */
	private String providerId = "weixin";

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	
	

}
