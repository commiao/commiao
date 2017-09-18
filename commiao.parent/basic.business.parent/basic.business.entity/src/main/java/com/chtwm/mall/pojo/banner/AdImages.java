package com.chtwm.mall.pojo.banner;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class AdImages  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 编号
     */
    private Long seqNo;
    /**
     * 所在位置
     */
    private String adPosition;
    /**
     *  所在位置描述
     */
    private String adPositionDesc;
    
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 活动地址
     */
    private String activityName;
    /**
     * 链接
     */
    private String linkUrl;
    /**
     * 状态 1 启用  0 停用
     */
    private Integer adStatus;
    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 更新时间
     */
    private Date updatetime;
    /**
     * 创建人ID
     */
    private Long createId;
    /**
     * 创建人名称
     */
    private String createName;
    /**
     * 修改人ID
     */
    private Long updateId;
    /**
     * 修改人名称
     */
    private String updateName;
    /**
     * 是否可分享
     */
    private Integer isShare;
    
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
     *seqNo的setter方法
     **/     
    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }
     /**
     *seqNo的getter方法
     **/ 
    public Long getSeqNo() {
        return this.seqNo;
    }
    
    /**
     *adPosition的setter方法
     **/     
    public void setAdPosition(String adPosition) {
        this.adPosition = adPosition;
    }
     /**
     *adPosition的getter方法
     **/ 
    public String getAdPosition() {
        return this.adPosition;
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
     *linkUrl的setter方法
     **/     
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
     /**
     *linkUrl的getter方法
     **/ 
    public String getLinkUrl() {
        return this.linkUrl;
    }
    
    /**
     *adStatus的setter方法
     **/     
    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
    }
     /**
     *adStatus的getter方法
     **/ 
    public Integer getAdStatus() {
        return this.adStatus;
    }
    
    /**
     *description的setter方法
     **/     
    public void setDescription(String description) {
        this.description = description;
    }
     /**
     *description的getter方法
     **/ 
    public String getDescription() {
        return this.description;
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
    public String getActivityName() {
        return activityName;
    }
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    public String getAdPositionDesc() {
        return adPositionDesc;
    }
    public void setAdPositionDesc(String adPositionDesc) {
        this.adPositionDesc = adPositionDesc;
    }
    public Long getCreateId() {
        return createId;
    }
    public void setCreateId(Long createId) {
        this.createId = createId;
    }
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public Long getUpdateId() {
        return updateId;
    }
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
	public Integer getIsShare() {
		return isShare;
	}
	
	public void setIsShare(Integer isShare) {
		this.isShare = isShare;
	}
}