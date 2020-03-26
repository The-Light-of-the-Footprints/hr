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
	<script type="text/javascript">
 		window.onload=check;
		function tick() {
			var now = new Date();
			var hours, minutes, seconds, noon;
			var intHours, intMinutes, intSeconds;
			intHours = now.getHours();
			intMinutes = now.getMinutes();
			intSeconds = now.getSeconds();
			if (intHours < 24) {
				hours = intHours+":";
				noon = "A.M.";
			} else {
				intHours = intHours - 24;
				hours = intHours + ":";
				noon = "P.M.";
			}
			if (intMinutes < 10) {
				minutes = "0"+intMinutes+":";
			} else {
				minutes = intMinutes+":";
			}
			if (intSeconds < 10) {
				seconds = "0"+intSeconds+" ";
			} else {
				seconds = intSeconds+" ";
			}
			timeString = hours+minutes+seconds;
			var now = new Date();
		  	document.getElementById("nowTime").value=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+timeString;
			window.setTimeout("tick();", 1000);
		}
		
		//load事件
		function check(){
			//获得系统当前时间的方法
		  	tick();					
		}
 	</script>
 	<style type="text/css">
 		.TD_STYLE1{
 			background: yellow;
 		}
 	</style>
 	<script type="text/javascript">
 		$(function() {
 			$.post("<%=request.getContextPath()%>/ConfigMajorKind/queryConfigMajorKind",function(data){
 				for(var a=0;a<data.length;a++){
 					var k="<option value='"+data[a].majorKindId+"'>"+data[a].majorKindName+"</option>";
 					$("#majorKindId").append($(k));
 				}
 			})
 			$("[name=engageType]").val("${EngageResume.engageType}")
 			$("[name=humanNationality]").val("${EngageResume.humanNationality}")
 			$("[name=humanRace]").val("${EngageResume.humanRace}")
 			$("[name=humanReligion]").val("${EngageResume.humanReligion}")
 			$("[name=humanParty]").val("${EngageResume.humanParty}")
 			$("[name=humanEducatedDegree]").val("${EngageResume.humanEducatedDegree}")
 			$("[name=humanHobby]").val("${EngageResume.humanHobby}")
 			$("[name=humanEducatedMajor]").val("${EngageResume.humanEducatedMajor}")
 			$("[name=humanEducatedYears]").val("${EngageResume.humanEducatedYears}")
 			$("[name=humanSpecility]").val("${EngageResume.humanSpecility}")
		})
		function zhi(){
			$("#majorId")[0].options.length=1
			$.post("<%=request.getContextPath()%>/ConfigMajor/queryByConfigMajorId",{id:$("#majorKindId").val()},function(data){
				for(var a=0;a<data.length;a++){
					var k="<option value='"+data[a].majorId+"'>"+data[a].majorName+"</option>";
					$("#majorId").append($(k));
				}
			})
		}
 	</script>
	</head>
	<body>
	<form  action="<%=request.getContextPath() %>/EngageResume/updateEngageResume" method="post" >
		<input type="hidden" name="resId" value="${EngageResume.resId}">
		<input type="hidden" name="register" value='<%=request.getSession().getAttribute("utruename")%>'>
		<input type="hidden" name=humanAge value="16">
		<input type="hidden" name="checkStatus" value="4">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：招聘管理--简历管理--面试 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1" >
						<input type="reset" value="清除" class="BUTTON_STYLE1">
						<input type="reset" value="清除" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=0 
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<select name="humanMajorKindId" id="majorKindId" class="SELECT_STYLE1" onchange="zhi()">
							<option value="">--请选择--</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="humanMajorId" id="majorId" class="SELECT_STYLE1"> 
							<option value="">--请选择--</option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2"> 
					<select name="engageType" class="SELECT_STYLE1" >
						<option value="校园招聘">校园招聘</option> 
						<option value="社会招聘">社会招聘</option> 
					</select>
					</td>
					<td rowspan="6" >
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						 <input type="text"  value="${EngageResume.humanName}" name="humanName" id="name" class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="humanSex"  value="${EngageResume.humanSex}" class="SELECT_STYLE1"><option value="男">男</option>
							<option value="女">女</option></select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanEmail}" name="humanEmail" id="email" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
					电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanTelephone}" name="humanTelephone"  id="phone" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						家庭电话
					</td>
					<td class="TD_STYLE2">
					 <input type="text" value="${EngageResume.humanHomephone}" name="humanHomephone" id="humanHomephone" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanMobilephone}" name="humanMobilephone" id="humanMobilephone" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanAddress}" name="humanAddress" class="INPUT_STYLE2">
					</td>
					 
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanPostcode}" name="humanPostcode" class="INPUT_STYLE2">
					</td>
				</tr>
				 
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
					 <select name="humanNationality"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="中国">中国</option> 
							
							<option value="美国">美国</option> 
							
					 </select> 
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanBirthplace}" name="humanBirthplace" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" colspan="2" class="TD_STYLE2">
						<input type="date" value="${EngageResume.humanBirthday}" name="humanBirthday" id="birthday" class="INPUT_STYLE2"  >
					</td>
					
				</tr>
				<tr>
				<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
				 	 <select name="humanRace"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="汉族">汉族</option> 
							
							<option value="回族">回族</option> 
							
					 </select>  
					</td>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
					   <select name="humanReligion"  class="SELECT_STYLE1"> 
							
							<option value="无">无</option> 
							
							<option value="佛教">佛教</option> 
							
					 </select>  
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2" colspan="2">
					   <select name="humanParty" class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="党员">党员</option> 
							
							<option value="群众">群众</option> 
							
					 </select>  	  
					</td>
					
					 
				</tr>
				<tr>
				<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanIdcard}" name="humanIdcard" id="card" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${EngageResume.humanAge}" name="humanAge" id="humanAge" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						毕业院校
					</td>
					<td class="TD_STYLE2">
						 <input type="text" value="${EngageResume.humanCollege}" name="humanCollege" class="INPUT_STYLE2"/>
					</td>
					
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
					  <select name="humanEducatedDegree"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="本科">本科</option> 
							
							<option value="大专">大专</option> 
							
					 </select> 
					</td>
					
				</tr>
				<tr>
				<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
					   <select name="humanEducatedYears"  class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="12">12</option> 
							
							<option value="16">16</option> 
							
					 </select> 
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
					   <select name="humanEducatedMajor" class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="生物工程">生物工程</option> 
							
							<option value="计算机">计算机</option> 
							
					 </select>  
					</td>
					
					<td class="TD_STYLE1">
						薪酬要求
					</td>
					<td class="TD_STYLE2">
						<input type="text" value="${EngageResume.demandSalaryStandard}" name="demandSalaryStandard" id="demandSalaryStandard" class="INPUT_STYLE2" />
					</td>
					<td class="TD_STYLE1">
						注册时间
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="registTime" value="${EngageResume.registTime}"
							  id="nowTime" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					
				</tr>
				<tr>
					 
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
					   <select name="humanSpecility"  class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="数据库">数据库</option> 
							
							<option value="java">java</option> 
							
					 </select> 
						 
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2" colspan="5">
				     <select name="humanHobby" class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<option value="篮球">篮球</option> 
							
							<option value="舞蹈">舞蹈</option> 
							
					 </select> 
						  
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanHistoryRecords" rows="4" class="TEXTAREA_STYLE1">${EngageResume.humanHistoryRecords}</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" class="TEXTAREA_STYLE1">${EngageResume.remark}</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						推荐建议
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="recomandation" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		 </form>
	</body>
</html>
