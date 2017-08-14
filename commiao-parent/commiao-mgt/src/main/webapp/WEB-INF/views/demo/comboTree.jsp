<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 基本组合树 -->
<h2>Basic ComboTree:基本组合树</h2>
<p>Click the right arrow button to show the tree panel.</p>
<div style="margin:20px 0"></div>
<input class="easyui-combotree" data-options="url:'${base}/resources/json/tree_data1.json',method:'get',required:true" style="width:200px;">

<!--流式组合树  -->
<h2>Fluid ComboTree:流式组合树</h2>
	<p>This example shows how to set the width of ComboTree to a percentage of its parent container.</p>
	<div style="margin:20px 0"></div>
	<p>width: 50%</p>
	<input class="easyui-combotree" value="122" data-options="url:'${base}/resources/json/tree_data1.json',method:'get'" style="width:50%;">
	<p>width: 30%, height: 26px</p>
	<input class="easyui-combotree" value="124" data-options="url:'${base}/resources/json/tree_data1.json',method:'get'" style="width:30%;height:26px">

<!--多个组合树  -->
<h2>Multiple ComboTree:多个组合树</h2>
<p>Click the right arrow button to show the tree panel and select multiple nodes.</p>
<div style="margin:20px 0">
	<span>Cascade Check: </span>
	<input type="checkbox" checked onclick="$('#cc2').combotree({cascadeCheck:$(this).is(':checked')})">
</div>
<select id="cc2" class="easyui-combotree" data-options="url:'${base}/resources/json/tree_data1.json',method:'get'" multiple style="width:200px;"></select>

<!-- 组合树的初始化 -->
<h2>Initialize Value for ComboTree:组合树的初始化</h2>
<p>Initialize Value when ComboTree is created.</p>
<div style="margin:20px 0"></div>
<input class="easyui-combotree" value="122" data-options="url:'${base}/resources/json/tree_data1.json',method:'get',required:true" style="width:200px;">

<!-- 组合树控制 -->
<h2>ComboTree Actions:组合树控制</h2>
<p>Click the buttons below to perform actions</p>
<div style="margin:20px 0">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="getValue()">GetValue</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="setValue()">SetValue</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="disable()">Disable</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="enable()">Enable</a>
</div>
<input id="cc1" class="easyui-combotree" data-options="url:'${base}/resources/json/tree_data1.json',method:'get',required:true" style="width:200px;">
<script type="text/javascript">
	function getValue(){
		var val = $('#cc1').combotree('getValue');
		alert(val);
	}
	function setValue(){
		$('#cc1').combotree('setValue', '15');
	}
	function disable(){
		$('#cc1').combotree('disable');
	}
	function enable(){
		$('#cc1').combotree('enable');
	}
</script>