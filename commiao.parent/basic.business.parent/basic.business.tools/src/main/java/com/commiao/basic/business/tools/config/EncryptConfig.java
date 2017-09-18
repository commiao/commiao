package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年2月15日上午11:38:38 
 * @Description: 加密工具使用的配置项  
 * @author:shl
 * @version V1.0   
 */
@Component
public class EncryptConfig {
	@Value("${encrypt.aes.key}")
	private String aesKey;
	/**
	 * 是否过滤日志中的敏感信息
	 */
	@Value("${is.filter.log}")
	private String isFilterLogInfo;
	public String getAesKey() {
		return aesKey;
	}
	public String getIsFilterLogInfo() {
		return isFilterLogInfo;
	}
	
}
