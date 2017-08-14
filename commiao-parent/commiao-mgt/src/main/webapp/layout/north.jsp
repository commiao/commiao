<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String basePath = request.getContextPath();
	String port = request.getServerPort()==80?"":":"+request.getServerPort();
%>
<script type="text/javascript" src="<%=basePath %>/resources/js/huixin-north.js"></script>
<script language="javascript">
function logout(bol){
	if(bol){
		window.location.href = "/commiao-mgt/logout";
	}
}
</script>
<div  style=" width:100%;">
	
<div  style="position: absolute; right: 0px; bottom: 32px; ">
	 <a href="javascript:void(0);" class="easyui-menubutton" menu="#layout_north_pfMenu" iconCls="icon-ok">更换皮肤</a> 
	 <a href="javascript:void(0);" class="easyui-menubutton" menu="#layout_north_zxMenu" iconCls="icon-back">退出</a>
</div>
<div id="layout_north_pfMenu" style="width: 120px; display: none;">
	<div onclick="changeTheme('default');">default</div>
	<div onclick="changeTheme('gray');">gray</div>
	<div onclick="changeTheme('black');">black</div>
	<div onclick="changeTheme('metro');">metro</div>
</div>
<div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
	<div class="menu-sep"></div>
	<div>
		<span>更换主题</span>
		<div style="width: 120px;">
			<div onclick="sy.changeTheme('default');">default</div>
			<div onclick="sy.changeTheme('gray');">gray</div>
			<div onclick="sy.changeTheme('cupertino');">cupertino</div>
			<div onclick="sy.changeTheme('dark-hive');">dark-hive</div>
			<div onclick="sy.changeTheme('pepper-grinder');">pepper-grinder</div>
			<div onclick="sy.changeTheme('sunny');">sunny</div>
		</div>
	</div>
</div>
<div id="layout_north_zxMenu" style="width: 100px; display: none;">
	<div onclick="logout(true);">锁定窗口</div>
	<div class="menu-sep"></div>
	<div onclick="logout();">切换用户</div>
	<div onclick="logout(true);">退出系统</div>
</div>
</div>