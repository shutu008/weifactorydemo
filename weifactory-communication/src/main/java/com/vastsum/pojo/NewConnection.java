package com.vastsum.pojo;

import com.vastsum.entity.CommunicationMessage;
import com.vastsum.entity.DeviceSn;
import com.vastsum.server.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author ssj
 * @create 2017-10-08 20:23
 */
@Component("newConnection")
public class NewConnection {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewConnection.class);

    @Autowired
    private DeviceService deviceService;

    public Integer connStatus(CommunicationMessage cm){
        // 判定是否为第一次连接
        if (cm.isFirstConnect()){
            String sn = cm.getSn();
            DeviceSn deviceSn = deviceService.getBySn(sn);
            if (deviceSn == null){
                //设备绑定失败，数据库中无此设备
                return 0;
            }
            int status = deviceSn.getStatus();
            if (status == 0){
                LOGGER.info("序列号为{}的设备首次激活", sn);
                //将设备进行激活
                deviceSn.setStatus(1);
                int i = deviceService.updateDeviceSnStatus(deviceSn);
                //1.设备状态更新成功，0设备状态更新失败。绑定失败
                return i;

            }
            if (status == 1){
                LOGGER.info("序列号为{}的设备已经激活", sn);
                return 1;
            }
        }
        //数据不合法
        return -1;
    }
}
