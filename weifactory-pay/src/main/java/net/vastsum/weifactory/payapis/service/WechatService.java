package net.vastsum.weifactory.payapis.service;

import net.vastsum.weifactory.payapis.common.UrlRequest;
import net.vastsum.weifactory.payapis.common.WxPayUtils;
import net.vastsum.weifactory.payapis.common.XmlUtils;
import net.vastsum.weifactory.payapis.config.WechatConfig;
import net.vastsum.weifactory.payapis.entity.Order;
import net.vastsum.weifactory.payapis.entity.PrepayOrder;
import net.vastsum.weifactory.payapis.websocket.MyWebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

@Service
public class WechatService {

    @Autowired
    private WechatConfig wechatConfig;

    @Autowired
    private OrderService orderService;

    /**
     * 生成签名
     * @param values 键值对
     * @param signType 签名方法
     * @return 签名字符串
     */
    public String generateSign(HashMap<String,String> values, String signType) throws Exception{
        //获取键集合
        Set<String> keySet = values.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for(String k : keyArray){
            if (!k.equals("sign") && values.get(k).trim().length() > 0) {
                sb.append(k).append("=").append(values.get(k).trim()).append("&");
            }
        }
        sb.append("key=").append(wechatConfig.getApikey());
        if("MD5".equals(signType)){
            return WxPayUtils.MD5(sb.toString()).toUpperCase();
        }else if("HMAC-SHA256".equals(signType)){
            return WxPayUtils.HMACSHA256(sb.toString(), wechatConfig.getApikey());
        }else {
            throw new Exception("Invalid signType:"+signType);
        }
    }

    /**
     * 验证签名
     * @param values 键值对
     * @param signType 签名方法
     * @return 布尔值，表示正确与否
     */
    private Boolean checkSign(HashMap<String,String> values, String signType) throws Exception{
        //获取键集合
        Set<String> keySet = values.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for(String k : keyArray){
            if (!k.equals("sign") && values.get(k).trim().length() > 0) {
                sb.append(k).append("=").append(values.get(k).trim()).append("&");
            }
        }
        sb.append("key=").append(wechatConfig.getApikey());
        if("MD5".equals(signType)){
            String signGet = WxPayUtils.MD5(sb.toString()).toUpperCase();
            return values.get("sign").equals(signGet);
        }else if("HMAC-SHA256".equals(signType)){
            String signGet = WxPayUtils.HMACSHA256(sb.toString(), wechatConfig.getApikey());
            return values.get("sign").equals(signGet);
        }else {
            throw new Exception("Invalid signType:"+signType);
        }
    }

    public String codePay(HashMap<String,String> map) throws Exception{
        String urlApi = "https://api.mch.weixin.qq.com/pay/unifiedorder";
        String product_id = map.get("product_id");
        Order order = orderService.getOrderByProductId(product_id);
        PrepayOrder prepayOrder = orderService.generatePrepayOrder(order,wechatConfig);
        String xmlOrder = WxPayUtils.mapToXml(prepayOrder.getMap());
        String result = UrlRequest.postRequest(urlApi,xmlOrder);
        HashMap<String,String> map1 = XmlUtils.getMap(result);
        if(checkSign(map1,"MD5")){
            String prepay_id = map1.get("prepay_id");
            HashMap<String,String> resMap = new HashMap<>();
            resMap.put("return_code","SUCCESS");
            resMap.put("return_msg","");
            resMap.put("appid", wechatConfig.getAppID());
            resMap.put("mch_id", wechatConfig.getMchID());
            resMap.put("nonce_str",WxPayUtils.getNonceStr());
            resMap.put("prepay_id",prepay_id);
            resMap.put("result_code","SUCCESS");
            String sign = generateSign(resMap,"MD5");
            resMap.put("sign",sign);
            return WxPayUtils.mapToXml(resMap);
        }
        return null;
    }

    public String dealNotify(HashMap<String,String> map) throws Exception{
        // 签名验证
        if(!checkSign(map,"MD5")){
            return null;
        }
        // 返回状态判定，SUCCESS则继续
        String return_code = map.get("return_code");
        String result_code = map.get("result_code");
        if(return_code.equals("SUCCESS") && result_code.equals("SUCCESS")){
            // 请求接口，更改状态
            String transaction_id = map.get("out_trade_no");
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("orderNumber",transaction_id);
            hashMap.put("orderStatus","3");
            hashMap.put("payChannel","wechat");
            UrlRequest.postWithData("http://api.weifactory.vastsum.net:8852/batch/updateOrderStatus",hashMap);
            // (3) socket通知前端支付成功
            MyWebSocket.sendMessage(transaction_id,"支付成功");
            // (4) 交易结果标记为成功
            HashMap<String,String> return_result = new HashMap<>();
            return_result.put("return_code","SUCCESS");
            return_result.put("return_msg","OK");
            return WxPayUtils.mapToXml(return_result);
        }else{
            HashMap<String,String> return_result = new HashMap<>();
            return_result.put("return_code","FAIL");
            return_result.put("return_msg","Something strange");
            return WxPayUtils.mapToXml(return_result);
        }
    }

    public String wechatPayCode(String productId) throws Exception {
        String appID = wechatConfig.getAppID();
        String mchID = wechatConfig.getMchID();
        int time = (int)(new Date().getTime());
        String nonceStr = WxPayUtils.getNonceStr();
        HashMap<String,String> map = new HashMap<>();
        map.put("appid",appID);
        map.put("mch_id",mchID);
        map.put("time_stamp",String.valueOf(time));
        map.put("nonce_str",nonceStr);
        map.put("product_id",productId);
        String sign = generateSign(map,"MD5");
        String url = "weixin://wxpay/bizpayurl?" +
                "sign="+sign +
                "&appid="+appID +
                "&mch_id="+mchID +
                "&product_id="+productId +
                "&time_stamp="+String.valueOf(time) +
                "&nonce_str="+nonceStr;
        return url;
    }
}
