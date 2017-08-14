<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/center.css" rel="stylesheet" type="text/css"/>

<script type="text/javascript" src="${ctx }js/yrycodeapi.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %>-注册成功</title>
</head>

<%
	String nickname = request.getParameter("nickname");
	String email = request.getParameter("email_post");
%>
<script type="text/javascript">

	var hash={                // 邮箱域名对应的邮箱登录地址
		'qq.com': 'http://mail.qq.com',
		'gmail.com': 'http://mail.google.com',
		'sina.com': 'http://mail.sina.com.cn',
		'sina.cn': 'http://mail.sina.com.cn',
		'163.com': 'http://mail.163.com',
		'126.com': 'http://mail.126.com',
		'yeah.net': 'http://www.yeah.net/',
		'sohu.com': 'http://mail.sohu.com/',
		'tom.com': 'http://mail.tom.com/',
		'sogou.com': 'http://mail.sogou.com/',
		'139.com': 'http://mail.10086.cn/',
		'hotmail.com': 'http://www.hotmail.com',
		'live.com': 'http://login.live.com/',
		'live.cn': 'http://login.live.cn/',
		'live.com.cn': 'http://login.live.com.cn',
		'189.com': 'http://webmail16.189.cn/webmail/',
		'yahoo.com.cn': 'http://mail.cn.yahoo.com/',
		'yahoo.cn': 'http://mail.cn.yahoo.com/',
		'eyou.com': 'http://www.eyou.com/',
		'21cn.com': 'http://mail.21cn.com/',
		'188.com': 'http://www.188.com/',
		'foxmail.com': 'http://www.foxmail.com'
	};

	$(function(){       // 根据邮箱域名查找对应的邮箱登录地址
		$(".mail").each(function() {
			var url = $(this).text().split('@')[1];
			if (typeof(hash[url]) !== "undefined") {
				$(this).attr("href", hash[url]);
			} else {
				$(this).removeAttr("href");
				$("#mail_btn").hide();
			}
		});
	});
	
	function mailUrl(){
		var mailurl = $(".mail").attr("href");
		window.open(mailurl);
	}
	
</script>
  
  <body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
<!--******头部结束******-->
<div class="main">
 <div class="register">
  <div class="reg_l">
  <em class="reg_tit f14 fw">亲爱的用户 ${nickname},这里是重置密码邮件激活。</em>
  	<div style="float: left;padding-top: 25px;padding-left:48px;">
  	<div style="font-size: 25px;">您好，<span id="uname">${nickname}</span><br/></div>
  	<div style="font-size: 18px; padding-top: 20px;padding-left: 20px;">
  	我们已经向您的注册邮箱发送了一封重置密码验证邮件，</br>
  	<p>&nbsp;</p>
  	请登录您的邮箱<a href="#" target="_blank" class="mail">${email}</a>进行查收。</br>
  	<p>&nbsp;</p>
  	<image id="mail_btn" src="${ctx}images/getMail.png" style="cursor:pointer" onclick="mailUrl(this)" /> 
  	</div>
  	<div style="padding-top: 100px;">
  	<ul>
      <li>出于安全考虑，验证邮件有效期为24小时，请及时查收。</li>
		<br/>
		<p>&nbsp;</p>
      <li>如未收到，请查看您的垃圾邮件箱，可能由于网络问题，验证邮件会有1-10分钟的延迟，请稍候片刻。</li>
      	<br/>
 		<p>&nbsp;</p>
    </ul>
  	</div>
  	</div>
  </div>
  </div>
</div>
 <%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
  </body>
</html>
