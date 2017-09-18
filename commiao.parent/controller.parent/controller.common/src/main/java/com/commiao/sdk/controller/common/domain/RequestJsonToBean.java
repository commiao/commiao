package com.commiao.sdk.controller.common.domain;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.commiao.sdk.controller.common.exception.TransformJsonParamsException;

import basic.arch.tools.utils.common.XssInjectionUtils;
import basic.arch.tools.utils.jsonxml.JsonUtils;

/**
 * @author jannal 2016-01-13
 */
@SuppressWarnings("unchecked")
public class RequestJsonToBean {
    private static final Logger logger = LoggerFactory.getLogger(RequestJsonToBean.class);

    /**
     * 将客户端传过来的json串中的params转成实际的对象
     * 
     * @param json
     * @param clazz
     * @return
     * @throws TransformJsonParamsException
     */
    public static <T> T requestJsonToBean(String json, Class<T> clazz) throws TransformJsonParamsException {
        if (null == json || "".equals(json)) {
            return null;
        }
        // 防注入
        json = XssInjectionUtils.filterXssStr(json);
        Map<String, Class<?>> classMap = new HashMap<String, Class<?>>(2);
        classMap.put("params", clazz);
        try {
            ControllerRequestBody<T> controllerRequestBody = JsonUtils.json2Obj(json, ControllerRequestBody.class, classMap);
            T params = controllerRequestBody.getParams();
            return params;
        } catch (Exception e) {
            logger.error("请求参数解析错误,json数据是:{}", json);
            throw new TransformJsonParamsException("请求参数解析错误,json数据是:" + json, "aaa", "AAA");
        }
    }
}
