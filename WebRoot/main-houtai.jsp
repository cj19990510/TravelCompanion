<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理页面</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>

</head>
<body>
		<div class="d1" style="width:180px;height:700px;position: fixed;float:left;background-color: rosybrown; ">
		<img src="images/logo.png" style="left:12px;top:10px;" />
		<h1 style="text-align: center; color:midnightblue;font-family:STXingkai;top:50px;position: absolute;">后台管理</h1>
		
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
		
	<div id="d1" style="width:1100px;height:600px;background-color: white;float:right ">
	<a >  
	<span  style="left:210px;top:20px;position: fixed; font-size:30px; color:burlywood">
	        <script type="text/javascript">
            var date = new Date();
            document.write(date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
           </script></span>
	<span style="right:30px;top:20px;position: fixed; font-size:30px;">${adminid}号管理员</span>
	</a>	
	<div class="d3" style="background:#f5f5fa;width:1150px;height:400px; left:190px;top:80px;position: absolute;">
		<h1 style="font-size:60px;font-family:STXingkai;top:30px;left:50px;position: absolute;color: skyblue;">欢迎登录伴旅后台管理页面</h1>
	</div>
		
	</div>
</body>
<script src="js/core/jquery.3.2.1.min.js">	</script>
<script src="js/bootstrap.js">	</script>
</html>