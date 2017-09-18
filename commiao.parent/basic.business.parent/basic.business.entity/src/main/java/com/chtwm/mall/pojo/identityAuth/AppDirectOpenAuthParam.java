package com.chtwm.mall.pojo.identityAuth;


/**
 * 鉴权、实名认证、开户
 * Create Author: wrx
 * CreateDate:2016年11月29日下午7:38:29 
 * @author:wrx
 * @version V1.0
 */
public class AppDirectOpenAuthParam {
    private String custName;// 姓名
    private String custIdType;// 证件类型
    private String custIdNo;// 证件号码
    private String mobileNo;// 手机号码
    private String bankName;// 发卡银行名称
    private String bankIdNo;// 发卡银行代码
    private String bankCardNo;// 银行卡号
    private String branchNo;// 联行号
    private String originalSerialNo;// 原流水号
    private String smsCode;// 短信验证码
    private String password; // 交易密码
    private String protocolNo;//协议号
    private String province;//省份
    private String city;//城市
    private String operId;
	private String birthday;//出生日期 8位19900505
    private String vocation;//职业类型
    private String messageAddress;//通讯地址
    private String beneficiary;//实际受益人
    private String serialNo;//流水号
    private String imgCode;//图文验证码
    private String clientType;//客户端类型
    private String stepId;//鉴权步骤
    
    public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getImgCode() {
		return imgCode;
	}
	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getStepId() {
		return stepId;
	}
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	public String getOperId() {
		return operId;
	}
	public void setOperId(String operId) {
		this.operId = operId;
	}

    public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getVocation() {
		return vocation;
	}
	public void setVocation(String vocation) {
		this.vocation = vocation;
	}
	public String getMessageAddress() {
		return messageAddress;
	}
	public void setMessageAddress(String messageAddress) {
		this.messageAddress = messageAddress;
	}
	public String getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}
	public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustIdType() {
        return custIdType;
    }
    public void setCustIdType(String custIdType) {
        this.custIdType = custIdType;
    }
    public String getCustIdNo() {
        return custIdNo;
    }
    public void setCustIdNo(String custIdNo) {
        this.custIdNo = custIdNo;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankIdNo() {
        return bankIdNo;
    }
    public void setBankIdNo(String bankIdNo) {
        this.bankIdNo = bankIdNo;
    }
    public String getBankCardNo() {
        return bankCardNo;
    }
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }
    public String getBranchNo() {
        return branchNo;
    }
    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }
    public String getOriginalSerialNo() {
        return originalSerialNo;
    }
    public void setOriginalSerialNo(String originalSerialNo) {
        this.originalSerialNo = originalSerialNo;
    }
    public String getSmsCode() {
        return smsCode;
    }
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getProtocolNo() {
        return protocolNo;
    }
    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }
}
