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
    
    <title>My JSP 'menu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<STYLE TYPE="text/CSS">
	#menu{
	height: 1000px;
	
	}
	
	</STYLE>
     <script type="text/javascript" src="js/admin.js"></script>
  </head>
  
  <body>
    	<div class="mymenu">
    	
			<div class="left-column-box" >
				<ul>
				<s:if test="#session.isadmin!= null">
				<li>操作员管理</li>
				
					<ul>
					
						<li><a href="addoperatorlink" style="text-decoration:none; ">添加操作员</a></li>
						<li><a href="showoperators" style="text-decoration:none; ">查看操作员</a></li>
					
					</ul>
					</s:if>
					</ul>
				</div>
				
			</div>
	
			
			<div class="left-column-box">
				<ul>
				<s:if test="#session.isadmin!= null">
				<li>公告管理</li>
				
					<ul>
					
						<li><a href="showwnotices" style="text-decoration:none; ">显示公告</a></li>
						<li><a href="addnoticelink" style="text-decoration:none; ">增加公告</a></li>
					
					</ul>
					</s:if>
					</ul>
				</div>
			</div>
			
			
			<div class="left-column-box">
				<ul>
				<s:if test="#session.isadmin!= null">
				<li>规则管理</li>
				
					<ul>
					
						<li><a href="showregulations" style="text-decoration:none; ">显示规则</a></li>
						<li><a href="addregulationlink"  style="text-decoration:none; ">添加规则</a></li>
					
					</ul>
					</s:if>
					</ul>
				</div>
			</div>
			
			<div class="left-column-box">
				<ul>
				<s:if test="#session.isadmin== null">
				<li>图书管理</li>
				
					<ul>
					
						<li><a href="addbooktypelink" style="text-decoration:none; ">添加图书类别</a></li>
						<li><a href="showbooktypes" style="text-decoration:none; ">查看图书类别</a></li>
						<li><a href="addbooklink" style="text-decoration:none; ">添加图书</a></li>
						<li><a href="showbooks" style="text-decoration:none; ">修改/删除图书</a></li>
						<li><a href="querybookbynamecodeisbnlink" style="text-decoration:none; ">查看图书借阅情况</a></li>
					
					</ul>
					</s:if>
					</ul>
				</div>
			</div>
			<div class="left-column-box">
				<ul>
					<s:if test="#session.isadmin== null">
				<li> 读者管理</li>
			
					<ul>
					
						<li><a href="toaddreader" style="text-decoration:none; ">添加读者</a></li>
						<li><a href="showreaderlist" style="text-decoration:none; ">查看读者</a></li>
						
					
					</ul>
					</s:if>
				</ul>
				</ul>
			</div>
			
			
			<div class="left-column-box">
				<ul>
				<s:if test="#session.isadmin== null">
				<li> 图书管理</li>
				
					<ul>
					
						<li><a href="borrowbookline"  style="text-decoration:none;">借书</a></li>
						<li><a href="returnbookline"  style="text-decoration:none;">还书</a></li>
						<li><a href="oderbookline"  style="text-decoration:none;">预约</a></li>
				
					</ul>
						</s:if>
				</ul>	
				</div>
			</div>
			
		</div>
  </body>
</html>
