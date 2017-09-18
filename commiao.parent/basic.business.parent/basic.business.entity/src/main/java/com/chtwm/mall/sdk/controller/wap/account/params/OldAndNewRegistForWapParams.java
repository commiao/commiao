package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

public class OldAndNewRegistForWapParams implements Serializable {
	private static final long serialVersionUID = -1075141497596110643L;
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private String mobile_tel;//手机号
	private String code;//手机验证码
	private String imageCode;//图片验证码
	private String password;//密码    
	private String aesEncrypt;//加密串（包含老客户Id和理财师）
	
	public String getImageCode() {
		return imageCode;
	}
	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile_tel() {
		return mobile_tel;
	}
	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
    public String getAesEncrypt() {
        return aesEncrypt;
    }
    public void setAesEncrypt(String aesEncrypt) {
        this.aesEncrypt = aesEncrypt;
    }

}
