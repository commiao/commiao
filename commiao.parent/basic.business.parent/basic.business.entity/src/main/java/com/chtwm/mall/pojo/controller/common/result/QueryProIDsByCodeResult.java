package com.chtwm.mall.pojo.controller.common.result;

import java.io.Serializable;
import java.util.List;

/** 
 * CreateDate:2017年6月2日上午11:08:02 
 * @Description: 查询结果-响应结果集  
 * @author:shl
 * @version V1.0   
 */
public class QueryProIDsByCodeResult implements Serializable {
	/**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
     */
    private static final long serialVersionUID = 1981297472951997181L;

    /**
	 * serialVersionUID:序列化 
	 */

	private String id;
	
	private String title;
	
	private String catagory;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }


	
}
