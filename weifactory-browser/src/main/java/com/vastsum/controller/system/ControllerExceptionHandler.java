package com.vastsum.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vastsum.controller.ValidationAspectController;
import com.vastsum.exception.OrderException;
import com.vastsum.model.ResultModel;


/**
 * 异常处理器
 * @author shutu008
 *
 */
@RestControllerAdvice
public class ControllerExceptionHandler extends ValidationAspectController {
	
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
