<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<input type="hidden" id="orgSysUserFlag"  value="">
<div class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'center',border:false" style="width:45%;">
		<table id="org_treegrid"></table>
	</div>
	
	<div data-options="region:'east',iconCls:'icon-reload',split:true" style="width:55%;">
		<div class="easyui-panel" data-options="title:'机构用户',border:false,fit:true"  >
			<table id="orgSysUser_datagrid">   
		    </table>
		</div>
	</div> 
</div>
<div id="orgAddDialog" class="easyui-dialog" data-options="closed:true,modal:true,title:'添加菜单',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {saveOrg();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempSaveOrg();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelSaveOrg();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="orgAddForm" method="post">
			<input type="hidden" id="orgParentId" name="orgParentId" value="">
			<table >
				<tr>
	    			<td><label style="font-size:14px;">机构名称:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'机构名称'" name="name" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">机构代码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'机构代码'" name="code" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">机构地址:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'机构地址'" name="address" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">机构序号:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'机构序号'" name="ordersn" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr id="org_parentId">
	    			<td><label style="font-size:14px;">父机构ID:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'父机构ID'" name="parentId" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">机构简介:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'机构简介'" name="description" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">分公司网站编码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'分公司网站编码'" name="websiteCode" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">状态:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'状态'" name="status" style="width:100%;height:22px">
								<option value="">请选择</option>
								<option value="1">启用</option>
								<option value="2">停用</option>
						</select>
					</td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">机构类型:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'机构类型'" name="orgType" style="width:100%;height:22px">
								<option value="">请选择</option>
								<option value="1">部门（总部）</option>
								<option value="2">分公司</option>
								<option value="3">部门（分公司）</option>
						</select>
					</td>
	    		</tr>
			</table>
		</form>
</div>
<div id="orgEditDialog"  class="easyui-dialog" data-options="closed:true,modal:true,title:'添加菜单',
										                buttons:[
										                {text:'保存',iconCls:'icon-ok',handler : function() {editOrg();}},
										                {text:'暂存',iconCls:'icon-lock',handler : function() {tempEditOrg();}},
										                {text:'取消',iconCls:'icon-clear',handler : function() {cancelEditOrg();}}
										                ]" style="width: 500px;height: 300px;">
	<form id="orgEditForm" method="post">
		<input type="hidden" name="id" />
		<table >
			<tr>
    			<td><label style="font-size:14px;">机构名称:</label></td>
    			<td><input class="easyui-textbox" data-options="prompt:'机构名称'" name="name" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">机构代码:</label></td>
    			<td><input class="easyui-textbox" data-options="prompt:'机构代码'" name="code" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">机构地址:</label></td>
    			<td><input class="easyui-textbox" data-options="prompt:'机构地址'" name="address" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">机构序号:</label></td>
    			<td><input class="easyui-textbox" data-options="prompt:'机构序号'" name="ordersn" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">父机构ID:</label></td>
    			<td><input class="easyui-textbox" data-options="prompt:'父机构ID'" name="parentId" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">机构简介:</label></td>
    			<td><input class="easyui-textbox" data-options="prompt:'机构简介'" name="description" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">分公司网站编码:</label></td>
    			<td><input class="easyui-textbox" data-options="prompt:'分公司网站编码'" name="websiteCode" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">状态:</label></td>
    			<td>
	    			<select class="textbox combo" data-options="prompt:'状态'" name="status" style="width:100%;height:22px">
							<option value="">请选择</option>
							<option value="1">启用</option>
							<option value="2">停用</option>
					</select>
				</td>
    		</tr>
    		<tr>
    			<td><label style="font-size:14px;">机构类型:</label></td>
    			<td>
	    			<select class="textbox combo" data-options="prompt:'机构类型'" name="orgType" style="width:100%;height:22px">
							<option value="">请选择</option>
							<option value="1">部门（总部）</option>
							<option value="2">分公司</option>
							<option value="3">部门（分公司）</option>
					</select>
				</td>
    		</tr>
		</table>
	</form>
</div>

<div id="orgRoleDialog"  class="easyui-dialog" data-options="closed:true,modal:true,title:'添加组织机构角色',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {saveOrgRole();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempSaveOrgRole();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelSaveOrgRole();}}
											                ]" style="width: 800px;height: 500px;">
	<form id="orgRoleForm" method="post">
		 <input type="hidden" id="orgId" name="orgId" value="">
		 <div id="orgRole_datagrid">
		 </div>
	</form>
</div>

<div id="orgSysUserDialog"  class="easyui-dialog" data-options="closed:true,modal:true,title:'添加组织机构用户',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {saveOrgSysUser();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelSaveOrgSysUser();}}
											                ]" style="width: 800px;height: 500px;">
	<form id="orgSysUserForm" method="post">
		 <input type="hidden" id="addOrgSysUserRoleIds" value="" name="addOrgSysUserRoleIds">
		 <div id="absentOrgSysUser_datagrid">
		 </div>
		 <!--  -->
		 <br><br>
	 	 <div id="org_role_select_div" style="display:none">
   			<td><label style="font-size:14px;">请选择组织角色:</label></td>
   			<td>
    			<select id="org_roleSelect" class="easyui-combotree" style="width:200px;"></select>
			</td>
    	 </div>
	</form>
</div>
<script type="text/javascript" charset="utf-8">
var orgAddForm;
var orgEditForm;
var orgTreegrid;
$(function(){
	orgTreegrid = $('#org_treegrid').treegrid({    
	    url:'${base}/components/security/'+'org/datagrid',    
	    idField:'id',    
	    treeField:'name', 
	    fit: true,
	    animate: true, 
	    pagination : true,
		pagePosition : 'bottom',
		rownumbers : true,
		sortOrder : 'desc',
		pageList : [ 10, 20, 30, 40 ],  
	    columns:[[    
	        {field:'name',title:'组织机构名称',width:'50%'},
	        {field:'id',title:'机构id',width:'20%'},    
	        {field:'parentId',title:'父级id',width:'30%'}  
	    ]],
	    toolbar : [ {
					text : '增加',
					iconCls : 'icon-add',
					handler : function() {
						toAdd();
					}
				}, '-', {
					text : '修改',
					iconCls : 'icon-edit',
					handler : function() {
						toEdit();
					}
				}, '-', {
					text : '删除',
					iconCls : 'icon-remove',
					handler : function() {
						del();
					}
				},  '-', {
					text : '取消选中',
					iconCls : 'icon-undo',
					handler : function() {
						orgTreegrid.treegrid('unselectAll');
					}
				}, '-', {
				text : '添加子机构',
				//iconCls : 'icon-undo',
				handler : function() {
					var rows = orgTreegrid.treegrid('getSelections');
					if (rows.length ==1 ) {
						toAddChildOrg(rows[0].id);
					}else {
						$.messager.alert('提示', '请选择一项要匹配的记录！', 'error');
					}
				}
				},'-', {
				text : '用户管理',
				//iconCls : 'icon-undo',
				handler : function() {
					var rows = orgTreegrid.treegrid('getSelections');
					if (rows.length ==1 ) {
						orgSysUser(rows[0].id);
					}else {
						$.messager.alert('提示', '请选择一项要匹配的记录！', 'error');
					}
				}
				}, '-' , {
				text : '匹配角色',
				//iconCls : 'icon-undo',
				handler : function() {
					var rows = orgTreegrid.treegrid('getSelections');
					if (rows.length ==1 ) {
						orgRole(rows[0].id);
					}else {
						$.messager.alert('提示', '请选择一项要匹配的记录！', 'error');
					}
				}
				}, '-'/* , {
				text : '同步权限',
				//iconCls : 'icon-undo',
				handler : function() {
					var rows = orgTreegrid.treegrid('getSelections');
					if (rows.length ==1 ) {
						updateSysUserRole(rows[0].id);
					}else {
						$.messager.alert('提示', '请选择一项要同步权限的组织机构！', 'error');
					}
				}
				}, '-' */] 
	});  

	orgAddForm = $('#orgAddForm').form({
		url : '${base}/components/security/'+'org/save',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				$('#org_treegrid').treegrid('reload');
				$('#orgAddDialog').dialog('close');
			} else {
				$.messager.show({
					title : '失败',
					msg : '操作失败！'
				});
			}
		}
	});

	orgEditForm = $('#orgEditForm').form({
		url : '${base}/components/security/'+'org/edit',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				orgTreegrid.treegrid('reload');
				$('#orgEditDialog').dialog('close');
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
function del() {
	var rows = orgTreegrid.treegrid('getSelections');
	var ids = [];
	if (rows.length > 0) {
		$.messager.confirm('请确认', '您要删除当前所选记录?', function(r) {
			if (r) {
				for ( var i = 0; i < rows.length; i++) {
					var orgChildRows = orgTreegrid.treegrid('getChildren',rows[i].id);
					if(orgChildRows.length > 0){
						for ( var j = 0; j < orgChildRows.length; j++) {
							ids.push(orgChildRows[j].id);
						}
					}
					ids.push(rows[i].id);
				}
				$.ajax({
					url : '${base}/components/security/'+'org/delete',
					data : {
						ids : ids.join(',')
					},
					dataType : 'json',
					success : function(response) {
						orgTreegrid.treegrid('load');
						orgTreegrid.treegrid('unselectAll');
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
function toAdd() {
	$('#org_parentId').show();
	$('#orgAddForm').find('input,textarea').val('');
	$('div.validatebox-tip').remove();
	$('#orgAddDialog').dialog('open');
}

   /******打开新增子菜单*******/
function toAddChildOrg(orgId) {
	$('#orgAddForm').find('input,textarea').val('');
	$('div.validatebox-tip').remove();
	$('#orgParentId').val(orgId);
	$('#orgAddDialog').dialog('open');
	$('#org_parentId').hide();
}

/******打开编辑modal，并回显信息*******/
function toEdit() {
	var rows = orgTreegrid.treegrid('getSelections');
	if (rows.length == 1) {
		$.messager.progress({
			text : '数据加载中....',
			interval : 100
		});
		$.ajax({
			url : '${base}/components/security/'+'org/showDesc',
			data : {
				id : rows[0].id
			},
			dataType : 'json',
			cache : false,
			success : function(response) {
				orgEditForm.find('input,textarea').val('');
				orgEditForm.form('load', response);
				$('div.validatebox-tip').remove();
				$('#orgEditDialog').dialog('open');
				$.messager.progress('close');
			}
		});
	} else {
		$.messager.alert('提示', '请选择一项要编辑的记录！', 'error');
	}
}
	
/** 跳转至机构用户*/
function orgSysUser(orgid) {
	$('#orgSysUserFlag').val(orgid);
		var orgSysUserdatagrid;
		orgSysUserdatagrid =$('#orgSysUser_datagrid').datagrid({    
	   		url:'${base}/components/security/'+'org/orgSysUserDatagrid'+"?orgid="+orgid,//一个URL从远程站点请求数据。
			iconCls : 'icon-save',//一个CSS类，将提供一个背景图片作为标题图标。
			pagination : true,//当true时在DataGrid底部显示一个分页工具栏。默认false。
			pagePosition : 'bottom',//定义分页工具栏的位置。可用的值有：'top','bottom','both'。
			rownumbers : true,//如果为true，则显示一个行号列。
			pageList : [ 10, 20, 30, 40 ],//在设置分页属性的时候 初始化页面大小选择列表。
			fit : true,//为false时,翻页紧跟在数据后面
			fitColumns : true,//真正的自动展开/收缩列的大小，以适应网格的宽度，防止水平滚动。
			nowrap : true,//如果为true，则在同一行中显示数据。设置为true可以提高加载性能。
			border : false,//当true时，显示该datagrid面板的边框
			idField : 'id',
			sortName : '',
			sortOrder : 'desc',
			columns : [ [   
				{field:'ck',checkbox:true,
					formatter:function(value,row,index){
						return row.id;
					}
				},    
		        {field:'id',title:'用户ID',width:'10%'},    
		        {field:'loginName',title:'用户登录名',width:'40%'},    
		        {field:'realName',title:'真名',width:'60%'}    
		    ]] ,
			toolbar : [ {
					text : '增加',
					iconCls : 'icon-add',
					handler : function() {
						toAddOrgSysUser();
					}
				}, '-', {
					text : '删除',
					iconCls : 'icon-remove',
					handler : function() {
						delOrgSysUser();
					}
				},  '-' ]   
		}); 
}

/**添加组织机构用户**/
function toAddOrgSysUser(){
	$('#orgSysUserDialog').dialog('open');
	var addOrgSysUserDatagrid;
	addOrgSysUserDatagrid =$('#absentOrgSysUser_datagrid').datagrid({    
   		url:'${base}/components/security/'+'org/addOrgSysUserDatagrid'+"?orgid="+$('#orgSysUserFlag').val(),//一个URL从远程站点请求数据。
		iconCls : 'icon-save',//一个CSS类，将提供一个背景图片作为标题图标。
		pagination : true,//当true时在DataGrid底部显示一个分页工具栏。默认false。
		pagePosition : 'bottom',//定义分页工具栏的位置。可用的值有：'top','bottom','both'。
		rownumbers : true,//如果为true，则显示一个行号列。
		pageList : [ 10, 20, 30, 40 ],//在设置分页属性的时候 初始化页面大小选择列表。
		fit : false,//为false时,翻页紧跟在数据后面
		fitColumns : true,//真正的自动展开/收缩列的大小，以适应网格的宽度，防止水平滚动。
		nowrap : true,//如果为true，则在同一行中显示数据。设置为true可以提高加载性能。
		border : false,//当true时，显示该datagrid面板的边框
		idField : 'id',
		sortName : '',
		sortOrder : 'desc',
		columns : [ [ 
		{field:'ck',checkbox:true,
					formatter:function(value,row,index){
						return row.id;
					}
				},   
	        {field:'id',title:'用户ID',width:'30%'},    
	        {field:'name',title:'用户名',width:'30%'},    
	        {field:'loginName',title:'用户登录名',width:'40%'}    
	    ]],
	    onLoadSuccess:function(){
	    	$('#absentOrgSysUser_datagrid').datagrid('unselectAll');
	    	$('#org_role_select_div').show();
	    	$('#org_roleSelect').combotree({
				url : '${base}/components/security/'+'sysuser/getOrgRoleTree'+"?orgid="+$('#orgSysUserFlag').val(),
				lines : false,
				animate : true,
				multiple:true,
				onLoadSuccess:function(node, data){
					$('#addOrgSysUserRoleIds').val('');
				},
				onHidePanel:function(){
					if($('#org_roleSelect').combotree('getValues') != null){
						$('#addOrgSysUserRoleIds').val($('#org_roleSelect').combotree('getValues'));
					}
				}
			});
	    }
	}); 
}


/**删除组织机构用户**/
function delOrgSysUser(){
	var orgid = $('#orgSysUserFlag').val();
	var rows = $('#orgSysUser_datagrid').datagrid('getSelections');
	var userids = [];
	if (rows.length > 0) {
		$.messager.confirm('请确认', '您要删除当前所选记录?', function(r) {
			if (r) {
				for ( var i = 0; i < rows.length; i++) {
					userids.push(rows[i].id);
				}
				$.ajax({
					url : '${base}/components/security/'+'org/deleteOrgSysUsers',
					data : {
						orgid:orgid,
						userids : userids.join(',')
					},
					dataType : 'json',
					success : function(response) {
						$('#orgSysUser_datagrid').datagrid('load');
						$('#orgSysUser_datagrid').datagrid('unselectAll');
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



/** 为组织机构匹配角色*/
function orgRole(orgid) {
	$('#orgRoleDialog').dialog('open');
	$('#orgId').val(orgid);
	var orgRoleDatagrid;
	orgRoleDatagrid =$('#orgRole_datagrid').datagrid({    
   		url:'${base}/components/security/'+'org/orgRoleDatagrid'+"?orgid="+orgid,//一个URL从远程站点请求数据。
		iconCls : 'icon-save',//一个CSS类，将提供一个背景图片作为标题图标。
		pagination : true,//当true时在DataGrid底部显示一个分页工具栏。默认false。
		pagePosition : 'bottom',//定义分页工具栏的位置。可用的值有：'top','bottom','both'。
		rownumbers : true,//如果为true，则显示一个行号列。
		pageList : [ 10, 20, 30, 40 ],//在设置分页属性的时候 初始化页面大小选择列表。
		fit : false,//为false时,翻页紧跟在数据后面
		fitColumns : true,//真正的自动展开/收缩列的大小，以适应网格的宽度，防止水平滚动。
		nowrap : true,//如果为true，则在同一行中显示数据。设置为true可以提高加载性能。
		border : false,//当true时，显示该datagrid面板的边框
		idField : 'id',
		sortName : '',
		sortOrder : 'desc',
		columns : [ [ 
		{field:'ck',checkbox:true,
					formatter:function(value,row,index){
						return row.id;
					}
				},   
	        {field:'id',title:'角色ID',width:'30%'},    
	        {field:'name',title:'角色名',width:'30%'},    
	        {field:'code',title:'角色编码',width:'40%'}    
	    ]],
	    onLoadSuccess:function(data){   //把组织机构当前拥有的角色标记出来
	    	$('#orgRole_datagrid').datagrid('unselectAll');
	    	$.ajax({
				url : '${base}/components/security/'+'org/getRoleIds',
				data : {
					orgid:orgid
				},
				success : function(response) {
					var roleids = response.substring(0, response.length - 1)
					var rows = data.rows;
			    	for(var i = 0; i < rows.length; i++){
			    		for(var j = 0; j < roleids.length; j++){
			    			if(rows[i].id == roleids[j]){
				    			orgRoleDatagrid.datagrid('selectRecord',rows[i].id);
				    		}
			    		}
			    	}
				}
		   });
	    }
	    
	}); 
}

/***********************************************新增、编辑对话框操作***********************************************/
/**------新增保存--------*/
function saveOrg() {
	$('#orgAddForm').submit();
}

/**------添加暂存--------*/
function tempSaveOrg() {
	$('#orgAddForm').submit();
}
/**------取消添加保存--------*/
function cancelSaveOrg() {
	$('#orgAddDialog').panel('close');
}

/**------编辑保存--------*/
function editOrg() {
	$('#orgEditForm').submit();
}
/**------编辑暂存--------*/
function tempEditOrg() {
	$('#orgEditForm').submit();
}
/**------取消编辑保存--------*/
function cancelEditOrg() {
	$('#orgEditDialog').panel('close');
}

/***********************************************组织机构匹配角色对话框操作***********************************************/
/**------新增保存--------*/
function saveOrgRole() {
	var orgId=$('#orgId').val();
	var arrays;
	var roleIds = "";
	arrays = $('#orgRole_datagrid').datagrid('getSelections');
	if (arrays.length > 0) {
		for ( var i = 0; i < arrays.length; i++) {
			roleIds += arrays[i].id + ",";
		}
		roleIds = roleIds.substring(0, roleIds.length - 1);
	}
	$.ajax({
		url : '${base}/components/security/'+'org/saveOrgRole',
		data : {
			orgid:orgId,
			roleids:roleIds
		},
		dataType : 'json',
		success : function(response) {
			$.messager.show({
				title : '提示',
				msg : '保存成功！'
			});
		$('#orgRoleDialog').dialog('close');
		}
	});
}

/**------添加暂存--------*/
function tempSaveOrgRole() {
	saveOrgRole();
}
/**------取消添加保存--------*/
function cancelSaveOrgRole() {
	$('#orgRoleDialog').panel('close');
}
/***********************************************添加组织机构用户对话框操作***********************************************/
/**------新增保存--------*/
function saveOrgSysUser() {
	var orgId = $('#orgSysUserFlag').val()
	var arrays;
	var userIds = "";
	arrays = $('#absentOrgSysUser_datagrid').datagrid('getSelections');
	if (arrays.length > 0) {
		for ( var i = 0; i < arrays.length; i++) {
			userIds += arrays[i].id + ",";
		}
		userIds = userIds.substring(0, userIds.length - 1);
	}
	
	$.ajax({
		url : '${base}/components/security/'+'org/saveOrgSysUser',
		data : {
			orgid:orgId,
			userids:userIds,
			addOrgSysUserRoleIds:$('#addOrgSysUserRoleIds').val()
		},
		dataType : 'json',
		success : function(response) {
			$.messager.show({
				title : '提示',
				msg : '保存成功！'
			});
		$('#absentOrgSysUser_datagrid').datagrid('unselectAll');
		$('#orgSysUserDialog').dialog('close');
		$('#orgSysUser_datagrid').datagrid('reload');
		}
	});
}

/**------取消添加保存--------*/
function cancelSaveOrgSysUser() {
	$('#orgSysUserDialog').panel('close');
}

/***************************************************更新机构用户角色****************************************************/
function updateSysUserRole(orgid){
	$.ajax({
		url : '${base}/components/security/'+'org/updateSysUserRole',
		data : {
			orgid:orgid
		},
		dataType : 'json',
		success : function(response) {
			$.messager.show({
				title : '提示',
				msg : '同步成功！'
			});
		$('#orgSysUserDialog').dialog('close');
		$('#orgSysUser_datagrid').datagrid('reload');
		}
	});
}
</script>  
