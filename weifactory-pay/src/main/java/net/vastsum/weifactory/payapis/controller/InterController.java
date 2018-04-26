package net.vastsum.weifactory.payapis.controller;

import net.vastsum.weifactory.payapis.common.RequestUtils;
import net.vastsum.weifactory.payapis.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author 赵艺茗
 * 用于支付宝的交互
 */
@RestController
@RequestMapping("/inter")
public class InterController {

    @Autowired
    private AlipayService alipayService;

    /**
     * 用于前台付款后，网站页面的跳转
     */
    @ResponseBody
    @GetMapping("/callback")
    public ModelAndView server_callback(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pay-success");
        return mv;
    }

    /**
     * 支付完成后，支付宝服务器会向此接口发送报文
     * @param request httpServletRequest
     * @return 处理结果
     */
    @ResponseBody
    @PostMapping("/notify")
    public String dealNotify(HttpServletRequest request) throws Exception{
        HashMap<String,String> requestMap = RequestUtils.getRequestMap(request);
        return alipayService.dealNotify(requestMap);
    }
}
