package com.vastsum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vastsum.core.model.R;
import com.vastsum.core.model.ResultModel;

@RestControllerAdvice
public class ValidationAspectController {

	private static Logger logger = LoggerFactory.getLogger(ValidationAspectController.class);
	
	
	//可以使用hibernate验证框架
	@ExceptionHandler(MethodArgumentNotValidException.class)
	 public ResponseEntity<ResultModel> MethodArgumentNotValidException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
	        MethodArgumentNotValidException c = (MethodArgumentNotValidException) ex;
	        List<ObjectError> errors =c.getBindingResult().getAllErrors();
	        StringBuffer errorMsg=new StringBuffer();
	        errors.stream().forEach(x -> errorMsg.append(x.getDefaultMessage()).append(";"));
	        return R.error(errorMsg.toString());
	    }
	
	//可以使用spring验证框架
		@ExceptionHandler(BindException.class)
		 public ResponseEntity<ResultModel> BindException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
			BindException c = (BindException) ex;
		        List<ObjectError> errors =c.getBindingResult().getAllErrors();
		        StringBuffer errorMsg=new StringBuffer();
		        errors.stream().forEach(x -> errorMsg.append(x.getDefaultMessage()+"\n"));
		        //String errorResult = errorMsg.substring(0, errorMsg.length()-1);
		        return R.error(errorMsg.toString());
		    }
		
		@ExceptionHandler(NumberFormatException.class)
		public ResponseEntity<ResultModel> NumberFormatException(Exception ex){
			logger.error(ex.getMessage());
			return R.error("请输入正确的数字");
		}
		

	//全局异常处理器
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResultModel> globalException(HttpServletRequest request, Exception ex){
		logger.error(ex.getMessage());
		return R.error("服务器异常，请联系管理员");
	}
	
	

	

}
