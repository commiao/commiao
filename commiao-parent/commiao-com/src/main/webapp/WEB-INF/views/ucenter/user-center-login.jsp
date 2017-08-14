<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>注册登陆 | ${webTitle }</title>
<link href="${reBase }/back/css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Tab Form,Login Forms,Sign up Forms,Registration Forms,News latter Forms,Elements"/>
<script type="application/x-javascript"> 
	addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); 
	function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<script src="${reBase }/back/js/jquery.min.js"></script>
<script src="${reBase }/back/js/easyResponsiveTabs.js" type="text/javascript"></script>
				<script type="text/javascript">
					$(document).ready(function () {
						$('#horizontalTab').easyResponsiveTabs({
							type: 'default', //Types: default, vertical, accordion           
							width: 'auto', //auto or any width like 600px
							fit: true   // 100% fit in a container
						});
					});
				   </script>

<!--webfonts-->
<link href='//fonts.googleapis.com/css?family=Nixie+One' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Source+Sans+Pro:200,400,600,700,200italic,300italic,400italic,600italic|Lora:400,700,400italic,700italic|Raleway:400,500,300,600,700,200,100' rel='stylesheet' type='text/css'>
<!--//webfonts-->
</head>
<body>
<div class="main">
		<h1>注册|登录</h1>
		<h2>欢迎</h2>
	 <div class="sap_tabs">	
		 <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
			  <ul class="resp-tabs-list">
			  	  <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>注册</span></li>
				  <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>登陆</span></li>
				  <div class="clear"></div>
			  </ul>		
			  <!---->		  	 
			 <div class="resp-tabs-container">
				  <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
							<div class="facts">
									<!--login1-->
								<div class="register">
									<form>	
										<input placeholder="用户名" type="text" required="">
										<input placeholder="邮箱" type="text" required="">									
										<input placeholder="密码" type="password" required="">	
										<input placeholder="再次输入密码" type="password" required="">
										<div class="sign-up">
											<input type="submit" value="注册"/>
										</div>
									</form>
								</div>
							</div>
				 </div>		
				 <div class="tab-2 resp-tab-content" aria-labelledby="tab_item-1">
					  <div class="facts">
						  <div class="register">
							<form action="${base}/ucenter/user/index" method="post">										
								<input placeholder="用户名|邮箱" class="mail" type="text" required="">									
								<input placeholder="密码" class="lock" type="password" required="">										
								<div class="sign-up">
									<input type="submit" value="登录"/>
								</div>
							</form>
						  </div>
					  </div> 
				  </div> 			        					            	      
			  </div>	
		  </div>	
	 </div>
	 <!--start-copyright-->
   		<div class="copy-right">
   			<div class="wrap">
				<p>Copyright&nbsp;&copy;2016 COMMIAO Corporation, All Rights Reserved<br/>
				咔姆喵（河南）科技有限公司&nbsp;版权所有&nbsp;<a href="http://www.miitbeian.gov.cn/" target="target_blank">京ICP备999999号</a>
				</p>
		</div>
	</div>
	<!--//end-copyright-->
</div>	
</body>
</html>