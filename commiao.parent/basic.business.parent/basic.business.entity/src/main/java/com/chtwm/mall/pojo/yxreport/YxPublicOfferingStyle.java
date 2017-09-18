package com.chtwm.mall.pojo.yxreport;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DataFormatUtils;
import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class YxPublicOfferingStyle  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 
     */
    private String fundCode;
    /**
     * 
     */
    private String fundName;
    /**
     * 
     */
    private String firstClassifction;
    /**
     * 
     */
    private String secondaryClassification;
    /**
     * 
     */
    private String betaValue;
    /**
     * 
     */
    private String betaType;
    /**
     * 
     */
    private String tapeRatio;
    /**
     * 
     */
    private String smallcapRatio;
    /**
     * 
     */
    private String holdingStyle;
    /**
     * 
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
     *betaValue的setter方法
     **/     
    public void setBetaValue(String betaValue) {
        this.betaValue = betaValue;
    }
     /**
     *betaValue的getter方法
     **/ 
    public String getBetaValue() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.betaValue);
    }
    
    /**
     *betaType的setter方法
     **/     
    public void setBetaType(String betaType) {
        this.betaType = betaType;
    }
     /**
     *betaType的getter方法
     **/ 
    public String getBetaType() {
        return this.betaType;
    }
    
    /**
     *tapeRatio的setter方法
     **/     
    public void setTapeRatio(String tapeRatio) {
        this.tapeRatio = tapeRatio;
    }
     /**
     *tapeRatio的getter方法
     **/ 
    public String getTapeRatio() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.tapeRatio);
    }
    
    /**
     *smallcapRatio的setter方法
     **/     
    public void setSmallcapRatio(String smallcapRatio) {
        this.smallcapRatio = smallcapRatio;
    }
     /**
     *smallcapRatio的getter方法
     **/ 
    public String getSmallcapRatio() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.smallcapRatio);
    }
    
    /**
     *holdingStyle的setter方法
     **/     
    public void setHoldingStyle(String holdingStyle) {
        this.holdingStyle = holdingStyle;
    }
     /**
     *holdingStyle的getter方法
     **/ 
    public String getHoldingStyle() {
        return this.holdingStyle;
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