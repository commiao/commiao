<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信P2P系统-我得账户</title>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	<h2>富友注册</h2><br/>
	<form id="fyWebReg"  action="http://www-1.fuiou.com:9057/jzh/webReg.action" method="post">
				<input type="hidden" name="mchnt_cd" value="0002900F0041270" /><br/>
				<input type="hidden" name="mchnt_txn_ssn" value="2974328913kshdkassasas" /><br/>
				<input type="hidden"  name="page_notify_url" value="http://www.huixinjinan.com"/><br/>
				<input type="hidden"  name="back_notify_url" value="http://101.200.197.219:8080/fuyou/fanhui"/><br/>
				<input type="hidden"  name="certif_tp" value="0"/><br/>
				<input type="hidden"  name="user_id_from" value=""/><br/>
				
				手机号：<input type="text"  name="mobile_no" value="13120367188"/><br/>
				客户姓名：<input type="text"  name="cust_nm" value="小樱"/><br/>
				身份证号码：<input type="text"  name="certif_id" value="370883198805124290"/><br/>
				邮箱：<input type="text"  name="email" value="380283976@qq.com"/><br/>
				开户行地区代码：<input type="text"  name="city_id" value="1000"/><br/>
				开户行行别：<input type="text"  name="parent_bank_id" value="0308"/><br/>
				开户行支行名称：<input type="text"  name="bank_nm" value="招商银行股份有限公司北京西翠路支行"/><br/>
				帐号：<input type="text"  name="capAcntNo" value="6214830105736935"/><br/>
				
		<input type="button" onClick="javascript:webReg();"  value="提交注册"/>
	</form>
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
<script language="javascript">
function webReg(){
	$("#fyWebReg").submit();
}
	
</script>