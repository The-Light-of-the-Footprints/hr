<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form method="post" action="HumanFileController/queryAllByDeleteLocate">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案删除查询 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="查询" class="BUTTON_STYLE1"/>
						<input type="button" value="搜索" class="BUTTON_STYLE1"
							onclick="location.href='delete_keywords.jsp'">
						<input type="hidden" name="result" value="toChangeList"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在I级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="firstKindId" size="5" id="firstKind"
							class="SELECT_STYLE2">
							<option value="" selected="selected">全部</option>
							
								<option value="1">集团</option>
							
								<option value="2">娱乐公司</option>
							
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择员工所在II级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="secondKindId" size="5" id="secondKind"
							class="SELECT_STYLE2">
							<option value="" selected="selected">
								全部
							</option>
								<option value="1">软件公司</option>
							
								<option value="2">生物科技有限公司</option>
							
								<option value="3">天娱传媒</option>
							
								<option value="4">大众传媒</option>
							
						</select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在III级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="thirdKindId" class="SELECT_STYLE2" size="5" id="thirdKind">
							<option value="" selected="selected">
								全部
							</option>
							
								<option value="1">外包组</option>
							
								<option value="2">药店</option>
							
								<option value="3">艺人团体</option>
							
								<option value="4">明星组合</option>
							</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择职位分类
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanMajorKindId" size="5" id="majorKind"
							class="SELECT_STYLE2">
							<option value="" selected="selected">
								全部
							</option>
							
								<option value="1">销售</option>
							
								<option value="2">软件开发</option>
							
								<option value="3">人力资源</option>
							
								<option value="4">生产部</option>
							
						</select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择职位名称
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanMajorId" size="5" class="SELECT_STYLE2" id="majorName">
							<option value="" selected="selected">
								全部
							</option>
							
								<option value="1">区域经理</option>
							
								<option value="2">总经理</option>
							
								<option value="4">程序员</option>
							
								<option value="6">专员</option>
							
								<option value="8">技术工人</option>
							
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<input type="text" name="startTime" 
							style="width: 14%" class="INPUT_STYLE2" id="date_start">
						至
						<input type="text" name="endTime" 
							style="width: 14%" class="INPUT_STYLE2" id="date_end">
					</td>
				</tr>
			</table>
		</form>
	</body>

</html>