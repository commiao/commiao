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
	
	<%-- <div title="标的管理" data-options="iconCls:'icon-save'">
		<a href="javascript:void(0);" onclick="addTab({title:'新标管理',href:'${base}/loan/index',closable:true});">新标管理</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'审核管理',href:'${base}/loan/examineIndex',closable:true});">审核管理</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'开标管理',href:'${base}/loan/investLoanList',closable:true});">开标管理</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'流标管理',href:'${base}/loan/fullLoan',closable:true});">流标管理</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'满标放款',href:'${base}/loan/payList',closable:true});">满标放款</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'还款管理',href:'${base}/loan/successLoanList',closable:true});">还款管理</a><br/>
		<!-- 暂时注释之前没用的东西  
		<a href="javascript:void(0);" onclick="addTab({title:'loanIndex',href:'${base}/loan/index',closable:true});">创建标的</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'examineIndex',href:'${base}/loan/examineIndex',closable:true});">审核登记</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'investLoanList',href:'${base}/loan/investLoanList',closable:true});">可投资标的</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'fullLoan',href:'${base}/loan/fullLoan',closable:true});">满标放款</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'payList',href:'${base}/loan/payList',closable:true});">标的还款</a><br/>
		<a href="javascript:void(0);" onclick="addTab({title:'successLoanList',href:'${base}/loan/successLoanList',closable:true});">已完成标的</a><br/>
		 -->
	</div>
	<div title="财务管理" data-options="iconCls:'icon-save'">
		<a href="javascript:void(0);" onclick="addTab({title:'hihao',href:'${base}/user/index',closable:true});">财务管理</a><br/>
	</div>
	<div title="权限管理" data-options="iconCls:'icon-save'">
		<a href="javascript:void(0);" onclick="addTab({title:'hihao',href:'${base}/user/index',closable:true});">权限管理</a><br/>
	</div>
	<div title="EasyUIDemo" data-options="iconCls:'icon-more'">
		<a href="javascript:void(0);" onclick="addTab({title:'combo',href:'${base}/demo/combo',closable:true});">combo用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'comboBox',href:'${base}/demo/index',closable:true});">comboBox用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'comboGrid',href:'${base}/demo/comboGrid',closable:true});">comboGrid用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'comboTree',href:'${base}/demo/comboTree',closable:true});">comboTree用例</a>
		<a href="javascript:void(0);" onclick="addTab({title:'dataGrid',href:'${base}/demo/dataGrid',closable:true});">dataGrid用例</a>
	</div> --%>
</div>
