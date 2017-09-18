package com.chtwm.mall.pojo.accountant;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class Accountant implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 预约理财师
	 */
	private Long id;
	/**
	 * 客户端类型
	 */
	private String platform;
	/**
	 * 业务类型
	 */
	private String category;
	/**
	 * 业务类型描述
	 */
	private String categoryDesc;
	/**
	 * 城市（拼音）
	 */
	private String cityInitial;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 理财师工号
	 */
	private String accountantJobNum;
	/**
	 * 显示顺序
	 */
	private Integer serialNumber;
	/**
	 * 创建人
	 */
	private Long createId;
	/**
	 * 修改人
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
	 * 状态
	 */
	private Integer enables;

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
	 * platform的setter方法
	 **/
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * platform的getter方法
	 **/
	public String getPlatform() {
		return this.platform;
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
	 * city的setter方法
	 **/
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * city的getter方法
	 **/
	public String getCity() {
		return this.city;
	}

	/**
	 * accountantJobNum的setter方法
	 **/
	public void setAccountantJobNum(String accountantJobNum) {
		this.accountantJobNum = accountantJobNum;
	}

	/**
	 * accountantJobNum的getter方法
	 **/
	public String getAccountantJobNum() {
		return this.accountantJobNum;
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
		return DateUtils.formatDateToString(getCreateTime(), "yyyy-MM-dd HH:mm:ss");
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
		return DateUtils.formatDateToString(getUpdateTime(), "yyyy-MM-dd HH:mm:ss");
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

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCityInitial() {
		return cityInitial;
	}

	public void setCityInitial(String cityInitial) {
		this.cityInitial = cityInitial;
	}
}