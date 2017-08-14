<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>错误页面</title>
<style type="text/css">
/*404*/
.er_404{
	width:800px;
	height:400px;
	background:url(${ctx}images/404.gif) no-repeat 0 0;
	position:relative;
	margin:200px auto 0;
	font-size:14px;
	color:#4d4d4d;
}
.er_not{
	width:300px;
	position:absolute;
	top:135px;
	left:420px;
	display:block;
}
.er_btn {
	width:250px;
	position:absolute;
	height:33px;
	left:420px;
	top:205px;
}
.er_retern{
	background:url(${base}/resources/csimages/404btn.gif) no-repeat 0 0;
	width:112px;
	height:33px;
	cursor:pointer;
}
.er_retern_index{
	background:url(${base}/resources/csimages/404btn1.gif) no-repeat 0 0;
}
.er_foot{
	width:400px;
	position:absolute;
	bottom:17px;
	left:226px;
}
/*404_1*/
.er_404_1{
	width:900px;
	height:600px;
	background:url(${base}/resources/csimages/4041.gif) no-repeat 0 0;
}
.er_btn1 {
	top:395px;
	left:438px;
}
.er_not1{
	top:455px;
	left:438px;
	line-height:26px;
}
</style>
<script type="text/javascript">
	$(function() {
		window.setTimeout(function() {
			window.location.href = "${base}/login/index";
		}, 3000);
	});
</script>
</head>
<body style="background-color:#282828;">
<div class="er_404 er_404_1">
	<div class="er_not er_not1">
    	如需客服帮忙，请选择以下联系方式：<br />
		客服热线：400-888-8888<br />
		联系Q Q：5845698
    </div>	
    <div class="er_btn er_btn1">
    	<input type="button" name="" value="" class="er_retern"  onclick="history.go(-1);"/>&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" name="" value="" class="er_retern er_retern_index" onclick="window.location.href='${base }/login/index'"/>
    </div>
</div>
</body>
</html>
