<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信P2P-联系我们</title>
<script language="javascript">
function back_index(){
	window.location.href="${base}/index/index";
}
</script>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	
	<h2>联系我们页面</h2>
	<br/><br/><br/><br/><br/><br/><br/>
	<a href="javascript:back_index();">返回首页</a>
	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>