package com.chtwm.mall.pojo.productProtocol;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
/**
 * CreateDate:2017年3月17日上午10:26:44
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author:liudongguo
 * @version V1.0
 */
public class ProductProtocol implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * id
	 */
	private Long id;
	/**
	 * 协议名称
	 */
	private String protocolName;
	/**
	 * 协议类型 pof/pef
	 */
	private String type;
	/**
	 * 协议内容
	 */
	private String content;
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
	private Date createtime;
	/**
	 * 修改时间
	 */
	private Date updatetime;
	/**
	 * 是否启用 0否 1是
	 */
	private Integer enables;
	/**
	 * 客户端类别
	 */
	private String platform;
	
	/**
	 * 客户端名称
	 */
	private String platformName;

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
	 * protocolName的setter方法
	 **/
	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	/**
	 * protocolName的getter方法
	 **/
	public String getProtocolName() {
		return this.protocolName;
	}

	/**
	 * type的setter方法
	 **/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * type的getter方法
	 **/
	public String getType() {
		return this.type;
	}

	/**
	 * content的setter方法
	 **/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * content的getter方法
	 **/
	public String getContent() {
		return this.content;
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

	public String getCreatetimeString() {
		return DateUtils.formatDateToString(getCreatetime(),
				"yyyy-MM-dd HH:mm:ss");
	}

	public void setCreatetimeString(String createtimeStr) {
		setCreatetime(DateUtils.parse(createtimeStr, "yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * createtime的setter方法
	 **/
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * createtime的getter方法
	 **/
	public Date getCreatetime() {
		return this.createtime;
	}

	public String getUpdatetimeString() {
		return DateUtils.formatDateToString(getUpdatetime(),
				"yyyy-MM-dd HH:mm:ss");
	}

	public void setUpdatetimeString(String updatetimeStr) {
		setUpdatetime(DateUtils.parse(updatetimeStr, "yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * updatetime的setter方法
	 **/
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * updatetime的getter方法
	 **/
	public Date getUpdatetime() {
		return this.updatetime;
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

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

}