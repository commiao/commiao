<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 基础组合框 -->
<h2>Basic ComboBox:基础组合框</h2>
<p>Type in ComboBox to try auto complete.</p>
<div style="margin:20px 0"></div>

<select class="easyui-combobox" name="state" style="width:200px;">
	<option value="AL">Alabama</option>
	<option value="AK">Alaska</option>
	<option value="AZ">Arizona</option>
	<option value="AR">Arkansas</option>
	<option value="CA">California</option>
	<option value="CO">Colorado</option>
	<option value="CT">Connecticut</option>
	<option value="DE">Delaware</option>
	<option value="FL">Florida</option>
	<option value="GA">Georgia</option>
	<option value="HI">Hawaii</option>
	<option value="ID">Idaho</option>
	<option value="IL">Illinois</option>
	<option value="IN">Indiana</option>
	<option value="IA">Iowa</option>
	<option value="KS">Kansas</option>
	<option value="KY">Kentucky</option>
	<option value="LA">Louisiana</option>
	<option value="ME">Maine</option>
	<option value="MD">Maryland</option>
	<option value="MA">Massachusetts</option>
	<option value="MI">Michigan</option>
	<option value="MN">Minnesota</option>
	<option value="MS">Mississippi</option>
	<option value="MO">Missouri</option>
	<option value="MT">Montana</option>
	<option value="NE">Nebraska</option>
	<option value="NV">Nevada</option>
	<option value="NH">New Hampshire</option>
	<option value="NJ">New Jersey</option>
	<option value="NM">New Mexico</option>
	<option value="NY">New York</option>
	<option value="NC">North Carolina</option>
	<option value="ND">North Dakota</option>
	<option value="OH" selected>Ohio</option>
	<option value="OK">Oklahoma</option>
	<option value="OR">Oregon</option>
	<option value="PA">Pennsylvania</option>
	<option value="RI">Rhode Island</option>
	<option value="SC">South Carolina</option>
	<option value="SD">South Dakota</option>
	<option value="TN">Tennessee</option>
	<option value="TX">Texas</option>
	<option value="UT">Utah</option>
	<option value="VT">Vermont</option>
	<option value="VA">Virginia</option>
	<option value="WA">Washington</option>
	<option value="WV">West Virginia</option>
	<option value="WI">Wisconsin</option>
	<option value="WY">Wyoming</option>
</select>
<script type="text/javascript" charset="utf-8">
</script>

<!--流式组合框  -->	
<h2>Fluid ComboBox:流式组合框</h2>
<p>This example shows how to set the width of combobox to a percentage of its parent container.</p>
<div style="margin:20px 0"></div>
<p>width: 50%</p>
<input class="easyui-combobox" name="language" style="width:50%"
		data-options="
			url: '${base}/resources/json/combobox_data2.json',
			method: 'get',
			valueField:'value',
			textField:'text',
			groupField:'group'
		">
<p>width: 30%</p>
<input class="easyui-combobox" name="language" style="width:30%"
		data-options="
			url:'${base}/resources/json/combobox_data1.json',
			method:'get',
			valueField:'id',
			textField:'text',
			panelHeight:'auto'
		">

<!--多行组合框  -->		
<h2>Multiline ComboBox:多行组合框</h2>
<p>This example shows how to create a multiline ComboBox.</p>
<div style="margin:20px 0"></div>

<select class="easyui-combobox" name="state" data-options="multiple:true,multiline:true" style="width:200px;height:50px">
	<option value="AL">Alabama</option>
	<option value="AK">Alaska</option>
	<option value="AZ">Arizona</option>
	<option value="AR">Arkansas</option>
	<option value="CA">California</option>
	<option value="CO">Colorado</option>
	<option value="CT">Connecticut</option>
	<option value="DE">Delaware</option>
	<option value="FL">Florida</option>
	<option value="GA">Georgia</option>
	<option value="HI">Hawaii</option>
	<option value="ID">Idaho</option>
	<option value="IL">Illinois</option>
	<option value="IN">Indiana</option>
	<option value="IA">Iowa</option>
	<option value="KS">Kansas</option>
	<option value="KY">Kentucky</option>
	<option value="LA">Louisiana</option>
	<option value="ME">Maine</option>
	<option value="MD">Maryland</option>
	<option value="MA">Massachusetts</option>
	<option value="MI">Michigan</option>
	<option value="MN">Minnesota</option>
	<option value="MS">Mississippi</option>
	<option value="MO">Missouri</option>
	<option value="MT">Montana</option>
	<option value="NE">Nebraska</option>
	<option value="NV">Nevada</option>
	<option value="NH">New Hampshire</option>
	<option value="NJ">New Jersey</option>
	<option value="NM">New Mexico</option>
	<option value="NY">New York</option>
	<option value="NC">North Carolina</option>
	<option value="ND">North Dakota</option>
	<option value="OH" selected>Ohio</option>
	<option value="OK">Oklahoma</option>
	<option value="OR">Oregon</option>
	<option value="PA">Pennsylvania</option>
	<option value="RI">Rhode Island</option>
	<option value="SC">South Carolina</option>
	<option value="SD">South Dakota</option>
	<option value="TN">Tennessee</option>
	<option value="TX">Texas</option>
	<option value="UT">Utah</option>
	<option value="VT">Vermont</option>
	<option value="VA">Virginia</option>
	<option value="WA">Washington</option>
	<option value="WV">West Virginia</option>
	<option value="WI">Wisconsin</option>
	<option value="WY">Wyoming</option>
</select>

<!-- 组合框组 -->
<h2>Group ComboBox:组合框组</h2>
<p>This example shows how to display combobox items in groups.</p>
<div style="margin:20px 0"></div>

<input class="easyui-combobox" name="browser" style="width:280px;" data-options="
			url: '${base}/resources/json/combobox_data2.json',
			method: 'get',
			valueField:'value',
			textField:'text',
			groupField:'group'
		">

<!--组合框导航  -->
<h2>Navigate ComboBox:组合框导航</h2>
<p>Navigate through combobox items width keyboard to select an item.</p>
<div style="margin:20px 0;">
	<input type="checkbox" checked onchange="$('#cc').combobox({selectOnNavigation:$(this).is(':checked')})">
	<span>SelectOnNavigation</span>
</div>

<select id="cc" class="easyui-combobox" name="state" style="width:200px;">
	<option value="AL">Alabama</option>
	<option value="AK">Alaska</option>
	<option value="AZ">Arizona</option>
	<option value="AR">Arkansas</option>
	<option value="CA">California</option>
	<option value="CO">Colorado</option>
	<option value="CT">Connecticut</option>
	<option value="DE">Delaware</option>
	<option value="FL">Florida</option>
	<option value="GA">Georgia</option>
	<option value="HI">Hawaii</option>
	<option value="ID">Idaho</option>
	<option value="IL">Illinois</option>
	<option value="IN">Indiana</option>
	<option value="IA">Iowa</option>
	<option value="KS">Kansas</option>
	<option value="KY">Kentucky</option>
	<option value="LA">Louisiana</option>
	<option value="ME">Maine</option>
	<option value="MD">Maryland</option>
	<option value="MA">Massachusetts</option>
	<option value="MI">Michigan</option>
	<option value="MN">Minnesota</option>
	<option value="MS">Mississippi</option>
	<option value="MO">Missouri</option>
	<option value="MT">Montana</option>
	<option value="NE">Nebraska</option>
	<option value="NV">Nevada</option>
	<option value="NH">New Hampshire</option>
	<option value="NJ">New Jersey</option>
	<option value="NM">New Mexico</option>
	<option value="NY">New York</option>
	<option value="NC">North Carolina</option>
	<option value="ND">North Dakota</option>
	<option value="OK">Oklahoma</option>
	<option value="OR">Oregon</option>
	<option value="PA">Pennsylvania</option>
	<option value="RI">Rhode Island</option>
	<option value="SC">South Carolina</option>
	<option value="SD">South Dakota</option>
	<option value="TN">Tennessee</option>
	<option value="TX">Texas</option>
	<option value="UT">Utah</option>
	<option value="VT">Vermont</option>
	<option value="VA">Virginia</option>
	<option value="WA">Washington</option>
	<option value="WV">West Virginia</option>
	<option value="WI">Wisconsin</option>
	<option value="WY">Wyoming</option>
</select>

<!-- 带额外图标的组合框 -->
<h2>ComboBox with Extra Icons:带额外图标的组合框</h2>
<p>The user can attach extra icons to the ComboBox.</p>
<div style="margin:20px 0"></div>
<input class="easyui-combobox" 
		name="language"
		data-options="
				url:'${base}/resources/json/combobox_data1.json',
				method:'get',
				valueField:'id',
				textField:'text',
				panelHeight:'auto',
				icons:[{
					iconCls:'icon-add'
				},{
					iconCls:'icon-cut'
				}]
		">

<!--多项选择  -->
<h2>Load Dynamic ComboBox Data:多项选择</h2>
<p>Drop down the panel and select multiple items.</p>
<div style="margin:20px 0"></div>

<input class="easyui-combobox" 
		name="language"
		data-options="
				url:'${base}/resources/json/combobox_data1.json',
				method:'get',
				valueField:'id',
				textField:'text',
				multiple:true,
				panelHeight:'auto'
		">
		
<!--加载动态组合框数据  -->
<h2>Load Dynamic ComboBox Data:加载动态组合框数据</h2>
<p>Click the button below to load data.</p>

<div style="margin:20px 0;">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#language').combobox('reload', '${base}/resources/json/combobox_data1.json')">LoadData</a>
</div>

<input class="easyui-combobox" id="language" name="language"
		data-options="valueField:'id',textField:'text'">

<!-- 绑定远程数据 -->
<h2>Binding to Remote Data:绑定远程数据</h2>
<p>The ComboBox is bound to a remote data.</p>
<div style="margin:20px 0"></div>
<input class="easyui-combobox" 
		name="language"
		data-options="
				url:'${base}/resources/json/combobox_data1.json',
				method:'get',
				valueField:'id',
				textField:'text',
				panelHeight:'auto'
		">
		
<!--自定义组合框格式  -->
<h2>Custom Format in ComboBox:自定义组合框格式</h2>
<p>This sample shows how to custom the format of list item.</p>
<div style="margin:20px 0"></div>
<input class="easyui-combobox" name="language" data-options="
			url: '${base}/resources/json/combobox_data1.json',
			method: 'get',
			valueField: 'id',
			textField: 'text',
			panelWidth: 350,
			panelHeight: 'auto',
			formatter: formatItem
		">
<script type="text/javascript">
	function formatItem(row){
		var s = '<span style="font-weight:bold">' + row.text + '</span><br/>' +
				'<span style="color:#888">' + row.desc + '</span>';
		return s;
	}
</script>

<!--组合框操作  -->
<h2>ComboBox:组合框操作</h2>
<p>Click the buttons below to perform actions.</p>

<div style="margin:20px 0;">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="setvalue()">SetValue</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="alert($('#state').combobox('getValue'))">GetValue</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#state').combobox('disable')">Disable</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#state').combobox('enable')">Enable</a>
</div>
<script type="text/javascript">
	function setvalue(){
		$.messager.prompt('SetValue','Please input the value(CO,NV,UT):',function(v){
			if (v){
				$('#state').combobox('setValue',v);
			}
		});
	}
</script>

<select id="state" class="easyui-combobox" name="state" style="width:200px;">
	<option value="AL">Alabama</option>
	<option value="AK">Alaska</option>
	<option value="AZ">Arizona</option>
	<option value="AR">Arkansas</option>
	<option value="CA">California</option>
	<option value="CO">Colorado</option>
	<option value="CT">Connecticut</option>
	<option value="DE">Delaware</option>
	<option value="FL">Florida</option>
	<option value="GA">Georgia</option>
	<option value="HI">Hawaii</option>
	<option value="ID">Idaho</option>
	<option value="IL">Illinois</option>
	<option value="IN">Indiana</option>
	<option value="IA">Iowa</option>
	<option value="KS">Kansas</option>
	<option value="KY">Kentucky</option>
	<option value="LA">Louisiana</option>
	<option value="ME">Maine</option>
	<option value="MD">Maryland</option>
	<option value="MA">Massachusetts</option>
	<option value="MI">Michigan</option>
	<option value="MN">Minnesota</option>
	<option value="MS">Mississippi</option>
	<option value="MO">Missouri</option>
	<option value="MT">Montana</option>
	<option value="NE">Nebraska</option>
	<option value="NV">Nevada</option>
	<option value="NH">New Hampshire</option>
	<option value="NJ">New Jersey</option>
	<option value="NM">New Mexico</option>
	<option value="NY">New York</option>
	<option value="NC">North Carolina</option>
	<option value="ND">North Dakota</option>
	<option value="OH" selected>Ohio</option>
	<option value="OK">Oklahoma</option>
	<option value="OR">Oregon</option>
	<option value="PA">Pennsylvania</option>
	<option value="RI">Rhode Island</option>
	<option value="SC">South Carolina</option>
	<option value="SD">South Dakota</option>
	<option value="TN">Tennessee</option>
	<option value="TX">Texas</option>
	<option value="UT">Utah</option>
	<option value="VT">Vermont</option>
	<option value="VA">Virginia</option>
	<option value="WA">Washington</option>
	<option value="WV">West Virginia</option>
	<option value="WI">Wisconsin</option>
	<option value="WY">Wyoming</option>
</select>

<!-- 远程JSONP -->
<h2>Remote JSONP:远程JSONP</h2>
<p>This sample shows how to use JSONP to retrieve data from a remote site.</p>
<div style="margin:20px 0"></div>
<input class="easyui-combobox" style="width:250px" data-options="
			loader: myloader,
			mode: 'remote',
			valueField: 'id',
			textField: 'name'
		">
<script>
	var myloader = function(param,success,error){
		var q = param.q || '';
		console.info(q);
		if (q.length <= 1){return false}
		$.ajax({
			url: 'http://ws.geonames.org/searchJSON',
			dataType: 'jsonp',
               data: {
                   featureClass: "P",
                   style: "full",
                   maxRows: 20,
                   name_startsWith: q
               },
			success: function(data){
				var items = $.map(data.geonames, function(item){
					return {
						id: item.geonameId,
						name: item.name + (item.adminName1 ? ', ' + item.adminName1 : '') + ', ' + item.countryName
					};
				});
				success(items);
			},
               error: function(){
				error.apply(this, arguments);
			}
		});
	}
</script>