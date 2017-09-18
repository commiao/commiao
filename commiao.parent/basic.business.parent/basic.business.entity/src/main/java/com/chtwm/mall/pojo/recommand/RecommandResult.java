package com.chtwm.mall.pojo.recommand;

import java.io.Serializable;

public class RecommandResult implements Serializable{

    private static final long serialVersionUID = 8832119388253559616L;

    /**
     * 产品名称
     */
    private String productName;
    /**
     * 业绩比较基准
     */
    private String performanceBenchmark;
    /**
     * 产品期限
     */
    private String productTerms;
    /**
     * 募集起始日期
     */
    private String raisingStartDate;
    /**
     * 募集结束日期
     */
    private String raisingEndDate;
    /**
     * 产品URL
     */
    private String url;
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getPerformanceBenchmark() {
        return performanceBenchmark;
    }
    public void setPerformanceBenchmark(String performanceBenchmark) {
        this.performanceBenchmark = performanceBenchmark;
    }
    public String getProductTerms() {
        return productTerms;
    }
    public void setProductTerms(String productTerms) {
        this.productTerms = productTerms;
    }
    public String getRaisingStartDate() {
        return raisingStartDate;
    }
    public void setRaisingStartDate(String raisingStartDate) {
        this.raisingStartDate = raisingStartDate;
    }
    public String getRaisingEndDate() {
        return raisingEndDate;
    }
    public void setRaisingEndDate(String raisingEndDate) {
        this.raisingEndDate = raisingEndDate;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
   
}
