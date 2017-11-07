package core.inteface;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import basic.arch.tools.utils.common.ConvertUtils;
import core.entity.RequestGenericity;
import core.entity.ResponseGenericity;

/**
 * 
 * CreateDate:2016年9月19日上午9:52:19
 * 
 * @Description: 封装恒生接口
 * @author:yuzhao
 * @version V1.0
 */
public abstract class InterfaceBaseService<T extends RequestGenericity, K extends ResponseGenericity>
		implements BaseInterface<T, K> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private static ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<SimpleDateFormat>(){
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS") ;
		}
	};


	/**
	 * 
	 * @Description::初始化公募接口. <br/>
	 * @author yuzhao
	 */
	private void doInit() {
		
	}

	/**
	 * 
	 * @Description::初始化公募接口. <br/>
	 * @author yuzhao
	 */
	private void onInit() {
		doInit();
	}

	/**
	 * 
	 * 公募基金接口调用
	 * 
	 * @see com.hengtianjf.inteface.pof.common.PofInterface#execute(com.hengtianjf.inteface.pof.common.InterfaceRequest)
	 */
	@Override
	public InterfaceResponse<K> execute(InterfaceRequest<T> request) {
		// 接口初始化
		onInit();
		// 校验请求参数
		if (!onValidationParam(request)) {
			logger.info("参数不合法，入参为：{}", JSONObject.toJSONString(request));
			return null;
		}
		// 入参转换成恒生需要的类型
		Map<String, Object> hsParam = convertRequest(request);
		logger.info("请求地址:{},||入参为：{}",this.getInterfaceUrl(), JSONObject.toJSONString(hsParam));
		long starttime = System.currentTimeMillis();
		String responseStr=null;
		try{
			responseStr = doMethod(hsParam);//执行接口
		}catch(Exception e){
			long costTime = System.currentTimeMillis()-starttime;
			throw e;
		}
		long costTime = System.currentTimeMillis()-starttime;
		logger.info("请求地址:{}，||耗时：{}毫秒,||接口响应结果为：{}",this.getInterfaceUrl(),costTime, responseStr);
		// 响应结果类型转换
		InterfaceResponse<K> response = convertResponse(responseStr);
		// 校验响应结果
		onValidationResponse(response);
		// 包装响应结果
		wrapperResponse(response);

		return response;
	}

	/**
	 * 
	 * @Description::请求参数验证——这里做通用验证. <br/>
	 * @author yuzhao
	 * @param request
	 * @return
	 */
	protected boolean onValidationParam(InterfaceRequest<T> request) {
		if (request == null || request.getParams() == null) {
			return false;
		}
		return doValidationParam(request);
	}

	/**
	 * 
	 * @Description::请求参数验证——由子类实现. <br/>
	 * @author yuzhao
	 * @param request
	 * @return
	 */
	protected boolean doValidationParam(InterfaceRequest<T> request) {
		return true;
	}

	/**
	 * 
	 * @Description::响应内容基础验证. <br/>
	 * @author yuzhao
	 * @param response
	 * @return
	 */
	protected boolean onValidationResponse(InterfaceResponse<K> response) {
		if (response == null) {
			return false;
		}
		Iterator<K> it = response.getDataList().iterator();
		while (it.hasNext()) {
			K data = it.next();
		}
		return doValidationResponse(response);
	}

	/**
	 * 
	 * @Description::响应内容业务验证——由子类实现. <br/>
	 * @author yuzhao
	 * @param response
	 * @return
	 */
	protected boolean doValidationResponse(InterfaceResponse<K> response) {
		return true;
	}

	/**
	 * 
	 * @Description::入参转换成恒生需要的类型. <br/>
	 * 默认转换说明：<br/>
	 * 属性名：骆驼命名法转换成小写+下划线命名法，做为map的key 属性值：直接作为map的值
	 * 如果需要个性化转换，在子类中实现
	 * @author yuzhao
	 * @param request
	 * @return
	 */
	protected Map<String, Object> convertRequest(InterfaceRequest<T> request) {
		T params = request.getParams();
		Map<String, Object> m = ConvertUtils.beanToMapWithName(params);
		return m;
	}
	
	/**
	 * 
	 * @Description::获取泛型类类型. <br/>
	 * 默认通过反射获取泛型类型，如果不适用在子类中实现. <br/>
	 * @author yuzhao
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Class<K> getResponseGeneric() {
		Type genericSuperclass = this.getClass().getGenericSuperclass();
		if (genericSuperclass == null) {
			return null;
		}

		Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
		return actualTypeArguments != null ? (Class<K>) actualTypeArguments[1] : null;
	}

	/**
	 * 
	 * @Description::响应结果类型转换. <br/>
	 * @author yuzhao
	 * @param responseStr
	 * @return
	 */
	protected InterfaceResponse<K> convertResponse(String responseStr) {
		if (StringUtils.isBlank(responseStr)) {
			return null;
		}
		InterfaceResponse<K> response = new InterfaceResponse<K>();

		List<K> l = new ArrayList<K>();
		try {
			JSONObject resJson = JSONObject.parseObject(responseStr);
			if (resJson == null || resJson.isEmpty()) {
				return null;
			}
			K dataK = convertResponse(resJson);
			if (dataK == null) {
				return null;
			}
			l.add(dataK);
		} catch (Exception e) {
			JSONArray resJsonArr = JSONObject.parseArray(responseStr);
			for (int i = 0, size = resJsonArr.size(); i < size; i++) {
				JSONObject resJson = resJsonArr.getJSONObject(i);
				if (resJson == null || resJson.isEmpty()) {
					continue;
				}

				K dataK = convertResponse(resJson);
				if (dataK == null) {
					continue;
				}
				l.add(dataK);
			}
		}

		response.setDataList(l);

		return response;
	}

	/**
	 * 
	 * @Description::包装响应结果. <br/>
	 * @author yuzhao
	 * @param response
	 * @return
	 */
	protected InterfaceResponse<K> wrapperResponse(InterfaceResponse<K> response) {
		return response;
	}

	/**
	 * 
	 * @Description::接口调用主逻辑——子类实现. <br/>
	 * @author yuzhao
	 * @param request
	 * @return
	 */
	protected abstract String doMethod(Map<String, Object> hsParam);

	/**
	 * 
	 * @Description::获取恒生接口uri——子类实现. <br/>
	 * @author yuzhao
	 * @return
	 */
	protected abstract String getInterfaceUrl();

	/**
	 * 
	 * @Description::json对象转换成响应信息对应的泛型类型. <br/>
	 * @author yuzhao
	 * @param resJson
	 * @return
	 */
	private K convertResponse(JSONObject resJson) {
		Set<Entry<String, Object>> rjes = resJson.entrySet();
		Map<String, Object> m = new HashMap<String, Object>(rjes.size());
		for (Entry<String, Object> entry : rjes) {
			m.put(ConvertUtils.toCamelCase(entry.getKey()), entry.getValue());
		}

		K dataK = null;
		try {
			dataK = getResponseGeneric().newInstance();
		} catch (InstantiationException e) {
			logger.error(e.getMessage(), e);
			return null;
		} catch (IllegalAccessException e) {
			logger.error(e.getMessage(), e);
			return null;
		}
		ConvertUtils.transMapToBean(m, dataK);

		return dataK;
	}

}
