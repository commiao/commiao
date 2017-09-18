package com.chtwm.mall.pojo.messageCenter;

import java.io.Serializable;

/**
 * 活动中心返回前端封装结果对象 公告字段
 * 所属类别、标题、显示顺序、产品类别、来源、媒体报道日期、调用专题页、专题页登录、简介、内容、图片、链接、重点推荐、风险测评 活动字段
 * 所属类别、标题、显示顺序、产品类别、来源、媒体报道日期、调用专题页、专题页登录、专题页ID、简介、内容、图片、链接、重点推荐、风险测评
 */
public class MessageCenterResult implements Serializable {
    private static final long serialVersionUID = 5454155825314635342L;
    private String id;


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
    private String displayOrder;
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
    private String reportDate;
    /**
     * 是否调用专题 0否 1是
     */
    private String isInvokeSubject;
    /**
     * 是否专题登录 0否 1是
     */
    private String isLoginSubject;
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
     * 是否重点推荐 0否 1是
     */
    private String isRecommend;
    /**
     * 是否风险测评 0否 1是
     */
    private String isRiskAssessment;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    /**
     * category的setter方法
     **/
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * category的getter方法
     **/
    public String getCategory() {
        return this.category;
    }

    /**
     * title的setter方法
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * title的getter方法
     **/
    public String getTitle() {
        return this.title;
    }

    /**
     * displayOrder的setter方法
     **/
    public void setDisplayOrder(String displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * displayOrder的getter方法
     **/
    public String getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * productType的setter方法
     **/
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * productType的getter方法
     **/
    public String getProductType() {
        return this.productType;
    }

    /**
     * source的setter方法
     **/
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * source的getter方法
     **/
    public String getSource() {
        return this.source;
    }

    /**
     * subjectId的setter方法
     **/
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * subjectId的getter方法
     **/
    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * synopsis的setter方法
     **/
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * synopsis的getter方法
     **/
    public String getSynopsis() {
        return this.synopsis;
    }

    /**
     * content的setter方法
     **/
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * content的getter方法
     **/
    public String getContent() {
        return this.content;
    }

    /**
     * imageUrl的setter方法
     **/
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * imageUrl的getter方法
     **/
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * targetUrl的setter方法
     **/
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    /**
     * targetUrl的getter方法
     **/
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getIsInvokeSubject() {
        return isInvokeSubject;
    }

    public void setIsInvokeSubject(String isInvokeSubject) {
        this.isInvokeSubject = isInvokeSubject;
    }

    public String getIsLoginSubject() {
        return isLoginSubject;
    }

    public void setIsLoginSubject(String isLoginSubject) {
        this.isLoginSubject = isLoginSubject;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getIsRiskAssessment() {
        return isRiskAssessment;
    }

    public void setIsRiskAssessment(String isRiskAssessment) {
        this.isRiskAssessment = isRiskAssessment;
    }

}