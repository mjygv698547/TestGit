<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>�޸Ĳ���Ա</title>
		<LINK href="images/style.css" rel=stylesheet>
	</head>
	<body>
		<br><br>
		<div align="center">�޸Ĳ���Ա</div>
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
					<td><font color="#FF9900"><b>�û���:</b></font></td>
					<td><input type="text" name="o.ousername" size="40" value='<s:property value="#request.operators.ousername"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>����Ա����:</b></font></td>
					<td><input type="text" name="o.orealname" size="40" value='<s:property value="#request.operators.orealname"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>�Ա�:</b></font></td>
					<TD style="text-align: left"><FONT size=2>					
					<INPUT type=radio value="1" name="o.osex" <s:if test='#request.operators.osex=="1"'>checked</s:if>>�� 
					<INPUT type=radio value="0" name="o.osex" <s:if test='#request.operators.osex=="0"'>checked</s:if>>Ů </FONT>
					</TD>				
				</tr>
				
				<tr height="40">
					<td><font color="#FF9900"><b>����:</b></font></td>
					<td><input type="text" name="o.ouserpwd" size="40" value='<s:property value="#request.operators.ouserpwd"/>'></td>
				</tr>
				
				<tr height="40">
					<td><font color="#FF9900"><b>��ɫ:</b></font></td>
					<TD style="text-align: left"><FONT size=2>
					<INPUT type=radio value="1" name="o.oisadmin"<s:if test='#request.operators.oisamin=="1"'>checked</s:if>>����Ա 
					<INPUT type=radio value="0" name="o.oisadmin"<s:if test='#request.operators.oisadmin=="0"'>checked</s:if>>����Ա</FONT>
					</TD>
				</tr>
			
				
				<tr height="40">
					<td><input type="hidden" name="o.operatorid" value='<s:property value="#request.operators.operatorid" />'></td>
					<td align="center"><input type="submit" value="�ύ" name="B1">&nbsp;<input type="reset" value="����" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>