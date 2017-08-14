<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %></title>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/center.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
$(function(){
	var ms='${messageSetup}'.split(',');
	$.each(ms,function(i,item){
		$('#'+$.trim(item)).attr('checked',true);
	});
});
function subForm(){
	$('#setupFrom').submit();
}

</script>
<style type="text/css">
label.margin{
	margin-left: 5px
}
</style>
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
  <div class="clearfix">

			<span class="account_span">消息中心</span>
			<div style="clear: both;"></div>
  	<div class="repayment">
    	<div class="slither">
			<h4 class="slither_open slither_radius fl">消息中心</h4>
			<h4 class="fl">消息设置</h4>
        </div>
        <div  class="slither_close slither_overflow slither_open">
        	<div class="mess_tit f14 fw black">请选择你接受的方式(<span class="orange fw f12"></span>)</div>
   		  <form action="${ctx}saveMessageSetup" name="setupFrom" id="setupFrom" method="post">
    			<table border="0" cellspacing="0" cellpadding="0" class="rep_tab">
               <tr>
                 <th colspan="4">资金消息设置</th>
               </tr>
				<tr>
                 <td>提交提现申请</td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin">站内信</label></td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin">邮件</label></td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin">短信</label></td>
               </tr>
               <tr>
                 <td>提现成功</td>
                 <td><input name="messageSetup" type="checkbox" id="mb1" value="mb1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="mb2" value="mb2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="mb3" value="mb3"/><label class="margin">短信</label></td>
               </tr>
               <tr>
                 <td>提现失败</td>
                 <td><input name="messageSetup" type="checkbox" id="mc1" value="mc1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="mc2" value="mc2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="mc3" value="mc3"/><label class="margin">短信</label></td>
               </tr>
               <tr>
                 <td>充值成功</td>
                 <td><input name="messageSetup" type="checkbox" id="me1" value="me1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="me2" value="me2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="me3" value="me3"/><label class="margin">短信</label></td>
               </tr>
               
              <%--  <c:if test="${user.roles == 1 }">
               <tr>
                 <th colspan="4">投资消息设置</th>
               </tr>
               <tr>
                 <td>投标成功</td>
                 <td><input name="messageSetup" type="checkbox" id="pa1" value="pa1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pa2" value="pa2"/><label class="margin">邮件</label></td>
                 <td></td>
               </tr>
               <tr>
                 <td>已投的标回款</td>
                 <td><input name="messageSetup" type="checkbox" id="pb1" value="pb1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pb2" value="pb2"/><label class="margin">邮件</label></td>
                 <td></td>
               </tr>
                <tr>
                 <td>已投的标流标</td>
                 <td><input name="messageSetup" type="checkbox" id="pc1" value="pc1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pc2" value="pc2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pc3" value="pc3"/><label class="margin">短信</label></td>
               </tr> 
               </c:if>
               <c:if test="${user.roles == 2 }">
               <tr>
                 <th colspan="4">借款消息设置</th>
               </tr>
               <tr>
                 <td>满标放款</td>
                 <td><input name="messageSetup" type="checkbox" id="pd1" value="pd1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pd2" value="pd2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pd3" value="pd3"/><label class="margin">短信</label></td>
               </tr>
               <tr>
                 <td>申请审核未通过</td>
                 <td><input name="messageSetup" type="checkbox" id="pe1" value="pe1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pe2" value="pe2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pe3" value="pe3"/><label class="margin">短信</label></td>
               </tr>
               <tr>
                 <td>申请审核通过</td>
                 <td><input name="messageSetup" type="checkbox" id="pi1" value="pi1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pi2" value="pi2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pi3" value="pi3"/><label class="margin">短信</label></td>
               </tr>
                <tr>
                 <td>流标</td>
                 <td><input name="messageSetup" type="checkbox" id="pf1" value="pf1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pf2" value="pf2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pf3" value="pf3"/><label class="margin">短信</label></td>
               </tr>
               <tr>
                 <td>提前3天还款</td>
                 <td><input name="messageSetup" type="checkbox" id="pj1" value="pj1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pj2" value="pj2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="pj3" value="pj3"/><label class="margin">短信</label></td>
               </tr>
               <tr>
                 <td>逾期通知</td>
                 <td><input name="messageSetup" type="checkbox" id="ph1" value="ph1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="ph2" value="ph2"/><label class="margin">邮件</label></td>
                 <td><input name="messageSetup" type="checkbox" id="ph3" value="ph3"/><label class="margin">短信</label></td>
               </tr>
               </c:if> --%>
               <tr>
                 <th colspan="4">网站消息设置</th>
               </tr>
               <tr>
                 <td>登录失败</td>
                 <td><input name="messageSetup" type="checkbox" id="wa1" value="wa1"/><label class="margin">站内信</label></td>
                 <td><input name="messageSetup" type="checkbox" id="wa2" value="wa2"/><label class="margin">邮件</label></td>
                 <td></td>
               </tr>
               <tr>
                 <td>修改登录密码</td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin" >站内信</label></td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin" >邮件</label></td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin" >短信</label></td>
               </tr>
               <tr>
                 <td>修改支付密码</td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin" >站内信</label></td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin" >邮件</label></td>
                 <td><img src="${ctx }images/reg_right.jpg"/><label class="margin" >短信</label></td>
               </tr>
               
             </table>
               <input class="recharge_btn white f14 fw fr" name="commit" id="commit" type="button" onclick="subForm()"  value="提  交">
               <span id="loading" class="fw" style="font-size: 15px;float: right;display: none;">正在提交请稍后<img src="${ctx }images/loading.gif" alt="正在提交请稍后" title="正在提交请稍后" width="30px" height="30px" /></span> 
          </form>
        </div>
       <div class="slither_close slither_overflow">
       	  <div class="mess_tit f14 fw black">请选择你接受的方式(<span class="orange fw f12"></span>)</div>
   		  <form action="${ctx}updateMessageSetup" name="setupFrom" id="setupFrom" method="post">
    			<table border="0" cellspacing="0" cellpadding="0" class="rep_tab">
               <tr>
                 <th>消息内容</th>
                 <th>站内信</th>
                 <th>短信</th>
                 <th>邮件</th>
               </tr>
                <tr>
                 <td>1</td>
                 <td>
                 	2
                 </td>
                 <td>
                 	3
                 </td>
                 <td>
                 	4
                 </td>
               </tr>
             </table>
               <input class="recharge_btn white f14 fw fr" name="commit" id="commit" type="button" onclick="updateMessageSetup()" value="提  交">
               <span id="loading" class="fw" style="font-size: 15px;float: right;display: none;">正在提交请稍后<img src="${ctx }images/loading.gif" alt="正在提交请稍后" title="正在提交请稍后" width="30px" height="30px" /></span> 
          </form>
	  </div>
   </div>
     </div>
  </div>
</div>

<!--===========foot============-->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>
