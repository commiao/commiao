<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String basePath = request.getContextPath();
String resourcesPath = basePath+"/resources";
String port = request.getServerPort()==80?"":":"+request.getServerPort();
%>
<c:set var="weBase" value="<%=basePath %>"/>
<c:set var="reBase" value="<%=resourcesPath %>"/>
<c:set var="webTitle" value="咔姆喵"/>
<c:set var="moneyexp" value="#,##0.00#"></c:set>
<c:set var="moneyexpInt" value="#"></c:set>
<script type="text/javascript">

</script>