package com.vastsum.core.properties;

public class SmsProperties {
	
    private String url = "http://gw.api.taobao.com/router/rest";
    private String appkey = "LTAI1YHNkiVVWSrc";
    private String secret = "n1EZGsof32RNWBEpiiMLtDkrFNFl6C";
    private int numLength = 6;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getNumLength() {
        return numLength;
    }

    public void setNumLength(int numLength) {
        this.numLength = numLength;
    }

}
