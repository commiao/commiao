package com.chtwm.mall.pojo.communityActivities;

import java.io.Serializable;

/**
 * CreateDate:2017年7月07日
 * @Description: 恒乐会社区活动Bean
 * @author:chenglong
 * 
 */
public class CommunityActivityResult  implements Serializable  {
    private static final long serialVersionUID = -2087876650106632146L;
    /**
     * id
     */
    private String id;
    /**
     * 社区活动名称
     */
    private String actName;
    /**
     * 序列号
     */
    private String serialNumber;
    /**
     * 活动地点
     */
    private String actPlace;
    /**
     * 活动介绍
     */
    private String actIntroduce;
    /**
     * 开始时间
     */
    private String beginTime;
    /**
     * 是否预热中  0否 1是
     */
    private String isWarmUp;
    /**
     * 是否开启服务 0否 1是
     */
    private String isOpenServer;
    /**
     * 图片
     */
    private String imgUrl;
    /**
     * 报名人数
     */
    private String enrollNum;
    /**
     * 客户端类型
     */
    private String platform;
    /**
     * 社区描述
     */
    private String actUrl;
    /**
     * 社区标题（用于分享）
     */
    private String actTitle;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getActName() {
        return actName;
    }
    public void setActName(String actName) {
        this.actName = actName;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getActPlace() {
        return actPlace;
    }
    public void setActPlace(String actPlace) {
        this.actPlace = actPlace;
    }
    public String getActIntroduce() {
        return actIntroduce;
    }
    public void setActIntroduce(String actIntroduce) {
        this.actIntroduce = actIntroduce;
    }
    public String getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getIsOpenServer() {
        return isOpenServer;
    }
    public void setIsOpenServer(String isOpenServer) {
        this.isOpenServer = isOpenServer;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getIsWarmUp() {
        return isWarmUp;
    }
    public void setIsWarmUp(String isWarmUp) {
        this.isWarmUp = isWarmUp;
    }
    public String getEnrollNum() {
        return enrollNum;
    }
    public void setEnrollNum(String enrollNum) {
        this.enrollNum = enrollNum;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getActUrl() {
        return actUrl;
    }
    public void setActUrl(String actUrl) {
        this.actUrl = actUrl;
    }
    public String getActTitle() {
        return actTitle;
    }
    public void setActTitle(String actTitle) {
        this.actTitle = actTitle;
    }
    
}