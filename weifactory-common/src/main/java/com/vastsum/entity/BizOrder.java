package com.vastsum.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BizOrder {
    private Integer orderId;

    private String orderNumber;

    private BigDecimal orderPrice;

    private String orderBody;

    private String sn;

    private Integer batchId;

    private String plantOne;

    private String plantTwo;

    private String plantThree;

    private Integer modeOne;

    private Integer modeTwo;

    private Integer modeThree;

    private String payChannel;

    private String deposit;

    private Integer expertId;

    private Byte orderState;

    private Date orderStart;

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
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
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
        this.orderBody = orderBody == null ? null : orderBody.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
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
        this.plantOne = plantOne == null ? null : plantOne.trim();
    }

    public String getPlantTwo() {
        return plantTwo;
    }

    public void setPlantTwo(String plantTwo) {
        this.plantTwo = plantTwo == null ? null : plantTwo.trim();
    }

    public String getPlantThree() {
        return plantThree;
    }

    public void setPlantThree(String plantThree) {
        this.plantThree = plantThree == null ? null : plantThree.trim();
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

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }

    public Integer getExpertId() {
        return expertId;
    }

    public void setExpertId(Integer expertId) {
        this.expertId = expertId;
    }

    public Byte getOrderState() {
        return orderState;
    }

    public void setOrderState(Byte orderState) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderBody=").append(orderBody);
        sb.append(", sn=").append(sn);
        sb.append(", batchId=").append(batchId);
        sb.append(", plantOne=").append(plantOne);
        sb.append(", plantTwo=").append(plantTwo);
        sb.append(", plantThree=").append(plantThree);
        sb.append(", modeOne=").append(modeOne);
        sb.append(", modeTwo=").append(modeTwo);
        sb.append(", modeThree=").append(modeThree);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", deposit=").append(deposit);
        sb.append(", expertId=").append(expertId);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderStart=").append(orderStart);
        sb.append(", orderEnd=").append(orderEnd);
        sb.append("]");
        return sb.toString();
    }
}