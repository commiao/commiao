<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>

<script type="text/javascript" src="${ctx }js/yrycodeapi.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %>-注册成功</title>
<style>
.reg_l{
	width:660px;
	float:left;
	height:505px;
	background:url(../images/register_tit.jpg) no-repeat 0 0;
}
</style>
</head>

<%
	String nickname = request.getParameter("nickname");
	String email = request.getParameter("email_post");
	String mailId = request.getParameter("mailId");
	String personrole = request.getParameter("personrole");
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
<div class="main clearfix comWidth" style="margin-top: 40PX;">
 <div class="register">
  <div class="reg_l">
  <em class="reg_tit f14 fw" style="position: relative;left: 100px;top: 20px;font-size: 16px;font-style: normal;">亲爱的用户 ${nickname},这里是邮件激活。</em>
  	<div style="float: left;padding-top: 25px;padding-left:48px;margin-top:30px;">
  	<div style="font-size: 25px;">您好，<span id="uname">${nickname}</span><br/></div>
  	<div style="font-size: 18px; padding-top: 20px;padding-left: 20px;">
  	我们已经向您的注册邮箱发送了一封注册验证邮件，</br>
  	<p>&nbsp;</p>
  	请登录您的邮箱<a href="#" target="_blank" class="mail">${email}</a>进行查收。</br>
  	<p>&nbsp;</p>
  	<image id="mail_btn" src="${ctx}images/getMail.png" style="cursor:pointer" onclick="mailUrl(this)" /> 
  	</div>
  	<div style="padding-top: 50px;">
  	<ul style="height: 100px;">
      <li style="float: none;" >出于安全考虑，验证邮件有效期为24小时，请及时查收。</li>
      <script type="text/javascript">
		function sub(){
				var url = "${ctx}registerSendMailAgain";
				var nickname_re = document.getElementById("nickname_re").value;
				var email_re = document.getElementById("Email_re").value;
				var roles_re = document.getElementById("personrole_re").value;
				var mailId_re = document.getElementById("mailId_re").value;
				var isresub_re = document.getElementById("isresub_re").value;
				$.post(url, {
				"nickname" : nickname_re,
				"Email" : email_re,
				"mailId" : mailId_re,
				"roles" : roles_re,
				"isresub" : isresub_re
				}, function(data, varStatus) {
					alert("重新发送成功！");
					$("#isresub_re").val(data);
					if(data>=3){
						$("#resend").hide();
					}
				}, "text");
		}
	</script>
	<form name="frmregister" id="frmregister" action="registerSendMailAgain" method="post">
		<input type="hidden" id="isresub_re" name="isresub" value="1" /> 
		<input type="hidden" name="nickname" id="nickname_re" value="${nickname}" /> 
		<input type="hidden" name="Email" id="Email_re" value="${email}" /> 
		<input type="hidden"  name="mailId" id="mailId_re" value="${mailId }" /> 
		<input type="hidden" name="personrole" id="personrole_re" value="<%=personrole%>" />
	</form>
		<br/>
		<p>&nbsp;</p>
      <li style="float: none;" >如未收到，请查看您的垃圾邮件箱，可能由于网络问题，验证邮件会有1-10分钟的延迟，请稍候片刻。</li>
      	<br/>
 		<p>&nbsp;</p>
      <li style="float: none;" >如超过10分钟仍未收到，可点此 <a href="javascript:void(0)" onclick="sub()"><font color="#1FAFC9">再次发送</font></a>。</li>
    </ul>
  	</div>
  	</div>
  </div>
  </div>
</div>
 <%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
  </body>
</html>
