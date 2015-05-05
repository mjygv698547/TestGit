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
  <p>书名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="b.bookname" id="bookname" /><INPUT type=submit value="查询" > </p>
  </form>
 <form action="editborrowinfobybookidandreaderid" method="post">
  <p>身份证编号 :<input type="text" name="r.readeridcard" id="readeridcard" />&nbsp;&nbsp;&nbsp;&nbsp;学员编号：<input type="text" name="r.readerid" id="readerid" /></p>
   <input type="hidden" name="b.bookid" value='<s:property value="#request.books.bookid"/>'>
   <s:if test="#request.books!=null">
   <table border="1px" align="center" width='80%'>
					<tr>
						<td>
							书籍名字
						</td>
						<td>
							书籍作者
						</td>
						<td>
							书籍状态
						</td>
						<td>
							操作
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
						<INPUT type=submit value="确定" > <INPUT type=reset value="取消">
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

