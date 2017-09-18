package com.chtwm.mall.pojo.jpush;

import java.io.Serializable;

/**
 * 
 */
public class JpushRegistidParam  implements Serializable  {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -4977988511407056876L;
	/**
     * 
     */
    private String registrationId;
    /**
     * 1 发送   0 不发送
     */
    private String isSend;
    /*
     * 机型描述
     */
    private String desc;
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
    public String getIsSend() {
		return isSend;
	}
	public void setIsSend(String isSend) {
		this.isSend = isSend;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}