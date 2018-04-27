package com.vastsum.entity.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Demo {

	@NotBlank(message = "{vastsum.browser.demo.username.notBlank}")
	private String username;
	
	@NotNull(message = "{vastsum.browser.demo.age.notNull}")
	@Min(value=1L, message="{vastsum.browser.demo.age.min}")
	private Integer age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
