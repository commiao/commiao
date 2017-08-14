<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %></title>
<%@ include file="/WEB-INF/jsp/global/global.jsp"%>
</head>
<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
<!-- ====头部结束==== -->
<div class="main">
  <!--出借注册-->
  <div class="point">
  	<img src="${ctx }images/point1.jpg"  />
    <img src="${ctx }images/point2.jpg"  />
    <img src="${ctx }images/point3.jpg"  />
    <img src="${ctx }images/point4.jpg"  />
    <img src="${ctx }images/point5.jpg"  />
    <img src="${ctx }images/point6.jpg"  />
    <img src="${ctx }images/point7.jpg"  />
    <img src="${ctx }images/point8.jpg"  />
    <img src="${ctx }images/point9.jpg"  />
  </div>
</div>

<!--===========foot============-->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>

</body>
</html>

<script type="text/javascript">
// 菜单变色
$(function() {
	$(".menu-selected").removeClass("menu-selected");
	$("#guide").addClass("menu-selected");
});
</script>
