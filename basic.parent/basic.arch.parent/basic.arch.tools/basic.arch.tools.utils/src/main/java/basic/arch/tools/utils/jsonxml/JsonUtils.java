package basic.arch.tools.utils.jsonxml;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import net.sf.json.JSONObject;

public class JsonUtils {

	/**
	 * json转成成Object对象
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T json2Obj(String json, Class<T> clazz) {
		JSONObject jsonObject = JSONObject.fromObject(json);
		return (T) JSONObject.toBean(jsonObject, clazz);
	}

	/**
	 * 
	 * @param json
	 * @param clazz
	 *            object类名
	 * @param classMap
	 *            object类的泛型
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T json2Obj(String json, Class<T> clazz, Map<String, Class<?>> classMap) {
		JSONObject jsonObject = JSONObject.fromObject(json);
		return (T) JSONObject.toBean(jsonObject, clazz, classMap);
	}

	/**
	 * @Description::json转换为列表. <br/>
	 * @author hehch
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> json2Arr(String json, Class<T> clazz) {
		return JSON.parseArray(json, clazz);
	}
}
