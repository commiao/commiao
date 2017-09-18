package com.chtwm.mall.pojo.productList;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ProductList implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 产品代码
	 */
	private String code;
	/**
	 * 产品名称
	 */
	private String name;
	/**
	 * 产品详情图片
	 */
	private String imgPath;
	/**
	 * 顺序位
	 */
	private String pindex;
	/**
	 * 状态
	 */
	private int enables;
	/**
	 * 插入时间
	 */
	private Date createTime;
	/**
	 * 更新时间
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
	/**
	 * 客户端类别
	 */
	private String categoryCode;
	/**
	 * 客户端名称
	 */
	private String categoryCodeName;
	/**
	 * 产品亮点
	 */
	private String features;

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
	 * code的setter方法
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * code的getter方法
	 **/
	public String getCode() {
		return this.code;
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
	 * imgPath的setter方法
	 **/
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * imgPath的getter方法
	 **/
	public String getImgPath() {
		return this.imgPath;
	}

	public String getPindex() {
		return pindex;
	}

	public void setPindex(String pindex) {
		this.pindex = pindex;
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

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getCategoryCodeName() {
		return categoryCodeName;
	}

	public void setCategoryCodeName(String categoryCodeName) {
		this.categoryCodeName = categoryCodeName;
	}
	
	
}