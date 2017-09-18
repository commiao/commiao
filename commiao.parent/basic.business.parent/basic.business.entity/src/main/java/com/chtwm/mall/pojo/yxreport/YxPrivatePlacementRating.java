package com.chtwm.mall.pojo.yxreport;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DataFormatUtils;
import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class YxPrivatePlacementRating  implements Serializable  {
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
     * 净值增长率
     */
    private String netWorthGrowth;
    /**
     * 年化夏普
     */
    private String sharp;
    /**
     * 最大回撤
     */
    private String maxRetracement;
    /**
     * 年化波动
     */
    private String fluctuation;
    /**
     * 总分
     */
    private String total;
    /**
     * 排名
     */
    private String ranking;
    /**
     * 星级
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
     *netWorthGrowth的setter方法
     **/     
    public void setNetWorthGrowth(String netWorthGrowth) {
        this.netWorthGrowth = netWorthGrowth;
    }
     /**
     *netWorthGrowth的getter方法
     **/ 
    public String getNetWorthGrowth() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.netWorthGrowth);
    }
    
    /**
     *sharp的setter方法
     **/     
    public void setSharp(String sharp) {
        this.sharp = sharp;
    }
     /**
     *sharp的getter方法
     **/ 
    public String getSharp() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.sharp);
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
     *fluctuation的setter方法
     **/     
    public void setFluctuation(String fluctuation) {
        this.fluctuation = fluctuation;
    }
     /**
     *fluctuation的getter方法
     **/ 
    public String getFluctuation() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.fluctuation);
    }
    
    /**
     *total的setter方法
     **/     
    public void setTotal(String total) {
        this.total = total;
    }
     /**
     *total的getter方法
     **/ 
    public String getTotal() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.total);
    }
    
    /**
     *ranking的setter方法
     **/     
    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
     /**
     *ranking的getter方法
     **/ 
    public String getRanking() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.ranking);
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