<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/global/global.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link href="${base}/resources/css/p2p.css"  rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>慧信P2P系统-我的账户</title>
<script type="text/javascript">
	
	$(function(){
		$('.nav ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('one').siblings().removeClass('one');
		});
				
	});
	
	$(function(){
		$('.subnav ul li').click(function(){
			$num=$(this).index();
			$(this).addClass('sub_cur').siblings().removeClass('sub_cur');
		});
				
	});
	
	$(function(){
		$('.account_list span').click(function(){
			$num=$(this).index();
			$(this).addClass('list_cur').siblings().removeClass('list_cur');
		});
				
	});
	
	$(function(){
	$("tr:even").css("background","#F5F5F5");
	$("tr:odd").css("background","#ffffff");
	})
</script>
</head>

<body>
	<!-- 引入页眉 -->
	<%@ include file="/global/head.jsp"%>
	
	
	
	<!--投资者账户概要-->
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
        <div class="account_inf">
        	<div class="inf_t">
            	<ul>
                	<li class="one">账户余额：</li>
                    <li class="two"><p><p id="accountInfo"></p><span> 元</span></p></li>
                    <li class="three"><p>10000.00<span> 元</span></p><b>可提现</b></li>
                    <li class="three"><p>10000.00<span> 元</span></p><b>投资冻结</b></li>
                    <li class="four"><a href="javascript:recharge();"><img src="${base}/resources/images/recharge.jpg" width="50"></a><a href="javascript:;"><img src="${base}/resources/images/Withdraw.jpg" width="50"></a></li>
               		<input  type="hidden" name="amt" id="amt" placeholder="请输入充值金额"/>
                </ul>
            </div>
            <div class="inf_l">
            	<p class="lj">累计投资:</p>
                <p class="je">200000.00<span> 元</span></p>
                <p class="bs">20<span> 笔</span></p>
            </div>
            <div class="inf_r">
            	<p class="lj">累计收益</p>
                <p class="je">11000.00<span> 元</span></p>
                <p class="bs"><span>利息：</span> 1000.00<span> 元</span>&nbsp;&nbsp;&nbsp;&nbsp;<span>逾期罚息：</span> 1000.00<span> 元</span></p>
            </div>
            <div class="inf_b">
            	<ul>
                	<li class="one">剩余待收：</li>
                    <li class="two">21000.00<span> 元</span></li>
                    <li class="two">3<span> 笔</span> 6<span> 期</span></li>
                    <li class="three"><p>本金：<span> 20000.00</span> 元</p><p>利息：<span> 1000.00</span> 元</p></li>
                </ul>
            </div>
        </div>
        <div class="subnav">
        	<ul>
            	<li class="sub_cur"><a href="#">账户概要</a></li>
                <li><a href="javascript:tzRecord();">投资记录</a></li>
                <li><a href="#">资金流水</a></li>
                <li><a href="#">充值提现</a></li>
                <li><a href="#">债权转让</a></li>
                <li><a href="#">账户设置</a></li>
            </ul>
        </div>       
        <div class="account_list">
        	<div class="list_tit"><span class="list_cur">回款中的项目</span><span>筹款中的项目</span></div>
                <table>
                    <tr>
                        <th>下次还款时间</th>
                        <th>标题</th>
                        <th>借款人</th>
                        <th>期数</th>
                        <th>待收金额(元)</th> 
                        <th>待收利息(元)</th> 
                        <th>逾期(天)/罚息(元)</th>           	         	       	          	          	                        	
                    </tr>
                    <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr>  
                    <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr>     
                    <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr>     
                    <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr>   
                    <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr> 
                    <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr>  
                     <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr>    
                     <tr>
                        <td>2016-02-06</td>
                        <td>资金周转</td>
                        <td>王小明</td>
                        <td>12</td>
                        <td>100000.00</td> 
                        <td>1000</td>
                        <td>5/500</td>         	         	       	          	          	                  	          	
                    </tr>           
               </table>
        </div>
    </div>
	
	
	
	<h3>测试富友个人网上自助注册</h3>
	<a href="javascript:webReg();">注册富友用户</a>
	<br/>
	
	
	
	<!-- 引入页脚 -->
    <%@ include file="/global/bottom.jsp"%>
</body>
</html>

<script language="javascript">
/* 富友金账户测试开户 */
function webReg(){
	window.location.href="${base}/fuyou/webReg";
}

/* 投资记录  */
function tzRecord(){
	window.location.href="${base}/common/tzRecord";
}
</script>

<script>
	/* 后台调用富友查询接口 */
	$(function(){
		$.ajax({
			type: "POST",
			url : '${base}/'+'fuyou/balance',
			data : {},
			contentType: "application/x-www-form-urlencoded; charset=utf-8", 
			dataType : 'json',
			cache : false,
			success : function(data) {
				$('#accountInfo').html(data.ct_balance);
			}
		});
	});
	
	/* 充值 */
	function recharge(){
		//if($('#amt').val() !=null){
			$.ajax({
				type: "POST",
				url : '${base}/'+'fuyou/recharge',
				data : {amt:$('#amt').val()},
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				dataType : 'json',
				cache : false,
				success : function(data) {
					if(data.resp_code==0000){
						alert('目前方便充值测试,先调用转账接口代替,每次从商户转出1。 返回码0000表示成功，本次返回码 为: '+data.resp_code);
						top.location.reload();
					}else{
						alert('返回码:  '+data.resp_code);
					}
					
				}
			});
		//	$('#amt').val('');
		//	$('#amt').hide();
		//}else{
		//	alert('请填写充值的金额!');
		//	$('#amt').show();
		//}
	}
	
</script>