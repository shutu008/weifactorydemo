package net.vastsum.weifactory.payapis.entity;

import java.util.HashMap;

/**
 * @author 赵艺茗
 * 用于微信支付下订单的一个类
 */
public class PrepayOrder {
    private String appid;
    private String mchId;
    private String deviceInfo;
    private String nonceStr;
    private String sign;
    private String signType;
    private String body;
    private String detail;
    private String attach;
    private String outTradeNo;
    private String feeType;
    private Integer totalFee;
    private String spbillCreateIp;
    private String timeStart;
    private String timeExpire;
    private String goodsTag;
    private String notifyUrl;
    private String tradeType;
    private String productId;
    private String limitPay;
    private String openid;
    private String sceneInfo;

    private HashMap<String,String> map = new HashMap<>();

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
        this.map.put("appid",appid);
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
        this.map.put("mch_id",mchId);
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        this.map.put("device_info",deviceInfo);
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
        this.map.put("nonce_str",nonceStr);
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
        this.map.put("sign",sign);
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
        this.map.put("sign_type",signType);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
        this.map.put("body",body);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
        this.map.put("detail",detail);
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
        this.map.put("attach",attach);
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        this.map.put("out_trade_no",outTradeNo);
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
        this.map.put("fee_type",feeType);
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
        this.map.put("total_fee",String.valueOf(totalFee));
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
        this.map.put("spbill_create_ip",spbillCreateIp);
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        this.map.put("time_start",timeStart);
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
        this.map.put("time_expire",timeExpire);
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
        this.map.put("goods_tag",goodsTag);
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        this.map.put("notify_url",notifyUrl);
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
        this.map.put("trade_type",tradeType);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
        this.map.put("product_id",productId);
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
        this.map.put("limit_pay",limitPay);
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
        this.map.put("openid",openid);
    }

    public String getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
        this.map.put("scene_info",sceneInfo);
    }

    public HashMap<String, String> getMap() {
        return map;
    }
}
