package com.vastsum.entity.pojo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author ssj
 * @create 2017-07-08 20:29
 */
public class MyUserDetails implements UserDetails {

	private static final long serialVersionUID = -8952092538547012357L;
	private String userName;
    private String userPassword;
    private Collection<? extends GrantedAuthority> authorities;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public MyUserDetails(String userName, String userPassword, Collection<? extends GrantedAuthority> authorities){
        this.userName = userName;
        this.userPassword = userPassword;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.userPassword;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "MyUserDetails{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
