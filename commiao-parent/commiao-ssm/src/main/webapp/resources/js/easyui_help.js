;(function($,window) {
	var hxja= {
			getObj:function(obj){
				if(!obj){
					return $('');
				}
				if(typeof obj == 'string'){
					if(obj.indexOf('#') === 0){
						return $(obj);
					}else{
						var o = $(obj);
						if(o && o.length>0){
							return o;
						}
						o = $('#'+obj);
						if(o && o.length>0){
							return o;
						}
						return $('');
					}
				}
				return obj;
			},
			getOptions:function(options){
				var opts = {};
				if(options){
					if(typeof option == 'string' ){
						opts = eval(options); 
					}else{
						opts = options;
					}
				}
				idopts = {};
				var id = this.defaults.id || options.id;
				if(id){
					idopts = {
						searchForm:		id+'searchForm',
						listId:			id+'listId',
						listForm: 		id+'listForm',
						inputId:		id+'inputId',
						inputForm:		id+'inputForm'
					};
				}
				return $.extend({},this.defaults,idopts,opts);
			}	
	};
	if(!window.hxja){
		window.hxja = hxja;
	}
	hxja.defaults={
		id:undefined,//操作的主对象
		searchForm:		'searchForm',
		listId:			'listId',
		listForm:		'listForm',
		inputId:		'inputId',
		inputForm:		'inputForm'//保存修改表单id	
	};
	hxja.list = function(options){
		options = this.getOptions(options);
		var opts = {
				url_list: 			undefined,
				idField: 			undefined,
				columns:			undefined,
				toolbar:			undefined
		};
		opts = $.extend(opts,options);
		dialogOpts = {
				url: 				opts.url_list,
				idField: 			opts.idField,
				pagination:			true,
				pagePosition: 		'bottom',
				rownumbers:		 	true,
				pageList: 			[ 10, 20, 30, 40 ],
				fit: 				true,//为false时,翻页紧跟在数据后面
				fitColumns: 		true,
				nowrap: 			true,
				border: 			false,
				sortName: 			'',
				sortOrder: 			'desc',
				columns:     		opts.columns,
				toolbar:			opts.toolbar,
				loadMsg: "正在努力为您加载数据" //加载数据时向用户展示的语句
		};
		this.getObj(opts.listId).datagrid(dialogOpts);
	};
	
	hxja.input = function(options) {
		options = this.getOptions(options);
		var opts = {
				title:			'测试',
				width:			$(window).width()*0.8,
				height:			$(window).height()*0.8,
				closable : 		true,
				url_add:		''
		};
		opts = $.extend(opts,options);
		if(!opts.url_add){
			return;
		}
		if(opts.form){
			var param = this.getObj("#"+opts.form).formSerialize();
			if(param){
				if(opts.url_add.index("?") < 0){
					opts.url_add = opts.url_add + "?" + param;
				}else{
					opts.url_add = opts.url_add + "&" + param;
				}
			}
		}
		dialogOpts = {
				title: 				opts.title ||  '汇信金融',  
				closable:			opts.closable,
				resizable:			opts.resizable,
				maximizable:		opts.maximizable,
				collapsible:		opts.collapsible,
			    width: 				opts.width,  
			    height: 			opts.height,  
			    closed: 			false,  
			    maximized:			opts.maximized,
			    cache: 				false,  
			    href: 				opts.url_add,  
			    modal: 				true,
			    onCompleted:		opts.onLoad,
			    onDestroy:			function(){
			    	if(options.onClose){
			    		options.onClose.apply(this,win);
			    	}
			    },
			    onClose:			function(){
			    	if(options.onClose){
			    		options.onClose.apply(this,win);
			    	}
			    }
		};
		//增加按钮
		if(opts.buttons){
			dialogOpts.buttons = opts.buttons;
		}else{
			dialogOpts.buttons = 
				[{
					text:'保存',
					handler:function(){
						alert(111);
					}
				},{
					text:'取消',
					handler:function(){
						alert(222);
					}
				}];
		}
		var $dialog = this.getObj(opts.listId);
		$dialog.dialog(dialogOpts);
	};
	
	hxja.add = function(options){
		options = this.getOptions(options);
		var opts = {
				inputId:			undefined
		};
		opts = $.extend(opts,options);
		this.getObj(options.inputForm).find('input,textarea').val('');
		$('div.validatebox-tip').remove();
		this.getObj(options.inputId).dialog('open');
	};
	
	hxja.edit= function(options){
		options = this.getOptions(options);
		var opts = {
				listId:				undefined,
				inputId:			undefined,
				inputForm:			undefined,
				url_edit:			undefined
		};
		opts = $.extend(opts,options);
		var $dialog = this.getObj(opts.listId);
		var rows = $dialog.datagrid('getSelections');
		if (rows.length == 1) {
			$.messager.progress({
				text : '数据加载中....',
				interval : 100
			});
			$.ajax({
				url : opts.url_edit,
				data : {id : rows[0].id},
				dataType : 'json',
				cache : false,
				success : function(response) {
					var $form_input = hxja.getObj(opts.inputForm);
					var $form_id = hxja.getObj(opts.inputId)
					$form_input.find('input,textarea').val('');
					$form_input.form('load', response);
					$('div.validatebox-tip').remove();
					$form_id.dialog('open');
					$.messager.progress('close');
				}
			});
		} else {
			$.messager.alert('提示', '请选择一项要编辑的记录！', 'error');
		}
	};
	
	hxja.del= function(options){
		options = this.getOptions(options);
		var opts = {
				listId:				undefined,
				url_del:			undefined
		};
		opts = $.extend(opts,options);
		var $dialog = this.getObj(opts.listId);
		var rows = $dialog.datagrid('getSelections');
		var ids = [];
		if (rows.length > 0) {
			$.messager.confirm('请确认', '您要删除当前所选记录?', function(r) {
				if (r) {
					for ( var i = 0; i < rows.length; i++) {
						ids.push(rows[i].id);
					}
					$.ajax({
						url : 				opts.url_del,
						data: 				{ids : ids.join(',')},
						dataType: 			'json',
						success : 			function(response) {
												$dialog.datagrid('load');
												$dialog.datagrid('unselectAll');
												alert(response.msg);
												$.messager.show({title : '提示',msg : response.msg});
											}
					});
				}
			});
		} else {
			$.messager.alert('提示', '请选择要删除的记录！', 'error');
		}		
	};
	
	hxja.cancel= function(options){
		options = this.getOptions(options);
		var opts = {
				inputId:				undefined
		};
		opts = $.extend(opts,options);
		this.getObj(options.inputId).dialog('close');
	};
	
	hxja.submit= function(options){
		options = this.getOptions(options);
		var opts = {
				listId:			undefined,
				inputId : 		undefined,
				inputForm:		undefined,
				url_save:		undefined
		};
		opts = $.extend(opts,options);
		var $dialog = this.getObj(opts.listId);
		this.getObj(opts.inputForm).form({
			url: 		opts.url_save,
			success: 	function(data) {
							var json = $.parseJSON(data);
							if (json && json.success) {
								$.messager.show({ title : '成功', msg : json.msg });
								$dialog.datagrid('reload');
								hxja.getObj(opts.inputId).dialog('close');
								$dialog.datagrid('unselectAll');
							} else {
								$.messager.show({ title : '失败', msg : '操作失败！' });
							}
						}
		});
		this.getObj(opts.inputForm).submit();
	};
	
	/**
	 * ajaxSubmit() provides a mechanism for immediately submitting
	 * an HTML form using AJAX.
	 */
	hxja.ajaxSubmit = function(options) {
		var opts = {
				url:undefined,//提交地址，如果是form表单提交，可以不写，则使用form的action属性
	    		form:undefined,//提交的表单id或者是name
	    		target:false,//返回结果容器id，如果是html类型，则返回结果直接填充对应的容器
		    	method:undefined,//提交方式，如果是from表单提交，可以不写，则使用from的method属性
		    	dataType:'html',//数据类型，默认html，支持jquery的ajax类型
		    	data:undefined,//提交的数据[{name:'name1',value:'val1'},{name:'name2',value:'val2'}]
		    	onSubmit:false,//提交前执行
		    	onSuccess:false,//提交成功后，返回结果处理前执行
		    	onCompleted:false,//提交成功后，返回结果处理后执行
		    	onError:false//提交失败是执行
	    };
		
		opts = $.extend(opts,options);

		//如果是form表单提交，则信息默认从表单获取
		$form = this.getObj("#"+opts.form) || $('form[name='+opts.form+']');
		if ($form && $form.length>0) {
			//alert("$form.length="+$form.attr('action'));
			if(opts.data){
				$.each(opts.data,function(index,q){
					var $element = $form.find('[name='+q.name+']');
					if($element.length>0){
						$element.val(q.value);
					}else{
						$("<input type='hidden' name='"+q.name+"' value='"+q.value+"' />").appendTo($form);
					}
				});
			}
	        opts = $.extend(
	        		{url:$form.attr('action')},
	        		opts,
	        		{data:$form.formSerialize(),method:'POST'});
	        //alert($form.formSerialize() +'--' +$form.attr('method') +'--'+ $form.attr('action'));
	    }
		
		//alert("opts.url="+opts.url  );
		//提交前执行
	    if (!opts.url) {
	        return this;
	    }
	    //提交前执行
	    if (opts.onSubmit && opts.onSubmit.apply(this, opts) === false) {
	        return this;
	    }
	    //开始远程调用
	    $.ajax({
	    	type	:opts.method,
	    	url		:opts.url,
	    	dataType:opts.dataType,
	    	data	:opts.data,
	    	success	:function(data,textStatus){
	    		if(opts.onSuccess && opts.onSuccess.apply(this,[data,textStatus]) === false){
	    			return;
	    		}
	    		if(opts.dataType=='html' && opts.target){
	    			var $target = bfsu.getObj(opts.target);
	    			$target.empty();
	    			$target.html(data);
	    		}
	    		if(opts.onCompleted){
	    			opts.onCompleted.apply(this,[data,textStatus]);
	    		}
	    	},
	    	error:opts.onError
	    });
	    
	    return this;
	};
})(jQuery,window);
var option={};
/*base1、添加页面*/
function list(options){
	hxja.list(options);
}
/*base2、添加页面*/
function add(options){
	hxja.add(options);
}
/*base3、修改页面*/
function edit(options){
	hxja.edit(options)
}
/*base4、删除操作*/
function del(options){
	hxja.del(options);
}
/*base5、保存操作*/
function submit(options){
	hxja.submit(options);
} 
/*base6、取消操作*/
function cancel(options){
	hxja.cancel(options)
}
/*base7、查询操作*/
function search_find(options){
	options = hxja.getOptions(option);
	var opts = {
			serchForm:		undefined,
			listId:			undefined
	};
	opts = $.extend(opts,options);
	hxja.getObj(opts.listId).datagrid('load',serializeObject(hxja.getObj(opts.searchForm)));
}
/*base8、重置操作*/
function search_clear(options){
	options = hxja.getOptions(option);
	var opts = {
			serchForm:		undefined,
			listId:			undefined
	};
	opts = $.extend(opts,options);
	hxja.getObj(opts.searchForm)[0].reset();
	hxja.getObj(opts.listId).datagrid('load',{});
}