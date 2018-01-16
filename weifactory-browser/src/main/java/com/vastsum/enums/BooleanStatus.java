package com.vastsum.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author ssj
 * @create 2017-08-13 22:25
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum BooleanStatus {
    TRUE("true"),
    FALSE("false");

    private String status;

    BooleanStatus(String status){
        this.status= status;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
