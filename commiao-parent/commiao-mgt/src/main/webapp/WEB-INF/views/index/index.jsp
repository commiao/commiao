<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信风控系统</title>
<link rel="stylesheet" type="text/css" href="${base}/resources/css/index.css"/>
<script type="text/javascript" src="${base}/resources/plug-in/jquery-easyui-1.4.3/jquery.min.js"></script>
<script language="javascript"> 

function login(){
	if($("input[name='username']").val()==""){
		$("#errorMsg").text("请输入用户名！");
		$("input[name='username']").focus();
		return;
	}
	if($("input[name='password']").val() == ""){
		$("#errorMsg").text("请输入密码！");
		$("input[name='password']").focus();
		return;
	}
	if ($("input[name='checkcode']").val() ==""){
       $("#errorMsg").text("请输入您的验证码！");
       $("input[name='checkcode']").focus();
       return;
    }
	$("form[name='Login']").submit();
}

/**
 * 验证码图片的更新
 * add by 郑金平（2016-01-12）
 */
function updateyzm(){   
  document.getElementById('yzmdiv').style.display='';
  document.Login.checkcode.select();
  document.Login.yzm.width="60";
  var d;
  d=new Date();
  document.Login.yzm.src="${base}/resources/jsp/numberImage.jsp?t="+d.toLocaleString();
}

</script>
</head>

<body class="LoginBody">
	<form name="Login" action="${base }/login" method="post" >
		<table align="center" cellpadding="0" cellspacing="0" border="0" width="592" height="660" class="LoginContent">
			<tr>
				<td width="184" height="222"></td>
				<td colspan="5"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td nowrap="nowrap" colspan="5"><span style="margin-left: 40px;"><font color="red" id="errorMsg">${errorMsg }</font></span></td>
			</tr>
			<tr>
				<td align="right">用户名：</td>
			  	<td height="58" colspan="5"><input class="LoginContentInput" value="${nickname }" name="nickname" type="text" style="width:220px; height:28px; font-size:18px;"  onMouseOver="this.style.background='#fdf9ba';" onMouseOut="this.style.background='#ebebeb'" onFocus="this.select();"/></td>
			</tr>
			<tr>
				<td align="right">密　码：</td>
				<td height="42" colspan="5"><input class="LoginContentInput" value="${password }"  name="password" type="password" style="width:220px; height:28px; font-size:18px;"  onMouseOver="this.style.background='#fdf9ba';" onMouseOut="this.style.background='#ebebeb'" onFocus="this.select();"/></td>
			</tr>
			<tr>
				<td align="right">验证码：</td>
				<td height="56" colspan="5">
				  <table cellpadding="0" cellspacing="0">
				   <tr>
					 <td><input class="LoginContentInput" type="text" name="checkcode" size="4" style="height:22px; font-size:18px;"  onMouseOver="this.style.background='#fdf9ba';" onMouseOut="this.style.background='#ebebeb'"/></td>
					 <td width="5px"></td>
					 <td id="yzmdiv" align="center" style="background:#f0f0f0;">
					 	<img name="yzm" align="middle" alt="验证码" width="60" height="20" src="${base}/resources/jsp/numberImage.jsp"/>
						<a href="javascript:;" onclick="updateyzm();">换一张</a>
					</td>
				   </tr>
				  </table>
			  </td>
			</tr>
			<tr>
				<td></td>
				<td height="50" colspan="5">
					<!-- html中 image的描述是“创建一个图像控件，该控件单击后将导致表单立即被提交” add by 郑金平（2016-01-12） -->
					<input type="button" onclick="javascript:login();" style="background:url('${base}/resources/images/index/ok.jpg') no-repeat; border:none; color:#f00; height:37px; width:124px; cursor:pointer;"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td width="65" height="72"></td>
			  	<td width="158"></td>
				<td width="185"></td>
			</tr>
			<tr>
				<td></td>
				<td height="31" colspan="5"></td>
			</tr>
			<tr>
				<td height="125" colspan="6"></td>
			</tr>
		</table>
	</form>
</body>
</html>