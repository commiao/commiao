package com.commiao.sdk.controller.common.domain;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import basic.arch.tools.utils.common.ConvertUtils;

import com.commiao.basic.business.tools.validate.NumberValidationUtils;

/**
 * 2015-12-01
 * @author jannal
 * 分页请求参数封装
 */
public class  PageBeanParams<T> {

	public final static  int DEFAULT_CUR_PAGE = 1;
	
	public final static  int DEFAULT_PAGE_SIZE = 10;
	
	/***
	 * 最大的页面大小，防止外部无限制的传入大值，导致服务器压力大
	 */
	public final static int MAX_PAGE_SIZE = 50;
	
	public PageBeanParams(){}
	
	public PageBeanParams(String curPage, String pageSize, T conditionParamsData) {
	    if(NumberValidationUtils.isPositiveInteger(curPage)){
	        this.curPage = Integer.valueOf(curPage);
        }
        if(NumberValidationUtils.isPositiveInteger(pageSize)){
            this.pageSize =Integer.valueOf(pageSize);
        }
        this.conditionParamsData = conditionParamsData;
    }
	
    public PageBeanParams(String sortString, int curPage, int pageSize, T conditionParamsData) {
        super();
        this.sortString = sortString;
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.conditionParamsData = conditionParamsData;
    }
    
    public PageBeanParams( int curPage, int pageSize, T conditionParamsData, Map<String, Object> conditionMap) {
        super();
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.conditionParamsData = conditionParamsData;
        this.conditionMap = conditionMap;
    }

    /**
	 * 排序字符串 格式 例如name.desc,age.asc  在mysql的情况下，不建议使用，会导致子查询，效率比较低。推荐直接在mapper.xml中写排序规则 (jannal提示)
	 */
	private String sortString;
	
	/**
	 * 当前页，页码,默认1
	 */
	private int curPage = DEFAULT_CUR_PAGE;
	/***
	 * 每页数据条数，默认10条
	 */
	private int pageSize=DEFAULT_PAGE_SIZE;
	/***
	 * 请求的分页查询条件Bean
	 */
	@SuppressWarnings("unchecked")
	private T conditionParamsData = (T) new Object();
	
	/***
	 * 分页查询Bean转Map
	 */
	private Map<String,Object> conditionMap = new HashMap<String,Object>();
	
	
	public Map<String, Object> getConditionMap() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	    Map<String, Object> beanToMap = ConvertUtils.beanToMap(this.getConditionParamsData());
        this.conditionMap.putAll(beanToMap);
		return conditionMap;
	}

	public void setConditionMap(Map<String, Object> conditionMap) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Map<String, Object> beanToMap = ConvertUtils.beanToMap(this.getConditionParamsData());
		this.conditionMap.putAll(beanToMap);
		this.conditionMap.putAll(conditionMap);
	}

	public T getConditionParamsData() {
		return conditionParamsData;
	}
	
	public void setConditionParamsData(T paramsData) {
		this.conditionParamsData = paramsData;
	}
	public int getCurPage() {
		return curPage<=0?DEFAULT_CUR_PAGE:curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPageSize() {
		return (pageSize<=0||pageSize>MAX_PAGE_SIZE)?DEFAULT_PAGE_SIZE:pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getSortString() {
		return sortString;
	}
	public void setSortString(String sortString) {
		this.sortString = sortString;
	}
	/**
	 * 是否有排序
	 * @return
	 */
	public boolean isSort(){
		if(!validateSort(getSortString())){
			return false;
		}
		return true;
	}
	
	/**
	 * 校验分页排序参数是否有，是否正确，如果有但是格式不正确也返回false
	 * @param sortString
	 * @return
	 */
	public  boolean validateSort(String sortString){
		if(StringUtils.isEmpty(sortString)){
			return false;
		}
		String[] strs = sortString.split(",");
		if(strs==null){
			return false;
		}
		for(int i = 0;i<strs.length;i++){
			if(strs[i].equals(".asc")||strs[i].equals(".desc")||(!strs[i].endsWith(".asc")&&!strs[i].endsWith(".desc"))){
				return false;
			}
		}
		return true;
	}
	
}
