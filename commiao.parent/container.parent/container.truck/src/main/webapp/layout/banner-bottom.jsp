<%@page contentType="text/html;charset=UTF-8"%>
<!-- //container -->
<div class="container">
	<script src="${reBase }/js/responsiveslides.min.js"></script>
	<script>
			// You can also use "$(window).load(function() {"
			$(function() {
				// Slideshow 4
				$("#slider3").responsiveSlides({
					auto : true,
					pager : true,
					nav : false,
					speed : 500,
					namespace : "callbacks",
					before : function() {
						$('.events').append("<li>before event fired.</li>");
					},
					after : function() {
						$('.events').append("<li>after event fired.</li>");
					}
				});

			});
		</script>
	<div id="top" class="callbacks_container">
		<ul class="rslides" id="slider3">
			<li>
				<div class="banner-info">
					<h2>
						专注 <span> 卡车维修 </span>二十年
					</h2>
					<div class="line"></div>
					<p>在这里享受的是最专业的卡车维修服务</p>
				</div>
			</li>
			<li>
				<div class="banner-info">
					<h2>
						坚守 <span> 职业操守 </span> 不动摇
					</h2>
					<div class="line"></div>
					<p>不仅仅只是维修，更是安心、放心、贴心</p>
				</div>
			</li>
			<li>
				<div class="banner-info">
					<h2>
						保证 <span> 工作效率 </span> 高标准
					</h2>
					<div class="line"></div>
					<p>高标准、高要求，您的安全永远放在第一位</p>
				</div>
			</li>
		</ul>
	</div>
</div>