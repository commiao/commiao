package com.chtwm.mall.pojo.appversion;

public class Appversion {
	
	public final static String UPDATE_STATUS_FORCE = "1";
	public final static String UPDATE_STATUS_NONE = "2";
	
	private String    id           ;
	//版本号
	private String    ver_no       ;
	//是否强制升级   1:强制  0:不强制
	private String    is_force     ;
	private String    down_url     ;
	//备注
	private String    memo         ;
	//0:ios  1:安卓
	private String    type         ;
	private String    create_date  ;
	private String    update_date  ;
	private String    create_user  ;
	private String    update_user  ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVer_no() {
		return ver_no;
	}
	public void setVer_no(String ver_no) {
		this.ver_no = ver_no;
	}
	public String getIs_force() {
		return is_force;
	}
	public void setIs_force(String is_force) {
		this.is_force = is_force;
	}
	public String getDown_url() {
		return down_url;
	}
	public void setDown_url(String down_url) {
		this.down_url = down_url;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	
	
	
}
