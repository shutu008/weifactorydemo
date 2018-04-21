package com.vastsum.social.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.vastsum.core.model.R;
import com.vastsum.core.model.ResultModel;
import com.vastsum.social.alipay.api.Alipay;
import com.vastsum.social.alipay.api.AlipayImpl;
import com.vastsum.social.alipay.api.AlipayUserInfo;
import com.vastsum.social.properties.SocialProperties;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/social")
@Api(tags="第三方登录管理")
@ApiIgnore
public class SocialController {

	@Autowired
	private SocialProperties socialProperties;
	
	@GetMapping("/alipay")
	@ApiOperation("支付宝登录接口@20180108")
	public String alipay(HttpServletRequest request, HttpServletResponse response){
		//拼接支付宝授权的连接
		String redirectUrl = "https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=2017121700918844&scope=auth_user&redirect_uri=http://www.weifactory.vastsum.net/social/alipay/callback&state=init";
		return "redirect:"+redirectUrl;
	}
	
	@GetMapping("/alipay/callback")//很多情况下这个地址是后台首页
	@ApiOperation("支付宝回调首页@20180110")
	public ResponseEntity<ResultModel> getAuth(
			@RequestParam("auth_code")String auth_code){
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", 
				socialProperties.getAlipay().getAppId(), 
				socialProperties.getAlipay().getAppPrivateKey(),
				socialProperties.getAlipay().getFormat(),
				socialProperties.getAlipay().getCharset(), 
				socialProperties.getAlipay().getAlipayPublicKey(),
				socialProperties.getAlipay().getSignType()); 
		AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
		request.setCode(auth_code);
		request.setGrantType("authorization_code");//授权码模式默认
		AlipaySystemOauthTokenResponse oauthTokenResponse = null;
		AlipayUserInfo userInfo = null;
		try {
			oauthTokenResponse = alipayClient.execute(request);
		    System.out.println(oauthTokenResponse.getAccessToken());
		    userInfo = this.getUserInfo(oauthTokenResponse.getAccessToken());
		} catch (AlipayApiException e) {
		    //处理异常
		    e.printStackTrace();
		}
		return R.ok(userInfo);
	}
	
	private AlipayUserInfo getUserInfo(String accessTkoen){
		Alipay alipay = new AlipayImpl(accessTkoen, 
				socialProperties.getAlipay().getAppId(), 
				socialProperties.getAlipay().getAppPrivateKey(), 
				socialProperties.getAlipay().getAlipayPublicKey());
		return alipay.getUserInfo();
	}
	
}
