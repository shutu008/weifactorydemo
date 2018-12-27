package com.vastsum.entity.pojo;

import com.vastsum.service.DictionaryService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;

/**
 * @author ssj
 * @create 2017-07-29 12:43
 */
public class DictionaryCacheListener implements javax.servlet.ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
    }
    @Override
    public void contextInitialized(ServletContextEvent arg0) {

        System.out.println("++++++++++++++++++　　数据字典已缓存　　+++++++++++++++++++++");
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext());
        DictionaryService dc = (DictionaryService) webApplicationContext.getBean("dictionaryService");
        dc.getCacheDic();   // 调用数据字典Manager的一个方法来缓存
    }

}
