<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %></title>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/center.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
$(document).ready(function() {
  $("h4").click(function() {
  $(this).addClass("slither_open");
  $(this).siblings().removeClass("slither_open");
  var $dangqian = $(".slither_close").eq($("h4").index(this));
  $dangqian.addClass("slither_open");
  $dangqian.siblings().removeClass("slither_open");
  });
});
</script>
</head>

<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
<!-- ====头部结束==== -->
<div class="main clearfix">
  <!--出借人账户首页-->
	   <c:if test="${user.roles == 1 }">
	        <%@ include file="/WEB-INF/jsp/include/investorLeft.jsp"%>
        </c:if>
        <c:if test="${user.roles == 2 }">
	        <%@ include file="/WEB-INF/jsp/include/borrowerLeft.jsp"%>
        </c:if>
 <div class="account_right">
  <div class="txt clearfix">
 
			<span class="account_span">消息中心</span><!--<h1 class="tit_h1">消息中心</h1>-->
  	<div style="clear: both;"></div>
  	
  	<div class="repayment">
    	<div class="slither">
			<h4 class="slither_open fl open_ms">消息中心</h4>
			
            <span class="more fr"><a href="${ctx }toMessagePage"><img src="${ctx }images/reternpic.jpg" width="104" height="29" style="border-style: none;" /></a></span>
        </div>
        <div class="slither_close slither_overflow slither_open">
            	
           	  <div class="mes_ft f14"><span class="fr">${mb.sendDate}</span>${mb.sendName}</div>
           	  <div class="mes_new">
              	<p>　　${mb.content}</p>
              </div>
      	</div>
      </div>
      <!--账户流水-->
    </div>
  </div>
</div>

<!--===========foot============-->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>
