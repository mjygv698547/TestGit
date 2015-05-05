<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>注册读者证</title>
		<LINK href="images/style.css" rel=stylesheet>
		<script type="text/javascript"  src="js/jquery-1.3.2.js"></script>
		<script type="text/javascript"  src="js/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript" src="js/employee.js"></script>
	</head>
	<body>
		<br><br>
		<div align="center">注册读者证</div>
		<form method="post" action="xdjaddreader">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				
				<tr height="40">
					<td><font color="#FF9900"><b>学员编号</b></font></td>
					<td><input type="text" name="r.readerid" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>读者姓名:</b></font></td>
					<td><input type="text" name="r.readername" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>身份证号:</b></font></td>
					<td><input type="text" name="r.readeridcard" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>生效日期:</b></font></td>
					<td><input type="text" name="r.effectivedate" size="40" onclick="WdatePicker()" readonly="readonly"></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>过期日期:</b></font></td>
					<td><input type="text" name="r.deaddate" size="40" onclick="WdatePicker()" readonly="readonly" ></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>押金:</b></font></td>
					<td><input type="text" name="r.cash" size="40" ></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>规则编号:</b></font></td>
					<td><input type="text" name="r.regulationid" size="40" ></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>联系电话:</b></font></td>
					<td><input type="text" name="r.telephone" size="40" ></td>
				</tr>			
				<tr height="40">
					<td></td>
					<td align="center"><input type="submit" value="提交" name="B1">&nbsp;<input type="reset" value="重置" name="B1"></td>
				</tr>
				<tr height="40">
					<s:property value="#request.info"/>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>