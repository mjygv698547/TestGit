<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>修改图书类别</title>
		<LINK href="images/style.css" rel=stylesheet>
	</head>
	<body>
		<br><br>
		<div align="center">修改图书类别</div>
		<br>
		<s:property value="#request.info" />
		<form method="POST" action="modifybooktype">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>类别名称:</b></font></td>
					<td><input type="text" name="bt.booktypename" size="40" value='<s:property value="#request.booktypes.booktypename"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>对应位置:</b></font></td>
					<td><input type="text" name="bt.booktypelocation" size="40" value='<s:property value="#request.booktypes.booktypelocation"/>'></td>
				</tr>				
				<tr height="40">
					<td><input type="hidden" name="bt.booktypeid" value='<s:property value="#request.booktypes.booktypeid" />'></td>
					<td align="center"><input type="submit" value="提交" name="B1">&nbsp;<input type="reset" value="重置" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>