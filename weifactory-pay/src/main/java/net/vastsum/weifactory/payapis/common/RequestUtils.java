package net.vastsum.weifactory.payapis.common;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * 针对Request的操作工具
 */
public class RequestUtils {
    /**
     * 获取post请求中的请求体（此项目中为xml格式）
     * @param request
     * @return
     * @throws IOException
     */
    public static String getPostBody(HttpServletRequest request) throws IOException {
        int contentLen = request.getContentLength();
        if(contentLen < 0){
            return null;
        }
        byte buffer[] = new byte[contentLen];
        for (int i = 0; i < contentLen; i++) {
            int readline = request.getInputStream().read(buffer,i, contentLen - i);
            if(readline == -1){
                break;
            }
            i += readline;
        }
        String charEncoding = request.getCharacterEncoding();
        if (charEncoding == null){
            charEncoding = "UTF-8";
        }
        return new String(buffer, charEncoding);
    }


    /**
     * 从request中提取请求参数，加入到hashMap中
     * @param request HttpServletRequest
     * @return requestMap
     */
    public static HashMap<String,String> getRequestMap(HttpServletRequest request) {
        HashMap<String,String> requestMap = new HashMap<>();
        Enumeration enu = request.getParameterNames();
        while(enu.hasMoreElements()){
            String paraName=(String)enu.nextElement();
            requestMap.put(paraName,request.getParameter(paraName));
        }
        return requestMap;
    }


    /**
     * 从request中获取ip，由于只有微信的订单里使用，所以在这里实现
     * @return
     */
    public static String getIP(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String ip;
        if (request.getHeader("x-forwarded-for") == null) {
            ip = request.getRemoteAddr();
        }else{
            ip = request.getHeader("x-forwarded-for");
        }
        return ip;
    }
}
