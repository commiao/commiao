package com.commiao.basic.business.tools.sms;

/**
 * 短信状态码
 * @author jannal
 */
public enum SmsCode {

    SUCCESS("0","成功"),
    ERROR("1","发送过程发生异常"),
    BALANCE_NOT_ENOUGH("2","余额不足"),
    SUBMIIT_FAILED("3","提交失败"),
    ILLEGAL_WORD("4","非法词语"),
    IILEGAL_PARAMS("5","非法参数"),
    OVER_LMIT("6","发送超限"),
    ILLEGAL_LOGIN("7","非法登录"),
    UNKNOWN_ERROR("8","未知错误");
    
    
    private String value;
    
    private String description;
    
    private SmsCode(String value,String description){
        this.value = value;
        this.description =description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}