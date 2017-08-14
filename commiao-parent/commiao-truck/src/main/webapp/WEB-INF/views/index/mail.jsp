<%@page contentType="text/html;charset=UTF-8"%>
<%@ include file="/global/global-index.jsp"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<title>${webTitle} | 客服</title>
<body>
<div id="home" class="banner a-banner">
	<!-- banner -->
		<%@ include file="/layout/banner.jsp"%>
	<!-- //banner -->
</div>
	<!-- mail -->
	<div class="mail">
		<!-- container -->
		<div class="container">
			<div class="mail-grids">
				<div class="col-md-6 mail-grid-left wow fadeInLeft animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
					<h3>联系我们</h3>
					<h5>期待您的建议 <span>欢迎您的联系 </span></h5>
					<h4>总部地址</h4>
					<p>河南省漯河市G107国道叶岗村明德小学对面 <span>顺通汽修站</span></p>
					<h4>加入我们</h4>
					<p>手机: 139 3954 5728
						<span>电话: 0395-2176083</span>
						邮箱: <a href="mailto:info@example.com">jingcongde@commiao.com</a>
					</p>
				</div>
				<div class="col-md-6 contact-form wow fadeInRight animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
					<form>
						<input type="text" placeholder="称呼" required="">
						<input type="text" placeholder="邮箱" required="">
						<input type="text" placeholder="主题" required="">
						<textarea placeholder="内容" required=""></textarea>
						<input type="submit" value="发送">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!-- //container -->
	</div>
	<!-- //mail -->
	<!-- footer -->
		<%@ include file="/layout/footer.jsp" %>
	<!-- //footer -->
</body>
</html>