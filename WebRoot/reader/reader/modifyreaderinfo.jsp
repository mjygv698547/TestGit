<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'modifyuserinfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	<table border="1px" align="center">
		<tr>
			<td>�û�����</td>
			<td>${book.bookId}</td>
		</tr>
		<tr>
			<td>�����룺</td>
			<td>${book.bookName}</td>
		</tr>
		<tr>
			<td>�����룺</td>
			<td>${book.bookName}</td>
		</tr>
		<tr>
			<td>ȷ�����룺</td>
			<td>${book.bookName}</td>
		</tr>
		<TR>
			<TD align=center width=245 colSpan=2 height=36><INPUT
				type=submit value="ȷ��"> <INPUT type=reset value="ȡ��">
			</TD>

		</TR>


		</tr>
	</table>
</body>
</html>
