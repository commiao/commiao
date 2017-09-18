package com.chtwm.mall.sdk.controller.wap.account.result;

public class PefGotoPofParamResult {
    private String ticket; //解密指令
    private String hsid; //公募客户编号
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public String getHsid() {
        return hsid;
    }
    public void setHsid(String hsid) {
        this.hsid = hsid;
    }
}
