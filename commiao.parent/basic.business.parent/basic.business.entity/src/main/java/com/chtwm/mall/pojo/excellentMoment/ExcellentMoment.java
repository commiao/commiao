package com.chtwm.mall.pojo.excellentMoment;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ExcellentMoment  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 恒乐汇精彩瞬间
     */
    private Long id;
    /**
     * 图片名称
     */
    private String imgName;
    /**
     * 图片介绍
     */
    private String imgIntroduce;
    /**
     * 序列号
     */
    private Long serialNumber;
    /**
     * 图片
     */
    private String imgUrl;
    /**
     * 缩略图
     */
    private String imgThumbnailUrl;
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
     * 链接
     */
    private String linkurl;
    /**
     * 平台类型
     */
    private String platform;
    
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
     *imgName的setter方法
     **/     
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
     /**
     *imgName的getter方法
     **/ 
    public String getImgName() {
        return this.imgName;
    }
    
    /**
     *imgIntroduce的setter方法
     **/     
    public void setImgIntroduce(String imgIntroduce) {
        this.imgIntroduce = imgIntroduce;
    }
     /**
     *imgIntroduce的getter方法
     **/ 
    public String getImgIntroduce() {
        return this.imgIntroduce;
    }
    
    /**
     *serialNumber的setter方法
     **/     
    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }
     /**
     *serialNumber的getter方法
     **/ 
    public Long getSerialNumber() {
        return this.serialNumber;
    }
    
    /**
     *imgUrl的setter方法
     **/     
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
     /**
     *imgUrl的getter方法
     **/ 
    public String getImgUrl() {
        return this.imgUrl;
    }
    
    /**
     *imgThumbnailUrl的setter方法
     **/     
    public void setImgThumbnailUrl(String imgThumbnailUrl) {
        this.imgThumbnailUrl = imgThumbnailUrl;
    }
     /**
     *imgThumbnailUrl的getter方法
     **/ 
    public String getImgThumbnailUrl() {
        return this.imgThumbnailUrl;
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
    
    public String getLinkurl() {
        return linkurl;
    }
    
    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
}