<%@page contentType="text/html;charset=UTF-8"%>
<style>
a:focus{outline:none;}
</style>
<!-- container -->
<div class="container">
	<div class="header">
		<div class="head-logo">
			<a href="${weBase }/index/front"><img src="${weBase }/images/logo001.png" alt="" /></a>
		</div>
		<div class="top-nav">
			<span class="menu"><img src="${reBase }/images/menu.png" alt=""></span>
			<ul class="nav1">
				<li class="hvr-sweep-to-bottom <c:if test='${menu_flag==1 }'> active</c:if>">
					<a href="${weBase }/index/front">主页<i><img src="${reBase }/images/nav-but1.png" alt="" /></i>	</a>
				</li>
				<li class="hvr-sweep-to-bottom <c:if test='${menu_flag==2 }'> active</c:if>">
					<a href="${weBase }/index/about">关于<i><img src="${reBase }/images/nav-but2.png" alt="" /></i></a>
				</li>
				<li class="hvr-sweep-to-bottom <c:if test='${menu_flag==3 }'> active</c:if>">
					<a href="${weBase }/index/services">服务<i><img src="${reBase }/images/nav-but3.png" alt="" /></i></a>
				</li>
				<!-- 
				<li class="hvr-sweep-to-bottom <c:if test='${menu_flag==4 }'> active</c:if>">
					<a href="${rqBase }/index/blog">博客<i><img src="${reBase }/images/nav-but4.png" alt="" /></i></a>
				</li>
				 -->
				<li class="hvr-sweep-to-bottom <c:if test='${menu_flag==5 }'> active</c:if>">
					<a href="${weBase }/index/mail">客服<i><img src="${reBase }/images/nav-but5.png" alt="" /></i></a>
				</li>
				<div class="clearfix"></div>
			</ul>
			<!-- script-for-menu -->
			<script>
					$("span.menu").click(function() {
						$("ul.nav1").slideToggle(300, function() {
							// Animation complete.
						});
					});
				</script>
			<!-- /script-for-menu -->
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<!-- //container -->