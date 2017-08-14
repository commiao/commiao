<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'center',border:false">
		<table id="menu_treegrid"></table>
	</div>
</div>

<div id="menuAddDialog" class="easyui-dialog" data-options="closed:true,modal:true,title:'添加菜单',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {saveMenu();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempSaveMenu();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelSaveMenu();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="menuAddForm" method="post">
			<input type="hidden" id="menuParentId" name="menuParentId" value="">
			<table >
				<tr>
	    			<td><label style="font-size:14px;">菜单名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单名'" name="title" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">url:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单url'" name="url" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">菜单编码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单编码'" name="code" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">菜单序号:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单序号'" name="ordersn" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr id="menu_parentId">
	    			<td><label style="font-size:14px;">父菜单ID:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'父菜单ID'" name="parentId" value="" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">层级:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'菜单层级'" name="menuLevel" style="width:100%;height:22px">
								<option value="">请选择</option>
								<option value="1">根菜单</option>
								<option value="2">子菜单</option>
								<option value="2">叶菜单</option>
						</select>
					</td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">菜单简介:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单简介'" name="description" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">状态:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'菜单状态'" name="status" style="width:100%;height:22px">
								<option value="1">启用</option>
								<option value="2">停用</option>
						</select>
					</td>
	    		</tr>
			</table>
		</form>
</div>
	
<div id="menuEditDialog"  class="easyui-dialog" data-options="closed:true,modal:true,title:'添加菜单',
											                buttons:[
											                {text:'保存',iconCls:'icon-ok',handler : function() {editMenu();}},
											                {text:'暂存',iconCls:'icon-lock',handler : function() {tempEditMenu();}},
											                {text:'取消',iconCls:'icon-clear',handler : function() {cancelEditMenu();}}
											                ]" style="width: 500px;height: 300px;">
		<form id="menuEditForm" method="post">
			<input type="hidden" name="id" />
			<table >
				<tr>
	    			<td><label style="font-size:14px;">菜单名:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单名'" name="title" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">url:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单url'" name="url" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">菜单编码:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单编码'" name="code" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">菜单序号:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单序号'" name="ordersn" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr id="menu_parentId">
	    			<td><label style="font-size:14px;">父菜单ID:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'父菜单ID'" name="parentId" value="" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">层级:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'菜单层级'" name="menuLevel" style="width:100%;height:22px">
								<option value="">请选择</option>
								<option value="1">根菜单</option>
								<option value="2">子菜单</option>
								<option value="2">叶菜单</option>
						</select>
					</td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">菜单简介:</label></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'菜单简介'" name="description" style="width:100%;height:22px"></td>
	    		</tr>
	    		<tr>
	    			<td><label style="font-size:14px;">状态:</label></td>
	    			<td>
		    			<select class="textbox combo" data-options="prompt:'菜单状态'" name="status" style="width:100%;height:22px">
								<option value="1">启用</option>
								<option value="2">停用</option>
						</select>
					</td>
	    		</tr>
			</table>
		</form>
</div>
<script type="text/javascript" charset="utf-8">
var menuAddForm;
var menuEditForm;
var MenuTreegrid;
$(function(){
	MenuTreegrid = $('#menu_treegrid').treegrid({    
	    url:'${base}/components/security/'+'menu/treeGrid',    
	    idField:'id',    
	    treeField:'name', 
	    animate: true, 
	    fit : true,
	    singleSelect:false,
	    pagination : true,
		pagePosition : 'bottom',
		rownumbers : false,
		sortOrder : 'desc',
		pageList : [ 10, 20, 30, 40 ],  
	    columns:[[   
	    	/* {field:'ck',checkbox:true,
				formatter:function(value,row,index){
					return row.id;
				}
			},  */  
	    	{field:'id',title:'id',width:'2%'}, 
	        {field:'name',title:'菜单名称',width:'15%'},
	        {field:'code',title:'菜单编码',width:'10%'},
	        {field:'url',title:'菜单地址',width:'13%'}, 
	        {field:'description',title:'菜单简介',width:'20%'}, 
	        {field:'status',title:'菜单状态',width:'10%',
	        	formatter:function(value,row,index){
        			if(row.status==1){
        				return '已启用';
        			}else if (row.status==2){
        				return '已停用';
        			}
					return '';
				}
	        },
	        {field:'menuLevel',title:'层级',width:'10%',
	        	formatter:function(value,row,index){
	        			if(row.menuLevel==1){
	        				return '根菜单';
	        			}else if (row.menuLevel==2){
	        				return '子菜单';
	        			}else if (row.menuLevel==3){
	        				return '叶菜单';
	        			}
						return '';
					}
	        
	        },
	        {field:'parentId',title:'父级Id',width:'50%'},    
	    ]],
	    toolbar : [ {
					text : '增加',
					iconCls : 'icon-add',
					handler : function() {
						toAddMenu();
					}
				}, '-', {
					text : '修改',
					iconCls : 'icon-edit',
					handler : function() {
						toEditMenu();
					}
				}, '-', {
					text : '删除',
					iconCls : 'icon-remove',
					handler : function() {
						delMenu();
					}
				},  '-', {
					text : '取消选中',
					iconCls : 'icon-undo',
					handler : function() {
						MenuTreegrid.treegrid('unselectAll');
					}
				}, '-', {
					text : '添加子菜单',
					iconCls : 'icon-add',
					handler : function() {
						toAddChildMenu();
					}
				}, '-' ]
	});  

	menuAddForm = $('#menuAddForm').form({
		url : '${base}/components/security/'+'menu/save',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				$('#menu_treegrid').treegrid('reload');
				$('#menuAddDialog').dialog('close');
			} else {
				$.messager.show({
					title : '失败',
					msg : '操作失败！'
				});
			}
		}
	});

	menuEditForm = $('#menuEditForm').form({
		url : '${base}/components/security/'+'menu/edit',
		success : function(data) {
			var json = $.parseJSON(data);
			if (json && json.success) {
				$.messager.show({
					title : '成功',
					msg : json.msg
				});
				MenuTreegrid.treegrid('reload');
				$('#menuEditDialog').dialog('close');
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
	function delMenu() {
		var rows = MenuTreegrid.treegrid('getSelections');
		var ids = [];
		if (rows.length > 0) {
			$.messager.confirm('请确认', '您要删除当前所选记录?', function(r) {
				if (r) {
					for ( var i = 0; i < rows.length; i++) {
						var childRows = MenuTreegrid.treegrid('getChildren',rows[i].id);
						if(childRows.length > 0){
							for ( var j = 0; j < childRows.length; j++) {
								ids.push(childRows[j].id);
							}
						}
						ids.push(rows[i].id);
					}
					$.ajax({
						url : '${base}/components/security/'+'menu/delete',
						data : {
							ids : ids.join(',')
						},
						dataType : 'json',
						success : function(response) {
							MenuTreegrid.treegrid('load');
							MenuTreegrid.treegrid('unselectAll');
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
	function toAddMenu() {
		$('#menuAddForm').find('input,textarea').val('');
		$('div.validatebox-tip').remove();
		$('#menuAddDialog').dialog('open');
		$('#menu_parentId').show();
	}


    /******打开新增子菜单*******/
	function toAddChildMenu() {
	var rows = MenuTreegrid.treegrid('getSelections');
		if (rows.length == 1) {
			$('#menuAddForm').find('input,textarea').val('');
			$('div.validatebox-tip').remove();
			$('#menuParentId').val(rows[0].id);
			$('#menuAddDialog').dialog('open');
			$('#menu_parentId').hide();
		} else {
			$.messager.alert('提示', '请先选择一项要添加菜单的父菜单！', 'error');
		}
	}
	
	/******打开编辑modal，并回显信息*******/
	function toEditMenu() {
		var rows = MenuTreegrid.treegrid('getSelections');
		if (rows.length == 1) {
			$.messager.progress({
				text : '数据加载中....',
				interval : 100
			});
			$.ajax({
				url : '${base}/components/security/'+'menu/showDesc',
				data : {
					id : rows[0].id
				},
				dataType : 'json',
				cache : false,
				success : function(response) {
					menuEditForm.find('input,textarea').val('');
					menuEditForm.form('load', response);
					$('div.validatebox-tip').remove();
					$('#menuEditDialog').dialog('open');
					$.messager.progress('close');
				}
			});
		} else {
			$.messager.alert('提示', '请选择一项要编辑的记录！', 'error');
		}
	}
	
	
	/***********************************************新增、编辑对话框处理事件********************************************************/
	/**------新增保存--------*/
	function saveMenu() {
		$('#menuAddForm').submit();
	}
	
	/**------添加暂存--------*/
	function tempSaveMenu() {
		$('#menuAddForm').submit();
	}
	
	/**------取消添加保存--------*/
	function cancelSaveMenu() {
		$('#menuAddDialog').panel('close');
	}
	
	
	/**------编辑保存--------*/
	function editMenu() {
		$('#menuEditForm').submit();
	}
	/**------取消编辑保存--------*/
	function cancelEditMenu() {
		$('#menuEditDialog').panel('close');
	}
	/**------编辑暂存--------*/
	function tempEditMenu() {
		edit();
	}
</script>  
