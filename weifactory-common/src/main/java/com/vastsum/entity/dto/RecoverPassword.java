package com.vastsum.entity.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class RecoverPassword {

	@NotBlank(message = "手机号不能为空")
	@Length(min = 11, max = 11, message = "手机号必须是11位")
	private String phoneNumber;
	
	@NotBlank(message = "密码不能为空")
	private String password;
	
	@NotBlank(message = "确认密码不能为空")
	private String enpassword;
	
	@NotBlank(message = "验证码不能为空")
	private String validateCode;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnpassword() {
		return enpassword;
	}

	public void setEnpassword(String enpassword) {
		this.enpassword = enpassword;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}
	
	
	
}
