<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript" src="${base}/resources/js/commiao.js"></script>
<script type="text/javascript">
var option={};
$(document).ready(function(){
    option.id= 'user'
	option.idField= 'userId'
	option.columns=[ [ 
		{field:'ck',checkbox:true,formatter:function(value,row,index){return row.userId;}},   
	        {field:'userId',title:'用户Id'},    
	        {field:'nickname',title:'用户名'}, 
	        {field:'realName',title:'真实姓名'},
	        {field:'cardNumber',title:'身份证号'},
	        {field:'userStatus',title:'用户状态'},
	        {field:'createTime',title:'创建时间'}
	    ]]
  	option.url_list= '${base}/commiao/user/datagrid'
	option.url_add= '${base}/commiao/user/add'; 
	option.url_edit= '${base}/commiao/user/edit'; 
	option.url_del= '${base}/commiao/user/delete'; 
	option.url_save='${base}/commiao/user/save'
   	option.toolbar= [ { text : '新增',iconCls : 'icon-add',handler : function() {add(option);} }, '-', 
					  { text : '修改',iconCls : 'icon-edit',handler : function() {edit(option);} }, '-', 
					  { text : '删除',iconCls : 'icon-remove',handler : function() {del(option);} },  '-']
    list(option);
});
</script>
<div id="main" class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'north',title:'查询条件',split:true,border:false" style="height:100px;">
		<div>     
	    <form id="usersearchForm" method="post">
	    	<table>
	    		<tr>
	    			<td>关键字:</td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入关键字'" name="nickname" style="width:100%;height:22px"></td>
	    			<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="search_find(option);">查询</a></td>
	    			<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-clear',plain:true" onclick="search_clear(option);">重置</a></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>
	</div>
	<div data-options="region:'center',border:false">
		<table id="userlistId">
		</table>
	</div>
</div>
<%@ include file="user-add.jsp"%>