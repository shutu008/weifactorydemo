package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.BizControl;

import java.util.List;

/**
 * @author ssj
 * @create 2017-11-18 10:06
 */
public interface BizControlService {

    /**
     * 列出所有控制开关列表
     * @return List<BizControl>
     */
    List<BizControl> listAll();

    /**
     * 根据设备序列号，列出所有的开关
     * @param sn
     * @return List<BizControl>
     */
    List<BizControl> listBySn(String sn);

    /**
     * 列出是否有效的开关列表
     * @param enabled
     * @return List<BizControl>
     */
    List<BizControl> listByEnabled(String enabled);

    /**
     * 根据开关状态列出开关列表
     * @param status
     * @return List<BizControl>
     */
    List<BizControl> listByStatus(String status);

    /**
     * 根据条件分页列出所有开关状态
     * @param bizControl
     * @param page
     * @param pageSize
     * @return PageInfo<BizControl>
     */
    PageInfo<BizControl> pageBizControl(BizControl bizControl, int page, int pageSize);

    /**
     * 保存开关状态
     * @param bizControl
     * @return int
     */
    int save(BizControl bizControl);

    /**
     * 更新开关状态
     * @param bizControl
     * @return int
     */
    int update(BizControl bizControl);


    /**
     * 更新开关是否可用
     * @param controlId
     * @param enabled
     * @return int
     */
    int updateEnabled(long controlId, String enabled);

    /**
     * 删除开关
     * @param controlId
     * @return int
     */
    int delete(long controlId);

    /**
     * 根据设备序列号设备设备的控制信息
     * @param sn
     * @return int
     */
    int deleteBySn(String sn);

    /**
     * 查看开关状态信息
     * @param controlId
     * @return BizControl
     */
    BizControl getById(long controlId);

    /**
     * 根据条件查询控制条件
     * @param bizControl
     * @return BizControl
     */
    BizControl getByBizControlExample(BizControl bizControl);

    /**
     * 初始化设备控制机构
     * @param sn
     */
    void intActuator(String sn);


}
