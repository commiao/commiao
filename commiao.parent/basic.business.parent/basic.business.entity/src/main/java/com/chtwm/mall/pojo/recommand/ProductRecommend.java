package com.chtwm.mall.pojo.recommand;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ProductRecommend  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 主键
     */
    private Long id;
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
    private Date raisingStartDate;
    /**
     * 募集结束日期
     */
    private Date raisingEndDate;
    /**
     * 风险等级
     */
    private String levelRisk;
    /**
     * 风险等级名称
     */
    private String levelRiskName;
    /**
     * 产品URL
     */
    private String url;
    /**
     * 是否启用
     */
    private int enables;
    /**
     * 建立时间
     */
    private Date createTime;
    /**
     * 插入时间
     */
    private Date inserttime;
    /**
     * 更新时间
     */
    private Date updatetime;
    /**
     * 创建人ID
     */
    private Long createId;
    /**
     * 创建人名称
     */
    private String createName;
    /**
     * 修改人ID
     */
    private Long updateId;
    /**
     * 修改人名称
     */
    private String updateName;
    
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
     *productName的setter方法
     **/     
    public void setProductName(String productName) {
        this.productName = productName;
    }
     /**
     *productName的getter方法
     **/ 
    public String getProductName() {
        return this.productName;
    }
    
    /**
     *performanceBenchmark的setter方法
     **/     
    public void setPerformanceBenchmark(String performanceBenchmark) {
        this.performanceBenchmark = performanceBenchmark;
    }
     /**
     *performanceBenchmark的getter方法
     **/ 
    public String getPerformanceBenchmark() {
        return this.performanceBenchmark;
    }
    
    /**
     *productTerms的setter方法
     **/     
    public void setProductTerms(String productTerms) {
        this.productTerms = productTerms;
    }
     /**
     *productTerms的getter方法
     **/ 
    public String getProductTerms() {
        return this.productTerms;
    }
	public String getRaisingStartDateString() {
	  return DateUtils.formatDateToString(getRaisingStartDate(), "yyyy-MM-dd");
	}
	public void setRaisingStartDateString(String raisingStartDateStr) {
	  setRaisingStartDate(DateUtils.parse(raisingStartDateStr, "yyyy-MM-dd"));
	}
    
    /**
     *raisingStartDate的setter方法
     **/     
    public void setRaisingStartDate(Date raisingStartDate) {
        this.raisingStartDate = raisingStartDate;
    }
     /**
     *raisingStartDate的getter方法
     **/ 
    public Date getRaisingStartDate() {
        return this.raisingStartDate;
    }
	public String getRaisingEndDateString() {
	  return DateUtils.formatDateToString(getRaisingEndDate(), "yyyy-MM-dd");
	}
	public void setRaisingEndDateString(String raisingEndDateStr) {
	  setRaisingEndDate(DateUtils.parse(raisingEndDateStr, "yyyy-MM-dd"));
	}
    
    /**
     *raisingEndDate的setter方法
     **/     
    public void setRaisingEndDate(Date raisingEndDate) {
        this.raisingEndDate = raisingEndDate;
    }
     /**
     *raisingEndDate的getter方法
     **/ 
    public Date getRaisingEndDate() {
        return this.raisingEndDate;
    }
    
    /**
     *levelRisk的setter方法
     **/     
    public void setLevelRisk(String levelRisk) {
        this.levelRisk = levelRisk;
    }
     /**
     *levelRisk的getter方法
     **/ 
    public String getLevelRisk() {
        return this.levelRisk;
    }
    
    public String getLevelRiskName() {
        return levelRiskName;
    }
    public void setLevelRiskName(String levelRiskName) {
        this.levelRiskName = levelRiskName;
    }
    /**
     *url的setter方法
     **/     
    public void setUrl(String url) {
        this.url = url;
    }
     /**
     *url的getter方法
     **/ 
    public String getUrl() {
        return this.url;
    }
    
    /**
     *enables的setter方法
     **/     
    public void setEnables(int enables) {
        this.enables = enables;
    }
     /**
     *enables的getter方法
     **/ 
    public int getEnables() {
        return this.enables;
    }
	public String getCreateTimeString() {
	  return DateUtils.formatDateToString(getCreateTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCreateTimeString(String createTimeStr) {
	  setCreateTime(DateUtils.parse(createTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *createTime的setter方法
     **/     
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
     /**
     *createTime的getter方法
     **/ 
    public Date getCreateTime() {
        return this.createTime;
    }
	public String getInserttimeString() {
	  return DateUtils.formatDateToString(getInserttime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setInserttimeString(String inserttimeStr) {
	  setInserttime(DateUtils.parse(inserttimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *inserttime的setter方法
     **/     
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
     /**
     *inserttime的getter方法
     **/ 
    public Date getInserttime() {
        return this.inserttime;
    }
	public String getUpdatetimeString() {
	  return DateUtils.formatDateToString(getUpdatetime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setUpdatetimeString(String updatetimeStr) {
	  setUpdatetime(DateUtils.parse(updatetimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *updatetime的setter方法
     **/     
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
     /**
     *updatetime的getter方法
     **/ 
    public Date getUpdatetime() {
        return this.updatetime;
    }
    public Long getCreateId() {
        return createId;
    }
    public void setCreateId(Long createId) {
        this.createId = createId;
    }
    public String getCreateName() {
        return createName;
    }
    public void setCreateName(String createName) {
        this.createName = createName;
    }
    public Long getUpdateId() {
        return updateId;
    }
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
    public String getUpdateName() {
        return updateName;
    }
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }


}