<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<h2>Basic Combo</h2>
	<p>Click the right arrow button to show drop down panel that can be filled with any content.</p>
	<div style="margin:20px 0"></div>
	<select id="cc" style="width:150px"></select>
	<div id="sp">
		<div style="color:#99BBE8;background:#fafafa;padding:5px;">Select a language</div>
		<div style="padding:10px">
			<input type="radio" name="lang" value="01"><span>Java</span><br/>
			<input type="radio" name="lang" value="02"><span>C#</span><br/>
			<input type="radio" name="lang" value="03"><span>Ruby</span><br/>
			<input type="radio" name="lang" value="04"><span>Basic</span><br/>
			<input type="radio" name="lang" value="05"><span>Fortran</span>
		</div>
	</div>
	<script type="text/javascript">
		$(function(){
			$('#cc').combo({
				required:true,
				editable:false
			});
			$('#sp').appendTo($('#cc').combo('panel'));
			$('#sp input').click(function(){
				var v = $(this).val();
				var s = $(this).next('span').text();
				$('#cc').combo('setValue', v).combo('setText', s).combo('hidePanel');
			});
		});
	</script>