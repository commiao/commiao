package basic.arch.component.cache.redis.contextholder;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
/**
 * @author jannal
 */
@Service("redisSpringApplicationContextHolder")
public class RedisSpringApplicationContextHolder implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext;  
      
    @Override  
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {  
        RedisSpringApplicationContextHolder.applicationContext = applicationContext;  
    }  
  
    public static ApplicationContext getApplicationContext() {  
        return applicationContext;  
    }  
    public static Object getBean(String beanName) {  
        return applicationContext.getBean(beanName);  
    }  
      
    public static <T>T getBean(String beanName , Class<T>clazz) {  
        return applicationContext.getBean(beanName , clazz);  
    }  
}
