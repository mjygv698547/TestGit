<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>���ͼ�����</title>
		<LINK href="images/style.css" rel=stylesheet>
	</head>
	<body>
		<br><br>
		<div align="center">���ͼ�����</div>
		<br>
		<s:property value="#request.info" />
		<form method="POST" action="addbooktype">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>�������:</b></font></td>
					<td><input type="text" name="bt.booktypename" size="40"></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>��Ӧλ��:</b></font></td>
					<td><input type="text" name="bt.booktypelocation" size="40" ></td>
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