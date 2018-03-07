package com.vastsum.pojo;

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

    public Integer connStatus(String data){
        //如果如果设备第一次连接服务器获取开机，则收到的只有设备序列号
        if (data.indexOf("#") == -1){
            //没有包含#,说明第一次连接
            String sn = data;
            DeviceSn deviceSn = deviceService.getBySn(sn);
            if (deviceSn == null){
                //设备绑定失败，数据库中无此设备
                return 0;
            }
            int status = deviceSn.getStatus();
            if (status == 0){
                LOGGER.info("序列号为{}的设备首次激活", data);
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
