package com.vastsum.service;

import com.github.pagehelper.PageInfo;
import com.vastsum.entity.BizOrder;

/**
 * 业务订单服务
 * @author ssj
 * @create 2017-10-16 22:19
 */
public interface OrderService {

    /**
     * 保存订单
     * @param bizOrder
     * @return Integer
     */
    Integer saveBizOrder(BizOrder bizOrder);

    /**
     * 更新订单状态
     * @param order
     * @param status
     * @return Integer
     */
    Integer updateBizOrderStatus(Integer order, String status);
    
    /**
     * 根据订单号更改订单状态
     * @param orderNo
     * @param status
     * @return Integer
     */
    Integer updateBizOrderStatusByNo(String orderNo, String status, String payChannel);

    /**
     * 列出所有订单
     * @param page
     * @param pageSize
     * @return PageInfo<BizOrder>
     */
    PageInfo<BizOrder> listAllOrder(Integer page, Integer pageSize);

    /**
     * 根据业务渠道获取订单信息
     * @param payChannel
     * @param page
     * @param pageSize
     * @return Page<BizOrder>
     */
    PageInfo<BizOrder> listOrderByPayChannel(String payChannel, Integer page, Integer pageSize);

    /**
     * 根据订单id获取订单信息
     * @param orderId
     * @return BizOrder
     */
    BizOrder getOrderById(Integer orderId);

    /**
     * 根据订单号获取订单信息
     * @param orderNumber
     * @return BizOrder
     */
    BizOrder getOrderByOrderNumber(String orderNumber);

    /**
     * 根据用户id获取用户的订单信息
     * @param userId
     * @param page
     * @param pageSize
     * @return Page<BizOrder>
     */
    PageInfo<BizOrder> listOrderByUserId(Integer userId, Integer page, Integer pageSize);

    /**
     * 根据专家id获取专家要托管的订单
     * @param expertId
     * @param page
     * @param pageSize
     * @return Page<BizOrder>
     */
    PageInfo<BizOrder> listOrderByexpertId(Integer expertId, Integer page, Integer pageSize);

    /**
     * 根据批次id和订单状态获取信息
     * @param batchId
     * @return BizOrder
     */
    BizOrder getBizOrderBybatchId(Long batchId, Byte status);

    /**
     * 根据批次id判断这个批次是否有订单
     * @param batchId
     * @return boolean
     */
    boolean hasBizOrderBybatchId(Long batchId);
    
    /**
     * 根据设备ID判断是否已经有完成的支付订单
     * @param deviceId
     * @return boolean
     */
    boolean hasBizOrderByDeviceId(Integer deviceId);


}
