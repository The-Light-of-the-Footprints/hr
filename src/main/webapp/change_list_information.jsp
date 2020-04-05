<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="HumanFileController/updateHumanFile" method="post" >
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案变更 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="确认变更" class="BUTTON_STYLE1"/>
						<input type="reset" value="清除" class="BUTTON_STYLE1">
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
					<input type="hidden" name="humanId" value="<%=request.getParameter("humanId")%>" />
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
					<input type="text" readonly="readonly" value="<%=request.getParameter("firstKindName")%>" />
					<input type="hidden" name="firstKindId" value="<%=request.getParameter("firstKindId")%>" />
					</td>
					<td width="10%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="13%" class="TD_STYLE2">
					<input type="text" readonly="readonly" value="<%=request.getParameter("secondKindName")%>" />
					<input type="hidden" name="secondKindId" value="<%=request.getParameter("secondKindId")%>" />
					</td>
					<td width="10%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2" width="2%">
						<input type="text" readonly="readonly" value="<%=request.getParameter("thirdKindName")%>" />
						<input type="hidden" name="thirdKindId" value="<%=request.getParameter("thirdKindId")%>" />
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<input type="text" readonly="readonly" value="<%=request.getParameter("majorKindName")%>" />
						<input type="hidden" name="humanMajorKindId" value="<%=request.getParameter("humanMajorKindId")%>" />
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" readonly="readonly" value="<%=request.getParameter("majorName")%>" />
						<input type="hidden" name="humanMajorId" value="<%=request.getParameter("humanMajorId")%>" />
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<select  name="humanProDesignation" class="SELECT_STYLE1">
							<option selected="selected"><%=request.getParameter("humanProDesignation")%></option>
							<option>经理</option>
							<option>工程师</option>
							<option>教授</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanName" value="<%=request.getParameter("humanName")%>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="humanSex" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanSex")%></option>
							<option>男</option>
							<option>女</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanEmail" value="<%=request.getParameter("humanEmail")%>"
							class="INPUT_STYLE2" id="humanEmail">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanTelephone" value="<%=request.getParameter("humanTelephone")%>"
							class="INPUT_STYLE2" id="humanTelephone">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanQq" value="<%=request.getParameter("humanQq")%>"
							class="INPUT_STYLE2" id="humanQq">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanMobilephone" id="humanMobilephone"
							value="<%=request.getParameter("humanMobilephone")%>" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanAddress" value="<%=request.getParameter("humanAddress")%>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanPostcode" value="<%=request.getParameter("humanPostcode")%>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="humanNationality" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanNationality")%></option>
							<option>中国</option>
							<option>美国</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBirthplace" value="<%=request.getParameter("humanBirthplace")%>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="humanBirthday" readonly="readonly"
							value="<%=request.getParameter("humanBirthday")%>" class="INPUT_STYLE2" id="birthday">
					</td>
					<td width="10%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2">
						<select name="humanRace" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanRace")%></option>
							<option>汉族</option>
							<option>回族</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<select name="humanReligion" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanReligion")%></option>
							<option>无</option>
							<option>佛教</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<select name="humanParty" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanParty")%></option>
							<option>群众</option>
							<option>党员</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanIdCard" id="humanIdCard"
							value="<%=request.getParameter("humanIdCard")%>" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanSocietySecurityId" value="<%=request.getParameter("humanSocietySecurityId")%>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAge" value="<%=request.getParameter("humanAge")%>"
							class="INPUT_STYLE2" id="humanAge">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedDegree" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanEducatedDegree")%></option>
							<option>高中</option>
							<option>本科</option>
							<option>大专</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedYears" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanEducatedYears")%></option>
							<option>12</option>
							<option>16</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedMajor" class="SELECT_STYLE1">
						<option><%=request.getParameter("humanEducatedMajor")%></option>
							<option>生物工程</option>
							<option>计算机</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
						<select name="salaryStandardId" class="SELECT_STYLE1">
							<option><%=request.getParameter("salaryStandardId")%></option>
							<option>薪酬标准1</option>
							<option>薪酬标准2</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBank" value="<%=request.getParameter("humanBank")%>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAccount"
							value="<%=request.getParameter("humanAccount")%>" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checker" value="<%=request.getParameter("checker")%>"
							readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checkTime"
							id="create_time" readonly="readonly" value="<%=request.getParameter("checkTime")%>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="humanSpeciality" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanSpeciality")%></option>
							<option>java</option>
							<option>数据库</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="humanHobby" class="SELECT_STYLE1">
							<option><%=request.getParameter("humanHobby")%></option>
							<option>篮球</option>
							<option>跳舞</option>
						</select>
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
						<textarea name="humanHistroyRecords" rows="4"
							class="TEXTAREA_STYLE1"><%=request.getParameter("humanHistroyRecords")%></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFamilyMembership" rows="4"
							class="TEXTAREA_STYLE1"><%=request.getParameter("humanFamilyMembership")%></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" class="TEXTAREA_STYLE1"><%=request.getParameter("remark")%></textarea>
					</td>
					<input type="hidden" name="checkStatus" value="<%=request.getParameter("checkStatus")%>" />
				</tr>
			</table>
		</form>
	</body>
</html>