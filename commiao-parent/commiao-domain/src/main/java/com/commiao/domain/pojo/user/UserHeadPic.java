package com.commiao.domain.pojo.user;

import java.util.Date;

import com.commiao.domain.constants.Constants;
import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;


/**
 * 用户头像表
 * @author
 *
 */
public class UserHeadPic  extends EntitySupport implements Entity {

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private Long headPicId;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 文件id
	 */
	private Long fileId;
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
	private String createnNickName;
	/**
	 * 使用状态
	 */
	private Integer status=Constants.GLOBLE_YES;
	public Long getHeadPicId() {
		return headPicId;
	}
	public void setHeadPicId(Long headPicId) {
		this.headPicId = headPicId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	
	public String getCreatenNickName() {
		return createnNickName;
	}
	public void setCreatenNickName(String createnNickName) {
		this.createnNickName = createnNickName;
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
	@Override
	public Long getId() {
		return headPicId;
	}
	
	
	
	
	
	
	
	

}
