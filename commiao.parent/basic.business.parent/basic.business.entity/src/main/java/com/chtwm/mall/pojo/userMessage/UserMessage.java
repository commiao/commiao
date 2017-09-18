package com.chtwm.mall.pojo.userMessage;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class UserMessage  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 主键
     */
    private Long id;
    /**
     * 注册手机号
     */
    private String mobileNoInternet;
    /**
     * 加密手机号
     */
    private String mobileNoInternetEncry;
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 消息编码
     */
    private String mesCode;
    /**
     * 消息标题
     */
    private String mesTitle;
    /**
     * 消息内容
     */
    private String mesContent;
    /**
     * 建立时间
     */
    private Date createTime;
    /**
     * 插入时间
     */
    private Date inserttime;
    /**
     * 更新时间
     */
    private Date updatetime;
    /**
     * 客户类型
     */
    private String custType;
    
    public String getCustType() {
        return custType;
    }
    public void setCustType(String custType) {
        this.custType = custType;
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
     *mobileNoInternet的setter方法
     **/     
    public void setMobileNoInternet(String mobileNoInternet) {
        this.mobileNoInternet = mobileNoInternet;
    }
     /**
     *mobileNoInternet的getter方法
     **/ 
    public String getMobileNoInternet() {
        return this.mobileNoInternet;
    }
    
    public String getMobileNoInternetEncry() {
        return mobileNoInternetEncry;
    }
    public void setMobileNoInternetEncry(String mobileNoInternetEncry) {
        this.mobileNoInternetEncry = mobileNoInternetEncry;
    }
    public String getCustNo() {
        return custNo;
    }
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
    /**
     *mesCode的setter方法
     **/     
    public void setMesCode(String mesCode) {
        this.mesCode = mesCode;
    }
     /**
     *mesCode的getter方法
     **/ 
    public String getMesCode() {
        return this.mesCode;
    }
    
    /**
     *mesTitle的setter方法
     **/     
    public void setMesTitle(String mesTitle) {
        this.mesTitle = mesTitle;
    }
     /**
     *mesTitle的getter方法
     **/ 
    public String getMesTitle() {
        return this.mesTitle;
    }
    
    /**
     *mesContent的setter方法
     **/     
    public void setMesContent(String mesContent) {
        this.mesContent = mesContent;
    }
     /**
     *mesContent的getter方法
     **/ 
    public String getMesContent() {
        return this.mesContent;
    }
	public String getCreateTimeString() {
	  return DateUtils.formatDateToString(getCreateTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCreateTimeString(String createTimeStr) {
	  setCreateTime(DateUtils.parse(createTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *createTime的setter方法
     **/     
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
     /**
     *createTime的getter方法
     **/ 
    public Date getCreateTime() {
        return this.createTime;
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


}