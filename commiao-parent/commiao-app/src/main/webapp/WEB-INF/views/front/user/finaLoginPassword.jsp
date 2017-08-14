<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %></title>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/center.css" rel="stylesheet" type="text/css"/>
</head>
<style type="text/css">
element.style {
    color: gray;
}
.zc_title {
    color: #E77D00;
    font-family: "微软雅黑","Microsoft Yahei","宋体";
    font-size: 20px;
    font-weight: bold;
    height: 56px;
    letter-spacing: 3px;
    line-height: 56px;
}
.czmm_yx02 {
    border: 1px solid #53A9FF;
    box-shadow: 0 1px 5px #53A9FF inset;
    color: #333333;
    float: left;
    font-family: "微软雅黑","Microsoft Yahei","宋体";
    font-size: 20px;
    height: 40px;
    line-height: 40px;
    margin-left: 35px;
    width: 300px;
    
}
.btn_next {
    background: url("${ctx}images/btn_next.jpg") no-repeat scroll 0 0 transparent;
    border: 0 none;
    height: 33px;
    width: 106px;
}
</style>
<script>
function clearEmail_Val(){
		if($("#email_pwd").val() == "请填写您的邮箱地址"){
			$("#email_pwd").val("");
			$("#email_pwd").css("color","black");
		}
		$("#messagemail").hide();
	}
function checkEmail_pwd(){
		var re = false;
		email = $("#email_pwd").val();
		var myReg = /^([-_A-Za-z0-9\.]+)@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/;
		if (email == "" || email == null) {
			$("#messagemail").html("请输入Email");
			$("#email_pwd").val("请填写您的邮箱地址");
			$("#email_pwd").css("color","gray");
			$("#messagemail").show();
			return re;
		} else if (email.length>32) {
			$("#messagemail").html("Email不正确");
			$("#messagemail").show();
			return re;
		} else if (!myReg.test(email)) {
			$("#messagemail").html("Email不正确");
			$("#messagemail").show();
			return re;
		} else {
			$("#messagemail").html("");
			$("#messagemail").hide();
			re = true;
			return re;
		}
	}	
function sub(){
		if(checkEmail_pwd()){
			//var url = "https://www.dsyrong.com/isEmailExist";
			var url = "${ctx}isEmailExist";
			var email = $("#email_pwd").val();
			$(".zc_title :input").attr("disabled", true);
			$.post(url, {"email" : email}, function(data) {
				if(data == "邮箱不存在"){
					$(".zc_title :input").removeAttr('disabled');
					$("#messagemail").html("该邮箱不存在");
					$("#messagemail").show();
					return false;
				}else{
					$("#messagemail").html("已发送");
					$("#messagemail").show();
					var nikename = data.split("||")[0];
					var email = data.split("||")[1];
					$("#b").hide();
					$("#c").show();
					$("#uname").html(nikename);
					$(".mail").html(email);
					mail();
				}
            },"text");
		}
	}	
	
</script>
<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
 <!--找回密码-->
<div class="main" style="height:520px;border:1px solid #D0D0D0;">
  <div id="b">
  	<div  class="zc_title" style="height: 40px;margin-left: 30px;">找回密码</div>
  	<div style="margin-top: 130px;margin-left: 260px;">
  	<!-- font-family: "微软雅黑";font-size: 16px;font-weight: bold;line-height: 40px;text-align: left; -->
	<span style="float: left;color:#000000;font-size: 18px;font-weight: bold;line-height: 40px;">邮箱</span>
	<input id="email_pwd" class="czmm_yx02 reg_mail" type="text" value="请填写您的邮箱地址" onfocus="clearEmail_Val()" style="color: gray;font-size: 16px;" onblur="checkEmail_pwd()" name="email_pwd" />
	</div>
	<font style="color: #767676;float: left;line-height: 40px;padding-left: 20px;font-size: 16px;" ><span id="messagemail"></span></font>
	<div>
	<input class="btn_next" type="button" style="float:left;margin-left: 400px;margin-top: 90px;cursor: pointer" onclick="sub()" value="">
	</div>
</div>


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

		function mail(){
		$(".mail").each(function() {
			var url = $(this).text().split('@')[1];
			if (typeof(hash[url]) !== "undefined") {
				$(this).attr("href", hash[url]);
			} else {
				$(this).removeAttr("href");
				$("#mail_btn").hide();
			}
		});
		
		}
			
	function mailUrl(){
		var mailurl = $(".mail").attr("href");
		window.open(mailurl);
	}
	
</script>
	<div class="register" id="c" style="display:none">
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
<!-- 尾部 -->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>

