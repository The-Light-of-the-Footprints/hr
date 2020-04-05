<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form method="post" action="updateattAchmentName">
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--附件上传</font>
					</td>
				</tr>
				<tr>
					<td width="65%">
						提交成功，如需上传附件，请选择上传(word文档、txt文档、pdf文档、jpg图片等，最大5.0MB)
						<input type="file" class="FILE_STYLE1" name="attachmentName"
							width="100%">
						<input type="hidden" name="humanId" value="<%=request.getParameter("humanId")%>"/>
					</td>
					<td width="41%" align="right">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
						<input type="submit" value="完成" class="BUTTON_STYLE1"/>
					</td>
				</tr>
			</table>
		</form>
	</body>

</html>