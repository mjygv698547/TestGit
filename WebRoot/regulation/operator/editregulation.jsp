<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>修改规则</title>
		<LINK href="images/style.css" rel=stylesheet>
		<script type="text/javascript" src="js/test.js" ></script>
	</head>
	<body>
		<br><br>
		<div align="center">修改规则</div>
		<form method="POST" action="editregulation">
			<div align="center">
			<table>
			<tr height="40">
					<td><font color="#FF9900">&nbsp;</font></td>
					<td><s:property value="#request.success"/> </td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>规则名称:</b></font></td>
					<td><input type="text" name="r.regulationname" id="regulationname" size="60" value='<s:property value="#request.Regulations.regulationname"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>可借阅天数:</b></font></td>
					<td><input type="text" name="r.restborrowday" id="restborrowday" size="20" value='<s:property value="#request.Regulations.restborrowday"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>续借天数:</b></font></td>
					<td><input type="text" name="r.reborrowday" id="reborrowday" size="20" value='<s:property value="#request.Regulations.reborrowday"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>最大续借次数:</b></font></td>
					<td><input type="text" name="r.maxreborrowtime" id="maxreborrowtime"  size="20" value='<s:property value="#request.Regulations.maxreborrowtime"/>'></td>
				</tr>
				<tr height="40">
					<td><font color="#FF9900"><b>预约保留天数:</b></font></td>
					<td><input type="text" name="r.orderrestday" id="orderrestday"  size="20" value='<s:property value="#request.Regulations.orderrestday"/>'></td>
				</tr>	
				<input type="hidden" name="r.regulationid" size="60" value='<s:property value="#request.Regulations.regulationid"/>'>		
				<tr height="40">
					<td></td>
					<td align="center"><input type="submit" value="提交" name="B1" onclick="return checkRegulation()">&nbsp;<input type="reset" value="重置" name="B1"></td>
				</tr>
			</table>
			</div>
		</form>	
	</body>
</html>