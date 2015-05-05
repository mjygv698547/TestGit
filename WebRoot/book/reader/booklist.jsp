<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>图书浏览</title>
<LINK href="images/style.css" rel=stylesheet>
</head>

<body>
<br>
<br>
	<form action="booklist" method="post">
		<DIV align=left style="width: 522; height: 84">
			<b> <font color="#ff9900" size="2">图书类别：</font> </b> <select size="1"
				name="b.booktypeid">
				<option value="-1">--请选择--</option>
				<s:iterator value="#session.booktypes" id="booktype">
					<option value='<s:property value="#booktype.booktypeid" />'
						<s:if test="#booktype.booktypeid==#request.booktypeid">selected="selected"</s:if>>
						<s:property value="#booktype.booktypename" />
					</option>
				</s:iterator>
			</select>
			
			
			&nbsp;&nbsp; <input type="submit" value="提交" name="B1">
		</DIV>
	</form>

	<table align="center" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="80%" id="AutoNumber1" bgcolor="#FFCC66">
	  <tr>
	    <td bgcolor="#FFFFFF" height="400" valign="top">
	<p align="right" style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
	第<s:property value="pages2" />页,共<s:property value="#session.totalpages2" />页 </p>
	<br><br>
	<table cellSpacing="0" borderColorDark="#ffffff" cellPadding="0" width="100%" borderColorLight="#cccccc" border="1">
	  <tr height="40">
	    <td align="center" width="120" style="font-size: 10pt">
	    <div align="center">
	      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
	      <font color="#cc6633">书名</font></div>
	    </td>
	    <td align="center" width="85" style="font-size: 10pt">
	    <div align="center">
	      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
	      <font color="#cc6633">作者</font></div>
	    </td>
	    <td align="center" width="100" style="font-size: 10pt">
	    <div align="center">
	      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
	      <font color="#cc6633">出版社</font></div>
	    </td>
	    <td align="center" width="100" style="font-size: 10pt">
	    <div align="center">
	      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
	      <font color="#cc6633">图书状态</font></div>
	    </td>
	  </tr>
	  <s:iterator value="#request.books" id="book">
	  <tr height="30">
	    <td align="center" width="300" style="font-size: 10pt">
	    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
	    <a href='showbookinfolink?b.bookid=<s:property value="#book.bookid"/>'><s:property value="#book.bookname" /></a></td>
	    <td align="center" width="85" style="font-size: 10pt">
	    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black"><s:property value="#book.bookauthor" /></td>
	    <td align="center" width="100" style="font-size: 10pt">
	    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black"><s:property value="#book.bookpublish" /></td>
		<td align="center" width="100" style="font-size: 10pt">
	    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black"><s:property value="#book.bookstate" /></td>	  
	  </tr>
	  
	  </s:iterator>
	  </table>
	  </td>
	  </tr>
	</table>
	<form name="sub" action="" method="post">
	  <p align="center" style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
	  <s:if test="pages2!=1">
	  <a href='booklist?pages2=<s:property value="pages2-1"/>&&b.booktypeid=<s:property value="#request.booktypeid" />'>&lt;&lt;上一页</a>&nbsp;
	  </s:if>
	  <s:else>
	  &lt;&lt;上一页</a>&nbsp;
	  </s:else>
	  <s:if test="pages2!=#session.totalpages2">
	  <a href='booklist?pages2=<s:property value="pages2+1"/>&&b.booktypeid=<s:property value="#request.booktypeid" />'>下一页&gt;&gt;</a>
	  
	  </s:if>
	  <s:else>
	   下一页&gt;&gt;
	  </s:else>
	  </p>
	 
	</form>
	<P align=left><FONT size=2>&nbsp;</FONT></P>
</body>

</html>