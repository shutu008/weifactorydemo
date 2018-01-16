package com.vastsum.enums;

/**
 * 异常定义
 * @author ssj
 * @create 2017-11-17 21:37
 */
public enum ExceptionTypeEnum {

    BUSINESS_EXCEPTION(1, "业务异常"),
    DEVICE_EXCEPTION(2, "设备异常");

    private Integer id;
    private String name;

    ExceptionTypeEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
