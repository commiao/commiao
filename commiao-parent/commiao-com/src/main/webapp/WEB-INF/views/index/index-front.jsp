<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
	<head>
		<title>首页 | ${webTitle }</title>
		<link href="${reBase }/front/css/bootstrap.css" rel='stylesheet' type='text/css' />
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="${reBase }/front/js/jquery.min.js"></script>
		 <!-- Custom Theme files -->
		 <!---- animated-css ---->
		<link href="${reBase }/front/css/animate.css" rel="stylesheet" type="text/css" media="all">
		<script src="${reBase }/front/js/wow.min.js"></script>
		<script>
		 new WOW().init();
		</script>
		<!---- animated-css ---->
		  <!---- start-smoth-scrolling---->
		<script type="text/javascript" src="${reBase }/front/js/move-top.js"></script>
		<script type="text/javascript" src="${reBase }/front/js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
		 <!---- start-smoth-scrolling---->
		<link href="${reBase }/front/css/style.css" rel='stylesheet' type='text/css' />
   		 <!-- Custom Theme files -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> 
			addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
		</script>
		<!----webfonts--->
		<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
		<!---//webfonts--->
		<!----start-top-nav-script---->
		<script>
			$(function() {
				var pull 		= $('#pull');
					menu 		= $('nav ul');
					menuHeight	= menu.height();
				$(pull).on('click', function(e) {
					e.preventDefault();
					menu.slideToggle();
				});
				$(window).resize(function(){
	        		var w = $(window).width();
	        		if(w > 320 && menu.is(':hidden')) {
	        			menu.removeAttr('style');
	        		}
	    		});
			});
		</script>
		<!----//End-top-nav-script---->
	</head>
	<body>
		<div class="bg">
		<!----- start-header---->
			<div id="home" class="header wow bounceInDown" data-wow-delay="0.4s">
					<div class="top-header">
						<div class="container">
						<div class="logo">
							<a href="http://www.commiao.com"><img src="${reBase }/images/logo/logo-w.png" title="dreams" /></a>
						</div>
						<!----start-top-nav---->
						 <nav class="top-nav">
							<ul class="top-nav">
								<li><a href="#home" class="scroll">首页</a></li>
								<!-- <li class="active"><a href="#services" class="scroll">服务</a></li> -->
								<li><a href="#services" class="scroll">服务</a></li>
								<li><a href="#port" class="scroll">产品</a></li>
								<li><a href="#team" class="scroll">团队</a></li>
								<li><a href="#contact" class="scroll">联系</a></li>
							</ul>
							<a href="#" id="pull"><img src="${reBase }/front/images/menu-icon.png" title="menu" /></a>
						</nav>
						<div class="clearfix"> </div>
					</div>
				</div>
			</div>
			<!----- //End-header---->
			<!---- banner ---->
			<div class="banner wow fadeIn" data-wow-delay="0.5s">
				<div class="container">
					<div class="banner-info text-center">
						<h1>建立你梦想的网站</h1><br />
						<span> </span>
						<p>我们是一个专业建设网站的机构!</p>
					</div>
				</div>
			</div>
		</div>
			<!---- banner ---->
			<!--- services --->
			<div id="services" class="services">
				<div class="container">
					<div class="service-head text-center">
						<h2>核心服务</h2>
						<span> </span>
					</div>
					<!--- services-grids --->
					<div class="services-grids text-center">
						<div class="col-md-4">
							<div class="service-grid wow bounceIn" data-wow-delay="0.4s">
								<span class="service-icon1"> </span>
								<h3><a href="#">完美的设计</a></h3>
								<p>Proin iaculis purus consequat sem digni ssim. Donec porttitora entum aenean rhoncus posuere odio in.</p>
							</div>
						</div>
						<div class="col-md-4">
							<div class="service-grid wow bounceIn" data-wow-delay="0.4s">
								<span class="service-icon2"> </span>
								<h3><a href="#">web 开发</a></h3>
								<p>Proin iaculis purus consequat sem digni ssim. Donec porttitora entum aenean rhoncus posuere odio in.</p>
							</div>
						</div>
						<div class="col-md-4">
							<div class="service-grid wow bounceIn" data-wow-delay="0.4s">
								<span class="service-icon3"> </span>
								<h3><a href="#">24/7 支持</a></h3>
								<p>Proin iaculis purus consequat sem digni ssim. Donec porttitora entum aenean rhoncus posuere odio in.</p>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
					<!--- services-grids --->
				</div>
			</div>
			<!--- services --->
			<div class="clearfix"> </div>
			<!--- Other Expertise ---->
			<div id="port" class="expertise">
				<div class="expertice-grids">
					<div class="col-md-8 expertice-left-grid wow fadeInLeft" data-wow-delay="0.4s">
						<div class="expertise-head">
							<h3>产品</h3>
							<p>Proin iaculis purus consequat sem cure  digni ssim. Donec porttitora entum suscipit  aenean rhoncus posuere odio in tincidunt consequat sem cure  digni ssim. </p>
						</div>
						<div class="expertise-left-inner-grids">
							<div class="e-left-inner-grid">
								<div class="e-left-inner-grid-left">
									<span class="e-icon1"> </span>
								</div>
								<div class="e-left-inner-grid-right">
									<h4>定制服务</h4>
									<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus.</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="e-left-inner-grid">
								<div class="e-left-inner-grid-left">
									<span class="e-icon2"> </span>
								</div>
								<div class="e-left-inner-grid-right">
									<h4>云上管理</h4>
									<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus.</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="e-left-inner-grid">
								<div class="e-left-inner-grid-left">
									<span class="e-icon3"> </span>
								</div>
								<div class="e-left-inner-grid-right">
									<h4>专业支持</h4>
									<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus.</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="e-left-inner-grid">
								<div class="e-left-inner-grid-left">
									<span class="e-icon4"> </span>
								</div>
								<div class="e-left-inner-grid-right">
									<h4>安全保护</h4>
									<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus.</p>
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="clearfix"> </div>
						</div>
						<a class="leran-more" href="#">了解更多</a>
					</div>
					<div class="col-md-4 expertice-right-grid wow fadeInRight" data-wow-delay="0.4s">
						
					</div>
					<div class="clearfix"> </div> 
				</div>
			</div>
			<!--- Other Expertise ---->
			<!--- portfolio ---->
			<div class="portfolio">
				<div class="portfolio-top">
					<div class="col-md-8">
						<div class="portfolio-top-left wow fadeInLeft" data-wow-delay="0.4s">
							<h3>惊人组合</h3>
							<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit.</p>
							<p>Iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. Proin iaculis purus consequat.</p>
							<div class="portfolio-top-left-grids">
								<div class="portfolio-top-left-grid">
									<div class="portfolio-top-left-grid-left">
										<span class="p-icon1"> </span>
									</div>
									<div class="portfolio-top-left-grid-right">
										<h5>远离烦恼</h5>
										<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. </p>
									</div>
									<div class="clearfix"> </div>
								</div>
								<div class="portfolio-top-left-grid">
									<div class="portfolio-top-left-grid-left">
										<span class="p-icon2"> </span>
									</div>
									<div class="portfolio-top-left-grid-right">
										<h5>专业团队</h5>
										<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. </p>
									</div>
									<div class="clearfix"> </div>
								</div>
								<div class="portfolio-top-left-grid">
									<div class="portfolio-top-left-grid-left">
										<span class="p-icon3"> </span>
									</div>
									<div class="portfolio-top-left-grid-right">
										<h5>集成服务</h5>
										<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. </p>
									</div>
									<div class="clearfix"> </div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4 portfolio-top-right-inner wow fadeInRight" data-wow-delay="0.4s">
						<div class="portfolio-top-right">
							
						</div>
					</div>
					<div class="clearfix"> </div>
					<!---- portfolio-works ---->
					<div class="portfolio-works">
						<div class="col-md-4 portfolio-work-grid wow bounceIn" data-wow-delay="0.4s">
							<div class="portfolio-work-grid-pic">
								<img src="${reBase }/front/images/p1.jpg" title="name" />
							</div>
							<div class="portfolio-work-grid-caption">
								<h4>项目A</h4>
								<p>Here you can find some of our latest works,  Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. to see the details of these works just click the thumbnails below.</p>
							</div>
						</div>
						<div class="col-md-4 portfolio-work-grid wow bounceIn" data-wow-delay="0.4s">
							<div class="portfolio-work-grid-pic">
								<img src="${reBase }/front/images/p2.jpg" title="name" />
							</div>
							<div class="portfolio-work-grid-caption">
								<h4>项目	B</h4>
								<p>Here you can find some of our latest works,  Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. to see the details of these works just click the thumbnails below.</p>
							</div>
						</div>
						<div class="col-md-4 portfolio-work-grid wow bounceIn" data-wow-delay="0.4s">
							<div class="portfolio-work-grid-pic">
								<img src="${reBase }/front/images/p3.jpg" title="name" />
							</div>
							<div class="portfolio-work-grid-caption">
								<h4>项目C</h4>
								<p>Here you can find some of our latest works,  Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. to see the details of these works just click the thumbnails below.</p>
							</div>
						</div>
						<div class="col-md-4 portfolio-work-grid wow bounceIn" data-wow-delay="0.4s">
							<div class="portfolio-work-grid-pic">
								<img src="${reBase }/front/images/p4.jpg" title="name" />
							</div>
							<div class="portfolio-work-grid-caption">
								<h4>项目D</h4>
								<p>Here you can find some of our latest works,  Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. to see the details of these works just click the thumbnails below.</p>
							</div>
						</div>
						<div class="col-md-4 portfolio-work-grid wow bounceIn" data-wow-delay="0.4s">
							<div class="portfolio-work-grid-pic">
								<img src="${reBase }/front/images/p5.jpg" title="name" />
							</div>
							<div class="portfolio-work-grid-caption">
								<h4>项目E</h4>
								<p>Here you can find some of our latest works,  Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. to see the details of these works just click the thumbnails below.</p>
							</div>
						</div>
						<div class="col-md-4 portfolio-work-grid wow bounceIn" data-wow-delay="0.4s">
							<div class="portfolio-work-grid-pic">
								<img src="${reBase }/front/images/p6.jpg" title="name" />
							</div>
							<div class="portfolio-work-grid-caption">
								<h4>项目F</h4>
								<p>Here you can find some of our latest works,  Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. to see the details of these works just click the thumbnails below.</p>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
					<!---- portfolio-works ---->
				</div>
			</div>
			<!--- portfolio ---->
			<!---- about ---->
			<!---start-about---->
		<div class="about">
			<div class="wrap"> 
				<div class="about-head">
					<h1>关于我们</h1>
					<span> </span>
				</div>
				<!---start-about-time-line---->
				<div class="about-time-line">
					<li>
							<div class="cbp_tmicon img1"> </div>
							<div class="cbp_tmlabel wow fadeInLeft" data-wow-delay="0.4s">
								<h2>开始于2016年4月</h2>
								<p>Proin iaculis purus consequat sem cure  digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit.</p>
							</div>
					</li>
					<li>
							<div class="cbp_tmicon1 img2"> </div>
							<div class="cbp_tmlabel cbp_tmlabel1 wow fadeInRight" data-wow-delay="0.4s">
								<h2>启动于2016年5月 </h2>
								<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt.</p>
							</div>
					</li><br />
					<li>
							<div class="cbp_tmicon2 img3"> </div>
							<div class="cbp_tmlabel wow fadeInLeft" data-wow-delay="0.4s">
								<h2>2016年6月黑暗的阶段 </h2>
								<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. Proin iaculis purus consequat sem cure digni.</p>
							</div>
					</li>
					<li>
							<div class="cbp_tmicon3 img4"> </div>
							<div class="cbp_tmlabel cbp_tmlabel1 wow fadeInRight" data-wow-delay="0.4s">
								<h2>2016年7月收获的季节 </h2>
								<p>Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt. Proin iaculis purus consequat sem cure digni ssim. Donec porttitora entum suscipit aenean.</p>
							</div>
					</li>
					<li>
							<div class="cbp_tmicon4 img5"> </div>
					</li>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
				</div>
				<!---//End-about-time-line---->
			<!---- about ---->
		</div>
			<!---- team --->
			<div id="team" class="team-members">
					<div class="wrap"> 
						<div class="tm-head">
							<h3>我们疯狂的团队</h3>
							<p>Proin iaculis purus consequat sem cure.</p>
						</div>
						<div class="tm-head-grids">
							<div class="tm-head-grid wow fadeInLeft" data-wow-delay="0.4s">
								<img src="${reBase }/front/images/team-member1.jpg" alt="">
								<h4> 成员A</h4>
								<h5>Marketer</h5>
								<ul class="top-social-icons">
									<!--
									<li><a class="twitter" href="#"> </a></li>
									<li><a class="facebook" href="#"> </a></li>
									<li><a class="pin" href="#"> </a></li>
									-->
									<div class="clear"> </div>
								</ul>
							</div>
							<div class="tm-head-grid wow fadeInUp" data-wow-delay="0.4s">
								<img src="${reBase }/front/images/team-member2.jpg" alt="">
								<h4>成员B</h4>
								<h5>Coder</h5>
								<ul class="top-social-icons">
									<!--
									<li><a class="twitter" href="#"> </a></li>
									<li><a class="facebook" href="#"> </a></li>
									<li><a class="pin" href="#"> </a></li>
									-->
									<div class="clear"> </div>
								</ul>
							</div>
							<div class="tm-head-grid wow fadeInRight" data-wow-delay="0.4s">
								<img src="${reBase }/front/images/team-member3.jpg" alt="">
								<h4>成员C</h4>
								<h5>Graphic Designer</h5>
								<ul class="top-social-icons">
									<!--
									<li><a class="twitter" href="#"> </a></li>
									<li><a class="facebook" href="#"> </a></li>
									<li><a class="pin" href="#"> </a></li>
									-->
									<div class="clear"> </div>
								</ul>
							</div>
							<div class="clearfix"> </div>
						</div>
						<p class="team-info">Proin iaculis purus consequat sem cure  digni ssim donec porttitora entum suscipit aenean rhoncus posuere odio in tincidunt proin iaculis.</p>
					</div>
				</div>
			<!---- team --->
			<!---- contact --->
			<div id="contact" class="contact">
				<div class="container">
				<div class="contact-grids">
					<div class="col-md-6">
						<div class="contact-left wow fadeInRight" data-wow-delay="0.4s">
							<h3>联系我们</h3>
							<label>我们是友善的团队，随时欢迎您的联系</label>
							<div class="contact-left-grids">
								<div class="col-md-6">
									<div class="contact-left-grid">
										<p><span class="c-mobi"> </span>(010) 5947-5101</p>
										<!--
										<p><span class="c-twitter"> </span><a href="#">@commiao</a></p>
										<p><span class="c-pluse"> </span><a href="#">plus.com/dreams</a></p>
										 -->
									</div>
								</div>
								<div class="col-md-6">
									<div class="contact-right-grid">
										<p><span class="c-msg"> </span><a href="mailto:hello@dreams.com">jingmiao@21cn.com</a></p>
										<!-- 
										<p><span class="c-face"> </span><a href="#">facebook.com/dreams</a></p>
										<p><span class="c-pin"> </span><a href="#">pinterest.com/dreams</a></p>
										 -->
									</div>
								</div>
								<div class="clearfix"> </div>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="contact-right wow fadeInLeft" data-wow-delay="0.4s">
							<form>
								<input type="text" class="text" value="Name..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name...';}">
					 			<input type="text" class="text" value="Email..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email...';}">
					 	 		<textarea value="Message:" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">Message..</textarea>
								<input class="wow shake" data-wow-delay="0.3s" type="submit" value="Send Message" />
							</form>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<!--- copy-right ---->
				<div class="copy-right text-center">
					<p>Copyright&nbsp;&copy;2016 COMMIAO Corporation, All Rights Reserved<br/>
					咔姆喵（河南）科技有限公司&nbsp;版权所有&nbsp;<a href="http://www.miitbeian.gov.cn/" target="target_blank">京ICP备999999号</a>
					</p>
					<script type="text/javascript">
									$(document).ready(function() {
										/*
										var defaults = {
								  			containerID: 'toTop', // fading element id
											containerHoverID: 'toTopHover', // fading element hover id
											scrollSpeed: 1200,
											easingType: 'linear' 
								 		};
										*/
										
										$().UItoTop({ easingType: 'easeOutQuart' });
										
									});
								</script>
									<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
				</div>
				<!--- copy-right ---->
			</div>
			</div>
			<!---- contact --->
		</div>
	</body>
</html>