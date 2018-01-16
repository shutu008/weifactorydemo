package com.vastsum.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.vastsum")
public class VastsumProperties {
	
	private SmsProperties sms = new SmsProperties();

	public SmsProperties getSms() {
		return sms;
	}

	public void setSms(SmsProperties sms) {
		this.sms = sms;
	}
	
	

}
