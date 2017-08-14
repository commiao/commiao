<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${user.roles==1 }">
	<c:set var ="zhLeftId" value="4"/></c:if>
<c:if test="${user.roles==2 }">
	<c:set var ="zhLeftId" value="5"/></c:if>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx }lyun/css/lk.css" rel="stylesheet" type="text/css"/>
<link href="${ctx }lyun/css/account.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><%=com.zkbc.core.consts.CommonDef.WEBISITE_TITLE%></title>
<%-- Fixed bug#20131215001(此文件为jquery1.3.2，不知为何改了文件名。此文件与global.jsp中的jquery版本冲突)
<script type="text/javascript" src="${ctx}/js/slither.js"></script><!--成功故事 滑动门-->
--%>
<script type="text/javascript">
$(function() {
	var d=new Date()
	$.getJSON('${ctx}payAccountReady.action?version='+d.getTime(), function(data) {
		if (data) {
			$('#payAccountReady').show();
		} else {
			$('#payAccountUnready').show();
		}
	});
	var aBtn=$('.bid_tabs').find('.bid_btn');
	var tabs=$('.tab_c');
	aBtn.click(function (){
		aBtn.removeClass('active');
		$(this).addClass('active');
		tabs.hide();
		tabs.eq($(this).index()).css('display','table');
	});
	$('.an_pro').each(function (index,ele){
		var oBtn=$(this).find('.yan_btn');
		var oY=$(this).find('.no_pre_box');
		oBtn.click(function (){
			if(oY.css('display')=='block'){
				oY.hide();
			}else{
				oY.show();
			};
		});
	});
	
});
</script>
<style type="text/css">
#payAccountReady,#payAccountUnready {
	display: none;
}
</style>
<style type="text/css">
#payAccountReady,#payAccountUnready {
	display: none;
}

.a_style_hover:hover{
	color:red;
}
</style>
<script type="text/javascript" src="${ctx}js/idCardNoValidate.js"></script>


</head>

<body>

	<!-- 头部 -->
	<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
	<!--******头部结束******-->
	<!--面包屑开始 -->
<div class="main">
	<div class="comWidth">
		<div class="breads comWidth"><a href="${ctx}index" title="">泽一贷首页</a><span>&gt;<span><a href="${ctx }accountInfo" title="">我的账户</a><span>&gt;<span><a href="javascript:;" title="" class="current_page">账户设置</a></span></span></div>
		<div class="container clearfix">

		<!--出借人账户首页-->
		<c:if test="${user.roles==1 }">
			<%@ include file="/WEB-INF/jsp/include/investorLeft.jsp"%></c:if>
		<c:if test="${user.roles==2 }">
			<%@ include file="/WEB-INF/jsp/include/borrowerLeft.jsp"%></c:if>
			
			<div class="count_right fr">
					<div class="account_box">
						<h3 class="settings">账户设置</h3>
						<div class="authen_box">
							<div class="anthen_item">
								<p class="anthen_tab">邮箱绑定</p>
								<div class="an_pro marb">
									<div class="an_progress"><span>已认证</span><strong>****${fn:substring(email,4,-1)}</strong></div>
								</div>
							</div>
							<div class="anthen_item">
								<p class="anthen_tab">手机认证</p>
								<div class="an_pro">
									<c:if test="${user.mobile!=null && user.mobile!=''}">
										<div class="an_progress">
											<span>已认证</span><strong>${fn:substring(user.mobile,0,2)}****${fn:substring(user.mobile,7,-1)}</strong>								
										</div>
									</c:if>
									<c:if test="${user.mobile==null || user.mobile==''}">
										<div class="an_nopro">
											<div class="no_pro clearfix"><span>未认证</span><input type="button" class="yan_btn fr" value="点击认证"></div>
											<div class="no_pre_box">
												<div class="count_pre tab_c" style="display:block;">
													<ul>
														<li class="clearfix">
															<span class="list_left fl">手机号码：</span><input type="text" id="mobilePhone" onblur="checkMobile()" value="" class="bid_num w240 fl">
														</li>
														<li class="clearfix">
															<span class="list_left fl">短信验证码：</span><input type="text" id="verifycode" value="" class="bid_num w170 fl" />
															<input id="getCodeButton" onclick="getVerifycodeMobile()" type="button"
																style="background:url(${ctx}images/btn_get.jpg) no-repeat;width:62px;height:27px;border:none;cursor:pointer;float:left;margin-top: 14px;" value="" />
															<div id="getCodeButtonInactive" style="margin-top: 14px;display:none;padding-right:16px;padding-top:3px;float:left; width:62px;height:27px;background:url('${ctx}images/btn_getInactive.gif') no-repeat 0px 3px;">
																<center>
																	<p id="num" style="line-height: 25px; font-weight: bold; color: white;">60</p>
																</center>
															</div>
	
														</li>
														<li class="clearfix">
															<span class="list_left fl">&nbsp;</span><input type="button" id="mobileCheckButton" onclick="bindMobile()" class="bid_btns" value="立即认证"/><font style="padding-left: 10px; padding-top: 2px;" color="red"><span id="mobilemessage"></span></font>
														</li>
													</ul>
												</div>
											</div>
										</div>
									</c:if> 
								</div>
							</div>
							<div class="anthen_item">
								<p class="anthen_tab">环迅支付</p>
								<div class="an_pro">
									<div class="an_progress" id="payAccountReady"><span>已认证</span></div>
									<span id="payAccountReady_span" style="display: none;"><p style="color: rgb(147, 147, 147); font-size: 12px; text-indent: 4em; margin-bottom: 10px; line-height: 16px;"><font color="red">温馨提醒：</font>1、IPS登录账号密码（环迅登陆账号密码）：该账号密码用户您登录环迅支付网站，查看账户信息<br /><font style="display: block; text-indent: 9em;">（注：环迅登陆账号与您的泽一贷注册账号相同，密码则另需设置）<br/></font> <font style="display: block; text-indent: 9em;">2、IPS交易密码（环迅交易密码）：该密码用于您交易（如充值、提现、投资项目等）时需输入。</font></p></span>
									<div class="an_nopro" id="payAccountUnready">
										<div class="no_pro marb clearfix"><span class="fl">未认证</span>
											<c:if test="${not empty user.mobile}">
												<input type="button" class="yan_btn fr" value="立即认证" />
											</c:if>
										</div>
										<p style="color: rgb(147, 147, 147); font-size: 12px; text-indent: 4em; margin-bottom: 10px;"><font>1、IPS登录账号密码（环迅登陆账号密码）：该账号密码用户您登录环迅支付网站，查看账户信息<font style="display: block;">（注：环迅登陆账号与您的泽一贷注册账号相同，密码则另需设置）</font><font style="display: block;">2、IPS交易密码（环迅交易密码）：该密码用于您交易（如充值、提现、投资项目等）时需输入。</font></font></p>
										<div class="an_nopro">
										<div id="ly_no_pre_box"  class="no_pre_box">
											<div class="count_pre tab_c" style="display:block;">
												<form action="/pay/ips/start-UserRegister" method="post" >
												
												<ul>
													<li class="clearfix">
														<span class="list_left fl">真实姓名：</span><input type="text"  value="${user.realName}" id="pRealName" name="payReqFromApp.realName" class="bid_num w240 fl">
													</li>
													<li class="clearfix">
														<span class="list_left fl">身份证号：</span>
														<input type="hidden"  value="${user.userId}" readonly="readonly"  name="payReqFromApp.userId" class="bid_num w240 fl"/>
														<input type="text"  value="${user.idCardNo}" id="pIdentNo" name="payReqFromApp.idNo" class="bid_num w240 fl"/>
													</li>
													<li class="clearfix">
														<span class="list_left fl">&nbsp;</span><input type="submit" class="bid_btns no_auth_button f16 fw white" value="立即认证"/>
														<font style="padding-left: 10px; padding-top: 2px;" color="red"><span id="fymessage"></span></font>
													</li>
												</ul>
												</form>
												
											</div>
										</div>
									</div>
									</div>
								</div>
							</div>
							<div class="anthen_item">
								<p class="anthen_tab">登录密码修改</p>
								<div class="an_pro">
									<div class="an_progress"><span>登录密码</span><strong>已设置</strong><input type="button" class="yan_btn fr" value="立即修改" /></div>
									<p style="color: #939393; margin-bottom: 10px; font-size: 12px; text-indent: 4em;"><font color="red">温馨提醒：</font>网站注册登录账号密码：该账号密码用于您登录泽一贷平台，查看账户中心各种信息。</p>
									<div class="an_nopro">
										<div class="no_pre_box">
											<div class="count_pre tab_c" style="display:block;width: 500px;">
												<ul>
													<li class="clearfix">
														<span class="list_left fl">原密码：</span><input type="password" value="" id="password" onblur="checkPass()" class="bid_num w240 fl">
													</li>
													<li class="clearfix">
														<span class="list_left fl">新密码：</span><input type="password" value="" id="password_regiest" onblur="checkNewPass()" class="bid_num w240 fl">
													</li>
													<li class="clearfix">
														<span class="list_left fl">确认新密码：</span><input type="password" value="" id="pdwuri" onblur="reCheckNewPass()" class="bid_num w240 fl">
													</li>
													<li class="clearfix">
														<span class="list_left fl">验证码：</span>
														<div class="yan_box fl"><input type="text" name="verifycode_password"
									style='font-family: "微软雅黑"; width: 135px; height: 34px; line-height: 34px\9;'
									id="verifycode_password" class="no_auth_input fl" /> <img class="fl" 
									align="absmiddle" alt="验证码" title="验证码" id="imgverCode_password"
									src="${ctx }registVerfyCode" onclick="coderefresh_password() " /></div>
													</li>
													<li class="clearfix">
														<span class="list_left fl">&nbsp;</span><input type="button" class="bid_btns" onclick="updateLoginPass()" value="立即认证">
														<font style="padding-left: 10px; padding-top: 2px;" color="red"><span id="loginPassMessage"></span></font>
													</li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="anthen_item">
								<p class="anthen_tab">银行卡</p>
								<div class="an_nopro">
									<c:if test="${bankcard!=null&&bankcard!=''}">
									<div class="an_progress"><span>已认证的银行卡：</span><strong>已认证的银行卡号为:****************${fn:substring(bankcard.cardNo,0,4)}</strong></div>
									</c:if>
									<c:if test="${bankcard==null||bankcard==''}">
										<div class="no_pro clearfix"><span>未认证</span></div>
									</c:if>
									<p style="color: #939393; margin-bottom: 10px; font-size: 12px; text-indent: 4em;"><font color="red">温馨提醒：</font>注册环迅账户后方可绑定银行卡。银行卡一旦绑定后本平台无法进行变更，如要变更请到环迅支付官网进行操作，以此保障用户的资金安全。基于账户安全考虑，该绑定的提现银行卡开户身份证必须与您注册时填写的身份证一致，否则无法提现。</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!--手机认证-->
				<script>
					function checkMobile() {
						if ($("#mobilePhone").val() == ""
								|| $("#mobilePhone").val() == null) {
							$("#mobilemessage").html("请先输入手机号");
							$("#mobilePhone").focus();
							return false;
						}
						if (!(/^1[3|4|5|7|8][0-9]\d{4,8}$/.test($("#mobilePhone")
								.val()))) {
							$("#mobilemessage").html("请输入正确的手机号");
							$("#mobilePhone").focus();
							return false;
						} else {
							$("#mobilemessage").html("");
							return true;
						}
					}
					function getVerifycodeMobile() {
						if (!checkMobile()) {
							return false;
						}
						$('#getCodeButton').attr('disabled', true);
						$.post("sendVerifyCodeWithNoForward", {
							"mobilePhone" : $("#mobilePhone").val()
						}, function(data) {
							if (data == 1) {
								$("#mobilemessage").html("验证码已发送");
								$("#getCodeButton").hide();
								$("#getCodeButtonInactive").show();
								$("#num").html(60);
								$('#getCodeButton').attr('disabled', false);
								$("#verifycode").focus();
								//$("#verifycode").val(data);
								jump(60);
							} else {

								$('#getCodeButton').attr('disabled', false);
								$("#mobilemessage").html(
										data == 2 ? "该手机号已被使用" : "发送失败");
								$("#mobilePhone").focus();
							}
						});

					}

					function jump(count) {
						window.setTimeout(function() {
							count--;
							if (count > 0) {
								$("#num").html(count);
								jump(count);
							} else {
								$("#getCodeButton").show();
								$("#getCodeButtonInactive").hide();
							}
						}, 1000);
					}

					function bindMobile() {
						if ($("#mobilePhone").val() == "") {
							$("#mobilemessage").html("请输入手机号");
							$("#mobilePhone").focus();
							return;
						}
						if ($("#verifycode").val() == "") {
							$("#mobilemessage").html("请输入验证码");
							$("#verifycode").focus();
							return;
						}
						$('#mobileCheckButton').attr('disabled', true);
						$.post("boundPhoneWithNoForward", {
							"mobilePhone" : $("#mobilePhone").val(),
							"verifycode" : $("#verifycode").val()
						},
								function(data) {
									if (data == 2) {
										mobile = $("#mobilePhone").val();
										$("#mobilemessage").html("手机绑定成功");
										$("#mobilePhone").val();
										$("#verifycode").val();
										window.setTimeout(function() {
											$("#no_auth_box1").hide();
										}, 1200);
										window.location.reload(true);
									} else if (data == 1) {
										$('#mobileCheckButton').attr(
												'disabled', false);
										$("#mobilemessage").html("手机验证码错误");
										$("#verifycode").val("");
										$("#verifycode").focus();
									} else {
										$('#mobileCheckButton').attr(
												'disabled', false);
										$("#mobilemessage").html("手机绑定失败");
										$("#verifycode").val("");
										$("#verifycode").focus();
									}
								});
					}
				</script>
				<!--登录密码-->
				<script>
					//原密码
					function checkPass() {
						var password = $("#password").val();
						if (password == "" || password == null) {
							$("#loginPassMessage").html("请输入原密码");
							return false;
						} else {
							$("#loginPassMessage").html("");
							return true;
						}
					}

					//新密码
					function checkNewPass() {
						var newpassword = $("#password_regiest").val();
						if (newpassword == "" || newpassword == null) {
							$("#loginPassMessage").html("请输入新密码");
							return false;
						} else if (newpassword.length < 6) {
							$("#loginPassMessage").html("密码不得小于6位");
							return false;
						} else {
							$("#loginPassMessage").html("");
							return true;
						}
					}
					//确认新密码
					function reCheckNewPass() {
						var renewpassword = $("#pdwuri").val();
						var newpassword = $("#password_regiest").val();
						if (renewpassword == "" || renewpassword == null) {
							$("#loginPassMessage").html("请再次输入新密码");
							return false;
						} else if (renewpassword != newpassword) {
							$("#loginPassMessage").html("两次密码不同");
							return false;
						} else {
							$("#loginPassMessage").html("");
							return true;
						}
					}

					function updateLoginPass() {
						if (checkPass() && checkNewPass() && reCheckNewPass()
								&& checkVerCode_password()) {
							var url = "${ctx}updatePassword";
							var oldPassword = $("#password").val();
							var newPassword = $("#password_regiest").val();
							var verifycode_password = $("#verifycode_password")
									.val();
							if(oldPassword == newPassword){
								$("#loginPassMessage").html("新旧密码一样");
								return;
							}
							$.post(url, {
								"verifycode_password" : verifycode_password,
								"oldPassword" : oldPassword,
								"newPassword" : newPassword
							}, function(data, varStatus) {
								if (data == "-1") {
									$("#loginPassMessage").html("原密码错误");
									coderefresh_password();
								} else if (data == "0") {
									$("#loginPassMessage").html("更新失败，请稍后再试");
									coderefresh_password();
								} else if (data == "1") {
									$("#loginPassMessage").html("修改成功");
									$("#password").val('');
									$("#password_regiest").val('');
									$("#pdwuri").val('');
									$("#verifycode_password").val('');
									window.setTimeout(function() {
										$("#no_auth_box3").hide();
									}, 1200);
								} else {
									$("#loginPassMessage").html(data);
									coderefresh_password();
								}
							}, "text");
						}
					}

					function coderefresh_password() { // 刷新验证码
						var id = document.getElementById("imgverCode_password");
						var d = new Date();
						id.src = '${ctx }registVerfyCode?a=' + d.getTime();
					}

					function checkVerCode_password() {
						var verifycode_password = $("#verifycode_password")
								.val();
						if (verifycode_password == null
								|| verifycode_password == "") {
							$("#loginPassMessage").html("请输入验证码");
							return false;
						} else {
							return true;
						}
					}
				</script>
	<!-- 尾部 -->
	<%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
	<script type="text/javascript">
	 
	$(function() {
		var paycheck = "${param.paycheck}";
		
		$.getJSON('${ctx}payAccountReady', function(data) {
			if (data) {
				$('#payAccountReady').show();
				$('#payAccountReady_span').show();
			} else {
				$('#payAccountUnready').show();
				
				
				var ly_mobile =  ${user.mobile};
				if(ly_mobile != null && ly_mobile != ""){
					
					if(paycheck != null && paycheck != "" && paycheck == "check"){
						$("#ly_no_pre_box").show();
						$("#pRealName").focus();
					}
				}
			}
			
		});
		
		
		$(".nav ul li:eq(4) a").attr("id", "ac_hover");
		$("h4").click(function() {
			$(this).addClass("slither_open");
			$(this).siblings().removeClass("slither_open");
			var $dangqian = $(".slither_close").eq($("h4").index(this));
			$dangqian.addClass("slither_open");
			$dangqian.siblings().removeClass("slither_open");

		});
	
		if ("${openAccMsg}" != null && "${openAccMsg}".length > 0) {
			alert("${openAccMsg}");
		}
		// 真实姓名校验
		var validateRealName = function() {
			var realName = $('#registerPayAccount [name="pRealName"]').val();
			if (!realName) {
				$('#fymessage').html('请输入真实姓名');
				return false;
			}

			$('#fymessage').html('');
			return true;
		};

		var validateIdCardNo = function() {
			var idCardNo = $('#registerPayAccount [name="pIdentNo"]').val();
			if (!idCardNo) {
				$('#fymessage').html('请输入身份证号');
				return false;
			}

			if (!idCardNoValidate(idCardNo)) {
				$('#fymessage').html('请输入正确的身份证号');
				return false;
			}

			$('#fymessage').html('');
			return true;
		};

		$('#registerPayAccount input[type="button"]').click(function() {
			if (validateIdCardNo() && validateRealName()) {
				$('#registerPayAccount').submit();
			}
		});
	});

		//充值失败消息提示
		<c:if test="${not empty message}">
			alert('${message}');
		</c:if>
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
</body>
</html>

