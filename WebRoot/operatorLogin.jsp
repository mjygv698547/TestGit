<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<TITLE>企业内部管理系统登录</TITLE>
<META http-equiv=Content-Type content="text/html; charset=GB18030">
<LINK href="images/style.css" rel=stylesheet>
<script type="text/javascript" src="js/operator.js"></script>
<script type="text/javascript"  src="js/jquery-1.3.2.js"></script>

</HEAD>
<BODY  topMargin=2 background=img/back.jpg>
	<br />
	<br />
	<br />
	<br />
	<br />
	<P align=center></P>
	<P align=center>
		<b><FONT size=5 color="#096699">图书后台管理系统</FONT>
		</b>
	</P>
	<div align="center">
		<TABLE cellSpacing=0 cellPadding=0 width=688
			 border=0>
			<TBODY>
				<TR>
					<TD background="" colSpan=3 height=29></TD>
				</TR>
				<TR>
					<TD width=132>
						<DIV align=center></DIV></TD>
					<TD vAlign=top>
						<FORM name=login action="login" method=post>
							<TABLE height=196 cellSpacing=0 cellPadding=0 width=401 border=0>
								<TBODY>
								
								<TR>
										<TD width=97 height=30 align="right">&nbsp;</TD>
										<TD width=146 height=30>&nbsp;<s:property value="#request.error"/></TD>
                                        <TD width=150 height=36>&nbsp;</TD>
									</TR>
								
									<TR>
										<TD width=97 height=30 align="right"><B>用户名:</B></TD>
										<TD width=146 height=30>
											<DIV align=left>
												<INPUT class=smallInput name="o.ousername" id="ousername" size="20"  value='<s:property value="o.ousername"/>'>
											</DIV>
										</TD>
										 <TD width=150 height=36><s:property value="#request.ousername"/> </TD>
                                        <TD width=150 height=36>&nbsp;</TD>
									</TR>
									<TR>
										<TD width=97 height=30 align="right"><B>密&nbsp;&nbsp;码:</B></TD>
										<TD width=146 height=30>
											<DIV align=left>
												<INPUT class=smallInput type=password name="o.ouserpwd"  id="ouserpwd" size="20">
											</DIV>
										</TD>
                                        <TD width=150 height=36><s:property value="#request.ouserpwd"/> </TD>
									</TR>
									<TR>
										<TD align=center width=245 colSpan=2 height=36>
										<INPUT type=submit value="确定"  onclick="return checkLogin()"> <INPUT type=reset value="取消">
										</TD>
										<TD width=150 height=36>&nbsp;</TD>
									</TR>
									<TR>
										<TD vAlign=bottom width=245 colSpan=2 height=1></TD>
										
									</TR>
									<TR>
										<TD vAlign=bottom width=245 colSpan=2 height=32>&nbsp;</TD>
									</TR>
									<TR>
										<TD vAlign=bottom width=146 height=1>
											<P align=right>&nbsp;</P></TD>
										<TD vAlign=bottom width=97 height=1><B>&nbsp;</B></TD>
									</TR>
									<TR>
										<TD vAlign=bottom width=245 colSpan=2 height=30>
											<P align=center></P></TD>
									</TR>
									<TR>
										<TD vAlign=bottom width=245 colSpan=2 height=36></TD>
									</TR>
								</TBODY>
							</TABLE>
						</FORM></TD>
					<TD width=155></TD>
				</TR>
				<TR>
					
				</TR>
			</TBODY>
		</TABLE>
	</div>
</BODY>
</HTML>