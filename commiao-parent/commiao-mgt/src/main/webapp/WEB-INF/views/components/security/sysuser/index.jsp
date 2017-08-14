<%-- <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'north',title:'查询条件',split:true,border:false" style="height:100px;">
		<div>
	    <form id="userSearchForm" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>Name:</td>
	    			<td><input class="easyui-textbox" data-options="prompt:'Enter a name'" name="name" style="width:100%;height:22px"></td>
	    			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="searchUser();">查询</a></td>
	    			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear',plain:true" onclick="clearSearch();">重置</a></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>

	</div>
	<div data-options="region:'center'">
		<table id="user_datagrid">   
		</table>
	</div>
</div>
<div id="user_toobars">
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" style="float:left;">新增</a>
	<div class="datagrid-btn-separator"></div>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" style="float:left;">修改</a>
	<div class="datagrid-btn-separator"></div>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" ">删除</a>
</div>
<div id="userAddDialog" style="display: none;width: 500px;height: 300px;" align="center">
		<form id="userAddForm" method="post">
			<table class="tableForm">
							<tr>
		 						<td>登陆名</td>
		 						<td>
									<input name="name" type="text" maxlength="50" class="easyui-validatebox" data-options="" missingMessage="请填写登陆名"  style="width: 155px;"/>
								</td>
							</tr>
			</table>
		</form>
	</div>
	<div id="userEditDialog" style="display: none;width: 500px;height: 300px;" align="center">
		<form id="userEditForm" method="post">
			<input type="hidden" name="id" />
			<table class="tableForm">
							<tr>
		 						<td>登陆名</td>
		 						<td>
								<input name="name" type="text" maxlength="50" class="easyui-validatebox" data-options="" missingMessage="请填写登陆名"  style="width: 155px;"/>
								</td>
							</tr>

							
			</table>
		</form>
	</div>
<script type="text/javascript" charset="utf-8">
$(function(){
	$('#user_datagrid').datagrid({    
   		url:'user/datagrid',
		iconCls : 'icon-save',
		pagination : true,
		pagePosition : 'bottom',
		rownumbers : true,
		pageList : [ 10, 20, 30, 40 ],
		fit : true,//为false时,翻页紧跟在数据后面
		fitColumns : true,
		nowrap : true,
		border : false,
		idField : 'cid',
		sortName : '',
		sortOrder : 'desc',
		columns : [ [ 
		{field:'ck',checkbox:true,
					formatter:function(value,row,index){
						return row.cid;
					}
				},   
	        {field:'id',title:'编码',width:150},    
	        {field:'name',title:'名称',width:150},    
	        {field:'password',title:'价格',width:150,align:'right'}    
	    ]],
		toolbar : '#user_toobars'   
	}); 
	
	/**************添加用户****start***************/
	userAddForm = $('#userAddForm').form({
		url : 'user/add',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				user_datagrid.datagrid('reload');
				userAddDialog.dialog('close');
			} else {
				$.messager.show({
					title : '失败',
					msg : '操作失败！'
				});
			}
		}
	});
	
	userAddDialog = $('#userAddDialog').show().dialog({
		title : '添加用户管理',
		modal : true,
		closed : true,
		maximizable : true,
		buttons : [ {
			text : '添加',
			handler : function() {
				userAddForm.submit();
			}
		} ]
	});
	/**************添加用户******end*************/
	
});
function add() {
	userAddForm.find('input,textarea').val('');
	$('div.validatebox-tip').remove();
	userAddDialog.dialog('open');
}

function searchUser(){
	$('#user_datagrid').datagrid('load',serializeObject($('#userSearchForm')));
}
function clearSearch(){
	$('#userSearchForm')[0].reset();
	$('#user_datagrid').datagrid('load',{});
}
</script>  
 --%>