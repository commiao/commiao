package com.chtwm.mall.pojo.yxreport;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DataFormatUtils;
import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class YxPublicOfferingNonMonetary  implements Serializable  {
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
     * 评级类型
     */
    private String ratingType;
    /**
     * 净增长率
     */
    private String netWorthGrowth;
    /**
     * 夏普比率
     */
    private String sharpRatio;
    /**
     * 同业胜率
     */
    private String tradeConference;
    /**
     * 排名波动性
     */
    private String rankingVolatility;
    /**
     * 最大撤回
     */
    private String maxRetracement;
    /**
     * 总分
     */
    private String total;
    /**
     * 排名
     */
    private String ranking;
    /**
     * 评级
     */
    private String rating;
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
     *ratingType的setter方法
     **/     
    public void setRatingType(String ratingType) {
        this.ratingType = ratingType;
    }
     /**
     *ratingType的getter方法
     **/ 
    public String getRatingType() {
        return this.ratingType;
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
     *sharpRatio的setter方法
     **/     
    public void setSharpRatio(String sharpRatio) {
        this.sharpRatio = sharpRatio;
    }
     /**
     *sharpRatio的getter方法
     **/ 
    public String getSharpRatio() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.sharpRatio);
    }
    
    /**
     *tradeConference的setter方法
     **/     
    public void setTradeConference(String tradeConference) {
        this.tradeConference = tradeConference;
    }
     /**
     *tradeConference的getter方法
     **/ 
    public String getTradeConference() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.tradeConference);
    }
    
    /**
     *rankingVolatility的setter方法
     **/     
    public void setRankingVolatility(String rankingVolatility) {
        this.rankingVolatility = rankingVolatility;
    }
     /**
     *rankingVolatility的getter方法
     **/ 
    public String getRankingVolatility() {
        return DataFormatUtils.dataFormatByRoundHalfUp(this.rankingVolatility);
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