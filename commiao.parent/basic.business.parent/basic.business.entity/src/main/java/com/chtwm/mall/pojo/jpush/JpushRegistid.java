package com.chtwm.mall.pojo.jpush;

import java.io.Serializable;

/**
 * 
 */
public class JpushRegistid  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private String registrationId;
    /**
     * 1 发送   0 不发送
     */
    private Integer isSend;

    
    /**
     *registrationId的setter方法
     **/     
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }
     /**
     *registrationId的getter方法
     **/ 
    public String getRegistrationId() {
        return this.registrationId;
    }
    
    /**
     *isSend的setter方法
     **/     
    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }
     /**
     *isSend的getter方法
     **/ 
    public Integer getIsSend() {
        return this.isSend;
    }

}