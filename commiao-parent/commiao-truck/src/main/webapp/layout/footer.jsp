<%@page contentType="text/html;charset=UTF-8"%>
<!-- footer -->
<div class="footer">
	<!-- container -->
	<div class="container">
		<div class="col-md-6 footer-left  wow fadeInLeft animated"
			data-wow-delay="0.4s"
			style="visibility: visible; -webkit-animation-delay: 0.4s;">
			<ul>
				<li><a href="${weBase }/index/front">主页</a></li>
				<li><a href="${weBase }/index/about">关于</a></li>
				<li><a href="${weBase }/index/services">服务</a></li>
				<!-- 
				<li><a href="${weBase }/index/blog">博客</a></li>
				 -->
				<li><a href="${weBase }/index/mail">客服</a></li>
			</ul>
			<form>
				<input type="text" placeholder="电子邮箱" required=""> <input
					type="submit" value="提交">
			</form>
		</div>
		<div class="col-md-3 footer-middle wow bounceIn animated"
			data-wow-delay="0.4s"
			style="visibility: visible; -webkit-animation-delay: 0.4s;">
			<h3>地址</h3>
			<div class="address">
				<p>
					河南省漯河市G107国道叶岗村明德小学对面 <span>顺通汽修站</span>
				</p>
			</div>
			<div class="phone">
				<p>13939545728</p>
			</div>
		</div>
		<div class="col-md-3 footer-right  wow fadeInRight animated"
			data-wow-delay="0.4s"
			style="visibility: visible; -webkit-animation-delay: 0.4s;">
			<a href="#"><img src="${weBase }/images/logo.png" alt="" /></a>
			<p>&nbsp;</p>
		</div>
		<div class="clearfix"></div>
	</div>
	<!-- //container -->
</div>
<!-- //footer -->
<div class="copyright">
	<!-- container -->
	<div class="container">
		<div class="copyright-left wow fadeInLeft animated"
			data-wow-delay="0.4s"
			style="visibility: visible; -webkit-animation-delay: 0.4s;">
			<p>漯河市顺通汽车维修服务站&nbsp;&copy;2016&nbsp;</p>
		</div>
		<div class="copyright-right wow fadeInRight animated"
			data-wow-delay="0.4s"
			style="visibility: visible; -webkit-animation-delay: 0.4s;">
			<ul>
				<!-- 
							<li><a href="#" class="twitter"> </a></li>
							<li><a href="#" class="twitter facebook"> </a></li>
							<li><a href="#" class="twitter chrome"> </a></li>
							<li><a href="#" class="twitter pinterest"> </a></li>
							<li><a href="#" class="twitter linkedin"> </a></li>
							<li><a href="#" class="twitter dribbble"> </a></li>
						 -->
			</ul>
		</div>
		<div class="clearfix"></div>
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

				$().UItoTop({
					easingType : 'easeOutQuart'
				});

			});
		</script>
		<a href="#home" id="toTop" class="scroll" style="display: block;">
			<span id="toTopHover" style="opacity: 1;"> </span>
		</a>

	</div>
	<!-- //container -->
</div>