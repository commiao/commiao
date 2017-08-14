<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var ="tid" value="3"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="${ctx}lyun/css/company.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function topage(pageNow) {
		var form = document.forms["listPost"];
		form.page.value = pageNow;
		form.submit();
	}
</script>
</head>
<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	<!--面包屑开始 -->
	<div class="breads comWidth"><a href="/toAboutPage.action?aboutType=0" title="">关于我们</a><span>&gt;<span><a href="javascript:;" title="" class="current_page">行业资讯</a></span></span></div>	
	<!--面包屑结束 -->
	
	
<div class="company comWidth">
	<div class="company_box clearfix">
		<!--left-->
		<div class="company_box_left fl">
			<div class="company_box_leftbox">
				<h3 class="obout_title">关于泽一贷</h3>
				<ul class="">
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=0">公司简介</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=1">合作机构</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=2">招贤纳士</a></li>
					<li class="obout_txt active"><a href="toAboutPage?aboutType=3">行业资讯</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=3">公司公告</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=5">联系我们</a></li>
				</ul>
			</div>
		</div>
		<!--right-->
		<div class="annount fr">
			<h3 class="annount_title">行业资讯</h3>
			<form action="${ctx }toAboutPage?aboutType=3" method="post" name="listPost" id="listPost">
				<div class="acount_list">
					<ul>
						<c:forEach items="${pageView.voList }" var="data" varStatus="s">
							<li class="clearfix"><a href="${ctx }informationDetails?id=${data.id}" class="link_list fl">${data.title }</a><span class="time_list fr"><fmt:formatDate value="${data.createTime }" pattern="yyyy-MM-dd" /></span></li>
						</c:forEach>						
					</ul>
				</div>
			</form>
		</div>
	</div>
</div>
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
