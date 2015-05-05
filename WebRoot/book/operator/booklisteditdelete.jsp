<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>查看图书</title>
<LINK href="images/style.css" rel=stylesheet>
</head>
<body>
	<br>
	<s:property value="#request.info" />
	<table align="center" border="0" cellpadding="0" cellspacing="0"
		style="border-collapse: collapse" bordercolor="#111111" width="80%"
		id="AutoNumber1" bgcolor="#FFCC66">

		<tr>
			<td bgcolor="#FFFFFF" height="400" valign="top">
				<p align="right"
					style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					第
					<s:property value="pages" />
					页,共
					<s:property value="#session.totalpages" />
					页
				</p> <br> <br>
				<table cellSpacing="0" borderColorDark="#ffffff" cellPadding="0"
					width="100%" borderColorLight="#cccccc" border="1">
					<tr height="40">
						<td align="center" width="370" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">书名</font>
							</div>
						</td>
						<td align="center" width="75" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">作者</font>
							</div>
						</td>
						<td align="center" width="122" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">ISBN</font>
							</div>
						</td>
						<td align="center" width="122" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">出版社</font>
							</div>
						</td>
						<td align="center" width="122" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">图书状态</font>
							</div>
						</td>
						<td align="center" width="122" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">图书类别</font>
							</div>
						</td>
						<td align="center" width="100" style="font-size: 10pt">
							<div align="center">
								<p 
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633" >修改操作</font>
							</div>
						</td>
						<td align="center" width="100" style="font-size: 10pt">
							<div align="center">
								<p 
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633" >删除操作</font>
							</div>
						</td>
					</tr>

					<s:iterator value="#request.books" id="book">
						<tr height="30">
							<td align="center" width="360" style="font-size: 10pt">
								<p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
										<s:property value="#book.bookname" /> 
								
							</td>
							<td align="center" width="85" style="font-size: 10pt">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<s:property value="#book.bookauthor" />
							</td>
							<td align="center" width="122" style="font-size: 10pt">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<s:property value="#book.bookisbn" />
							</td>
							<td align="center" width="122" style="font-size: 10pt">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<s:property value="#book.bookpublish" />
							</td>
							<td align="center" width="122" style="font-size: 10pt">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<s:property value="#book.bookstate" />
							</td>
							<td align="center" width="122" style="font-size: 10pt">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<s:property value="#book.booktypeid" />
							</td>
							
							<td align="center" width="360" style="font-size: 10pt">
								<p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<a href='showonebook?b.bookid=<s:property value="#book.bookid"/>'>
										修改
									</a>								
								</p>
							</td>
							<td align="center" width="360" style="font-size: 10pt">
								<p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<a href='deletebook?b.bookid=<s:property value="#book.bookid"/>'>
										删除										
									</a>								
								</p>
							</td>
						</tr>
						<tr>
						<td><td><input type="hidden" name="b.bookstate" value='<s:property value="#request.books.bookstate" />'></td></td>
						</tr>
					</s:iterator>
					
				</table>
			</td>
		</tr>
	</table>
	<form name="sub" action="" method="post">
		<p align="center"
			style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
			<s:if test="pages != 1">
				<a href='showbooks?pages=<s:property value="pages-1"/>'>&lt;&lt;上一页</a>&nbsp;
		  </s:if>
			<s:else>
		  &lt;&lt;上一页&nbsp;
		  </s:else>
			<s:if test="pages!=#session.totalpages">
				<a href='showbooks?pages=<s:property value="pages+1"/>'>下一页&gt;&gt;</a>
			</s:if>
			<s:else>
		   	下一页&gt;&gt;
		   </s:else>
		</p>
	</form>
	<P align=left>
		<FONT size=2>&nbsp;</FONT>
	</P>

</body>

</html>