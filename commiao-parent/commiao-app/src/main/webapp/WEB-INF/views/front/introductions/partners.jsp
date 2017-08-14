<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="tid" value="3" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>合作机构</title>
<link href="${ctx}lyun/css/company.css" rel="stylesheet" type="text/css" />
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
					<li class="obout_txt active"><a href="toAboutPage.action?aboutType=1">合作机构</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=2">招贤纳士</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=3">行业资讯</a></li>
					<li class="obout_txt"><a href="toAboutPage?aboutType=4">公司公告</a></li>
					<li class="obout_txt"><a href="toAboutPage.action?aboutType=5">联系我们</a></li>
				</ul>
			</div>
		</div>
		<!--right-->
		<div class="company_box_right fr">
			<div class="company_box_rightcon" id="com1">
				<div class="img_box">  
					<img src="${ctx }lyun/imgs/he1.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">北京市盈科律师事务所是一家全球化法律服务机构，总部设在中国北京，在中国大陆拥有25家办公室，在纽约、伦敦、维罗纳、米兰、布达佩斯、圣保罗、首尔、伊斯坦布尔、华沙、墨西哥城、布鲁塞尔、特拉维夫、芝加哥、新加坡、迪拜、里斯本、马德里、莫斯科、香港分别设有办公室，盈科律师事务所4000名员工，致力于为客户提供全球商务法律服务，为客户创造价值。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com3">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he2.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">北京盈科律云科技有限公司，是一家致力于为全球用户提供中国法律服务的云服务平台，成立于2013年。律云根据客户不同层次的法律需求，匹配法律服务资源，为中小企业和个人家庭提供综合法律服务。律云科技充分借助覆盖全国的律师服务以及互联网、现代通信、广电传媒等方式，通过语音电话、互联网网站、移动客户端、手机WAP、OTT等多种信息载体，高度整合覆盖全球的法律服务优势资源，以多样化形式呈现，打造提供标准化法律服务的功能性平台—律云在线。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com14">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he14.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">盈达资本全称为“北京盈达投资管理有限公司”，成立于2013年9月13日，注册资金1000万元，是一家综合性的金融集团公司。公司总部位于北京市朝阳区，业务范围辐射全国16个省市。</p>
					<p class="partners_nar">公司已在中国证券投资基金业协会登记为私募投资基金管理人，是一家开展私募证券投资、股权投资、创业投资等私募投资业务的金融机构。同时，公司是上海股权托管交易中心、安徽股权托管交易中心的推荐会员单位。公司专注于为创业型、创新型、成长型企业提供股权融资、债权融资、境内外上市规划、新三板挂牌咨询、区域性股权交易中心推荐挂牌、财务顾问等服务。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com16">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he16.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">盈赫资本致力于为投融资机构双方提供全方位、综合性、全球一体化的项目对接桥梁。总部设立在上海，旨在以中立、客观、多元、私密的立场为中国的高净值资产人士提供全面、健康、一站式的资产管理服务。</p>
					<p class="partners_nar">盈赫资本依托盈科产业链下盈科律师事务所、律云法律服务在线战略合作伙伴关系，拥有强大的专家顾问团队，投资研究实力雄厚。依托强大的后援支持团队以及先进的IT系统，目前已形成了汇集金融投资、法律服务推广、投资移民等多元化业务服务领域。涉及金融投资领域的业务范围包括企业债权投资、私募股权投资、阳光私募基金投资、优质企业收购和融资、资产重组和并购投资等。盈赫资本即为国内外超过5万家企业提供投资、融资以及资本运营一揽子解决方案，也为众多高净值客户设计和筛选风险可控、收益可观的各类理财产品，实现家庭财富的保值增值。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com2">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he3.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">盈科凯鸿，十二年深耕投资移民领域，为上万中国家庭成功办理了海外移民，取得了令业界瞩目的成绩，至今保持着办理速度全国领先、申请成功率全国领先的多项记录。</p>
					<p class="partners_nar">盈科凯鸿目前拥有由资深顾问、文案、客服和前移民官、移民律师、国内外注册会计师和外籍移民专家组成的专业团队，而依托亚太区规模最大的国际化律所盈科律师事务所近4000名中外律师团队，盈科凯鸿将在法律层面为客户申请的安全性与成功率方面提供全方位的保驾护航。盈科遍布全球的40多家律所，真正实现了全面覆盖当前主流移民国家。盈科凯鸿是当前在海外拥有最多服务网点的出国服务系统提供商。</p>
				</div><!-- 
				<div class="whole_passage">
					<span class="arrow">阅读全文</span>
				</div> -->
			</div>
			<div class="company_box_rightcon" id="com4">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he4.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">中韬华益，是一家帮助企业防范税务风险、解决税务难题、提升税务管理能力、创造税务利润，至力于打造全国连锁的专业财税服务机构。</p>
					<p class="partners_nar">中韬华益，立足广州，覆盖全国，现已在广州、深圳、武汉、厦门、海口、唐山、襄阳、十堰、咸 宁、东莞等地建立分支机构，努力实现跨区域研究税收政策，打破税收政策法规区域差异限制，为客户提供税务代理、税务顾问、税务咨询、税务鉴证、税务培训、 模拟税务稽查、纳税筹划、转让定价等专业服务。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com5">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he5.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">迅付信息科技有限公司（简称：环迅支付），是中国最早成立的第三方支付企业。公司在2011年获颁中国人民银行首批《支付业务许可证》。公司目前可以支持国际主流信用卡及所有国内主流银行的在线支付，为全球超过60万家商户及2000万用户提供金融级的支付体验。</p>
					<p class="partners_nar">环迅支付总部位于上海，在长春、北京、南京、成都、重庆、福州、广州、杭州、天津及深圳均拥有分支机构。   为提升客户服务水平，环迅支付不满足于依靠简单的支付产品解决企业的功能性需要，而是通过平台为企业提供金融咨询、清结算、ERP无缝对接等一系列服务，全面满足企业的财务需求。公司于2012年全面升级具有自主知识产权的"一平台、云覆盖"平台系统，完成由支付企业到金融服务企业的锐变。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com6">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he6.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">中桥融资担保有限公司（以下简称公司）是一家面向全国的股份制专业信用担保企业，于2003年7月经国家工商行政管理总局批准成立，取得注册号110000005822045的企业法人营业执照。公司总部设在北京，在成都等地设有分公司，其他分公司手续正在审批中。 公司由三方股东共同出资设立，注册资本3亿元人民币。公司于2009年被评为中国担保公司100强。2011年3月份成为首批获得北京市金融工作局颁发的5年期融资性金融担保经营许可证融资性担保公司之一。公司被中国人民银行和银监会指定的资信评估机构资信评级为AA-级单位。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com15">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he15.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">天津安瑞鑫投资担保有限公司成立于2011年7月，是经过天津市金融办公室批准成立的融资性担保机构。注册资金1亿元。</p>
					<p class="partners_nar">本公司现经营范围有贷款担保；票据承兑担保；贸易融资担保；项目融资担保；信用证担保；经批准的其他融资性担保业务；经批准的非融资性担保业务；以自有资金向工业、商业、高新技术产业、房地产业进行投资；投资咨询（金融等需审批的项目除外）；财务咨询（代理记账除外）。（以上经营范围涉及行业许可的凭许可证件，在有效期限内经营，国家有专项专营规定的按规定办理）。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com7">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he7.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">大秦商业保理有限公司(以下简称大秦保理或公司)是由中国企业合作促进会报请商务主管部门批准、于2013年11月经国家工商总局核名、在深圳登记注册的完全市场化独立法人主体，经营范围包括保付代理业务（非银行融资类）、担保业务（非融资性担保）、供应链管理。
公司目前拥有员工700余人（含分公司），其中管理团队多来自于政府机关、国内知名上市公司、国有大中型企业，具有丰富的集团管控经验。目前大秦保理为中国服务贸易协会商业保理专业委员会单位会员。被中国国际贸易学会评为AAA级诚信单位。
</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com8">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he8.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">北京海大富林融资担保有限公司成立于2009年9月，是经北京市工商行政管理局注册，北京市金融工作局批准的融资担保专业化公司，注册资本40000万元人民币。主要从事贷款担保、贸易融资担保、项目融资担保、信用证担保、债券担保、工程履约担保、农林牧业及相关的担保、项目投资和投资管理等相关业务。 公司经营管理团队主要由农林牧行业生产经营专家，金融及企业管理方面的专家组成，具有丰富的经验和良好的人脉关系。公司经过近四年的不断努力和发展，业务触角已经延伸到河南省，黑龙江省及内蒙古等地区，并取得了长足的进步和突破性的成绩，现为北京信用担保业协会理事单位。 在当前全国上下重视三农扶持三农的背景下，公司发挥自身的优势，以农，林，牧，畜行业为融资担保的基础和主要服务对象，逐步向其他担保融资领域发展。海大富林将继续坚持以“经营信用，管理风险，资源共享，合作共赢”为经营理念，以“以终为始，知行合一，厚德载物”为核心价值观，以信为首，以诚相交，不断跨越新的机遇与挑战，争取在国内担保业中，走出一条利国利民利企的特色发展之路。 </p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com9">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he9.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">深圳前海百联汇商业保理有限公司，成立于2014年3月，是由中华人民共和国深圳市人民政府批准，在深圳前海依法注册的一家专业保理公司，公司注册实收资本1亿元。
     公司以百业联盟、汇聚资本为宗旨，以成为国内保理专业水平最高，服务最好的商业保理商为目标。公司引进信用风险评估系统，建立专业化保理业务风险管理流程，有效监控买方信用风险。此外，公司按照专业化标准，建立了保理作业流程、风险管理流程和贷后管理流程，保证保理业务的高效、顺畅操作，为客户提供优良的服务。
     公司引进了各行业优秀人才，建立了一支专家性的市场开拓、产品设计、风险管理以及保理作业团队，保障保理业务高效、安全的开展。公司员工大都来自于大型商业银行、会计师事务所、律师事务所、资产管理公司、专业融资性担保公司等行业的作业和管理人员，拥有丰富的金融产品风险管理知识和实务操作经验。
</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com10">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he10.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">瑞安资本集团是一家致力于帮助客户实现资产增值的服务性机构。我们针对综合金融服务的需求增大等可应对金融环境的变化提出全公司中长期发展战略。瑞安资本集团将通过加强及扩充金融业资产组合及竞争力，并通过提供综合金融服务，增大需求及满意度；通过协同创造，极大提高企业价值，为我国金融产业的发展做出贡献。通过“阳光化、专业化”运作，致力于实现投资者和客户价值最大化，为客户提供系统化的融资服务及综合性资产增值服务。</p>
					<p class="partners_nar"> 瑞安资本集团现已蜕变成一所多元化的金融机构，集团五大核心业务领域，包括财富管理及经纪业务、资产管理、企业融资、私人理财以及主要投资，提供广泛而创新的产品及服务。形成了以商业保理、创业投资服务、股权投资服务、基金服务、典当服务、担保服务、小额贷款服务、理财咨询服务等为主的多业态的全产业链金融控股集团。</p>
					<p class="partners_nar">瑞安资本集团旗下公司包括：天津瑞安丰盛商业保理有限公司、大众瑞安创业投资有限公司，天津市瑞德信典当有限公司，天津银创未来小额贷款有限公司，石家庄瑞安股权投资基金管理有限公司等。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com11">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he11.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">上海国宏商业保理有限公司（以下简称“国宏保理”）是中金国泰控股集团有限公司旗下全资子公司，公司成立于2014年4月，注册资本5亿元人民币， 是上海自贸区成立后首家在自贸区审批注册成立的商业保理公司，也是国内投资规模最大的商业保理公司之一，总部办公地址位于上海浦东陆家嘴CBD核心区域。</p>
					<p class="partners_nar">国宏保理立足上海，依托政府背景与广阔的社会资源，业务覆盖长三角并辐射全国。公司以供应链保理业务、大宗商品贸易保理融资业务、出口贸易融资业务、融资租赁保理业务、保理居间通道业务、商业地产保理业务等国内和国际保理业务为主，致力于打造中国最专业的商业保理服务平台，旨在为客户提供专业化、全方位、 多层次的保理服务，帮助客户盘活应收账款资产，改善现金流状况。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com12">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he12.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">深圳前海浩富商业保理有限公司是一家经商务部和深圳前海管理局批准并由深圳市市场监督管理局登记注册的专业商业保理公司，同时是国际保理商协会（IFG）会员；公司经过长期人才积累，目前拥有一支由国内外应收账款保理人才组成的高素质服务团队。</p>
					<p class="partners_nar">浩富商业保理团队在风控环节，商业保理融资设计，资金对接方面拥有丰富的操作经验。目前与中国银行、建设银行、交通银行、平安银行，中信银行等商业银行建立紧密的业务往来。在创新业务领域率先启动应收账款资产证券化的尝试，浩富商业保理公司与投资银行、基金、信托、保险公司形成紧密合作，使应收账款资产产品与资金高效的对接。</p>
				</div>
			</div>
			<div class="company_box_rightcon" id="com13">
				<div class="img_box">
					<img src="${ctx }lyun/imgs/he13.png" alt="" class="logo1">
				</div>
				<div class="partnerbox">
					<p class="partners_nar">鼎亨（上海）商业保理有限公司，是由浙江省基础建设投资集团有限公司与浙江省基础建设投资管理有限公司共同投资设立。公司成立于2013年，是上海市工商局和上海商委核准的华东地区唯一一家作政府应收账款转让的商业保理公司。</p>
					<p class="partners_nar">我们积极创新业务模式和融资方式。同时，在商务部、上海市政府等各级主管部门的关怀下，在各金融机构和社会各界朋友的大力支持下，我们在提高管理水平和经济效益的同时，服务地方，为地方经济的发展作出了应有的贡献，取得了良好的社会效益。可以说今天的鼎亨（上海）商业保理有限公司已经进入了良性发展的快车道。</p>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
