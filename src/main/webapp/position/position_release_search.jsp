<%@page import="com.hr.entity.ConfigMajor"%>
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
				$('#dg').datagrid({
					url: '<%=request.getContextPath()%>/engagemajorrelease/queryEngageMajorRelease',
					fitColumns:true,
					pagination:true,
					pageNumber:1,
					pageSize:3,
					pageList:[1,2,3,4,5],
					idField:"mreId",
					sortName:"mreId",
					sortOrder:"desc",
					columns: [
						[{
								field: "majorId",
								title: "职位名称",
								width: 200,
								align:'center',
								formatter:function (v,r,i){
									var a;
									$.ajax({  
						               type: "POST",  
						               url: "<%=request.getContextPath()%>/ConfigMajor/queryConfigMajorName",  
						               async:false,
						               data:{"id":v},
						               success : function(data){
						            	   a=data[0].majorName
						            	 }
						         	}); 
									return  a;
								}
							},
							{
								field: "thirdKindId",
								title: "机构名称",
								width: 200,
								align:'center',
								formatter:function (v,r,i){
									var k;
									$.ajax({  
						               type: "POST",  
						               url: "<%=request.getContextPath()%>/ConfigFileThirdKind/queryConfigFileThirdKindName",  
						               async:false,
						               data:{"id":v},
						               success : function(data){
						            	   k=data.thirdKindName
						            	 }
						         	}); 
									return  k;
								}
							},
							{
								field: "humanAmount",
								title: "招聘人数",
								width: 200,
								align:'center'
							},
							{
								field: "registTime",
								title: "发布时间",
								width: 200,
								align:'center'
							},
							{
								field: "deadline",
								title: "截止时间",
								width: 200,
								align:'center'
							},
							{
								field: "mreId",
								title: "申请职位",
								width: 200,
								align:'center',
								formatter:function (v,r,i){
									return "<a href='#' onclick='query("+v+")''>详情</a> ";
								}
							}
						]
					]
				});
			})
	</script>
	<script type="text/javascript">
		function query(id) {
			location.href="<%=request.getContextPath()%>/engagemajorrelease/queryByMreId?id="+id
		}
	</script>
	</head>
	<body>
		<div id="dg" ></div>
	</body>
</html>
