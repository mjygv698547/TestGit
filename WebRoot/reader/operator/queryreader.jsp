<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>Υ�������ѯ</title>
		<LINK href="images/style.css" rel=stylesheet>
	</head>

	<body>	
		
		
<table border="0" cellpadding="0" cellspacing="0"
	style="border-collapse: collapse" bordercolor="#111111"
	width="100%" id="AutoNumber1" bgcolor="#FFCC66">
	<tr>
		<td width="84%" bgcolor="#FFFFFF">
			<DIV align=left>
				<font color="#FF9900"><b>&nbsp; </b>
				</font>
			</DIV>
			<DIV align="center" width="60%" height="81">
				<font color="#FF9900"><b>&nbsp;&nbsp;&nbsp;&nbsp; </b>
				</font>
				
				<table class="txt" cellSpacing="1" cellPadding="1" width="90%"
					align="center" bgColor="#005b4b" border="0">
					<tr bgColor="#bad4a5">
						
						<td vAlign="top" width="40%" bgcolor="#92C9CE" align="center">
							<b>��������</b>
						</td>						
						<td vAlign="top" width="28%" bgcolor="#92C9CE" align="center">
							<b>��Ч��</b>
						</td>	
						<td vAlign="top" width="28%" bgcolor="#92C9CE" align="center">
							<b>����</b>
						</td>	
											
					</tr>
					<s:iterator value="#request.readerlist" id="reader">
					<tr bgColor="#ffffff">
						<td width="15%" bgColor="#ffffff">
					 <s:property value="#reader.readername"/>
						</td>
						<td width="20%" bgColor="#ffffff">
							<s:property value="#reader.deaddate"/>
						</td width="20%" bgColor="#ffffff">
						<td>
						<a href='toupdateeffectivedate?r.readerid=<s:property value="#reader.readerid"/>'>�޸� &nbsp; &nbsp; &nbsp;</a><a href='deletereaderbureaderid?r.readerid=<s:property value="#reader.readerid"/>'>ɾ��</a>
						</td>
						
						
					</tr></s:iterator>
					
				</table>
				<s:property value="#request.info"/>
				
			</DIV>
			<DIV align=left>
			</DIV>
			<P align=center>
				<FONT size=2>&nbsp; </FONT>
			</P>
			<p>
		</td>
	</tr>
</table>


	</body>

</html>