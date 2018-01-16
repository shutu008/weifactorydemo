package com.vastsum.entity.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author ssj
 * @create 2017-07-17 21:11
 */
public class MyFreeMarkerView extends FreeMarkerView {
    private static Logger logger = LoggerFactory.getLogger(MyFreeMarkerView.class);
    private  static final String CONTEXT_PATH = "base";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception{
        String scheme = request.getScheme();
        String serverName = request.getServerName();
        int port = request.getServerPort();
        String path = request.getContextPath();
        String basePath = scheme +"://"+serverName+":"+port+path;
        model.put(CONTEXT_PATH,basePath);
        logger.info("=============",basePath);
        super.exposeHelpers(model,request);
    }
}
