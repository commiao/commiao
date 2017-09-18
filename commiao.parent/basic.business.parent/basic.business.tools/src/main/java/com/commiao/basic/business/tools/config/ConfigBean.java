package com.commiao.basic.business.tools.config;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;
/**
 * 读取所有配置信息的bean，不允许自己使用其他方式读取
 * @author jannal
 */
@Component
public class ConfigBean implements ApplicationContextAware,InitializingBean,EmbeddedValueResolverAware {
	
	/**
	 * 如果有其他的配置bean可以直接注入进来
	 */
	@Resource
	private PofConfig pofConfig;
	/**
	 * sf接口配置
	 */
	@Resource 
	private SForceConfig sForceConfig;
	/**
	 * 私募配置
	 */
	@Resource 
	private PefConfig pefConfig;
	/**
	 * weChat配置
	 */
	@Resource
	private WeChatConfig weChatConfig;
	/**
	 * 私募恒生接口配置
	 */
	@Resource
	private PefHSCongfig pefHsConfig;
	
	
	/**
	 * 电子合同相关config配置项
	 */
	@Resource
	private ElectronicContractConfig electronicContractConfig;
	
	@Resource
	private SmsEmailConfig smsEmailConfig;
	
	@Resource
	private EncryptConfig encryptConfig;
	@Resource
	private CommonApiConfig commonApiConfig;
	
	/**
	 * 信息中心url配置项
	 */
	@Resource
	private InfoCenterConfig infoCenterConfig;
	

	
	
	
	public InfoCenterConfig getInfoCenterConfig() {
		return infoCenterConfig;
	}

	public void setInfoCenterConfig(InfoCenterConfig infoCenterConfig) {
		this.infoCenterConfig = infoCenterConfig;
	}

	public CommonApiConfig getCommonApiConfig() {
		return commonApiConfig;
	}

	public PefHSCongfig getPefHsConfig() {
		return pefHsConfig;
	}

	public void setPefHsConfig(PefHSCongfig pefHsConfig) {
		this.pefHsConfig = pefHsConfig;
	}

	public SForceConfig getsForceConfig() {
		return sForceConfig;
	}

	public void setsForceConfig(SForceConfig sForceConfig) {
		this.sForceConfig = sForceConfig;
	}


	public PofConfig getPofConfig() {
		return pofConfig;
	}

	public void setPofConfig(PofConfig pofConfig) {
		this.pofConfig = pofConfig;
	}
	
	public ElectronicContractConfig getElectronicContractConfig() {
		return electronicContractConfig;
	}
	
	public SmsEmailConfig getSmsEmailConfig() {
		return smsEmailConfig;
	}

	public EncryptConfig getEncryptConfig() {
		return encryptConfig;
	}

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ConfigBean.applicationContext = applicationContext;
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
	public static ConfigBean getConfigBean() {
		return getBean("configBean", ConfigBean.class);
	}

	//TODO 如果需要手动读取其他配置文件可以在此处进行自定义读取
	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

	public PefConfig getPefConfig() {
		return pefConfig;
	}

	public void setPefConfig(PefConfig pefConfig) {
		this.pefConfig = pefConfig;
	}

	public WeChatConfig getWeChatConfig() {
		return weChatConfig;
	}

	public void setWeChatConfig(WeChatConfig weChatConfig) {
		this.weChatConfig = weChatConfig;
	}


	public void setElectronicContractConfig(ElectronicContractConfig electronicContractConfig) {
		this.electronicContractConfig = electronicContractConfig;
	}

	public void setSmsEmailConfig(SmsEmailConfig smsEmailConfig) {
		this.smsEmailConfig = smsEmailConfig;
	}

	public void setEncryptConfig(EncryptConfig encryptConfig) {
		this.encryptConfig = encryptConfig;
	}
	private StringValueResolver stringValueResolver;
	@Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        stringValueResolver = resolver;
    }
 
    public String getPropertiesValue(String name){
        return stringValueResolver.resolveStringValue(name);
    }


}
