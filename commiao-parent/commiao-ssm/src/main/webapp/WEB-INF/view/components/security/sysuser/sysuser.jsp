<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'north',title:'查询条件',split:true,border:false" style="height:70px;">
		<div>
	    <form id="userSearchForm" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td><label style="font-size:14px;">关键字:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入查询关键字'" name="name" style="width:100%;height:22px"></td>
	    			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="searchUser();">查询</a></td>
	    			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear',plain:true" onclick="clearUserSearch();">重置</a></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>
	</div>
	<div data-options="region:'center',border:false">
		<table id="sysuser_datagrid">   
		</table>
	</div>
</div>


<div id="userAddDialog" class="easyui-dialog" data-options="closed:true,modal:true,title:'添加用户',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {saveUser();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempSaveUser();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelSaveUser();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="userAddForm" method="post">
			<input type="hidden" id="user_OrgId" value="" name="user_OrgId" />
			<input type="hidden" id="user_RoleId" value="" name="user_RoleId" />	
			<table >
				<tr>
	    			<td><label style="font-size:14px;">用户名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'用户名'" name="name" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">登录名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'登录名'" name="loginName" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">真实姓名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'真实姓名'" name="realName" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">密码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'用户登录密码'" name="loginPassword" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">用户类型:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'用户类型'" name="userType" style="width:100%;height:22px">
							<option value="">请选择</option>
							<option value="1">管理员</option>
							<option value="2">普通用户</option>
						</select>
					</td>
	    		</tr>
	    		
	    		<tr>
	    			<td><label style="font-size:14px;">组织机构:</label></td>
	    			<td>
		    			<select id="org_select" data-options="prompt:'请选择组织机构'" class="easyui-combotree" style="width:200px;">
        				</select>
					</td>
	    		</tr>
	    		
	    		<tr id="orgRoleSelect" style="display:none">
	    			<td><label style="font-size:14px;">组织角色:</label></td>
	    			<td>
		    			<select id="org_role_select" class="easyui-combotree" style="width:200px;">
        				</select>
					</td>
	    		</tr>
			</table>
		</form>
	</div>
	<div id="userEditDialog"  class="easyui-dialog" data-options="closed:true,modal:true,title:'添加用户',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {editUser();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempEditUser();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelEditUser();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="userEditForm" method="post">
			<input type="hidden" name="id" />
			<table >
				<tr>
	    			<td><label style="font-size:14px;">用户名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'用户名'" name="name" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">登录名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'登录名'" name="loginName" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">真实姓名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'真实姓名'" name="realName" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">密码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'用户登录密码'" name="loginPassword" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">用户类型:</label></td>
	    			<td>
		    			<select class="textbox  combo" data-options="prompt:'用户类型'" name="userType" style="width:100%;height:22px">
							<option value="">请选择</option>
							<option value="1">管理员</option>
							<option value="2">普通用户</option>
						</select>
					</td>
	    		</tr>
			</table>
		</form>
	</div>
<script type="text/javascript" charset="utf-8">
var userAddForm;
var userEditForm;
var userDatagrid;
$(function(){
	userDatagrid =$('#sysuser_datagrid').datagrid({    
   		url:'${base}/components/security/'+'sysuser/datagrid',
		iconCls : 'icon-save',
		pagination : true,
		pagePosition : 'bottom',
		rownumbers : true,
		pageList : [ 10, 20, 30, 40 ],
		fit : true,//为false时,翻页紧跟在数据后面
		fitColumns : true,
		nowrap : true,
		border : false,
		idField : 'id',
		sortName : '',
		sortOrder : 'desc',
		columns : [ [ 
			{field:'ck',checkbox:true,
				formatter:function(value,row,index){
					return row.id;
				}
			},   
	        {field:'id',title:'用户id',width:'5%'},    
	        {field:'name',title:'用户名',width:'15%'},  
	        {field:'loginName',title:'用户登录名',width:'15%'},
	        {field:'realName',title:'真实姓名',width:'15%'},
	        {field:'loginPassword',title:'用户登录密码',width:'25%'},  
	        {field:'userType',title:'用户类型',width:'25%',
	        	formatter:function(value,row,index){
	        			if(row.userType==1){
	        				return '管理员';
	        			}else if (row.userType==2){
	        				return '普通用户';
	        			}
						return '';
					}
	        }    
	    ]],
		toolbar : [ {
				text : '增加',
				iconCls : 'icon-add',
				handler : function() {
					toAddUser();
				}
			}, '-', {
				text : '修改',
				iconCls : 'icon-edit',
				handler : function() {
					toEditUser();
				}
			}, '-', {
				text : '删除',
				iconCls : 'icon-remove',
				handler : function() {
					delUser();
				}
			},  '-', {
				text : '取消选中',
				iconCls : 'icon-undo',
				handler : function() {
					userDatagrid.datagrid('unselectAll');
				}
			}, '-' ]   
	}); 
	
	userAddForm = $('#userAddForm').form({
		url : '${base}/components/security/'+'sysuser/save',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				$('#sysuser_datagrid').datagrid('reload');
				$('#userAddDialog').dialog('close');
			} else {
				$.messager.show({
					title : '失败',
					msg : '操作失败！'
				});
			}
		}
	});
	
	userEditForm =$('#userEditForm').form({
		url : '${base}/components/security/'+'sysuser/edit',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				userDatagrid.datagrid('reload');
				$('#userEditDialog').dialog('close');
			} else {
				$.messager.show({
					title : '失败',
					msg : '操作失败！'
				});
			}
		}
	});
});

/******执行删除操作********/
function delUser() {
	var rows = userDatagrid.datagrid('getSelections');
	var ids = [];
	if (rows.length > 0) {
		$.messager.confirm('请确认', '您要删除当前所选记录?', function(r) {
			if (r) {
				for ( var i = 0; i < rows.length; i++) {
					ids.push(rows[i].id);
				}
				$.ajax({
					url : '${base}/components/security/'+'sysuser/delete',
					data : {
						ids : ids.join(',')
					},
					dataType : 'json',
					success : function(response) {
						userDatagrid.datagrid('load');
						userDatagrid.datagrid('unselectAll');
						$.messager.show({
							title : '提示',
							msg : '删除成功！'
						});
					}
				});
			}
		});
	} else {
		$.messager.alert('提示', '请选择要删除的记录！', 'error');
	}
}

/******打开新增modal*******/
function toAddUser() {
	$('#userAddForm').find('input,textarea').val('');
	$('div.validatebox-tip').remove();
	$('#userAddDialog').dialog('open');
	$('#orgRoleSelect').hide();
	/**加载组织机构**/
	$('#org_select').combotree({
		url : '${base}/components/security/'+'sysuser/getOrgTree'+"?orgid="+321,
		lines : false,
		animate : true,
		onChange : function(orgId) {
			$('#orgRoleSelect').show();
			if($('#org_select').combotree('getValue') != null){$('#user_OrgId').val($('#org_select').combotree('getValue'));}
			/**加载组织机构角色**/
			$('#org_role_select').combotree({
				url : '${base}/components/security/'+'sysuser/getOrgRoleTree'+"?orgid="+orgId,
				lines : false,
				animate : true,
				multiple:true,
				onHidePanel:function(){
					if($('#org_role_select').combotree('getValues') != null){
						$('#user_RoleId').val($('#org_role_select').combotree('getValues'));
					}
				}
			});
		}
	});
}

/******打开编辑modal，并回显信息*******/
function toEditUser() {
	var rows = userDatagrid.datagrid('getSelections');
	if (rows.length == 1) {
		$.messager.progress({
			text : '数据加载中....',
			interval : 100
		});
		$.ajax({
			url : '${base}/components/security/'+'sysuser/showDesc',
			data : {
				id : rows[0].id
			},
			dataType : 'json',
			cache : false,
			success : function(response) {
				userEditForm.find('input,textarea').val('');
				userEditForm.form('load', response);
				$('div.validatebox-tip').remove();
				$('#userEditDialog').dialog('open');
				$.messager.progress('close');
			}
		});
	} else {
		$.messager.alert('提示', '请选择一项要编辑的记录！', 'error');
	}
}




/***********************************************新增、编辑对话框操作**********************************************/
/**------新增用户保存--------*/
function saveUser(){
	$('#userAddForm').submit();
}

/**------新增用户暂存--------*/
function tempSaveUser(){
	$('#userAddForm').submit();
}

/**------取消新增用户--------*/
function cancelSaveUser(){
	$('#userAddDialog').dialog('close');
}


/**------编辑保存--------*/
function editUser(){
	$('#userEditForm').submit();
}

/**------编辑用户暂存--------*/
function tempEditUser(){
	$('#userEditForm').submit();
}

/**------取消编辑用户--------*/
function cancelEditUser(){
	$('#userEditDialog').dialog('close');
}

/************************************************列表的模糊查询和重置***************************************/
/**------模糊查询--------*/
function searchUser(){
	userDatagrid.datagrid('load',serializeObject($('#userSearchForm')));
}

/**------无查询条件的查询--------*/
function clearUserSearch(){
	$('#userSearchForm')[0].reset();
	userDatagrid.datagrid('load',{});
}
</script>  
