package net.vastsum.weifactory.payapis.service;

import com.alipay.api.AlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import net.vastsum.weifactory.payapis.common.UrlRequest;
import net.vastsum.weifactory.payapis.config.AlipayConfig;
import net.vastsum.weifactory.payapis.entity.AlipayClientEntity;
import net.vastsum.weifactory.payapis.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * 处理支付宝支付
 */
@Service
public class AlipayService {

    @Autowired
    private AlipayConfig alipayConfig;

    @Autowired
    private OrderService orderService;

    @Autowired
    private AlipayClientEntity alipayClientEntity;


    public String dealNotify(HashMap<String,String> requestMap) throws Exception{
        String result = "false";
        String charset = requestMap.get("charset");
        String sign_type = requestMap.get("sign_type");
        Boolean signVerified = AlipaySignature.rsaCheckV1(requestMap,alipayConfig.getAlipayPublicKey(),charset,sign_type);
        if(signVerified){
            // 请求接口，更改状态
            HashMap<String,String> map = new HashMap<>();
            String out_trade_no = requestMap.get("out_trade_no");
            map.put("orderNumber",out_trade_no);
            map.put("orderStatus","3");
            map.put("payChannel","alipay");
            UrlRequest.postWithData("http://api.weifactory.vastsum.net:8852/batch/updateOrderStatus",map);
            result = "success";
        }
        return result;
    }

    /**
     * 用户获取支付宝收银台界面
     * @return 界面的html字符串
     */
    public String alipayPage(String productId) throws Exception{
        Order order = orderService.getOrderByProductId(productId);
        //获取支付宝支付客户端
        AlipayClient alipayClient = alipayClientEntity.getAlipayClient();
        //创建API对应的request
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(alipayConfig.getAppCallback()); //支付完成后跳转页面设置
        alipayRequest.setNotifyUrl(alipayConfig.getAppGateway());//支付完成后通知客户端信息的地址设置
        String bizContent = "{" +
                "    \"out_trade_no\":\""+order.getOrderNumber()+"\"," +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                "    \"total_amount\":"+order.getOrderPrice().floatValue()+"," +
                "    \"subject\":\""+ order.getOrderBody() +"\"," +
                "    \"body\":\""+order.getOrderBody()+"\"" +
                "  }";
        alipayRequest.setBizContent(bizContent);//填充业务参数
        return alipayClient.pageExecute(alipayRequest).getBody();
    }
}
