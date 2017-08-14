<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<style>
#sysmenu a{
text-decoration:none;
}

#sysmenu li{
margin-top: 6px;
}

#sysmenu span{
font-size:14px;
color:#737300
}
</style>
<div class="easyui-accordion" data-options="fit:true,border:false">
	<!-- 菜单显示  -->
	<c:forEach items="${menus}" var="menus">
	    <div title="${menus.text}" data-options="iconCls:'icon-save'" >
			<div class="easyui-panel" fit="true" border="false">
	            <ul id="sysmenu" class="easyui-tree">
	            	<c:forEach items="${menus.children}" var="childMenus">
	                <li data-options="iconCls:'icon-ok'"  style=""><a href="javascript:void(0);" onclick="addTab({title:'${childMenus.text}',href:'${base}/${childMenus.url}',closable:true});"><span>${childMenus.text}</span></a></li>
	               	</c:forEach>
	            </ul>
	        </div>
		</div>
	</c:forEach>
	<div title="EasyUIDemo" data-options="iconCls:'icon-more'">
		<a href="javascript:void(0);" onclick="addTab({title:'combo',href:'${base}/demo/combo',closable:true});">combo用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'comboBox',href:'${base}/demo/index',closable:true});">comboBox用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'comboGrid',href:'${base}/demo/comboGrid',closable:true});">comboGrid用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'comboTree',href:'${base}/demo/comboTree',closable:true});">comboTree用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'dataGrid',href:'${base}/demo/dataGrid',closable:true});">dataGrid用例</a>
	</div>
</div>
