package com.chtwm.mall.pojo.content;

import java.io.Serializable;

public class ContentCategoryResult implements Serializable {

	private static final long serialVersionUID = 8886195662558923203L;

	private Long id;
	private Integer isSubject; // 是否专题页 0不是;1是
	private String imageUrl; // 图片地址
	private String title; // 标题
	private String introduction;// 简介
	private String targetUrl; // 链接
	private String releaseDate; // 发布日期
	private String reportDate; // 报道日期
	private String reportSource;// 来源
	private String category; // 所属类别
	private String productType;// 产品类型
	private String subTitle;// 副标题，用户银杏研究专家中心专家职位介绍
	private Integer recommendation;// 是否重点推荐
	private String content;;// 内容

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(Integer recommendation) {
		this.recommendation = recommendation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIsSubject() {
		return isSubject;
	}

	public void setIsSubject(Integer isSubject) {
		this.isSubject = isSubject;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReportSource() {
		return reportSource;
	}

	public void setReportSource(String reportSource) {
		this.reportSource = reportSource;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

}
