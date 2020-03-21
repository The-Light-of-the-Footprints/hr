<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/jquery.min.js" ></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js" ></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/jquery.easyui.min.js" ></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/easyui-lang-zh_CN.js" ></script>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/javascript/easyui/themes/icon.css" />
	<link rel="stylesheet" href="<%=request.getContextPath() %>/easyui/themes/default/easyui.css" />
	
	<script>
		function onClose() {
			if (window.screenTop > 10000) {
				var targeturl = "auto_logout.jsp"
				newwin = window.open("", "", "scrollbars,Toolbar=yes")
				if (document.all) {
					newwin.moveTo(0, 0)
					newwin.resizeTo(80, 60)
				}
				newwin.location = targeturl
			}
		}
		window.onunload = onClose
	</script>
</head>
<frameset rows="69,*" framespacing="1" border="1" onunload="onClose()">
	<frame src="top.jsp" name="top" scrolling="no" marginwidth="1"
		marginheight="1" frameborder="0">
	<frame src="main.jsp" name="mainFrame">
	<noframes>
		<body topmargin="0" leftmargin="0" bgcolor="#b5daff">
		</body>
	</noframes>
</frameset>
</html>