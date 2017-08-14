package com.commiao.domain.pojo.user;

import java.util.Date;

import com.commiao.domain.constants.Constants;
import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;


/**
 * 用户绑定身份证表
 * @author 
 *
 */
public class UserIdCard extends EntitySupport implements Entity{
  private static final long serialVersionUID = 1L;
  /**
   * 主键
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
   * 是否已实名认证
   */
  
  private Integer idCardStatus;
  /**
   * 上传身份证照片文件
   */
  private Long fileId;
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
public Long getIdCardId() {
	return idCardId;
}
public void setIdCardId(Long idCardId) {
	this.idCardId = idCardId;
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
public Integer getIdCardStatus() {
	return idCardStatus;
}
public void setIdCardStatus(Integer idCardStatus) {
	this.idCardStatus = idCardStatus;
}
public Long getFileId() {
	return fileId;
}
public void setFileId(Long fileId) {
	this.fileId = fileId;
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
	return idCardId;
}


  
  
  
  

}
