package com.chtwm.mall.pojo.communityActivities.request;

import com.chtwm.mall.pojo.communityActivities.CommunityActivities;

/**
 * 请求参数,请求条件等
 */
public class CommunityActivitiesCondition extends CommunityActivities {
    private static final long serialVersionUID = 6851794280101498332L;

    private int curPage;
    
    private int pageSize;
    
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

}