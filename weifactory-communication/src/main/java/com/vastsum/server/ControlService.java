package com.vastsum.server;

import com.vastsum.pojo.AskBody;

import java.util.Set;

/**
 * 提供远程服务
 * @author ssj
 * @create 2017-10-21 10:31
 */
public interface ControlService {

    /**
     * 向指定客户端发送数据
     * @param sn
     * @param sensorType
     * @param status
     * @param period
     */
    AskBody controlMsg(String sn, String sensorType, String status, Long period);

    /**
     * 控制数据
     * @param sn            //设备序列号
     * @param controlType   //控制类型
     * @param extendStr     //扩展字段
     * @param data1         //数据1
     * @param data2         //数据2
     * @param data3         //数据3
     * @return AskBody      //响应
     */
    AskBody controlData(String sn, String controlType, String extendStr, String data1, String data2, String data3);

    /**
     * 获取所有处于连接状态的设备序列号
     * @return Set<String>
     */
    Set<String> listOnDeviceSn();

    /**
     * 断开服务器与设备之间的连接
     * @param sn
     */
    AskBody closeDeviceChannel(String sn);
}
