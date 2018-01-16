package com.vastsum.social.alipay.api;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipayUserInfoShareResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 获取用户信息
 * @author shutu008
 *
 */
public class AlipayImpl implements Alipay {
	
	private static final Logger log = LoggerFactory.getLogger(AlipayImpl.class);

	
	private String accessToken;
	private String appId;
	private String appPrivateKey;
	private String alipayPublicKey;
	public AlipayImpl(String accessToken,String appId,String appPrivateKey,String alipayPublicKey) {
		this.accessToken = accessToken;
		this.appId = appId;
		this.appPrivateKey = appPrivateKey;
		this.alipayPublicKey = alipayPublicKey;
	}
	
	
	@Override
	public AlipayUserInfo getUserInfo() {
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", 
				appId, 
				appPrivateKey, 
				"json",
				"UTF-8", 
				alipayPublicKey, 
				"RSA2"); 
		AlipayUserInfoShareRequest request = new AlipayUserInfoShareRequest();
		try {
		    AlipayUserInfoShareResponse userinfoShareResponse = alipayClient.execute(request, accessToken);
		    AlipayUserInfo alipayUserInfo = new AlipayUserInfo();
		    System.out.println(userinfoShareResponse.getBody());
		   System.out.println(ReflectionToStringBuilder.toString(userinfoShareResponse));
		   BeanUtils.copyProperties(userinfoShareResponse, alipayUserInfo);
		   return alipayUserInfo;
		}catch (Exception e) {
		    //处理异常
			log.error("获取支付宝登录信息失败");
		    e.printStackTrace();
		}
		return null;
	}

}
