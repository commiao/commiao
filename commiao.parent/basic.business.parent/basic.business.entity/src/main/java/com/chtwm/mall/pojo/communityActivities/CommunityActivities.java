package com.chtwm.mall.pojo.communityActivities;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;


/**
 * 
 */
public class CommunityActivities  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 社区活动
     */
    private Long id;
    /**
     * 社区活动
     */
    private String actName;
    /**
     * 序列号
     */
    private Long serialNumber;
    /**
     * 活动地点
     */
    private String actPlace;
    /**
     * 活动介绍
     */
    private String actIntroduce;
    /**
     * 开始时间
     */
    private Date beginTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 是否开启服务 0否 1 是
     */
    private Integer isOpenServer;
    /**
     * 截止报名时间
     */
    private Date closingTime;
    /**
     * 图片
     */
    private String imgUrl;
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
     * 客户端类型
     */
    private String platform;

    /**
     * 社区描述
     */
    private String actUrl;
    /**
     * 社区标题（用于分享）
     */
    private String actTitle;
    
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
     *actName的setter方法
     **/     
    public void setActName(String actName) {
        this.actName = actName;
    }
     /**
     *actName的getter方法
     **/ 
    public String getActName() {
        return this.actName;
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
     *actPlace的setter方法
     **/     
    public void setActPlace(String actPlace) {
        this.actPlace = actPlace;
    }
     /**
     *actPlace的getter方法
     **/ 
    public String getActPlace() {
        return this.actPlace;
    }
    
    /**
     *actIntroduce的setter方法
     **/     
    public void setActIntroduce(String actIntroduce) {
        this.actIntroduce = actIntroduce;
    }
     /**
     *actIntroduce的getter方法
     **/ 
    public String getActIntroduce() {
        return this.actIntroduce;
    }
	public String getBeginTimeString() {
	  return DateUtils.formatDateToString(getBeginTime(), "yyyy-MM-dd");
	}
	public void setBeginTimeString(String beginTimeStr) {
	  setBeginTime(DateUtils.parse(beginTimeStr, "yyyy-MM-dd"));
	}
    
    /**
     *beginTime的setter方法
     **/     
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
     /**
     *beginTime的getter方法
     **/ 
    public Date getBeginTime() {
        return this.beginTime;
    }
	public String getEndTimeString() {
	  return DateUtils.formatDateToString(getEndTime(), "yyyy-MM-dd");
	}
	public void setEndTimeString(String endTimeStr) {
	  setEndTime(DateUtils.parse(endTimeStr, "yyyy-MM-dd"));
	}
    
    /**
     *endTime的setter方法
     **/     
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
     /**
     *endTime的getter方法
     **/ 
    public Date getEndTime() {
        return this.endTime;
    }
    
    /**
     *isOpenServer的setter方法
     **/     
    public void setIsOpenServer(Integer isOpenServer) {
        this.isOpenServer = isOpenServer;
    }
     /**
     *isOpenServer的getter方法
     **/ 
    public Integer getIsOpenServer() {
        return this.isOpenServer;
    }
	public String getClosingTimeString() {
	  return DateUtils.formatDateToString(getClosingTime(), "yyyy-MM-dd");
	}
	public void setClosingTimeString(String closingTimeStr) {
	  setClosingTime(DateUtils.parse(closingTimeStr, "yyyy-MM-dd"));
	}
    
    /**
     *closingTime的setter方法
     **/     
    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }
     /**
     *closingTime的getter方法
     **/ 
    public Date getClosingTime() {
        return this.closingTime;
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
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getActUrl() {
        return actUrl;
    }
    public void setActUrl(String actUrl) {
        this.actUrl = actUrl;
    }
    public String getActTitle() {
        return actTitle;
    }
    public void setActTitle(String actTitle) {
        this.actTitle = actTitle;
    }
    
}