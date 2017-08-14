package com.commiao.domain.pojo.user;

import java.util.Date;

import com.commiao.domain.constants.Constants;
import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;

/**
 * 用户邮件绑定表
 * 
 * @author
 * 
 */

public class UserEmail extends EntitySupport implements Entity {

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private Long emailId;
	/**
	 * 电子邮箱
	 */
	private String email;
	/**
	 * 激活码
	 */
	private String activeCode;
	/**
	 * 是否已激活
	 */
	private Integer emailStatus;
	/**
	 * 用户id
	 */

	private Long userId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建人id
	 */
	private Integer createUserId;
	/**
	 * 创建人昵称
	 */
	private String createNickname;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新人id
	 */
	private Integer updateUserId;
	/**
	 * 更新人昵称
	 */
	private String updateNickname;
	/**
	 * 使用状态
	 */
	private Integer status=Constants.GLOBLE_YES;

	// private Collection<User> user;

	public Long getEmailId() {
		return emailId;
	}

	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActiveCode() {
		return activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public Integer getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(Integer emailStatus) {
		this.emailStatus = emailStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateNickname() {
		return createNickname;
	}

	public void setCreateNickname(String createNickname) {
		this.createNickname = createNickname;
	}

	public Integer getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getUpdateNickname() {
		return updateNickname;
	}

	public void setUpdateNickname(String updateNickname) {
		this.updateNickname = updateNickname;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public UserEmail(){}

	@Override
	public Long getId() {
		return emailId;
	};
}
