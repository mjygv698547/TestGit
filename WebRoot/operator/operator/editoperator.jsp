<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>修改操作员</title>
		<LINK href="images/style.css" rel=stylesheet>
	</head>
	<body>
		<br><br>
		<div align="center">修改操作员</div>
		<br>
		<s:property value="#request.info" />
		<form method="POST" action="modifyoperator">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>用户名:</b></font></td>
					<td><input type="text" name="o.ousername" size="40" value='<s:property value="#request.operators.ousername"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>操作员姓名:</b></font></td>
					<td><input type="text" name="o.orealname" size="40" value='<s:property value="#request.operators.orealname"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>性别:</b></font></td>
					<TD style="text-align: left"><FONT size=2>					
					<INPUT type=radio value="1" name="o.osex" <s:if test='#request.operators.osex=="1"'>checked</s:if>>男 
					<INPUT type=radio value="0" name="o.osex" <s:if test='#request.operators.osex=="0"'>checked</s:if>>女 </FONT>
					</TD>				
				</tr>
				
				<tr height="40">
					<td><font color="#FF9900"><b>密码:</b></font></td>
					<td><input type="text" name="o.ouserpwd" size="40" value='<s:property value="#request.operators.ouserpwd"/>'></td>
				</tr>
				
				<tr height="40">
					<td><font color="#FF9900"><b>角色:</b></font></td>
					<TD style="text-align: left"><FONT size=2>
					<INPUT type=radio value="1" name="o.oisadmin"<s:if test='#request.operators.oisamin=="1"'>checked</s:if>>管理员 
					<INPUT type=radio value="0" name="o.oisadmin"<s:if test='#request.operators.oisadmin=="0"'>checked</s:if>>操作员</FONT>
					</TD>
				</tr>
			
				
				<tr height="40">
					<td><input type="hidden" name="o.operatorid" value='<s:property value="#request.operators.operatorid" />'></td>
					<td align="center"><input type="submit" value="提交" name="B1">&nbsp;<input type="reset" value="重置" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>