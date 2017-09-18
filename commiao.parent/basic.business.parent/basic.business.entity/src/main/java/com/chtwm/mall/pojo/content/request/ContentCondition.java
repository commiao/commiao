package com.chtwm.mall.pojo.content.request;

import com.chtwm.mall.pojo.content.Content;

/**
 * 请求参数,请求条件等
 */
public class ContentCondition extends Content {
    private static final long serialVersionUID = 6851794280101498332L;

    private int curPage;
    
    private int pageSize;
    /*
     * 查询年限
     * 2017: 2017.01.01~2017.12.31
     * -2014: 最早~2014.12.31
     */
    private String timeRange;   
    
    /*
     * 数据库组类型，表示访问后台关于哪个网站维护的信息
     *   contentCategory ： 明泽（老金服网站，入参为空则sql中默认此参数）
     *   contentCategoryGF ： 股份网站
     *   contentCategoryRZ ： 融泽网站
     *   contentCategoryZY ： 中岩网站
     */
    private String groupType;   
    
    /**
     * 批量操作多个id
     */
    private String ids;

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

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
    
    
}