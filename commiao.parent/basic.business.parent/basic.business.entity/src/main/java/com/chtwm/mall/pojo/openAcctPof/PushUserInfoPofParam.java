package com.chtwm.mall.pojo.openAcctPof;


/**
 * @Description: 推送实名认证用户信息到明泽系统
 * @author:wrx
 * @version V1.0
 */
public class PushUserInfoPofParam {
    private String custName;                      //真实姓名 必填项
    private String idNo; //证件号 必填项
    private String idnoType;                       //证件类型 必填项
    private String mobileNo;        //手机号 必填项
    private String password;                 //登录密码 必填项
    private String ticket; //解密使用
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public String getIdnoType() {
        return idnoType;
    }
    public void setIdnoType(String idnoType) {
        this.idnoType = idnoType;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
