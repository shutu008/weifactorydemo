package com.vastsum.entity.vo;

import com.vastsum.entity.CommunicationLog;

/**
 * 连接日志视图模型
 * @author ssj
 * @create 2017-11-19 13:50
 */
public class CommLogVO extends CommunicationLog {

    private String optionTypeName;

    public String getOptionTypeName() {
        return optionTypeName;
    }

    public void setOptionTypeName(String optionTypeName) {
        this.optionTypeName = optionTypeName;
    }
}
