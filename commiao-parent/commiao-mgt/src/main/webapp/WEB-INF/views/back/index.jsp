<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>com喵-用户编辑</title>
<script type="text/javascript" src="${base}/resources/plug-in/jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript" src="${base}/resources/plug-in/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${base}/resources/plug-in/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
<%
	String easyuiThemeName = "default";
%>
<link id="easyuiTheme"  rel="stylesheet" href="${base}/resources/plug-in/jquery-easyui-1.4.3/themes/<%=easyuiThemeName%>/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="${base}/resources/plug-in/jquery-easyui-1.4.3/themes/icon.css" type="text/css"></link>
<link rel="stylesheet" href="${base}/resources/css/style.css"/>

<script type="text/javascript" src="${base}/resources/js/huixin.js"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north'" style="height:80px"  href="${base}/layout/north.jsp"></div>
	<div data-options="region:'south',split:true" style="height:50px;"></div>
	<div data-options="region:'west'" style="width:130px;">
		<div class="easyui-panel" data-options="title:'功能导航',border:false,fit:true,href:'${base}/layout/west.jsp'"  >
		</div>
	</div>
	<div data-options="region:'center',title:'欢迎使用P2P后台系统',iconCls:'icon-ok'">
		<div id="centerTabs" class="easyui-tabs" data-options="fit:true,border:false" >
			<div title="首页">你好</div>
		</div>
	</div>
</body>
</html>
