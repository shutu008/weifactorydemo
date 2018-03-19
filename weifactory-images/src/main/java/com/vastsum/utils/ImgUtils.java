package com.vastsum.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 客户端传输的图片进行处理
 * @author ssj
 * @create 2017-11-04 9:32
 */
public class ImgUtils {

    private static Logger logger = LoggerFactory.getLogger(ImgUtils.class);
    private ImgUtils(){};

    /**
     * 存储图片，返回存储图片的地址
     * @return String
     */
    public static byte[] storeImg(byte[] bytes){
        /*
            1.获取前23个byte,并进行分割,解析出设备序列号，传感器标识，数据类型标识，和媒体数据流，
            返回媒体数据流
         */
        byte[] headerByte = Arrays.copyOf(bytes, 26);
        String headString = new String(headerByte);
       logger.info("从混合数据中获取的字符串信息："+headString);
        String[] split = headString.split("#");
        String sn = "";
        String sensor = "";
        String dataType = "";
        for (String s: split){
            sn = split[0];
            sensor = split[1];
            dataType = split[2];
        }
        //除去字符串信息，剩余的图片流数据
        byte[] imgByte = Arrays.copyOfRange(bytes, 27, bytes.length);
        return imgByte;
    }

    public static int getImgLenByString(String numStr){
        //将字符串数据长度转化为long类型的数字
        //因为字符串前面可能有0所以先删除0
        char[] dataLenStrBytes = numStr.toCharArray();
        //临时链表，存储真实数据字符
        List<Character> realList = new ArrayList<>();
        for (int i=0; i<dataLenStrBytes.length; i++){
            if (dataLenStrBytes[i] !='0'){
                realList.add(dataLenStrBytes[i]);
            }
        }
        //将字符列表转化为字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character: realList){
            stringBuilder.append(character);
        }
        String s = stringBuilder.toString();
        //真正的字符串（前面不带0）转化成数字
        return Integer.parseInt(s);
    }
}
