package com.chtwm.mall.pojo.identityAuth;

import java.io.Serializable;

/** 
 * @Description: 调用鉴权参数
 * @author:wrx
 * @version V1.0   
 */
public class QueryPayIdentityAuthParam implements Serializable{

    private static final long serialVersionUID = 8113842089711706718L;
    /**
     * 真实姓名
     */
    private String custName;
    /**
     * 证件号码
     */
    private String custIdNo;
    /**
     * 证件类型
     */
    private String custIdType;
    /**
     * 发卡银行名称
     */
    private String bankName;
    /**
     * 发卡银行代码
     */
    private String bankIdNo;
    /**
     * 银行卡号
     */
    private String bankCardNo;
    /**
     * 手机号码
     */
    private String mobileNo;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 联行号
     */
    private String branchNo;
    /**
     * 流水号
     */
    private String serialNo;
    /**
     * 原流水号
     */
    private String originalSerialNo;
    /**
     * 验证码
     */
    private String smsCode;
    /**
     * 鉴权步骤Id
     */
    private String stepId;
    
    /**
     * 协议号
     */
    private String protocolNo;
	
    private String birthday;//出生日期 8位19900505
    
 

	private String vocation;//职业类型
     
    private String messageAddress;//通讯地址
     
    private String beneficiary;//实际受益人

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
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
    /**
     * 获取 真实姓名
     * 
     * @return custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 获取 证件号码
     * 
     * @return custIdNo
     */
    public String getCustIdNo() {
        return custIdNo;
    }

    /**
     * 获取 证件类型
     * 
     * @return custIdType
     */
    public String getCustIdType() {
        return custIdType;
    }

    /**
     * 获取 发卡银行名称
     * 
     * @return bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 获取 发卡银行代码
     * 
     * @return bankIdNo
     */
    public String getBankIdNo() {
        return bankIdNo;
    }

    /**
     * 获取 银行卡号
     * 
     * @return bankCardNo
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 获取 手机号码
     * 
     * @return mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 获取 省份
     * 
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * 获取 城市
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 获取 联行号
     * 
     * @return branchNo
     */
    public String getBranchNo() {
        return branchNo;
    }

    /**
     * 获取 流水号
     * 
     * @return serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 获取 原流水号
     * 
     * @return originalSerialNo
     */
    public String getOriginalSerialNo() {
        return originalSerialNo;
    }

    /**
     * 获取 验证码
     * 
     * @return smsCode
     */
    public String getSmsCode() {
        return smsCode;
    }

    /**
     * 获取 鉴权步骤Id
     * 
     * @return stepId
     */
    public String getStepId() {
        return stepId;
    }

    /**
     * 设置 真实姓名
     * 
     * @param custName
     *            the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 设置 证件号码
     * 
     * @param custIdNo
     *            the custIdNo to set
     */
    public void setCustIdNo(String custIdNo) {
        this.custIdNo = custIdNo;
    }

    /**
     * 设置 证件类型
     * 
     * @param custIdType
     *            the custIdType to set
     */
    public void setCustIdType(String custIdType) {
        this.custIdType = custIdType;
    }

    /**
     * 设置 发卡银行名称
     * 
     * @param bankName
     *            the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 设置 发卡银行代码
     * 
     * @param bankIdNo
     *            the bankIdNo to set
     */
    public void setBankIdNo(String bankIdNo) {
        this.bankIdNo = bankIdNo;
    }

    /**
     * 设置 银行卡号
     * 
     * @param bankCardNo
     *            the bankCardNo to set
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 设置 手机号码
     * 
     * @param mobileNo
     *            the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 设置 省份
     * 
     * @param province
     *            the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 设置 城市
     * 
     * @param city
     *            the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 设置 联行号
     * 
     * @param branchNo
     *            the branchNo to set
     */
    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    /**
     * 设置 流水号
     * 
     * @param serialNo
     *            the serialNo to set
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * 设置 原流水号
     * 
     * @param originalSerialNo
     *            the originalSerialNo to set
     */
    public void setOriginalSerialNo(String originalSerialNo) {
        this.originalSerialNo = originalSerialNo;
    }

    /**
     * 设置 验证码
     * 
     * @param smsCode
     *            the smsCode to set
     */
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    /**
     * 设置 鉴权步骤Id
     * 
     * @param stepId
     *            the stepId to set
     */
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

}
