package com.chtwm.mall.pojo.talentRecommend;

import java.io.Serializable;
import java.util.Date;
import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class TalentRecommend implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * ID
	 */
	private Long id;
	/**
	 * 用户账户
	 */
	private String userAccount;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 被推荐人姓名
	 */
	private String nameApplicant;
	/**
	 * 被推荐人电话
	 */
	private String mobileApplicant;
	/**
	 * 被推荐人所在银行
	 */
	private String bankApplicant;
	/**
	 * 被推荐人工号
	 */
	private String empnoApplicant;
	/**
	 * 被推荐人岗位
	 */
	private String positionApplicant;
	/**
	 * 推荐时间
	 */
	private Date dateApplicant;
	/**
	 * 是否被录用
	 */
	private Boolean isEmploy;
	/**
	 * 录用日期
	 */
	private Date dateEmploy;
	/**
	 * 录用岗位
	 */
	private String positionEmploy;
	/**
	 * 被推荐人顺序号
	 */
	private Integer seqApplicant;
	/**
	 * 状态
	 */
	private Boolean enables;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 创建人ID
	 */
	private Long createId;
	/**
	 * 修改人ID
	 */
	private Long updateId;

	private String createName;
	private String updateName;

	private String provinceApplicant;
	
	
	/**
	 * brokerNo:TODO(理财师工号). 
	 */
	private String brokerNo;
	
	/**
	 * brokerName:TODO(理财师姓名). 
	 */
	private String brokerName;

	public String getProvinceApplicant() {
		return provinceApplicant;
	}

	public void setProvinceApplicant(String provinceApplicant) {
		this.provinceApplicant = provinceApplicant;
	}

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
	 * userAccount的setter方法
	 **/
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	/**
	 * userAccount的getter方法
	 **/
	public String getUserAccount() {
		return this.userAccount;
	}

	/**
	 * userName的setter方法
	 **/
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * userName的getter方法
	 **/
	public String getUserName() {
		return this.userName;
	}

	/**
	 * nameApplicant的setter方法
	 **/
	public void setNameApplicant(String nameApplicant) {
		this.nameApplicant = nameApplicant;
	}

	/**
	 * nameApplicant的getter方法
	 **/
	public String getNameApplicant() {
		return this.nameApplicant;
	}

	/**
	 * mobileApplicant的setter方法
	 **/
	public void setMobileApplicant(String mobileApplicant) {
		this.mobileApplicant = mobileApplicant;
	}

	/**
	 * mobileApplicant的getter方法
	 **/
	public String getMobileApplicant() {
		return this.mobileApplicant;
	}

	/**
	 * bankApplicant的setter方法
	 **/
	public void setBankApplicant(String bankApplicant) {
		this.bankApplicant = bankApplicant;
	}

	/**
	 * bankApplicant的getter方法
	 **/
	public String getBankApplicant() {
		return this.bankApplicant;
	}

	/**
	 * empnoApplicant的setter方法
	 **/
	public void setEmpnoApplicant(String empnoApplicant) {
		this.empnoApplicant = empnoApplicant;
	}

	/**
	 * empnoApplicant的getter方法
	 **/
	public String getEmpnoApplicant() {
		return this.empnoApplicant;
	}

	/**
	 * positionApplicant的setter方法
	 **/
	public void setPositionApplicant(String positionApplicant) {
		this.positionApplicant = positionApplicant;
	}

	/**
	 * positionApplicant的getter方法
	 **/
	public String getPositionApplicant() {
		return this.positionApplicant;
	}

	public String getDateApplicantString() {
		return DateUtils.formatDateToString(getDateApplicant(),
				"yyyy-MM-dd HH:mm:ss");
	}

	public void setDateApplicantString(String dateApplicantStr) {
		setDateApplicant(DateUtils.parse(dateApplicantStr,
				"yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * dateApplicant的setter方法
	 **/
	public void setDateApplicant(Date dateApplicant) {
		this.dateApplicant = dateApplicant;
	}

	/**
	 * dateApplicant的getter方法
	 **/
	public Date getDateApplicant() {
		return this.dateApplicant;
	}

	/**
	 * isEmploy的setter方法
	 **/
	public void setIsEmploy(Boolean isEmploy) {
		this.isEmploy = isEmploy;
	}

	/**
	 * isEmploy的getter方法
	 **/
	public Boolean getIsEmploy() {
		return this.isEmploy;
	}

	public String getDateEmployString() {
		return DateUtils.formatDateToString(getDateEmploy(),
				"yyyy-MM-dd HH:mm:ss");
	}

	public void setDateEmployString(String dateEmployStr) {
		setDateEmploy(DateUtils.parse(dateEmployStr, "yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * dateEmploy的setter方法
	 **/
	public void setDateEmploy(Date dateEmploy) {
		this.dateEmploy = dateEmploy;
	}

	/**
	 * dateEmploy的getter方法
	 **/
	public Date getDateEmploy() {
		return this.dateEmploy;
	}

	/**
	 * positionEmploy的setter方法
	 **/
	public void setPositionEmploy(String positionEmploy) {
		this.positionEmploy = positionEmploy;
	}

	/**
	 * positionEmploy的getter方法
	 **/
	public String getPositionEmploy() {
		return this.positionEmploy;
	}

	/**
	 * seqApplicant的setter方法
	 **/
	public void setSeqApplicant(Integer seqApplicant) {
		this.seqApplicant = seqApplicant;
	}

	/**
	 * seqApplicant的getter方法
	 **/
	public Integer getSeqApplicant() {
		return this.seqApplicant;
	}

	/**
	 * enables的setter方法
	 **/
	public void setEnables(Boolean enables) {
		this.enables = enables;
	}

	/**
	 * enables的getter方法
	 **/
	public Boolean getEnables() {
		return this.enables;
	}

	public String getCreateTimeString() {
		return DateUtils.formatDateToString(getCreateTime(),
				"yyyy-MM-dd HH:mm:ss");
	}

	public void setCreateTimeString(String createTimeStr) {
		if (createTimeStr.contains("/")) {
			createTimeStr.replaceAll("/", "-");
		}
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

	/**
	 * 获取 TODO brokerNo
	 * @return the brokerNo
	 */
	public String getBrokerNo() {
		return brokerNo;
	}

	/**
	 * 设置 TODO brokerNo 
	 * @param brokerNo the brokerNo to set
	 */
	public void setBrokerNo(String brokerNo) {
		this.brokerNo = brokerNo;
	}

	/**
	 * 获取 TODO brokerName
	 * @return the brokerName
	 */
	public String getBrokerName() {
		return brokerName;
	}

	/**
	 * 设置 TODO brokerName 
	 * @param brokerName the brokerName to set
	 */
	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	/** 
	 * TODO 简单描述该方法的实现功能（可选）. 
	 * @see java.lang.Object#toString() 
	 */  
	@Override
	public String toString() {
		return "TalentRecommend [id=" + id + ", userAccount=" + userAccount
				+ ", userName=" + userName + ", nameApplicant=" + nameApplicant
				+ ", mobileApplicant=" + mobileApplicant + ", bankApplicant="
				+ bankApplicant + ", empnoApplicant=" + empnoApplicant
				+ ", positionApplicant=" + positionApplicant
				+ ", dateApplicant=" + dateApplicant + ", isEmploy=" + isEmploy
				+ ", dateEmploy=" + dateEmploy + ", positionEmploy="
				+ positionEmploy + ", seqApplicant=" + seqApplicant
				+ ", enables=" + enables + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", createId=" + createId
				+ ", updateId=" + updateId + ", createName=" + createName
				+ ", updateName=" + updateName + ", provinceApplicant="
				+ provinceApplicant + ", brokerNo=" + brokerNo
				+ ", brokerName=" + brokerName + "]";
	}
	
	

}