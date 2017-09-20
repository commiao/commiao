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
<title>${webTitle} | 主页</title>
<body>
<div id="home" class="banner a-banner">
	<!-- banner -->
		<%@ include file="/layout/banner.jsp"%>
	<!-- //banner -->
	<!-- banner-bottom -->
		<%@ include file="/layout/banner-bottom.jsp" %>
	<!-- banner-bottom -->
</div>	
	<!-- main -->
		<%@ include file="/layout/main.jsp"%>
	<!-- //main -->
	<!-- footer -->
	<%@ include file="/layout/footer.jsp" %>
	<!-- //footer -->		
</body>
</html>