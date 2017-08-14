<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var ="tid" value="3"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %></title>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/center.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="${ctx }js/login.js">
</script>
</head>



<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
 <!--登录-->
<div class="main">
  <div class="login">
  	<div  class="login_r">
    	<span class="login_tit f20 fw">登录我的账户</span>
    	<span id="errorStr"  style="float:none;width:210px; margin:0 auto;display: none;" class="log_notes">用户不存在</span><!-- $(this).attr('type','text'); $("#password").attr('type','password');-->
        <form action="" method="post" name="apForm" id="apForm">
        	<input type="text" name="userName" id="userName" size="20" value="手机号/用户名/邮箱" maxlength="30" class="log_f_input" 
            onfocus="this.style.color='black';if(this.value == this.defaultValue) this.value = ''" onblur="if(this.value == ''){this.value = this.defaultValue;this.style.color='#A8A8A8';}"  style="color:#A8A8A8;font-size: 14px;"/>
            
            <input name="pwd" type="text" value="密码" id="tx" size="20" maxlength="30" class="log_f_input log_s_input" style="color:#A8A8A8;font-size: 14px;"/>
            <input type="password" name="password" id="password" size="20" value="" maxlength="30" style="display:none; color:#A8A8A8;font-size: 14px;" class="log_f_input log_s_input"/>
            
            <div class="log_checkbox" style="float: left">
            <input type="checkbox"  name="autosession" id="autosession" value="1" class="log_c" style="float: left;margin-top:9px;"/>
            	<span class="fl log_getp">记住七天</span>
            <span class="fr log_getp"><a href="${ctx }toFindLoginPasswordPage">忘记密码？</a></span>
            </div>
          	<div class="login_btn">
            	<input name="submit" id="submit" type="button" class="public_btn log_btn"   value="" /><br />
            </div>
        </form>
    </div>	 
  </div>
</div>

<!-- 尾部 -->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>

<script type="text/javascript" defer="defer">
var tx = document.getElementById("tx");
var pwd = document.getElementById("password");
tx.onfocus = function(){
if(this.value != "密码") return;
this.style.display = "none";
pwd.style.display = "";
pwd.value = "";
pwd.focus();
}
pwd.onblur = function(){
if(this.value != "") return;
this.style.display = "none";
tx.style.display = "";
tx.value = "密码";
}
</script>
</body>
</html>

