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
  <form action="getreturnbookinfobybookcode" method="post">
  <p>ͼ�������� :<input type="text" name="b.bookcode" id="keywords" />&nbsp;&nbsp;&nbsp;&nbsp;<INPUT type="submit" value="ȷ��" ></p>
 </form>
 
 <form action="returnbook" method="post">
 <s:if test="#request.borrowinfos!=null">
   <table border="1px" align="center">
   
					<tr>
						<td>
							�鼮����
						</td>
						<td>
						
							<s:property value="#request.borrowinfos.books.bookname"/>
						<br></td>
					</tr>
					
					
					<tr></tr>
					<tr>
						<td>
							ѧ��������
						</td>
						<td>
							<s:property value="#request.borrowinfos.readers.readername"/>
						</td>
					</tr>
					<tr>
						<td>
							ѧԱ���
						</td>
						<td>
							<s:property value="#request.borrowinfos.readers.readerid"/>
						</td>
					</tr>
					<tr>
						<td>
							��������
						</td>
						<td>
							<s:property value="#request.borrowinfos.borrowdate"/>
						</td>
					</tr>
					<tr><td>
					<input type="hidden" name="bf.borrowinfosid" value='<s:property value="#request.borrowinfos.borrowinfosid"/>'>
					<input type="hidden" name="b.bookstate" value='<s:property value="#request.borrowinfos.books.bookstate"/>'>
					<input type="hidden" name="b.bookid" value='<s:property value="#request.borrowinfos.books.bookid"/>'>
					</td>
					
					</tr>
					<tr>
						<td>
							<INPUT type=submit value="ȷ��" > 
						</td>
						<td>
							<INPUT type=reset value="ȡ��">
						</td>
					</tr>
					<tr>
						<td>
							�������
						</td>
						<td>
							<s:property value="#request.info"/>
						</td>
					</tr>
					
					</tr>
				</table>
				</s:if>
				</form>
				<s:if test="#request.orderinfo!=null">
				<table border="1px" align="center">
   
					<tr>
						<td>
							ԤԼ����ѧ��
						</td>
						<td>
						
							<s:property value="#request.orderinfo.readers.readerid"/>
						<br></td>
					</tr>
					
					
					<tr></tr>
					<tr>
						<td>
							ԤԼ��������
						</td>
						<td>
							<s:property value="#request.orderinfo.readers.readername"/>
						</td>
					</tr>
					<tr>
						<td>
							ԤԼ���������绰
						</td>
						<td>
							<s:property value="#request.borrowinfos.readers.telephone"/>
						</td>
					</tr>
					
					</table>
				</s:if>
			<s:if test="#request.info!=null">
				<table border="1px" align="center">
				<tr>
						<td>
							<s:property value="#request.info"/>
						</td>
					
					</tr>
				</table>
				</s:if>
				<p><s:property value="#request.info"/></p>
  </body>
</html>