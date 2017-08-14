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

<body opener.location.reload()>
<!-- 引入页眉 -->
<%@ include file="/global/head.jsp"%>


<div>
 <div class="register">
  <div class="reg_l">
  <div style="padding-left: 150px;padding-top: 200px; ">
  	<img src="${base}/resources/csimages/registerSuccess.png" />
  	<div style="float: right;padding-right: 270px; padding-top: 3px;">
  	<div style="font-size: 16px;">
  	恭喜您，${nickname}</br>
  	</div>
  	<div style="font-size: 16px;">
  	您已经激活成功，请<a href="${base}/login/index" ><font color="#ED6D00">登录 </font></a>
  	</div>
  	</div>
  </div>
  </div>
 </div>
</div>




<%@ include file="/global/bottom.jsp"%>
</body>
</html>
