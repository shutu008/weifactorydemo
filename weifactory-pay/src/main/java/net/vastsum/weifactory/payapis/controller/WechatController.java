package net.vastsum.weifactory.payapis.controller;


import lombok.extern.slf4j.Slf4j;
import net.vastsum.weifactory.payapis.common.RequestUtils;
import net.vastsum.weifactory.payapis.common.XmlUtils;
import net.vastsum.weifactory.payapis.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * 用于微信支付的交互
 */
@Controller
@RequestMapping("/wechat")
@Slf4j
public class WechatController {

    @Autowired
    private WechatService wechatService;


    /**
     * 统一下单接口调用
     * @param request 就是request啊
     * @return
     * @throws Exception
     */
    @PostMapping("/codepay")
    @ResponseBody
    public String codePay(HttpServletRequest request) throws Exception {
        String body = RequestUtils.getPostBody(request);
        HashMap<String,String> map = XmlUtils.getMap(body);
        return wechatService.codePay(map);
    }

    @PostMapping("/notify")
    @ResponseBody
    public String dealNotify(HttpServletRequest request) throws Exception {
        String body = RequestUtils.getPostBody(request);
        HashMap<String,String> map = XmlUtils.getMap(body);
        return wechatService.dealNotify(map);
    }
}
