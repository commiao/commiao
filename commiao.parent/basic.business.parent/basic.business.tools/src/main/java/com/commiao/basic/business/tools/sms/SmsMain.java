package com.commiao.basic.business.tools.sms;

import base.arch.component.http.builder.HCB;
import base.arch.component.http.client.HttpClientUtil;
import base.arch.component.http.common.HttpConfig;
import base.arch.component.http.common.HttpMethods;
import base.arch.tools.utils.jsonxml.JsonUtils;
import com.alibaba.fastjson.JSON;
import com.commiao.basic.business.tools.common.CommonAppRequestBody;
import com.commiao.basic.business.tools.common.CommonAppResponseBody;
import com.commiao.basic.business.tools.common.EnumerateUtils;
import com.commiao.basic.business.tools.common.constant.GlobalResultCode;
import com.commiao.basic.business.tools.config.ConfigBean;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class SmsMain {
	private static final Logger logger = LoggerFactory.getLogger(SmsMain.class);
public static void main(String[] args){
    emailSend();
    //smsSend();
}

	/**
	 * 1、设置模板id，就不需要设置内容和标题,此时需要传递parameter替换相关的${}变量
	 * 2、如果没有模板，就需要设置内容和标题,此时 不需要增加parameter
	 */
	private static void emailSend() {
		String url = "http://127.0.0.1:8080/basic/email/send.action";
		//String url = "http://127.0.0.1:8080/basis/basic/email/send.action";
		EmailParams  emailParams = new EmailParams();
		emailParams.setTo(new String[]{"553076101@qq.com"});
		emailParams.addParameter("money","100");
		emailParams.addParameter("title", "充值邮件");
		emailParams.setTemplateId("e_hand_recharge");
		emailParams.setContent("内容");
		emailParams.setTitle("标题");
		CommonAppRequestBody<EmailParams> appRequestBody = new CommonAppRequestBody<EmailParams>();
		appRequestBody.setParams(emailParams);
		String jsonData = JSON.toJSONString(appRequestBody);
		HCB hcb = HCB.custom().timeout(30000);
		HttpConfig httpConfig =HttpConfig.custom()
								.url(url)
								.json(jsonData)
								.hcb(hcb)
								.encoding("utf-8")
								.method(HttpMethods.POST);
		String sendStr = HttpClientUtil.post(httpConfig);
	}
	/**
	 * 1、设置模板id，就不需要设置内容和标题,此时需要传递parameter替换相关的${}变量
	 * 2、如果没有模板，就需要设置内容和标题，此时不需要增加parameter
	 */
	private static void smsSend() {
		String url = "http://127.0.0.1:8080/basic/sms/smsSend.action";
		String jsonData = null;
		SmsParams smsInfo = new SmsParams();
		smsInfo.setPhoneNum("15210321876");
		smsInfo.addParameter("userName", "15210321876");
		smsInfo.addParameter("title", "一期");
		smsInfo.addParameter("hasP", 100);
		smsInfo.addParameter("hasI", 12);
		smsInfo.addParameter("msFee", 112);
		smsInfo.setContent("aaaa");
		smsInfo.setScenarios("sms_topup");
		CommonAppRequestBody<SmsParams> appRequestBody = new CommonAppRequestBody<SmsParams>();
		appRequestBody.setParams(smsInfo);
		jsonData = JSON.toJSONString(appRequestBody);
		HCB hcb = HCB.custom().timeout(30000);
		HttpConfig httpConfig =HttpConfig.custom()
								.url(url)
								.json(jsonData)
								.hcb(hcb)
								.encoding("utf-8")
								.method(HttpMethods.POST);
		String sendStr = HttpClientUtil.post(httpConfig);
	}
	public static CommonAppResponseBody<SmsSendResult> smsSendUtil(boolean flagCode, String phone, String code, String type) {
		String url =  ConfigBean.getConfigBean().getSmsEmailConfig().getCommonSmsUrl();
		String jsonData = null;
		SmsParams smsInfo = new SmsParams();
		smsInfo.setPhoneNum(phone);
		smsInfo.addParameter("chkcode", code);
		smsInfo.addParameter("minute", ConfigBean.getConfigBean().getSmsEmailConfig().getSmsValidationMinus());
//		smsInfo.addParameter("dst", EnumerateUtils.getCodeDicByType(type));
		smsInfo.setFlagCode(flagCode);
		if(type.equals(EnumerateUtils.PhoneCodeTypeEnum.REDEMPTION.getType())){
			smsInfo.setScenarios("sms_redemption_code");
		}else{
			smsInfo.setScenarios("sms_check_code");
		}
		CommonAppRequestBody<SmsParams> appRequestBody = new CommonAppRequestBody<SmsParams>();
		appRequestBody.setParams(smsInfo);
		jsonData = JSON.toJSONString(appRequestBody);
		HCB hcb = HCB.custom().timeout(30000);
		HttpConfig httpConfig =HttpConfig.custom()
								.url(url)
								.json(jsonData)
								.hcb(hcb)
								.encoding("utf-8")
								.method(HttpMethods.POST);
		String sendStr = HttpClientUtil.post(httpConfig);
		logger.info("[短信发送]-返回信息："+sendStr);
		CommonAppResponseBody<SmsSendResult> smsReBody = null;
        try {
            smsReBody = smsResultJsonToBean(sendStr, SmsSendResult.class);
        } catch (SmsJsonParamsException e) {
            smsReBody = new CommonAppResponseBody<SmsSendResult>();
            smsReBody.setMsg("短信服务器发送短信异常");
            smsReBody.setStatus("1");
            smsReBody.setCode("CF0001");
            logger.error("短信服务器发送短信异常", e);
        }
		return smsReBody;
	}

	/**
	 * 短信发送.
	 * @param map 参数.
	 * @param scenarios 业务场景.
	 * @param phone 手机号.
	 */
    public static void newSmsSendUtil(Map<String, Object> map, String scenarios, String phone) {
    	CommonAppRequestBody<SmsParams> appRequestBody = new CommonAppRequestBody<SmsParams>();
        SmsParams smsInfo = new SmsParams();
        smsInfo.setParameters(map);
        smsInfo.setScenarios(scenarios);
        smsInfo.setPhoneNum(phone);
        appRequestBody.setParams(smsInfo);
        String jsonData = JSON.toJSONString(appRequestBody);
        String url = ConfigBean.getConfigBean().getSmsEmailConfig().getCommonSmsUrl();
        String sendStr = "";
        if(StringUtils.isNoneEmpty(jsonData) && StringUtils.isNoneEmpty(url)){
    		HCB hcb = HCB.custom().timeout(30000);
    		HttpConfig httpConfig =HttpConfig.custom()
    								.url(url)
    								.json(jsonData)
    								.hcb(hcb)
    								.encoding("utf-8")
    								.method(HttpMethods.POST);
            sendStr = HttpClientUtil.post(httpConfig);
            logger.info("[短信发送]-返回信息：" + sendStr);
        } else {
            logger.info("[短信发送]-参数缺失，消息发送失败");
        }
    }
	   
	/**
	 * 1、设置模板id，就不需要设置内容和标题,此时需要传递parameter替换相关的${}变量
	 * 2、如果没有模板，就需要设置内容和标题,此时 不需要增加parameter
	 */
	public static String emailSendUtil(String mail,String text, String name) {
		String url = ConfigBean.getConfigBean().getSmsEmailConfig().getCommonEmailUrl();
		EmailParams  emailParams = new EmailParams();
		emailParams.setTo(new String[]{mail});
		emailParams.addParameter("code",text);
		emailParams.addParameter("name", name);
		emailParams.addParameter("minute", ConfigBean.getConfigBean().getSmsEmailConfig().getMailValidationMinus());
		emailParams.addParameter("basepath", ConfigBean.getConfigBean().getSmsEmailConfig().getSiteDomain());
		emailParams.setTemplateId("cert_mail");
//		emailParams.setContent(text);
//		emailParams.setTitle(title);
		CommonAppRequestBody<EmailParams> appRequestBody = new CommonAppRequestBody<EmailParams>();
		appRequestBody.setParams(emailParams);
		String jsonData = JSON.toJSONString(appRequestBody);
		HCB hcb = HCB.custom().timeout(30000);
		HttpConfig httpConfig =HttpConfig.custom()
								.url(url)
								.json(jsonData)
								.hcb(hcb)
								.encoding("utf-8")
								.method(HttpMethods.POST);
		String sendStr = HttpClientUtil.post(httpConfig);
		logger.info(sendStr);
		return sendStr;
	}
	
	/**
	 * 
	 * @Description::语音验证码 接口
	 * @param    content 只能为数字
	 * @param    phone
	 * @author wrx
	 * @return
	 */
	public static String VoiceMsgUtil( String phone,String content){
        String url = ConfigBean.getConfigBean().getSmsEmailConfig().getCommonSmsUrl();
        String jsonData = null;
        SmsParams smsInfo = new SmsParams();
        smsInfo.setContent(content);
        smsInfo.setFlagCode(true);
        smsInfo.setVoiceSmsCode(true);
        smsInfo.setScenarios("sms_check_code");
        smsInfo.setPhoneNum(phone);
        CommonAppRequestBody<SmsParams> appRequestBody = new CommonAppRequestBody<SmsParams>();
        appRequestBody.setParams(smsInfo);
        jsonData = JSON.toJSONString(appRequestBody);
    	HCB hcb = HCB.custom().timeout(30000);
		HttpConfig httpConfig =HttpConfig.custom()
								.url(url)
								.json(jsonData)
								.hcb(hcb)
								.encoding("utf-8")
								.method(HttpMethods.POST);
        String sendStr = HttpClientUtil.post(httpConfig);
        logger.info("[语音短信发送]-返回信息："+sendStr);
        return sendStr;
	}
	
	 /**
     * 将短信商发送过来的json串中的data转成实际的对象
     * @param json
     * @param clazz
     * @return
     * @throws SmsJsonParamsException 
     */
    public static  <T> CommonAppResponseBody<T> smsResultJsonToBean(String json,Class<T> clazz) {
        if(null == json || "".equals(json)){
                return  null;
        }
        Map<String, Class<?>> classMap = new HashMap<String, Class<?>>(1);
        classMap.put("data",clazz);
        try{
        	CommonAppResponseBody<T> appResponseBody = JsonUtils.json2Obj(json, CommonAppResponseBody.class, classMap);
            return appResponseBody;
        }catch(Exception e){
            logger.error("请求参数解析错误,json数据是:{}",json);
            throw  new SmsJsonParamsException("请求参数解析错误,json数据是:"+json, GlobalResultCode.CommonResultCode.PARAMS_RESOLVE_ERROR);
        }
        
    }
}