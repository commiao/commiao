<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript" src="${base}/resources/js/commiao.js"></script>
<link href="${base}/resources/plug-in/fineuploader5/fineuploader-5.0.2.css" rel="stylesheet"/>  
<script src="${base}/resources/plug-in/fineuploader5/fineuploader-5.0.2.js" type="text/javascript"></script> 
<script type="text/javascript">
 
var submitFile = false;//用于控制仅在”提交“按钮按下时提交文件  
var uploader = null;  
function createUploader() {  
    uploader = new qq.FineUploader({  
        element: document.getElementById('fine-uploader'),  
        autoUpload: false,  
            request: {  
                endpoint: '${base}/file/upload?path=test/'  			//处理文件上传的action
            },
            deleteFile: {  
                enabled: true,  
                endpoint: '${base}/manage/Bulletin?op=del',  
                method: 'POST',  
                forceConfirm: true,  
                confirmMessage: '确定要删除文件 {filename} 吗？ 不可恢复！！',  
                deletingFailedText: '删除失败！'  
            },  
            editFilename: {  
                   enabled: false  
            },  
            callbacks: {  
                onAllComplete:  function(successIDs, failIDs)  {  
                    if(submitFile)  
                        submitdata(successIDs);  
                }  
            }  
    });
    document.getElementById('up_btn').onclick = function () {
    	uploader.uploadStoredFiles();
    };
}    

window.onload = createUploader;

</script>

<script type="text/template" id="qq-template">  
  <div class="qq-uploader-selector qq-uploader">  
    <div class="qq-upload-button-selector qq-upload-button">  
      <div>上传附件</div>  
    </div>  
    <ul class="qq-upload-list-selector qq-upload-list">  
      <li>  
        <div class="qq-progress-bar-container-selector">  
          <div class="qq-progress-bar-selector qq-progress-bar"></div>  
        </div>  
        <span class="qq-upload-spinner-selector qq-upload-spinner"></span>  
        <span class="qq-edit-filename-icon-selector qq-edit-filename-icon"></span>  
        <span class="qq-upload-file-selector qq-upload-file"></span>  
        <span class="qq-upload-size-selector qq-upload-size"></span>  
        <a class="qq-upload-cancel-selector qq-upload-cancel" href="#">放弃上传</a>  
        <a class="qq-upload-retry-selector qq-upload-retry" href="#">Retry</a>  
        <a class="qq-upload-delete-selector qq-upload-delete" href="#">删除</a>  
        <span class="qq-upload-status-text-selector qq-upload-status-text"></span>  
      </li>  
    </ul>  
  </div>  
</script> 

<div id="main" class="easyui-layout" data-options="fit:true,border:false" style="width:100%;height:100%;">
	<div data-options="region:'north',title:'查询条件',split:true,border:false" style="height:100px;">
		<div>     
	    <form id="filesearchForm" method="post">
	    	<table>
	    		<tr>
	    			<td><a href="javascript:createUploader();">关键字:</a></td>
	    			<td><input class="easyui-textbox" data-options="prompt:'请输入关键字'" name="nickname" style="width:100%;height:22px"></td>
	    			<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="search_find(option);">查询</a></td>
	    			<td><a href="javascript:;" class="easyui-linkbutton" data-options="iconCls:'icon-clear',plain:true" onclick="search_clear(option);">重置</a></td>
	    		</tr>
	    	</table>
	    </form>
	    </div>
	</div>
	<div data-options="region:'center',border:false">
	    		<div id="fine-uploader"></div><div><input id="up_btn" type="button" value="test"/></div>
	</div>
</div>