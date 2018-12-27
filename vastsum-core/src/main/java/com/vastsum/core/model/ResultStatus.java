package com.vastsum.core.model;

/**
 * 自定义响应码
 */
public class ResultStatus {
	public static final ResultStatus SUCCESS = new ResultStatus(200, "成功");
	public static final ResultStatus FAILED = new ResultStatus(500,"失败");		
	public static final ResultStatus ERROR = new ResultStatus(500,"服务器错误");
	public static final ResultStatus PARAM_NULL = new ResultStatus(400,"空参数");
	
    private ResultStatus(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	/**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * 返回一个默认值,使用默认值必须修改
     * @param code
     * @param message
     * @return ResultStatus
     */
    public static ResultStatus of(int code, String message){
    	return new ResultStatus(code, message);
    }
    
    public static ResultStatus defaultOf(String message){
    	return new ResultStatus(400, message);
    }
    
}
