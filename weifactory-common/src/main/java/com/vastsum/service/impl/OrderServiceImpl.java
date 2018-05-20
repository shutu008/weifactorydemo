package com.vastsum.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.dao.BizOrderMapper;
import com.vastsum.dao.DeviceMapper;
import com.vastsum.entity.BizOrder;
import com.vastsum.entity.BizOrderExample;
import com.vastsum.entity.BizOrderExample.Criteria;
import com.vastsum.entity.Device;
import com.vastsum.entity.DeviceExample;
import com.vastsum.pojo.PageCondition;
import com.vastsum.service.OrderService;

/**
 * 订单服务
 * @author ssj
 * @create 2017-10-16 22:42
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private BizOrderMapper bizOrderMapper;
    @Autowired
    private DeviceMapper deviceMapper;

    //保存订单
    @Override
    public Integer saveBizOrder(BizOrder bizOrder) {
       return bizOrderMapper.insert(bizOrder);
    }

    //更新订单状态
    @Override
    public Integer updateBizOrderStatus(Integer orderId, String status) {
        BizOrder bizOrder = new BizOrder();
        bizOrder.setOrderId(orderId);
        bizOrder.setOrderState(new Byte(status));
       return bizOrderMapper.updateByPrimaryKeySelective(bizOrder);
    }
    
    

    //列出所有订单
    @Override
    public PageInfo<BizOrder> listAllOrder(Integer page, Integer pageSize) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.setOrderByClause("order_start desc");
        page = (page == 0 || page== null)? 1:page;
        pageSize = (pageSize == 0 || pageSize == null)? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<BizOrder> bizOrders = bizOrderMapper.selectByExample(bizOrderExample);
        return new PageInfo<>(bizOrders);
    }

    //根据渠道获取订单信息
    @Override
    public PageInfo<BizOrder> listOrderByPayChannel(String payChannel, Integer page, Integer pageSize) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.createCriteria().andPayChannelEqualTo(payChannel);
        bizOrderExample.setOrderByClause("order_start desc");
        page = (page == 0 || page== null)? 1:page;
        pageSize = (pageSize == 0 || pageSize == null)? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<BizOrder> bizOrders = bizOrderMapper.selectByExample(bizOrderExample);
        return new PageInfo<>(bizOrders);
    }

    //根据订单id获取订单详情
    @Override
    public BizOrder getOrderById(Integer orderId) {
      return bizOrderMapper.selectByPrimaryKey(orderId);
    }

    //根据订单号获取订单信息
    @Override
    public BizOrder getOrderByOrderNumber(String orderNumber) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.createCriteria().andOrderNumberEqualTo(orderNumber);
        List<BizOrder> bizOrders = bizOrderMapper.selectByExample(bizOrderExample);
        if (bizOrders == null || bizOrders.isEmpty()){
            return  new BizOrder();
        }
        return bizOrders.get(0);
    }

    //获取用户的订单
    @Override
    public PageInfo<BizOrder>  pageOrderByUser(Integer userId, BizOrder bizOrder, PageCondition pageCondition) {
    	
    	 //获取用户的设备号
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.createCriteria().andUserIdEqualTo(userId); 
        List<Device> devices = deviceMapper.selectByExample(deviceExample);
        List<String> snList = new ArrayList<>();
        for (Device device: devices){
            snList.add(device.getSn());
        }
        //sn为空，直接返回没有对应的订单
        if (snList.isEmpty()){
            return new PageInfo<>(new ArrayList<>(0));
        }
        
    	BizOrderExample example = new BizOrderExample();
		Criteria criteria = example.createCriteria();
		
		if (StringUtils.isNotBlank(bizOrder.getOrderNumber())) {
			criteria.andOrderNumberLike("%"+bizOrder.getOrderNumber()+"%");
		}
		if (bizOrder.getOrderState() !=null) {
			criteria.andOrderStateEqualTo(bizOrder.getOrderState());
		}
		if (StringUtils.isNotBlank(bizOrder.getSn())) {
			criteria.andSnLike("%"+bizOrder.getSn()+"%");
		}
       
		
		 PageHelper.startPage(pageCondition.getPage(),pageCondition.getPageSize());
		 List<BizOrder> list = bizOrderMapper.selectByExample(example);
		 return new PageInfo<>(list);
    }

    //获取专家托管的订单
    @Override
    public PageInfo<BizOrder> listOrderByexpertId(Integer expertId, Integer page, Integer pageSize) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.createCriteria().andExpertIdEqualTo(expertId);
        page = (page == 0 || page== null)? 1:page;
        pageSize = (pageSize == 0 || pageSize == null)? 10:pageSize;
        PageHelper.startPage(page,pageSize);
        List<BizOrder> bizOrders = bizOrderMapper.selectByExample(bizOrderExample);
        return new PageInfo<>(bizOrders);
    }

    @Override
    public BizOrder getBizOrderBybatchId(Long batchId, Byte status) {
        BizOrderExample bizOrderExample = new BizOrderExample();
        bizOrderExample.createCriteria()
                .andBatchIdEqualTo(Integer.parseInt(batchId+""))
                .andOrderStateEqualTo(status);
        bizOrderExample.setOrderByClause("order_id desc");
        List<BizOrder> bizOrders = bizOrderMapper.selectByExample(bizOrderExample);
        if (bizOrders == null || bizOrders.isEmpty()){
            return null;
        }
        return bizOrders.get(0);
    }

    //批次是否对应有支付成功的订单：有ture无false
    @Deprecated
    @Override
    public boolean hasBizOrderBybatchId(Long batchId) {
        BizOrder bizOrderBybatchId = getBizOrderBybatchId(batchId, new Byte("3"));
        if (bizOrderBybatchId == null){
            return false;
        }
        return true;
    }

    //
	@Override
	public Integer updateBizOrderStatusByNo(String orderNo, String status, String payChannel) {
		BizOrder order = getOrderByOrderNumber(orderNo);
		order.setOrderState(new Byte(status));
		order.setPayChannel(payChannel);
		int i = bizOrderMapper.updateByPrimaryKey(order);
		return i;
	}

	//true:已经被托管，false还没被托管
	@Override
	public boolean hasBizOrderByDeviceId(Integer deviceId) {
		Device device = deviceMapper.selectByPrimaryKey(deviceId);
		if ("3".equals(device.getOrderStatus())) {
			return true;
		}
		return false;
	}

	@Override
	public void deleteBySn(String sn) {
		BizOrderExample example = new BizOrderExample();
		example.createCriteria().andSnEqualTo(sn);
		bizOrderMapper.deleteByExample(example);
	}

	@Override
	public PageInfo<BizOrder> pageByOrder(BizOrder bizOrder, PageCondition pageCondition) {
		BizOrderExample example = new BizOrderExample();
		Criteria criteria = example.createCriteria();
		
		if (StringUtils.isNotBlank(bizOrder.getOrderNumber())) {
			criteria.andOrderNumberLike("%"+bizOrder.getOrderNumber()+"%");
		}
		if (bizOrder.getOrderState() !=null) {
			criteria.andOrderStateEqualTo(bizOrder.getOrderState());
		}
		if (StringUtils.isNotBlank(bizOrder.getSn())) {
			criteria.andSnLike("%"+bizOrder.getSn()+"%");
		}
		List<BizOrder> list = bizOrderMapper.selectByExample(example);
		 PageHelper.startPage(pageCondition.getPage(),pageCondition.getPageSize());
		 return new PageInfo<>(list);
	}
}
