<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var ="zhLeftId" value="6"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE %></title>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/account.css" rel="stylesheet" type="text/css">

<!-- 
<script type="text/javascript">
$(document).ready(function() {
	$(".nav ul li:eq(5) a").attr("id","ac_hover");
	var table1='<table id="table1" border="0" cellspacing="0" cellpadding="0" class="rep_tab record_tab"></table>';
	var table2='<table id="table2" border="0" cellspacing="0" cellpadding="0" class="rep_tab record_tab"></table>';
	var table3='<table id="table3" border="0" cellspacing="0" cellpadding="0" class="rep_tab record_tab"></table>';
	if('${i1}'>0){
		$('#listDiv').append('<div class="mess_tit f14 fw black">今天(<span class="orange fw f12">${i1}</span>)</div>');
		$('#listDiv').append(table1);
	}
	if('${i2}'>0){
		$('#listDiv').append('<div class="mess_tit f14 fw black">昨天(<span class="orange fw f12">${i2}</span>)</div>');
		$('#listDiv').append(table2);
	}
	if('${i3}'>0){
		$('#listDiv').append('<div class="mess_tit f14 fw black">两天前(<span class="orange fw f12">${i3}</span>)</div>');
		$('#listDiv').append(table3);
	}
	$.each($.parseJSON('${list}'),function(i,item){
  		switch (item.timeOrder){
  		case 0: 
  			addDom('#table1',item);
  			break;
		case 1: 
			addDom('#table2',item);
			break;
		case -1: 
			addDom('#table3',item);
			break;
  		}
  			
  	});
	$('#oppClick').click(function(){
		$('#listDiv input[name=mcb]').each(function(){
			this.checked =!this.checked ;
      	});
		$('#checkAll').attr('checked',false);
	});
	$('#markedRead').click(function(){
		updateMsg('markedRead');
	});
	$('#markedNoRead').click(function(){
		updateMsg('markedNoRead');
	});
	$('#deleteMsg').click(function(){
		var readId=validation();
		if(readId==""){return ;}
		art.dialog({
			id: 'delDialog',
			title:'系统提示',
		    content: '是否确定删除选中的站内信!',
		    ok: function () {
		    	updateMsg('delInnerMail');
		    },
		    cancelVal: '关闭',
		    cancel: true //为true等价于function(){}
		});
	});
	$('#spanCheckAll').click(function(){
		$('#listDiv input[name=mcb]').each(function(){
            this.checked = true;
      	});
	});
	
//
 $("h4").click(function() {
  $(this).addClass("slither_open");
  $(this).siblings().removeClass("slither_open");
  var $dangqian = $(".slither_close").eq($("h4").index(this));
  $dangqian.addClass("slither_open");
  $dangqian.siblings().removeClass("slither_open");
 });
});

function addDom(tables,item){
	 var trStr='<tr class="'+(item.isread==false?'fw':'')+'"><td width="50"><input type="checkbox" name="mcb" onclick="mcbClick(this)"   value="'+item.id+'" /></td><td width="50">'+messageType(item.messageType)+'</td><td width="200">'+item.sendtime+
		 '</td><td width="90">'+item.senderName+'</td><td><a href="javascript:toMsgDetail('+item.id+')"><span class="fl">'+item.title+'</span></a></td></tr>';
	 $(tables).append(trStr);
}
function messageType(mt){
	var obj = {
			'101' : '投资成功',
			'102' : '新回款',
			'103' : '资金解冻',
			'104' : '出借成功',
			'105' : '留言回复',
			'199' : '其他',
			'201' : '成功满额',
			'202' : '审核未通过',
			'203' : '借款项目未满额',
			'204' : '还款提醒',
			'205' : '逾期通知',
			'206' : '审核通过',
			'299' : '其他'
		};
	return obj[mt]==undefined?'站内信':obj[mt];
}
function topage(pageNow) {
	var form = document.forms["messageForm"];
	form.page.value = pageNow;
	form.submit();
}
function mcbClick(dom){
	if(!dom.checked){
		$('#checkAll').attr('checked',false);
	}
}

function updateMsg(methods){
	var readId=validation();
	if(readId==""){
		return;
	}
	$.ajax({
		type:"POST",
		url:"${ctx }"+methods,
		data:"readId="+readId,
		dataType:"text",
		success:function(res){
			switch (methods) {
			case "delInnerMail":
				window.location.reload();			
				break;
			case "markedRead":
				window.location.reload();			
				break;
			case "markedNoRead":
				window.location.reload();			
				break;
			default:
				break;
			}
		}
	});
}
function validation(){
	var readId="";
	$('#listDiv input[name=mcb]').each(function(){
		if(this.checked){
			readId=readId+this.value+",";
		}
  	});
	if(readId==""){
		art.dialog({
			lock:true,
			title:"系统消息",	
		    content:"请选择至少一条要操作的站内信!",
		    ok:true
		});
		return readId;
	}
	return readId;
}
function toMsgDetail(msgId){
	window.location.href="${ctx }toMsgDetailPage?readId="+msgId;
}
function updateMessageSetup(){
	var selectedItems= new Array();
	$("input[name='messageSetup']:checked").each(function(){
		selectedItems.push($(this).val());
	});
	$('#commit').hide();
	$('#loading').show();
	$.ajax({
		type:"POST",
		url:$('#setupFrom').attr('action'),
		data:'messageSetup='+selectedItems.join(','),
		dataType:"text",
		success:function(res){
			if(res>0){
				art.dialog({icon:'succeed',content:'保存成功!',follow:$('#setupFrom')[0] ,time:1});
			}else{
				art.dialog({icon:'succeed',content:'保存失败!',follow:$('#setupFrom')[0],time:1});
			}
			$('#commit').show();
			$('#loading').hide();
		},
		error:function(msg){
			art.dialog({icon:'succeed',content:'保存失败1!',follow:$('#setupFrom')[0],time:1});
			$('#commit').show();
			$('#loading').hide();
		}
	});/**/
}
$(function(){
	var ms='${messageSetup}'.split(',');
	$.each(ms,function(i,item){
		$('#'+$.trim(item)).attr('checked',true);
	});
});
</script>
<style type="text/css">
label.margin{
	margin-left: 5px
}
</style> -->
</head>

<body>
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>


<div class="main">
	<div class="comWidth">
		<div class="breads comWidth"><a href="${ctx}index" title="">律金所首页</a><span>&gt;<span><a href="${ctx }accountInfo" title="">我的账户</a><span>&gt;<span><a href="javascript:;" title="" class="current_page">奖励管理</a></span></span></div>
		<div class="container clearfix">
			<c:if test="${user.roles == 1 }">
		        <%@ include file="/WEB-INF/jsp/include/investorLeft.jsp"%>
	        </c:if>
	        <c:if test="${user.roles == 2 }">
		        <%@ include file="/WEB-INF/jsp/include/borrowerLeft.jsp"%>
	        </c:if>
			<div class="count_right fr">
				<div class="summary reeard">
					<h3 class="sum_title clearfix">邀请奖励<span class="watch_my fr">查看我的投资劵</span></h3>
					<div class="sum_list">
						<ul class="clearfix">
							<li>
								<p class="reward_title">通过社交网站邀请好友</p>
								<div class="share_links"><a href="javascript:;" title="" class="links1"></a><a href="javascript:;" title="" class="links2"></a><a href="javascript:;" title="" class="links3"></a><a href="javascript:;" title="" class="links4"></a></div>
							</li>
							<li>
								<div class="re_txt">通过社交网站每成功邀请一位好友投资您可获50元投资劵，上不封顶！</div>
							</li>
							<li>
								<p class="reward_title">通过社交网站邀请好友</p><input type="button" class="ctrl_v" value="复制链接">
							</li>
							<li>
								<div class="re_txt">复制链接发给好友，每成功邀请一位好友投资，您可获50元投资，上不封顶！</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="summary">
					<h3 class="sum_title">邀请列表</h3>
					<div class="">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="bid_table" style="display:table;">
							<tbody>
								<tr class="dott_bor">
									<td>邀请用户</td>
									<td>用户注册时间</td>
									<td>用户状态</td>
									<td>邀请奖励</td>
									<td>是否生效</td>
								</tr>
								<tr class="dott_bor">
									<td style="height:300px;width: 100%" colspan="5" align="center">还没有记录</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="no_nums">暂无邀请记录</div>
					<div class="h_20"></div>
					<div class="tips">
						<h3 class="tips_title">温馨提示：</h3>
						<p class="tips_text">邀请奖励投资劵，只有被邀请人注册并投资后（不包括 投资债权），奖励的投资劵才生效；<br>邀请奖励无上限，邀请越多，奖励越多； <br>请不要随意邀请您不熟悉的人，避免给别人带来不必要的困扰；<br>使用过程中遇到问题，请联系客服，4006-676-888</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<%--
<!-- ====头部结束==== -->
	<!--面包屑开始 -->
<div class="breads comWidth"><a href="#" title="">我的账户</a><span>&gt;</span><a href="#" title="">奖励中心</a><span>&gt;</span></div>

	<!--面包屑结束 -->
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
        	<form name="messageForm" id="messageForm" action="${ctx }toMessagePage" method="post">
        	<div class="message_tit">
            	<div class="mess_lefttit">
                	<span class="mess_box" id="spanCheckAll">
                    	<a href="javascript:void(0)">全选</a>
                    </span>	
                    <span class="mess_box" id="oppClick">
                    	<a href="javascript:void(0)">​反选 ​</a>​
                    </span>
                    <span class="mess_box" id="markedRead">
                    	<a href="javascript:void(0)">​已读 ​</a>
                    </span>
                    <span class="mess_box" id="markedNoRead">
                    	<a href="javascript:void(0)">未读 ​</a>
                    </span>
                </div>
                <div class="mess_ritit">
                    <span class="shachu"><a href="javascript:void(0)" id="deleteMsg"  title="删除"></a></span>
                </div>
           </div>
           <div id="listDiv"></div>
            <%@ include file="/WEB-INF/jsp/include/zkbc/page_message.jsp"%> 
           </form>
        </div>
       <div class="slither_close slither_overflow">
       	  <div class="mess_tit f14 fw black">请选择你接受提醒的方式</div>
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
             <%--   <c:if test="${user.roles == 1 }">
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
               </c:if>
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
               <div style="width: 100%"  align="center" >
               <input class="recharge_btn white f14 fw" name="commit" id="commit" type="button" onclick="updateMessageSetup()"  value="提  交">
               <span id="loading" class="fw" style="font-size: 15px;display: none;">正在提交请稍后<img src="${ctx }images/loading.gif" alt="正在提交请稍后" title="正在提交请稍后" width="30px" height="30px" /></span>
               </div>
                
          </form>
	  </div>
   </div>
   </div>
  </div>
</div>
 --%>
<!--===========foot============-->
<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
</body>
</html>
