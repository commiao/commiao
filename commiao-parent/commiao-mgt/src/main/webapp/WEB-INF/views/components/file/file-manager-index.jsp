<%@    page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript" src="${base}/resources/js/commiao.js"></script>
<script type="text/javascript">
var    option={};
$(document).ready(function(){
    option.id = 'fileManager';
	option.idField = 'id';
	option.columns = [    [    
		{field:'ck',checkbox:true,formatter:function(value,row,index){return row.idField;}},            
	          {field:'id',title:'文件ID',width:3},    
		        {field:'fileRealname',title:'存储名字',width:6}, 
		        {field:'filePath',title:'存储路径',width:8},
		        {field:'fileTitle',title:'文件标题',width:6}
	     ]];
    option.url_list= '${base}/components/file/manager/datagrid';
   	option.url_add= '${base}/components/file/manager/add'; 
   	option.url_edit= '${base}/components/file/manager/edit'; 
   	option.url_del= '${base}/components/file/manager/delete'; 
   	option.url_save='${base}/components/file/manager/save';
   	option.toolbar= [ { text : '上传',iconCls : 'icon-add',handler : function() {upload(option);} }, '-', 
					  { text : '修改',iconCls : 'icon-edit',handler : function() {edit(option);} }, '-', 
					  { text : '删除',iconCls : 'icon-remove',handler : function() {del(option);} },  '-'];
    list(option);
});
function upload(option){
	add(option);
	createUploader();
}
</script>
<div id="main" class="easyui-layout" data-options="fit:true,border:false" style="width: 100%; height: 100%;">
	<div data-options="region:'north',title:'查询条件',split:true,border:false" style="height: 100px;">
		<div>
			<form id="fileManagersearchForm" method="post">
				<table>
					<tr>
						<td>关键字:</td>
						<td><input class="easyui-textbox" data-options="prompt:'请输入关键字'" name="id" style="width: 100%; height: 22px"></td>
						<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="search_find(option);">查询</a></td>
						<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-clear',plain:true" onclick="search_clear(option);">重置</a></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div data-options="region:'center',border:false">
		<table id="fileManagerlistId">
		</table>
	</div>
</div>
<%@ include file="file-manager-add.jsp"%>	