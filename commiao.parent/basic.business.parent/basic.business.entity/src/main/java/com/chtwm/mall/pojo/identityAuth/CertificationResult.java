package com.chtwm.mall.pojo.identityAuth;


//实名认证or开户结果集
public class CertificationResult {

    private String openAccount="";//是否进入公募开户0：进入，1：不进入
    private String privateOfferStatus=""; //私募实名认证是否成功 0成功 1失败
    private String publicOfferStatus=""; //是否进入公募开户0：进入，1：不进入
    private String privateOfferMsg="";//私募实名认证接口反馈信息
    private String publicOfferMsg=""; //公募开户接口反馈信息
    private String protocolNo="";//协议号
    private String serialNo=""; //流水号
    private String userIdEncry="";//加密后私募客户编号
    public String getUserIdEncry() {
        return userIdEncry;
    }
    public void setUserIdEncry(String userIdEncry) {
        this.userIdEncry = userIdEncry;
    }
    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getPrivateOfferMsg() {
        return privateOfferMsg;
    }
    public void setPrivateOfferMsg(String privateOfferMsg) {
        this.privateOfferMsg = privateOfferMsg;
    }
    public String getPublicOfferMsg() {
        return publicOfferMsg;
    }
    public void setPublicOfferMsg(String publicOfferMsg) {
        this.publicOfferMsg = publicOfferMsg;
    }
    public String getProtocolNo() {
        return protocolNo;
    }
    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }
    public String getOpenAccount() {
        return openAccount;
    }
    public void setOpenAccount(String openAccount) {
        this.openAccount = openAccount;
    }
    public String getPrivateOfferStatus() {
        return privateOfferStatus;
    }
    public void setPrivateOfferStatus(String privateOfferStatus) {
        this.privateOfferStatus = privateOfferStatus;
    }
    public String getPublicOfferStatus() {
        return publicOfferStatus;
    }
    public void setPublicOfferStatus(String publicOfferStatus) {
        this.publicOfferStatus = publicOfferStatus;
    }
}
