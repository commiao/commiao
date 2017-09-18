package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

public class ResetPwdParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 6098115459592228682L;
	private String mobile_no_internet;//注册手机号 
	private String send_smscode_phone;//联系人手机号 
    private String img_code;//,//验证码
    private String code;//手机验证码
    private String newPassword;//新密码
    private String cust_type;//客户类型 0.机构 1.个人
    

	public String getSend_smscode_phone() {
        return send_smscode_phone;
    }
    public void setSend_smscode_phone(String send_smscode_phone) {
        this.send_smscode_phone = send_smscode_phone;
    }
    public String getMobile_no_internet() {
		return mobile_no_internet;
	}
	public void setMobile_no_internet(String mobile_no_internet) {
		this.mobile_no_internet = mobile_no_internet;
	}
	public String getImg_code() {
		return img_code;
	}
	public void setImg_code(String img_code) {
		this.img_code = img_code;
	}
	public String getCust_type() {
		return cust_type;
	}
	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
