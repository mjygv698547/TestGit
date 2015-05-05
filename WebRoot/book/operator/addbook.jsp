<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>添加图书</title>
		<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
		<LINK href="images/style.css" rel=stylesheet>
	</head>
	<body>
	

		<br><br>
		<div align="center">添加图书</div>
		<br>
		<s:property value="#request.info" />
		<form method="POST" action="addbook">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>书名:</b></font></td>
					<td><input type="text" name="b.bookname" size="40"></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>作者:</b></font></td>
					<td><input type="text" name="b.bookauthor" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>ISBN:</b></font></td>
					<td><input type="text" name="b.bookisbn" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>出版社:</b></font></td>
					<td><input type="text" name="b.bookpublish" size="40" ></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>出版日期:</b></font></td>
					<TD style="text-align: left"><FONT size=2><INPUT type="text"
							name="b.bookpublishdate" size="20" onclick="WdatePicker()" readonly="readonly"> </FONT>
					</TD>					
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>单价:</b></font></td>
					<td><input type="text" name="b.bookprice" size="40" ></td>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>入库日期:</b></font></td>
					<TD style="text-align: left"><FONT size=2><INPUT type="text"
							name="b.bookindate" size="20" onclick="WdatePicker()" readonly="readonly"> </FONT>
					</TD>
				</tr>	
				<tr height="40">
					<td><font color="#FF9900"><b>条码号:</b></font></td>
					<td><input type="text" name="b.bookcode" size="40" ></td>
				</tr>	
					
				
				<tr height="40" >
				<td><font color="#FF9900"><b>图书类别:</b></font></td>
				<td>
				<select size="1" name="b.booktypeid">
				<option value="-1">--请选择--</option>
				<s:iterator value="#session.booktypes" id="booktype">
				<option value='<s:property value="#booktype.booktypeid" />'<s:if test="#booktype.booktypeid==#request.booktypeid"> selected="selected"</s:if>><s:property value="#booktype.booktypename" /></option>
				</s:iterator>
			</select>
				<td>
				</tr>
				<tr height="40">
				<td></td>
					<td align="center"><input type="submit" value="提交" name="B1">&nbsp;<input type="reset" value="重置" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>