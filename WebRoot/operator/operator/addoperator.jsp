<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>��Ӳ���Ա</title>
		<LINK href="images/style.css" rel=stylesheet>
		<script type="text/javascript" src="js/operator.js"></script>
	</head>
	<body>
		<br><br>
		<div align="center">��Ӳ���Ա</div>
		<br>
		<s:property value="#request.info" />
		<form method="POST" action="addoperator">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>�û���:</b></font></td>
					<td><input type="text" name="o.ousername" size="40" id="ousername"></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>����Ա����:</b></font></td>
					<td><input type="text" name="o.orealname" size="40" id="orealname"></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>�Ա�:</b></font></td>
					<TD style="text-align: left"><FONT size=2><INPUT
									type=radio CHECKED value=1 name="o.osex"> �� <INPUT
									type=radio value=0 name="o.osex"> Ů </FONT>
					</TD>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>����:</b></font></td>
					<td><input type="text" name="o.ouserpwd" size="40" id="ouserpwd"></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>��ɫ:</b></font></td>
					<TD style="text-align: left"><FONT size=2><INPUT
									type=radio CHECKED value=1 name="o.oisadmin"> ����Ա <INPUT
									type=radio value=0 name="o.oisadmin"> ����Ա</FONT>
					</TD>
				</tr>
			
				<tr height="40">
					<td></td>
					<td align="center"><input type="submit" value="�ύ" name="B1">&nbsp;<input type="reset" value="����" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>