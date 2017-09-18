package com.chtwm.mall.commons;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.commons.beanutils.converters.LongConverter;
import org.apache.commons.beanutils.converters.ShortConverter;

public class HTBeanUtils {

    public static void populate(Object obj,Map<String, String[]> map){
        try {
            org.apache.commons.beanutils.ConvertUtils.register(new LongConverter(null), Long.class);  
            org.apache.commons.beanutils.ConvertUtils.register(new ShortConverter(null), Short.class);  
            org.apache.commons.beanutils.ConvertUtils.register(new IntegerConverter(null), Integer.class);  
            org.apache.commons.beanutils.ConvertUtils.register(new DoubleConverter(null), Double.class);  
            org.apache.commons.beanutils.ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);  
            ConvertUtils.register(new DateConverter(), Date.class);
            ConvertUtils.register(new Converter()
            {
                @SuppressWarnings("rawtypes")
                @Override
                public Object convert(Class arg0, Object arg1)
                {
                    if(arg1 == null)
                    {
                        return null;
                    }
                    if(!(arg1 instanceof String))
                    {
                        throw new ConversionException("只支持字符串转换 !");
                    }
                     
                    String str = (String)arg1;
                    if(str.trim().equals(""))
                    {
                        return null;
                    }
                     
                    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                     
                    try{
                        return sd.parse(str);
                    }
                    catch(ParseException e)
                    {
                        throw new RuntimeException(e);
                    }
                     
                }
                 
            }, Date.class);
            BeanUtils.populate(obj,map) ;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } 
}
    
    
    
   static  class DateConverter extends DateTimeConverter {

        public DateConverter() {
        }

        public DateConverter(Object defaultValue) {
            super(defaultValue);
        }

        /* (non-Javadoc)
         * @see org.apache.commons.beanutils.converters.AbstractConverter#getDefaultType()
         */
        @SuppressWarnings("rawtypes")
        protected Class getDefaultType() {
            return Date.class;
        }

        /*
         * (non-Javadoc)
         * @see org.apache.commons.beanutils.converters.DateTimeConverter#convertToType(java.lang.Class, java.lang.Object)
         */
        @SuppressWarnings("rawtypes")
        @Override
        protected Object convertToType(Class arg0, Object arg1) throws Exception {
            if (arg1 == null) {
                return null;
            }
            String value = arg1.toString().trim();
            if (value.length() == 0) {
                return null;
            }
            return super.convertToType(arg0, arg1);
        }
    }
}
