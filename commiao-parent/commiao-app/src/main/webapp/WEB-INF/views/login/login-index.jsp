<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信P2P系统</title>
</head>
<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	
	<!--登录-->
    <div class="loginbox">
    	<form action="${base}/login/userLogin" method="post" name="apForm" id="userLogin">
	    	<div class="login">
	        	<img src="${base}/resources/images/loginban.jpg" />
	            <div class="login_bg">
	            	<p>用户登录</p>
	                <input type="text" id="userName" name="userName" class="username" placeholder="手机号码/用户名/邮箱" />
	                <input type="password" id="password" name="password" class="password"  placeholder="密码"/><br /><br />
	                <input type="checkbox" class="mar" /> 记住七天<a class="forget" href="javascript:forgetPwd();">忘记密码</a>
	                <a class="login_btn" href="javascript:userLogin();">登 录</a>
	                <span>没有账户？<a href="javascript:regist();">马上注册</a></span>
	            </div>
	        </div>	
	    </form>
    </div>
	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
<script language="javascript">
/* 用户登录 */
function userLogin(){
	if($('#userName').val()!= null && $('#password').val()!= null){
		$('#userLogin').submit();
	}else{
		alert('请输入用户名和密码！');
	}
	
}

/* 忘记密码 */
function forgetPwd(){
	window.location.href="${base}/password/findPwdByMobile";
}

$(function(){
		$('.nav ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('one').siblings().removeClass('one');
		});
				
});
</script>