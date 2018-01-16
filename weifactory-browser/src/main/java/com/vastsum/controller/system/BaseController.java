package com.vastsum.controller.system;


import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import springfox.documentation.annotations.ApiIgnore;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ssj
 * @create 2017-08-27 22:15
 */
@Controller
@ApiIgnore
public class BaseController {

    /**
     * 日期格式处理
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
        binder.registerCustomEditor(Long.class, new CustomNumberEditor(Long.class, false));
        binder.registerCustomEditor(Integer.class, new CustomNumberEditor(Integer.class, false));
        binder.registerCustomEditor(Double.class,new CustomNumberEditor(Double.class,false));
    }
}
