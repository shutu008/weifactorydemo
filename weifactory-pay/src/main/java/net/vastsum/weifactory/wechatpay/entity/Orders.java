package net.vastsum.weifactory.wechatpay.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Component
@Data
public class Orders {
    @Id
    @GeneratedValue
    private Integer orderId;
    /** 订单编号 **/
    private String orderNumber;
    /** 微信生成的订单预付编号 **/
    private String prepayId;
    /** 用于用户标识的用户id **/
    private String openId;
    /** 订单价格 **/
    private BigDecimal orderPrice;
    /** 订单标题 **/
    private String orderBody;
    /** 机器的序列号 **/
    private String sn;
    /** 批次编号 **/
    private Integer batchId;
    /** 第一个植物 **/
    private String plantOne;
    /** 第二个植物 **/
    private String plantTwo;
    /** 第三个植物 **/
    private String plantThree;
    /** 第一个栽培模式 **/
    private Integer modeOne;
    /** 第二个栽培模式 **/
    private Integer modeTwo;
    /** 第三个栽培模式 **/
    private Integer modeThree;
    /** 托管方式 **/
    private String deposit;
    /** 专家编号 **/
    private Integer expertId;
    /** 订单状态 **/
    private Integer orderState;
    /** 下订单时间 **/
    private Date orderStart;
    /** 完结订单时间 **/
    private Date orderEnd;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getPrepayId() {
		return prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderBody() {
		return orderBody;
	}
	public void setOrderBody(String orderBody) {
		this.orderBody = orderBody;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public Integer getBatchId() {
		return batchId;
	}
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}
	public String getPlantOne() {
		return plantOne;
	}
	public void setPlantOne(String plantOne) {
		this.plantOne = plantOne;
	}
	public String getPlantTwo() {
		return plantTwo;
	}
	public void setPlantTwo(String plantTwo) {
		this.plantTwo = plantTwo;
	}
	public String getPlantThree() {
		return plantThree;
	}
	public void setPlantThree(String plantThree) {
		this.plantThree = plantThree;
	}
	public Integer getModeOne() {
		return modeOne;
	}
	public void setModeOne(Integer modeOne) {
		this.modeOne = modeOne;
	}
	public Integer getModeTwo() {
		return modeTwo;
	}
	public void setModeTwo(Integer modeTwo) {
		this.modeTwo = modeTwo;
	}
	public Integer getModeThree() {
		return modeThree;
	}
	public void setModeThree(Integer modeThree) {
		this.modeThree = modeThree;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public Integer getExpertId() {
		return expertId;
	}
	public void setExpertId(Integer expertId) {
		this.expertId = expertId;
	}
	public Integer getOrderState() {
		return orderState;
	}
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	public Date getOrderStart() {
		return orderStart;
	}
	public void setOrderStart(Date orderStart) {
		this.orderStart = orderStart;
	}
	public Date getOrderEnd() {
		return orderEnd;
	}
	public void setOrderEnd(Date orderEnd) {
		this.orderEnd = orderEnd;
	}
    
    
    
}
