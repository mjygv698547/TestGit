<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>公告显示页面</title>
<LINK href="images/style.css" rel=stylesheet>
<script type="text/javascript" src="js/test.js" ></script>
</head>

<body>
<form action="" method="post">
		
					<table align="center" border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="80%" id="AutoNumber1" bgcolor="#FFCC66">
					  <tr>
					    <td bgcolor="#FFFFFF" height="400" valign="top">
					<p align="right" style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					第<s:property value="pages"/>页,共<s:property value="#session.totalpages"/>页 </p>
					<br><br>
					<table cellSpacing="0" borderColorDark="#ffffff" cellPadding="0" width="100%" borderColorLight="#cccccc" border="1">
					  <tr height="40">
					    <td align="center" width="370" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633">公告主题</font></div>
					    </td>
					    
					    <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633">公告日期</font></div>
					    </td>
					    <td align="center" width="122" style="font-size: 10pt">
					    <div align="center">
					      <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					      <font color="#cc6633">公告人</font></div>
					    </td>
					  </tr>
					  <s:iterator value="#request.notices" id="notice">
					  <tr height="30">
					    <td align="center" width="360" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					    <a href='showone?n.noticeid=<s:property value="#notice.noticeid"/>'><s:property value="#notice.noticetitle"/> </a></td>
					    <td >
					     <a href='deletenotices?tnoticeid=<s:property value="#notice.noticeid"/>'  onclick="checkDel('此公告删除?')">删除</a> 
					     <a href='editnoticelink?n.noticeid=<s:property value="#notice.noticeid"/>'>更新</a> 
					    </td>
					    <td align="center" width="85" style="font-size: 10pt">
					    <p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">&nbsp;&nbsp;&nbsp;<s:property value="#notice.noticeperson"/></td>
					   
					  </tr>
					  </s:iterator>
					  </table>
					  </td>
					  </tr>
					</table>
					<form name="sub" action="" method="post">
					  <p align="center" style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					  <s:if test="pages != 1">
					  <a href='showwnotices?pages=<s:property value="pages-1"/>'>&lt;&lt;上一页</a>
					 </s:if>
					 <s:else>
					 	&lt;&lt;上一页</a>&nbsp;
					 </s:else>
					 <s:if test="pages != #session.totalpages">
					   <a href='showwnotices?pages=<s:property value="pages+1"/>'>下一页&gt;&gt;</a>
					 </s:if>
					 <s:else>
					 	下一页&gt;&gt;</a>&nbsp;
					 </s:else>
					  </p>
					</form>
					<P align=left><FONT size=2>&nbsp;</FONT></P>
</form>			
</body>

</html>
