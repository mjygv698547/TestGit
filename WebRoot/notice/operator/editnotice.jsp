<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>�޸Ĺ���</title>
		<LINK href="images/style.css" rel=stylesheet>
		<script type="text/javascript" src="js/test.js" ></script>
	</head>
	<body>
		<br><br>
		<div align="center">�޸Ĺ���</div>
		<form method="POST" action="editnotice">
						<div align="center">   
			<table>
				<tr height="40">
					<td><font color="#FF9900"><b>��������:</b></font></td>
					<td><input type="text" name="n.noticetitle" size="60" id="noticetitle" value='<s:property value="#request.notices.noticetitle"/>' ></td>
				</tr>                                                            
				<tr height="40">
					<td><font color="#FF9900"><b>ͨ&nbsp;֪&nbsp;��:</b></font></td>
					<td><input type="text" name="n.noticeperson" size="20"  id="noticeperson" value='<s:property value="#request.notices.noticeperson"/>'></td>
				</tr>
				<tr height="40">
					<td valign="top"><font color="#FF9900"><b>��������:</b></font></td>
					<td><textarea rows="10" name="n.noticecontent" cols="60" id="noticecontent" ><s:property value="#request.notices.noticecontent"/></textarea></td>
				</tr>
				<tr height="40">
					<td><input type="hidden" name="n.noticeid" size="60" value='<s:property value="#request.notices.noticeid"/>'></td>
					<td align="center"><input type="submit" value="�ύ" onclick="return checkNotices()" name="B1">&nbsp;<input type="reset" value="����" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>