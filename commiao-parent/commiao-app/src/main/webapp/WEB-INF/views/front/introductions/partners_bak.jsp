<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var ="tid" value="4"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %></title>
<%@ include file="/WEB-INF/jsp/global/global.jsp"%>
<script language="javascript" type="text/javascript">
	$(function(){
		$(".mya:eq(1)").css("background","#0069AC");
		$(".mya:eq(1)").css("color","white");
		$(".mya:eq(1)").css("font-weight","bold");
		
		$(".mya:eq(0)").css("background","white");
		$(".mya:eq(0)").css("color","black");
		$(".mya:eq(0)").css("font-weight","normal");
		
		$(".mya").mouseleave(function(){
			$(this).css("background","white");
			$(this).css("color","black");
			$(this).css("font-weight","normal");
			$(".mya:eq(1)").css("background","#0069AC");
			$(".mya:eq(1)").css("color","white");
			$(".mya:eq(1)").css("font-weight","bold");
		});
	});
</script>
</head>
<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
<!-- ====头部结束==== -->
<!--面包屑开始 -->
		<div class="breadcrumbs_main">
			<div class="breadcrumbs_div">
				<img src="${ctx}images/home.png" class="breadcrumbs_img" />
				<span class="breadcrumbs_text" style="position: relative;top:10px;">关于我们 > 合作伙伴</span>
			</div>
		</div>
		<!--面包屑结束 -->
<div class="main clearfix">
  <!--出借人账户首页-->
    <!-- 二级菜单 -->
  	<%@ include file="/WEB-INF/jsp/front/introductions/menu.jsp"%>
 	<!--  -->
 	<div class="safe_right">
<!--  		<h1 class="tit_h1"><div class="tit_text">合作伙伴</div></h1> -->
		<div style="clear: both;"></div>
	<!-- 	<div style="margin-left: 50px;margin-bottom: 10px;cursor: pointer;">
			<img src="${ctx }images/henanzxqydb.png" />
			<p style="text-indent: 2em;font-size:15px;">
				河南省中小企业担保集团股份有限公司（以下简称河南省担保集团公司）于2009年8月经河南省人民政府批准设立，2009年12月29日正式成立，注册资本金15亿元。
     公司隶属于河南省人民政府，按副厅级规格管理。由河南省工业和信息化厅负责行业管理、业务指导和人事管理；由河南省财政厅作为国有出资人，履行国有资产的监管职责。
      公司是全省中小企业信用担保机构的增信服务平台,为体系内信用担保机构提供再担保服务；是高科技、高成长型企业的融资服务平台，为省内重点中小企业、重大项目和集合性融资项目提供融资担保服务。
			</p>
		</div> -->
		<div style="margin-left: 50px;margin-bottom: 10px;cursor: pointer;">
			<img src="${ctx }images/henandfqy.png" /><br/><br/>
			<p style="text-indent: 2em;font-size:15px;">
				 河南东方企业投资担保有限公司成立于2003年9月12日，注册资本1亿元。主要为中小企业提供贷款担保、票据承兑担保、贸易融资担保、项目融资担保、信用证担保、诉讼保全担保、履约担保等业务。
   十年来，公司稳健快速的发展，赢得了政府、企业、金融等部门的认可。截至目前，公司已累计为1000多家中小企业提供融资担保、诉讼保全担保、工程履约担保等100多亿元，获得各项补贴1000多万元。
     在实际经营中，公司坚持“诚信规范、创新高效、合作共赢”的理念，以服务中小企业为宗旨，积极拓展新的业务领域和服务品种，以高新技术企业担保为重点，搭建中小企业融资平台，做好银企间沟通合作的桥梁！
			</p>
		</div>
		<div style="margin-left: 50px;margin-bottom: 10px;cursor: pointer;">
			<img src="${ctx }images/xrjtzdb.png" /><br/><br/>
			<p style="text-indent: 2em;font-size:15px;">
			鑫融基投资担保有限公司成立于2006年9月，注册资本10亿元，是洛阳首家由政府出资引导、民企投资共建、市场化运作的担保机构。8年来，累计为1802家中小企业提供贷款担保152亿元。
     作为河南担保行业兼并重组的首例，鑫融基得到了省、市各级政府及相关部门的大力支持和各家银行的高度关注。
     在未来一年内，鑫融基注册资本将增至15亿元，并在此基础上发展成为金融控股公司，快速实现担保业务的全省布局，全面进入村镇银行、小额贷款、典当、融资租赁等领域，在5年内实现IPO。鑫融基以服务中小企业发展为己任，铸就中国类金融行业一流品牌。
			</p>
		</div>
	</div>
</div>
<!-- 尾部 -->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>
