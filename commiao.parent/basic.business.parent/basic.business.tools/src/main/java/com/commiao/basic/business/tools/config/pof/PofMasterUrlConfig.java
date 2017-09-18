package com.commiao.basic.business.tools.config.pof;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年6月25日下午5:36:20 
 * @Description: 获取多金接口url
 * @author:jingmiao
 * @version V1.0   
 */
@Component
public class PofMasterUrlConfig {
	
	/**
	 * 获取多金接口地址 master.baseUrl. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_MASTER_BASE_URL
	 */
	@Value("${master.baseUrl}")
	private String masterInterfaceBaseUrl;
	/**
	 * 理财师信息查询接口地址 master.baseUrl. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_MASTER_CUST_BRO_REL_QUERY_URI
	 */
	@Value("${master.uri.cust.bro.rel.query}")
	private String masterInterfaceCustBroRelQueryUri;
	
	
	/**
	 * 获取 获取多金接口地址 master.baseUrl. <br>  POF_INTERFACE_PROPERTIES_KEY_MASTER_BASE_URL
	 * @return the masterInterfaceBaseUrl
	 */
	public String getMasterInterfaceBaseUrl() {
		return masterInterfaceBaseUrl;
	}
	/**
	 * 获取 理财师信息查询接口地址 master.baseUrl. <br>  POF_INTERFACE_PROPERTIES_KEY_MASTER_CUST_BRO_REL_QUERY_URI
	 * @return the masterInterfaceCustBroRelQueryUri
	 */
	public String getMasterInterfaceCustBroRelQueryUri() {
		return masterInterfaceCustBroRelQueryUri;
	}
	
}
