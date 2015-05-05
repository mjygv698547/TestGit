<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<link rel="stylesheet" type="text/css" href="style.css">
<STYLE TYPE="text/CSS">
#menu{
width:100%;
height:41px;
margin:55px 0 0 26px;

float:right;
}
#menu ul{
display:block;
list-style:none;
padding:9px 0 0 10px;
margin:0px;
}
#menu ul li{
display:inline;
padding:0px;
margin:0px;
height:50px;
}
#menu ul li a{
height:50px;
display:block;
padding:0px 10px 0 10px;
margin:0 4px 0 4px;
_margin:0 2px 0 2px;
float:left;
text-decoration:none;
text-align:right;
color:#fff;
font-size:25px;
line-height:30px;
}
#menu ul li.selected a{
height:27px;
display:block;
padding:0px 10px 0 10px;
margin:0 5px 0 5px;
float:left;
text-decoration:none;
text-align:right;
color:#fff;
font-size:25px;
line-height:30px;
background-color: gray;
}
#menu ul li a:hover{

background-color: red;
}
</STYLE>
	

  </head>
  

    <body >
     <div class="header">
       		<div class="logo"><a href="index.htm"></a></div>            
        <div id="menu">
            <ul style:"display:inline">                                                                       
            <li><a href="returnmain">首页</a></li>
             <li><a href="booklistlink">图书浏览</a></li>
             <li><a href="querybookbynameisbnpublishauthorlink">图书查询</a></li>
             
          
             <li><a href="shownotices">公告浏览</a></li>
            <li><a href='okLogggin?rreaderid=<s:property value="#session.reader.readerid"/>'>个人中心</a></li>
            <li><a href="reborrowbook">图书续借</a></li>
             <li><a href="readerexit">注销</a></li>
         
             
             <li><a href="tologinpage">登陆</a></li>
           
            
            </ul>
        </div>                        
       </div> 
       <div id="serachDiv">
       	</div> 		
    
       <!--end of leftTop content-->
      </body> 

</html>
