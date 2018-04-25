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
}
