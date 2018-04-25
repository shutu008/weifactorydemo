package net.vastsum.weifactory.payapis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 赵艺茗
 * 获取支付宝信息的配置类
 */
@Data
@Component
@ConfigurationProperties(prefix = "alipay")
public class AlipayConfig {
    /** APPID 即创建应用后生成 */
    private String appId;
    /** 应用公钥 */
    private String appPublicKey;
    /** 应用私钥 */
    private String appPrivateKey;
    /** 支付宝公钥 */
    private String alipayPublicKey;
    /** 支付宝网关 */
    private String gateway;
    /** 参数返回格式，只支持json */
    private String format;
    /** 编码集，支持GBK/UTF-8 */
    private String charset;
    /** 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2 */
    private String signType;
    /** 应用网关 */
    private String appGateway;
    /** 授权回调地址 */
    private String appCallback;
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppPublicKey() {
		return appPublicKey;
	}
	public void setAppPublicKey(String appPublicKey) {
		this.appPublicKey = appPublicKey;
	}
	public String getAppPrivateKey() {
		return appPrivateKey;
	}
	public void setAppPrivateKey(String appPrivateKey) {
		this.appPrivateKey = appPrivateKey;
	}
	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}
	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public String getAppGateway() {
		return appGateway;
	}
	public void setAppGateway(String appGateway) {
		this.appGateway = appGateway;
	}
	public String getAppCallback() {
		return appCallback;
	}
	public void setAppCallback(String appCallback) {
		this.appCallback = appCallback;
	}
    
    
}
