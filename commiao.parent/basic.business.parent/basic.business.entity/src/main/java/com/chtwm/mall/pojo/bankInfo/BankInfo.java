package com.chtwm.mall.pojo.bankInfo;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * CreateDate:2017年3月2日下午6:34:03
 * 
 * @Description: 银行信息pojo
 * @author:hehch
 * @version V1.0
 */
public class BankInfo implements Serializable {

	private static final long serialVersionUID = 7201564226790616492L;

	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 客户端类型
	 */
	private String platform;

	/**
	 * 银行名称
	 */
	private String bankName;

	/**
	 * 银行编号
	 */
	private String bankNo;

	/**
	 * 图片
	 */
	private String imageUrl;

	/**
	 * app图片
	 */
	private String imageUrlThumbnail;

	/**
	 * 状态 1 有效 0 无效
	 */
	private Integer bankStatus;

	/**
	 * 显示顺序
	 */
	private Integer seqNo;

	/**
	 * 创建时间
	 */
	private Date createtime;

	/**
	 * 更新时间
	 */
	private Date updatetime;

	/**
	 * 更新时间
	 */
	private String updatetimeStr;

	/**
	 * 创建人
	 */
	private Long createId;

	/**
	 * 更新人
	 */
	private Long updateId;
	
	/**
	 * 网银登录地址
	 */
	private String onlineBankAddress;

	/**
	 * 获取 id
	 * 
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 获取 银行名称
	 * 
	 * @return bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 获取 银行编号
	 * 
	 * @return bankNo
	 */
	public String getBankNo() {
		return bankNo;
	}

	/**
	 * 获取 图片
	 * 
	 * @return imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * 获取 状态 1 有效 0 无效
	 * 
	 * @return bankStatus
	 */
	public Integer getBankStatus() {
		return bankStatus;
	}

	/**
	 * 获取 显示顺序
	 * 
	 * @return seqNo
	 */
	public Integer getSeqNo() {
		return seqNo;
	}

	/**
	 * 获取 创建时间
	 * 
	 * @return createtime
	 */
	public Date getCreatetime() {
		return createtime;
	}

	/**
	 * 获取 更新时间
	 * 
	 * @return updatetime
	 */
	public Date getUpdatetime() {
		return updatetime;
	}

	/**
	 * 获取 更新时间
	 * 
	 * @return updatetimeStr
	 */
	public String getUpdatetimeStr() {
		return updatetimeStr;
	}

	/**
	 * 获取 创建人
	 * 
	 * @return createId
	 */
	public Long getCreateId() {
		return createId;
	}

	/**
	 * 获取 更新人
	 * 
	 * @return updateId
	 */
	public Long getUpdateId() {
		return updateId;
	}

	/**
	 * 设置 id
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 设置 银行名称
	 * 
	 * @param bankName
	 *            the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 设置 银行编号
	 * 
	 * @param bankNo
	 *            the bankNo to set
	 */
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	/**
	 * 设置 图片
	 * 
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * 设置 状态 1 有效 0 无效
	 * 
	 * @param bankStatus
	 *            the bankStatus to set
	 */
	public void setBankStatus(Integer bankStatus) {
		this.bankStatus = bankStatus;
	}

	/**
	 * 设置 显示顺序
	 * 
	 * @param seqNo
	 *            the seqNo to set
	 */
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	/**
	 * 设置 创建时间
	 * 
	 * @param createtime
	 *            the createtime to set
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * 设置 更新时间
	 * 
	 * @param updatetime
	 *            the updatetime to set
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * 设置 更新时间
	 * 
	 * @param updatetimeStr
	 *            the updatetimeStr to set
	 */
	public void setUpdatetimeStr(String updatetimeStr) {
		this.updatetimeStr = updatetimeStr;
	}

	/**
	 * 设置 创建人
	 * 
	 * @param createId
	 *            the createId to set
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	/**
	 * 设置 更新人
	 * 
	 * @param updateId
	 *            the updateId to set
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}

	public String getCreatetimeString() {
		return DateUtils.formatDateToString(getCreatetime(), "yyyy-MM-dd HH:mm:ss");
	}

	public void setCreatetimeString(String createtimeStr) {
		setCreatetime(DateUtils.parse(createtimeStr, "yyyy-MM-dd HH:mm:ss"));
	}

	public String getUpdatetimeString() {
		return DateUtils.formatDateToString(getUpdatetime(), "yyyy-MM-dd HH:mm:ss");
	}

	public void setUpdatetimeString(String updatetimeStr) {
		setUpdatetime(DateUtils.parse(updatetimeStr, "yyyy-MM-dd HH:mm:ss"));
	}

	/** 
	 * 获取 网银登录地址 
	 * @return onlineBankAddress 
	 */
	public String getOnlineBankAddress() {
		return onlineBankAddress;
	}

	/**
	 * 设置 网银登录地址 
	 * @param onlineBankAddress the onlineBankAddress to set
	 */
	public void setOnlineBankAddress(String onlineBankAddress) {
		this.onlineBankAddress = onlineBankAddress;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getImageUrlThumbnail() {
		return imageUrlThumbnail;
	}

	public void setImageUrlThumbnail(String imageUrlThumbnail) {
		this.imageUrlThumbnail = imageUrlThumbnail;
	}
	
}
