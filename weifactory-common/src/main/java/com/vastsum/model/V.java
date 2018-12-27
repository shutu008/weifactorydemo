package com.vastsum.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vastsum.enums.ResultStatus;

/**
 * 结果模型封装
 * @author shutu008
 *
 */
public class V {
	
	/**
	 * 成功
	 * @return ResponseEntity<ResultModel>
	 */
	public static ResponseEntity<ResultModel> ok(){
		return ResponseEntity.ok(ResultModel.ok());
	}
	
	/**
	 * 成功返回数据
	 * @param data
	 * @return ResponseEntity
	 */
	public static ResponseEntity<ResultModel> ok(Object data){
		return ResponseEntity.ok(ResultModel.ok(data));
	}
	
	/**
	 * 本框架定义所有的返回状态为200
	 * @return ResponseEntity<ResultModel>
	 */
	public static ResponseEntity<ResultModel> error(){
		return new ResponseEntity<ResultModel>(ResultModel.error("服务器异常！"), HttpStatus.OK);
	}
	
	/**
	 * 失败，并提供失败信息
	 * @param msg
	 * @return ResponseEntity<ResultModel>
	 */
	public static ResponseEntity<ResultModel> error(String msg){
		return new ResponseEntity<ResultModel>(ResultModel.error(msg), HttpStatus.OK);
	}
	
	/**
	 * 定义完整的失败信息
	 * @param resultStatus
	 * @return ResponseEntity<ResultModel>
	 */
	public static ResponseEntity<ResultModel> status(ResultStatus resultStatus){
		return new ResponseEntity<ResultModel>(ResultModel.error(resultStatus), HttpStatus.OK);
	}

}
