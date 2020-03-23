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
	<style type=text/css>
		body {
			font-size: 12px;
			color: #ffffff;
			font-family: 宋体
		}
		
		td {
			font-size: 12px;
			color: #ffffff;
			font-family: 宋体
		}
		</style>
		<script>
			function sub(){
				var a=/\s/g;
				if(a.test($("#userName").val())){
					alert("请填写用户名");
				}else{
					if(a.test($("#userPassword").val())){
						alert("请填写密码");
					}else{
						alert("登录成功")
						$.post("user/queryByUser",$("#f").serialize(),function(data){
							if(data){
								location.href="index.jsp"
							}else{
								alert("密码或账号错误");
							}
						},"json")
					}
				}
			}
		</script>
</head>
<body>
		<form id="f" >
			<div>
				<table cellspacing=0 cellpadding=0 width=900 align=center border=0>
					<tbody>
						<tr>
							<td style="height: 105px">
								<img src="<%=request.getContextPath() %>/images/login_11.gif" border=0>
							</td>
						</tr>
						<tr>
							<td background=<%=request.getContextPath() %>/images/login_22.jpg height=300>
								<table height=300 cellpadding=0 width=900 border=0>
									<tbody>
										<tr>
											<td colspan=2 height=35></td>
										</tr>
										<tr>
											<td width=360></td>
											<td>
												<table cellspacing=0 cellpadding=2 border=0>
													<tbody>
														<tr>
															<td style="height: 28px" width=80>
																登 录 名：
															</td>
															<td style="height: 28px" width=150>
																<input id="userName" style="width: 130px" name="uName" />
															</td>
														</tr>
														<tr>
															<td style="height: 28px">
																登录密码：
															</td>
															<td style="height: 28px">
																<input id="userPassword" name="uPassword" style="width: 130px" type="password"/>
															</td>
														</tr>

														<tr>
															<td style="height: 18px"></td>
															<td style="height: 18px"></td>
															<td style="height: 18px"></td>
														</tr>
														<tr>

															<td>
																<input type="button" value="登录" onclick="sub()" style="cursor: pointer;" />
															</td>
														</tr>
													</tbody>
												</table>
											</td>
										</tr>
									</tbody>
								</table>
							</td>
						</tr>
						<tr>
							<td>
								<img src="<%=request.getContextPath() %>/images/login_33.jpg" border=0>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</form>
	</body>
</html>
