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
	a:link {
		text-decoration: none;
	}
	</style>
	<script type="text/javascript">
			$(function() {
				$('#dg').datagrid({
					url: '<%=request.getContextPath() %>/EngageResume/queryByWhere',
					fitColumns:true,
					pagination:true,
					pageNumber:1,
					pageSize:3,
					pageList:[1,2,3,4,5],
					idField:"mreId",
					sortName:"mreId",
					sortOrder:"desc",
					queryParams: {"humanMajorId":$("#majorKindId").val(),"humanName":$("#humanName").val(),"er.registTime":$("#registTime").val(),"er.checkTime":$("#checkTime").val()},
					columns: [
						[{
								field: "resId",
								title: "档案编号",
								width: 200,
								align:'center',
								formatter:function (v,r,i){
									return "<a href='#' onclick='query("+v+")'>"+v+"</a>";
								}
							},
							{
								field: "humanName",
								title: "姓名",
								width: 200,
								align:'center'
							},
							{
								field: "humanSex",
								title: "性别",
								width: 200,
								align:'center'
							},
							{
								field: "humanMajorId",
								title: "职位名称",
								width: 200,
								align:'center',
								formatter:function (v,r,i){
									var a;
									$.ajax({  
							               type: "POST",  
							               url: "<%=request.getContextPath() %>/ConfigMajor/queryById",  
							               async:false,
							               data:{"id":v},
							               success : function(data){
							            	   a=data.majorName
							            	 }
							         	}); 
									return a;
								}
							},
							{
								field: "humanTelephone",
								title: "电话号码",
								width: 200,
								align:'center'
							},
							{
								field: "checkStatus",
								title: "复核状态",
								width: 200,
								align:'center',
								formatter:function (v,r,i){
									if(v>0){
										return "已复核";
									}
									return "待复核";
								}
							}
						]
					]
				});
				$.post("<%=request.getContextPath()%>/ConfigMajor/queryConfigMajor",function(data){
					for(var a=0;a<data.length;a++){
						var b="<option value="+data[a].majorId+">"+data[a].majorName+"</option>"
						$("#majorKindId").append($(b))
					}
				})
			})
			function cha() {
				 $('#dg').datagrid({queryParams: {"humanMajorId":$("#majorKindId").val(),"humanName":$("#humanName").val(),"er.registTime":$("#registTime").val(),"er.checkTime":$("#checkTime").val()}});
			}
			function query(r) {
				location.href="<%=request.getContextPath()%>/EngageResume/queryById2?id="+r;
			}
	</script>
	<style type="text/css">
		.TD_STYLE1{
			background: yellow;
		}
	</style>
</head>
	<body>
	
		<form name="resumeChooseForm" >
			<table width="100%">
				<tr>
					<td>
						<font color="black" >您正在做的业务是：招聘管理--简历管理--简历筛选 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="开始" class="BUTTON_STYLE1" onclick="cha()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=0
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="30%">
						请选择职位
					</td>
					<td class="TD_STYLE2" width="30%">
					<select name="humanMajorId" style="width: 290;" id="majorKindId"  class="SELECT_STYLE2"> 
						<option value="0">--请选择--</option>
					 </select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="30%">
						请输入名字
					</td>
					<td width="84%">
						<input type="text" name="humanName" id="humanName" class="INPUT_STYLE2" />
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1" width="30%">
						请输入登记时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<input type="date" name="registTime"  id="registTime"
							style="width: 14%" class="INPUT_STYLE2">
						至
						<input type="date" name="checkTime"  id="checkTime"
							style="width: 14%" class="INPUT_STYLE2" >
					</td>
				</tr>
			</table>
		</form>
		<div id="dg" ></div>
	</body>
</html>