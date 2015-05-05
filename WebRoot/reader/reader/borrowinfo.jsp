<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'borrowinfo.jsp' starting page</title>
    
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
    <table cellSpacing="0" borderColorDark="#ffffff" cellPadding="0" width="100%" borderColorLight="#cccccc" border="1" align="center">
					  <tr height="40">
					   <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633" face="Algerian">书名</font></div>
					    </td>
					     <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633" face="Algerian">借书日期</font></div>
					   
					    <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633" face="Algerian">到期时间</font></div>
					    </td>
					     <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633" face="Algerian">归还时间</font></div>
					    </td>
					     <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633" face="Algerian">可续借次数</font></div>
					    </td>
					    
					  </tr>
					 
					  <s:iterator value="#request.Borrowinfo1" id="borrowinfo">
					  <tr height="30">
					   
					     <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					   <s:property value="#borrowinfo.books.bookname"/></td>
					     <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					   <s:property value="#borrowinfo.borrowdate"/></td>
					    <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					    <s:property value="#borrowinfo.lastdate"/></td>
					    <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					    <s:property value="#borrowinfo.returndate"/></td>
					    <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					    <s:property value="#borrowinfo.reborrowtime"/></td>
					  </tr>
					  </s:iterator>
					
					  </table>
	<FORM name="repassword" action="repassword" method=post>
	&nbsp;&nbsp;&nbsp;&nbsp;
		 原密码 <INPUT class=smallInput name="r.readerpwd" size="20"> 
		 新密码 <INPUT class=smallInput name="r.newpassword" size="20"> 
		 <input type="hidden" name="r.readerid" value='<s:property value="#request.rreaderid"/>'>
			&nbsp;&nbsp;&nbsp;<INPUT type=submit value="确定" > <INPUT type=reset value="取消">
	</FORM>
	<p><s:property value="#request.info"/></p>
</body>
</html>
