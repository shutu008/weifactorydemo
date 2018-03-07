package com.vastsum.pojo;

import org.springframework.stereotype.Service;

/**
 * @author ssj
 * @create 2017-11-23 21:38
 */
@Service("arrayToEntity")
public class ArrayToEntityImpl implements ArrayToEntity {

    @Override
    public WrapData to(String[] dataArray) {
        //设备序列号
        String sn = dataArray[0];
        //传感器标识
        int sensor = Integer.parseInt(dataArray[1]);
        //数据类型标识
        int dataType = Integer.parseInt(dataArray[2]);
        //数据
        String dataContext = dataArray[3];
        //批次号
        String batchNo = sn + dataArray[4];
        WrapData wrapData = new WrapData();
        wrapData.setSn(sn);
        wrapData.setSensor(sensor);
        wrapData.setDataType(dataType);
        wrapData.setData(dataContext);
        wrapData.setBatchNo(batchNo);
        return wrapData;
    }
}
