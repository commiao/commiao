package com.chtwm.mall.pojo.product;

import java.io.Serializable;

/**
 * 
 */
public class ProductRecommendAppResult  implements Serializable  {
    private static final long serialVersionUID = 4248192831824245773L;
    /**
     * 产品编码
     */
    private String code;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 组类型编码
     */
    private String groupType;
    /**
     * 产品推荐方案
     */
    private String recommend;
    /**
     * 序列号
     */
    private Integer serialNumber;
    /**
     * 图片路径
     */
    private String imgUrl;
    /*
     * 公募基金涨幅
     */
    private String pofGains;
    /*
     * 公募基金类型
     */
    private String pofType;
    /*
     * 产品亮点标签
     */
    public String productFeature;
    /*
     * 私募基金类型
     */
    private String pefType;
    /*
     * 私募固收期限
     */
    private String pefTerm;
    /*
     * 私募固收投资起点
     */
    private String pefMinBalance;
    /*
     * 私募固收业绩比较基准下限
     */
    private String pefExpectedProfitMin;
    /*
     * 私募固收业绩比较基准上线
     */
    private String pefExpectedProfitMax;

    /*
     * 私募浮收封闭期
     */
    private String pefCloseDay;
    /*
     * 私募浮收单位净值
     */
    private String pefNetValue;
    /***
     * 私募浮收产品净值日期
     */
    private String pefNetValueDate;
    
    public String getPofType() {
        return pofType;
    }
    public void setPofType(String pofType) {
        this.pofType = pofType;
    }
    public String getPofGains() {
        return pofGains;
    }
    public void setPofGains(String pofGains) {
        this.pofGains = pofGains;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGroupType() {
        return groupType;
    }
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
    public String getRecommend() {
        return recommend;
    }
    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
    public Integer getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getProductFeature() {
        return productFeature;
    }
    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }
    public String getPefType() {
        return pefType;
    }
    public void setPefType(String pefType) {
        this.pefType = pefType;
    }
    public String getPefTerm() {
        return pefTerm;
    }
    public void setPefTerm(String pefTerm) {
        this.pefTerm = pefTerm;
    }
    public String getPefMinBalance() {
        return pefMinBalance;
    }
    public void setPefMinBalance(String pefMinBalance) {
        this.pefMinBalance = pefMinBalance;
    }
    public String getPefExpectedProfitMin() {
        return pefExpectedProfitMin;
    }
    public void setPefExpectedProfitMin(String pefExpectedProfitMin) {
        this.pefExpectedProfitMin = pefExpectedProfitMin;
    }
    public String getPefExpectedProfitMax() {
        return pefExpectedProfitMax;
    }
    public void setPefExpectedProfitMax(String pefExpectedProfitMax) {
        this.pefExpectedProfitMax = pefExpectedProfitMax;
    }
    public String getPefCloseDay() {
        return pefCloseDay;
    }
    public void setPefCloseDay(String pefCloseDay) {
        this.pefCloseDay = pefCloseDay;
    }
    public String getPefNetValue() {
        return pefNetValue;
    }
    public void setPefNetValue(String pefNetValue) {
        this.pefNetValue = pefNetValue;
    }
    public String getPefNetValueDate() {
        return pefNetValueDate;
    }
    public void setPefNetValueDate(String pefNetValueDate) {
        this.pefNetValueDate = pefNetValueDate;
    }
}