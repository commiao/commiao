package com.chtwm.mall.pojo.detailed;

import java.io.Serializable;

public class AppointFundQueryResult implements Serializable{
    
    private static final long serialVersionUID = 7297348591931915650L;
    
    private String  fundName;          //产品名称
    private String  fundCode;          //产品代码
    private String  orderBalance;      //预约金额格式1(单位元千分位两位小数)
    private String  orderBalanceWan;   //预约金额格式2(单位万)
    private String  orderTime;         //预约日期 【格式:yyyy-mm-dd】
    private String  orderStatus;       //预约状态 【FUNDCRM3059字典】
    private String  orderDesc;         //预约状态描述
    private String  brokerName;        //客户经理名称
    private String  isCancel;          //是否可取消 1.否 2.是
    private String  orderNo;        //预约编号
    
    
    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public String getFundName() {
        return fundName;
    }
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
    public String getFundCode() {
        return fundCode;
    }
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }
    public String getOrderBalance() {
        return orderBalance;
    }
    public void setOrderBalance(String orderBalance) {
        this.orderBalance = orderBalance;
    }
    
    public String getOrderBalanceWan() {
		return orderBalanceWan;
	}
	public void setOrderBalanceWan(String orderBalanceWan) {
		this.orderBalanceWan = orderBalanceWan;
	}
	public String getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getBrokerName() {
        return brokerName;
    }
    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }
    public String getIsCancel() {
        return isCancel;
    }
    public void setIsCancel(String isCancel) {
        this.isCancel = isCancel;
    }
    public String getOrderDesc() {
        return orderDesc;
    }
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
	
}
