<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>��������</title>
		<LINK href="images/style.css" rel=stylesheet>
		<script type="text/javascript" src="js/test.js" ></script>
	</head>
	<body>
		<br><br>
		<div align="center">��������</div>
		<form method="POST" action="addnotice">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>������⣺</b></font></td>
					<td><input type="text" name="n.noticetitle" size="60"  id="noticetitle"></td>
				</tr>
				<tr height="40">
					<td valign="top"><font color="#FF9900"><b>��������:</b></font></td>
					<td><textarea rows="10" name="n.noticecontent" cols="60" id="noticecontent" ></textarea></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>��&nbsp;��&nbsp;��:</b></font></td>
					<td><input type="text" name="n.noticeperson" size="20" id="noticeperson"></td>
				</tr>				
				<tr height="40">
					<td></td>
					<td align="center"><input type="submit" value="�ύ" name="B1" onclick="return checkNotices()">&nbsp;<input type="reset" value="����" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>