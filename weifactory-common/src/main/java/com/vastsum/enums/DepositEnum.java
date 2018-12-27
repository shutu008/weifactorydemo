package com.vastsum.enums;

/**
 * 托管方式
 * @author ssj
 * @create 2017-10-15 21:28
 */
public enum DepositEnum {
    DEPOSIT_ALL(1, "全托管"),
    DEPOSIT_SELF(2, "自定义托管");

    private Integer value;
    private String name;

    DepositEnum(Integer value, String name) {
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
