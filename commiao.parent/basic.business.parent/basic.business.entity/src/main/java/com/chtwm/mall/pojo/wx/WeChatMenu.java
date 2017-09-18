package com.chtwm.mall.pojo.wx;

import java.util.List;

public class WeChatMenu {
    private String name;
    private String type;
    private String key;
    private String url;
    private String media_id;
    private List<WeChatMenu> sub_button;
    private List<WeChatMenu> button;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getMedia_id() {
        return media_id;
    }
    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }
    public List<WeChatMenu> getSub_button() {
        return sub_button;
    }
    public void setSub_button(List<WeChatMenu> sub_button) {
        this.sub_button = sub_button;
    }
    public List<WeChatMenu> getButton() {
        return button;
    }
    public void setButton(List<WeChatMenu> button) {
        this.button = button;
    }
    
}
