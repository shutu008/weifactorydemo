package com.vastsum.controller.system;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import springfox.documentation.annotations.ApiIgnore;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author ssj
 * @create 2017-08-27 22:15
 */
@Controller
@ApiIgnore
public class BaseController {
	
	//注入国际化消息服务
	@Autowired
	private MessageSource messageSource;
	
	private Locale locale = LocaleContextHolder.getLocale();

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
    
    /**
     * 获取对应国际化的值
     * @param code
     * @return String
     */
    protected String name(String code) {
		return messageSource.getMessage("weifactory.name", null,locale);
	}
    
    /**
     * 获取对应国际化的值
     * @param code
     * @return String
     */
    protected String getText(String code) {
		return messageSource.getMessage(code, null,locale);
	}
}
