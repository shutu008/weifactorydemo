package com.vastsum.model;

import com.vastsum.enums.ResultStatus;

/**
 * 结果模型
 * @author shutu008
 *
 */
public class ResultModel {

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

    private ResultModel(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = "";
    }

    public ResultModel(int code, String message, Object data,Boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
    }


    public ResultModel(ResultStatus status, Object data, Boolean success) {
        this.code = status.getCode();
        this.message = status.getMessage();
        this.data = data;
        this.success = success;
    }

    public ResultModel(ResultStatus status,Boolean success) {
        this.code = status.getCode();
        this.message = status.getMessage();
        this.success = success;
    }


    public static ResultModel ok(Object data) {
        return new ResultModel(ResultStatus.SUCCESS, data, true);
    }

    /**
     * 结果成功，返回带成功信息的结果
     * @param resultStatus
     * @return 结果模型
     */
    public static ResultModel ok(ResultStatus resultStatus){
        return new ResultModel(resultStatus,true);
    }

    public static ResultModel ok() {
        return new ResultModel(ResultStatus.SUCCESS,true);
    }

    public static ResultModel ok(Object data,ResultStatus resultStatus){
        return new ResultModel(resultStatus,data,true);
    }

    public static ResultModel error(ResultStatus error) {
        return new ResultModel(error,false);
    }
    
    //错误处理，包括错误原因
    public static ResultModel error(String msg){
    	ResultModel resultModel = new ResultModel(500, msg);
    	resultModel.setSuccess(false);
    	return resultModel;
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
