package com.vastsum.social.properties;

public class AlipayProperties {
	
	private String uri = "https://openapi.alipay.com/gateway.do";
	
	private String appId;
	
	private String appPrivateKey;
	
	private String format="json";
	
	private String charset="UTF-8";
	
	private String alipayPublicKey;
	
	private String signType="RSA2";
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppPrivateKey() {
		return appPrivateKey;
	}
	public void setAppPrivateKey(String appPrivateKey) {
		this.appPrivateKey = appPrivateKey;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}
	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	
	
	
	
	

}
