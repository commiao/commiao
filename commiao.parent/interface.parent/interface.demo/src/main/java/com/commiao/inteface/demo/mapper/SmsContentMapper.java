package com.commiao.inteface.demo.mapper;

import org.apache.ibatis.annotations.Param;

import com.commiao.inteface.demo.entities.SmsContentBean;

/** 
 * CreateDate:2016年10月11日下午3:51:29 
 * @Description: 获取短信模板
 * @author:hehch
 * @version V1.0   
 */
public interface SmsContentMapper {
	
	/**
	 * @Description::获取短信模板信息. <br/> 
	 * @author hehch
	 * @param smsId 模板id
	 * @return
	 */
	SmsContentBean getSmsContentById(@Param(value="smsId")String smsId);
}
