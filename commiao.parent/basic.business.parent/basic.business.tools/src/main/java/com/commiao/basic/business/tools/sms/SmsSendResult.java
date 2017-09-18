package com.commiao.basic.business.tools.sms;

/**
 * 短信发送结果，不同的第三方结果不一样
 * @author jannal
 */
public class SmsSendResult {

    public final String CODE_SUCCESS = SmsCode.SUCCESS.getValue();
    /**
     * 返回码
     */
    private String code=SmsCode.SUCCESS.getValue();
    
    /**
     * 返回消息
     */
    private String msg=SmsCode.SUCCESS.getDescription();
    
    /**
     * 运营商返回的原始结果
     */
    private String sourceResult;
    
    /**
     * 是否使用下一个短信运营商发送
     * 运营商返回错误信息，此时需要另一个发送
     */
    private boolean next = false;
    
    public SmsSendResult(){}

    public SmsSendResult(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public static SmsSendResult succesResult(){
        return new SmsSendResult();
    }

    public String getSourceResult() {
        if(sourceResult==null){
            sourceResult = "";
        }
        return sourceResult;
    }

    public void setSourceResult(String sourceResult) {
        this.sourceResult = sourceResult;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }
    
    
}
