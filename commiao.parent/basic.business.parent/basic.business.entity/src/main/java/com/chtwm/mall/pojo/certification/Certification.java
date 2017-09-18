package com.chtwm.mall.pojo.certification;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class Certification  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 注册手机号
     */
    private String mobileTel;
    /**
     * 注册手机号加密
     */
    private String mobileTelEncry;
    /**
     * 姓名
     */
    private String name;
    /**
     * 证件类型
     */
    private String idType;
    /**
     * 证件号码
     */
    private String idNo;
    /**
     * 银行类型
     */
    private String bankType;
    /**
     * 银行卡号
     */
    private String bankNo;
    /**
     * 预留手机号
     */
    private String phone;
    /**
     * 
     */
    private Date inserttime;
    /**
     * 
     */
    private Date updatetime;
    /**
     * 
     */
    private String remark1;
    /**
     * 
     */
    private String remark2;
    
    /**
     * 
     */
    private String clientType;
    /**
     * 加密证件号
     */
	private String encryptIdNo;
    /**
     * 加密银行卡号
     */
    private String encryptBankNo;

    
	/**
     *id的setter方法
     **/     
    public void setId(Long id) {
        this.id = id;
    }
     /**
     *id的getter方法
     **/ 
    public Long getId() {
        return this.id;
    }
    
    /**
     *custNo的setter方法
     **/     
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
     /**
     *custNo的getter方法
     **/ 
    public String getCustNo() {
        return this.custNo;
    }
    
    /**
     *mobileTel的setter方法
     **/     
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }
     /**
     *mobileTel的getter方法
     **/ 
    public String getMobileTel() {
        return this.mobileTel;
    }
    
    public String getMobileTelEncry() {
        return mobileTelEncry;
    }
    public void setMobileTelEncry(String mobileTelEncry) {
        this.mobileTelEncry = mobileTelEncry;
    }
    /**
     *name的setter方法
     **/     
    public void setName(String name) {
        this.name = name;
    }
     /**
     *name的getter方法
     **/ 
    public String getName() {
        return this.name;
    }
    
    /**
     *idType的setter方法
     **/     
    public void setIdType(String idType) {
        this.idType = idType;
    }
     /**
     *idType的getter方法
     **/ 
    public String getIdType() {
        return this.idType;
    }
    
    /**
     *idNo的setter方法
     **/     
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
     /**
     *idNo的getter方法
     **/ 
    public String getIdNo() {
        return this.idNo;
    }
    
    /**
     *bankType的setter方法
     **/     
    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
     /**
     *bankType的getter方法
     **/ 
    public String getBankType() {
        return this.bankType;
    }
    
    /**
     *bankNo的setter方法
     **/     
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }
     /**
     *bankNo的getter方法
     **/ 
    public String getBankNo() {
        return this.bankNo;
    }
    
    /**
     *phone的setter方法
     **/     
    public void setPhone(String phone) {
        this.phone = phone;
    }
     /**
     *phone的getter方法
     **/ 
    public String getPhone() {
        return this.phone;
    }
	public String getInserttimeString() {
	  return DateUtils.formatDateToString(getInserttime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setInserttimeString(String inserttimeStr) {
	  setInserttime(DateUtils.parse(inserttimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *inserttime的setter方法
     **/     
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
     /**
     *inserttime的getter方法
     **/ 
    public Date getInserttime() {
        return this.inserttime;
    }
	public String getUpdatetimeString() {
	  return DateUtils.formatDateToString(getUpdatetime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setUpdatetimeString(String updatetimeStr) {
	  setUpdatetime(DateUtils.parse(updatetimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *updatetime的setter方法
     **/     
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
     /**
     *updatetime的getter方法
     **/ 
    public Date getUpdatetime() {
        return this.updatetime;
    }
    
    /**
     *remark1的setter方法
     **/     
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }
     /**
     *remark1的getter方法
     **/ 
    public String getRemark1() {
        return this.remark1;
    }
    
    /**
     *remark2的setter方法
     **/     
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
     /**
     *remark2的getter方法
     **/ 
    public String getRemark2() {
        return this.remark2;
    }
    public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
    public String getEncryptIdNo() {
		return encryptIdNo;
	}
	public String getEncryptBankNo() {
		return encryptBankNo;
	}
	public void setEncryptIdNo(String encryptIdNo) {
		this.encryptIdNo = encryptIdNo;
	}
	public void setEncryptBankNo(String encryptBankNo) {
		this.encryptBankNo = encryptBankNo;
	}
}