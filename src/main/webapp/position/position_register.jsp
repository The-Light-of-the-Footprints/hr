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

<script type="text/javascript">
	$(function(){
		$.post("<%=request.getContextPath()%>/ConfigFileFirstKind/queryConfigFileFirstKind",function(data){
			for(var a=0;a<data.length;a++){
				var k="<option value='"+data[a].firstKindId+"'>"+data[a].firstKindName+"</option>";
				$("#firstKindId").append($(k));
			}
		},"json")
		$.post("<%=request.getContextPath()%>/ConfigMajorKind/queryConfigMajorKind",function(data){
			for(var a=0;a<data.length;a++){
				var k="<option value='"+data[a].majorKindId+"'>"+data[a].majorKindName+"</option>";
				$("#majorKindId").append($(k));
			}
		})
	})
	function yiceng(){
		$("#thirdKindId")[0].options.length=1
		$("#secondKindId")[0].options.length=1
		$.post("<%=request.getContextPath()%>/ConfigFileSecondKind/queryByFirstKindId",{id:$("#firstKindId").val()},function(data){
			for(var a=0;a<data.length;a++){
				var k="<option value='"+data[a].secondKindId+"'>"+data[a].secondKindName+"</option>";
				$("#secondKindId").append($(k));
			}
		})
	}
	function erceng(){
		$("#thirdKindId")[0].options.length=1
		$.post("<%=request.getContextPath()%>/ConfigFileThirdKind/queryBySecondKindId",{id:$("#secondKindId").val()},function(data){
			for(var a=0;a<data.length;a++){
				var k="<option value='"+data[a].thirdKindId+"'>"+data[a].thirdKindName+"</option>";
				$("#thirdKindId").append($(k));
			}
		})
	}
	
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
	<style type="text/css">
		.TD_STYLE1{
			background: yellow;
		}
	</style>
 	</head>
	<body>
		<form name="humanfileForm" method="post" action="<%=request.getContextPath()%>/engagemajorrelease/insertEngageMajorRelease" >
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：招聘管理--职位发布管理--职位发布登记 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1">
						<input type="reset" value="清除" class="BUTTON_STYLE1">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=0
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="firstKindId" id="firstKindId"  onchange="yiceng()" class="SELECT_STYLE1"> 
							<option value="">--请选择--</option>
						 </select>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select id="secondKindId" class="SELECT_STYLE1" onchange="erceng()"> 
							<option value="">--请选择--</option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2"  >
						<select name="thirdKindId" id="thirdKindId" class="SELECT_STYLE1">
							<option value="">--请选择--</option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="engageType" id="engageType" class="SELECT_STYLE1"> 
								<option value="">--请选择--</option> 
								<option value="校园招聘">校园招聘</option> 
								<option value="社会招聘">社会招聘</option> 
						 </select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<select name="majorKindId" id="majorKindId" class="SELECT_STYLE1" onchange="zhi()">
							<option value="">--请选择--</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="majorId" id="majorId" class="SELECT_STYLE1"> 
							<option value="">--请选择--</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						招聘人数
					</td>
					<td   class="TD_STYLE2">
						 <input type="text" name="humanAmount" id="humanAmount"  class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						截止日期
					</td>
					<td   class="TD_STYLE2">
							  <input type=date name="deadline" 
							  class="INPUT_STYLE2" id="date_start">
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						登记人
					</td>
					<td  class="TD_STYLE2">
						 <input type="text" name="register" value='<%=request.getSession().getAttribute("utruename") %>' class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td   class="TD_STYLE2" colspan="5">
					
							<input type="text" name="registTime"
							  id="nowTime" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位描述
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="majorDescribe" rows="4" cols="80" class="TEXTAREA_STYLE1"></textarea>
					</td>
					 
				</tr>
					<tr>
					<td class="TD_STYLE1">
						招聘要求
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="engageRequired" rows="4"  cols="80" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>