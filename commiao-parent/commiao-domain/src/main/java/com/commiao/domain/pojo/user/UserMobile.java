package com.commiao.domain.pojo.user;

import java.util.Date;

import com.commiao.domain.constants.Constants;
import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;


/**
 * 用户手机绑定表
 * @author 
 *
 */
public class UserMobile extends EntitySupport implements Entity{

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private Long mobileId;
	/**
	 * 手机号码
	 */
	private String mobilePhone;
	/**
	 * 验证码
	 */
	private String activeCode;
	/**
	 * 是否已绑定
	 */
	private Integer mobileStatus;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 创建时间
	 */
	
	private Date createTime;
	/**
	 * 创建人Id
	 */
	private Long createUserId;
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
	private Long updateUserId;
	/**
	 * 更新人昵称
	 */
	private String updateNickname;
	/**
	 * 使用状态
	 */
	private Integer status=Constants.GLOBLE_YES;
	//private Collection<User> user;
	public Long getMobileId() {
		return mobileId;
	}
	public void setMobileId(Long mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	public Integer getMobileStatus() {
		return mobileStatus;
	}
	public void setMobileStatus(Integer mobileStatus) {
		this.mobileStatus = mobileStatus;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public String getCreateNickname() {
		return createNickname;
	}
	public void setCreateNickname(String createNickname) {
		this.createNickname = createNickname;
	}
	public Long getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(Long updateUserId) {
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
	@Override
	public Long getId() {
		return mobileId;
	}
	
	
	
	
	
	 
	
	

}
