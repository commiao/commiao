package com.commiao.controller.common.simple.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录信息
 */
public class LoginInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//private static final Logger logger = Logger.getLogger(LoginInfo.class);
	
	private Long userId;
	private String loginName;
	private String userName;
	private Integer userType = 0;
    private Map<String,Object> parameter = new HashMap<String,Object>();

    private long startTime = System.currentTimeMillis();
    private long lastTime = System.currentTimeMillis();
    
    public LoginInfo() { }
    
	/**
	 * @param userId
	 * @param loginName
	 * @param userName
	 */
	public LoginInfo(Long userId, String loginName, String userName) {
		super();
		this.userId = userId;
		this.loginName = loginName;
		this.userName = userName;
	}
	
	
    /* ***********************************************************************
	 * 用户信息
	 *********************************************************************** */
	/**
	 * @return 用户主键
	 */
	public Long getUserId() {
		return userId;
	}
	
	/**
	 * @param 用户主键
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	/**
	 * @param 用户姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 返回用户的姓名，如果为空，返回登录名，否则返回匿名
	 * @return 用户姓名
	 */
	public String getUserName(){
		if(!isLogined()){
			return "未登录";
		}
		if(userName != null && !userName.equals("")){
			return userName;
		}
		if(loginName != null && !loginName.equals("")){
			return loginName;
		}
		return "匿名";
	}

	/**
	 * @param 登录名
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * 返回用户的登录名，如果未登录则显示：未登录
	 * @return 用户登录名
	 */
	public String getLoginName(){
		if(!isLogined()){
			return "nologin";
		}
		if(loginName != null){
			return loginName;
		}
		return "empty";
	}
	
	/**
	 * @param 用户类型
	 */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	/**
	 * 返回用户的类型，如果未登录则显示：未知
	 * @return 用户类型
	 */
	public Integer getUserType(){
		return userType;
	}



	/* ***********************************************************************
	 * 用户的登陆信息
	 *********************************************************************** */

	/**
	 * @return 是否登录
	 */
	public boolean isLogined() {
		return userId != null && userId.longValue() > 0;
	}
	
	/**
	 * 更新最后访问的时间
	 */
	public void updateLastBrowseTime(){
		lastTime = System.currentTimeMillis();
		System.out.println("lastTime="+lastTime);
	}
	/**
	 * 用户登录的在线时长，单位：秒
	 * @return 在线时长
	 */
	public long getOnlineSeconds(){
		System.out.println("startTime="+startTime + "; lastTime="+lastTime);
		return (lastTime - startTime)/1000;
	}
	/* ***********************************************************************
	 * 参数
	 *********************************************************************** */
	/**
	 * 添加其他参数
	 * @param key
	 * @param obj
	 */
	public void addParameter(String key,Object obj){
		parameter.put(key, obj);
	}
	/**
	 * 获得参数
	 * @param key
	 * @return
	 */
	public Object getParameter(String key){
		return parameter.get(key);
	}
	/**
	 * 移除参数
	 * @param key
	 * @return
	 */
	public Object removeParameter(String key){
		return parameter.remove(key);
	}
	/**
	 * 清空所有参数
	 */
	public void clearParameter(){
		parameter.clear();
	}


}

