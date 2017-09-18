package com.commiao.basic.business.tools.sms;

import com.commiao.basic.business.tools.exception.ValidateParamsException;

/**
 * json转换异常
 * 
 * @author jannal
 */
public class SmsJsonParamsException extends ValidateParamsException {
    private static final long serialVersionUID = -4759835509045377467L;

    public SmsJsonParamsException(String status, String code, String msg) {
        super(status, code, msg);
    }
    
    public SmsJsonParamsException(String msg, String code) {
        super(msg, code);
    }

}
