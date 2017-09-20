<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>com喵</title>
<link href="./css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="./css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script src="./js/jquery.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="./js/move-top.js"></script>
<script type="text/javascript" src="./js/easing.js"></script>
</head>
<body>
 <!-- header-section-starts -->
    <div class="header">
		<div class="header-banner">
			<div class="container">
				<div class="top-menu">
				    <span class="menu"> </span>
					    <ul>
							<li><a href="http://app.commiao.com" class="scroll">关于</a></li>
							<li><a href="http://company.commiao.com" class="scroll">工作</a></li>
							<li><a href="http://truck.commiao.com" class="scroll">顺通</a></li>
							<li><a href="#CONTACT" class="scroll">联系</a></li>
							<div class="clearfix"></div>
						</ul>
				</div>
		 <!--script-nav-->
		 <script>
		 $("span.menu").click(function(){
		 $(".top-menu ul").slideToggle("slow" , function(){
		 });
		 });
		 </script>
				<div class="header-banner-info text-center">
					<a href="http://manager.commiao.com"><img src="./images/commiao/miao.png" alt="" /></a>
					<h3>HELLO</h3>
					<h1>welcome to <span>com&nbsp;喵&nbsp;!</span> </h1>
					<p>&nbsp;</p>
					<!-- 					 
					<span class="line"></span>
					<ul class="social-icons">
						<li><a href="#"><i class="twitter"></i></a></li>
						<li><a href="#"><i class="dribble"></i></a></li>
						<li><a href="#"><i class="behance"></i></a></li>
					</ul>
					<label></label>
					<ul class="details">
						<li>Age     :     <a href="#">23</a></li>
						<li>Country     :     <a href="#">TURKEY</a></li>
						<li>Working at     :     <a href="#">FREELANCE</a></li>
					</ul>
					 -->
				</div>
			</div>
		</div>
	</div>
    <!-- header-section-ends -->

	<!-- footer-section-starts -->
	<div class="footer">
	    <div class="container">
			<div class="copy-rights text-center">
				<p>Copyright&nbsp;&copy;2016 COMMIAO Corporation, All Rights Reserved</p>
				<p>咔姆喵（河南）科技有限公司&nbsp;版权所有&nbsp;<a href="http://www.miitbeian.gov.cn/" target="target_blank">京ICP备16018010号-1</a></p>
			</div>
		</div>
	</div>
	<!-- footer-section-ends -->
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
</body>
</html>