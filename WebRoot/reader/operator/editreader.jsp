<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>�޸���Ч��</title>
		<LINK href="images/style.css" rel=stylesheet>
		<script type="text/javascript"  src="js/jquery-1.3.2.js"></script>
		<script type="text/javascript"  src="js/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript" src="js/employee.js"></script>
	</head>
	<body>
		<br><br>
		
		<div align="center">�޸���Ч��</div>
		<form method="post" action="editdeaddatexdj">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr>
				<td><input type="hidden" name="r.readerid" value='<s:property value="#request.reader.readerid"/>'></td></tr>
										
				<tr height="40">
				<td><font color="#FF9900"><b>�û���:</b></font></td>
					
					<td><font color="#FF9900"><b><s:property value="#request.reader.readername"/></b></font></td>
					
				</tr>	
				<tr height="40">
				<td><font color="#FF9900"><b>��������:</b></font></td>
					<td><font color="#FF9900"><b><s:property value="#request.reader.deaddate"/></b></font></td>
					
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>�޸Ĺ�������:</b></font></td>
					<td><input type="text" name="r.deaddate" size="20" onclick="WdatePicker()"></td>
				</tr>											
				<tr height="40">
					<td></td>
					<td align="center"><input type="submit" value="�ύ" name="B1">&nbsp;<input type="reset" value="����" name="B1"></td>
				</tr>
					<s:property value="#request.info"/>
				<tr>
			</table>
			</div>
		</form>	
	</body>
</html>