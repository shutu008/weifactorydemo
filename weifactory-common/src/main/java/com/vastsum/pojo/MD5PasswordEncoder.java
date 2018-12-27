package com.vastsum.pojo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MD5PasswordEncoder implements PasswordEncoder{

	//加密
	@Override
	public String encode(CharSequence rawPassword) {
		return DigestUtils.md5Hex(rawPassword.toString());
	}

	/**
	 * encodedPassword来自数据库中的密码
	 * rawPassword 页面上传来的密码
	 */
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return encodedPassword.equals(encode(rawPassword));
	}

}
