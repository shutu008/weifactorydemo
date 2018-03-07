package com.vastsum.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ssj
 * @create 2017-09-25 22:50
 */
public class DataUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataUtils.class);

    public static String[] dataToArray(String data) throws Exception{
        //切割字符串，将必要数据封装到数组中
        String[] dataArray = null;
        if (data !=null && !"".equals(data)){
            String tempData = data.substring(1,data.length()-1);
            if (tempData != null && !"".equals(tempData)){
                dataArray = tempData.split("#");
            }else {
                throw new Exception("除去两边特殊字符，数据异常");
            }
        }else{
            throw new Exception("数据为空!");
        }
        if (dataArray!=null && dataArray.length<5){
            throw new Exception("数据不完整!");
        }

        return dataArray;
    }
}
