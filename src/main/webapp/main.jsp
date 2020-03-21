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
</head>
<body class="easyui-layout">
		<div data-options="region:'north',title:'欢迎'" style="height:150px;">
			
		</div>
		<div data-options="region:'west',title:'菜单'" style="width:200px;">
			<ul id="tt"></ul>  
			<script type="text/javascript">
				$(function (){
					$('#tt').tree({    
					    url:'sysRight/querySysRightJson',
					    animate:true,
					    lines:true,
					    formatter:function(node){
					    	if(node.state=="open"){
					    		return '<a href="javascript:addTabs(\''+node.text+'\',\''+node.attributes.url+'\')">'+node.text+"</a>";
					    	}
					    	return node.text;
					    }
					}); 
					
				}) 
				function addTabs(name,url){
					var num=0;
					var ts=$("#tt2").tabs("tabs");
					for(i=0;i<ts.length;i++){
						t=ts[i];
						var title=t.panel("options").title;
						if(title==name){
							num=1;
							break;
						}
					}
					 if(num>0){
						 $("#tt2").tabs("select",name);
					 }else{
						 $('#tt2').tabs('add',{    
							    title:name,    
							    content:"<iframe style='width:100%;height:100%;border:0px' src='"+url+"'></iframe>",    
							    closable:true  
							});
					 }
				}
			</script>
		</div>
		<div data-options="region:'center'">
			<div id="tt2" class="easyui-tabs" style="width:100%;height:100%;">
				<div title="首页" style="padding:20px;display:none;">
					欢迎
				</div>
			</div>
		</div>
	</body>
</html>