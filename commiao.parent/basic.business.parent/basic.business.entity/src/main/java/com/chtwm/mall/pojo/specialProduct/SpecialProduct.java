package com.chtwm.mall.pojo.specialProduct;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class SpecialProduct  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 专户产品
     */
    private Long id;
    /**
     * 客户端类型
     */
    private String platform;
    /**
     * 产品代码
     */
    private String code;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 协议ID
     */
    private String protocolId;
    /**
     * 电子合同ID
     */
    private Long electronicId;
    /**
     * 风险揭示书ID
     */
    private Long riskDocId;
    /**
     * 状态
     */
    private Integer enables;
    /**
     * 创建人ID
     */
    private Long createId;
    /**
     * 修改人ID
     */
    private Long updateId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    
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
     *platform的setter方法
     **/     
    public void setPlatform(String platform) {
        this.platform = platform;
    }
     /**
     *platform的getter方法
     **/ 
    public String getPlatform() {
        return this.platform;
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
     *protocolId的setter方法
     **/     
    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }
     /**
     *protocolId的getter方法
     **/ 
    public String getProtocolId() {
        return this.protocolId;
    }
    
    /**
     *electronicId的setter方法
     **/     
    public void setElectronicId(Long electronicId) {
        this.electronicId = electronicId;
    }
     /**
     *electronicId的getter方法
     **/ 
    public Long getElectronicId() {
        return this.electronicId;
    }
    
    /**
     *riskDocId的setter方法
     **/     
    public void setRiskDocId(Long riskDocId) {
        this.riskDocId = riskDocId;
    }
     /**
     *riskDocId的getter方法
     **/ 
    public Long getRiskDocId() {
        return this.riskDocId;
    }
    
    /**
     *enables的setter方法
     **/     
    public void setEnables(Integer enables) {
        this.enables = enables;
    }
     /**
     *enables的getter方法
     **/ 
    public Integer getEnables() {
        return this.enables;
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
 * 创建人名称
 */
private String createName;
/**
 * 修改人名称
 */
private String updateName;
    
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
}