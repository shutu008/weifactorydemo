package com.vastsum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.vastsum.pojo.MD5PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new MD5PasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//跳过传统的登录方式
			http
				//.formLogin().and()
				.authorizeRequests()
				.antMatchers("/*")
				.permitAll()
				.and()
				.csrf().disable();
	}

}
