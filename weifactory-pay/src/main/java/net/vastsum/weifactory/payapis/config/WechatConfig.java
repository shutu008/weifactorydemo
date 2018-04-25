package net.vastsum.weifactory.payapis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 赵艺茗
 * 微信配置类
 */
@ConfigurationProperties(prefix = "wechat")
@Configuration
@Data
public class WechatConfig {
    private String token;
    private String appID;
    private String appsecret;
    private String mchID;
    private String apikey;
    private String notifyUrl;
}
