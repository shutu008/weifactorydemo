package net.vastsum.weifactory.payapis.service;

import net.vastsum.weifactory.payapis.common.RequestUtils;
import net.vastsum.weifactory.payapis.common.WxPayUtils;
import net.vastsum.weifactory.payapis.config.WechatConfig;
import net.vastsum.weifactory.payapis.entity.Order;
import net.vastsum.weifactory.payapis.entity.PrepayOrder;
import net.vastsum.weifactory.payapis.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private WechatService wechatService;

    /**
     * 根据productId获取order对象实例
     * @param productId 产品编号
     * @return order对象实例
     */
    public Order getOrderByProductId(String productId){
        Order order = new Order();
        order.setOrderNumber(productId);
        Example<Order> example = Example.of(order);
        return orderRepository.findOne(example);
    }


    /**
     * 用于生成预支付订单
     * @return 预支付订单的对象
     */
    public PrepayOrder generatePrepayOrder(Order order,WechatConfig wechatConfig) throws Exception {
        PrepayOrder prepayOrder = new PrepayOrder();
        prepayOrder.setAppid(wechatConfig.getAppID());
        prepayOrder.setMchId(wechatConfig.getMchID());
        prepayOrder.setDeviceInfo("WEB");
        prepayOrder.setNonceStr(WxPayUtils.getNonceStr());
        prepayOrder.setSignType("MD5");
        prepayOrder.setBody(order.getOrderBody());
        prepayOrder.setOutTradeNo(order.getOrderNumber());
        prepayOrder.setFeeType("CNY");
        prepayOrder.setTotalFee(order.getOrderPrice().multiply(BigDecimal.valueOf(100)).intValue());
        prepayOrder.setSpbillCreateIp(RequestUtils.getIP());
        prepayOrder.setNotifyUrl(wechatConfig.getNotifyUrl());
        prepayOrder.setTradeType("NATIVE");
        prepayOrder.setProductId(order.getOrderNumber());

        String sign = wechatService.generateSign(prepayOrder.getMap(),prepayOrder.getSignType());
        prepayOrder.setSign(sign);

        return prepayOrder;
    }




}
