/***
 * 序列化表单元素
 * 返回序列化对象
 */
serializeObject = function(form){
	var obj = {};
	$.each(form.serializeArray(),function(i){
		if(obj[this['name']]){
			obj[this['name']]+=","+this['value'];
		}else{
			obj[this['name']]=this['value'];
		}
	});
	return obj;
}
/**
 * 添加面板panel
 * @param opt
 */
function addTab(opt){
	var tabContent = $('#centerTabs');
	if(tabContent.tabs('exists',opt.title)){
		tabContent.tabs('select',opt.title)
	}else{
		tabContent.tabs('add',opt);
	}
}