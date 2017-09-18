package com.chtwm.mall.pojo.communityActivitiesEnroll;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class CommunityActivitiesEnroll implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 社区活动报名
	 */
	private Long id;
	/**
	 * 社区活动ID
	 */
	private Long communityActId;
	/**
	 * 报名时间
	 */
	private Date enrollTime;
	/**
	 * 姓名
	 */
	private String custName;
	/**
	 * 社区活动名称
	 */
	private String actName;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 状态
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
	 * communityActId的setter方法
	 **/
	public void setCommunityActId(Long communityActId) {
		this.communityActId = communityActId;
	}

	/**
	 * communityActId的getter方法
	 **/
	public Long getCommunityActId() {
		return this.communityActId;
	}

	public String getEnrollTimeString() {
		return DateUtils.formatDateToString(getEnrollTime(), "yyyy-MM-dd HH:mm:ss");
	}

	public void setEnrollTimeString(String enrollTimeStr) {
		setEnrollTime(DateUtils.parse(enrollTimeStr, "yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * enrollTime的setter方法
	 **/
	public void setEnrollTime(Date enrollTime) {
		this.enrollTime = enrollTime;
	}

	/**
	 * enrollTime的getter方法
	 **/
	public Date getEnrollTime() {
		return this.enrollTime;
	}

	/**
	 * custName的setter方法
	 **/
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * custName的getter方法
	 **/
	public String getCustName() {
		return this.custName;
	}

	/**
	 * phone的setter方法
	 **/
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * phone的getter方法
	 **/
	public String getPhone() {
		return this.phone;
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
	 * @return the actName
	 */
	public String getActName() {
		return actName;
	}
	

	/**
	 * @param actName the actName to set
	 */
	public void setActName(String actName) {
		this.actName = actName;
	}
	
}