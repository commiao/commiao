package com.framework.common.property.toBean;

public interface PropertyVar {
    @PropertyValue("generator.db.driver")
    public String getUserName();

    @PropertyValue("db.pwd")
    public String getPassword();
}
