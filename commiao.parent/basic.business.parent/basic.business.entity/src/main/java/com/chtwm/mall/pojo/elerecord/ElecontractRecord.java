package com.chtwm.mall.pojo.elerecord;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ElecontractRecord  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 流水号
     */
    private String sequenceNo;
    
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 注册手机号
     */
    private String loginPhone;
    /**
     * 联系手机号
     */
    private String mobileTel;
    /**
     * 产品代码
     */
    private String fundCode;
    /**
     * 产品名称
     */
    private String fundName;
    /**
     * 电子合同激活码
     */
    private String activeCode;
    /**
     * 备注1
     */
    private String remark1;
    /**
     * 备注2
     */
    private String remark2;
    /**
     * 插入时间
     */
    private Date inserttime;
    /**
     * 更新时间
     */
    private Date updatetime;
    
    /**
     * 客户端类型
     */
    private String clientType;
    
    /**
     * 证件类型
     */
    private String creditType;
    /**
     * 证件号码
     */
    private String creditNo;
    /**
     * 加密后证件号码
     */
    private String encryptCreditNo;
    /**
     * 银行卡号
     */
    private String bankNo;
    /**
     * 加密后银行卡号
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
     *loginPhone的setter方法
     **/     
    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }
     /**
     *loginPhone的getter方法
     **/ 
    public String getLoginPhone() {
        return this.loginPhone;
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
    
    /**
     *fundCode的setter方法
     **/     
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }
     /**
     *fundCode的getter方法
     **/ 
    public String getFundCode() {
        return this.fundCode;
    }
    
    /**
     *fundName的setter方法
     **/     
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
     /**
     *fundName的getter方法
     **/ 
    public String getFundName() {
        return this.fundName;
    }
    
    /**
     *activeCode的setter方法
     **/     
    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }
     /**
     *activeCode的getter方法
     **/ 
    public String getActiveCode() {
        return this.activeCode;
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
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public String getCreditType() {
		return creditType;
	}
	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getEncryptCreditNo() {
		return encryptCreditNo;
	}
	public void setEncryptCreditNo(String encryptCreditNo) {
		this.encryptCreditNo = encryptCreditNo;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getEncryptBankNo() {
		return encryptBankNo;
	}
	public void setEncryptBankNo(String encryptBankNo) {
		this.encryptBankNo = encryptBankNo;
	}

}