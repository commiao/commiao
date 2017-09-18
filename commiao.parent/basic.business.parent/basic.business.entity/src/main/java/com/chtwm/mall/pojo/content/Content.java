package com.chtwm.mall.pojo.content;

import java.io.Serializable;
import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;

/**
 * 
 */
public class Content implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -6451292459551026910L;

    /**
     * 
     */
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 发布日期
     */
    private Date releaseDate;
    /**
     * 所属类别
     */
    private String category;

    private String categoryDesc;
    /**
     * 是否重点推荐 1 是 0 否
     */
    private Integer recommendation;
    /**
     * 图片
     */
    private String imageUrl;
    /**
     * app图片
     */
    private String imageUrlApp;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 内容
     */
    private String content;
    /**
     * 链接
     */
    private String targetUrl;
    /**
     * 是否显示
     */
    private Integer contentShow;
    /**
     * 状态 1 有效 0 无效
     */
    private Integer contentStatus;
    /**
     * 报道日期
     */
    private Date reportDate;
    /**
     * 来源
     */
    private String reportSource;
    /**
     * 
     */
    private Date createtime;
    /**
     * 
     */
    private Date updatetime;

    private Integer isSubject;// 是否专题页

    private String subjectTag;// 专题页URL

    private String productType;// 产品类型

    private Integer seqNo; // 显示顺序

    private int clicksNum; // 阅读数
    
    private Integer isLoginShow;//是否需要登录查看
    
    private String uid;//uuid 
    
    private String subTitle;//副标题，用户银杏研究专家中心专家职位介绍
    private Integer isRiskAssessment;// 是否风险测评
    private String releaseDateFormat;
    
    
    //*********
    private Long createId;
    
    private Long updateId;
    
    private String createName;
    
    private String updateName;
    

    public Long getCreateId() {
		return createId;
	}

	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	public Long getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}

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

	public String getReleaseDateFormat() {
        return releaseDateFormat;
    }

    public void setReleaseDateFormat(String releaseDateFormat) {
        this.releaseDateFormat = releaseDateFormat;
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
     * title的setter方法
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * title的getter方法
     **/
    public String getTitle() {
        return this.title;
    }

    public String getReleaseDateString() {
        return DateUtils.formatDateToString(getReleaseDate(), "yyyy-MM-dd");
    }

    public void setReleaseDateString(String releaseDateStr) {
        setReleaseDate(DateUtils.parse(releaseDateStr, "yyyy-MM-dd"));
    }

    /**
     * releaseDate的setter方法
     **/
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * releaseDate的getter方法
     **/
    public Date getReleaseDate() {
        return this.releaseDate;
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
     * recommendation的setter方法
     **/
    public void setRecommendation(Integer recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * recommendation的getter方法
     **/
    public Integer getRecommendation() {
        return this.recommendation;
    }

    /**
     * imageUrl的setter方法
     **/
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * imageUrl的getter方法
     **/
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * introduction的setter方法
     **/
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * introduction的getter方法
     **/
    public String getIntroduction() {
        return this.introduction;
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
     * targetUrl的setter方法
     **/
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    /**
     * targetUrl的getter方法
     **/
    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * contentShow的setter方法
     **/
    public void setContentShow(Integer contentShow) {
        this.contentShow = contentShow;
    }

    /**
     * contentShow的getter方法
     **/
    public Integer getContentShow() {
        return this.contentShow;
    }

    /**
     * contentStatus的setter方法
     **/
    public void setContentStatus(Integer contentStatus) {
        this.contentStatus = contentStatus;
    }

    /**
     * contentStatus的getter方法
     **/
    public Integer getContentStatus() {
        return this.contentStatus;
    }

    public String getReportDateString() {
        return DateUtils.formatDateToString(getReportDate(), "yyyy-MM-dd");
    }

    public void setReportDateString(String reportDateStr) {
        setReportDate(DateUtils.parse(reportDateStr, "yyyy-MM-dd"));
    }

    /**
     * reportDate的setter方法
     **/
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * reportDate的getter方法
     **/
    public Date getReportDate() {
        return this.reportDate;
    }

    /**
     * reportSource的setter方法
     **/
    public void setReportSource(String reportSource) {
        this.reportSource = reportSource;
    }

    /**
     * reportSource的getter方法
     **/
    public String getReportSource() {
        return this.reportSource;
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

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSubjectTag() {
        return subjectTag;
    }

    public void setSubjectTag(String subjectTag) {
        this.subjectTag = subjectTag;
    }

    public int getClicksNum() {
        return clicksNum;
    }

    public void setClicksNum(int clicksNum) {
        this.clicksNum = clicksNum;
    }

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Integer getIsLoginShow() {
		return isLoginShow;
	}

	public void setIsLoginShow(Integer isLoginShow) {
		this.isLoginShow = isLoginShow;
	}

	public Integer getIsSubject() {
		return isSubject;
	}

	public void setIsSubject(Integer isSubject) {
		this.isSubject = isSubject;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

    public Integer getIsRiskAssessment() {
        return isRiskAssessment;
    }

    public void setIsRiskAssessment(Integer isRiskAssessment) {
        this.isRiskAssessment = isRiskAssessment;
    }

    public String getImageUrlApp() {
        return imageUrlApp;
    }

    public void setImageUrlApp(String imageUrlApp) {
        this.imageUrlApp = imageUrlApp;
    }

}
