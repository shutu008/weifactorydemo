package com.vastsum.server;

import com.vastsum.entity.DeviceSn;

/**
 * @author ssj
 * @create 2017-10-08 19:51
 */
public interface DeviceService {

    DeviceSn getBySn(String sn);

    /**
     * 更新设备装填
     * @param deviceSn
     * @return int
     */
    int updateDeviceSnStatus(DeviceSn deviceSn);
}
