<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<link href="${base}/resources/plug-in/fineuploader5/fineuploader-5.0.2.css" rel="stylesheet"/>  
<script src="${base}/resources/plug-in/fineuploader5/fineuploader-5.0.2.js" type="text/javascript"></script> 
<script type="text/javascript">
var submitFile = false;//用于控制仅在”提交“按钮按下时提交文件  
var uploader = null;  
function createUploader() {  
    uploader = new qq.FineUploader({  
       	element		: document.getElementById('fine-uploader'),
       	multiple	: false, // 只能上传一个文件
       	autoUpload	: false,  
        request		: {  
            		  endpoint: '${base}/components/file/upload/save?savePath=test/'  	//处理文件上传的action
        },
        deleteFile	: {  
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
        callbacks	: {  
	        onComplete : function(id, fileName, responseJSON) {
				document.getElementById('fileManagerId').value=responseJSON.obj.id;
	        }
        }  
    });
    document.getElementById('up_btn').onclick = function () {
    	uploader.uploadStoredFiles();
    };
}    

function validateOnsubmit() {
	
	return true;
}

</script>
<div id="fileManagerinputId" class="easyui-dialog" data-options="closed:true,modal:true,cache: false,title:'上传文件',
									                buttons:[
									                {text:'保存',iconCls:'icon-ok',handler : function() {submit(option);}},
									                {text:'取消',iconCls:'icon-clear',handler : function() {cancel(option);}}
									                ]" style="width: 600px;height: 400px;">
	<div id="fine-uploader"></div>
	<div>
		<form id="fileManagerinputForm" method="post" style="width: 95%;margin: 0px auto;" >
			<input type="hidden" id="fileManagerId" name="id" value="" />
			文件标题：<input type="text" id="fileTitle" name="fileTitle" value=""/>
		</form>
	</div>
</div>
<script type="text/template" id="qq-template">  
  <div class="qq-uploader-selector qq-uploader">  
    <div class="qq-upload-button-selector qq-upload-button qq-upload-button-hover" style="float:left;">  
      <div>选择附件</div>
    </div>
	<div>
		<input type="button" style="margin-left:20px;background: #7DD43B;color: #FFF;border-bottom: 1px solid #DDD;width: 105px;padding: 7px 0;position: relative;" id="up_btn" value="开始上传"/>
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