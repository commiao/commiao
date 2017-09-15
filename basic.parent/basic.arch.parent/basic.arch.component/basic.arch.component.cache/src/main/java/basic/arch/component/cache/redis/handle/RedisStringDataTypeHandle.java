package basic.arch.component.cache.redis.handle;

import java.lang.reflect.Method;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import basic.arch.component.cache.annotation.EnableCache;
import basic.arch.component.cache.exception.CacheException;
import basic.arch.component.cache.utils.ReflectionDefineUtils;

@Service("redisStringDataTypeHandle")
public class RedisStringDataTypeHandle extends RedisDataTypeHandle {

    private static final Logger logger = LoggerFactory.getLogger(RedisDataTypeHandle.class);

    public Object doStringTypeQuery(ProceedingJoinPoint pjp, String finalKey, EnableCache enableCache) throws Throwable {
        Object result = null;
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        // 默认是捕获异常
        if (enableCache.value() == List.class && !void.class.equals(method.getReturnType())) {
            result = getList(enableCache, finalKey, pjp);
        } else {
            result = get(pjp, finalKey, enableCache);
        }
        return result;
    }

    private Object get(ProceedingJoinPoint pjp, String finalKey, EnableCache enableCache) throws Throwable {
        Object result = null;
        boolean flag = isThrowException(enableCache);
        int retryTimes = enableCache.retryTimes();
        for (int i = 0; i <=retryTimes; i++) {
            try {
                result = redisCacheService.get(finalKey, enableCache.value(), isTimeOut(enableCache));
                break;
            } catch (CacheException e) {
                if (flag) {
                    logger.warn("[当前重试计数{},此处redis异常忽略:{},{}", i, e,e.getMessage());
                } else {
                    throw new RuntimeException(e.getMessage(), e);
                }
            }
        }
        if (result == null) {
            result = pjp.proceed();
            if (result != null) {
                saveOrUpdate(enableCache, finalKey, result);
            }
        }
        return result;
    }

    public void doStringTypeDelete(String finalKey) {
        super.doDelete(finalKey);
    }

    public Object doStringTypeSaveOrUpdate(ProceedingJoinPoint pjp, EnableCache enableCache, Method method, String finalKey) throws Throwable {
        Object result = null;
        if (ReflectionDefineUtils.isVoidReturnType(method)) {
            throw new RuntimeException("如果需要调用EnableCache.KeyStrategy.SAVE_OR_UPDATE策略，必须将缓存的对象作为方法的返回值");
        } else {
            result = pjp.proceed();
        }
        saveOrUpdate(enableCache, finalKey, result);
        return result;
    }

    protected Object getList(EnableCache enableCache, String finalKey, ProceedingJoinPoint pjp) throws Throwable {
        // 默认是捕获异常
        boolean flag = isThrowException(enableCache);
        int retryTimes = enableCache.retryTimes();
        List<?> list = null;
        for (int i = 0; i <=retryTimes; i++) {
            try {
                list = redisCacheService.getList(finalKey, enableCache.value(), isTimeOut(enableCache));
                break;
            } catch (CacheException e) {
                if (flag) {
                    logger.warn("[当前重试计数{},此处redis异常忽略:{},{}", i, e,e.getMessage());
                } else {
                    throw new RuntimeException(e.getMessage(), e);
                }
            }
        }
        if (list == null) {
            list = (List<?>) pjp.proceed();
            if (list != null) {
                saveOrUpdate(enableCache, finalKey, list);
            }
        }
        return list;
    }

    protected void saveOrUpdate(EnableCache enableCache, String key, Object value) {
        if (value == null) {
            return;
        }
        // 默认是捕获异常
        boolean flag = isThrowException(enableCache);
        int retryTimes = enableCache.retryTimes();
        for (int i = 0; i <=retryTimes; i++) {
            try {
                if (isTimeOut(enableCache)) {
                    redisCacheService.saveOrUpdateTimeOut(key, value, enableCache.timeOut(), enableCache.timeUnit());
                } else {
                    redisCacheService.saveOrUpdateNoTimeOut(key, value);
                }
                return;
            } catch (Exception e) {
                if (flag) {
                    logger.warn("[当前重试计数{},此处redis异常忽略:{},{}", i, e,e.getMessage());
                } else {
                    throw new RuntimeException(e.getMessage(), e);
                }
            }
        }
    }

}
