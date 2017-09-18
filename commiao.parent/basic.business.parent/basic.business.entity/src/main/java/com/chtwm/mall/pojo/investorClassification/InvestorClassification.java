package com.chtwm.mall.pojo.investorClassification;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;


/**
 * 
 */
public class InvestorClassification implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 投资者分类内容管理
	 */
	private Long id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 适用用户
	 */
	private String applicableUser;
	/**
	 * 适用用户描述
	 */
	private String applicableUserDesc;
	/**
	 * 所属类别
	 */
	private String category;
	/**
	 * 所属类别描述
	 */
	private String categoryDesc;
	/**
	 * 详细文案
	 */
	private String content;
	/**
	 * 是否上传模板附件 0 否
	 */
	private Integer isAccessory;
	/**
	 * 附件名称
	 */
	private String accessoryName;
	/**
	 * 附件链接
	 */
	private String accessoryUrl;
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
	 * 状态 0禁用 1启动
	 */
	private Integer enables;
	/**
	 * 平台类型
	 */
	private String platform;
	/**
	 * 产品类型
	 */
	private String applicableProduct;
	private String applicableProductDesc;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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
	 * applicableUser的setter方法
	 **/
	public void setApplicableUser(String applicableUser) {
		this.applicableUser = applicableUser;
	}

	/**
	 * applicableUser的getter方法
	 **/
	public String getApplicableUser() {
		return this.applicableUser;
	}

	/**
	 * category的setter方法
	 **/
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * category的getter方法
	 **/
	public String getCategory() {
		return this.category;
	}

	/**
	 * content的setter方法
	 **/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * content的getter方法
	 **/
	public String getContent() {
		return this.content;
	}

	/**
	 * isAccessory的setter方法
	 **/
	public void setIsAccessory(Integer isAccessory) {
		this.isAccessory = isAccessory;
	}

	/**
	 * isAccessory的getter方法
	 **/
	public Integer getIsAccessory() {
		return this.isAccessory;
	}

	/**
	 * accessoryName的setter方法
	 **/
	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	/**
	 * accessoryName的getter方法
	 **/
	public String getAccessoryName() {
		return this.accessoryName;
	}

	/**
	 * accessoryUrl的setter方法
	 **/
	public void setAccessoryUrl(String accessoryUrl) {
		this.accessoryUrl = accessoryUrl;
	}

	/**
	 * accessoryUrl的getter方法
	 **/
	public String getAccessoryUrl() {
		return this.accessoryUrl;
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

	/**
	 * 获取 TODO applicableUserDesc
	 * 
	 * @return the applicableUserDesc
	 */
	public String getApplicableUserDesc() {
		return applicableUserDesc;
	}

	/**
	 * 设置 TODO applicableUserDesc
	 * 
	 * @param applicableUserDesc
	 *            the applicableUserDesc to set
	 */
	public void setApplicableUserDesc(String applicableUserDesc) {
		this.applicableUserDesc = applicableUserDesc;
	}

	/**
	 * 获取 TODO categoryDesc
	 * 
	 * @return the categoryDesc
	 */
	public String getCategoryDesc() {
		return categoryDesc;
	}

	/**
	 * 设置 TODO categoryDesc
	 * 
	 * @param categoryDesc
	 *            the categoryDesc to set
	 */
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	
	/** 
	 * @Description::(展示ID). <br/> 
	 * @author liudongguo
	 * @return
	 */ 
	public Long getIdShow() {
		return id;
	}

	/** 
	 * @Description::(这里用一句话描述这个方法的作用). <br/> 
	 * @author liudongguo
	 * @param idShow
	 */ 
	public void setIdShow(Long idShow) {
		this.id = idShow;
	}

	/**
	 * 获取 TODO platform
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * 设置 TODO platform 
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * 获取 TODO applicableProduct
	 * @return the applicableProduct
	 */
	public String getApplicableProduct() {
		return applicableProduct;
	}

	/**
	 * 设置 TODO applicableProduct 
	 * @param applicableProduct the applicableProduct to set
	 */
	public void setApplicableProduct(String applicableProduct) {
		this.applicableProduct = applicableProduct;
	}

	/**
	 * 获取 TODO applicableProductDesc
	 * @return the applicableProductDesc
	 */
	public String getApplicableProductDesc() {
		return applicableProductDesc;
	}

	/**
	 * 设置 TODO applicableProductDesc 
	 * @param applicableProductDesc the applicableProductDesc to set
	 */
	public void setApplicableProductDesc(String applicableProductDesc) {
		this.applicableProductDesc = applicableProductDesc;
	}
	
	

}