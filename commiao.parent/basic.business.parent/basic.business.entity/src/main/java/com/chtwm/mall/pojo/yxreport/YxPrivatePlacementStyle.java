package com.chtwm.mall.pojo.yxreport;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DataFormatUtils;
import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class YxPrivatePlacementStyle  implements Serializable  {
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
     * 管理者
     */
    private String manager;
    /**
     * 类型
     */
    private String type;
    /**
     * beta值
     */
    private String betaValue;
    /**
     * beta类型
     */
    private String betaType;
    /**
     * 大盘比率
     */
    private String tapeRatio;
    /**
     * 小盘比率
     */
    private String smallcapRatio;
    /**
     * 持股风格
     */
    private String style;
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
     *manager的setter方法
     **/     
    public void setManager(String manager) {
        this.manager = manager;
    }
     /**
     *manager的getter方法
     **/ 
    public String getManager() {
        return this.manager;
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
     *style的setter方法
     **/     
    public void setStyle(String style) {
        this.style = style;
    }
     /**
     *style的getter方法
     **/ 
    public String getStyle() {
        return this.style;
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