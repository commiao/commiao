package com.chtwm.mall.pojo.product;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ProductRecommendApp  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * ID
     */
    private Long id;
    /**
     * 显示ID
     */
    private Long idShow;
    /**
     * 产品编码
     */
    private String code;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 组类型编码
     */
    private String groupType;
    /**
     * 组类型名称
     */
    private String groupTypeName;
    /**
     * 产品推荐方案
     */
    private String recommend;
    /**
     * 序列号
     */
    private Integer serialNumber;
    /**
     * 图片路径
     */
    private String imgUrl;
    /**
     * 状态
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
     * 产品亮点
     */
    private String productFeature;
    
    public String getProductFeature() {
		return productFeature;
	}
	
	public void setProductFeature(String productFeature) {
		this.productFeature = productFeature;
	}
	
	/**
     *id的setter方法
     **/     
    public void setId(Long id) {
        this.id = id;
    }
     /**
     *id的getter方法
     **/ 
    public Long getId() {
        return this.id;
    }
    
    public Long getIdShow() {
        return idShow;
    }
    public void setIdShow(Long idShow) {
        this.idShow = idShow;
    }
    /**
     *code的setter方法
     **/     
    public void setCode(String code) {
        this.code = code;
    }
     /**
     *code的getter方法
     **/ 
    public String getCode() {
        return this.code;
    }
    
    /**
     *name的setter方法
     **/     
    public void setName(String name) {
        this.name = name;
    }
     /**
     *name的getter方法
     **/ 
    public String getName() {
        return this.name;
    }
    
    /**
     *groupTypeId的setter方法
     **/     
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
     /**
     *groupTypeId的getter方法
     **/ 
    public String getGroupType() {
        return this.groupType;
    }
    
    public String getGroupTypeName() {
        return groupTypeName;
    }
    public void setGroupTypeName(String groupTypeName) {
        this.groupTypeName = groupTypeName;
    }
    /**
     *recommend的setter方法
     **/     
    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
     /**
     *recommend的getter方法
     **/ 
    public String getRecommend() {
        return this.recommend;
    }
    
    /**
     *serialNumber的setter方法
     **/     
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
     /**
     *serialNumber的getter方法
     **/ 
    public Integer getSerialNumber() {
        return this.serialNumber;
    }
    
    /**
     *imgUrl的setter方法
     **/     
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
     /**
     *imgUrl的getter方法
     **/ 
    public String getImgUrl() {
        return this.imgUrl;
    }
    
    /**
     *enables的setter方法
     **/     
    public void setEnables(int enables) {
        this.enables = enables;
    }
     /**
     *enables的getter方法
     **/ 
    public int getEnables() {
        return this.enables;
    }
    
    /**
     *createId的setter方法
     **/     
    public void setCreateId(Long createId) {
        this.createId = createId;
    }
     /**
     *createId的getter方法
     **/ 
    public Long getCreateId() {
        return this.createId;
    }
    
    /**
     *updateId的setter方法
     **/     
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
     /**
     *updateId的getter方法
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
     *createTime的setter方法
     **/     
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
     /**
     *createTime的getter方法
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
     *updateTime的setter方法
     **/     
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
     /**
     *updateTime的getter方法
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
}