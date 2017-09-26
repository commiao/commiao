<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--头部-->
<div class="header">
   	 <div class="header_con"> 
           <img class="phonepng" src="${base}/resources/images/phone.png" />
           <p class="phone">客服热线：010-88888888</p>
           <a href="#" class="wx"></a>
           <a href="#" class="wb"></a>
           <div class="h_r">
           			<span><c:if test="${loginUser.nickname ne null }">${loginUser.nickname} | <a href="javascript:loginOut();">退出</a></c:if></span>
               		<span><c:if test="${loginUser.nickname eq null }"><a href="javascript:login();">登录</a> | <a href="javascript:regist();">注册</a></c:if></span>
               <ul>
                   <li><a href="javascript:beginners();">新手引导</a></li>
                   <li><a href="javascript:toAboutPage();">联系我们</a></li>
                   <li><a href="javascript:toHelpPage();">帮助中心</a></li>
               </ul>
           </div>
        </div>   
</div>
<!--导航栏-->
<div class="nav">
	<div class="nav_con">
        <ul>
            <li class="one"><a href="javascript:back_index();">首页</a></li>
            <li class="two"><a href="javascript:invest_list();">我要投资</a></li>
            <li class="three"><a href="javascript:login();">我要融资</a></li>
            <li class="four"><a href="javascript:toAboutPage();">关于我们</a></li>
            <li class="five"><a href="javascript:login();">债权转让专区</a></li>
            <li class="six"><a href="javascript:myAccount();">我的账户</a></li>
        </ul>
    </div>
</div>

<script language="javascript">
/* 返回首页  */
function back_index(){
	window.location.href="${base}/index/index";
}

/* 登录 */
function login(){
	window.location.href="${base}/login/index";
} 

/* 退出 */
function loginOut(){
	window.location.href="${base}/login/loginOut";
}

/* 点击投资 */
function invest_list(){
	window.location.href="${base}/loan/investIndex";
}
/* 注册 */
function regist(){
	window.location.href="${base}/login/regist";
}
/* 新手指引 */
function beginners(){
	window.location.href="${base}/common/beginners";
}
/* 联系我们 */
function toAboutPage(){
	window.location.href="${base}/common/toAboutPage?aboutType=0";
}
/* 帮助中心 */
function toHelpPage(){
	window.location.href="${base}/common/toHelpPage";
}

/* 我的账户 */
function myAccount(){
	window.location.href="${base}/common/myAccount";
}
</script>
