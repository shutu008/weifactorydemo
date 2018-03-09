package com.vastsum.server;

import com.vastsum.entity.CommunicationLog;

/**
 * 连接服务管理
 * @author ssj
 * @create 2017-11-19 11:23
 */
public interface CommunicationService {

    /**
     * 将连接日志写入到数据库中
     * @param communicationLog
     * @return int
     */
    int save(CommunicationLog communicationLog);

    /**
     * 更新连接日志信息
     * @param connectId
     * @param sn
     * @return int
     */
    int update(long connectId, String sn);
}
