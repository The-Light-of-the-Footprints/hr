<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/JavaScript">
function timer()
{  
  var today=new Date();
  var yy=today.getFullYear();
  var month=today.getMonth()+1;
  var  day=today.getDate();
  var hh=today.getHours();
  var mm=today.getMinutes(); 
  var ss=today.getSeconds();
  document.getElementById("time1").value=yy+"-"+month+"-"+day+" "+hh+":"+mm+":"+ss;
}
var t=setInterval("timer()",1000)
</script>
<body>

		<form action="HumanFileController/insertHumanFile" method="get">
		<input type="hidden" name="checkStatus" value="2" />
		<input type="hidden" name="humanId" value="1" />
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1"/>
						<input type="reset" value="清除" class="BUTTON_STYLE1"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="firstKindId" class="SELECT_STYLE1" id="firstKind">
							<option value="1">集团</option>
							<option value="2">娱乐公司</option>
						</select>
						<input type="hidden" name="firstKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="secondKindId" class="SELECT_STYLE1" id="secondKind">
							<option value="1">软件公司</option>
							<option value="2">生物科技有限公司</option>
							<option value="3">天娱传媒</option>
							<option value="4">大众传媒</option>
						</select>
						<input type="hidden" name="secondKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="thirdKindId" class="SELECT_STYLE1" id="thirdKind">
							<option value="1">外包组</option>
							<option value="2">药店</option>
							<option value="3">艺人团体</option>
							<option value="4">明星组合</option>
						</select>
						<input type="hidden" name="thirdKindName"/>
					</td>
					<td rowspan="5" style="text-align: center;">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<select name="humanMajorKindId" class="SELECT_STYLE1" id="majorKind">
							<option value="1">销售</option>
							<option value="2">软件开发</option>
							<option value="3">人力资源</option>
							<option value="4">生产部</option>
						</select>
						<input type="hidden" name="humanMajorKindName"/>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="humanMajorId" class="SELECT_STYLE1" id="majorName">
							<option value="1">区域经理</option>
							<option value="2">总经理</option>
							<option value="3">程序员</option>
							<option value="4">专员</option>
							<option value="5">技术工人</option>
						</select>
						<input type="hidden" name="hunmaMajorName"/>
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<select name="humanProDesignation" class="SELECT_STYLE1">
							<option>工程师</option>
							<option>助理</option>
							<option>经理</option>
							<option>教授</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" id="humanName" name="humanName"
							class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="humanSex" class="SELECT_STYLE1">
							<option selected="selected">
								男
							</option>
							<option>
								女
							</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanEmail" id="humanEmail"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanTelephone" id="humanTelephone"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanQq" id="humanQq"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanMobilephone" id="humanMobilephone"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanAddress"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanPostcode"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="humanNationality" class="SELECT_STYLE1">
							<option>中国</option>
							<option>美国</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBirthplace"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="humanBirthday"
							class="INPUT_STYLE2" id="birthday">
					</td>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
						<select name="humanRace" class="SELECT_STYLE1">
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
							<option>无</option>
							<option>佛教</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<select name="humanParty" class="SELECT_STYLE1">
							<option>群众</option>
							<option>党员</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanIdCard" id="humanIdCard"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanSocietySecurityId"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAge" id="humanAge"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedDegree" class="SELECT_STYLE1">
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
							<option>12</option>
							<option>16</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedMajor" class="SELECT_STYLE1">
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
							<option>薪酬标准1</option>
							<option>薪酬标准2</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBank"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAccount"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="register" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						建档时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" id="time1" readonly="readonly"
							class="INPUT_STYLE2"></input>
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="humanSpeciality" class="SELECT_STYLE1">
							<option>java</option>
							<option>数据库</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="humanHobby" class="SELECT_STYLE1">
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
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanHistroyRecords" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFamilyMembership" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>

</html>