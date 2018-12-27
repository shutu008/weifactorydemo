package com.vastsum.core.enums;

public enum MenuType {

	/**
     * 目录
     */
	CATALOG(0),
    /**
     * 菜单
     */
    MENU(1),
    /**
     * 按钮
     */
    BUTTON(2);

    private int value;

    private MenuType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
