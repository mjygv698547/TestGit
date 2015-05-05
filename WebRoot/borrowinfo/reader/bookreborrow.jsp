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
					      <font color="#cc6633">书名</font></div>
					    </td>
					     <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633">到期日期</font></div>
					    </td>
					    <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633">是否续借</font></div>
					    </td>
					     <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633">已经预约次数/最大预约次数</font></div>
					    </td>
					  
					    
					  </tr>
					  <s:iterator value="#request.borrowinfos" id="borrowinfos">
					  <tr height="30">
					    <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					   <s:property value="#borrowinfos.books.bookname"/></td>
					     <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					   <s:property value="#borrowinfos.lastdate"/></td>
					     <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					   <s:if test="#borrowinfos.reborrowtime<#request.maxreborrow"> <a href='updatereborrowtimesandlastdate?bf.bookid=<s:property value="#borrowinfos.bookid"/>'  >续借</a></s:if> <s:else>已经到达最大预约次数</s:else></td>
					   
					   
					     <td align="center" width="120" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					    <s:property value="#borrowinfos.reborrowtime"/> /<s:property value="#request.maxreborrow"/></td>
					   
					   
					  </tr>
					  </s:iterator>
					 
					  </table>  	
					  <s:if test="#request.info!=null">
					  <table>
					  <s:property value="#request.info"/>
					  </table>
					   </s:if>
  </body>
</html>

