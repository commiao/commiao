<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信P2P系统-我得账户</title>
<script type="text/javascript">
	<!--一级导航-->
	$(function(){
		$('.nav ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('one').siblings().removeClass('one');
		});
				
	});
	<!--二级导航-->
	$(function(){
		$('.subnav ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('sub_cur').siblings().removeClass('sub_cur');
		});
				
	});
	
	<!--table背景-->
	$(function(){
	$("tr:even").css("background","#F5F5F5");
	$("tr:odd").css("background","#ffffff");
	})
</script>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	
	
	
	 <!--融资者账户概要-->
    <div class="profile">
    	<div class="account_user">
        	<img class="user_pic" src="${base}/resources/images/account_user.jpg" width="120" />
            <p>用户名：<b>融资江</b></p>
            <span>[融资者]</span>
            <ul>
            	<li><img src="${base}/resources/images/a_c.jpg" width="30"></li>
                <li><img src="${base}/resources/images/a_e.jpg" width="30"></li>
                <li><img src="${base}/resources/images/a_m.jpg" width="30"></li>
                <li><img src="${base}/resources/images/a_p.jpg" width="30"></li>
            </ul>
        </div>
        <div class="account_infrz">
        	<div class="inf_lt">
            	<p class="one">账户余额：</p>
                <p class="two"><span>20000.00</span> 元</p>
                <p class="three">累计融资：<span> 3</span> 笔&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;共计<span> 20000.00</span> 元</p>
                <p class="four"><a href="javascript:;"><img src="${base}/resources/images/recharge.jpg" width="50"></a><a href="javascript:;"><img src="${base}/resources/images/Withdraw.jpg" width="50"></a></p>
            </div>
            <div class="inf_rt">
            	<p class="one">累计还款：</p>
                <p class="two"><span>10000.00</span> 元&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>5</span> 次</p>
                <p class="three"><span>手动：<b>5</b> 次</span><span>自动：<b>0</b> 次</span></p>
                <p class="three"><span>手动：<b>1000</b> 元</span><span>自动：<b>0</b> 元</span></p>
            </div>
            <div class="inf_lb">
            	<p class="one">累计支付：</p>
                <p class="two"><span><b>1320.00</b> 元</span> <span><b>3</b> 笔 <b>6</b> 期</span></p>
                <p class="three"><span>利息：<b>1000.00</b> 元</span> <span>管理费：<b>100.00</b> 元</span></p>
                <p class="three"><span>滞纳金：<b>100</b> 元</span> <span>逾期罚息：<b>120.00</b> 元</span></p>
            </div>
            <div class="inf_rb">
            	<p>当前<span> 1</span> 期账单逾期<a class="one" href="javascript:;">还款</a></p>
                <p>历史逾期<span> 6</span> 期<a class="two" href="javascript:;">开启自动还款</a></p>
            </div>
        </div>
        <div class="subnav">
        	<ul>
            	<li class="sub_cur"><a href="#">账户概要</a></li>
                <li><a href="#">借款记录</a></li>
                <li><a href="#">资金流水</a></li>
                <li><a href="#">充值提现</a></li>
                <li><a href="#">债权转让</a></li>
                <li><a href="#">账户设置</a></li>
            </ul>
        </div>       
        <div class="account_list1">
        	<div class="list_tit">正在进行的借款</div>
                <table>
                    <tr>
                        <th>标题</th>
                        <th>状态</th>
                        <th>借款金额(元)</th>
                        <th>年化利率</th>
                        <th>还款方式</th> 
                        <th>借款期限(月)</th>    	         	       	          	          	                        	
                    </tr>
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>资金周转</td>
                        <td>还款中</td>
                        <td>20000.00</td>
                        <td>11%</td>
                        <td>等额本息</td> 
                        <td>12</td>        	         	       	          	          	                  	          	
                    </tr>  
               </table>
        </div>
    </div>
	
	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
