package com.chtwm.mall.pojo.banner.request;

import com.chtwm.mall.pojo.banner.AdImages;

/**
 * 请求参数,请求条件等
 */
public class AdImagesCondition extends AdImages {
    private static final long serialVersionUID = 6851794280101498332L;

    private int curPage;
    
    private int pageSize;
    
    private String ids;
    
    //2016-5-26 shl 添加查询限制条数
    private Integer limitCount;
    
    /*
     * 数据库组类型，表示访问后台关于哪个网站维护的信息
     *   bannerCategory ： 明泽（老金服网站，入参为空则sql中默认此参数）
     *   bannerCategoryGF ： 股份网站
     *   bannerCategoryRZ ： 融泽网站
     *   bannerCategoryZY ： 中岩网站
     */
    private String groupType;   
    
    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

	public Integer getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(Integer limitCount) {
		this.limitCount = limitCount;
	}

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
	
}