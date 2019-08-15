<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理页面</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css" rel="stylesheet">
  <script type="text/javascript" src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>
</head>

<body>
		<div style="display: flex;">
			<div style="width:13%;background-color:#265A88;height:1000px;text-align: center;position:fixed;">
				<div class="jumbotron" style="background-color:#265A88;">
					<h2 style="font-family:STXingkai;font-size:30px;left:25px;top:20px;position: absolute; color:rosybrown;">
					伴旅后台</br>管理系统</h2>
				</div>
				<ul class="nav nav-pills nav-stacked" >
					
					<li role="presentation">
						<a href="dingdan.jsp">
							<h4>订单管理</h4></a>
					</li>
					<li role="presentation">
						<a href="yonghu.jsp">
							<h4>用户管理</h4></a>
					</li>
					<li role="presentation">
						<a href="hotel">
							<h4>酒店管理</h4></a>
					</li>
					<li role="presentation">
						<a href="chaping.jsp">
							<h4>差评管理</h4></a>
					</li>
					<li role="presentation">
						<a href="#">
							<h4>关于我们</h4></a>
					</li>
				</ul>
			</div>
		
	<div id="d1" style="width:1100px;height:600px;background-color: white;float:right ">
	<a >  
	<span  style="left:260px;top:20px;position: fixed; font-size:30px; color:burlywood">
	        <script type="text/javascript">
            var date = new Date();
            document.write(date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
           </script></span>
	<span style="right:30px;top:20px;position: fixed; font-size:30px;">${adminid}号管理员</span>
	</a>
	<div class="d3" style="background:#f5f5fa;width:2000px;height:800px; left:250px;top:80px;position: absolute;">
		<h1 style="font-size:60px;font-family:STXingkai;top:30px;left:50px;position: absolute;color: skyblue;">欢迎登录伴旅后台管理页面</h1>
	</div>
		
	</div>
</div>
</body>
  <script src="js/jquery-1.12.3.min.js">	</script>
<script src="js/bootstrap.js">	</script>
</html>