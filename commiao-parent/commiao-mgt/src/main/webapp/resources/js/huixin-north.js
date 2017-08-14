	function logout(b) {
		$.post('userAction!logout.action', function() {
			if (b) {
				if (sy.isLessThanIe8()) {
					//loginAndRegDialog.dialog('open');
					
					window.location.href="<%=basePath%>/index.action";
				} else {
					window.location.href="<%=basePath%>/index.action";
				}
			} else {
				//loginAndRegDialog.dialog('open');
				window.location.href="<%=basePath%>/index.action";
			}
		});
	}
function changeTheme(themeName) {
	var $easyuiTheme = $('#easyuiTheme');
	var url = $easyuiTheme.attr('href');
	var href = url.substring(0, url.indexOf('themes')) + 'themes/' + themeName + '/easyui.css';
	$easyuiTheme.attr('href', href);

	var $iframe = $('iframe');
	if ($iframe.length > 0) {
		for ( var i = 0; i < $iframe.length; i++) {
			var ifr = $iframe[i];
			$(ifr).contents().find('#easyuiTheme').attr('href', href);
		}
	}

	$.cookie('easyuiThemeName', themeName, {
		expires : 7
	});
}
