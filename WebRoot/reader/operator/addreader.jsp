<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>ע�����֤</title>
		<LINK href="images/style.css" rel=stylesheet>
		<script type="text/javascript"  src="js/jquery-1.3.2.js"></script>
		<script type="text/javascript"  src="js/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript" src="js/employee.js"></script>
	</head>
	<body>
		<br><br>
		<div align="center">ע�����֤</div>
		<form method="post" action="xdjaddreader">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				
				<tr height="40">
					<td><font color="#FF9900"><b>ѧԱ���</b></font></td>
					<td><input type="text" name="r.readerid" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>��������:</b></font></td>
					<td><input type="text" name="r.readername" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>���֤��:</b></font></td>
					<td><input type="text" name="r.readeridcard" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>��Ч����:</b></font></td>
					<td><input type="text" name="r.effectivedate" size="40" onclick="WdatePicker()" readonly="readonly"></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>��������:</b></font></td>
					<td><input type="text" name="r.deaddate" size="40" onclick="WdatePicker()" readonly="readonly" ></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>Ѻ��:</b></font></td>
					<td><input type="text" name="r.cash" size="40" ></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>������:</b></font></td>
					<td><input type="text" name="r.regulationid" size="40" ></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>��ϵ�绰:</b></font></td>
					<td><input type="text" name="r.telephone" size="40" ></td>
				</tr>			
				<tr height="40">
					<td></td>
					<td align="center"><input type="submit" value="�ύ" name="B1">&nbsp;<input type="reset" value="����" name="B1"></td>
				</tr>
				<tr height="40">
					<s:property value="#request.info"/>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>