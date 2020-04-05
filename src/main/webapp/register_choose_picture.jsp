<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
		<form method="post" action="updateHumanFilePicture">
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--图片上传</font>
					</td>
				</tr>
				<tr>
					<td width="59%">
						提交成功，如有照片，请选择上传照片(.jpg、.gif文件)
						<input type="file" class="FILE_STYLE1" name="humanPicture"
							width="100%"/>
							<input type="hidden" name="humanId" value="${hid }" />
					</td>
					<td width="41%" align="right">
						<input type="button" value="上传附件" class="BUTTON_STYLE1" onclick="location.href='updateattAchmentNameJsp?humanId=${hid}'"/>
						<input type="submit" value="上传" class="BUTTON_STYLE1"/>
						<a href="goIndex" onclick="var goIndex = (confirm('确定要返回主页吗?')); return goIndex">返回主页</a>
					</td>
				</tr>
			</table>
		</form>
	</body>

</body>
</html>