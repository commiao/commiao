package com.chtwm.mall.pojo.certFile;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class CertFile  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 
     */
    private String pathLocal;
    /**
     * 
     */
    private String pathWeb;
    /**
     * 
     */
    private String acctNo;
    /**
     * 
     */
    private String phone;
    /**
     * 
     */
    private String source;
    /**
     * 
     */
    private String fileType;
    /**
     * 
     */
    private String auditStatus;
    /**
     * 
     */
    private String createUser;
    /**
     * 
     */
    private Date createDate;
    /**
     * 
     */
    private String updateUser;
    /**
     * 
     */
    private Date updateDate;
    /**
     * 
     */
    private String memo;
    
    /**
     * 加密手机号码
     */
    private String encryPhone;

    
    public String getEncryPhone() {
		return encryPhone;
	}
	public void setEncryPhone(String encryPhone) {
		this.encryPhone = encryPhone;
	}
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
     *pathLocal的setter方法
     **/     
    public void setPathLocal(String pathLocal) {
        this.pathLocal = pathLocal;
    }
     /**
     *pathLocal的getter方法
     **/ 
    public String getPathLocal() {
        return this.pathLocal;
    }
    
    /**
     *pathWeb的setter方法
     **/     
    public void setPathWeb(String pathWeb) {
        this.pathWeb = pathWeb;
    }
     /**
     *pathWeb的getter方法
     **/ 
    public String getPathWeb() {
        return this.pathWeb;
    }
    
    /**
     *acctNo的setter方法
     **/     
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }
     /**
     *acctNo的getter方法
     **/ 
    public String getAcctNo() {
        return this.acctNo;
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
    
    /**
     *source的setter方法
     **/     
    public void setSource(String source) {
        this.source = source;
    }
     /**
     *source的getter方法
     **/ 
    public String getSource() {
        return this.source;
    }
    
    /**
     *fileType的setter方法
     **/     
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
     /**
     *fileType的getter方法
     **/ 
    public String getFileType() {
        return this.fileType;
    }
    
    /**
     *auditStatus的setter方法
     **/     
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
     /**
     *auditStatus的getter方法
     **/ 
    public String getAuditStatus() {
        return this.auditStatus;
    }
    
    /**
     *createUser的setter方法
     **/     
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
     /**
     *createUser的getter方法
     **/ 
    public String getCreateUser() {
        return this.createUser;
    }
	public String getCreateDateString() {
	  return DateUtils.formatDateToString(getCreateDate(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCreateDateString(String createDateStr) {
	  setCreateDate(DateUtils.parse(createDateStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *createDate的setter方法
     **/     
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
     /**
     *createDate的getter方法
     **/ 
    public Date getCreateDate() {
        return this.createDate;
    }
    
    /**
     *updateUser的setter方法
     **/     
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
     /**
     *updateUser的getter方法
     **/ 
    public String getUpdateUser() {
        return this.updateUser;
    }
	public String getUpdateDateString() {
	  return DateUtils.formatDateToString(getUpdateDate(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setUpdateDateString(String updateDateStr) {
	  setUpdateDate(DateUtils.parse(updateDateStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *updateDate的setter方法
     **/     
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
     /**
     *updateDate的getter方法
     **/ 
    public Date getUpdateDate() {
        return this.updateDate;
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


}