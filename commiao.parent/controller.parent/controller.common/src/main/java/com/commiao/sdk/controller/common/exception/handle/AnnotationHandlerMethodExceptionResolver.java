package com.commiao.sdk.controller.common.exception.handle;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.commiao.basic.business.tools.common.constant.GlobalResultCode;
import com.commiao.basic.business.tools.exception.ValidateParamsException;
import com.commiao.sdk.controller.common.domain.ControllerResponseBody;
import com.commiao.sdk.controller.common.exception.TransformJsonParamsException;

import basic.arch.component.logger.handler.HTLogger;
import basic.arch.component.logger.manager.HTLoggerFactory;
import basic.arch.tools.utils.common.exception.DataCommonRuntimeException;
import basic.arch.tools.utils.common.exception.DataExecuteResultRuntimeException;
import basic.arch.tools.utils.common.exception.DataQueryRuntimeException;
import basic.arch.tools.utils.common.exception.DataValidataException;
import basic.arch.tools.utils.common.exception.PofInterfaceException;
import basic.arch.tools.utils.common.exception.PofServiceException;

/**
 * 不必在Controller中对异常进行处理，抛出即可，由此异常解析器统一控制。<br>
 * ajax请求（有@ResponseBody的Controller）发生错误，输出JSON。<br>
 * 页面请求（无@ResponseBody的Controller）发生错误，输出错误页面。<br>
 * 需要与AnnotationMethodHandlerAdapter使用同一个messageConverters<br>
 * Controller中需要有专门处理异常的方法。
 */
public class AnnotationHandlerMethodExceptionResolver extends ExceptionHandlerExceptionResolver {

	private static HTLogger logger = HTLoggerFactory.getLogger(AnnotationHandlerMethodExceptionResolver.class);

	private String defaultErrorView;

	public String getDefaultErrorView() {
		return defaultErrorView;
	}

	public void setDefaultErrorView(String defaultErrorView) {
		this.defaultErrorView = defaultErrorView;
	}

	protected ModelAndView doResolveHandlerMethodException(HttpServletRequest request, HttpServletResponse response,
			HandlerMethod handlerMethod, Exception exception) {

		if (handlerMethod == null) {
			return null;
		}

		Method method = handlerMethod.getMethod();

		if (method == null) {
			return null;
		}
		// 如果定义了ExceptionHandler则返回相应的Map中的数据
		ModelAndView returnValue = super.doResolveHandlerMethodException(request, response, handlerMethod, exception);
		ResponseBody responseBodyAnn = AnnotationUtils.findAnnotation(method, ResponseBody.class);
		if (responseBodyAnn != null) {
			try {
				ResponseStatus responseStatusAnn = AnnotationUtils.findAnnotation(method, ResponseStatus.class);
				if (responseStatusAnn != null) {
					HttpStatus responseStatus = responseStatusAnn.value();
					String reason = responseStatusAnn.reason();
					if (!StringUtils.hasText(reason)) {
						response.setStatus(responseStatus.value());
					} else {
						try {
							response.sendError(responseStatus.value(), reason);
						} catch (IOException e) {
						}
					}
				}
				// 如果没有ExceptionHandler注解那么returnValue就为空
				if (returnValue == null) {
					ControllerResponseBody<Object> result = handleException(exception);
					handleResponseError(result, request, response);
					return new ModelAndView();
				}
				return handleResponseBody(returnValue, request, response);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				return null;
			}
		}

		if (null == returnValue) {
			returnValue = new ModelAndView();
			if (null == returnValue.getViewName()) {
				returnValue.setViewName(defaultErrorView);
			}
		}
		return returnValue;
	}

	private ControllerResponseBody<Object> handleException(Exception exception) {
		ControllerResponseBody<Object> result = new ControllerResponseBody<Object>();
		result.setStatus(ControllerResponseBody.FAILED);
		String msg = "系统异常，操作失败";
		String code = GlobalResultCode.CommonResultCode.OPERATION_FAILED;

		// 处理并发线程中抛出的异常
		if (exception instanceof ExecutionException) {
			ExecutionException concurrentException = (ExecutionException) exception;
			exception = (Exception) concurrentException.getCause();
		}
		// 异常判断
		if (exception instanceof TransformJsonParamsException) {
			msg = ((TransformJsonParamsException) exception).getMsg();
			code = ((TransformJsonParamsException) exception).getCode();
			logger.warn(msg, exception);
		} else if (exception instanceof ValidateParamsException) {
			msg = ((ValidateParamsException) exception).getMsg();
			code = ((ValidateParamsException) exception).getCode();
			logger.warn(msg, exception);
		} else if (exception instanceof PofInterfaceException) {
			msg = ((PofInterfaceException) exception).getMsg();
			code = ((PofInterfaceException) exception).getCode();
			logger.warn("公募远程接口调用错误，错误码:{},错误信息:{}", code, msg, exception);
		} else if (exception instanceof PofServiceException) {
			msg = ((PofServiceException) exception).getMsg();
			code = ((PofServiceException) exception).getCode();
			logger.warn("公募服务发生错误，错误码:{},错误信息:{}", code, msg, exception);
		} else if (exception instanceof DataValidataException//
				|| exception instanceof DataExecuteResultRuntimeException//
				|| exception instanceof DataQueryRuntimeException//
				|| exception instanceof DataCommonRuntimeException) {
			msg = "数据操作异常";
			logger.error(exception.getMessage(), exception);
		} else if (exception instanceof RuntimeException//
				|| exception instanceof Exception//
				|| exception instanceof Throwable) {
			logger.error(exception.getMessage(), exception);
		}
		result.setMsg(msg);
		result.setCode(code);
		return result;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ModelAndView handleResponseBody(ModelAndView returnValue, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map value = returnValue.getModelMap();
		HttpInputMessage inputMessage = new ServletServerHttpRequest(request);
		List<MediaType> acceptedMediaTypes = inputMessage.getHeaders().getAccept();
		if (acceptedMediaTypes.isEmpty()) {
			acceptedMediaTypes = Collections.singletonList(MediaType.ALL);
		}
		MediaType.sortByQualityValue(acceptedMediaTypes);
		HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);
		Class<?> returnValueType = value.getClass();
		List<HttpMessageConverter<?>> messageConverters = super.getMessageConverters();
		if (messageConverters != null) {
			for (MediaType acceptedMediaType : acceptedMediaTypes) {
				for (HttpMessageConverter messageConverter : messageConverters) {
					if (messageConverter.canWrite(returnValueType, acceptedMediaType)) {
						messageConverter.write(value, acceptedMediaType, outputMessage);
						return new ModelAndView();
					}
				}
			}
		}
		logger.warn("Could not find HttpMessageConverter that supports return type [{}] and {}", returnValueType,
				acceptedMediaTypes);
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ModelAndView handleResponseError(ControllerResponseBody returnValue, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpInputMessage inputMessage = new ServletServerHttpRequest(request);
		List<MediaType> acceptedMediaTypes = inputMessage.getHeaders().getAccept();
		if (acceptedMediaTypes.isEmpty()) {
			acceptedMediaTypes = Collections.singletonList(MediaType.ALL);
		}
		MediaType.sortByQualityValue(acceptedMediaTypes);
		HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);
		Class<?> returnValueType = returnValue.getClass();
		List<HttpMessageConverter<?>> messageConverters = super.getMessageConverters();
		if (messageConverters != null) {
			for (MediaType acceptedMediaType : acceptedMediaTypes) {
				for (HttpMessageConverter messageConverter : messageConverters) {
					if (messageConverter.canWrite(returnValueType, acceptedMediaType)) {
						/**
						 * by jannal 2017-01-18 此处是为了给安卓返回完整格式的contentType,
						 * 否则安卓的api截取的响应头没有application/json;charset=utf-8 后面的编码，
						 * 则按照默认编码iso-8859-1来将字节转换为字符串，导致乱码。
						 * 此处的代码是默认根据客户端accept的头来指定，但是安卓在请求的时候application/json而非
						 * application/json;charset=utf-8，所以需要转译。
						 */
						// if(MediaType.APPLICATION_JSON_VALUE.equals(acceptedMediaType.toString())){
						// acceptedMediaType = new MediaType("application",
						// "json", Charset.forName("utf-8"));
						// }
						// acceptedMediaType = new
						// MediaType(acceptedMediaType.getType(),
						// acceptedMediaType.getSubtype(),
						// Charset.forName("utf-8"));
						Map<String, String> parameters = acceptedMediaType.getParameters();
						// MimeType 的PARAM_CHARSET是私有的，所以只能自己写了
						Map<String, String> newMap = new HashMap<String, String>();
						newMap.putAll(parameters);
						newMap.put("charset", "utf-8");
						acceptedMediaType = new MediaType(acceptedMediaType.getType(), acceptedMediaType.getSubtype(),
								newMap);
						messageConverter.write(returnValue, acceptedMediaType, outputMessage);
						return new ModelAndView();
					}
				}
			}
		}
		logger.warn("Could not find HttpMessageConverter that supports return type [{}] and {}", returnValueType,
				acceptedMediaTypes);
		return null;
	}

}
