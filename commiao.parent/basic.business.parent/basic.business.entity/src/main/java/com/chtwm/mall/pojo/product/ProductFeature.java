package com.chtwm.mall.pojo.product;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class ProductFeature  implements Serializable  {
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
     * 专题编码
     */
    private String code;
    /**
     * 专题名称
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
     * 缩略图片路径
     */
    private String imgUrlThumbnail;
    /**
     * 专题详情图片路径
     */
    private String imgUrlFeatureDetail;
    /**
     * 状态
     */
    private int enables;
    /**
     * 产品专题编码1
     */
    private String productFeatureCode1;
    /**
     * 产品专题名称1
     */
    private String productFeatureName1;
    /**
     * 产品专题2编码
     */
    private String productFeatureCode2;
    /**
     * 产品专题名称2
     */
    private String productFeatureName2;
    /**
     * 产品专题编码3
     */
    private String productFeatureCode3;
    /**
     * 产品专题名称3
     */
    private String productFeatureName3;
    /**
     * 产品专题编码4
     */
    private String productFeatureCode4;
    /**
     * 产品专题名称4
     */
    private String productFeatureName4;
    /**
     * 产品专题编码5
     */
    private String productFeatureCode5;
    /**
     * 产品专题名称5
     */
    private String productFeatureName5;
    /**
     * 产品专题编码6
     */
    private String productFeatureCode6;
    /**
     * 产品专题名称6
     */
    private String productFeatureName6;
    /**
     * 产品专题7编码
     */
    private String productFeatureCode7;
    /**
     * 产品专题名称7
     */
    private String productFeatureName7;
    /**
     * 产品专题编码8
     */
    private String productFeatureCode8;
    /**
     * 产品专题名称8
     */
    private String productFeatureName8;
    /**
     * 产品专题编码9
     */
    private String productFeatureCode9;
    /**
     * 产品专题名称9
     */
    private String productFeatureName9;
    /**
     * 产品专题编码10
     */
    private String productFeatureCode10;
    /**
     * 产品专题名称10
     */
    private String productFeatureName10;
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
     * 是否校验登录
     */
    private Integer isCheckLogin;
    /**
     * 是否校验风测
     */
    private Integer isCheckRisk;

    
	public Integer getIsCheckLogin() {
		return isCheckLogin;
	}
	public void setIsCheckLogin(Integer isCheckLogin) {
		this.isCheckLogin = isCheckLogin;
	}
	public Integer getIsCheckRisk() {
		return isCheckRisk;
	}
	public void setIsCheckRisk(Integer isCheckRisk) {
		this.isCheckRisk = isCheckRisk;
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
     *imgUrlThumbnail的setter方法
     **/     
    public void setImgUrlThumbnail(String imgUrlThumbnail) {
        this.imgUrlThumbnail = imgUrlThumbnail;
    }
     /**
     *imgUrlThumbnail的getter方法
     **/ 
    public String getImgUrlThumbnail() {
        return this.imgUrlThumbnail;
    }
    
    /**
     *imgUrlFeatureDetail的setter方法
     **/     
    public void setImgUrlFeatureDetail(String imgUrlFeatureDetail) {
        this.imgUrlFeatureDetail = imgUrlFeatureDetail;
    }
     /**
     *imgUrlFeatureDetail的getter方法
     **/ 
    public String getImgUrlFeatureDetail() {
        return this.imgUrlFeatureDetail;
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
     *productFeatureCode1的setter方法
     **/     
    public void setProductFeatureCode1(String productFeatureCode1) {
        this.productFeatureCode1 = productFeatureCode1;
    }
     /**
     *productFeatureCode1的getter方法
     **/ 
    public String getProductFeatureCode1() {
        return this.productFeatureCode1;
    }
    
    /**
     *productFeatureName1的setter方法
     **/     
    public void setProductFeatureName1(String productFeatureName1) {
        this.productFeatureName1 = productFeatureName1;
    }
     /**
     *productFeatureName1的getter方法
     **/ 
    public String getProductFeatureName1() {
        return this.productFeatureName1;
    }
    
    /**
     *productFeatureCode2的setter方法
     **/     
    public void setProductFeatureCode2(String productFeatureCode2) {
        this.productFeatureCode2 = productFeatureCode2;
    }
     /**
     *productFeatureCode2的getter方法
     **/ 
    public String getProductFeatureCode2() {
        return this.productFeatureCode2;
    }
    
    /**
     *productFeatureName2的setter方法
     **/     
    public void setProductFeatureName2(String productFeatureName2) {
        this.productFeatureName2 = productFeatureName2;
    }
     /**
     *productFeatureName2的getter方法
     **/ 
    public String getProductFeatureName2() {
        return this.productFeatureName2;
    }
    
    /**
     *productFeatureCode3的setter方法
     **/     
    public void setProductFeatureCode3(String productFeatureCode3) {
        this.productFeatureCode3 = productFeatureCode3;
    }
     /**
     *productFeatureCode3的getter方法
     **/ 
    public String getProductFeatureCode3() {
        return this.productFeatureCode3;
    }
    
    /**
     *productFeatureName3的setter方法
     **/     
    public void setProductFeatureName3(String productFeatureName3) {
        this.productFeatureName3 = productFeatureName3;
    }
     /**
     *productFeatureName3的getter方法
     **/ 
    public String getProductFeatureName3() {
        return this.productFeatureName3;
    }
    
    /**
     *productFeatureCode4的setter方法
     **/     
    public void setProductFeatureCode4(String productFeatureCode4) {
        this.productFeatureCode4 = productFeatureCode4;
    }
     /**
     *productFeatureCode4的getter方法
     **/ 
    public String getProductFeatureCode4() {
        return this.productFeatureCode4;
    }
    
    /**
     *productFeatureName4的setter方法
     **/     
    public void setProductFeatureName4(String productFeatureName4) {
        this.productFeatureName4 = productFeatureName4;
    }
     /**
     *productFeatureName4的getter方法
     **/ 
    public String getProductFeatureName4() {
        return this.productFeatureName4;
    }
    
    /**
     *productFeatureCode5的setter方法
     **/     
    public void setProductFeatureCode5(String productFeatureCode5) {
        this.productFeatureCode5 = productFeatureCode5;
    }
     /**
     *productFeatureCode5的getter方法
     **/ 
    public String getProductFeatureCode5() {
        return this.productFeatureCode5;
    }
    
    /**
     *productFeatureName5的setter方法
     **/     
    public void setProductFeatureName5(String productFeatureName5) {
        this.productFeatureName5 = productFeatureName5;
    }
     /**
     *productFeatureName5的getter方法
     **/ 
    public String getProductFeatureName5() {
        return this.productFeatureName5;
    }
    
    /**
     *productFeatureCode6的setter方法
     **/     
    public void setProductFeatureCode6(String productFeatureCode6) {
        this.productFeatureCode6 = productFeatureCode6;
    }
     /**
     *productFeatureCode6的getter方法
     **/ 
    public String getProductFeatureCode6() {
        return this.productFeatureCode6;
    }
    
    /**
     *productFeatureName6的setter方法
     **/     
    public void setProductFeatureName6(String productFeatureName6) {
        this.productFeatureName6 = productFeatureName6;
    }
     /**
     *productFeatureName6的getter方法
     **/ 
    public String getProductFeatureName6() {
        return this.productFeatureName6;
    }
    
    /**
     *productFeatureCode7的setter方法
     **/     
    public void setProductFeatureCode7(String productFeatureCode7) {
        this.productFeatureCode7 = productFeatureCode7;
    }
     /**
     *productFeatureCode7的getter方法
     **/ 
    public String getProductFeatureCode7() {
        return this.productFeatureCode7;
    }
    
    /**
     *productFeatureName7的setter方法
     **/     
    public void setProductFeatureName7(String productFeatureName7) {
        this.productFeatureName7 = productFeatureName7;
    }
     /**
     *productFeatureName7的getter方法
     **/ 
    public String getProductFeatureName7() {
        return this.productFeatureName7;
    }
    
    /**
     *productFeatureCode8的setter方法
     **/     
    public void setProductFeatureCode8(String productFeatureCode8) {
        this.productFeatureCode8 = productFeatureCode8;
    }
     /**
     *productFeatureCode8的getter方法
     **/ 
    public String getProductFeatureCode8() {
        return this.productFeatureCode8;
    }
    
    /**
     *productFeatureName8的setter方法
     **/     
    public void setProductFeatureName8(String productFeatureName8) {
        this.productFeatureName8 = productFeatureName8;
    }
     /**
     *productFeatureName8的getter方法
     **/ 
    public String getProductFeatureName8() {
        return this.productFeatureName8;
    }
    
    /**
     *productFeatureCode9的setter方法
     **/     
    public void setProductFeatureCode9(String productFeatureCode9) {
        this.productFeatureCode9 = productFeatureCode9;
    }
     /**
     *productFeatureCode9的getter方法
     **/ 
    public String getProductFeatureCode9() {
        return this.productFeatureCode9;
    }
    
    /**
     *productFeatureName9的setter方法
     **/     
    public void setProductFeatureName9(String productFeatureName9) {
        this.productFeatureName9 = productFeatureName9;
    }
     /**
     *productFeatureName9的getter方法
     **/ 
    public String getProductFeatureName9() {
        return this.productFeatureName9;
    }
    
    /**
     *productFeatureCode10的setter方法
     **/     
    public void setProductFeatureCode10(String productFeatureCode10) {
        this.productFeatureCode10 = productFeatureCode10;
    }
     /**
     *productFeatureCode10的getter方法
     **/ 
    public String getProductFeatureCode10() {
        return this.productFeatureCode10;
    }
    
    /**
     *productFeatureName10的setter方法
     **/     
    public void setProductFeatureName10(String productFeatureName10) {
        this.productFeatureName10 = productFeatureName10;
    }
     /**
     *productFeatureName10的getter方法
     **/ 
    public String getProductFeatureName10() {
        return this.productFeatureName10;
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