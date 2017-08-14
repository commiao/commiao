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
    background: url("${base}/resources/cs${base}/resources/images/btn_next.jpg") no-repeat scroll 0 0 transparent;
    border: 0 none;
    height: 33px;
    width: 106px;
}
</style>
<body opener.location.reload()>
<!-- 引入页眉 -->
<%@ include file="/global/head.jsp"%>

<!--通过手机找回密码-->
   <div class="changep">
   	<p><img src="${base}/resources/images/byp.jpg" width="360" /></p>
       <span>手机号</span> <input class="phonenumber" id="mobilePhone" name="mobilePhone" type="text" placeholder="请输入手机号" />
   	<div><span>验证码</span> <input class="changeyzm" id="activeCode"  name="activeCode" type="text"  /> <a class="sendyzm" href="javascript:getVerifycode();">发送验证码</a></div>
       <a class="byemail" href="javascript:findPwdByEmail();">通过邮箱找回</a><a class="next" href="javascript:next();">下一步</a>
   </div>

<!-- 引入页脚 -->
<%@ include file="/global/bottom.jsp"%>
</body>
</html>
<script type="text/javascript">
	function findPwdByEmail(){
		window.location.href="${base}/password/findPwdBymail";
	}
	
	function getVerifycode(){
		if($('#mobilePhone').val().length>0){
			$.ajax({
				type: "POST",
				url : '${base}/'+'password/getVerifycode',
				data : {
					mobilePhone : $('#mobilePhone').val()
				},
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				dataType : 'json',
				cache : false,
				success : function(data) {
					alert(data);
				}
			});
		}else{
			alert('请先输入有效手机号！');
		}
		
	}
	
	
	/* 下一步 */
	function next(){
		//后台校验没有问题后 显示重置密码页面
		if($('#mobilePhone').val().length>0 && $('#activeCode').val().length>0){
			$.ajax({
				type: "POST",
				url : '${base}/'+'password/resetPwdNext',
				data : {
					mobilePhone : $('#mobilePhone').val(),
					activeCode  : $('#activeCode').val()
				},
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				dataType : 'json',
				cache : false,
				success : function(data) {
					var result = data.split("||")[0];
					var userId = data.split("||")[1];
					alert(data);
					if(result){
						window.location.href='${base}/password/newPasswordPhone?userId='+userId;		
					}else{
						alert('请核对请收到的验证码与填写的是否一致!');
					}
				}
			});
		}else{
			alert('手机号和验证码不能为空！');
		}
	}
</script>

