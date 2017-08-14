<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var ="tid" value="3"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	 <!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	<div class="company comWidth">
	<div class="company_box clearfix">
		<!--left-->
		<div class="company_box_left fl">
			<div class="company_box_leftbox">
				<h3 class="obout_title">关于泽一贷</h3>
				<ul class="">
					<li class="obout_txt active"><a href="toAboutPage.action?aboutType=0">公司简介</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=1">合作机构</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=2">招贤纳士</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=3">行业资讯</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=4">公司公告</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=5">联系我们</a></li>
					<li class="obout_txt"><a href="javascript:back_index();">返回首页</a></li>
				</ul>
			</div>
		</div>
		<!--right-->
		<div class="company_box_right fr">
			<div class="company_box_rightbox">
				<div class="p_box">
					<p class="about_lvjinsuo">上海律金金融信息服务有限公司（律金所），依托与亚太地区规模最大律所—北京市盈科律师事务所战略合作，在各级领导的关怀下，于2014年在上海注册成立，注册资金为5000万元人民币，总部位于国际金融中心上海。</p>
					<p class="about_lvjinsuo">律金所采用P2B+O2O模式，结合金融全球化发展与信息技术创新，以专业律师为风控基础，独创融入式金融法律风险管控体系，为广大机构、企业及合格投资者提供专业、高效、安全的金融资产交易相关服务及投融资顾问服务，致力于通过优质服务及交易品种与交易组织模式的不断创新，提升交易效率，优化金融资产配置，成为中国领先并具有重要国际影响力的金融资产交易服务平台。</p>
				</div>
			</div>
			<div class="company_box_rightbox">
				<div class="p_box">
					<p class="about_lvjinsuo">律金所是一个互联网金融平台，从事网络借贷居间服务，面向个人投资者提供安全、便捷、透明、高收益的投资理财项目。利用互联网实现有融资需求的借款方与有富余投资理财资金的投资人在线信息配对，为投资人提供低门槛、低风险、高收益的投资理财选择。</p>
				</div>
			</div>
		</div>
	</div>
</div>
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
<script language="javascript">
function back_index(){
	window.location.href="${base}/index/index";
}
</script>

