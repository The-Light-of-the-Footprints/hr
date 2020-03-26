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
		$(function() {
			$.ajax({
	               type: "POST",  
	               url: "<%=request.getContextPath()%>/ConfigMajor/queryConfigMajorName",  
	               async:false,
	               data:{"id":${EngageMajorRelease.majorId}},
	               success : function(data){
	            	   $("#zwei").text(data[0].majorName)
	            	   $.ajax({
	    	               type: "POST",  
	    	               url: "<%=request.getContextPath()%>/ConfigMajorKind/queryConfigMajorKindName",  
	    	               async:false,
	    	               data:{"id":data[0].majorKindId},
	    	               success : function(data){
	    	            	   $("#fen").text(data[0].majorKindName)
	    	               }
	    	         	}); 
	               }
	         	}); 
			$.post("<%=request.getContextPath() %>/ConfigFileThirdKind/queryById",{"id":${EngageMajorRelease.thirdKindId}},function(data){
				$("#san").text(data.thirdKindName)
				$.post("<%=request.getContextPath() %>/ConfigFileSecondKind/queryById",{id:data.secondKindId},function(da){
					$("#er").text(da.secondKindName)
					$.post("<%=request.getContextPath() %>/ConfigFileFirstKind/queryById",{id:da.firstKindId},function(ta){
						$("#yi").text(ta.firstKindName)
					}) 
				})
			})
		})
	</script>
	<style type="text/css">
		.TD_STYLE1{
			background: yellow;
		}
	</style>
 	</head>
	<body>
			<table width="100%"> 
				<tr>
					<td>
						<font color="black">您正在做的业务是：招聘管理--职位发布管理--职位发布查询--详细  </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=0 bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2" id="yi">
						
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2" id="er">
						
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2"  id="san">
						
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
						${EngageMajorRelease.engageType}
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2" id="fen">
						
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2" id="zwei">
						
					</td>
					<td class="TD_STYLE1">
						招聘人数
					</td>
					<td   class="TD_STYLE2">
						 ${EngageMajorRelease.humanAmount}
					<td class="TD_STYLE1">
						截止日期
					</td>
					<td   class="TD_STYLE2"> 
						 ${deadline}
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						登记人
					</td>
					<td  class="TD_STYLE2">
						  ${EngageMajorRelease.register}
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td   class="TD_STYLE2" colspan="5">
						 ${registTime}
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位描述
					</td>
					<td class="TD_STYLE2" colspan="8">
						 ${EngageMajorRelease.majorDescribe}
					</td>
				</tr>
					<tr>
					<td class="TD_STYLE1">
						招聘要求
					</td>
					<td class="TD_STYLE2" colspan="8">
						 ${EngageMajorRelease.engageRequired}
					</td>
				</tr>
			</table>
	</body>
</html>