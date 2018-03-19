package com.vastsum.utils;

/**
 * @author ssj
 * @create 2017-11-19 12:09
 */
public class ParseIpAddress {

    private ParseIpAddress(){}

    //获取端口号
    public static int getPort(String ipAddress){
        String trimStr = ipAddress.trim();
        String[] address = trimStr.split(":");
        int port = 0;
        if (address != null && address.length == 2){
            port = Integer.parseInt(address[1]);
        }
        return port;
    }
    //获取ip地址
    public static String getAddress(String ipAddress){
        String trimStr = ipAddress.trim();
        String[] address = trimStr.split(":");
        String  Ip = "";
        if (address != null && address.length == 2){
           if ("/".equals(address[0].substring(0,1))){
               Ip = address[0].substring(1);
           }else {
               Ip = address[0];
           }
        }
        return Ip;
    }

}
