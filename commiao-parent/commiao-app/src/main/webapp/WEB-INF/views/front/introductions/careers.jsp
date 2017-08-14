<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var ="tid" value="3"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" /
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
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=0">公司简介</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=1">合作机构</a></li>
					<li class="obout_txt active"><a href="toAboutPage.action?aboutType=2">招贤纳士</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=3">行业资讯</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=3">公司公告</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=5">联系我们</a></li>
				</ul>
			</div>
		</div>
		<!--right-->
		<div class="company_box_right fr"> 
			<div class="recruit">
				<!--上-->
				<div class="join_us">
					<span class="join_us_title">JOIN US</span>
					<p class="join_us_txt">律金所致力于通过优质服务及交易品种与交易组织模式的不断创新，提升交易效率，优化金融资产配置，成为中国领先并具有重要国际影响力的金融资产交易服务平台。</p>
					<p class="join_us_txt">我们期待对互联网金融有着强烈兴趣，丰富经验的有识之士加入我们！请将您的简历发到：<a href="">hr@lvjinsuo.com</a></p>
				</div>
				<!--下-->
				<div class="information">
					<h3 class="present">在招职位</h3>
					<div class="present_con">
						<p class="present_name">产品经理</p>
						<p class="position">岗位职责:</p>
						<p class="position_txt">1. 负责律金所用户产品调研及设计，包括收集分析用户/客户需求、进行市场和竞争分析、制定产品规划、设计产品功能等；<br>2. 负责具体项目及产品功能的设计，通过数据分析或商业敏锐观察不断推进产品优化，能够撰写高质量的需求文档，并协调/推动研发团队按时完成产品开发、高质量上线；<br> 3. 负责在项目推进过程中的跨部门协调沟通工作，能够协调各资源以确保产品顺利发展；<br>4. 对业务运营给予支持，通过数据分析定位业务发展的问题，挖掘业务发展潜力。</p>
						<p class="position">任职要求： </p>
						<p class="position_txt">1. 热爱互联网，熟悉互联网广告市场，热爱互联网产品设计；<br> 2. 至少2年及以上互联网行业工作经验，有互联网产品设计经验者优先；<br> 3. 出色的设计能力、对功能架构/交互/视觉有一定理解；<br> 4. 有较强的学习、沟通及问题分析与解决能力、组织协调能力，及一定的项目管理能力；<br> 5. 本科以上计算机相关专业，硕士优先。</p>
					</div>
					<div class="present_con">
						<p class="present_name">融资租赁风控经理</p>
						<p class="position">岗位职责：</p>
						<p class="position_txt">1. 负责公司融资租赁业务的风险管理并独自负责完成融资租赁业务；2. 审查项目资料的真实性、合法性、准确性、全面性；<br>3. 对融资租赁项目进行现场调查，完成评审报告；<br>4. 对于送审案件提出建议及核可方案；<br>5. 对风险管理的档案资料进行归类、整理、归档、保存；<br>6. 具备较强的信息采集能力、数据分析能力、判断决策能力，对项目稽核、风险分析和风险审查、管理有丰富的经验以及成功案例；<br>7、熟悉银行信贷、融资租赁及金融市场，熟悉企业管理运作；<br>8. 完成公司领导交办的其它工作。</p>
						<p class="position">任职要求：</p>
						<p class="position_txt"> 1. 大学本科以上学历，金融类及相关专业，5年以上工作经验；<br>2. 熟悉信贷及相关行业业务流程及风险点，有贷前审批及贷后检查工作经验；<br>3. 有银行、融资租赁公司等风险控制或合规工作经验者优先；<br>4. 良好的协调、沟通能力和公共关系管理能力；工作严谨细致；<br>5. 原则性强、工作认真负责。</p>
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
