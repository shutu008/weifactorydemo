package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.vo.CommLogVO;

import java.util.List;

/**
 * 通信连接服务
 * @author ssj
 * @create 2017-11-19 13:20
 */
public interface ConnectService {

    /**
     * 列出所有的数据
     * @return List<CommunicationLog>
     */
    List<CommLogVO> listAll();

    /**
     * 根据条件分页列出所有数据
     * @param c
     * @param page
     * @param pageSize
     * @return PageInfo<CommunicationLog>
     */
    PageInfo<CommLogVO> pageByCommunicationLog(CommunicationLog c, int page, int pageSize);

    /**
     * 根据id获取信息
     * @param connectionId
     * @return CommunicationLog
     */
    CommLogVO getCommunicationLog(long connectionId);

    /**
     * 保存信息
     * @param communicationLog
     * @return int
     */
    int save(CommunicationLog communicationLog);

    /**
     * 更新信息
     * @param communicationLog
     * @return int
     */
    int update(CommunicationLog communicationLog);

    /**
     * 删除信息
     * @param connectionId
     * @return int
     */
    int delete(long connectionId);
}
