package com.vastsum.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author ssj
 * @create 2017-10-14 21:36
 */
public class SpringConfigUtil implements ApplicationContextAware {

    private  static ApplicationContext applicationContext = null;
    private static SpringConfigUtil springConfigUtil = null;

    public synchronized static SpringConfigUtil init(){
        if (springConfigUtil == null){
            springConfigUtil = new SpringConfigUtil();
        }
        return springConfigUtil;
    }
    @Override
    public void setApplicationContext(ApplicationContext acxt) throws BeansException {
        applicationContext = acxt;
    }

    //通过bean的名字获取bean
    public synchronized static Object getBean(String name){
        return applicationContext.getBean(name);
    }


}
