package basic.arch.component.cache.redis.key;

import java.lang.reflect.Method;
/**
 * CreateDate:2016年9月18日上午11:11:52 
 * @Description:key生成策略接口  
 * @author:jannal
 * @version V1.0
 */
public interface KeyGenerationStrategy {

    /**
     * @param targetClass
     *            目标类的Class对象
     * @param key
     *            方法上的带有变量的redis key
     * @param argsValue
     *            具体的参数值
     * @param method
     *            Method对象
     * @param args
     *            各个参数类型的Class对象
     * @return
     * @throws NoSuchMethodException
     */
    public String generateKey(Class<? extends Object> targetClass, String key, Object[] argsValue, Method method, Class<?>[] args) throws Exception;
}
