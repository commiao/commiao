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
    background: url("images/btn_next.jpg") no-repeat scroll 0 0 transparent;
    border: 0 none;
    height: 33px;
    width: 106px;
}
</style>
<script>
function sub(){
	if(
		checkNewPassword()
		&&checkReNewPassword()
	){
		$("#mynewpassword").val($("#newpassword").val());
		$("#remynewpassword").val($("#rnewpassword").val());
		document.findpwdpage.submit();
	}
}

function checkNewPassword(){
	$("#newPassMessage").html("");
	var newp = $("#newpassword").val()
	if(newp.trim()==""){
		$("#newPassMessage").html("请输入新密码");
		return false;
	}else if(newp.length<6||newp.length>16){
		$("#newPassMessage").html("密码长度为6-16位");
		return false;
	}else{
		$("#newPassMessage").html("");
		return true;
	}
}

function checkReNewPassword(){
	var newp = $("#newpassword").val()
	var renewp = $("#rnewpassword").val();
	$("#renewPassMessage").html("");
	if(renewp.trim()==""){
		$("#renewPassMessage").html("请再次输入新密码");
		return false;
	}else if(newp!=renewp){
		$("#renewPassMessage").html("两次输入的密码不一致");
		return false;
	}else{
		$("#renewPassMessage").html("");
		return true;
	}
}
</script>
<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
 <!--重置密码-->
<div class="main" style="height:520px;border:3px solid #D0D0D0;">
<form name="findpwdpage" action="resetSuccess" method="post">
				<input type="hidden" name="newpassword" id="mynewpassword" /> 
				<input type="hidden" name="rnewpassword" id="remynewpassword" /> 
				<input type="hidden" name="email" value="<%=request.getParameter("email")%>" />
				 <input type="hidden" name="validCode" value="<%=request.getParameter("newValidCode")%>" /> 
				 <input type="hidden" name="mailAuthenId" value="<%=request.getParameter("mailAuthenId")%>" />
				 <input type="hidden" name="sign" value="<%=request.getParameter("sign")%>" />
  <div id="b">
  	<div  class="zc_title" style="height: 40px;margin-left: 30px;">重置密码</div>
  	<div style="margin-top: 130px;margin-left: 260px;">
  	<!-- font-family: "微软雅黑";font-size: 16px;font-weight: bold;line-height: 40px;text-align: left; -->
	<span style="float: left;color:#000000;font-size: 18px;font-weight: bold;line-height: 40px;">&nbsp;新&nbsp;&nbsp;密&nbsp;&nbsp;码&nbsp;</span>
	<input class="czmm_yx02 reg_mail" type="password" style="color: gray;" name="newpassword1" id="newpassword" value="" />
	</div>
	<font style="color: #767676;float: left;line-height: 40px;padding-left: 20px;font-size: 16px;" ><span id="newPassMessage"></span></font>
	<div style="margin-top: 200px;margin-left: 260px;">
  	<!-- font-family: "微软雅黑";font-size: 16px;font-weight: bold;line-height: 40px;text-align: left; -->
	<span style="float: left;color:#000000;font-size: 17px;font-weight: bold;line-height: 40px;">确认新密码</span>
	<input class="czmm_yx02 reg_mail" type="password" style="color: gray;" name="rnewpassword1" id="rnewpassword" />
	</div>
	<font style="color: #767676;float: left;line-height: 40px;padding-left: 20px;font-size: 16px;" ><span id="renewPassMessage"></span></font>
	<div>
	<input class="btn_next" type="button" style="float:left;margin-left: 400px;margin-top: 90px;cursor: pointer" onclick="sub()" value="">
	</div>
</div>
		</form>
</div>
<!-- 尾部 -->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>

