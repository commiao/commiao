package com.commiao.basic.business.tools.sms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.MimeBodyPart;

public class EmailParams {
    /**
     * 收件人
     */
    private String[] to;
    /**
     * 抄送的人
     */
    private String[] cc;
    
    /**
     * 标题
     */
    private String title;
    /**
     * 邮件内容
     */
    private String content;
    
    /**
     * 模板id
     */
    private String templateId;
    
    /**
     * 邮件中的参数
     */
    private Map<String, Object> parameters = new HashMap<String, Object>();
    
    /**
     * 邮件中的附件
     */
    private List<MimeBodyPart> attachments;

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public String[] getCc() {
        return cc;
    }

    public void setCc(String[] cc) {
        this.cc = cc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public List<MimeBodyPart> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<MimeBodyPart> attachments) {
        this.attachments = attachments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void addParameter(String key,Object value){
    	parameters.put(key, value);
    }
    
}
