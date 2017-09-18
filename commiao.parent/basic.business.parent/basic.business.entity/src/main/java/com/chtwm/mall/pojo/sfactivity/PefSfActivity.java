package com.chtwm.mall.pojo.sfactivity;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class PefSfActivity  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 活动Id
     */
    private String id;
    /**
     * 市场活动名称
     */
    private String name;
    /**
     * 活动类型
     */
    private String type;
    /**
     * 活动主题
     */
    private String theme;
    /**
     * 活动形式
     */
    private String form;
    /**
     * 活动开始时间
     */
    private Date startDate;
    /**
     * 活动结束时间
     */
    private Date endDate;
    /**
     * 活动报名方式
     */
    private String applyType;
    /**
     * 是否启用
     */
    private Integer isActive;
    /**
     * 活动状态
     */
    private String status;
    /**
     * 报名开始日期
     */
    private Date applyStartDate;
    /**
     * 报名结束日期
     */
    private Date applyEndDate;
    /**
     * 审批状态
     */
    private String approvalStatus;
    /**
     * 目标客户类型
     */
    private String targetAccountType;
    /**
     * 活动介绍
     */
    private String introduce;
    /**
     * 活动描述
     */
    private String description;
    /**
     * 活动流程
     */
    private String flow;
    /**
     * 活动地点
     */
    private String address;
    /**
     * 活动规模
     */
    private String scale;
    /**
     * 预约完成时间
     */
    private Date finishDate;
    /**
     * 操作时间
     */
    private Date operateDate;
    /**
     * 预约状态
     */
    private String applyStatus;
    /**
     * 参与状态
     */
    private String attendStatus;
    /**
     * 到会日期
     */
    private String arriveDate;
    /**
     * 报名区域
     */
    private String region;
    /**
     * 邀请范围
     */
    private String inviteRange;
    /**
     * 点赞数
     */
    private Integer thumbsNum;
    /**
     * 1:推荐活动
     */
    private String suggSign;
    /**
     * 
     */
    private byte[] actImg;
    /**
     * 
     */
    private String actImgDesc;
    /**
     * 列表页图片
     */
    private String activityPictureList;
    /**
     * 详情页图片
     */
    private String activityPictureDetail;
    /**
     * 链接地址 
     */
    private String activityUrl;
    /**
     * 显示顺序
     */
    private Integer activityIndex;
    /**
     * 是否热门精选
     */
    private Boolean isHotTips;
    /**
     * 状态
     */
    private int enables;
    /**
     * 数据源
     */
    private String source;
    /**
     * 插入时间
     */
    private Date insertTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 创建人
     */
    private Long createId;
    /**
     * 修改人
     */
    private Long updateId;

    
    /**
     *id的setter方法
     **/     
    public void setId(String id) {
        this.id = id;
    }
     /**
     *id的getter方法
     **/ 
    public String getId() {
        return this.id;
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
     *theme的setter方法
     **/     
    public void setTheme(String theme) {
        this.theme = theme;
    }
     /**
     *theme的getter方法
     **/ 
    public String getTheme() {
        return this.theme;
    }
    
    /**
     *form的setter方法
     **/     
    public void setForm(String form) {
        this.form = form;
    }
     /**
     *form的getter方法
     **/ 
    public String getForm() {
        return this.form;
    }
	public String getStartDateString() {
	  return DateUtils.formatDateToString(getStartDate(), "yyyy-MM-dd");
	}
	public void setStartDateString(String startDateStr) {
	  setStartDate(DateUtils.parse(startDateStr, "yyyy-MM-dd"));
	}
    
    /**
     *startDate的setter方法
     **/     
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
     /**
     *startDate的getter方法
     **/ 
    public Date getStartDate() {
        return this.startDate;
    }
	public String getEndDateString() {
	  return DateUtils.formatDateToString(getEndDate(), "yyyy-MM-dd");
	}
	public void setEndDateString(String endDateStr) {
	  setEndDate(DateUtils.parse(endDateStr, "yyyy-MM-dd"));
	}
    
    /**
     *endDate的setter方法
     **/     
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
     /**
     *endDate的getter方法
     **/ 
    public Date getEndDate() {
        return this.endDate;
    }
    
    /**
     *applyType的setter方法
     **/     
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }
     /**
     *applyType的getter方法
     **/ 
    public String getApplyType() {
        return this.applyType;
    }
    
    /**
     *isActive的setter方法
     **/     
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
     /**
     *isActive的getter方法
     **/ 
    public Integer getIsActive() {
        return this.isActive;
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
	public String getApplyStartDateString() {
	  return DateUtils.formatDateToString(getApplyStartDate(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setApplyStartDateString(String applyStartDateStr) {
	  setApplyStartDate(DateUtils.parse(applyStartDateStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *applyStartDate的setter方法
     **/     
    public void setApplyStartDate(Date applyStartDate) {
        this.applyStartDate = applyStartDate;
    }
     /**
     *applyStartDate的getter方法
     **/ 
    public Date getApplyStartDate() {
        return this.applyStartDate;
    }
	public String getApplyEndDateString() {
	  return DateUtils.formatDateToString(getApplyEndDate(), "yyyy-MM-dd");
	}
	public void setApplyEndDateString(String applyEndDateStr) {
	  setApplyEndDate(DateUtils.parse(applyEndDateStr, "yyyy-MM-dd"));
	}
    
    /**
     *applyEndDate的setter方法
     **/     
    public void setApplyEndDate(Date applyEndDate) {
        this.applyEndDate = applyEndDate;
    }
     /**
     *applyEndDate的getter方法
     **/ 
    public Date getApplyEndDate() {
        return this.applyEndDate;
    }
    
    /**
     *approvalStatus的setter方法
     **/     
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
     /**
     *approvalStatus的getter方法
     **/ 
    public String getApprovalStatus() {
        return this.approvalStatus;
    }
    
    /**
     *targetAccountType的setter方法
     **/     
    public void setTargetAccountType(String targetAccountType) {
        this.targetAccountType = targetAccountType;
    }
     /**
     *targetAccountType的getter方法
     **/ 
    public String getTargetAccountType() {
        return this.targetAccountType;
    }
    
    /**
     *introduce的setter方法
     **/     
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
     /**
     *introduce的getter方法
     **/ 
    public String getIntroduce() {
        return this.introduce;
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
    
    /**
     *flow的setter方法
     **/     
    public void setFlow(String flow) {
        this.flow = flow;
    }
     /**
     *flow的getter方法
     **/ 
    public String getFlow() {
        return this.flow;
    }
    
    /**
     *address的setter方法
     **/     
    public void setAddress(String address) {
        this.address = address;
    }
     /**
     *address的getter方法
     **/ 
    public String getAddress() {
        return this.address;
    }
    
    /**
     *scale的setter方法
     **/     
    public void setScale(String scale) {
        this.scale = scale;
    }
     /**
     *scale的getter方法
     **/ 
    public String getScale() {
        return this.scale;
    }
	public String getFinishDateString() {
	  return DateUtils.formatDateToString(getFinishDate(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setFinishDateString(String finishDateStr) {
	  setFinishDate(DateUtils.parse(finishDateStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *finishDate的setter方法
     **/     
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
     /**
     *finishDate的getter方法
     **/ 
    public Date getFinishDate() {
        return this.finishDate;
    }
	public String getOperateDateString() {
	  return DateUtils.formatDateToString(getOperateDate(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setOperateDateString(String operateDateStr) {
	  setOperateDate(DateUtils.parse(operateDateStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *operateDate的setter方法
     **/     
    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }
     /**
     *operateDate的getter方法
     **/ 
    public Date getOperateDate() {
        return this.operateDate;
    }
    
    /**
     *applyStatus的setter方法
     **/     
    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }
     /**
     *applyStatus的getter方法
     **/ 
    public String getApplyStatus() {
        return this.applyStatus;
    }
    
    /**
     *attendStatus的setter方法
     **/     
    public void setAttendStatus(String attendStatus) {
        this.attendStatus = attendStatus;
    }
     /**
     *attendStatus的getter方法
     **/ 
    public String getAttendStatus() {
        return this.attendStatus;
    }
    
    /**
     *arriveDate的setter方法
     **/     
    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }
     /**
     *arriveDate的getter方法
     **/ 
    public String getArriveDate() {
        return this.arriveDate;
    }
    
    /**
     *region的setter方法
     **/     
    public void setRegion(String region) {
        this.region = region;
    }
     /**
     *region的getter方法
     **/ 
    public String getRegion() {
        return this.region;
    }
    
    /**
     *inviteRange的setter方法
     **/     
    public void setInviteRange(String inviteRange) {
        this.inviteRange = inviteRange;
    }
     /**
     *inviteRange的getter方法
     **/ 
    public String getInviteRange() {
        return this.inviteRange;
    }
    
    /**
     *thumbsNum的setter方法
     **/     
    public void setThumbsNum(Integer thumbsNum) {
        this.thumbsNum = thumbsNum;
    }
     /**
     *thumbsNum的getter方法
     **/ 
    public Integer getThumbsNum() {
        return this.thumbsNum;
    }
    
    /**
     *suggSign的setter方法
     **/     
    public void setSuggSign(String suggSign) {
        this.suggSign = suggSign;
    }
     /**
     *suggSign的getter方法
     **/ 
    public String getSuggSign() {
        return this.suggSign;
    }
    
    /**
     *actImg的setter方法
     **/     
    public void setActImg(byte[] actImg) {
        this.actImg = actImg;
    }
     /**
     *actImg的getter方法
     **/ 
    public byte[] getActImg() {
        return this.actImg;
    }
    
    /**
     *actImgDesc的setter方法
     **/     
    public void setActImgDesc(String actImgDesc) {
        this.actImgDesc = actImgDesc;
    }
     /**
     *actImgDesc的getter方法
     **/ 
    public String getActImgDesc() {
        return this.actImgDesc;
    }
    
    /**
     *activityPictureList的setter方法
     **/     
    public void setActivityPictureList(String activityPictureList) {
        this.activityPictureList = activityPictureList;
    }
     /**
     *activityPictureList的getter方法
     **/ 
    public String getActivityPictureList() {
        return this.activityPictureList;
    }
    
    /**
     *activityPictureDetail的setter方法
     **/     
    public void setActivityPictureDetail(String activityPictureDetail) {
        this.activityPictureDetail = activityPictureDetail;
    }
     /**
     *activityPictureDetail的getter方法
     **/ 
    public String getActivityPictureDetail() {
        return this.activityPictureDetail;
    }
    
    /**
     *activityUrl的setter方法
     **/     
    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }
     /**
     *activityUrl的getter方法
     **/ 
    public String getActivityUrl() {
        return this.activityUrl;
    }
    
    /**
     *activityIndex的setter方法
     **/     
    public void setActivityIndex(Integer activityIndex) {
        this.activityIndex = activityIndex;
    }
     /**
     *activityIndex的getter方法
     **/ 
    public Integer getActivityIndex() {
        return this.activityIndex;
    }
    
    /**
     *isHotTips的setter方法
     **/     
    public void setIsHotTips(Boolean isHotTips) {
        this.isHotTips = isHotTips;
    }
     /**
     *isHotTips的getter方法
     **/ 
    public Boolean getIsHotTips() {
        return this.isHotTips;
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
	public String getInsertTimeString() {
	  return DateUtils.formatDateToString(getInsertTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setInsertTimeString(String insertTimeStr) {
	  setInsertTime(DateUtils.parse(insertTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *insertTime的setter方法
     **/     
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
     /**
     *insertTime的getter方法
     **/ 
    public Date getInsertTime() {
        return this.insertTime;
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