<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>�޸�ͼ��</title>
		<LINK href="images/style.css" rel=stylesheet>
	</head>
	<body>
		<br><br>
		<div align="center">�޸�ͼ��</div>
		<br>
		<s:property value="#request.info" />
		<form method="POST" action="modifybook">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>����:</b></font></td>
					<td><input type="text" name="b.bookname" size="40" value='<s:property value="#request.books.bookname"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>����:</b></font></td>
					<td><input type="text" name="b.bookauthor" size="40" value='<s:property value="#request.books.bookauthor"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>ISBN:</b></font></td>
					<td><input type="text" name="b.bookisbn" size="40" value='<s:property value="#request.books.bookisbn"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>������:</b></font></td>
					<td><input type="text" name="b.bookpublish" size="40" value='<s:property value="#request.books.bookpublish"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>��������:</b></font></td>
					<td><input type="text" name="b.bookpublishdate" size="40" value='<s:property value="#request.books.bookpublishdate"/>'></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>����:</b></font></td>
					<td><input type="text" name="b.bookprice" size="40" value='<s:property value="#request.books.bookprice"/>'></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>�������:</b></font></td>
					<td><input type="text" name="b.bookindate" size="40" value='<s:property value="#request.books.bookindate"/>'></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>�����:</b></font></td>
					<td><input type="text" name="b.bookcode" size="40" value='<s:property value="#request.books.bookcode"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>ͼ��״̬:</b></font></td>
					<s:if test="#request.books.bookstate==1">
						<td align="center"><font><b>��&nbsp;&nbsp;��</b></font></td>
						<td><input type="hidden" name="b.bookstate" size="40" value='<s:property value="#request.books.bookstate"/>'></td>
					</s:if>
					<s:if test="#request.books.bookstate!=1">
					<td><INPUT type=radio value="0" name="b.bookstate"<s:if test='#request.books.bookstate=="0"'>checked</s:if>>δ��
						<INPUT type=radio value="1" name="b.bookstate"<s:if test='#request.books.bookstate=="1"'>checked</s:if>>�ѽ�
						<INPUT type=radio value="2" name="b.bookstate"<s:if test='#request.books.bookstate=="2"'>checked</s:if>>ԤԼ
					</td>
					</s:if>
				</tr>	
				
				<tr height="40">
					<td><input type="hidden" name="b.bookid" value='<s:property value="#request.books.bookid" />'></td>
					<td align="center"><input type="submit" value="�ύ" name="B1">&nbsp;<input type="reset" value="����" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>