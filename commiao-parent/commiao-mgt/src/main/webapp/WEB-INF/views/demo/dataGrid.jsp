<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!--基础数据表格  -->
<h2>Basic DataGrid:基础数据表格</h2>
<p>The DataGrid is created from markup, no JavaScript code needed.</p>
<div style="margin:20px 0;"></div>

<table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
		data-options="singleSelect:true,collapsible:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 流式数据网格 -->
<h2>Fluid DataGrid:流式数据网格</h2>
<p>This example shows how to assign percentage width to a column in DataGrid.</p>
<div style="margin:20px 0;"></div>

<table id="dg" class="easyui-datagrid" title="Fluid DataGrid" style="width:700px;height:250px"
		data-options="singleSelect:true,collapsible:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',resizable:false" width="15%">Item ID(15%)</th>
			<th data-options="field:'productid',resizable:false" width="15%">Product(15%)</th>
			<th data-options="field:'listprice',align:'right',resizable:false" width="15%">List Price(15%)</th>
			<th data-options="field:'unitcost',align:'right',resizable:false" width="15%">Unit Cost(15%)</th>
			<th data-options="field:'attr1',resizable:false" width="25%">Attribute(25%)</th>
			<th data-options="field:'status',align:'center',resizable:false" width="15%">Status(15%)</th>
		</tr>
	</thead>
</table>

<!-- 数据表格的变换表 -->
<h2>Transform DataGrid from Table:数据表格的变换表</h2>
<p>Transform DataGrid from an existing, unformatted html table.</p>
<div style="margin:20px 0;">
	<a href="#" class="easyui-linkbutton" onclick="javascript:$('#dgTransform').datagrid()">Transform</a>
</div>
<table id="dgTransform" style="width:700px;height:auto;border:1px solid #ccc;">
	<thead>
		<tr>
			<th data-options="field:'itemid'">Item ID</th>
			<th data-options="field:'productid'">Product</th>
			<th data-options="field:'listprice',align:'right'">List Price</th>
			<th data-options="field:'attr1'">Attribute</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>EST-1</td><td>FI-SW-01</td><td>36.50</td><td>Large</td>
		</tr>
		<tr>
			<td>EST-10</td><td>K9-DL-01</td><td>18.50</td><td>Spotted Adult Female</td>
		</tr>
		<tr>
			<td>EST-11</td><td>RP-SN-01</td><td>28.50</td><td>Venomless</td>
		</tr>
		<tr>
			<td>EST-12</td><td>RP-SN-01</td><td>26.50</td><td>Rattleless</td>
		</tr>
		<tr>
			<td>EST-13</td><td>RP-LI-02</td><td>35.50</td><td>Green Adult</td>
		</tr>
	</tbody>
</table>

<!-- 数据表格选择器 -->
<h2>DataGrid Selection:数据表格选择器</h2>
<p>Choose a selection mode and select one or more rows.</p>
<div style="margin:20px 0;">
	<a href="#" class="easyui-linkbutton" onclick="getSelected()">GetSelected</a>
	<a href="#" class="easyui-linkbutton" onclick="getSelections()">GetSelections</a>
</div>
<table id="dgSelection" class="easyui-datagrid" title="DataGrid Selection" style="width:700px;height:250px"
		data-options="singleSelect:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<div style="margin:10px 0;">
	<span>Selection Mode: </span>
	<select onchange="$('#dgSelection').datagrid({singleSelect:(this.value==0)})">
		<option value="0">Single Row</option>
		<option value="1">Multiple Rows</option>
	</select>
</div>
<script type="text/javascript">
	function getSelected(){
		var row = $('#dgSelection').datagrid('getSelected');
		if (row){
			$.messager.alert('Info', row.itemid+":"+row.productid+":"+row.attr1);
		}else{
			$.messager.alert('Info','抱歉，你还没有选择数据！');
		}
	}
	function getSelections(){
		var ss = [];
		var rows = $('#dgSelection').datagrid('getSelections');
		for(var i=0; i<rows.length; i++){
			var row = rows[i];
			ss.push('<span>'+row.itemid+":"+row.productid+":"+row.attr1+'</span>');
		}
		$.messager.alert('Info', ss.join('<br/>'));
	}
</script>

<!-- 数据表格的行编辑 -->
<h2>Row Editing in DataGrid:数据表格的行编辑</h2>
<p>Click the row to start editing.</p>
<div style="margin:20px 0;"></div>

<table id="dgRowEditing" class="easyui-datagrid" title="Row Editing in DataGrid" style="width:700px;height:auto"
		data-options="
			iconCls: 'icon-edit',
			singleSelect: true,
			toolbar: '#tbRowEditing',
			url: '${base}/resources/json/datagrid_data1.json',
			method: 'get',
			onClickRow: onClickRowEditing
		">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100,
					formatter:function(value,row){
						return row.productname;
					},
					editor:{
						type:'combobox',
						options:{
							valueField:'productid',
							textField:'productname',
							method:'get',
							url:'${base}/resources/json/products.json',
							required:true
						}
					}">Product</th>
			<th data-options="field:'listprice',width:80,align:'right',editor:{type:'numberbox',options:{precision:1}}">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right',editor:'numberbox'">Unit Cost</th>
			<th data-options="field:'attr1',width:250,editor:'textbox'">Attribute</th>
			<th data-options="field:'status',width:60,align:'center',editor:{type:'checkbox',options:{on:'P',off:''}}">Status</th>
		</tr>
	</thead>
</table>

<div id="tbRowEditing" style="height:auto">
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="appendRowEditing()">Append</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeitRowEditing()">Remove</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="acceptRowEditing()">Accept</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="rejectRowEditing()">Reject</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChangesRowEditing()">GetChanges</a>
</div>

<script type="text/javascript">
	var editIndex = undefined;
	function endRowEditingEditing(){
		if (editIndex == undefined){return true}
		if ($('#dgRowEditing').datagrid('validateRow', editIndex)){
			var ed = $('#dgRowEditing').datagrid('getEditor', {index:editIndex,field:'productid'});
			console.info(ed);
			var productname = $(ed.target).combobox('getText');
			$('#dgRowEditing').datagrid('getRows')[editIndex]['productname'] = productname;
			$('#dgRowEditing').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function onClickRowEditing(index){
		if (editIndex != index){
			if (endRowEditingEditing()){
				$('#dgRowEditing').datagrid('selectRow', index).datagrid('beginEdit', index);
				editIndex = index;
			} else {
				$('#dgRowEditing').datagrid('selectRow', editIndex);
			}
		}
	}
	function appendRowEditing(){
		if (endRowEditingEditing()){
			$('#dgRowEditing').datagrid('appendRow',{status:'P'});
			editIndex = $('#dgRowEditing').datagrid('getRows').length-1;
			$('#dgRowEditing').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
		}
	}
	function removeitRowEditing(){
		if (editIndex == undefined){return}
		$('#dgRowEditing').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
		editIndex = undefined;
	}
	function acceptRowEditing(){
		if (endRowEditingEditing()){
			$('#dgRowEditing').datagrid('acceptChanges');
		}
	}
	function rejectRowEditing(){
		$('#dgRowEditing').datagrid('rejectChanges');
		editIndex = undefined;
	}
	function getChangesRowEditing(){
		var rows = $('#dgRowEditing').datagrid('getChanges');
		alert(rows.length+' rows are changed!');
	}
</script>

<!-- 多项分类 -->
<h2>Multiple Sorting:多项分类</h2>
<p>Set 'multiSort' property to true to enable multiple column sorting.</p>
<div style="margin:20px 0;"></div>

<table class="easyui-datagrid" title="Multiple Sorting" style="width:700px;height:250px"
		data-options="singleSelect:true,collapsible:true,
			url:'${base}/resources/json/datagrid_data1.json',
			method:'get',
			remoteSort:false,
			multiSort:true
		">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80,sortable:true">Item ID</th>
			<th data-options="field:'productid',width:100,sortable:true">Product</th>
			<th data-options="field:'listprice',width:80,align:'right',sortable:true">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right',sortable:true">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 在数据表格中冻结的行 -->
<h2>Frozen Rows in DataGrid:在数据表格中冻结的行</h2>
<p>This sample shows how to freeze some rows that will always be displayed at the top when the datagrid is scrolled down.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="Frozen Rows in DataGrid" style="width:700px;height:250px"
		data-options="
			singleSelect: true,
			collapsible: true,
			rownumbers: true,
			url: '${base}/resources/json/datagrid_data1.json',
			method: 'get',
			onLoadSuccess: function(){
				$(this).datagrid('freezeRow',0).datagrid('freezeRow',1);
			}
		">
	<thead data-options="frozen:true">
		<tr>
			<th data-options="field:'itemid',width:100">Item ID</th>
			<th data-options="field:'productid',width:120">Product</th>
		</tr>
	</thead>
	<thead>
		<tr>
			<th data-options="field:'listprice',width:90,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:90,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:230">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 数据表格的列格式 -->
<h2>Format DataGrid Columns:数据表格的列格式</h2>
<p>The list price value will show red color when less than 30.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="Format DataGrid Columns" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,iconCls:'icon-ok',url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right',formatter:formatPrice">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:240">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<script>
	function formatPrice(val,row){
		if (val < 30){
			return '<span style="color:red;">('+val+')</span>';
		} else {
			return val;
		}
	}
</script>

<!-- 数据表格DataGrid中的语境菜单 -->
<h2>Context Menu on DataGrid:数据表格DataGrid中的语境菜单</h2>
<p>Right click on the header of DataGrid to display context menu.</p>
<div style="margin:20px 0;"></div>
<table id="dgContextMenu"></table>
<script type="text/javascript">
	$(function(){
		$('#dgContextMenu').datagrid({
			url: '${base}/resources/json/datagrid_data1.json',
			method: 'get',
			title: 'Context Menu on DataGrid',
			iconCls: 'icon-save',
			width: 700,
			height: 250,
			fitColumns: true,
			singleSelect: true,
			columns:[[
				{field:'itemid',title:'Item ID',width:80},
				{field:'productid',title:'Product ID',width:120},
				{field:'listprice',title:'List Price',width:80,align:'right'},
				{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
				{field:'attr1',title:'Attribute',width:250},
				{field:'status',title:'Status',width:60,align:'center'}
			]],
			onHeaderContextMenu: function(e, field){
				e.preventDefault();
				if (!cmenu){
					createColumnMenu();
				}
				cmenu.menu('show', {
					left:e.pageX,
					top:e.pageY
				});
			}
		});
	});
	var cmenu;
	function createColumnMenu(){
		cmenu = $('<div/>').appendTo('body');
		cmenu.menu({
			onClick: function(item){
				if (item.iconCls == 'icon-ok'){
					$('#dgContextMenu').datagrid('hideColumn', item.name);
					cmenu.menu('setIcon', {
						target: item.target,
						iconCls: 'icon-empty'
					});
				} else {
					$('#dgContextMenu').datagrid('showColumn', item.name);
					cmenu.menu('setIcon', {
						target: item.target,
						iconCls: 'icon-ok'
					});
				}
			}
		});
		var fields = $('#dgContextMenu').datagrid('getColumnFields');
		for(var i=0; i<fields.length; i++){
			var field = fields[i];
			var col = $('#dgContextMenu').datagrid('getColumnOption', field);
			cmenu.menu('appendItem', {
				text: col.title,
				name: field,
				iconCls: 'icon-ok'
			});
		}
	}
</script>

<!-- 栏目组 -->
<h2>Column Group:栏目组</h2>
<p>The header cells can be merged. Useful to group columns under a category.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="Column Group" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80" rowspan="2">Item ID</th>
			<th data-options="field:'productid',width:100" rowspan="2">Product</th>
			<th colspan="4">Item Details</th>
		</tr>
		<tr>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:240">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 数据表格DataGrid上的复选框选择 -->
<h2>CheckBox Selection on DataGrid:数据表格DataGrid上的复选框选择</h2>
<p>Click the checkbox on header to select or unselect all selections.</p>
<div style="margin:20px 0;"></div>

<table id="dgCheckBoxSelection" class="easyui-datagrid" title="CheckBox Selection on DataGrid" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:220">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<div style="margin:10px 0;">
	<span>Selection Mode: </span>
	<select onchange="$('#dgCheckBoxSelection').datagrid({singleSelect:(this.value==0)})">
		<option value="0">Single Row</option>
		<option value="1">Multiple Rows</option>
	</select><br/>
	SelectOnCheck: <input type="checkbox" checked onchange="$('#dgCheckBoxSelection').datagrid({selectOnCheck:$(this).is(':checked')})"><br/>
	CheckOnSelect: <input type="checkbox" checked onchange="$('#dgCheckBoxSelection').datagrid({checkOnSelect:$(this).is(':checked')})">
</div>

<!-- 数据表格的单元格编辑 -->
<h2>Cell Editing in DataGrid:数据表格的单元格编辑</h2>
<p>Click a cell to start editing.</p>
<div style="margin:20px 0;"></div>

<table id="dgCellEditing" class="easyui-datagrid" title="Cell Editing in DataGrid" style="width:700px;height:auto"
		data-options="
			iconCls: 'icon-edit',
			singleSelect: true,
			url: '${base}/resources/json/datagrid_data1.json',
			method:'get',
			onClickCell: onClickCellEditing
		">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100,editor:'text'">Product</th>
			<th data-options="field:'listprice',width:80,align:'right',editor:{type:'numberbox',options:{precision:1}}">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right',editor:'numberbox'">Unit Cost</th>
			<th data-options="field:'attr1',width:250,editor:'text'">Attribute</th>
			<th data-options="field:'status',width:60,align:'center',editor:{type:'checkbox',options:{on:'P',off:''}}">Status</th>
		</tr>
	</thead>
</table>

<script type="text/javascript">
	$.extend($.fn.datagrid.methods, {
		editCell: function(jq,param){
			return jq.each(function(){
				var opts = $(this).datagrid('options');
				var fields = $(this).datagrid('getColumnFields',true).concat($(this).datagrid('getColumnFields'));
				for(var i=0; i<fields.length; i++){
					var col = $(this).datagrid('getColumnOption', fields[i]);
					col.editor1 = col.editor;
					if (fields[i] != param.field){
						col.editor = null;
					}
				}
				$(this).datagrid('beginEdit', param.index);
				for(var i=0; i<fields.length; i++){
					var col = $(this).datagrid('getColumnOption', fields[i]);
					col.editor = col.editor1;
				}
			});
		}
	});
	
	var editIndex = undefined;
	function endCellEditing(){
		if (editIndex == undefined){return true}
		if ($('#dgCellEditing').datagrid('validateRow', editIndex)){
			$('#dgCellEditing').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function onClickCellEditing(index, field){
		if (endCellEditing()){
			$('#dgCellEditing').datagrid('selectRow', index).datagrid('editCell', {index:index,field:field});
			editIndex = index;
		}
	}
</script>

<!-- 数据表格DataGrid的列对齐 -->
<h2>Aligning Columns in DataGrid:数据表格DataGrid的列对齐</h2>
<p>Use align and halign properties to set the alignment of the columns and their header.</p>
<div style="margin:20px 0;"></div>

<table class="easyui-datagrid" title="Aligning Columns in DataGrid" style="width:700px;height:250px"
		data-options="singleSelect:true,collapsible:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80,halign:'center'">Item ID</th>
			<th data-options="field:'productid',width:100,halign:'center'">Product</th>
			<th data-options="field:'listprice',width:80,align:'right',halign:'center'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right',halign:'center'">Unit Cost</th>
			<th data-options="field:'attr1',width:250,halign:'center'">Attribute</th>
			<th data-options="field:'status',width:60,align:'center',halign:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 数据表格的编辑缓存 -->
<h2>Cache Editor for DataGrid:数据表格的编辑缓存</h2>
<p>This example shows how to cache the editors for datagrid to improve the editing speed.</p>
<div style="margin:20px 0;"></div>

<table id="dgCacheEditor" class="easyui-datagrid" title="Cache Editor for DataGrid" style="width:700px;height:auto"
		data-options="
			iconCls: 'icon-edit',
			singleSelect: true,
			toolbar: '#tbCacheEditor',
			url: '${base}/resources/json/datagrid_data1.json',
			method: 'get',
			onClickRow: onClickRowCacheEditor
		">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100,
					formatter:function(value,row){
						return row.productname;
					},
					editor:{
						type:'combobox',
						options:{
							valueField:'productid',
							textField:'productname',
							method:'get',
							url:'${base}/resources/json/products.json',
							required:true
						}
					}">Product</th>
			<th data-options="field:'listprice',width:80,align:'right',editor:{type:'numberbox',options:{precision:1}}">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right',editor:'numberbox'">Unit Cost</th>
			<th data-options="field:'attr1',width:250,editor:'text'">Attribute</th>
			<th data-options="field:'status',width:60,align:'center',editor:{type:'checkbox',options:{on:'P',off:''}}">Status</th>
		</tr>
	</thead>
</table>

<div id="tbCacheEditor" style="height:auto">
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="acceptCacheEditor()">Accept</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="rejectCacheEditor()">Reject</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChangesCacheEditor()">GetChanges</a>
</div>

<script type="text/javascript">
	(function($){
		function getCacheContainer(t){
			var view = $(t).closest('div.datagrid-view');
			var c = view.children('div.datagrid-editor-cache');
			if (!c.length){
				c = $('<div class="datagrid-editor-cache" style="position:absolute;display:none"></div>').appendTo(view);
			}
			return c;
		}
		function getCacheEditor(t, field){
			var c = getCacheContainer(t);
			return c.children('div.datagrid-editor-cache-' + field);
		}
		function setCacheEditor(t, field, editor){
			var c = getCacheContainer(t);
			c.children('div.datagrid-editor-cache-' + field).remove();
			var e = $('<div class="datagrid-editor-cache-' + field + '"></div>').appendTo(c);
			e.append(editor);
		}
		
		var editors = $.fn.datagrid.defaults.editors;
		for(var editor in editors){
			var opts = editors[editor];
			(function(){
				var init = opts.init;
				opts.init = function(container, options){
					var field = $(container).closest('td[field]').attr('field');
					var ed = getCacheEditor(container, field);
					if (ed.length){
						ed.appendTo(container);
						return ed.find('.datagrid-editable-input');
					} else {
						return init(container, options);
					}
				}
			})();
			(function(){
				var destroy = opts.destroy;
				opts.destroy = function(target){
					if ($(target).hasClass('datagrid-editable-input')){
						var field = $(target).closest('td[field]').attr('field');
						setCacheEditor(target, field, $(target).parent().children());
					} else if (destroy){
						destroy(target);
					}
				}
			})();
		}
	})(jQuery);
</script>
<script type="text/javascript">
	var editIndex = undefined;
	function endEditingCacheEditor(){
		if (editIndex == undefined){return true}
		if ($('#dgCacheEditor').datagrid('validateRow', editIndex)){
			var ed = $('#dgCacheEditor').datagrid('getEditor', {index:editIndex,field:'productid'});
			var productname = $(ed.target).combobox('getText');
			$('#dgCacheEditor').datagrid('getRows')[editIndex]['productname'] = productname;
			$('#dgCacheEditor').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function onClickRowCacheEditor(index){
		if (editIndex != index){
			if (endEditingCacheEditor()){
				$('#dgCacheEditor').datagrid('selectRow', index).datagrid('beginEdit', index);
				editIndex = index;
			} else {
				$('#dgCacheEditor').datagrid('selectRow', editIndex);
			}
		}
	}
	function acceptCacheEditor(){
		if (endEditingCacheEditor()){
			$('#dgCacheEditor').datagrid('acceptChanges');
		}
	}
	function rejectCacheEditor(){
		$('#dgCacheEditor').datagrid('rejectChanges');
		editIndex = undefined;
	}
	function getChangesCacheEditor(){
		var rows = $('#dgCacheEditor').datagrid('getChanges');
		alert(rows.length+' rows are changed!');
	}
</script>

<!--数据表格单元格风格  -->
<h2>DataGrid Cell Style:数据表格单元格风格</h2>
<p>The cells which listprice value is less than 30 are highlighted.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="DataGrid Cell Style" style="width:700px;height:250px"
		data-options="
			singleSelect: true,
			iconCls: 'icon-save',
			url: '${base}/resources/json/datagrid_data1.json',
			method: 'get'
		">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right',styler:cellStyler">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<script type="text/javascript">
	function cellStyler(value,row,index){
		if (value < 30){
			return 'background-color:#ffee00;color:red;';
		}
	}
</script>

<!-- 数据表格的客户端分页 -->
<h2>Client Side Pagination in DataGrid:数据表格的客户端分页</h2>
<p>This sample shows how to implement client side pagination in DataGrid.</p>
<div style="margin:20px 0;"></div>

<table id="dgClientPagination" title="Client Side Pagination" style="width:700px;height:300px" data-options="
			rownumbers:true,
			singleSelect:true,
			autoRowHeight:false,
			pagination:true,
			pageSize:10">
	<thead>
		<tr>
			<th field="inv" width="80">Inv No</th>
			<th field="date" width="100">Date</th>
			<th field="name" width="80">Name</th>
			<th field="amount" width="80" align="right">Amount</th>
			<th field="price" width="80" align="right">Price</th>
			<th field="cost" width="100" align="right">Cost</th>
			<th field="note" width="110">Note</th>
		</tr>
	</thead>
</table>
<script>
	function getData(){
		var rows = [];
		for(var i=1; i<=800; i++){
			var amount = Math.floor(Math.random()*1000);
			var price = Math.floor(Math.random()*1000);
			rows.push({
				inv: 'Inv No '+i,
				date: $.fn.datebox.defaults.formatter(new Date()),
				name: 'Name '+i,
				amount: amount,
				price: price,
				cost: amount*price,
				note: 'Note '+i
			});
		}
		return rows;
	}
	
	function pagerFilter(data){
		if (typeof data.length == 'number' && typeof data.splice == 'function'){	// is array
			data = {
				total: data.length,
				rows: data
			}
		}
		var dg = $(this);
		var opts = dg.datagrid('options');
		var pager = dg.datagrid('getPager');
		pager.pagination({
			onSelectPage:function(pageNum, pageSize){
				opts.pageNumber = pageNum;
				opts.pageSize = pageSize;
				pager.pagination('refresh',{
					pageNumber:pageNum,
					pageSize:pageSize
				});
				dg.datagrid('loadData',data);
			}
		});
		if (!data.originalRows){
			data.originalRows = (data.rows);
		}
		var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
		var end = start + parseInt(opts.pageSize);
		data.rows = (data.originalRows.slice(start, end));
		return data;
	}
	
	$(function(){
		$('#dgClientPagination').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData());
	});
</script>

<!-- 数据表格复杂工具栏 -->
<h2>DataGrid Complex Toolbar:数据表格复杂工具栏</h2>
<p>The DataGrid toolbar can be defined from a <div/> markup, so you can define the layout of toolbar easily.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="DataGrid Complex Toolbar" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,url:'${base}/resources/json/datagrid_data1.json',method:'get',toolbar:'#tbComplexToolbar'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:240">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<div id="tbComplexToolbar" style="padding:5px;height:auto">
	<div style="margin-bottom:5px">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"></a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"></a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true"></a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true"></a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"></a>
	</div>
	<div>
		Date From: <input class="easyui-datebox" style="width:80px">
		To: <input class="easyui-datebox" style="width:80px">
		Language: 
		<select class="easyui-combobox" panelHeight="auto" style="width:100px">
			<option value="java">Java</option>
			<option value="c">C</option>
			<option value="basic">Basic</option>
			<option value="perl">Perl</option>
			<option value="python">Python</option>
		</select>
		<a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
	</div>
</div>

<!-- 自定义数据表格分页 -->
<h2>Custom DataGrid Pager:自定义数据表格分页</h2>
<p>You can append some buttons to the standard datagrid pager bar.</p>
<div style="margin:20px 0;"></div>
<table id="dgCustomDataGrid" title="Custom DataGrid Pager" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,pagination:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:240">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<script type="text/javascript">
	$(function(){
		var pager = $('#dgCustomDataGrid').datagrid().datagrid('getPager');	// get the pager of datagrid
		pager.pagination({
			buttons:[{
				iconCls:'icon-search',
				handler:function(){
					alert('search');
				}
			},{
				iconCls:'icon-add',
				handler:function(){
					alert('add');
				}
			},{
				iconCls:'icon-edit',
				handler:function(){
					alert('edit');
				}
			}]
		});			
	})
</script>

<!-- 数据表格的尾行 -->
<h2>Footer Rows in DataGrid:数据表格的尾行</h2>
<p>The summary informations can be displayed in footer rows.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="Footer Rows in DataGrid" style="width:700px;height:220px"
		data-options="
			url: '${base}/resources/json/datagrid_data2.json',
			method: 'get',
			fitColumns: true,
			singleSelect: true,
			rownumbers: true,
			showFooter: true
		">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:120">Product ID</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 数据表格的固定列 -->
<h2>Frozen Columns in DataGrid:数据表格的固定列</h2>
<p>You can freeze some columns that can't scroll out of view.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="Frozen Columns in DataGrid" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead data-options="frozen:true">
		<tr>
			<th data-options="field:'itemid',width:100">Item ID</th>
			<th data-options="field:'productid',width:120">Product</th>
		</tr>
	</thead>
	<thead>
		<tr>
			<th data-options="field:'listprice',width:90,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:90,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 数据表格合并单元格 -->
<h2>Merge Cells for DataGrid:数据表格合并单元格</h2>
<p>Cells in DataGrid body can be merged.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="Merge Cells for DataGrid" style="width:700px;height:250px"
		data-options="
			rownumbers: true,
			singleSelect: true,
			iconCls: 'icon-save',
			url: '${base}/resources/json/datagrid_data1.json',
			method: 'get',
			onLoadSuccess: onLoadSuccess
		">
	<thead>
		<tr>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:240">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<script type="text/javascript">
	function onLoadSuccess(data){
		var merges = [{
			index: 2,
			rowspan: 2
		},{
			index: 5,
			rowspan: 2
		},{
			index: 7,
			rowspan: 2
		}];
		for(var i=0; i<merges.length; i++){
			$(this).datagrid('mergeCells',{
				index: merges[i].index,
				field: 'productid',
				rowspan: merges[i].rowspan
			});
		}
	}
</script>

<!-- 数据表格的行边距 -->
<h2>Row Border in DataGrid:数据表格的行边距</h2>
<p>This sample shows how to change the row border style of datagrid.</p>
<div style="margin:20px 0;">
	<span>Border:</span>
	<select onchange="changeBorder(this.value)">
		<option value="lines-both">Both</option>
		<option value="lines-no">No Border</option>
		<option value="lines-right">Right Border</option>
		<option value="lines-bottom">Bottom Border</option>
	</select>
	<span>Striped:</span>
	<input type="checkbox" onclick="$('#dg').datagrid({striped:$(this).is(':checked')})">
</div>
<table id="dgRowBorder" class="easyui-datagrid" title="Row Border in DataGrid" style="width:700px;height:250px"
		data-options="singleSelect:true,fitColumns:true,url:'${base}/resources/json/datagrid_data1.json',method:'get'">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<script type="text/javascript">
	function changeBorder(cls){
		$('#dgRowBorder').datagrid('getPanel').removeClass('lines-both lines-no lines-right lines-bottom').addClass(cls);
	}
</script>
<style type="text/css">
	.lines-both .datagrid-body td{
	}
	.lines-no .datagrid-body td{
		border-right:1px dotted transparent;
		border-bottom:1px dotted transparent;
	}
	.lines-right .datagrid-body td{
		border-bottom:1px dotted transparent;
	}
	.lines-bottom .datagrid-body td{
		border-right:1px dotted transparent;
	}
</style>

<!-- 数据表格的行风格 -->
<h2>DataGrid Row Style:数据表格的行风格</h2>
<p>The rows which listprice value is less than 30 are highlighted.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="DataGrid Row Style" style="width:700px;height:250px"
		data-options="
			singleSelect: true,
			iconCls: 'icon-save',
			url: '${base}/resources/json/datagrid_data1.json',
			method: 'get',
			rowStyler: function(index,row){
				if (row.listprice < 30){
					return 'background-color:#6293BB;color:#fff;font-weight:bold;';
				}
			}
		">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:250">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>

<!-- 带工具栏的数据表格 -->
<h2>DataGrid with Toolbar:带工具栏的数据表格</h2>
<p>Put buttons on top toolbar of DataGrid.</p>
<div style="margin:20px 0;"></div>
<table class="easyui-datagrid" title="DataGrid with Toolbar" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,url:'${base}/resources/json/datagrid_data1.json',method:'get',toolbar:toolbar">
	<thead>
		<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:240">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
		</tr>
	</thead>
</table>
<script type="text/javascript">
	var toolbar = [{
		text:'Add',
		iconCls:'icon-add',
		handler:function(){alert('add')}
	},{
		text:'Cut',
		iconCls:'icon-cut',
		handler:function(){alert('cut')}
	},'-',{
		text:'Save',
		iconCls:'icon-save',
		handler:function(){alert('save')}
	}];
</script>