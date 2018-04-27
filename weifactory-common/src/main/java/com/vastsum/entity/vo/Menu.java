package com.vastsum.entity.vo;

import com.vastsum.entity.SysMenu;

import java.util.List;

/**
 * 菜单对象
 * @author ssj
 * @create 2017-10-23 20:18
 */
public class Menu<T> extends SysMenu {
    List<T> children;

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }
}
