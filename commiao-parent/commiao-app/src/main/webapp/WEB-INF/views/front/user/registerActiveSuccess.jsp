<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>

<script type="text/javascript" src="${ctx }js/yrycodeapi.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %>-激活成功</title>
</head>
  
  
  <body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
<!--******头部结束******-->
<div class="main clearfix comWidth" style="text-align:center;padding: 81px;">
 <div class="register">
  <div class="reg_l">
  <div>
  	<img src="${ctx }images/registerSuccess.png" />
  	<div style="margin-top:40px;padding-top: 3px;">
  	<div style="font-size: 16px;">
  	恭喜您，${nickName}</br>
  	</div>
  	<div style="font-size: 16px;">
  	您已经激活成功，请<a href="<%=basePath %>index " ><font color="#ED6D00">登录 </font></a>
  	</div>
  	</div>
  </div>
  </div>
 </div>
</div> 
 <%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
  </body>
</html>
