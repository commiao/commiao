package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年6月6日下午4:48:14 
 * @Description: 公共接口中使用的配置项 
 * @author:shl
 * @version V1.0   
 */
@Component
public class CommonApiConfig {
	
	@Value("${protocol.accessory.Url}")
	private String protocolAccessoryUrl;

	public String getProtocolAccessoryUrl() {
		return protocolAccessoryUrl;
	}
}
