<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title></title>
<LINK href="images/style.css" rel=stylesheet>
<style type="text/css">
table{
background-color:  filter:alpha(opacity=50); opacity: 0.90;
}
</style>
</head>

<body background="images/back01.jpg">
	<table border="0" cellpadding="0" cellspacing="0"
		style="border-collapse: collapse" bordercolor="#111111" width="60%"
		id="AutoNumber1" bgcolor="#67A21B " align="center">
		<tr>
			<td width="100%" colspan="4" height="50"><tiles:insertAttribute
					name="operatorheader"></tiles:insertAttribute>
			</td>
		</tr>
			
		<tr>
		<td width="26%" valign="top" height="1000">
		<tiles:insertAttribute name="operatormenu"></tiles:insertAttribute>
		</td>
		<td width="100%" bgcolor= "#ffffff" valign="top"><tiles:insertAttribute
					name="content"></tiles:insertAttribute>
		</td>
		</tr>
	</table>
</body>
</html>