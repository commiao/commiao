package basic.arch.component.cache.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.arch.component.cache.aop.handle.CacheHandleChain;
import basic.arch.component.cache.utils.ReflectionDefineUtils;

public abstract class AbstractCacheAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    protected CacheHandleChain cacheHandleChain ;
    
    protected void startEnterAspect() {
        if (logger.isDebugEnabled()) {
            logger.debug("------------开始进入切面拦截-----------");
        }
    }

    protected void endExitAspect() {
        if (logger.isDebugEnabled()) {
            logger.debug("-----------结束切面拦截-----------");
        }
    }
    

    protected void startLog(Object[] argsValue, Method method, Class<?>[] argsClass, String targetName) {
        if (logger.isDebugEnabled()) {
            logger.debug("具体的参数值argsValue:{}", argsValue);
            logger.debug("调用类的全名:{}", targetName);
            logger.debug("调用方法的名称:{}", method.getName());
            if (argsClass != null && argsClass.length > 0) {
                logger.debug("具体的参数Class类型args:{}", Arrays.toString(argsClass));
            } else {
                logger.debug("调用方法没有参数");
            }
        }
    }
    
    
    
    
    /**
     * 获取最终的返回值
     * @param pjp
     * @param result
     * @param method
     * @return
     * @throws Throwable
     */
    protected Object getResult(ProceedingJoinPoint pjp, Object result, Method method) throws Throwable {
        if (ReflectionDefineUtils.isVoidReturnType(method)) {
            pjp.proceed();
        } else {
            result = pjp.proceed();
        }
        return result;
    }
    
    
    /**
     * 手动排除方法 预留TODO
     * 需要解决的问题：怎么通过反射判断是否是同一个方法
     * @param args
     * @param method
     * @param targetName
     * @return
     */
    protected boolean manuallyExcludeMethod(Object[] args, Method method, String targetName) {
        return false;
    }

    public CacheHandleChain getCacheHandleChain() {
        if(cacheHandleChain==null){
            throw new RuntimeException("cacheHandleChain没有初始化,查询配置文件是否注入");
        }
        return cacheHandleChain;
    }

    public void setCacheHandleChain(CacheHandleChain cacheHandleChain) {
        this.cacheHandleChain = cacheHandleChain;
    }

    
}
