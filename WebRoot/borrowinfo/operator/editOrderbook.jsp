<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'editBorrowbook.jsp' starting page</title>
    
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
  <form action="getbookinfobybookname" method="post">
  <p>������&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="b.bookname" id="bookname" /><INPUT type=submit value="��ѯ" > </p>
  </form>
 <form action="editborrowinfobybookidandreaderid" method="post">
  <p>���֤��� :<input type="text" name="r.readeridcard" id="readeridcard" />&nbsp;&nbsp;&nbsp;&nbsp;ѧԱ��ţ�<input type="text" name="r.readerid" id="readerid" /></p>
   <input type="hidden" name="b.bookid" value='<s:property value="#request.books.bookid"/>'>
   <s:if test="#request.books!=null">
   <table border="1px" align="center" width='80%'>
					<tr>
						<td>
							�鼮����
						</td>
						<td>
							�鼮����
						</td>
						<td>
							�鼮״̬
						</td>
						<td>
							����
						</td>
					</tr>
				
					<tr></tr>
					<tr>
						<td>
							<s:property value="#request.books.bookname"/>
						</td>
						<td>
							<s:property value="#request.books.bookauthor"/>
						</td>
					
					    <td>
							<s:property value="#request.bookstate"/>
						</td>
						<td>
						<INPUT type=submit value="ȷ��" > <INPUT type=reset value="ȡ��">
						</td>
	</table>
	</s:if>
	<s:if test="#request.info!=null">
				<table border="1px" align="center">
				<tr>
						<td>&nbsp;
							<s:property value="#request.info"/>
						</td>
					
					</tr>
				</table>
				</s:if>
	</form>
	<p>
	<s:property value="#request.infos"/>
	</p>
  </body>
</html>

