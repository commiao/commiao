package com.commiao.domain.pojo.user;

import java.util.Date;

import com.commiao.domain.constants.Constants;
import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;


/**
 * 用户信息表
 * @author 
 * 2016-1-20 上午11:37:42
 *
 */
public class User extends EntitySupport implements Entity{
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private Long userId;
	/**
	 * 用户名
	 */
	private String nickname;
	/**
	 * MD5加密后的密码
	 */
	private String password;
	/**
	 * 手机绑定表
	 */
	private Long mobileId;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 邮箱绑定表
	 */
	private Long emailId;
	/**
	 * 电子邮箱
	 */
	private String email;
	/**
	 * 身份证绑定表
	 */
	private Long idCardId;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 身份证号
	 */
	private String cardNumber;
	/**
	 * 用户头像id
	 */
	private Long headPicId;
	/**
	 * 用户状态
	 */
	private Integer userStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建人id
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
	private Integer status = Constants.GLOBLE_YES;

	private UserHeadPic userHeadPic;
	private UserIdCard userIdCard;
	private UserEmail userEmail;
	private UserMobile userMobile;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getMobileId() {
		return mobileId;
	}
	public void setMobileId(Long mobileId) {
		this.mobileId = mobileId;
	}
	public Long getEmailId() {
		return emailId;
	}
	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}
	public Long getIdCardId() {
		return idCardId;
	}
	public void setIdCardId(Long idCardId) {
		this.idCardId = idCardId;
	}
	public Long getHeadPicId() {
		return headPicId;
	}
	public void setHeadPicId(Long headPicId) {
		this.headPicId = headPicId;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
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
	public UserHeadPic getUserHeadPic() {
		return userHeadPic;
	}
	public void setUserHeadPic(UserHeadPic userHeadPic) {
		this.userHeadPic = userHeadPic;
	}
	public UserIdCard getUserIdCard() {
		return userIdCard;
	}
	public void setUserIdCard(UserIdCard userIdCard) {
		this.userIdCard = userIdCard;
	}
	public UserEmail getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(UserEmail userEmail) {
		this.userEmail = userEmail;
	}
	public UserMobile getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(UserMobile userMobile) {
		this.userMobile = userMobile;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public Long getId() {
		return userId;
	}
}
