<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>�鿴����Ա</title>
<LINK href="images/style.css" rel=stylesheet>
</head>
<body>
	<br>
	<s:property value="#request.info" />
	<table align="center" border="0" cellpadding="0" cellspacing="0"
		style="border-collapse: collapse" bordercolor="#111111" width="80%"
		id="AutoNumber1" bgcolor="#FFCC66">

		<tr>
			<td bgcolor="#FFFFFF" height="400" valign="top">
				<p align="right"
					style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
					��
					<s:property value="pages" />
					ҳ,��
					<s:property value="#session.totalpages" />
					ҳ
				</p> <br> <br>
				<table cellSpacing="0" borderColorDark="#ffffff" cellPadding="0"
					width="100%" borderColorLight="#cccccc" border="1">
					<tr height="40">
						<td align="center" width="370" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">����</font>
							</div>
						</td>
						<td align="center" width="75" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">�Ա�</font>
							</div>
						</td>
						<td align="center" width="122" style="font-size: 10pt">
							<div align="center">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633">��ɫ</font>
							</div>
						</td>
						<td align="center" width="100" style="font-size: 10pt">
							<div align="center">
								<p 
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633" >�޸Ĳ���</font>
							</div>
						</td>
						<td align="center" width="100" style="font-size: 10pt">
							<div align="center">
								<p 
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<font color="#cc6633" >ɾ������</font>
							</div>
						</td>
					</tr>

					<s:iterator value="#request.operators" id="operator">
						<tr height="30">
							<td align="center" width="360" style="font-size: 10pt">
								<p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
										<s:property value="#operator.orealname" /> 
								
							</td>
							<td align="center" width="85" style="font-size: 10pt">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<s:property value="#operator.osex" />
							</td>
							<td align="center" width="122" style="font-size: 10pt">
								<p
									style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<s:property value="#operator.oisadmin" />
							</td>
							<td align="center" width="360" style="font-size: 10pt">
								<p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<a href='showoneoperator?o.operatorid=<s:property value="#operator.operatorid"/>'>
										�޸�
									</a>								
								</p>
							</td>
							<td align="center" width="360" style="font-size: 10pt">
								<p style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
									<a href='deleteoperator?o.operatorid=<s:property value="#operator.operatorid"/>'>
										ɾ��										
									</a>								
								</p>
							</td>
						</tr>
					</s:iterator>
				</table>
			</td>
		</tr>
	</table>
	<form name="sub" action="" method="post">
		<p align="center"
			style="font-size: 10pt; line-height: 140%; border-left-color: black; border-right-color: black; border-top-color: #3333ff; border-bottom-color: black">
			<s:if test="pages != 1">
				<a href='showoperators?pages=<s:property value="pages-1"/>'>&lt;&lt;��һҳ</a>&nbsp;
		  </s:if>
			<s:else>
		  &lt;&lt;��һҳ&nbsp;
		  </s:else>
			<s:if test="pages!=#session.totalpages">
				<a href='showoperators?pages=<s:property value="pages+1"/>'>��һҳ&gt;&gt;</a>
			</s:if>
			<s:else>
		   	��һҳ&gt;&gt;
		   </s:else>
		</p>
	</form>
	<P align=left>
		<FONT size=2>&nbsp;</FONT>
	</P>

</body>

</html>