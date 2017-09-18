package com.chtwm.mall.pojo.excellentMoment;

import java.io.Serializable;

/**
 * CreateDate:2017年7月06日
 * @Description: 恒乐会精彩瞬间结果Bean
 * @author:chenglong
 */
public class ExcellentMomentResult  implements Serializable  {

    private static final long serialVersionUID = 5792682908834692272L;
	/**
     * id
     */
    private String id;
    /**
     * 图片名称
     */
    private String imgName;
    /**
     * 图片介绍
     */
    private String imgIntroduce;
    /**
     * 序列号
     */
    private String serialNumber;
    /**
     * 图片路径
     */
    private String imgUrl;
    /**
     * 缩略图路径
     */
    private String imgThumbnailUrl;
    /**
     * 链接
     */
    private String linkUrl;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getImgName() {
        return imgName;
    }
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
    public String getImgIntroduce() {
        return imgIntroduce;
    }
    public void setImgIntroduce(String imgIntroduce) {
        this.imgIntroduce = imgIntroduce;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getImgThumbnailUrl() {
        return imgThumbnailUrl;
    }
    public void setImgThumbnailUrl(String imgThumbnailUrl) {
        this.imgThumbnailUrl = imgThumbnailUrl;
    }
    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
    
}