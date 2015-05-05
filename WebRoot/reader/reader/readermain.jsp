<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
<style>
#mybackground img{filter:alpha(opacity=80); opacity: 0.70;border-color: red;}
</style>

  </head>
  
  <body >
    <div class="mybackground" >
    
    <IMG  src="images/myback.jpg" >
    <td><s:property value="#request.info"/></td>
    
    </div>
     
  </body>
</html>
