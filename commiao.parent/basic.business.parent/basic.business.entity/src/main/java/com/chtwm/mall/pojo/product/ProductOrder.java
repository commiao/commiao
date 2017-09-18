package com.chtwm.mall.pojo.product;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ProductOrder  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 主键
     */
    private Long id;
    /**
     * 注册人手机号
     */
    private String mobileNoInternet;
    /**
     * 客户编号
     */
    private String customerNo;
    /**
     * 产品代码
     */
    private String fundCode;
    /**
     * 产品名称
     */
    private String fundName;
    /**
     * 项目代码
     */
    private String projectCode;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 产品风险等级(对应多金风险等级)
     */
    private String riskLevel;
    /**
     * 理财师工号
     */
    private String brokerAccount;
    /**
     * 预约状态，默认成功 1
     */
    private String status;
    /**
     * 数据来源
     */
    private String source;
    /**
     * 预约时间
     */
    private Date applyTime;
    /**
     * 插入时间
     */
    private Date inserttime;
    /**
     * 更新时间
     */
    private Date updatetime;

    
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
     *mobileNoInternet的setter方法
     **/     
    public void setMobileNoInternet(String mobileNoInternet) {
        this.mobileNoInternet = mobileNoInternet;
    }
     /**
     *mobileNoInternet的getter方法
     **/ 
    public String getMobileNoInternet() {
        return this.mobileNoInternet;
    }
    
    /**
     *customerNo的setter方法
     **/     
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
     /**
     *customerNo的getter方法
     **/ 
    public String getCustomerNo() {
        return this.customerNo;
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
     *projectCode的setter方法
     **/     
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }
     /**
     *projectCode的getter方法
     **/ 
    public String getProjectCode() {
        return this.projectCode;
    }
    
    /**
     *projectName的setter方法
     **/     
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
     /**
     *projectName的getter方法
     **/ 
    public String getProjectName() {
        return this.projectName;
    }
    
    /**
     *riskLevel的setter方法
     **/     
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
     /**
     *riskLevel的getter方法
     **/ 
    public String getRiskLevel() {
        return this.riskLevel;
    }
    
    /**
     *brokerAccount的setter方法
     **/     
    public void setBrokerAccount(String brokerAccount) {
        this.brokerAccount = brokerAccount;
    }
     /**
     *brokerAccount的getter方法
     **/ 
    public String getBrokerAccount() {
        return this.brokerAccount;
    }
    
    /**
     *status的setter方法
     **/     
    public void setStatus(String status) {
        this.status = status;
    }
     /**
     *status的getter方法
     **/ 
    public String getStatus() {
        return this.status;
    }
    
    /**
     *source的setter方法
     **/     
    public void setSource(String source) {
        this.source = source;
    }
     /**
     *source的getter方法
     **/ 
    public String getSource() {
        return this.source;
    }
	public String getApplyTimeString() {
	  return DateUtils.formatDateToString(getApplyTime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setApplyTimeString(String applyTimeStr) {
	  setApplyTime(DateUtils.parse(applyTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *applyTime的setter方法
     **/     
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
     /**
     *applyTime的getter方法
     **/ 
    public Date getApplyTime() {
        return this.applyTime;
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


}