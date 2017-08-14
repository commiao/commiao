package com.framework.common.property.toBean;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Properties;

public class PropertyInvokationHandler implements InvocationHandler {
    private Properties properties;
    public PropertyInvokationHandler(Properties properties) {
        this.properties = properties;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    	PropertyValue annotation = method.getAnnotation(PropertyValue.class);
        if(annotation == null){
            throw new RuntimeException(String.format("Method:{} is not bound to a property.", method.getName()));
        }
        return properties.getProperty(annotation.value());
    }

}