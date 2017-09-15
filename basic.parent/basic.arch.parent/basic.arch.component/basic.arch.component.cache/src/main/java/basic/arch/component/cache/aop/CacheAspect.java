package basic.arch.component.cache.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.arch.component.cache.annotation.EnableCache;

/**
 * @author jannal
 * 缓存切面
 */
@SuppressWarnings("all")
public class CacheAspect extends AbstractCacheAspect{
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Object doAroundMethod(ProceedingJoinPoint pjp, EnableCache enableCache) throws Throwable {
        startEnterAspect();
        Object result = null;
        try {
            Object[] argsValue = pjp.getArgs();// 具体的参数值
            MethodSignature signature = (MethodSignature) pjp.getSignature();
            Method method = signature.getMethod();//方法
            Class<?>[] argsClass = method.getParameterTypes();// 参数类型
            Class<? extends Object> targetClass = pjp.getTarget().getClass();//目标类
            String targetName = targetClass.getName();
            //日志打印
            startLog(argsValue, method, argsClass, targetName);
            
            if(enableCache.isOpen()&&!manuallyExcludeMethod(argsClass, method, targetName)){
                result = this.getCacheHandleChain().handle(pjp, enableCache);
            }else{
                result  = getResult(pjp, result, method);
            }
            return result;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        } finally {
            endExitAspect();
        }
    }


   
}
