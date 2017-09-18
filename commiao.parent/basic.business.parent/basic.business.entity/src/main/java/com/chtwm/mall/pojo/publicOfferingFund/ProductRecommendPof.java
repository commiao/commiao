package com.chtwm.mall.pojo.publicOfferingFund;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ProductRecommendPof implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 公募产品推荐
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
	 * 风险级别
	 */
	private String riskLevel;
	/**
	 * 风险级别描述
	 */
	private String riskLevelDesc;
	/**
	 * 序列号
	 */
	private Integer serialNumber;
	/**
	 * 状态 0禁用 1启用
	 */
	private Integer enables;
	/**
	 * 创建人ID
	 */
	private Long createId;
	/**
	 * 修改人ID
	 */
	private Long updateId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * id的setter方法
	 **/
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * id的getter方法
	 **/
	public Long getId() {
		return this.id;
	}

	/**
	 * fundCode的setter方法
	 **/
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	/**
	 * fundCode的getter方法
	 **/
	public String getFundCode() {
		return this.fundCode;
	}

	/**
	 * fundName的setter方法
	 **/
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	/**
	 * fundName的getter方法
	 **/
	public String getFundName() {
		return this.fundName;
	}

	/**
	 * riskLevel的setter方法
	 **/
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	/**
	 * riskLevel的getter方法
	 **/
	public String getRiskLevel() {
		return this.riskLevel;
	}

	/**
	 * serialNumber的setter方法
	 **/
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * serialNumber的getter方法
	 **/
	public Integer getSerialNumber() {
		return this.serialNumber;
	}

	/**
	 * enables的setter方法
	 **/
	public void setEnables(Integer enables) {
		this.enables = enables;
	}

	/**
	 * enables的getter方法
	 **/
	public Integer getEnables() {
		return this.enables;
	}

	/**
	 * createId的setter方法
	 **/
	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	/**
	 * createId的getter方法
	 **/
	public Long getCreateId() {
		return this.createId;
	}

	/**
	 * updateId的setter方法
	 **/
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}

	/**
	 * updateId的getter方法
	 **/
	public Long getUpdateId() {
		return this.updateId;
	}

	public String getCreateTimeString() {
		return DateUtils.formatDateToString(getCreateTime(),
				"yyyy-MM-dd HH:mm:ss");
	}

	public void setCreateTimeString(String createTimeStr) {
		setCreateTime(DateUtils.parse(createTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * createTime的setter方法
	 **/
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * createTime的getter方法
	 **/
	public Date getCreateTime() {
		return this.createTime;
	}

	public String getUpdateTimeString() {
		return DateUtils.formatDateToString(getUpdateTime(),
				"yyyy-MM-dd HH:mm:ss");
	}

	public void setUpdateTimeString(String updateTimeStr) {
		setUpdateTime(DateUtils.parse(updateTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * updateTime的setter方法
	 **/
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * updateTime的getter方法
	 **/
	public Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * 创建人名称
	 */
	private String createName;
	/**
	 * 修改人名称
	 */
	private String updateName;

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getRiskLevelDesc() {
		return riskLevelDesc;
	}

	public void setRiskLevelDesc(String riskLevelDesc) {
		this.riskLevelDesc = riskLevelDesc;
	}
	
	
}