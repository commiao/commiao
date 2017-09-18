package com.chtwm.mall.pojo.verifyCode;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class VerifyCode  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Integer id;
    /**
     * 
     */
    private String code;
    /**
     * 
     */
    private Date codeTime;
    /**
     * 
     */
    private String type;
    /**
     * 
     */
    private String account;
    /**
     * 
     */
    private String memo;
    /**
     * 
     */
    private String email;
    /**
     * 
     */
    private String custNo;

    
    /**
     *id的setter方法
     **/     
    public void setId(Integer id) {
        this.id = id;
    }
     /**
     *id的getter方法
     **/ 
    public Integer getId() {
        return this.id;
    }
    
    /**
     *code的setter方法
     **/     
    public void setCode(String code) {
        this.code = code;
    }
     /**
     *code的getter方法
     **/ 
    public String getCode() {
        return this.code;
    }
	public String getCodeTimeString() {
	  return DateUtils.formatDateToString(getCodeTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCodeTimeString(String codeTimeStr) {
	  setCodeTime(DateUtils.parse(codeTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *codeTime的setter方法
     **/     
    public void setCodeTime(Date codeTime) {
        this.codeTime = codeTime;
    }
     /**
     *codeTime的getter方法
     **/ 
    public Date getCodeTime() {
        return this.codeTime;
    }
    
    /**
     *type的setter方法
     **/     
    public void setType(String type) {
        this.type = type;
    }
     /**
     *type的getter方法
     **/ 
    public String getType() {
        return this.type;
    }
    
    /**
     *account的setter方法
     **/     
    public void setAccount(String account) {
        this.account = account;
    }
     /**
     *account的getter方法
     **/ 
    public String getAccount() {
        return this.account;
    }
    
    /**
     *memo的setter方法
     **/     
    public void setMemo(String memo) {
        this.memo = memo;
    }
     /**
     *memo的getter方法
     **/ 
    public String getMemo() {
        return this.memo;
    }
    
    /**
     *email的setter方法
     **/     
    public void setEmail(String email) {
        this.email = email;
    }
     /**
     *email的getter方法
     **/ 
    public String getEmail() {
        return this.email;
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


}