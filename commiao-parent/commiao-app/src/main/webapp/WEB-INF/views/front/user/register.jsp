<%@page import="java.net.URLDecoder"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%-- <%@ include file="/WEB-INF/jsp/global/global_new.jsp"%>
<link href="${ctx}lyun/css/register.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${ctx }js/yrycodeapi.js"></script>  --%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
</head>
  
  <%
  	String userRole = "1";
  	if(request.getParameter("userRole")!=null&&request.getParameter("userRole")!=""&&request.getParameter("userRole")!=" "){
  		userRole = request.getParameter("userRole");
  	}
  	if(!userRole.equals("1")&&!userRole.equals("2")){
  		userRole = "1";
  	}
  %>
<c:set value="<%=userRole %>" var="userRole"/>  
  <script>
  
  $(function (){
		$('.collect').each(function (index,ele){
			var _this=$(this);
			_this.click(function (){
				var aShow=$('.dis_div').eq(index);
				if(aShow.is(":visible")){
					aShow.hide();
					_this.val('展开规则');
				}else{
					aShow.show();
					_this.val('收起规则');
				};
			});
		});
	});
  function register() {
	 	var agreement = document.getElementById("agreement").checked;
	//	if(chekUsNamefor() && chekEmailfor() && chekPwdfor() && checkPWDui() && chekVerifyCode()){
	//	alert(chekUsNamefor());
	// 	alert(chekEmailfor());
	// 	alert(chekPwdfor());
	// 	alert(checkPWDui());
	//  alert(chekVerifyCode());
		if(chekUsNamefor() && chekEmailfor() && chekPwdfor() && checkPWDui() && chekVerifyCode() && chekInvitationCodefor()){
			
			if(agreement==false){
				//$("#msgagree").html("请同意本网站协议");
				//$("#msgagree").show();
				$(".btn_txt").html("请同意本网站协议"); 
				return false;
			}else{
				$(".btn_txt").html(""); 
				//$("#msgagree").html("");
				//$("#msgagree").hide();
				$("#registerUser").submit();
			}
		} else{
			return false;		
		}
  }
  
  var rsName = false;
  var bName;
  function chekUsNamefor() {	
	  $("#usernamediv").removeClass().addClass("item_list");
	  	var nkName = $.trim($("#nickname").val());
		if(bName!=nkName) {
			rsName = false;
		}
	    if(rsName) {
	    	return true;
	    }
	    bName = nkName;
		if (nkName == "" || nkName == null || nkName=='请输入用户名') {
			//$("#messagenkname").html("请输入账号");
			//$("#imgnkname").show();
			$(".btn_txt").html("请输入用户名"); 
			return false;
		}else if(GetLength(nkName)<4){
			//$("#messagenkname").html("账号长度过短");
			//$("#imgnkname").show();
			$(".btn_txt").html("用户名长度过短"); 
			return false;
		}else if(GetLength(nkName)>18){
			//$("#messagenkname").html("账号长度过长");
			//$("#imgnkname").show();
			$(".btn_txt").html("用户名长度过长"); 
			return false;
		}else if(nkName.match("^[\\d]")){
			//$("#messagenkname").html("不能以数字开头");
			//$("#imgnkname").show();
			$(".btn_txt").html("用户名不能以数字开头"); 
			return false;
		}else if(!stripscript(nkName)){
			//$("#messagenkname").html("只能是数字、字母或者中文");
			//$("#imgnkname").show();
			//$("#imgnkname").addClass("reg_erro");
			$(".btn_txt").html("用户名只能是数字、字母或者中文"); 
			return false;
		}else {
			//$("#messagenkname").html("");
			
		}
		var rs = ajaxNkname();
		if (rs == 1) {
				//$("#messagenkname").html("账号已存在！");
				//$("#imgnkname").show();
				$(".btn_txt").html("账号已存在！"); 
				return false;
		}else if(rs == 3){
			//$("#messagenkname").html("昵称非法！");
				//$("#imgnkname").show();
				$(".btn_txt").html("昵称非法！"); 
				return false;
		}else{
			$(".btn_txt").html("");
			//$("#messagenkname").html("可以注册");
			//$("#imgnkname").show();
		}
		rsName = true;
		return true;
	}
  
  	function chekInvitationCodefor(){
  		var invitationCode = $("#invitationCode").val();
  		invitationCode = $.trim(invitationCode);
  		var flag = false;
  		if(invitationCode!=""){
  			$.ajax({
  	  			type : "post",
  	  			async: false,
  	  			url : "/viCode",
  	  			data : {"invitationCode":invitationCode},
  	  			success : function(date){
  	  				if(date==0){
  	  					$(".btn_txt").html("邀请码不正确！"); 
  	  				}else{
  	  					flag = true;
  	  				}
  	  			}
  	  		});
  		}else{
  			flag = true;
  		}
  		return flag;
  	}
  
  	function ajaxNkname() { // 判断昵称是否重名
	    $.ajaxSetup({
				   async: false
				   });
		var url = "${ctx}existsNickName";
		var nkName = $("#nickname").val();
		var nickname = encodeURI(nkName);
		var rs = null;
		$.post(url, {"nickname" : nickname}, function(data, varStatus) {
		    rs = data;
		}, "text");
		
		return rs;
	}
  	
  	function GetLength(str){
		 var realLength = 0, len = str.length, charCode = -1;
	    for (var i = 0; i < len; i++) {
	        charCode = str.charCodeAt(i);
	        if (charCode >= 0 && charCode <= 128) realLength += 1;
	        else realLength += 2;
	    }
	    return realLength;
	} 
  
  	function stripscript(s){
		var pattern = "[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（） —|{}【】‘；：”“'。，、？\"]";
		for (var i = 0; i < s.length; i++) {
			var a = s.substr(i,1);
			if(pattern.indexOf(a)>-1){
				return false;			
			}
		}
		return true
	
	}
  	
  	function hideVide() {
  		$("#messagenkname").html("");
  		$("#usernamediv").removeClass().addClass("item_list focus");
  		var nkName = $.trim($("#nickname").val());
 	   	if(nkName=='请输入用户名') {
 		    $("#nickname").val("");
 	  	}
 	}
  
  	var rsEmail = false;
    var bEmail;
	function chekEmailfor() {
		$("#emaildiv").removeClass().addClass("item_list");
		var email = $("#Email").val();	
		if(bEmail!=email) {
			rsEmail = false;
		}
	    if(rsEmail) return true;
		var re = false;
		bEmail = email;
		var myReg = /^([-_A-Za-z0-9\.]+)@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/;
		if (email == "" || email == null || email=='请输入常用邮箱') {
			//$("#imgemail").show();
			//$("#messagemail").html("请输入Email");
			$(".btn_txt").html("请输入Email");  
			return re;
		} else if (email.length>32) {
			//$("#imgemail").show();
			//$("#messagemail").html("邮箱长度不超过于32位");
			$(".btn_txt").html("邮箱长度不超过于32位");  
			return re;
		} else if (!myReg.test(email)) {
			//$("#imgemail").show();
			//$("#messagemail").html("请输入正确 E-mail");
			$(".btn_txt").html("请输入正确 E-mail"); 
			return re;
		} else {
			//$("#imgemail").show();
			//$("#messagemail").html("可以注册");
			re = true;
		}
		var rs = restEmail();
		if(rs == true){
			//$("#messagemail").html("邮箱已存在");
			//$("#imgemail").show();
			$(".btn_txt").html("邮箱已存在"); 
			return false;
		}else{
			//$("#imgemail").show();
			//$("#messagemail").html("可以注册");
			rsEmail = true;
			return true;
		}
	}
  
	function restEmail(){    // 判断邮箱是否重名
	     $.ajaxSetup({
				   async: false
				   });
		var rs;
	   	var email = $("#Email").val();
	   	var url = "${ctx}existsEmail";
			$.post(url, {"email" : email}, function(data, varStatus) {
			    rs = data;
			}, "text");
		
		return rs;
	}
  
	function clearChekEmailfor(){
		$("#imgemail").hide();
		$("#emaildiv").removeClass().addClass("item_list focus");
	}
  
  
	function chekPwdfor() {
		$("#passworddiv").removeClass().addClass("item_list");
		var re = false;
		var pwd = document.getElementById("password");
		if (pwd.value == "" || pwd == null ) {
			//$("#messagePwd").html("请输入密码");
			//$("#imgepassword").show();
			$(".btn_txt").html("请输入密码");  
			return re;
		}else if(pwd.value.length<6||pwd.value.length>16){
			//$("#messagePwd").html("密码长度为6-16位");
			//$("#imgepassword").show();
			$(".btn_txt").html("密码长度为6-16位");  
			return re;
		}
		 else {
			//$("#messagePwd").html("可以使用");
			//$("#imgepassword").show();
			return true;
		}

	}
	
	function clearChekPwdfor(){
		$("#imgepassword").hide();
		$("#passworddiv").removeClass().addClass("item_list focus");
	}
	function clearChekPwdfor2(){
		$("#passworddiv2").removeClass().addClass("item_list focus");
	}
  
	function checkPWDui() {  //密码确认
		$("#passworddiv2").removeClass().addClass("item_list");
		var re = false;
		if(!chekPwdfor()){
			return re;
		}
		var PWDui = document.getElementById("pdwuri");
		var PWD = document.getElementById("password");
		if (PWDui.value == "" || PWDui == null) {
			//$("#imgepasswordsure").show();
			//$("#messagepwduri").html("请再次输入用户密码");
			$(".btn_txt").html("请再次输入用户密码");  
			return re;
		} else if (PWD.value != PWDui.value) {
			//$("#imgepasswordsure").show();
			//$("#messagepwduri").html("两次密码不一致请确认");
			$(".btn_txt").html("两次密码不一致请确认");   
			return re;
		} else if (PWD.value == PWDui.value) {
			//$("#messagepwduri").html("可以使用");
			//$("#imgepasswordsure").show();
			re = true;
			return re;
		} 
	}
	
	
	
	function chekVerifyCode(){ // 验证码输入提示
		var vCode = document.getElementById("verifycode");
		if(vCode.value==""|| vCode==null){
			$(".btn_txt").html("请输入验证码");
			//$("#messageverifycode").html("请输入验证码");
			//$("#imgeverifycode").show();
			return false;
		}else{
			$(".btn_txt").html("");
			//$("#messageverifycode").html("");
			//$("#imgeverifycode").show();
			return true;		
		}
	}
	
	function clearChekVerifyCode(){
			$("#imgeverifycode").hide();
	}
	
	function coderefresh() {  // 刷新验证码
		var id = document.getElementById("imgverCode");
		var d = new Date();
		id.src = '${ctx }registVerfyCode?a=' + d.getTime();
	}
	
  	function page() {

		var message = "${message}";
		var nickname = "<c:out value="${nickname}"></c:out>";
		var email = "<c:out value="${email}"></c:out>"
		var roles = "${roles}";

		if (message != "" && message != null) {
			<%-- 
			$("#nickname").css("color","black");
			$("#Email").css("color","black");
			--%>
			$("#nickname").val(nickname);
			$("#Email").val(email);
			$("#roles").val(roles);
			if(message=="验证码错误"){
				$(".btn_txt").html("验证码错误");
				//$("#messageverifycode").html("验证码错误");
				$("#imgeverifycode").show();
				<%--
				$("#imgeverifycode").addClass("reg_erro"); 
				--%>
			}
		} 
	}
  	
	// 注册按钮提交操作
	function register2() {
		var agreement = document.getElementById("agreement").checked;
		//var t1 = chekUsNamefor();
		//var t2 = chekEmailfor();
		//var t4 = chekPwdfor();
		//var t5 = checkPWDui();
		//var t6 = agreement;
		//var t7 = chekVerifyCode();
		//if (t1 && t2 && t4 && t5 && t6 && t7) {
		if(chekUsNamefor()&&chekEmailfor()&&chekPwdfor()&&checkPWDui()&&chekVerifyCode()){
			if(agreement==false){
				$("#msgagree").html("请同意本网站协议");
				$("#msgagree").show();
				$("#msgagree").addClass("reg_erro");
				return false;
			}else{
				$("#msgagree").html("");
				$("#msgagree").hide();
				$("#registerUser").submit();
			}
		} else{
			return false;		
		}
	}
	
	
	// 定义回车事件,响应注册按钮操作
	if (document.addEventListener) { // 如果是Firefox
		document.addEventListener("keypress", fireFoxHandler, true);
	} else {
		document.attachEvent("onkeypress", ieHandler);
	}

	function fireFoxHandler(evt) { // 如果是Firefox
		if (evt.keyCode == 13) {
			register();
		}
		//if (evt.keyCode == 9) {
		//	var id=$("input:focus").attr("id");
		//		alert(id);
		//}
	}

	function ieHandler(evt) {
		if (evt.keyCode == 13) {
			register();
		}
	}
	
	
	function openServiceItems(url){
        window.open(url, 'regconfirm', 'height=584,width=718,toolbar=yes,menubar=no,scrollbars=yes,resizable=false,location=no,status=no');
    	return true;
    }
  </script>
  
  <body onload="page()">
<!-- 头部 -->
<%@ include file="/WEB-INF/jsp/global/head.jsp"%>
<!--******头部结束******-->
<div class="regist">
	<div class="regist_top comWidth clearfix">
		<div class="regist_txt fr">
			<h3 class="regist_txt_bg"></h3>
			<form name="registerUser" id="registerUser" action="${ctx }register" method="post" >
				<input type="hidden" name="userRole" id="userRole" value="${userRole }"/>
				<div class="regist_box">
					<!--输入信息-->
					<ul class="regist_list">
						<li class="list clearfix">
							<span class="list_left fl">邮箱 ：</span>
							<div class="pl10 fl"><input type="text" placeholder="输入常用邮箱"  name="Email" id="Email" onfocus="clearChekEmailfor();if(this.value == this.defaultValue) this.value = ''"  onblur="chekEmailfor();if(this.value == '') this.value = this.defaultValue"  class="inp fl" /></div>
							<i>*</i>
						</li>
						<li class="list clearfix">
							<span class="list_left fl">用户名 ：</span>
							<div class="pl10 fl"><input type="text" placeholder="请输入用户名" name="nickname" id="nickname"  onfocus="hideVide();if(this.value == this.defaultValue) this.value = ''"  onblur="chekUsNamefor();if(this.value == '') this.value = this.defaultValue"  onkeyup="this.value=this.value.replace(' ','')"   class="inp fl" /></div>
							<i>*</i>
						</li>
						<li class="list clearfix">
							<span class="list_left fl">登录密码 ：</span>
							<div class="pl10 fl"><input type="password" placeholder="输入密码" name="password" id="password" class="inp fl" onblur="chekPwdfor()"  onfocus="clearChekPwdfor()"/></div>
							<i>*</i>
						</li>
						<li class="list clearfix">
							<span class="list_left fl">确认密码 ：</span>
							<div class="pl10 fl"><input type="password" placeholder="再次输入密码" name="pdwuri" id="pdwuri" class="inp fl" onblur="checkPWDui()" onfocus="clearChekPwdfor2()"/></div>
							<i>*</i>
						</li>
						<li class="list clearfix">
							<span class="list_left fl">邀请码 <font color="red">(选填)</font>：</span>
							<div class="pl10 fl"><input type="text" name="invitationCode" id="invitationCode" placeholder="请输入邀请码" class="inp fl" <c:if test="${!empty param.invitationCode }"> value="<%= URLDecoder.decode(request.getParameter("invitationCode"), "UTF-8") %>"  </c:if> onblur="chekInvitationCodefor();" ></div>
							<div class="yao_spe"><a href="${ctx }sendInvite" title="" class="jump_page">点击查看 什么是邀请码</a></div>
						</li>
						<li class="list clearfix">
							<span class="list_left fl">验证码 ：</span>
							<div class="fl">
								<div class="pl10 w90 fl"><input type="text" placeholder="验证码(默认)" name="verifycode" id="verifycode" class="inp fl" /></div>
								<a href="javascript:;" title="验证码" class="code fl"><img  style="width:61px;height:28px;" alt="验证码" title="验证码" id="imgverCode" src="${ctx }registVerfyCode" onclick="coderefresh() "  /></a>
								<a href="javascript:;" title="验证码" onclick="coderefresh()" class="refresh fl"></a>
							</div>
							<i>*</i>
						</li>
					</ul>
					<!--注册-->
					<div class="regist_btn">
						<div class="btn_box clearfix">
							<input style="margin-top: 8px;" type="checkbox" name="agreement" id="agreement" value="1" class="fl"/>
							<span class="clh fl">我已阅读并同意</span>
							<a href="Javascript:void(0)" onclick="openServiceItems('${ctx}service')" title="您是否同意服务条款" class="cll fl" >《律金所服务协议》</a>
							<span class="bitian">*为必填项</span>
						</div>
						<p class="btn_txt"></p>
						<input type="button" value="立即注册" onclick="register()" class="btn_this"/>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<!-- 注册页面已经不需要那么多的广告，故以下内容注释 -->
<%-- 
<div class="regist_bottom comWidth">
	<div class="regist_img">
		<img src="${ctx }lyun/imgs/process.jpg" alt="">
		<a href="${ctx }sendInvite" class="rule"></a>
	</div>
	<!--boon_box-->
	<div class="boon_box">
		<div class="boon_block">
			<div class="boon_top">
				<h3 class="boon_box_bg"></h3>
				<!--top-->
				<div class="top_txt_box money_bg">
					<div class="">
						<h3 class="top_title">现金券大礼包</h3>
						<div class="xxx">
							<p class="top_txt">活动期间凡注册完成手机认证<br>可获得10元现金红包</p>
						</div>
					</div>
				</div>
				<!--bottom-->
				<div class="boon_bottom">
					<div class="dis_div">
						<h3 class="boon_bottom_title">现金券使用规则</h3>
						<ul class="bottom_list">
							<li class="list">1、活动时间：2014年12月15日 - 2015年05月08日；</li> 
							<li class="list">2、注册的新用户可获赠现金抵用券大礼包一个；</li>
							<li class="list">3、现金券面额为10元，用户完成邮箱注册，手机认证和银行卡绑定即可获赠，具体现金券可在用户中心——我的红包页面查看；</li>
							<li class="list">4、用户需要进行投资，且单笔投资满2000元方可使用代金券代替现金进行投资，同时代金券显示为已经使用状态；</li>
							<li class="list">5、代金券有效期60天。60天内未使用状态改为已过期。</li>
						</ul>
					</div>
					<div class="collect_box">
						<input type="button" name="" value="展开规则" class="collect">
					</div>
				</div>	
			</div>
		</div>
	</div>	
	<!--boon_box-->
	<div class="boon_box">		
		<div class="boon_block">
			<div class="boon_top">
				<h3 class="boon_box_bg2"></h3>
				<!--top-->
				<div class="top_txt_box card_bg">
					<div class="">
						<h3 class="top_title">专属私人律师卡</h3>
						<p class="top_txt pd40 xxx">用户在完成平台邮箱注册和完成手机认证后<br>可获得律云法律云服务平台提供的专属私人律师卡</p>
					</div>
				</div>
				<!--bottom-->
				<div class="">
					<div class="boon_bottom bdb">
						<div class="dis_div">
							<div class="">
								<h3 class="boon_bottom_title">专属私人律师卡使用规则</h3>
								<div class="boon_bottom_txt">
									<h3 class="small_title">活动说明：</h3>
									<ul class="bottom_list new_border">
										<li class="list">1、注册的新用户可获赠由律云法律服务平台提供的私人律师年卡一张；</li> 
										<li class="list"> 2、私人律师卡价值为360元，用户在完成平台邮箱注册和完成手机认证后进行发放，具体现金券可在用户中心——我的律师卡<br>　 页面查看；</li>
										<li class="list">3、私人律师年卡需登录律云（www.lyun.com）激活后方可使用，激活说明及网址为<br>　http://www.lyun.com/openCard/openCard_o.htm，卡号及密码通过手机短信通知。</li>
									</ul>
								</div>
							</div>
							<div class="">
								<p class="explain">律云私人律师年卡服务内容：</p>
								<ul class="bottom_list new_border">
									<li class="list">1、服务卡激活之日一年内无限次通过电话和微信享受咨询服务，咨询电话：4000167167，律云微信服务号：<br>　 lyun4000167167；</li> 
									<li class="list">2、不限次下载由资深律师起草的个人不同领域法律范本；</li>
									<li class="list">3、不限次法律风险诊断服务；</li> 
									<li class="list">4、每周一次法律咨讯；</li>
									<li class="list">5、服务卡激活之日一年内享受法律服务可享受8.8折优惠。</li>
								</ul>
							</div>
						</div>
						<div class="collect_box">
							<input type="button" name="" value="展开规则" class="collect">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--boon_box-->
	<div class="boon_box">		
		<div class="boon_block">
			<div class="boon_top">
				<h3 class="boon_box_bg3"></h3>
				<!--top-->
				<div class="top_txt_box award_bg">
					<div class="">
						<h3 class="top_title">邀请好友，获得现金</h3>
						<p class="top_txt pd40 xxx">用户成功邀请好友注册<br>可同时额外获得10元现金红包 及好友投资收益4%现金奖励</p>
					</div>
				</div>
				<!--bottom-->
				<div class="">
					<div class="boon_bottom bdp">
						<div class="dis_div">
							<div class="">
								<h3 class="boon_bottom_title">邀请好友活动说明</h3>
								<div class="boon_bottom_txt">
									<ul class="bottom_list new_border2">
										<li class="list">1、每邀请一位好友注册，您将获得好友及好友邀请者投资总额一定比例的累计现金奖励返还。具体比例为1级被邀请人投资额5‰返利，2级被邀请人投资额3‰返利，3级被邀请人投资额1.5‰返利，4级被邀请人投资额0.5‰返利。</li>
										<li><div class="reg_img"></div></li>
										<li class="list">2、当月应得奖励金额将在次月4日（节假日顺延）由平台自动转账到相应账户，律金所承担转账手续费。</li>
										<li class="list">3、现金奖励上不封顶，多邀多得。</li>
										<li class="list">4、您在绑定银行卡之后，随时可在“我的账户”—“我的奖励”里查看邀请码以及实时奖励金额情况。</li>
									</ul>
								</div>
							</div>
							<div class="">
								<p class="explain">温馨提示：</p>
								<ul class="bottom_list new_border2">
									<li class="list">1、任何疑问可直接拨打客服电话：4006-676-888</li> 
									<li class="list">2、严禁用户恶意刷奖，一经发现，所得奖励不予承兑</li>
									<li class="list">3、律金所保有本次活动最终解释权。</li> 
								</ul>
							</div>
						</div>
						<div class="collect_box">
							<input type="button" name="" value="展开规则" class="collect">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
--%>
  <!-- 尾部 -->
  <%@ include file="/WEB-INF/jsp/global/bottom.jsp"%>
<!-- -->
</body>
</html>
