<%@page import="com.hr.entity.Users"%>
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
	<style type="text/css">
			body {
				margin: 0;
				padding: 0;
				background-color: #FFD553;
				font-family: 微软雅黑;
			}
	</style>
	<script type="text/javascript">
		function del() {
			$.post("user/deletsession",function(data){
				location.href="login.jsp"
			},"json")
		}
	</script>
	</head>
	<body topmargin="0" leftmargin="0">
		<table style="width: 70%; margin-left: 30%;">
			<tr>
				<td style="text-align: right;width:30%">
					<p
						style="font-size: 40px; margin: 0; color: white; filter:progid:DXImageTransform.Microsoft.Shadow(color=black,direction=120,strength=5); text-shadow: 4px 4px 15px black;">
						人力资源管理系统
					</p>
				</td>
				<td style="text-align: right;font-size:17px;width:35%;color:black;">
					<br />
					欢迎你：<%=request.getSession().getAttribute("utruename")%>(<%=request.getSession().getAttribute("utype")%>)&nbsp;
					<input type="button" value="退出系统" class="BUTTON_STYLE1" onclick="del()"/>&nbsp;&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
		</table>
	</body>
</html>