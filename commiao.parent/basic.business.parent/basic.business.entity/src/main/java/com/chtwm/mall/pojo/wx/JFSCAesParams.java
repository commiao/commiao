package com.chtwm.mall.pojo.wx;

public class JFSCAesParams {
    //String  用户编号(必填)
    private String accoNo;
    //String  用户名(必填)
    private String username;
    //String  手机号(必填)
    private String mobileNum;
    //String  身份证号
    private String idNo;
    //Int     是否实名认证（必填）(0否 1是)
    private int isBindBank;
    //String  数据来源（参数为：weixin或者app）
    private String dataSource;
    //dateTime yyyy-MM-dd HH:mm:ss
    private String dateTime;
    
    public String getAccoNo() {
        return accoNo;
    }
    public void setAccoNo(String accoNo) {
        this.accoNo = accoNo;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public int getIsBindBank() {
        return isBindBank;
    }
    public void setIsBindBank(int isBindBank) {
        this.isBindBank = isBindBank;
    }
    public String getDataSource() {
        return dataSource;
    }
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
