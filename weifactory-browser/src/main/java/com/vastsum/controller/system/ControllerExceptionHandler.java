package com.vastsum.controller.system;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vastsum.exception.OrderException;
import com.vastsum.model.ResultModel;


/**
 * 异常处理器
 * @author shutu008
 *
 */
@RestControllerAdvice
public class ControllerExceptionHandler {
	
	
	//全局异常处理器
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResultModel> globalException(HttpServletRequest request, Exception ex){
		return ResponseEntity.ok(ResultModel.error("服务器异常，请联系管理员"));
	}
	
	//空指针异常
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ResultModel> nullException(NullPointerException ex){
		return ResponseEntity.ok(ResultModel.error("空指针异常"));
	}
	
	//订单生产异常
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<ResultModel> orderException(OrderException ex){
		return ResponseEntity.ok(ResultModel.error(ex.getMessage()));
	}
	
	//可以使用hibernate验证框架

}
