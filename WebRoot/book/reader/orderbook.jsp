<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'orderbook.jsp' starting page</title>
    
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
					      <font color="#cc6633">预约书名</font></div>
					    </td>
					     <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633">剩下的预约保留天数</font></div>
					    </td>
					    
					  </tr>
					  <s:iterator value="#request.notices" id="notices">
					  <tr height="30">
					    <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					    <s:property value="#notices.noticedate"/></td>
					    <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					    <s:property value="#notices.noticedate"/></td>
					  </tr>
					  </s:iterator>
					 
					  </table>  	 
  </body>
</html>
