<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/back-global.jsp"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>主页&nbsp;|${webTitle }</title>
	</head>
	<body class="no-skin">
		<!-- #section:basics/navbar.layout -->
			<%@ include file="/layout/navbar.jsp"%>
		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>
			<!-- #section:basics/sidebar -->
				<%@ include file="/layout/sidebar.jsp"%>
			<!-- /section:basics/sidebar -->
			<!-- #main/content -->
				<%@ include file="/layout/content.jsp"%>
			<!-- /main/content -->

			<!-- #section:basics/footer -->
				<%@ include file="/layout/footer.jsp"%>
			<!-- /section:basics/footer -->
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

	</body>
</html>