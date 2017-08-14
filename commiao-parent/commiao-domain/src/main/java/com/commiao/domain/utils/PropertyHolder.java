package com.commiao.domain.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * PropertyHolder, 含有一个map类型的属性properties，该类主要用于在spring环境中<br>
 * 进行注入配置.
 * Author ningzhitao 
 * Date   15/12/19
 */
public class PropertyHolder {

    private Map<String, String> properties;

    /**
     * Constructor.
     */
    public PropertyHolder() {
        if (properties == null) {
            properties = new HashMap<String, String>();
        }
    }

    public String get(final String key) {
        return getProperties().get(key);
    }

    public Map<String, String> getProperties() {
        if (properties == null) {
            properties = new HashMap<String, String>();
        }
        return properties;
    }

    public void setProperties(final Map<String, String> properties) {
        this.properties = properties;
    }

    public void addProperty(final String key, final String val) {
        properties.put(key, val);
    }

    @Override
    public String toString() {
        return getProperties().toString();
    }

}
