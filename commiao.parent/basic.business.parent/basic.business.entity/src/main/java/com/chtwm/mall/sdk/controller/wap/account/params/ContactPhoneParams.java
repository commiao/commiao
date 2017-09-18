package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

public class ContactPhoneParams implements Serializable{
    
    private static final long serialVersionUID = 6292702277836029709L;
    private String phone;
    private String imgCode;
	private String code;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getImgCode() {
		return imgCode;
	}
	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
	
}
