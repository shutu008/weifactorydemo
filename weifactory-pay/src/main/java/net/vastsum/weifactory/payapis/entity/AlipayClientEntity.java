package net.vastsum.weifactory.payapis.entity;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import net.vastsum.weifactory.payapis.config.AlipayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author 赵艺茗
 * 为了更方便地使用阿里提供的工具类，这里做一个简单的初始化
 */
@Component
public class AlipayClientEntity {
    @Autowired
    private AlipayConfig alipayConfig;

    private AlipayClient alipayClient = null;

    public AlipayClient getAlipayClient() {
        if(alipayClient == null) {
            String appId = alipayConfig.getAppId();
            String appPrivateKey = alipayConfig.getAppPrivateKey();
            String alipayPublicKey = alipayConfig.getAlipayPublicKey();
            String gateway = alipayConfig.getGateway();
            String format = alipayConfig.getFormat();
            String charset = alipayConfig.getCharset();
            String signType = alipayConfig.getSignType();
            this.alipayClient = new DefaultAlipayClient(gateway, appId, appPrivateKey, format, charset, alipayPublicKey, signType);
        }
        return this.alipayClient;
    }
}
