<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var ="tid" value="3"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="${ctx}lyun/css/company.css" rel="stylesheet" type="text/css"/>

</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	<!--面包屑开始 -->
	<div class="breads comWidth"><a href="${ctx }toAboutPage.action?aboutType=0" title="">关于我们</a><span>&gt;<span><a href="javascript:;" title="" class="current_page">联系我们</a></span></span></div>
	
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
					<li class="obout_txt"><a href="toAboutPage?aboutType=3">行业资讯</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=3">公司公告</a></li>
					<li class="obout_txt active"><a href="toAboutPage.action?aboutType=5">联系我们</a></li>
				</ul>
			</div>
		</div>
		<!--right-->
		<div class="company_box_right fr">
			<div class="contact">
				<div class="contact_con">
					<!--客户服务-->
					<div class="contact_top b1">
						<h3 class="contact_top_title">客户服务</h3>
						<p class="contact_top_txt">客服电话：<span>4006-676-888</span>（工作日09:00-18:00）</p>
					</div>
					<!--商务合作-->
					<div class="contact_top b2">
					<h3 class="contact_top_title">商务合作</h3>
					<p class="contact_top_txt">商务合作请联系：<span>010-57684300-330</span>，电子邮箱：<span>bd@lvjinsuo.com</span></p>
				</div>
					<!--企业融资-->
					<div class="contact_top b3">
						<h3 class="contact_top_title">我要融资</h3>
						<p class="contact_top_txt">如果您希望得到融资服务，您可以访问网站进行<a href="${ctx}toQiyePage.action"><font color=blue>线上申请</font></a>。</p>
					</div>
					<!--其他方式-->
					<div class="contact_top b4">
					<h3 class="contact_top_title">其他方式</h3>
					<p class="contact_top_txt">您还可以通过关注我们<span>官方微信</span>，新浪微博的方式联系我们。</p>
				</div>
					<!--微信-->
					<div class="wechat clearfix">
						<div class="wechat_box fl">
							<img src="${ctx}lyun/imgs/bg12.png" alt="律金所官方微信">
							<p class="wechat_txt">律金所官方微信</p>
						</div>
						<div class="wechat_box fl">
							<img src="${ctx}lyun/imgs/bg13.png" alt="律金所官方微博">
							<p class="wechat_txt">律金所官方微博</p>
						</div>
					</div>
				</div>
				<div class="contact_addressbox">
					<h3 class="contact_address">联系地址</h3>
					<div class="adress_con">
						<div class="address_sh">
							<span class="circle"></span>
							<h3 class="title_sh">上海总公司</h3>
							<p class="txt_sh">上海市闸北区裕通路100号洲际商务中心15、16层，200070</p>
						</div>
						<div class="address_sh">
							<span class="circle"></span>
							<h3 class="title_sh">北京分公司</h3>
							<p class="txt_sh">北京市朝阳区东四环中路76号大成国际中心C座5层，100124</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>

