package com.vastsum;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author ssj
 * @create 2017-11-05 20:28
 */
public class ByteSplit {

    @Test
    public void byteSplitTest() throws UnsupportedEncodingException {
        byte[] byteDatas = new byte[1024*1024*10];//10M的内容空间
        String str = "#ZWGC2017100800003#M001#JPG#99999999#.......#$";
        byte[] strByte = str.getBytes();
        long len = strByte.length >byteDatas.length ? byteDatas.length : strByte.length;
        for (int i =0; i< len;i++){
            byteDatas[i] = strByte[i];
        }
        //取出字符数组前37位进行解析
        byte[] byte37 = Arrays.copyOf(byteDatas, 37);
        String strData = new String(byte37, "UTF-8");
        String[] simpleStrs = strData.split("#");
        for (int i = 0; i<simpleStrs.length;i++){
            System.out.println(simpleStrs[i]);
        }
        System.out.println("ZWGC2017100800003".length());
        System.out.println("#ZWGC2017100800003#M001#JPG#99999999#".length());
    }
}
