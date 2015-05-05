<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'editBorrowbook.jsp' starting page</title>


  </head>
  
  <body>
   <table>
  <form action="getreaderandbookinfo" method="post">
 
  <p>图书条形码 :<input type="text" name="b.bookcode" id="bookcode" /></p>
  
  <p>学员编号：<input type="text" name="bf.readerid" id="readerid" /></p> <tr>
						<td>
							<INPUT type=submit value="确定" > 
						</td>
						<td>
							<INPUT type=reset value="取消">
						</td>
					</tr>
  </form>
 
            <form action="borrowbook" method="post">   
            	<s:if test="#request.books!= null">
               <table border="1px" align="center">
					<tr>
						<td>
							书籍名字
						</td>
						<td>
							<input type="hidden" name="b.bookname" value='<s:property value="#request.books.bookname"/>'>
							<input type="hidden" name="bf.bookid" value='<s:property value="#request.books.bookid"/>'>
							<s:property value="#request.books.bookname"/>
						</td>
					</tr>
					
					
					<tr>
						<td>
							学生的名字
						</td>
						<td>
						    <input type="hidden" name="bf.readerid" value='<s:property value="#request.reader.readerid"/>'>
							<s:property value="#request.reader.readername"/>
						</td>
					</tr>
					<tr>
						<td>
							书籍状态
						</td>
						<td>
							<s:property value="#request.bookstate"/>
						</td>
					</tr>
		
	</table>	
	
				 <DIV align=left></DIV>
		     <P align=center>
		    <s:if test="#request.flag== null"> 
			<FONT size=2><INPUT type=submit value=借阅> 
				 </FONT>
				 </s:if>
				 </s:if>
		  </P>	
		  </form>
  
		<s:if test="#request.time!= null">
		   <table border="1px" align="center">
		   <tr>
						<td>
							书籍：
						</td>
						<td>
							
							<s:property value="#request.bookname"/>
						</td>
					</tr>
					
		   
		   
					<tr>
						<td>
							借阅日期
						</td>
						<td>
							
							<s:property value="#request.time.borrowdate"/>
						</td>
					</tr>
					
					
					<tr>
						<td>
							到期日期
						</td>
						<td>
						   
							<s:property value="#request.time.lastdate"/>
						</td>
					</tr>
					
		
	</table>	
	</s:if> 	  
		  
	<p><s:property value="#request.info"/></p>	  	
  </body>
</html>
