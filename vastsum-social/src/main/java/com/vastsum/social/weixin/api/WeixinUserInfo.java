package com.vastsum.social.weixin.api;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 微信基本信息
 * @author shutu008
 *
 */
@Entity
public class WeixinUserInfo implements Serializable {
	
	private static final long serialVersionUID = -4807528794626168449L;

	private String openid;
	
	private String nickname;
	
	private String sex;
	
	private String province;
	
	private String city;
	
	private String country;
	
	private String headimgurl;
	
	private String privilege;
	
	@Id
	private String unionid;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	
	
	
	
	
	

}
