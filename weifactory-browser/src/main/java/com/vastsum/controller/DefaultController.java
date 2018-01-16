package com.vastsum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vastsum.controller.system.BaseController;
import com.vastsum.entity.User;

import io.swagger.annotations.Api;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author ssj
 * @create 2017-06-24 12:00
 */
@Controller
@ApiIgnore
@Api(value = "default",tags = {"后台路由"})
public class DefaultController extends BaseController {

    //注册页面
    //@Secured("ROLE_ADMIN")
    @RequestMapping(value = "/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/swagger/index")
    public String swagger(){
        return "WEB-INF/swagger/index";
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public User test(String callback){
        User user = new User();
        user.setUserName(callback);
        return user;
    }


}
