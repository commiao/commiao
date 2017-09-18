package com.chtwm.mall.pojo.messageCenter;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class MessageCenter  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * id
     */
    private Long id;
    /**
     * 所属类别
     */
    private String category;
    /**
     * 标题
     */
    private String title;
    /**
     * 显示顺序
     */
    private Long displayOrder;
    /**
     * 产品类别
     */
    private String productType;
    /**
     * 来源
     */
    private String source;
    /**
     * 媒体报到日期
     */
    private Date reportDate;
    /**
     * 是否调用专题 0否  1是
     */
    private Integer isInvokeSubject;
    /**
     * 是否专题登录 0否  1是
     */
    private Integer isLoginSubject;
    /**
     * 专题页ID
     */
    private String subjectId;
    /**
     * 简介
     */
    private String synopsis;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片
     */
    private String imageUrl;
    /**
     * 链接
     */
    private String targetUrl;
    /**
     * 是否重点推荐 0否  1是
     */
    private Integer isRecommend;
    /**
     * 是否风险测评 0否  1是
     */
    private Integer isRiskAssessment;
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
    private Date createtime;
    /**
     * 修改时间
     */
    private Date updatetime;
    /**
     * 是否启用  0否  1是
     */
    private Integer status;

    
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
     *category的setter方法
     **/     
    public void setCategory(String category) {
        this.category = category;
    }
     /**
     *category的getter方法
     **/ 
    public String getCategory() {
        return this.category;
    }
    
    /**
     *title的setter方法
     **/     
    public void setTitle(String title) {
        this.title = title;
    }
     /**
     *title的getter方法
     **/ 
    public String getTitle() {
        return this.title;
    }
    
    /**
     *displayOrder的setter方法
     **/     
    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
    }
     /**
     *displayOrder的getter方法
     **/ 
    public Long getDisplayOrder() {
        return this.displayOrder;
    }
    
    /**
     *productType的setter方法
     **/     
    public void setProductType(String productType) {
        this.productType = productType;
    }
     /**
     *productType的getter方法
     **/ 
    public String getProductType() {
        return this.productType;
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
	public String getReportDateString() {
	  return DateUtils.formatDateToString(getReportDate(), "yyyy-MM-dd");
	}
	public void setReportDateString(String reportDateStr) {
	  setReportDate(DateUtils.parse(reportDateStr, "yyyy-MM-dd"));
	}
    
    /**
     *reportDate的setter方法
     **/     
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }
     /**
     *reportDate的getter方法
     **/ 
    public Date getReportDate() {
        return this.reportDate;
    }
    
    /**
     *isInvokeSubject的setter方法
     **/     
    public void setIsInvokeSubject(Integer isInvokeSubject) {
        this.isInvokeSubject = isInvokeSubject;
    }
     /**
     *isInvokeSubject的getter方法
     **/ 
    public Integer getIsInvokeSubject() {
        return this.isInvokeSubject;
    }
    
    /**
     *isLoginSubject的setter方法
     **/     
    public void setIsLoginSubject(Integer isLoginSubject) {
        this.isLoginSubject = isLoginSubject;
    }
     /**
     *isLoginSubject的getter方法
     **/ 
    public Integer getIsLoginSubject() {
        return this.isLoginSubject;
    }
    
    /**
     *subjectId的setter方法
     **/     
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }
     /**
     *subjectId的getter方法
     **/ 
    public String getSubjectId() {
        return this.subjectId;
    }
    
    /**
     *synopsis的setter方法
     **/     
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
     /**
     *synopsis的getter方法
     **/ 
    public String getSynopsis() {
        return this.synopsis;
    }
    
    /**
     *content的setter方法
     **/     
    public void setContent(String content) {
        this.content = content;
    }
     /**
     *content的getter方法
     **/ 
    public String getContent() {
        return this.content;
    }
    
    /**
     *imageUrl的setter方法
     **/     
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
     /**
     *imageUrl的getter方法
     **/ 
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    /**
     *targetUrl的setter方法
     **/     
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
     /**
     *targetUrl的getter方法
     **/ 
    public String getTargetUrl() {
        return this.targetUrl;
    }
    
    /**
     *isRecommend的setter方法
     **/     
    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }
     /**
     *isRecommend的getter方法
     **/ 
    public Integer getIsRecommend() {
        return this.isRecommend;
    }
    
    /**
     *isRiskAssessment的setter方法
     **/     
    public void setIsRiskAssessment(Integer isRiskAssessment) {
        this.isRiskAssessment = isRiskAssessment;
    }
     /**
     *isRiskAssessment的getter方法
     **/ 
    public Integer getIsRiskAssessment() {
        return this.isRiskAssessment;
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
    
    /**
     *status的setter方法
     **/     
    public void setStatus(Integer status) {
        this.status = status;
    }
     /**
     *status的getter方法
     **/ 
    public Integer getStatus() {
        return this.status;
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