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


	<!--通过邮箱找回密码-->
	<div class="changee">
		<p><img src="${base}/resources/images/byem.jpg" width="360" /></p>
	    <span>邮箱</span> <input class="email_1" name="email" id="email" type="text" placeholder="请输入邮箱" />
		<a class="next" href="javascript:emailVerify();">下一步</a>
	</div>

<%@ include file="/global/bottom.jsp"%>
</body>
</html>
<script>
	function emailVerify(){
		var email = $('#email').val();
		if(email.length>0){
			$.ajax({
				type: "POST",
				url : '${base}/'+'password/emailVerify',
				data : {
					email : email
				},
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				dataType : 'json',
				cache : false,
				success : function(data) {
					if(data==true){
						window.location.href='${base}/'+'password/newPasswordEmail';
					}else{
						alert('该邮箱不存在！');
					}
				}
			});
		}else{
			alert('请输入邮箱！');
		}
		
	}
</script>