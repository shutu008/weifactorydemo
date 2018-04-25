package net.vastsum.weifactory.payapis.controller;

import lombok.extern.log4j.Log4j;
import net.vastsum.weifactory.payapis.service.AlipayService;
import net.vastsum.weifactory.payapis.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 赵艺茗
 * 支付功能的主要接口控制器
 */
@Controller
@Log4j
public class IndexController {

    @Autowired
    private AlipayService alipayService;

    @Autowired
    private WechatService wechatService;


    /**
     * 所有支付请求的接口
     * @param way 支付方式
     * @param order_number 订单号
     * @param callback 为了实现jsonp
     * @return ModelAndView
     * @throws Exception
     */
    @RequestMapping("/pay")
    public ModelAndView pay(String way, String order_number, String callback) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        if(way.equals("wechat")) {
            String qrcode = wechatService.wechatPayCode(order_number);
            modelAndView.setViewName("code");
            modelAndView.addObject("qrcode",qrcode);
            modelAndView.addObject("callback",callback);
            return modelAndView;
        }

        if(way.equals("alipay")){
            String page = alipayService.alipayPage(order_number);
            modelAndView.setViewName("alipay");
            modelAndView.addObject("page",page);
            return modelAndView;
        }
        return null;
    }

    /**
     * 微信服务器会访问此接口，请求支付信息
     * @return 跳转地址
     */
    @RequestMapping("/info")
    public String  info() {
        return "redirect:/wechat/codepay";
    }
}
