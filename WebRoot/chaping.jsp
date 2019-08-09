<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查看差评</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>

  </head>
  
  <body>
  <div class="d1" style="width:180px;height:700px;position: fixed;float:left;background-color: midnightblue; ">
		<img src="images/logo.png" style="left:12px;top:10px;" />
		<h1 style="text-align: center; color:rosybrown;font-family:STXingkai;top:50px;position: absolute;">后台管理</h1>
		
		<div class="d2" style="top:130px;position: absolute;">
		
		<button type="button" class="btn btn-default btn-lg ">
		<span class="glyphicon glyphicon-star" aria-hidden="true"></span> <a href="shouyi.jsp">查看收益</a>
		</button></br></br>
		
		<button type="button" class="btn btn-default btn-lg ">
		<span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> <a href="dingdan.jsp">查看订单</a>
		</button></br></br>
		
		<button type="button" class="btn btn-default btn-lg ">
		<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> <a href="chaping.jsp">查看差评</a>
		</button></br></br>
		
		<button type="button" class="btn btn-default btn-lg ">
		<span class="glyphicon glyphicon-user" aria-hidden="true"></span><a href="yonghu.jsp">用户管理</a>
		</button></br></br>
		
		<button type="button" class="btn btn-default btn-lg ">
		<span class="glyphicon glyphicon-glass" aria-hidden="true"></span><a href="jiudian.jsp"> 酒店管理</a>
		</button></br></br>
		
		</div>	
		</div>
		
	<div id="d1" style="width:1100px;height:900px;background-color: white;float:right ">
	<a >  
	<span  style="left:210px;top:20px;position: fixed; font-size:30px; color:burlywood">
	        <script type="text/javascript">
            var date = new Date();
            document.write(date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
           </script></span>
	<span style="right:30px;top:20px;position: fixed; font-size:30px;">${adminid}号管理员</span>
	</a>
	
	<div class="d3" style="background:#f5f5fa;width:1150px;height:700px; left:190px;top:80px;position: fixed;">
    <span class="menu">
	 <a href="houtai?method=chaxun" style="color:brown;font-size:25px;position: absolute;left:30px;top:20px;font-family:FZShuTi;">查询:</a></span>
	 <input TYPE="text" NAME="jiudianid" style="position: absolute;left:90px;top:26px">
     <span>${msg2}</span>

     <div align="center" >
         <table class="divTab" width="100%" align="center" style="position: absolute;top:100px;">
            <tr>
                <td><b>评论id</b></td>
                <td><b>评论用户</b></td>
				<td><b>评论时间</b></td>
                <td><b>评论商家</b></td>
                <td><b>评论</b></td>
            </tr>
            
            
        </table>
    </div>
     </div>	
	</div>
  </body>
  <script src="js/core/jquery.3.2.1.min.js">	</script>
<script src="js/bootstrap.js">	</script>
</html>
