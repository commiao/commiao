<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">
function validateOnsubmit() {
	
	return true;
}
</script>
<div id="userinputId" class="easyui-dialog" data-options="closed:true,
													modal:true,
													cache: false,
													title:'新建用户',
									                buttons:[
									                {text:'保存',iconCls:'icon-ok',handler : function() {submit(option);}},
									                {text:'取消',iconCls:'icon-clear',handler : function() {cancel(option);}}
									                ]" style="width: 600px;height: 400px;">
	<form id="userinputForm" method="post" style="width: 95%;margin: 0px auto;" >
		<input type="hidden" name="userId" />
		<table >
			<tr>
    			<td>用户名:</td>
    			<td><input class="easyui-textbox" data-options="prompt:'英文登录名'" name="nickname" style="width:100%;height:22px"></td>
    		</tr>
    		<tr>
    			<td>密码:</td>
    			<td><input class="easyui-textbox"  name="password" style="width:100%;height:22px"></td>
    		</tr>
		</table>
	</form>
</div>