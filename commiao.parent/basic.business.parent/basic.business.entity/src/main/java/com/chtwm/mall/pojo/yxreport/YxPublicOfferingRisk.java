package com.chtwm.mall.pojo.yxreport;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DataFormatUtils;
import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class YxPublicOfferingRisk  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 基金代码
     */
    private String fundCode;
    /**
     * 基金名称
     */
    private String fundName;
    /**
     * 一级分类
     */
    private String firstClassifction;
    /**
     * 二级分类
     */
    private String secondaryClassification;
    /**
     * 标准差比率
     */
    private String standardDeviation;
    /**
     * 最大撤回比率
     */
    private String maxRetracement;
    /**
     * 总风险比率
     */
    private String riskRatio;
    /**
     * 评级
     */
    private String rating;
    /**
     * 数据时间
     */
    private String dataTime;
    /**
     * 
     */
    private Date importTime;

    
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
     *fundCode的setter方法
     **/     
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }
     /**
     *fundCode的getter方法
     **/ 
    public String getFundCode() {
        return this.fundCode;
    }
    
    /**
     *fundName的setter方法
     **/     
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
     /**
     *fundName的getter方法
     **/ 
    public String getFundName() {
        return this.fundName;
    }
    
    /**
     *firstClassifction的setter方法
     **/     
    public void setFirstClassifction(String firstClassifction) {
        this.firstClassifction = firstClassifction;
    }
     /**
     *firstClassifction的getter方法
     **/ 
    public String getFirstClassifction() {
        return this.firstClassifction;
    }
    
    /**
     *secondaryClassification的setter方法
     **/     
    public void setSecondaryClassification(String secondaryClassification) {
        this.secondaryClassification = secondaryClassification;
    }
     /**
     *secondaryClassification的getter方法
     **/ 
    public String getSecondaryClassification() {
        return this.secondaryClassification;
    }
    
    /**
     *standardDeviation的setter方法
     **/     
    public void setStandardDeviation(String standardDeviation) {
        this.standardDeviation = standardDeviation;
    }
     /**
     *standardDeviation的getter方法
     **/ 
    public String getStandardDeviation() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.standardDeviation);
    }
    
    /**
     *maxRetracement的setter方法
     **/     
    public void setMaxRetracement(String maxRetracement) {
        this.maxRetracement = maxRetracement;
    }
     /**
     *maxRetracement的getter方法
     **/ 
    public String getMaxRetracement() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.maxRetracement);
    }
    
    /**
     *riskRatio的setter方法
     **/     
    public void setRiskRatio(String riskRatio) {
        this.riskRatio = riskRatio;
    }
     /**
     *riskRatio的getter方法
     **/ 
    public String getRiskRatio() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.riskRatio);
    }
    
    /**
     *rating的setter方法
     **/     
    public void setRating(String rating) {
        this.rating = rating;
    }
     /**
     *rating的getter方法
     **/ 
    public String getRating() {
        return this.rating;
    }
    
    /**
     *dataTime的setter方法
     **/     
    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }
     /**
     *dataTime的getter方法
     **/ 
    public String getDataTime() {
        return this.dataTime;
    }
	public String getImportTimeString() {
	  return DateUtils.formatDateToString(getImportTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setImportTimeString(String importTimeStr) {
	  setImportTime(DateUtils.parse(importTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *importTime的setter方法
     **/     
    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }
     /**
     *importTime的getter方法
     **/ 
    public Date getImportTime() {
        return this.importTime;
    }


}