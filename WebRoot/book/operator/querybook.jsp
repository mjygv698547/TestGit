<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>图书浏览</title>
<LINK href="images/style.css" rel=stylesheet>
</head>

<body>
	<form action="querybookbynamecodeisbn" method="post">
		<DIV align=left style="width: 522; height: 30">
			<b> <font color="#ff9900" size="2">书名：</font> </b>
			<b><input name="b.bookname" /></b>
			<br>
		</DIV>
		<DIV align=left style="width: 522; height:30">
			<b> <font color="#ff9900" size="2">条码号：</font> </b>
			<b><input name="b.bookcode" /></b>
			<br>
		</DIV>
		<DIV align=left style="width: 522; height: 30">
			<b> <font color="#ff9900" size="2">ISBN：</font> </b>
			<b><input name="b.bookisbn"/></b>			
			<br>
		</DIV>
		<b><input type="hidden" name="b.bookid" value='<s:property value="#request.books.bookid" />'></b>
		<input type="submit" value="提交" name="B1">
	</form>

	<table align="center" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="80%" id="AutoNumber1" bgcolor="#FFCC66">
	  <tr>
	    <td bgcolor="#FFFFFF" height="0" valign="top">
	
	<br><br>
<table border="0" cellpadding="0" cellspacing="0"
		style="border-collapse: collapse" bordercolor="#111111"
		width="100%" id="AutoNumber1" bgcolor="#FFCC66">
		<tr>
			<td width="84%" bgcolor="#FFFFFF">
				<DIV align=left>
					<font color="#FF9900"><b>&nbsp; </b>
					</font>
				</DIV>
				<DIV align=left style="width: 563; height: 81">
					<font color="#FF9900"><b>&nbsp;&nbsp;&nbsp;&nbsp; </b>
					</font>
					<s:if test="#request.books!=null">
					<table class="txt" cellSpacing="1" cellPadding="1" width="90%"
						align="center" bgColor="#005b4b" border="0">
						<tr bgColor="#bad4a5">
							<td vAlign="top" width="10%" bgColor="#92C9CE" align="center">
								<b>书名</b>
							</td>
							<td vAlign="top" width="40%" bgcolor="#92C9CE" align="center">
								<b>条码号</b>
							</td>
							<td vAlign="top" width="8%" bgcolor="#92C9CE" align="center">
								<b>ISBN</b>
							</td>
							<td vAlign="top" width="8%" bgcolor="#92C9CE" align="center">
								<b>图书状态</b>
							</td>
							
						</tr>
						<s:iterator value="#request.books" id="book">
						<tr bgColor="#ffffff">
							<td width="10%" bgColor="#ffffff">
							<a href='showbookinfolink1?b.bookid=<s:property value="#book.bookid"/>'><s:property value="#book.bookname" /></a></td>
							<td width="30%" bgColor="#ffffff">
								<s:property value="#book.bookcode" />
							</td>
							<td width="8%" bgColor="#ffffff">
								<s:property value="#book.bookisbn" />
							</td>
							<td width="18%" bgColor="#ffffff">
								<s:property value="#book.bookstate" />
							</td>
							
						</tr>
						</s:iterator>
					</table>
					</s:if>
					<s:else><s:property value="#request.info" /></s:else>
				</DIV>
				<DIV align=left>
				</DIV>
				<P align=center>
					<FONT size=2>&nbsp; </FONT>
				</P>
				<p>
			</td>
		</tr>
	</table>
</body>

</html>