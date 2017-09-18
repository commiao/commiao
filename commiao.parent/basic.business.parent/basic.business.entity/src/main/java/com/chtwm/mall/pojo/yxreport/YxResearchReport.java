package com.chtwm.mall.pojo.yxreport;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class YxResearchReport  implements Serializable  {
    private static final long serialVersionUID = 5454155825314635342L;
    
    /**
     * 
     */
    private Long id;
    /**
     * 所属类别
     */
    private String researchId;
    /**
     * 所属类别名称
     */
    private String description;
    
    /**
     * 所属类别描述
     */
    private String researchIdDesc;
    /**
     * 标题
     */
    private String title;
    /**
     * 来源
     */
    private String source;
    /**
     * 作者
     */
    private String author;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片链接
     */
    private String imageUrl;
    /**
     * 图片链接App
     */
    private String imageUrlApp;
    /**
     * 是否重点推荐
     */
    private Integer recommend;
    /**
     * 发布日期
     */
    private Date releaseDate;
    /**
     * 是否显示 1 是  0 否
     */
    private String isShow;
    /**
     * 阅读数
     */
    private Long isNum;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 简介
     */
    private String introduction;
    
    /**
     * 显示ID
     */
    private Long idShow;
    
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
    
    /**
     *researchId的setter方法
     **/     
    public void setResearchId(String researchId) {
        this.researchId = researchId;
    }
     /**
     *researchId的getter方法
     **/ 
    public String getResearchId() {
        return this.researchId;
    }
    
    /**
     *title的setter方法
     **/     
    public void setTitle(String title) {
        this.title = title;
    }
     /**
     *title的getter方法
     **/ 
    public String getTitle() {
        return this.title;
    }
    
    /**
     *source的setter方法
     **/     
    public void setSource(String source) {
        this.source = source;
    }
     /**
     *source的getter方法
     **/ 
    public String getSource() {
        return this.source;
    }
    
    /**
     *author的setter方法
     **/     
    public void setAuthor(String author) {
        this.author = author;
    }
     /**
     *author的getter方法
     **/ 
    public String getAuthor() {
        return this.author;
    }
    
    /**
     *content的setter方法
     **/     
    public void setContent(String content) {
        this.content = content;
    }
     /**
     *content的getter方法
     **/ 
    public String getContent() {
        return this.content;
    }
    
    /**
     *imageUrl的setter方法
     **/     
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
     /**
     *imageUrl的getter方法
     **/ 
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public String getImageUrlApp() {
        return imageUrlApp;
    }
    public void setImageUrlApp(String imageUrlApp) {
        this.imageUrlApp = imageUrlApp;
    }
    /**
     *recommend的setter方法
     **/     
    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }
     /**
     *recommend的getter方法
     **/ 
    public Integer getRecommend() {
        return this.recommend;
    }
	public String getReleaseDateString() {
	  return DateUtils.formatDateToString(getReleaseDate(), "yyyy-MM-dd");
	}
	public void setReleaseDateString(String releaseDateStr) {
	  setReleaseDate(DateUtils.parse(releaseDateStr, "yyyy-MM-dd"));
	}
    
    /**
     *releaseDate的setter方法
     **/     
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
     /**
     *releaseDate的getter方法
     **/ 
    public Date getReleaseDate() {
        return this.releaseDate;
    }
    
    /**
     *isShow的setter方法
     **/     
    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }
     /**
     *isShow的getter方法
     **/ 
    public String getIsShow() {
        return this.isShow;
    }
	public String getCreatetimeString() {
	  return DateUtils.formatDateToString(getCreatetime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setCreatetimeString(String createtimeStr) {
	  setCreatetime(DateUtils.parse(createtimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *createtime的setter方法
     **/     
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
     /**
     *createtime的getter方法
     **/ 
    public Date getCreatetime() {
        return this.createtime;
    }
	public String getUpdatetimeString() {
	  return DateUtils.formatDateToString(getUpdatetime(), "yyyy-MM-dd HH:mm:ss");
	}
	public void setUpdatetimeString(String updatetimeStr) {
	  setUpdatetime(DateUtils.parse(updatetimeStr, "yyyy-MM-dd HH:mm:ss"));
	}
    
    /**
     *updatetime的setter方法
     **/     
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
     /**
     *updatetime的getter方法
     **/ 
    public Date getUpdatetime() {
        return this.updatetime;
    }
    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
	public Long getIsNum() {
	    if(isNum==null){
	        isNum = 1L;
	    }
		return isNum;
	}
	public void setIsNum(Long isNum) {
		this.isNum = isNum;
	}
    public String getResearchIdDesc() {
        return researchIdDesc;
    }
    public void setResearchIdDesc(String researchIdDesc) {
        this.researchIdDesc = researchIdDesc;
    }
	public Long getIdShow() {
		return idShow;
	}
	public void setIdShow(Long idShow) {
		this.idShow = idShow;
	}
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}