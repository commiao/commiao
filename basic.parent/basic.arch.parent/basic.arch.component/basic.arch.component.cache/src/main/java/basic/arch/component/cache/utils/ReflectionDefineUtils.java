package basic.arch.component.cache.utils;

import java.lang.reflect.Method;

import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

/**
 * 自定义反射工具类
 * @author jannals
 */
public class ReflectionDefineUtils extends org.springframework.util.ReflectionUtils{

    /**
     * 判断是否有返回值
     * @param method
     * @return
     */
    public static boolean isVoidReturnType(Method method){
        if(void.class.equals(method.getReturnType())){
            return true;
        }
        return false;
    }
    /**
     * @param targetClass 目标类
     * @param args  目标方法的参数
     * @param method 目标方法
     * @return
     */
    public static String[] getMethodParameterNames(Class<? extends Object> targetClass,Class<?>[] args, Method method){
        String[] parameterNames;
        try {
            LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
            Method declaredMethod = targetClass.getDeclaredMethod(method.getName(), args);
            parameterNames = u.getParameterNames(declaredMethod);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        }
        return parameterNames;
    }
}
