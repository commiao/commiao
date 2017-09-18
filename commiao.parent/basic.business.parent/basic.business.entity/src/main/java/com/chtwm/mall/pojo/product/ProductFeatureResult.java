package com.chtwm.mall.pojo.product;

import java.io.Serializable;
import java.util.List;

public class ProductFeatureResult implements Serializable {

    private static final long serialVersionUID = 147724213767437536L;
    /**
     * ID
     */
    private Long id;
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
     * 是否校验登录
     */
    private String isCheckLogin;
    /**
     * 是否校验风测
     */
    private String isCheckRisk;
    /**
     * 专题产品集合
     */
    private List<ProductFeatureBean> productFeatureList;

    private String releaseDate; //发布日期

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public String getIsCheckLogin() {
		return isCheckLogin;
	}
	public void setIsCheckLogin(String isCheckLogin) {
		this.isCheckLogin = isCheckLogin;
	}
	public String getIsCheckRisk() {
		return isCheckRisk;
	}
	public void setIsCheckRisk(String isCheckRisk) {
		this.isCheckRisk = isCheckRisk;
	}
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
     * groupTypeId的setter方法
     **/
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * groupTypeId的getter方法
     **/
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * recommend的setter方法
     **/
    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    /**
     * recommend的getter方法
     **/
    public String getRecommend() {
        return this.recommend;
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
     * imgUrlFeatureDetail的setter方法
     **/
    public void setImgUrlFeatureDetail(String imgUrlFeatureDetail) {
        this.imgUrlFeatureDetail = imgUrlFeatureDetail;
    }

    /**
     * imgUrlFeatureDetail的getter方法
     **/
    public String getImgUrlFeatureDetail() {
        return this.imgUrlFeatureDetail;
    }

    /**
     * 专题产品集合
     */
    public List<ProductFeatureBean> getProductFeatureList() {
        return productFeatureList;
    }

    public void setProductFeatureList(List<ProductFeatureBean> productFeatureList) {
        this.productFeatureList = productFeatureList;
    }

}