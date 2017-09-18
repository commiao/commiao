package com.chtwm.mall.pojo.faceId;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class FaceIdentifyTimes  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 主键
     */
    private Long id;
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 识别次数类型（1.ocr识别 2.比对照片）
     */
    private String identifyType;
    /**
     * ocr识别次数
     */
    private Integer ocrTimes;
    /**
     * 公安部照片比对次数
     */
    private Integer policyTimes;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 创建人ID
     */
    private Long createId;
    /**
     * 修改人ID
     */
    private Long updateId;

    
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
     *identifyType的setter方法
     **/     
    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }
     /**
     *identifyType的getter方法
     **/ 
    public String getIdentifyType() {
        return this.identifyType;
    }
    
    /**
     *ocrTimes的setter方法
     **/     
    public void setOcrTimes(Integer ocrTimes) {
        this.ocrTimes = ocrTimes;
    }
     /**
     *ocrTimes的getter方法
     **/ 
    public Integer getOcrTimes() {
        return this.ocrTimes;
    }
    
    /**
     *policyTimes的setter方法
     **/     
    public void setPolicyTimes(Integer policyTimes) {
        this.policyTimes = policyTimes;
    }
     /**
     *policyTimes的getter方法
     **/ 
    public Integer getPolicyTimes() {
        return this.policyTimes;
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
	public String getUpdateTimeString() {
	  return DateUtils.formatDateToString(getUpdateTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setUpdateTimeString(String updateTimeStr) {
	  setUpdateTime(DateUtils.parse(updateTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *updateTime的setter方法
     **/     
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
     /**
     *updateTime的getter方法
     **/ 
    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    /**
     *createId的setter方法
     **/     
    public void setCreateId(Long createId) {
        this.createId = createId;
    }
     /**
     *createId的getter方法
     **/ 
    public Long getCreateId() {
        return this.createId;
    }
    
    /**
     *updateId的setter方法
     **/     
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
     /**
     *updateId的getter方法
     **/ 
    public Long getUpdateId() {
        return this.updateId;
    }


}