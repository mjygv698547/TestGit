<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'bookInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="CSS/link.css">
</head>

<body>
	<div>
		<div id="left">
			<table>
				<tr>
					<td>
						
					<td></td>
				</tr>
			</table>
		</div>
		<div id="right">
			<table border="1px" align="center">
				<tr>
					<td>ͼ����</td>
					<td><s:property value="#request.books.bookid"/></td>
				</tr>
				<tr>
					<td>����</td>
					<td><s:property value="#request.books.bookname"/></td>
				</tr>
				<tr></tr>
				<tr>
					<td>ISBN</td>
					<td><s:property value="#request.books.bookisbn"/></td>
				</tr>
				<tr>
					<td>������</td>
					<td><s:property value="#request.books.bookpublish"/></td>
				</tr>
				<tr>
					<td>��������</td>
					<td><s:property value="#request.books.bookpublishdate"/></td>
				</tr>
				<tr>
					<td>����</td>
					<td><s:property value="#request.books.bookprice"/></td>
				</tr>
				<tr>
					<td>�������</td>
					<td><s:property value="#request.books.bookindate"/></td>
				</tr>
				<tr>
					<td>�����</td>
					<td><s:property value="#request.books.bookcode"/></td>
				</tr>
				<tr>
					<td>ͼ��״̬</td>
					<td><s:property value="#request.books.bookstate"/></td>
				</tr>
				<tr>
					<td>�������</td>
					<td><s:property value="#request.books.booktype.booktypename"/></td>
				</tr>
				<tr>
					<td>����λ��</td>
					<td><s:property value="#request.books.booktype.booktypelocation"/></td>
				</tr>
				
					
										
			</table>
		</div>
	</div>
</body>
</html>
