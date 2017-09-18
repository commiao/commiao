package com.chtwm.mall.pojo.team;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class Team implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 团队
	 */
	private Long id;
	/**
	 * 团队名称
	 */
	private String name;
	/**
	 * 团队介绍
	 */
	private String introduce;
	/**
	 * 团队logo
	 */
	private String imgUrlLogo;
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
	 * 团队成员
	 */
	private List<TeamMember> teamMemberList;

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
	 * name的setter方法
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * name的getter方法
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * introduce的setter方法
	 **/
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	/**
	 * introduce的getter方法
	 **/
	public String getIntroduce() {
		return this.introduce;
	}

	/**
	 * imgUrlLogo的setter方法
	 **/
	public void setImgUrlLogo(String imgUrlLogo) {
		this.imgUrlLogo = imgUrlLogo;
	}

	/**
	 * imgUrlLogo的getter方法
	 **/
	public String getImgUrlLogo() {
		return this.imgUrlLogo;
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
	public Long getIdShow() {
		return id;
	}

	public void setIdShow(Long idShow) {
		this.id = idShow;
	}

	/** 
	 * 获取 团队成员 
	 * @return teamMemberList 
	 */
	public List<TeamMember> getTeamMemberList() {
		return teamMemberList;
	}

	/**
	 * 设置 团队成员 
	 * @param teamMemberList the teamMemberList to set
	 */
	public void setTeamMemberList(List<TeamMember> teamMemberList) {
		this.teamMemberList = teamMemberList;
	}
}