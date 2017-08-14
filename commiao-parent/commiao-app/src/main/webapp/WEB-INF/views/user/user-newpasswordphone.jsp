<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="${base}/resources/js/jquery.min.js"></script>
<title>慧信P2P系统</title>
</head>
<script src="jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		$('.nav ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('one').siblings().removeClass('one');
		});
				
	});
</script>
<body opener.location.reload()>
<!-- 引入页眉 -->
<%@ include file="/global/head.jsp"%>
<!--通过手机设置新密码-->
    <div class="npp">
    	<p><img src="${base}/resources/images/changep.jpg" width="360" /></p>
        <span>设置新密码</span> <input class="newpassword" type="password" id="password" name="password" placeholder="请设置新密码" />
    	<span>确认密码</span> <input class="newpassword1" type="password" id="confirmPassword" name="confirmPassword"   placeholder="请确认新密码"  /> 
        <a class="next" href="javascript:submitResetPwd();">下一步</a>
    </div>

<!-- 引入页脚 -->
<%@ include file="/global/bottom.jsp"%>
</body>
</html>
<script>
	function submitResetPwd(){
		if($('#password').val()!=null && $('#confirmPassword').val()!=null){
			if($('#password').val()==$('#confirmPassword').val()){
				window.location.href='${base}/password/submitResetPwd?newPassword='+$('#password').val();
				//var newPassword = $('#password').val();
				//document.write("<form action='${base}/password/submitResetPwd' method='post' name='resetPwdForm' style='display:none'>");
				//document.write("<input type='hidden' name='newPassword' value='"+newPassword+"'");
				//document.write("</form>");
				//document.resetPwdForm.submit();
			}else{
				alert('密码和密码确认不一致！');
			}
		}else{
			alert('密码和确认密码都不能为空!');
		}
	}
</script>
