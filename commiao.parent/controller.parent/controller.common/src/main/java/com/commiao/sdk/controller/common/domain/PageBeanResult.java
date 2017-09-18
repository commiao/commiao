package com.commiao.sdk.controller.common.domain;

import java.util.HashMap;
import java.util.Map;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.github.miemiedev.mybatis.paginator.domain.Paginator;


/***
 * 分页数据返回bean
 * @author jannal 2015-12-01
 * @param <T>
 */
public class PageBeanResult<T> {
    
    public static final String ERROR_MSG = "数据查询失败，请稍后重试";
    
    /**
     * 返回的list数据
     */
    private PageList<T> pageList;
    
    /**
     * 返回给页面的条件map
     */
    private Map<String,Object> condition;
    
    public PageBeanResult(){
    }

    public Map<String, Object> getCondition() {
        return condition;
    }

    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }

    /***
     * 获取分页项 
     * @return
     */
    public Map<String,Object> getPageItems(){
        Map<String,Object> map = new HashMap<String, Object>(16);
        Paginator paginator = pageList.getPaginator();
        //数据总条数
        map.put("totalCount",paginator.getTotalCount());
        //总页数 
        map.put("totalPages",paginator.getTotalPages());
        //取得当前页页码
        map.put("page", paginator.getPage());
        //分页大小
        map.put("limit", paginator.getLimit());
        //起始行
        map.put("startRow", paginator.getStartRow());
        //结束行
        map.put("endRow", paginator.getEndRow());
        //偏移量
        map.put("offset", paginator.getOffset());
        //页码条
        map.put("slider", paginator.getSlider());
        //上一页页码
        map.put("prePage", paginator.getPrePage());
        //下一页页码 
        map.put("nextPage", paginator.getNextPage());
        //是否是第一页
        map.put("firstPage", paginator.isFirstPage());
        //是否有下一页 true
        map.put("hasNextPage", paginator.isHasNextPage());
        //是否有前一页
        map.put("hasPrePage", paginator.isHasPrePage());
        //是否是最后一页
        map.put("lastPage", paginator.isLastPage());
        return map;
    }
    public PageBeanResult(PageList<T> pageList){
        this.pageList = pageList;
    }
    
    public PageList<T> getPageList() {
        return pageList;
    }

    public void setPageList(PageList<T> pageList) {
        this.pageList = pageList;
    }

 /*   public PageList<T> getRows() {
        return pageList;
    }

    public int getTotal() {
        return pageList.getPaginator().getTotalCount();
    }*/


}
