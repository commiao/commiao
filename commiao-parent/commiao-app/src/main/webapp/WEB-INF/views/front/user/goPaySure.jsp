<%@page import="com.zkbc.front.mycenter.moneymgmt.GopayConfig"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<title>跳转第三方支付</title>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/center.css" rel="stylesheet" type="text/css"/>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>

<style type="text/css">
html,body {
	margin: 0px;
	height: 100%;
}

.redirect {
	width: 30%;
	height: 30%;
	font-size: 14px;
	color: #595959;
	text-align: center;
	font-family: "Microsoft Yahei";
	padding-left: 35%;
	padding-right: 35%;
	padding-top: 15%;
}
</style>

</head>

<body>
<div id="myDiv">
	<div id="content" style="text-align: center;">
	  <form action="${action}" method="post" name="myform">
	  <c:if test="${pMerCode!=null&&pMerCode!='' }">
	  	  	<input type="hidden" name="pMerCode" value="${pMerCode }"/>
           	<input type="hidden" name="p3DesXmlPara" value="${p3DesXmlPara }"/>
           	<input type="hidden" name="pSign" value="${pSign}" />
	  </c:if>
	  	  <c:if test="${argMerCode!=null&&argMerCode!='' }">
	  
	  	<input type="hidden" name="argMerCode" value="${argMerCode }"/>
           	<input type="hidden" name="arg3DesXmlPara" value="${arg3DesXmlPara }"/>
           	<input type="hidden" name="argSign" value="${argSign}" />
           		  </c:if>
      </form>
      <div class="redirect">
        <div class="ajaxLoadDiv" style="height:20px"></div>
        <p class="">正在转向第三方支付页面……</p>
      </div>
	</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			//alert($('form[name="myform"]').attr('action'));
			$('form[name="myform"]').submit();
		});
	</script>
</body>
</html>