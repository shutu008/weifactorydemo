package com.vastsum.pojo;

import java.io.Serializable;

/**
 * @author ssj
 * @create 2017-10-21 10:55
 */
public class AskBody implements Serializable {
    private static final long serialVersionUID = 3317338239604633998L;
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    /**
     * 返回内容
     */

    private Object data;

    /**
     * 返回结果状态
     */
    private Boolean success;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public Boolean getSuccess(){return success;}

    private AskBody(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = "";
    }

    public AskBody(int code, String message, Object data,Boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
    }

    public static AskBody ok(Object data){
        AskBody askBody = new AskBody(200, "成功");
        askBody.setSuccess(true);
        askBody.setData(data);
        return askBody;
    }
    public static AskBody error(Object data){
        AskBody askBody = new AskBody(500, "失败");
        askBody.setSuccess(false);
        askBody.setData(data);
        return askBody;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
