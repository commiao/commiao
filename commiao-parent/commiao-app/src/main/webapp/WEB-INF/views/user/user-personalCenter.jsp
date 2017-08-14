<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人中心</title>
<script type="text/javascript">
	//===========================点击展开关闭效果====================================
	function openShutManager(oSourceObj, oTargetObj, shutAble, oOpenTip,
			oShutTip) {
		var sourceObj = typeof oSourceObj == "string" ? document
				.getElementById(oSourceObj) : oSourceObj;
		var targetObj = typeof oTargetObj == "string" ? document
				.getElementById(oTargetObj) : oTargetObj;
		var openTip = oOpenTip || "";
		var shutTip = oShutTip || "";
		if (targetObj.style.display != "none") {
			if (shutAble)
				return;
			targetObj.style.display = "none";
			if (openTip && shutTip) {
				sourceObj.innerHTML = shutTip;
			}
		} else {
			targetObj.style.display = "block";
			if (openTip && shutTip) {
				sourceObj.innerHTML = openTip;
			}
		}
	}
</script>
<script type="text/javascript">
	/* 身份证认证 */
	function IdCardVerify() {
		if ($('#cardNumber').val().length > 0
				&& $('#realName').val().length > 0) {
			//提交后台
			$
					.ajax({
						type : "POST",
						url : '${base}/' + 'portaluser/IdCardVerify',
						data : {
							cardNumber : $('#cardNumber').val(),
							realName : $('#realName').val(),
							userid : '${loginUser.userId}'
						},
						contentType : "application/x-www-form-urlencoded; charset=utf-8",
						dataType : 'json',
						cache : false,
						success : function(data) {
							top.location.reload();
							alert(data);
						}
					});
		} else {
			alert("身份证号和真实姓名不能为空");
		}
	}
</script>
<!--手机认证-->
<script type="text/javascript">
	function bindMobile() {
		if ($("#mobilePhone").val() == "") {
			$("#mobilemessage").html("请输入手机号");
			$("#mobilePhone").focus();
			return;
		}
		//提交后台
		$.ajax({
			type : "POST",
			url : '${base}/' + 'portaluser/verifyMobile',
			data : {
				mobilePhone : $('#mobilePhone').val(),
				verifycode : $('#verifycode').val(),
				userid : '${loginUser.userId}'
			},
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			dataType : 'json',
			cache : false,
			success : function(data) {
				if (data.length > 6) {
					alert(data);
				} else {
					top.location.reload();
					alert(data);
				}

			}
		});
	}
</script>



<script type="text/javascript">
	//邮箱认证
	function emailVerify() {
		var emailValue = $('#email').val();
		if (emailValue.length > 0) {
			$
					.ajax({
						type : "POST",
						url : '${base}/' + 'userRegist/isEmailExists',
						data : {
							email : emailValue
						},
						contentType : "application/x-www-form-urlencoded; charset=utf-8",
						dataType : 'json',
						cache : false,
						success : function(data) {
							if (data) {
								alert(data);
							} else {
								//提交后台
								$
										.ajax({
											type : "POST",
											url : '${base}/'
													+ 'portaluser/emailVerify',
											data : {
												email : emailValue,
												userid : '${loginUser.userId}'
											},
											dataType : 'json',
											cache : false,
											success : function(data) {
												window.location.reload();
												alert(data);
											}
										});
							}
						}
					});
		} else {
			alert("邮箱名不能为空");
		}
	}
</script>
</head>
<body>

<!-- 头部 -->
<%@ include file="/global/head.jsp"%>
<!--******头部结束******-->

<div class="main clearfix">
  <!--出借人账户首页-->
  <div class="picker"><span><a href="${ctx }index">首页</a></span> > <span class="gray_txt"><a href="#">我的账户</a></span> > <a>账户设置</a></div>
     <div class="install_tit black fw f16">手机认证</div>
     <c:if test="${loginUser.userMobile eq null || loginUser.userMobile.status eq 10000000}">
     <div class="no_auth">
    	<span id="mobileOk" class="no_authtit f14 fw black">未认证</span>
        <span class="no_authtit_r f14 fw red f_w100"><a href="javascript:void(0)" onclick="openShutManager(this,'no_auth_box1')">点击认证</a></span>
    
    	<div class="no_auth_box f14 fw" id="no_auth_box1" style="display:none;">
    	<dl>
        	<dt>手机号码：</dt>
            <dd><input maxlength="11"  id="mobilePhone" type="text" class="no_auth_input" onblur="checkMobile()"/></dd>
            <dt>短信验证码：</dt>
            <dd class="f_w100">
            	<input type="text" id="verifycode" style="width: 150px;" class="no_auth_input" />
				<input id="getCodeButton" onclick="getVerifycodeMobile()" type="button" style="background:url(${ctx}images/btn_get.jpg) no-repeat;width:62px;height:27px;border:none;cursor:pointer;" value="" />
				<div id="getCodeButtonInactive" style="display:none;padding-right:16px;padding-top:3px;float:right; width:62px;height:27px;background:url('${ctx}images/btn_getInactive.gif') no-repeat 0px 3px;">
				<center><p id="num" style="line-height:25px;font-weight:bold;color:white;">60</p></center>
				</div>
            </dd>
            <dt></dt>
            <dd><input id="mobileCheckButton" type="button" class="no_auth_button f16 fw white" value="认证" style="cursor:pointer;" onclick="bindMobile()"/>
            <font style="padding-left: 10px;padding-top: 2px;" color="red"><span id="mobilemessage"></span></font>
            </dd>
        </dl>
     </div>
    </div>
    </c:if>
     <c:if test="${loginUser.userMobile.status eq 10000001}">
     <div class="no_auth">
         <span class="no_authtit  seccess f14 fw black">已认证</span>
         <span class="f14 fw success_txt">${fn:substring(loginUser.mobile,0,2)}****${fn:substring(loginUser.mobile,7,-1)}</span>
     </div>
	</c:if>
    <!--隐藏的文件-->
    
    
    <br/><br/><br/>
  	 <!--邮箱绑定-->
    <div class="install_tit black fw f16">邮箱绑定</div>
     <div class="no_auth">
         <c:if test="${loginUser.userEmail.status eq 10000001 && loginUser.userEmail.emailStatus eq 1}">已认证且已激活
         <br/><span class="f14 fw success_txt">${loginUser.email} 已激活</span>
         </c:if>
         
         <c:if test="${loginUser.userEmail.emailStatus eq 0}">已认证但没有激活
         <br/><span class="f14 fw success_txt">${loginUser.email} 没有激活 ,请登录邮箱激活</span>
         </c:if>
         
    	 <c:if test="${loginUser.email eq null }">未认证
    		<span class="f14 fw success_txt">${loginUser.email}</span>
    		<br/>
	   		<div class="no_auth">
			        邮箱：<input id="email" type="text" name="email" value="" /><br/>
		     </div>
			<input  type="button" value="邮箱认证" onclick="emailVerify();"/>
    	</c:if>
    	
     </div>

		<br/><br/><br/>
		<!--身份证认证-->
   	 	<div class="install_tit black fw f16">身份证认证</div>
	    <div>
	   		<c:if test="${loginUser.cardNumber != 0}">已认证
	   		<br/> 身份证号 ：${loginUser.cardNumber}
	   		</c:if>
	   		<c:if test="${loginUser.cardNumber == null}">未认证
	   		<br/>
	   		<div class="no_auth">
			        身份证号：<input id="cardNumber" type="text" name="cardNumber" value="" /><br/>
			        真实姓名：<input id="realName" type="text" name="realName" value="" />
		     </div>
			<input  type="button" value="身份证认证" onclick="IdCardVerify();"/>
	   		</c:if>
	    </div>
     
	<br/><br/><br/>

	<h2>个人中心</h2>
	<a href="javascript:();">充值</a>
	<a href="javascript:();">提现</a>
	<a href="javascript:invest_list();">点击投资</a>
	<a href="javascript:invest_list();">点击还款</a>
	<a href="javascript:back_index();">返回首页</a>
	<br/><br/><br/><br/><br/><br/><br/>
</div>	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
