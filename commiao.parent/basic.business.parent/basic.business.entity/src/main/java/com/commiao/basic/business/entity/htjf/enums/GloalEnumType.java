package com.commiao.basic.business.entity.htjf.enums;

import org.apache.commons.lang3.StringUtils;


/**
 * 全局枚举类型
 * @author jannal
 */
public class GloalEnumType {

    public static enum YES_NO{
        NO(0,"不是"),YES(1,"是");
        private int value;
        private String description;
        YES_NO(int value, String description) {
            this.value = value;
            this.description = description;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        } 
        
        public static boolean isExist(String value){
            if(StringUtils.isEmpty(value)){
                return false;
            }
            for(YES_NO ac:YES_NO.values()){
                if((ac.getValue()+"").equals(value)){
                    return true;
                }
            }
            return false;
        }
    }
    
    
    public static enum Status{
        NORMAL(1,"正常"),LOGOUT(2,"注销"),DELETE(0,"删除"),NOLOGIN(-1,"第一次登陆");
        private int value;
        private String description;
        Status(int value, String description) {
            this.value = value;
            this.description = description;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        } 
        
        public static boolean isExist(String value){
            if(StringUtils.isEmpty(value)){
                return false;
            }
            for(Status ac:Status.values()){
                if((ac.getValue()+"").equals(value)){
                    return true;
                }
            }
            return false;
        }
    }
}
