package com.chtwm.mall.pojo.inviteRegister;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;


/**
 * 
 */
public class InviteRegister  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * id
     */
    private Long id;
    /**
     * 新用户userId
     */
    private String newCustomerNo;
    /**
     * 老用户userId
     */
    private String oldCustomerNo;
    /**
     * 理财师工号
     */
    private String financialNo;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 理顾宝返回状态
     */
    private String status;
    /**
     * 理顾宝返回信息
     */
    private String message;
    /**
     * 注册用户手机加密串
     */
    private String encryPhone;
    
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
     *newCustomerNo的setter方法
     **/     
    public void setNewCustomerNo(String newCustomerNo) {
        this.newCustomerNo = newCustomerNo;
    }
     /**
     *newCustomerNo的getter方法
     **/ 
    public String getNewCustomerNo() {
        return this.newCustomerNo;
    }
    
    /**
     *oldCustomerNo的setter方法
     **/     
    public void setOldCustomerNo(String oldCustomerNo) {
        this.oldCustomerNo = oldCustomerNo;
    }
     /**
     *oldCustomerNo的getter方法
     **/ 
    public String getOldCustomerNo() {
        return this.oldCustomerNo;
    }
    
    /**
     *financialNo的setter方法
     **/     
    public void setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
    }
     /**
     *financialNo的getter方法
     **/ 
    public String getFinancialNo() {
        return this.financialNo;
    }
	public String getCreatetimeString() {
	  return DateUtils.formatDateToString(getCreatetime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCreatetimeString(String createtimeStr) {
	  setCreatetime(DateUtils.parse(createtimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *createtime的setter方法
     **/     
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
     /**
     *createtime的getter方法
     **/ 
    public Date getCreatetime() {
        return this.createtime;
    }
    
    /**
     *status的setter方法
     **/     
    public void setStatus(String status) {
        this.status = status;
    }
     /**
     *status的getter方法
     **/ 
    public String getStatus() {
        return this.status;
    }
    
    /**
     *message的setter方法
     **/     
    public void setMessage(String message) {
        this.message = message;
    }
     /**
     *message的getter方法
     **/ 
    public String getMessage() {
        return this.message;
    }
    public String getEncryPhone() {
        return encryPhone;
    }
    public void setEncryPhone(String encryPhone) {
        this.encryPhone = encryPhone;
    }
    
}