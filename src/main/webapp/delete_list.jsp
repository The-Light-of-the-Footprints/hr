<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案删除 </font>
					</td>
				</tr>
				<tr>
					<td>
						符合条件的人力资源档案总数：<span style="color: red">${a }</span>例
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=5 cellspacing=1
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						档案编号
					</td>
					<td width="13%" class="TD_STYLE1">
						姓名
					</td>
					<td width="8%" class="TD_STYLE1">
						性别
					</td>
					<td width="14%" class="TD_STYLE1">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						III级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						职位分类
					</td>
					<td width="7%" class="TD_STYLE1">
						职位名称
					</td>
				</tr>
				
					<c:forEach items="${Humans}" var="h">
					<tr>
						<td>
						<a href="../change_list_information.jsp?humanId=${h.humanId}&humanName=${h.humanName}
						&humanSex=${h.humanSex}&humanEmail=${h.humanEmail}&humanTelephone=${h.humanTelephone}
						&humanQq=${h.humanQq}&humanMobilephone=${h.humanMobilephone}&humanAddress=${h.humanAddress}
						&humanPostcode=${h.humanPostcode}&humanNationality=${h.humanNationality}&humanBirthplace=${h.humanBirthplace}
						&humanBirthday=${h.humanBirthday}&humanRace=${h.humanRace}&humanReligion=${h.humanReligion}&humanParty=${h.humanParty}
						&humanIdCard=${h.humanIdCard}&humanSocietySecurityId=${h.humanSocietySecurityId}&humanAge=${h.humanAge}&humanEducatedDegree=${h.humanEducatedDegree}
						&humanEducatedYears=${h.humanEducatedYears}&humanEducatedMajor=${h.humanEducatedMajor}&salaryStandardId=${h.salaryStandardId}&humanBank=${h.humanBank}&humanAccount=${h.humanAccount}
						&checker=${h.checker}&checkTime=${h.checkTime}&humanSpeciality=${h.humanSpeciality}&humanHobby=${h.humanHobby}&humanProDesignation=${h.humanProDesignation}&remark=${h.remark}
						&humanHistroyRecords=${h.humanHistroyRecords}&humanFamilyMembership=${h.humanFamilyMembership}&firstKindId=${h.firstKindId}&secondKindId=${h.secondKindId}&thirdKindId=${h.thirdKindId}
						&humanMajorId=${h.humanMajorId}&humanMajorKindId=${h.humanMajorKindId}&humanPicture=${h.humanPicture }&attachmentName=${h.attachmentName}&firstKindName=${h.firstKind.firstKindName}
						&secondKindName=${h.secondKind.secondKindName}&thirdKindName=${h.thirdKind.thirdKindName}&majorKindName=${h.majorKind.majorKindName}&majorName=${h.major.majorName}">
						${h.humanId }</a>
						</td>
						<td>${h.humanName }</td>
						<td>${h.humanSex }</td>
						<td>${h.firstKind.firstKindName }</td>
						<td>${h.secondKind.secondKindName }</td>
						<td>${h.thirdKind.thirdKindName }</td>
						<td>${h.majorKind.majorKindName }</td>
						<td>${h.major.majorName }</td>
					</tr>
				</c:forEach>
			</table>
			<p style="text-align: center;">
									
					<a href="delete_list.html" style="color:black;">首页</a>
 
							    <font color="red">1</font> 
			 
     				<a href="delete_list.html" style="color:black;">尾页</a> 
				
			</p>
		</form>
	</body>

</html>