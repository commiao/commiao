package com.chtwm.mall.core.util;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.commiao.basic.business.tools.common.constant.BigdataConstants;
import com.commiao.basic.business.tools.config.ConfigBean;

/** 
 * CreateDate:2017年7月26日下午8:51:11 
 * @Description: 日志过滤特殊字符
 * @author:shl
 * @version V1.0   
 */
public class LoggerFilterUtils {
	
	/**
	 * 
	 * @Description:过滤特殊字符（对日志中敏感信息加密，目前只对手机号做了加密处理）
	 * @author shl
	 * @param str
	 * @return
	 */
	public static String filterCharacters(String str){
		String isFilterLogInfo = ConfigBean.getConfigBean().getEncryptConfig().getIsFilterLogInfo();
		if(BigdataConstants.IS_FILTER_LOG.equals(isFilterLogInfo)){
			//存放匹配到的字符串(重复的自动覆盖)
			Set<String> matcherStrSet = new HashSet<String>();
			//手机号码正则表达式
			Pattern patter = Pattern.compile("1[0-9]{10}");
			Matcher matcher = patter.matcher(str);
			//匹配符合规则的字符串
			while(matcher.find()){
				matcherStrSet.add(matcher.group());
			}
			//遍历所有匹配串，并将其替换成加密串
			for(String matcherStr : matcherStrSet){
				str = str.replaceAll(matcherStr, MD5Util.MD5(matcherStr));
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		String ff = "{\"code\":\"ETS-5BP0000\",\"message\":\"查询成功\",\"details\":null,\"results\":[{\"birthday\":\"\",\"education\":\"\",\"mobile_tel\":\"13967291881\",\"phone_tel\":\"13967291881\",\"contact_mobileno\":\"\",\"contact_email\":\"\",\"contact_sex\":\"\",\"main_broker_name\":\"\",\"client_id\":\"\",\"e_mail\":\"\",\"id_kind_gb\":\"0\",\"reg_address\":\"\",\"fact_cust_no\":\"000007174843\",\"con_birthday\":\"\",\"zipcode\":\"\",\"pub_profession_flag\":\"\",\"con_vocation\":\"\",\"cust_type\":\"1\",\"sex\":\"\",\"vocation\":\"\",\"share_holder\":\"\",\"corp_end_date\":\"\",\"all_broker_mobile\":\"\",\"trade_prove_result\":\"1101100000\",\"language\":\"\",\"contact_address\":\"\",\"id_no\":\"330501195809254762\",\"fax_no\":\"\",\"short_name\":\"\",\"all_broker_userid\":\"\",\"client_name\":\"柏水娥\",\"contact_faxno\":\"\",\"cust_no\":\"200007245320\",\"marketregion\":\"00010001\",\"email_internet\":\"\",\"invest_favour\":\"\",\"contact_zipcode\":\"\",\"contact_phone\":\"\",\"address\":\"浙江湖州市吴兴区城市之心80-502\",\"all_broker_account\":\"\",\"regist_date\":\"\",\"nationality\":\"\",\"main_broker_userid\":\"0\",\"mobile_no_internet\":\"13967291881\",\"beneficary\":\"\",\"all_broker_name\":\"\",\"main_broker_mobile\":\"\",\"contact_idtype\":\"\",\"businesss_country\":\"\",\"create_date\":\"2016-04-02\",\"contact\":\"\",\"business_scope\":\"\",\"contact_idno\":\"\",\"customer_status\":\"N\",\"income\":\"\",\"main_broker_account\":\"\"}]}";
		System.out.println(filterCharacters(ff));
	}
}
