<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'north',title:'查询条件',split:false,border:false" style="height:65px;">
		<div>
	    <form id="roleSearchForm" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td><label style="font-size:14px;">关键字:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'输入查询关键字'" name="name" style="width:100%;height:22px"></td>
	    			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="searchRole();">查询</a></td>
	    			<td><a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear',plain:true" onclick="clearSearchRole();">重置</a></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>

	</div>
	<div data-options="region:'center',border:false">
		<table id="role_datagrid">   
		</table>
	</div>
</div>
<div id="roleAddDialog" class="easyui-dialog" data-options="closed:true,modal:true,title:'添加用户',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {saveRole();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempSaveRole();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelSaveRole();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="roleAddForm" method="post">
			<table >
				<tr>
	    			<td><label style="font-size:14px;">角色名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入角色名称'" name="name" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">角色编码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入角色编码'" name="code" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">角色序号:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入角色序号'" name="ordersn" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">状态:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'请选择状态'" name="status" style="width:100%;height:22px">
							<option value="">请选择</option>
							<option value="1">启用</option>
							<option value="2">停用</option>
						</select>
					</td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">角色简介:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请入角色简介'"  name="description" style="width:100%;height:22px"></td>
	    		</tr>
			</table>
		</form>
</div>
	
<div id="roleEditDialog"  class="easyui-dialog" data-options="closed:true,modal:true,title:'添加角色',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {editRole();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempEditRole();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelEditRole();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="roleEditForm" method="post">
			<input type="hidden" name="id" />
			<table >
				<tr>
	    			<td><label style="font-size:14px;">角色名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入角色名称'" name="name" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">角色编码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入角色编码'" name="code" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">角色序号:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入角色序号'" name="ordersn" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">状态:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'请选择状态'" name="status" style="width:100%;height:22px">
							<option value="">请选择</option>
							<option value="1">启用</option>
							<option value="2">停用</option>
						</select>
					</td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">角色简介:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请入角色简介'"  name="description" style="width:100%;height:22px"></td>
	    		</tr>
			</table>
		</form>
	</div>
	
	
	
<div id="roleMenuDialog"  class="easyui-dialog" data-options="closed:true,modal:true,title:'添加角色',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {saveRoleMenu();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempRoleMenu();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelRoleMenu();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="roleMenuForm" method="post">
			<input type="hidden" id="roleid" name="roleid" value="">
			<input type="hidden" id="menuids" name="menuids" value="">
			 <p>
                <a href="javascript:expandAllMenu()" >全部展开</a>
                <a href="javascript:collapseAllMenu()">全部闭合</a>
             </p>					 
			 <div id="role_menu_tree">
			 </div>
		</form>
	</div>
<script type="text/javascript" charset="utf-8">
var roleAddForm;
var roleEditForm;
var datagrid;
$(function(){
	datagrid =$('#role_datagrid').datagrid({    
   		url:'${base}/components/security/'+'role/datagrid',//一个URL从远程站点请求数据。
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
	        {field:'name',title:'角色名称',width:'20%'},
	        {field:'code',title:'角色编码',width:'20%'},
	        {field:'ordersn',title:'角色序号',width:'10%'},   
	        {field:'status',title:'角色状态',width:'20%',
	        	formatter:function(value,row,index){
        			if(row.status==1){
        				return '已启用';
        			}else if (row.status==2){
        				return '已停用';
        			}
					return '';
				}
	        },    
	        {field:'description',title:'角色简介',width:'25%'}    
	    ]],
		toolbar : [ {
				text : '增加',
				iconCls : 'icon-add',
				handler : function() {
					toAddRole();
				}
			}, '-', {
				text : '修改',
				iconCls : 'icon-edit',
				handler : function() {
					toEditRole();
				}
			}, '-', {
				text : '删除',
				iconCls : 'icon-remove',
				handler : function() {
					delRole();
				}
			},  '-', {
				text : '取消选中',
				iconCls : 'icon-undo',
				handler : function() {
					datagrid.datagrid('unselectAll');
				}
			}, '-', {
				text : '匹配菜单',
				iconCls : 'icon-save',
				handler : function() {
					var rows = datagrid.datagrid('getSelections');
					if (rows.length ==1 ) {
						roleMenu(rows[0].id);
					}else {
						$.messager.alert('提示', '请选择一项要匹配的记录！', 'error');
					}
				}
			}, '-' ]   
	}); 
	
	roleAddForm = $('#roleAddForm').form({
		url : '${base}/components/security/'+'role/save',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				$('#role_datagrid').datagrid('reload');
				$('#roleAddDialog').dialog('close');
			} else {
				$.messager.show({
					title : '失败',
					msg : '操作失败！'
				});
			}
		}
	});
	
	roleEditForm =$('#roleEditForm').form({
		url : '${base}/components/security/'+'role/edit',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				datagrid.datagrid('reload');
				$('#roleEditDialog').dialog('close');
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
function delRole() {
	var rows = datagrid.datagrid('getSelections');
	var ids = [];
	if (rows.length > 0) {
		$.messager.confirm('请确认', '您要删除当前所选记录?', function(r) {
			if (r) {
				for ( var i = 0; i < rows.length; i++) {
					ids.push(rows[i].id);
				}
				$.ajax({
					url : '${base}/components/security/'+'role/delete',
					data : {
						ids : ids.join(',')
					},
					dataType : 'json',
					success : function(response) {
						datagrid.datagrid('load');
						datagrid.datagrid('unselectAll');
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
function toAddRole() {
	$('#roleAddForm').find('input,textarea').val('');
	$('div.validatebox-tip').remove();
	$('#roleAddDialog').dialog('open');
}

/******打开编辑modal，并回显信息*******/
function toEditRole() {
	var rows = datagrid.datagrid('getSelections');
	if (rows.length == 1) {
		$.messager.progress({
			text : '数据加载中....',
			interval : 100
		});
		$.ajax({
			url : '${base}/components/security/'+'role/showDesc',
			data : {
				id : rows[0].id
			},
			dataType : 'json',
			cache : false,
			success : function(response) {
				roleEditForm.find('input,textarea').val('');
				roleEditForm.form('load', response);
				$('div.validatebox-tip').remove();
				$('#roleEditDialog').dialog('open');
				$.messager.progress('close');
			}
		});
	} else {
		$.messager.alert('提示', '请选择一项要编辑的记录！', 'error');
	}
}



/** 跳转至角色菜单对话框*/
function roleMenu(roleid) {
	$('#roleid').val(roleid);
	$('#roleMenuDialog').dialog('open');
	$('#role_menu_tree').tree({    
 		url:'${base}/components/security/'+'role/roleMenuTree'+"?roleid="+roleid,    
  		animate: true, 
		checkbox:true,
		cascadeCheck:false,
		onSelect:function(node){ 
				//$(this).tree('toggle', node.target);
		},
		onCheck:function(node, checked){
		    if (checked) {
       		    var parentNode = $('#role_menu_tree').tree('getParent', node.target);
     		 	if (parentNode != null) {
         		   $('#role_menu_tree').tree('check', parentNode.target);
                }
           	} else {
	            var childNode = $('#role_menu_tree').tree('getChildren', node.target);
	            if (childNode.length > 0) {
             		for (var i = 0; i < childNode.length; i++) {
                      	$('#role_menu_tree').tree('uncheck', childNode[i].target);
                 	}
           		}
			}
		},
		onClick:function(node){
			$('#role_menu_tree').tree('check', node.target);
            var childNode = $('#role_menu_tree').tree('getChildren', node.target);
            if (childNode.length > 0) {
           		for (var i = 0; i < childNode.length; i++) {
                    $('#role_menu_tree').tree('check', childNode[i].target);
               	}
         	}
		}
	});
}


/****************************************************对话框操作**************************************************/	
/**------新增保存--------*/
function saveRole(){
	$('#roleAddForm').submit();
}	
/**------暂存保存--------*/
function tempSaveRole(){
	$('#roleAddForm').submit();
}

/**------关闭保存--------*/
function cancelSaveRole(){
	$('#roleAddDialog').dialog('close');
}

/**------编辑保存--------*/
function editRole(){
	$('#roleEditForm').submit();
}

/**------暂存编辑--------*/
function tempEditRole(){
	alert('暂存');
}

/**------关闭编辑--------*/
function cancelEditRole(){
	$('#roleEditDialog').dialog('close');
}

	
/**------暂存编辑--------*/
function tempRoleMenu(){
	alert('暂存');
}


/**------关闭保存--------*/
function cancelRoleMenu(){
	$('#roleMenuDialog').dialog('close');
}

/** 保存角色菜单*/
saveRoleMenu = function() {
	var roleid = $('#roleid').val();
	
	var arrays;
	var arrays1;
	var menuIds = "";
	arrays = $('#role_menu_tree').tree('getChecked', 'indeterminate');
	if (arrays.length > 0) {
		for ( var i = 0; i < arrays.length; i++) {
			menuIds += arrays[i].id + ",";
		}
	}
	arrays1 = $('#role_menu_tree').tree('getChecked');
	if (arrays1.length > 0) {
		for ( var i = 0; i < arrays1.length; i++) {
			menuIds += arrays1[i].id + ",";
		}
		menuIds = menuIds.substring(0, menuIds.length - 1);
	}
	$('#menuids').val(menuIds);
	$.ajax({
		url : '${base}/components/security/'+'role/saveRoleMenu',
		data : {
			roleid:roleid,
			menuids:menuIds
		},
		dataType : 'json',
		success : function(response) {
			datagrid.datagrid('load');
			datagrid.datagrid('unselectAll');
			$.messager.show({
				title : '提示',
				msg : '保存成功！'
			});
		$('#roleMenuDialog').dialog('close');
		}
	});
}

/** 全部展开*/
expandAllMenu = function() {
	var nodes = $('#role_menu_tree').tree('getChecked', 'unchecked');
	$('#role_menu_tree').tree('expandAll', nodes.target);
}
/** 全部关闭*/
collapseAllMenu = function() {
	var nodes = $('#role_menu_tree').tree('getChecked', 'unchecked');
	$('#role_menu_tree').tree('collapseAll', nodes.target);
}
/************************************************列表的模糊查询和重置***************************************/
/**------模糊查询--------*/
function searchRole(){
	datagrid.datagrid('load',serializeObject($('#roleSearchForm')));
}

/**------无查询条件的查询--------*/
function clearSearchRole(){
	$('#roleSearchForm')[0].reset();
	datagrid.datagrid('load',{});
}
</script>  
