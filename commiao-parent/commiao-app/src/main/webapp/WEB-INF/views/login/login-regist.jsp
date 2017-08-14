<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信P2P系统</title>
<style type="">
#sendCode {
    width: 100px;
    height: 30px;
    background: #3DB1FA;
    border-radius: 3px;
    color: #ffffff;
    margin-bottom: 10px;
    cursor: pointer;
}
</style>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>

	<!--注册-->
    <div class="regbox">
    	<div class="reg">
        	<img src="${base}/resources/images/loginban.jpg" />
            <div class="reg_bg">
        <!--tag标题-->
                <ul class="reg_nav">
                    <li class="act">手机注册</li>
                    <li>邮箱注册</li>
                </ul>
            <!--二级菜单-->
                <div class="con">
	                    <div class="con1 cur">
	                    	<form id="mobileRegist" action="${base}/userRegist/mobileRegist" method="post">
			                	<!-- 由于有些字段存入数据库不能为空，所以先在此初始化 -->
			            		<input type="hidden" name="isGuarantorCompany"  value="10000000"/>
								<input type="hidden" name="isBorrowerCompany"  value="10000000"/>
								<input type="hidden" name="userStatus"  value="0"/>
								<input type="hidden" name="status" value="10000001"/>
								<input type="hidden" name="mobileId" id="mobileId" value=""/>
								<input type="hidden" name="registRand" id="registRand" value=""/>
		                        <input type="text" name="nickname" class="reg_user" placeholder="请输入用户名"/><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                        <input type="password" name="password" class="reg_pas" placeholder="请输入密码" /><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                        <input type="password" name="pdwuri" class="reg_pas" placeholder="请再次输入密码"/><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                        <input type="text" id="mobile" name="mobile" class="reg_user" placeholder="请输入手机号"/><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                        <input type="text" id="activeCode" name="activeCode" class="reg_yzm" placeholder="请输入验证码"/>
		                        <input id="sendCode" type ="button" onClick="javascript:bindMobile();" value="发送验证码"/><br>
		                        <input type="checkbox" class="agr" /><span> 我已阅读并同意<a class="xy" href="javascript:;">《互慧融服务协议》</a></span>
		                        <br><span class="xy" id="mobilemessage"></span>
		                        <a class="reg_btn" href="javascript:mobileRegister();">注 册</a>
	                    	</form>
	                    </div>
                 
                 	
	                    <div class="con1">
	                    	<form name="emailRegist" id="emailRegist" action="${base}/userRegist/emailRegist" method="post">
			                	<!-- 由于有些字段存入数据库不能为空，所以先在此初始化 -->
			            		<input type="hidden" name="isGuarantorCompany"  value="10000000"/>
								<input type="hidden" name="isBorrowerCompany"  value="10000000"/>
								<input type="hidden" name="userStatus"  value="0"/>
								<input type="hidden" name="status"  value="10000001"/>
		                    	<input type="text" name="nickname" class="reg_user" placeholder="请输入用户名"/><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                        <input type="password" name="password" class="reg_pas" placeholder="请输入密码" /><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                        <input type="password" name="pdwuri" class="reg_pas" placeholder="请再次输入密码"/><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                        <input type="text" name="email" class="reg_user" placeholder="请输入邮箱" onfocus="clearEmail_Val()" onblur="checkEmail()"/><b><img src="${base}/resources/images/right.jpg" width="15" /></b>
		                   
		                        <input type="text" class="reg_yzm1" placeholder="请输入验证码"/>
		                        <a href="javascript:;"><img src="${base}/resources/images/yzm.jpg" height="29"; class="em_yz"/></a>
		                        <a href="javascript:;" class="refresh" onclick="coderefresh()"></a>
		                        
		                        <p> <input type="checkbox" class="agr" /> 我已阅读并同意<a class="xy" href="javascript:;">《互慧融服务协议》</a></p>
		                       	<br><span class="xy" id="emailmessage"></span>
		                        <a class="reg_btn" href="javascript:emailRegister();">注 册</a>
	                    	</form>
	                    </div>
                </div>
            </div>
         </div>	
     </div>
     
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>

<script>
  //手机注册
  function mobileRegister() {
  		if($("#mobile").val() != "" && $("#activeCode").val() != "" && $("#registRand").val()!=""){
  			if($("#activeCode").val() == $("#registRand").val()){
  				$("#mobileRegist").submit();
  			}else{
  				alert('您输入的验证码不正确!');
  			}
  		}else{
  		   alert('请先输入手机号和收到的验证码后再提交');
  		}
  }
  
  /* 发送验证码 */
  function bindMobile(){
		if ($("#mobile").val().length == 0) {
			$("#mobilemessage").html("请输入手机号");
			$("#mobile").focus();
			return;
		}
		//提交后台
		$.ajax({
			type : "POST",
			url : '${base}/' + 'userRegist/verifyMobile',
			data : {
				mobilePhone : $('#mobile').val()
			},
			dataType : 'json',
			cache : false,
			success : function(data) {
				/* var mobileId = "mobileId";
				var msg = "msg";
				var error = "error"; */
				for ( var index in data) {
					if (index == "mobileId") {
						$('#mobileId').val(data[index]);
					} else if (index == "msg") {
						alert(data[index]);
					} else if (index == "registRand") {
						$('#registRand').val(data[index]);
					} else if (index == "error") {
						alert(data[index]);
					}
				}
			}
		});
	}

	//邮箱注册
	function emailRegister() {
		if (checkEmail()&& document.forms['emailRegist'].elements['nickname'].value.length > 0 && document.forms['emailRegist'].elements['email'].value.length > 0) {
				$.ajax({
					type : "POST",
					url : '${base}/' + 'userRegist/isEmailExists',
					data : {
						email : document.forms['emailRegist'].elements['email'].value
					},
					dataType : 'json',
					cache : false,
					success : function(data) {
						if (data) {
							$("#emailmessage").html(data);
							$("#emailmessage").show();
						} else {
							$("#emailRegist").submit();
						}
					}
				});
		} else {
			$("#emailmessage").html("请输入用户名和正确邮箱后提交");
		}
	}

	//校验邮箱
	function checkEmail() {
		var re = false;
		email = document.forms['emailRegist'].elements['email'].value;
		var myReg = /^([-_A-Za-z0-9\.]+)@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/;
		if (email == "" || email == null) {
			$("#emailmessage").html("请输入Email");
			$("#email").val("请填写您的邮箱地址");
			$("#email").css("color", "gray");
			$("#emailmessage").show();
			return re;
		} else if (email.length > 32) {
			$("#emailmessage").html("Email不正确");
			$("#emailmessage").show();
			return re;
		} else if (!myReg.test(email)) {
			$("#emailmessage").html("Email不正确");
			$("#emailmessage").show();
			return re;
		} else {
			$("#emailmessage").html("");
			$("#emailmessage").hide();
			re = true;
			return re;
		}
	}
	function clearEmail_Val() {
		if ($("#email").val() == "请填写您的邮箱地址") {
			$("#email").val("");
			$("#email").css("color", "black");
		}
		$("#emailmessage").hide();
	}
</script>

<script type="text/javascript">
	$(function(){
		$('.nav ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('one').siblings().removeClass('one');
		});
				
	});
	
	$(function(){
		$('.filter .option ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('two').siblings().removeClass('two');
		});
				
	});

	
	$(function(){
		$("tr:even").css("background","#f1f1f1");
		$("tr:odd").css("background","#ffffff");
	})
	
	//注册
	
	$(function(){
		
			$( '.reg_nav li' ).click(function(){
				
				var $index  = $(this).index();
	
				
				$('.regbox .con div').eq( $index ).addClass('cur').siblings().removeClass('cur');
	
				
				$(this).addClass('act').siblings().removeClass('act');
	
			});
	
		});
</script>