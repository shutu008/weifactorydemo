package com.vastsum.pojo;

/**
 * 连接日志操作类型
 * @author ssj
 * @create 2017-11-19 11:48
 */
public enum OptionType {

    CONNECT(1, "连接"),
    DISCONNECT(2, "断开");

    private Integer value;
    private String name;

    OptionType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
