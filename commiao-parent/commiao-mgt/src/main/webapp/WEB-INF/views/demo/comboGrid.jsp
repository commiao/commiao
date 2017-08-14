<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 基础组合表格 -->
<h2>Basic ComboGrid:基础组合表格</h2>
<p>Click the right arrow button to show the DataGrid.</p>
<div style="margin:20px 0"></div>
<select class="easyui-combogrid" style="width:250px" data-options="
		panelWidth: 500,
		idField: 'itemid',
		textField: 'productname',
		url: '${base}/resources/json/datagrid_data1.json',
		method: 'get',
		columns: [[
			{field:'itemid',title:'Item ID',width:80},
			{field:'productname',title:'Product',width:120},
			{field:'listprice',title:'List Price',width:80,align:'right'},
			{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
			{field:'attr1',title:'Attribute',width:200},
			{field:'status',title:'Status',width:60,align:'center'}
		]],
		fitColumns: true
	">
</select>

<!-- 流式组合表格 -->
<h2>Fluid ComboGrid:流式组合表格</h2>
<p>This example shows how to set the width of ComboGrid to a percentage of its parent container.</p>
<div style="margin:20px 0"></div>
<p>width: 50%</p>
<select class="easyui-combogrid" style="width:50%" data-options="
		panelWidth: 500,
		panelMinWidth: '50%',
		idField: 'itemid',
		textField: 'productname',
		url: '${base}/resources/json/datagrid_data1.json',
		method: 'get',
		columns: [[
			{field:'itemid',title:'Item ID',width:80},
			{field:'productname',title:'Product',width:120},
			{field:'listprice',title:'List Price',width:80,align:'right'},
			{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
			{field:'attr1',title:'Attribute',width:200},
			{field:'status',title:'Status',width:60,align:'center'}
		]],
		fitColumns: true
	">
</select>
<p>width: 30%</p>
<select class="easyui-combogrid" style="width:30%" data-options="
		panelWidth: 500,
		idField: 'itemid',
		textField: 'productname',
		url: '${base}/resources/json/datagrid_data1.json',
		method: 'get',
		columns: [[
			{field:'itemid',title:'Item ID',width:80},
			{field:'productname',title:'Product',width:120},
			{field:'listprice',title:'List Price',width:80,align:'right'},
			{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
			{field:'attr1',title:'Attribute',width:200},
			{field:'status',title:'Status',width:60,align:'center'}
		]],
		fitColumns: true
	">
</select>

<!--多行组合表格 -->
<h2>Multiple ComboGrid:多行组合表格</h2>
<p>Click the right arrow button to show the DataGrid and select items.</p>
<div style="margin:20px 0"></div>
<select class="easyui-combogrid" style="width:250px" data-options="
		panelWidth: 500,
		multiple: true,
		idField: 'itemid',
		textField: 'productname',
		url: '${base}/resources/json/datagrid_data1.json',
		method: 'get',
		columns: [[
			{field:'ck',checkbox:true},
			{field:'itemid',title:'Item ID',width:80},
			{field:'productname',title:'Product',width:120},
			{field:'listprice',title:'List Price',width:80,align:'right'},
			{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
			{field:'attr1',title:'Attribute',width:200},
			{field:'status',title:'Status',width:60,align:'center'}
		]],
		fitColumns: true
	">
</select>

<!--组合表格初始化  -->
<h2>Initialize Value for ComboGrid:组合表格初始化</h2>
<p>Initialize value when ComboGrid is created.</p>
<div style="margin:20px 0"></div>
<input class="easyui-combogrid" style="width:250px" value="EST-12" data-options="
		panelWidth: 500,
		idField: 'itemid',
		textField: 'productname',
		url: '${base}/resources/json/datagrid_data1.json',
		method: 'get',
		columns: [[
			{field:'itemid',title:'Item ID',width:80},
			{field:'productname',title:'Product',width:120},
			{field:'listprice',title:'List Price',width:80,align:'right'},
			{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
			{field:'attr1',title:'Attribute',width:200},
			{field:'status',title:'Status',width:60,align:'center'}
		]],
		fitColumns: true
	">
	
<!--导航组合表格  -->
<h2>Navigate ComboGrid:导航组合表格</h2>
<p>Navigate through grid items with keyboard to select an item.</p>
<div style="margin:20px 0">
	<input type="checkbox" checked onchange="$('#cc').combogrid({selectOnNavigation:$(this).is(':checked')})">
	<span>SelectOnNavigation</span>
</div>
<select id="cc" class="easyui-combogrid" style="width:250px" data-options="
		panelWidth: 500,
		idField: 'itemid',
		textField: 'productname',
		url: '${base}/resources/json/datagrid_data1.json',
		method: 'get',
		columns: [[
			{field:'itemid',title:'Item ID',width:80},
			{field:'productname',title:'Product',width:120},
			{field:'listprice',title:'List Price',width:80,align:'right'},
			{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
			{field:'attr1',title:'Attribute',width:200},
			{field:'status',title:'Status',width:60,align:'center'}
		]],
		fitColumns: true
	">
</select>

<!--组合表格控制  -->
<h2>ComboGrid Actions:组合表格控制</h2>
<p>Click the buttons below to perform actions.</p>
<div style="margin:20px 0">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="getValue()">GetValue</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="setValue()">SetValue</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="disable()">Disable</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="enable()">Enable</a>
</div>
<input id="cc1" class="easyui-combogrid" style="width:250px" data-options="
		panelWidth: 500,
		idField: 'itemid',
		textField: 'productname',
		url: '${base}/resources/json/datagrid_data1.json',
		method: 'get',
		columns: [[
			{field:'itemid',title:'Item ID',width:80},
			{field:'productname',title:'Product',width:120},
			{field:'listprice',title:'List Price',width:80,align:'right'},
			{field:'unitcost',title:'Unit Cost',width:80,align:'right'},
			{field:'attr1',title:'Attribute',width:200},
			{field:'status',title:'Status',width:60,align:'center'}
		]],
		fitColumns: true
	">
<script type="text/javascript">
	function getValue(){
		var val = $('#cc1').combogrid('getValue');
		alert(val);
	}
	function setValue(){
		$('#cc1').combogrid('setValue', 'EST-13');
	}
	function disable(){
		$('#cc1').combogrid('disable');
	}
	function enable(){
		$('#cc1').combogrid('enable');
	}
</script>