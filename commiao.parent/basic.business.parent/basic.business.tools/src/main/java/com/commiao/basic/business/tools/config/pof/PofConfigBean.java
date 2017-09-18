package com.commiao.basic.business.tools.config.pof;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

import com.commiao.basic.business.tools.config.pof.PofBaseConfig;
/**
 * 读取所有配置信息的bean，不允许自己使用其他方式读取
 * @author jannal
 */
@Component
public class PofConfigBean implements ApplicationContextAware,InitializingBean,EmbeddedValueResolverAware {
	
	/**
	 * 如果有其他的配置bean可以直接注入进来
	 */
	@Resource
	private PofBaseConfig pofBaseConfig;
	
	/**
	 * pofHsUrlCongfig:获取恒生接口url. 
	 */
	@Resource
	private PofHsUrlCongfig pofHsUrlCongfig;
	
	/**
	 * pofHsParamCongfig:获取恒生接口入参. 
	 */
	@Resource
	private PofHsParamCongfig pofHsParamCongfig;
	
	/**
	 * pefUrlConfig:获取私募请求接口url. 
	 */
	@Resource
	private PofPefUrlConfig pofPefUrlConfig;
	
	/**
	 * pofMasterUrlConfig:获取多金接口url. 
	 */
	@Resource
	private PofMasterUrlConfig pofMasterUrlConfig;
	
	/**
	 * pofSmsConfig:获取短信接口参数. 
	 */
	@Resource
	private PofSmsConfig pofSmsConfig;
	
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		PofConfigBean.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}

	public static <T> T getBean(String beanName, Class<T> clazz) {
		return applicationContext.getBean(beanName, clazz);
	}
	
	/**
	 * 如果在非spring管理的Bean中获取ConfigBean 就使用这个方法
	 * @return
	 */
	public static PofConfigBean getConfigBean() {
		return getBean("configBean", PofConfigBean.class);
	}

	/** 
	 * TODO 如果需要手动读取其他配置文件可以在此处进行自定义读取（可选）. 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet() 
	 */  
	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

	private StringValueResolver stringValueResolver;
	@Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        stringValueResolver = resolver;
    }
 
    public String getPropertiesValue(String name){
        return stringValueResolver.resolveStringValue(name);
    }

	/**
	 * 获取 如果有其他的配置bean可以直接注入进来
	 * @return the pofBaseConfig
	 */
	public PofBaseConfig getPofBaseConfig() {
		return pofBaseConfig;
	}

	/**
	 * 设置 如果有其他的配置bean可以直接注入进来 
	 * @param pofConfig the pofBaseConfig to set
	 */
	public void setPofBaseConfig(PofBaseConfig pofBaseConfig) {
		this.pofBaseConfig = pofBaseConfig;
	}

	/**
	 * 获取 pofHsUrlCongfig:获取恒生接口url.
	 * @return the pofHsUrlCongfig
	 */
	public PofHsUrlCongfig getPofHsUrlCongfig() {
		return pofHsUrlCongfig;
	}

	/**
	 * 设置 pofHsUrlCongfig:获取恒生接口url. 
	 * @param pofHsUrlCongfig the pofHsUrlCongfig to set
	 */
	public void setPofHsUrlCongfig(PofHsUrlCongfig pofHsUrlCongfig) {
		this.pofHsUrlCongfig = pofHsUrlCongfig;
	}

	/**
	 * 获取 pofHsParamCongfig:获取恒生接口入参.
	 * @return the pofHsParamCongfig
	 */
	public PofHsParamCongfig getPofHsParamCongfig() {
		return pofHsParamCongfig;
	}

	/**
	 * 设置 pofHsParamCongfig:获取恒生接口入参. 
	 * @param pofHsParamCongfig the pofHsParamCongfig to set
	 */
	public void setPofHsParamCongfig(PofHsParamCongfig pofHsParamCongfig) {
		this.pofHsParamCongfig = pofHsParamCongfig;
	}

	/**
	 * 获取 pofPefUrlConfig:获取私募请求接口url.
	 * @return the pofPefUrlConfig
	 */
	public PofPefUrlConfig getPofPefUrlConfig() {
		return pofPefUrlConfig;
	}

	/**
	 * 设置 pofPefUrlConfig:获取私募请求接口url. 
	 * @param pofPefUrlConfig the pofPefUrlConfig to set
	 */
	public void setPofPefUrlConfig(PofPefUrlConfig pofPefUrlConfig) {
		this.pofPefUrlConfig = pofPefUrlConfig;
	}

	/**
	 * 获取 pofMasterUrlConfig:获取多金接口url.
	 * @return the pofMasterUrlConfig
	 */
	public PofMasterUrlConfig getPofMasterUrlConfig() {
		return pofMasterUrlConfig;
	}

	/**
	 * 设置 pofMasterUrlConfig:获取多金接口url. 
	 * @param masterUrlConfig the pofMasterUrlConfig to set
	 */
	public void setPofMasterUrlConfig(PofMasterUrlConfig pofMasterUrlConfig) {
		this.pofMasterUrlConfig = pofMasterUrlConfig;
	}

	/**
	 * 获取 pofSmsConfig:获取短信接口参数.
	 * @return the pofSmsConfig
	 */
	public PofSmsConfig getPofSmsConfig() {
		return pofSmsConfig;
	}

	/**
	 * 设置 pofSmsConfig:获取短信接口参数. 
	 * @param pofSmsConfig the pofSmsConfig to set
	 */
	public void setPofSmsConfig(PofSmsConfig pofSmsConfig) {
		this.pofSmsConfig = pofSmsConfig;
	}
	
}
