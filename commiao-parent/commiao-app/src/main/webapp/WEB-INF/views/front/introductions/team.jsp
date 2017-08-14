<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>welicai</title>
<%@ include file="/WEB-INF/jsp/global/global.jsp"%>
</head>
<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
<!-- ====头部结束==== -->
<!--面包屑开始 -->
		<div class="breadcrumbs_main">
			<div class="breadcrumbs_div">
				<a href="${ctx }index.action"><img src="${ctx}images/home.png" class="breadcrumbs_img" /></a>
				<span class="breadcrumbs_text" style="position: relative;top:10px;">关于我们 > 核心团队</span>
			</div>
		</div>
		<!--面包屑结束 -->
<div class="main clearfix">
  <!--出借人账户首页-->
    <!-- 二级菜单 -->
  	<%@ include file="/WEB-INF/jsp/front/introductions/menu.jsp"%>
 	<!--  -->
 	<div class="safe_right">
<!--   	<h1 class="tit_h1"><div class="tit_text">核心团队</div></h1> -->
			<div style="clear: both;"></div>
  <div class="ac_right txt clearfix">

  	<div>
  		<div class="myp orange" style="text-indent: 2em"> 
  		我们的核心骨干团队成员，皆为拥有丰富的理论知识和多年实战经验的金融业内资深人士。他们之中既有来自工商银行、中国银行、民生银行、深圳发展银行、恒生银行、花旗银行、汇丰银行、东亚银行等中外银行总分行的业务专家，也不乏来自国家信息中心、证券公司、基金公司的专业研究人员，同时还包括拥有大型银行、证券公司核心业务系统、综合理财规划系统开发和运营经验的技术精英。<br />
  		</div>
  		<br />
  		<div class="f16 orange" style="margin-top: 15px">
  		孙雷 总裁<br />
  		</div>
  		<img style="float:left" src="images/sunlei.png"></img>
  		<p style="text-indent: 2em">
  		北京大学光华管理学院金融学学士，北京大学光华管理学院高级工商管理硕士(EMBA)，取得美国注册理财规划师(RFP)资格; 是国内最早为专注为国内金融机构以及高端私人客户、民营企业家提供金融理财服务，并直接参与银行财富管理中心运营服务的专家之一。<br />
  		</p>
  		<p style="text-indent: 2em">
  		创办玖富前孙雷先生曾供职于香港高阳科技（0818.HK）金融部总经理；中国民生银行（1988.HK）总行零售部财富管理中心高级经理；神州数码（0861.HK）金融业务高级顾问，一直从事金融理财服务；自03年开始为中国工商银行、中国农业银行、中国银行、招商银行、民生银行、浦发银行等银行总行以及广东证券、国泰君安等证券公司累计93家总分支机构提供个人财富管理以及投融资服务，涉足证券基金、港股投资、信托、PE股权投资等领域，具有10年投资经验，为10000多专业机构理财师提供过投资教育服务，对金融理财行业有着多年的实战经验，并具有丰富团队管理经验。<br />
  		</p><br />
  		<div class="f16 orange" style="margin-top: 15px">
  		安菲菲 副总裁<br />
  		</div>
  		<img style="float:left" src="images/anfeifei.png"></img>
  		<p style="text-indent: 2em">
  		毕业于北京大学光华管理学院货币银行专业。现任玖富副总兼华东分公司总经理。曾任香港上市公司高级项目经理、金融投资部门经理，具有10年金融行业咨询服务经验，个人理财业务资深顾问，也是国内最早从事个人理财业务中心流程设计、运营管理及服务营销实施的专家之一。为国内多家银行设计提供过个人理财业务咨询方案，并参与具体实施，同时也为多家金融机构提供过培训服务，服务过的客户包括中国工商银行总行及多家分行、中国建设银行总行、交通银行深圳、昆明等分行、中信银行上海、杭州、青岛等分行、锦州商业银行、PICC等多家金融机构。<br />
  		</p><br />
  		<div class="f16 orange" style="margin-top: 15px">
  		陈理行 副总裁，负责大数据经营战略分析<br />
  		</div>
  		<img style="float:left" src="images/chenlixing.png"></img>
  		<p style="text-indent: 2em">
  		北京大学光华管理学院金融学学士，中级经济师，拥有国际金融理财师 (CFP)认证，以及证券、期货、保险业从业人员资格。曾在国家信息中心从事宏观和行业研究工作，曾在实业投资公司担任投资总监，熟悉股票、期货、基金、港股、信托、实业投资等众多投资领域，拥有10年金融数据分析和投资经验。06年加盟玖富，负责数据分析、公司财务分析、行业研究、金融产品设计以及金融服务解决方案研发。 <br />
  		</p><br />
  		<div class="f16 orange" style="margin-top: 15px">
  		张冬成 副总裁<br />
  		</div>
  		<img style="float:left" src="images/zhangdongcheng.png"></img>
  		<p style="text-indent: 2em">
  		CFP，个人理财专家，北京师范大学硕士。曾10多年服务于中国工商银行；2005年参加中国金融教育发展基金会金融理财标准委员会组织的金融理财师培训，于2005年11月取得中国金融理财规划师资格（AFP），2006年参加全国国际金融理财师培训，进一步提高专业水平，并于9月获得国际金融理财师资格认证（CFP），成为全国488名首批国际金融理财师之一。具有10多年银行工作经验，熟悉金融产品，为部队、企业、机关、商会等多种机构进行过多次大型的理财演讲，曾在电台、报纸等媒体上发表过多项理财观点，针对家庭理财规划、基金投资、女性理财等有深厚的见底。<br />
  		</p><br />
  		<div class="f16 orange" style="margin-top: 15px">
  		蒋妍君 副总裁<br />
  		</div>
  		<img style="float:left" src="images/jiangyanjun.png"></img>
  		<p style="text-indent: 2em">
  		北京大学光华管理学院MBA，本科毕业于南开大学国际经济专业，投资理财专家。曾任海问投资以及《中国科技财富》杂志高级管理人员，现任玖富副总裁、理财学院院长，负责理财师的筛选、培养和管理的工作，以及公司财富诊断产品开发设计推广工作。拥有多年投资研究工作经验，管理600人的理财顾问队伍。精通股票、基金研究，特别是金融衍生产品。
  		</p><br /><br />
  		<div class="orange" style="margin-top: 15px;font-size: 16px">孙彦杰 副总裁<br /></div>
  		<img style="float:left" src="images/sunyanjie.png"></img>
  		<p style="text-indent: 2em">
  		上海财经大学，曾在荷兰银行、中信证券等知名金融机构任客户经理，销售主管，一线营销经验丰富，业绩一流。曾经获得荷兰银行最佳新人奖，中信证券2007年度管理资产规模第一名，后任玖富销售部总经理。目前任玖富副总裁，为咨询管理委员会总负责人， 分管咨询部、销售部、客服部。。<br></br>
<br></br>
<br></br>
<br></br>
  		</p>
  	</div>
</div>
</div></div>
<!-- 尾部 -->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>
