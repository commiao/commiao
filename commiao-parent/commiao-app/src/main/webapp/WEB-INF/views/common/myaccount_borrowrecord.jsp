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
	
	
	<!--投资记录切换-->
	$(function(){
		
			$( '.list_tit2 li' ).click(function(){
				
				var $index  = $(this).index();
	
				
				$('.list2').eq( $index ).addClass('cur').siblings().removeClass('cur');
	
				
				$(this).addClass('list_cur').siblings().removeClass('list_cur');
	
			});
	
		});
</script>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	
	 <!--投资记录-->
    
    <div class="profile">
    	<div class="account_user">
        	<img class="user_pic" src="${base}/resources/images/account_user.jpg" width="120" />
            <p>用户名：<b>投资江</b></p>
            <span>[投资者]</span>
            <ul>
            	<li><img src="${base}/resources/images/a_c.jpg" width="30"></li>
                <li><img src="${base}/resources/images/a_e.jpg" width="30"></li>
                <li><img src="${base}/resources/images/a_m.jpg" width="30"></li>
                <li><img src="${base}/resources/images/a_p.jpg" width="30"></li>
            </ul>
        </div>
        	<div class="account_list2box">
                <div class="account_list2">
                    <ul class="list_tit2">
                        <li class="list_cur">偿还中借款</li>
                        <li>筹款中借款</li>
                        <li>审核中借款</li>
                        <li>已偿还借款</li>
                    </ul>
                    <div class="list2 cur">
                        <table>
                            <tr>
                                <th>标题</th>
                                <th>项目编号</th>
                                <th>期数</th>
                                <th>年化利率</th>
                                <th>下期还款日期</th> 
                                <th>应还总额(元)</th> 
                                <th>借款金额</th>   
                                <th>合同</th>  
                                <th>操作</th>  	         	       	          	          	                        	
                            </tr>
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a class="refund"  href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                       </table>
                    </div>
                    
                     <div class="list2">
                        <table>
                             <tr>
                                <th>标题</th>
                                <th>项目编号</th>
                                <th>期数</th>
                                <th>年化利率</th>
                                <th>下期还款日期</th> 
                                <th>应还总额(元)</th> 
                                <th>借款金额</th>   
                                <th>合同</th>  
                                <th>操作</th>  	         	       	          	          	                        	
                            </tr>
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a  class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a  class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                       </table>
                    </div>
                    
                     <div class="list2">
                        <table>
                            <tr>
                                <th>标题</th>
                                <th>项目编号</th>
                                <th>期数</th>
                                <th>年化利率</th>
                                <th>下期还款日期</th> 
                                <th>应还总额(元)</th> 
                                <th>借款金额</th>   
                                <th>合同</th>  
                                <th>操作</th>  	         	       	          	          	                        	
                            </tr>
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a  class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a  class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
                       </table>
                    </div>
                    
                     <div class="list2">
                        <table>
                             <tr>
                                <th>标题</th>
                                <th>项目编号</th>
                                <th>期数</th>
                                <th>年化利率</th>
                                <th>下期还款日期</th> 
                                <th>应还总额(元)</th> 
                                <th>借款金额</th>   
                                <th>合同</th>  
                                <th>操作</th>  	         	       	          	          	                        	
                            </tr>
                            <tr>
                                <td>资金周转</td>
                                <td>01</td>
                                <td>12</td>
                                <td>11%</td>
                                <td>2016-02-18</td> 
                                <td>1000.00</td> 
                                <td>20000.00</td> 
                                <td><a href="javascript:;">下载</a></td> 
                                <td><a  class="refund" href="javascript:;">还款</a></td>        	         	       	          	          	
                            </tr>  
   
                       </table>
                    </div>
              </div>
                
        </div>
        <div class="subnav">
        	<ul>
            	<li ><a href="javascript:tzAccount();">账户概要</a></li>
                <li class="sub_cur"><a href="#">投资记录</a></li>
                <li><a href="#">资金流水</a></li>
                <li><a href="#">充值提现</a></li>
                <li><a href="#">债权转让</a></li>
                <li><a href="#">账户设置</a></li>
            </ul>
        </div>       
    </div>
	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>
<script>
function tzAccount(){
	window.location.href="${base}/common/tzAccount";
}
</script>