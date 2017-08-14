<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var ="tid" value="5"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE%></title>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx}lyun/css/company.css" rel="stylesheet" type="text/css"/>
</head>

<body>
	<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
	<!--面包屑开始 -->
	<div class="breads comWidth"><a href="/toAboutPage.action?aboutType=0" title="">关于我们</a><span>&gt;<span><a href="/noticeList" title="" class="current_page">公司公告</a></span>&gt;<span><a href="javascript:;" title="" class="current_page">${notice.title }</a></span></span></div>	
	<!--面包屑结束 -->
	<div class="company comWidth">
		<div class="company_box clearfix">
			<!--left-->
			<div class="company_box_left fl">
				<div class="company_box_leftbox">
					<h3 class="obout_title">关于律金所</h3>
					<ul class="">
						<li class="obout_txt"><a href="toAboutPage.action?aboutType=0">公司简介</a></li>
						<li class="obout_txt"><a href="toAboutPage.action?aboutType=1">合作机构</a></li>
						<li class="obout_txt"><a href="toAboutPage.action?aboutType=2">招贤纳士</a></li>
						<li class="obout_txt"><a href="toAboutPage?aboutType=3">行业资讯</a></li>
						<li class="obout_txt active"><a href="noticeList">公司公告</a></li>
						<li class="obout_txt"><a href="toAboutPage.action?aboutType=5">联系我们</a></li>
					</ul>
				</div>
			</div>
			<!--right-->
			<div class="annount fr cor666">
				<div class="annount_main">
					<h1 class="count_title">${notice.title }</h1>
					<span class="count_time"><fmt:formatDate value="${notice.createTime }" pattern="yyyy-MM-dd" /></span>
				</div>
				<div class="annount_text">
					<p>${notice.content }</p>
				</div>
			</div>
		</div>
	</div>
	
	<%--
	<div class="main clearfix">
		<%@ include file="/WEB-INF/jsp/front/introductions/menu.jsp"%>
		<div class="safe_right">
			<div class="tit_text"
				style="margin-top: 30px; margin-left: 10px; margin-bottom: 10px; font-size: 18px">公司公告</div>
			<div style="clear: both;"></div>
			<div class="ac_right clearfix">
				<div class="news_tit black" style="font-size: 18px">${notice.title }</div>
				<br />
				<span class="fr" style="padding-right: 15px;"><fmt:formatDate
						value="${notice.createTime }" pattern="yyyy-MM-dd" /></span>
				<br />
				<div style="padding-left: 15px;font-size: 15px;padding-right: 15px;">
				<p style="font-size: 15px;">${notice.content }</p></div>
			</div>
		</div>
	</div>
	 --%>
	<!--===========foot============-->
	<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>
