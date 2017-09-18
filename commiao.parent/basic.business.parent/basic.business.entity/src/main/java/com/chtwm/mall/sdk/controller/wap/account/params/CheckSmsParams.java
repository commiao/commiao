package com.chtwm.mall.sdk.controller.wap.account.params;

public class CheckSmsParams {

    private String smsPhone;//注册手机号
    private String smsCode;//短信验证码
    private String custType;//用户类型
    public String getSmsPhone() {
        return smsPhone;
    }
    public void setSmsPhone(String smsPhone) {
        this.smsPhone = smsPhone;
    }
    public String getSmsCode() {
        return smsCode;
    }
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }
    public String getCustType() {
        return custType;
    }
    public void setCustType(String custType) {
        this.custType = custType;
    }
}
