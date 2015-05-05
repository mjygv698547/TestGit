<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		

		<title>My JSP 'bookInfo.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
	<link rel="stylesheet" type="text/css" href="CSS/link.css">
	</head>

	<body>
		<div>
			<div id="left">
			
			</div>
			<div id="right">
				<table border="1px" align="center" width="80%" >
					<tr>
						<td>
							公告标题
						</td>
						<td>
							<s:property value="#request.notices.noticetitle"/>
						</td>
					</tr>
					<tr>
						<td>
							公告内容
						</td>
						<td>
							<s:property value="#request.notices.noticecontent"/>
						</td>
					</tr>
					
					<tr>
						<td>
							公告日期
						</td>
						<td>
							<s:property value="#request.notices.noticedate"/>
						</td>
					</tr>
					
					<tr>
						<td>
							公告人
						</td>
						<td>
							<s:property value="#request.notices.noticeperson"/>
						</td>
					</tr>
					
					<tr>
						<td>
							最后修改日期
						</td>
						<td>
							<s:property value="#request.notices.lastmodifytime"/>
						</td>
					</tr>
					
				</table>
			</div>
		</div>
	</body>
</html>