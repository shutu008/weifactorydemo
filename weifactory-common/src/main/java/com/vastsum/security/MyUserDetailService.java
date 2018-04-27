/**
 * 
 */
package com.vastsum.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.vastsum.service.UserService;

/**
 * @author shutu008
 * security
 */

public class MyUserDetailService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(MyUserDetailService.class);
	
	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("当前登陆用户名："+username);
		com.vastsum.entity.User user = userService.getUserByUsername(username);
		return new User(user.getUserName(),user.getUserPassword(),AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
	}

}
