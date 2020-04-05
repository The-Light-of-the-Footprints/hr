<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form method="post" action="">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案删除 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="10%">
						档案编号
					</td>
					<td colspan="6" class="TD_STYLE2">
						<%=request.getParameter("humanId")%>
					</td>
					<td rowspan="6" width="13%" style="text-align: center;">
						<img src="images/<%=request.getParameter("humanPicture")%>"  style="width:120px;height:150px;"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="10%">
						I级机构
					</td>
					<td width="13%" class="TD_STYLE2">
						<%=request.getParameter("firstKindName")%>
					</td>
					<td width="10%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="13%" class="TD_STYLE2">
						<%=request.getParameter("secondKindName")%>
					</td>
					<td width="10%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2" width="2%">
						<%=request.getParameter("thirdKindName")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("majorKindName")%>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("majorName")%>
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<%=request.getParameter("humanProDesignation")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanName")%>
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanSex")%>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<%=request.getParameter("humanEmail")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanTelephone")%>
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanQq")%>
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<%=request.getParameter("humanMobilephone")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<%=request.getParameter("humanAddress")%>
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<%=request.getParameter("humanPostcode")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanNationality")%>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanBirthplace")%>
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<%=request.getParameter("humanBirthday")%>
					</td>
					<td width="10%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanRace")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanReligion")%>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanParty")%>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanIdCard")%>
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanSocietySecurityId")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanAge")%>
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanEducatedDegree")%>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanEducatedYears")%>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanEducatedMajor")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("salaryStandardId")%>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanBank")%>
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanAccount")%>
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("checker")%>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("checkTime")%>
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanSpeciality")%>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<%=request.getParameter("humanHobby")%>
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						档案附件
					</td>
					<td colspan="7" class="TD_STYLE2">
						<a href="#"><%=request.getParameter("attachmentName")%></a>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea rows="4"
							class="TEXTAREA_STYLE1" readonly="readonly"><%=request.getParameter("humanHistroyRecords")%></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea rows="4"
							class="TEXTAREA_STYLE1" readonly="readonly"><%=request.getParameter("humanFamilyMembership")%></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea rows="4" class="TEXTAREA_STYLE1" readonly="readonly"><%=request.getParameter("remark")%></textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>