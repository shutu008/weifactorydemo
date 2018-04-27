package com.vastsum.enums;

/**
 * @author ssj
 * @create 2017-10-16 22:29
 */
public enum  PayEnum {
    WEICHAT("wechat", "微信支付"),
    ALIPAY("alipay", "支付宝");

    private String value;
    private String name;

    PayEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
