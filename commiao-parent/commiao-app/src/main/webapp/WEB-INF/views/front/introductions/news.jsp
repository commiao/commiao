<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript">
	function topage(pageNow) {
		var form = document.forms["noticeForm"];
		form.page.value = pageNow;
		form.submit();
	}
</script>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	<!--面包屑开始 -->
		<div class="breadcrumbs_main">
			<div class="breadcrumbs_div">
				<a href="${ctx }toAboutPage.action?aboutType=0"><img src="${ctx}images/home.png" class="breadcrumbs_img" /></a>
				<span class="breadcrumbs_text" style="position: relative;top:10px;">关于我们 > 公司公告</span>
			</div>
		</div>
		<!--面包屑结束 -->
	<div class="main clearfix">
		<!--出借人账户首页-->
		<!-- 二级菜单 -->
		<!--  -->
		<div class="safe_right">
<!-- 			<h1 class="tit_h1"> -->
<!-- 				<div class="tit_text">公司公告</div> -->
<!-- 			</h1> -->
			<div style="clear: both;"></div>
			<div class="ac_right txt clearfix">
				<form action="${ctx }toAboutPage?aboutType=3" method="post"
					name="noticeForm" id="noticeForm">
					<c:forEach items="${pageView.voList }" var="data">
						<p class="partners_p">
							<span class="f18 fw orange in_tit"><a
								href="${ctx }noticeDetails?id=${data.id}">${data.title }</a></span><br />
							&nbsp;&nbsp;&nbsp;&nbsp;
							<c:if test="${fn:length(data.content)>60 }">
		        		${fn:substring(data.content , 0, 60)}......
		        	</c:if>
							<c:if test="${fn:length(data.content)<=60 }">
		        		${data.content }
		        	</c:if>
						</p>
					</c:forEach>

				</form>
			</div>
		</div>
	</div>
	<!--===========foot============-->
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>

