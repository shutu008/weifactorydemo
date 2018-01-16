package com.vastsum.social.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="com.vastsum.social")
public class SocialProperties {

	
	private String filterProcessesUrl = "/auth";
	
	private WeixinProperties weixin = new WeixinProperties();
	private AlipayProperties alipay = new AlipayProperties();

	public String getFilterProcessesUrl() {
		return filterProcessesUrl;
	}

	public void setFilterProcessesUrl(String filterProcessesUrl) {
		this.filterProcessesUrl = filterProcessesUrl;
	}

	public WeixinProperties getWeixin() {
		return weixin;
	}

	public void setWeixin(WeixinProperties weixin) {
		this.weixin = weixin;
	}

	public AlipayProperties getAlipay() {
		return alipay;
	}

	public void setAlipay(AlipayProperties alipay) {
		this.alipay = alipay;
	}
	
	
}
