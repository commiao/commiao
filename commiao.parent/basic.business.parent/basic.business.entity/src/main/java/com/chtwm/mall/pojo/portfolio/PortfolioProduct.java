package com.chtwm.mall.pojo.portfolio;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class PortfolioProduct implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 组合产品
	 */
	private Long id;
	/**
	 * 专题类别ID
	 */
	private String portfolioCategory;
	/**
	 * 产品代码
	 */
	private String fundCode;
	/**
	 * 专题产品
	 */
	private String fundName;
	/**
	 * 推荐文案
	 */
	private String documents;
	/**
	 * 产品详情
	 */
	private String detail;
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
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 成立时间
	 */
	private Date inceptionDate;
	/**
	 * 管理团队
	 */
	private Long teamId;

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
	 * portfolioCategory的setter方法
	 **/
	public void setPortfolioCategory(String portfolioCategory) {
		this.portfolioCategory = portfolioCategory;
	}

	/**
	 * portfolioCategory的getter方法
	 **/
	public String getPortfolioCategory() {
		return this.portfolioCategory;
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
	 * documents的setter方法
	 **/
	public void setDocuments(String documents) {
		this.documents = documents;
	}

	/**
	 * documents的getter方法
	 **/
	public String getDocuments() {
		return this.documents;
	}

	/**
	 * detail的setter方法
	 **/
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * detail的getter方法
	 **/
	public String getDetail() {
		return this.detail;
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

	public Date getInceptionDate() {
		return inceptionDate;
	}

	public void setInceptionDate(Date inceptionDate) {
		this.inceptionDate = inceptionDate;
	}
	
	public String getInceptionDateString() {
		return DateUtils.formatDateToString(getInceptionDate(),
				"yyyy-MM-dd");
	}

	public void setInceptionDateString(String inceptionDateStr) {
		setInceptionDate(DateUtils.parse(inceptionDateStr, "yyyy-MM-dd"));
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	
}