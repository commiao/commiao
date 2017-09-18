package com.chtwm.mall.pojo.product;

import java.io.Serializable;

/**
 * 产品专题中的产品
 */
public class ProductFeatureBean implements Serializable {
   private static final long serialVersionUID = -6085263339953186391L;
   
    /*
     * 产品代码
     */
    private String productCode;
    /*
     * 产品名称
     */
    private String productName;
    /*
     * 公募基金类型
     */
    private String pofType;
    /*
     * 公募基金涨幅
     */
    private String pofGains;
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
   
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPefNetValueDate() {
		return pefNetValueDate;
	}

	public void setPefNetValueDate(String pefNetValueDate) {
		this.pefNetValueDate = pefNetValueDate;
	}

	public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

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
    
}