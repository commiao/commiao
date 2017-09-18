package com.chtwm.mall.sdk.controller.wap.account.result;

public class PofCertificationMsgResult {
    private String clientId;//公募客户编号
    private String mergeStatus;//公私募账号是否合并 0是1否
    private String maskName;//用户名，未认证则显示加*手机号 
    private String id_kind_gb;//证件类型
    private String id_kind_gb_desc;//证件类型转义
    private String id_no;//证件号
    private String ticket;//公募解密口令
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public String getMergeStatus() {
        return mergeStatus;
    }
    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }
    public String getMaskName() {
        return maskName;
    }
    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }
    public String getId_kind_gb() {
        return id_kind_gb;
    }
    public void setId_kind_gb(String id_kind_gb) {
        this.id_kind_gb = id_kind_gb;
    }
    public String getId_no() {
        return id_no;
    }
    public void setId_no(String id_no) {
        this.id_no = id_no;
    }
	public String getId_kind_gb_desc() {
		return id_kind_gb_desc;
	}
	public void setId_kind_gb_desc(String id_kind_gb_desc) {
		this.id_kind_gb_desc = id_kind_gb_desc;
	}
    
}
