<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<STYLE TYPE="text/CSS">
body{
background-image: "images/myback.jpg";

}
table{
background-image: "images/myback.jpg";

}
#myback{
background-color: filter:alpha(opacity=50); opacity: 0.50;
}
</STYLE>
</head>

<body background="images/01.jpg">
	<div id="myback">
	<table border="0" cellpadding="0" cellspacing="0" 
		style="border-collapse: collapse"  width="80%"
		id="AutoNumber1"  align="center">
		<tr>
			<td width="100%" colspan="2"><tiles:insertAttribute
					name="readerheader"></tiles:insertAttribute>
			</td>
		</tr>
		
	   <tr>
			<td width="100%" ><tiles:insertAttribute
					name="content"></tiles:insertAttribute>
			</td>
	</tr>
	</table>
	</div>
</body>
</html>