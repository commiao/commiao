<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript" src="${base}/resources/js/easyui_help.js"></script>
<script type="text/javascript">
var option={};
$(document).ready(function(){
    option.id= '{CLASS_NAME}'
	option.idField= '{PRIMARY_NAME}'
	option.columns=[ [ 
		{field:'ck',checkbox:true,formatter:function(value,row,index){return row.idField;}},   
	        {field:'{PRIMARY_NAME}',title:'主键',width:8}   
	    ]]
  	option.url_list= '${base}/{POJO_BAG}/{VIEW_BAG}/datagrid'
    hxja.list(option);
});
</script>
<div id="main" class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'north',title:'查询条件',split:true,border:false" style="height:100px;">
		<div>     
	    <form id="{CLASS_NAME}searchForm" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>关键字:</td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入关键字'" name="{PRIMARY_NAME}" style="width:100%;height:22px"></td>
	    			<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="search_find(option);">查询</a></td>
	    			<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-clear',plain:true" onclick="search_clear(option);">重置</a></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>
	</div>
	<div data-options="region:'center',border:false">
		<table id="{CLASS_NAME}listId">
		</table>
	</div>
</div>