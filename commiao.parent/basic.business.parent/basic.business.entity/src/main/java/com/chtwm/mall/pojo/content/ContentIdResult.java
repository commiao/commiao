package com.chtwm.mall.pojo.content;

import java.io.Serializable;

public class ContentIdResult implements Serializable{

    private static final long serialVersionUID = 1685264415055483560L;
    
    private Long   id;
    private String title;       //标题
    private String introduction;//简介
    private String subject_tag; //专题标签
    private String content;   //链接
    private String releaseDate; //发布日期
    private String reportDate; //报道日期
    private String reportSource;//来源
    private Integer clicksNum;  //阅读数
    private String productType;// 产品类型
    private String targetUrl;   //链接
    private String subTitle;//副标题，用户银杏研究专家中心专家职位介绍
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
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
    public Integer getClicksNum() {
        return clicksNum;
    }
    public void setClicksNum(Integer clicksNum) {
        this.clicksNum = clicksNum;
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
    public String getTargetUrl() {
        return targetUrl;
    }
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
    public String getSubject_tag() {
        return subject_tag;
    }
    public void setSubject_tag(String subject_tag) {
        this.subject_tag = subject_tag;
    }
    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    
}
