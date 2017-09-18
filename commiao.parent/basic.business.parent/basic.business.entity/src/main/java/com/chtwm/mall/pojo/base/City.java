package com.chtwm.mall.pojo.base;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class City  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * id
     */
    private Long id;
    /**
     * 编码
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 区域ID
     */
    private Long regionId;
    /**
     * 区域名称
     */
    private String regionName;
    /**
     * 是否热门城市
     */
    private int isPopularCity;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态
     */
    private int enables;
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
     *regionId的setter方法
     **/     
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
     /**
     *regionId的getter方法
     **/ 
    public Long getRegionId() {
        return this.regionId;
    }
    
    /**
     *regionName的setter方法
     **/     
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
     /**
     *regionName的getter方法
     **/ 
    public String getRegionName() {
        return this.regionName;
    }
    
    /**
     *isPopularCity的setter方法
     **/     
    public void setIsPopularCity(int isPopularCity) {
        this.isPopularCity = isPopularCity;
    }
     /**
     *isPopularCity的getter方法
     **/ 
    public int getIsPopularCity() {
        return this.isPopularCity;
    }
    
    /**
     *remark的setter方法
     **/     
    public void setRemark(String remark) {
        this.remark = remark;
    }
     /**
     *remark的getter方法
     **/ 
    public String getRemark() {
        return this.remark;
    }
    
    /**
     *enables的setter方法
     **/     
    public void setEnables(int enables) {
        this.enables = enables;
    }
     /**
     *enables的getter方法
     **/ 
    public int getEnables() {
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