<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信P2P系统-帮助中心</title>
<script language="javascript">
function back_index(){
	window.location.href="${base}/index/index";
}
</script>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>

	<h2>帮助中心页面</h2>
	<a href="javascript:back_index();">返回首页</a>
	
	<br/><br><br>
	<form action="">
		<table>
			<tr><a href="#">关于平台</a></tr><br>
			<tr><a href="#">投资问题</a></tr><br>
			<tr><a href="#">安全保障</a></tr><br>
			<tr><a href="#">托管账户</a></tr><br>
			<tr><a href="#">账户设置</a></tr><br>
			<tr><a href="#">资金管理</a></tr><br>
			<tr><a href="#">债权转让</a></tr><br>
			<tr><a href="#">操作步骤</a></tr><br>
			<tr><a href="#">其他</a></tr>		
		</table>
	</form>
	<br/><br/><br/><br/><br/><br/><br/>
	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>