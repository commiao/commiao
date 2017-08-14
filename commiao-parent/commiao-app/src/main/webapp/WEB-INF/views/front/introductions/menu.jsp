<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<script type="text/javascript">
$(function() {
	// 设置head链接聚焦问题
	
	var flag = '${hoverflag2}';
	var arrays = $(".ac_left_3 ul li");
	for(var i=0; i<arrays.length; i++) {
		if(i == flag*1) {
		   $(arrays[i]).find("a").attr("id","ac_hover_3");
		    break;
		}
	}
	
	$(".myli").mouseenter(function(){
		$(this).find('a').css("background","#4d409a");
		$(this).find('a').css("color","white");
		$(this).find('a').css("font-weight","bold");
		$(this).siblings('li').find('a').css("background","white");
		$(this).siblings('li').find('a').css("color","black");
		$(this).siblings('li').find('a').css("font-weight","normal");
	});
	
});
</script>
<div class="ac_left_3 introlefttit" style="background: none;">
	<ul style="margin-top: 0px;border:0px solid red;">
		<li class="myli" style="border:0px solid red;"><a class="mya" href="${ctx}toAboutPage?aboutType=0" style="background: white;display:block;font-size:18px;font-weight:bold;text-align: center;border:1px solid #EBEBEB;border-top: 0px;color:white;background: #4d409a;">公司介绍</a>
		</li>
		<li class="myli" style="border:0px solid red;"><a class="mya" href="${ctx}toAboutPage?aboutType=1" style="background: white;display:block;font-size:18px;font-weight:normal;text-align: center;border:1px solid #EBEBEB;border-top: 0px;color:black;">合作伙伴</a>
		</li>
		<li class="myli" style="border:0px solid red;"><a class="mya" href="${ctx}toAboutPage?aboutType=2" style="background: white;display:block;font-size:18px;font-weight:normal;text-align: center;border:1px solid #EBEBEB;border-top: 0px;color:black;">诚聘英才</a>
		</li>
		<li class="myli" style="border:0px solid red;"><a class="mya" href="${ctx}toAboutPage?aboutType=3" style="background: white;display:block;font-size:18px;font-weight:normal;text-align: center;border:1px solid #EBEBEB;border-top: 0px;color:black;">行业资讯</a>
		</li>
		<li class="myli" style="border:0px solid red;"><a class="mya" href="${ctx}noticeList"              style="background: white;display:block;font-size:18px;font-weight:normal;text-align: center;border:1px solid #EBEBEB;border-top: 0px;color:black;">公司公告</a>
		</li>
		<li class="myli" style="border:0px solid red;"><a class="mya" href="${ctx}toAboutPage?aboutType=5" style="background: white;display:block;font-size:18px;font-weight:normal;text-align: center;border:1px solid #EBEBEB;border-top: 0px;color:black;">联系我们</a>
		</li>
	</ul>
</div>
<script type="text/javascript">
$(function() {
	$(".menu-selected").removeClass("menu-selected");
	$("#aboutUs").addClass("menu-selected");
});
</script>