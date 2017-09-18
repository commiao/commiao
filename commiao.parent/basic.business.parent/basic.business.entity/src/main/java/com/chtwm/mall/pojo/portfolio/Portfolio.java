package com.chtwm.mall.pojo.portfolio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class Portfolio implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 投资组合
	 */
	private Long id;
	/**
	 * 专题类别
	 */
	private String category;
	/**
	 * 专题类别描述
	 */
	private String categoryDesc;
	/**
	 * 专题名称
	 */
	private String subjectName;
	/**
	 * 专题顺序
	 */
	private Integer serialNumber;
	/**
	 * 未登录文案
	 */
	private String notLogginDocuments;
	/**
	 * 专题缩略图
	 */
	private String imgUrlThumbnail;
	/**
	 * 专题详情图
	 */
	private String imgUrlDetail;
	/**
	 * 状态 0禁用 1启用
	 */
	private int enables;
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
	 * 组合产品
	 */
	private List<PortfolioProduct> portfolioProductList;

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
	 * @return the categoryDesc
	 */
	public String getCategoryDesc() {
		return categoryDesc;
	}

	/**
	 * @param categoryDesc the categoryDesc to set
	 */
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	/**
	 * subjectName的setter方法
	 **/
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * subjectName的getter方法
	 **/
	public String getSubjectName() {
		return this.subjectName;
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
	 * notLogginDocuments的setter方法
	 **/
	public void setNotLogginDocuments(String notLogginDocuments) {
		this.notLogginDocuments = notLogginDocuments;
	}

	/**
	 * notLogginDocuments的getter方法
	 **/
	public String getNotLogginDocuments() {
		return this.notLogginDocuments;
	}

	/**
	 * imgUrlThumbnail的setter方法
	 **/
	public void setImgUrlThumbnail(String imgUrlThumbnail) {
		this.imgUrlThumbnail = imgUrlThumbnail;
	}

	/**
	 * imgUrlThumbnail的getter方法
	 **/
	public String getImgUrlThumbnail() {
		return this.imgUrlThumbnail;
	}

	/**
	 * imgUrlDetail的setter方法
	 **/
	public void setImgUrlDetail(String imgUrlDetail) {
		this.imgUrlDetail = imgUrlDetail;
	}

	/**
	 * imgUrlDetail的getter方法
	 **/
	public String getImgUrlDetail() {
		return this.imgUrlDetail;
	}

	/**
	 * enables的setter方法
	 **/
	public void setEnables(int enables) {
		this.enables = enables;
	}

	/**
	 * enables的getter方法
	 **/
	public int getEnables() {
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

	public Long getIdShow() {
		return id;
	}

	public void setIdShow(Long idShow) {
		this.id = idShow;
	}

	/**
	 * 获取 组合产品
	 * 
	 * @return portfolioProductList
	 */
	public List<PortfolioProduct> getPortfolioProductList() {
		return portfolioProductList;
	}

	/**
	 * 设置 组合产品
	 * 
	 * @param portfolioProductList
	 *            the portfolioProductList to set
	 */
	public void setPortfolioProductList(List<PortfolioProduct> portfolioProductList) {
		this.portfolioProductList = portfolioProductList;
	}
}