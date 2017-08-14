package com.framework.common.property.toBean;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            String path = PropertyTest.class.getResource("/common_config.properties").getPath();
            InputStream in = new FileInputStream(path);
            properties.load(in);
            in.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        PropertyVar config = PropertyTool.bindProperties(PropertyVar.class, properties);
        System.out.println("User Name: " + config.getUserName());
        System.out.println("Password: " + config.getPassword());
    }

}