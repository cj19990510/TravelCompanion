<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>用户管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<script src="js/jquery-1.12.3.min.js"></script>
<script src="js/bootstrap.js"></script>
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

	<div id="d1"
		style="width:1100px;height:900px;background-color: white;float:right ">
		<a> <span
			style="left:260px;top:20px;position: fixed; font-size:30px; color:burlywood">
				<script type="text/javascript">
					var date = new Date();
					console.log("123");
					document.write(date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
				</script>
		</span> <span style="right:30px;top:20px;position: fixed; font-size:30px;">${adminid}号管理员</span>
		</a>

		<div class="d3"
			style="background:#f5f5fa;width:2000px;height:700px; left:250px;top:80px;position:absolute;">

          <form action="houtai" method="post" >
          
				<div style="border-top: 1px solid  black;">
					<div style="text-align: center;background-color: white;width: 100%;" >
						<div class="input-group input-group-sm" style="width:250px; margin-left:35%;margin-top:30px;">
							<input type="text" class="form-control" aria-describedby="sizing-addon1" name="userid">
							<button class="input-group-addon" TYPE="submit" id="btn" 
							style="top:0;left:250px;position:absolute;width:40px;" >查询</button>
				
				<span style="color: red;">${msg}</span>
				</div>

			<div align="center">
				<div style="position:absolute;top:80px;left:30px;">
				<c:set var="item" value="${list}"/>
						<h2>用户名称:&emsp;&emsp;&emsp;&emsp;</h2>
						<h2>用户手机号:&emsp;&emsp;&emsp;</h2>
						<h2>用户订单数量:&emsp;&emsp;</h2>
						<h2>用户订单成功数量:</h2>
					</div>
					<div style="position:absolute;top:80px;left:200px;">
						<c:forEach var="item" items="${list}">
						<h2>${item.userName}</h2>
						<h2 style="margin-left:130px;">${item.userPhone}</h2>
						<h2>${item.count}</h2>
						<h2>${item.countSuccess}</h2>
						</c:forEach>
				   </div>	
						
                   <table class="sui-table table-primary" style="margin-top: 200px;">
                   <thead>
                   
					<tr>
						<th><b>订单号</b></th>
						<th><b>商家名</b></th>
						<th><b>房间号</b></th>
						<th><b>预定天数</b></th>
						<th><b>订单金额</b></th>
						<th><b>订单时间</b></th>
						<th><b>订单状态</b></th>
						<th><b>入住时间</b></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="item1" items="${list1}">
						<tr>
							<td><b><c:out value="${item1.orderId}"></c:out></b></td>
							<td><b><c:out value="${item1.hotelName}"></c:out></b></td>
							<td><b><c:out value="${item1.roomId}"></c:out></b></td>
							<td><b><c:out value="${item1.dayNum}"></c:out></b></td>
							<td><b><c:out value="${item1.orderMoney}"></c:out></b></td>
							<td><b><c:out value="${item1.orderTime}"></c:out></b></td>
							<td><b><c:out value="${item1.orderState}"></c:out></b></td>
							<td><b><c:out value="${item1.inTime}"></c:out></b></td>

						</tr>
					</c:forEach>
					</tbody>
				</table>
				</form>
			</div>
		</div>
		</div>
</body>
<script src="js/jquery-1.12.3.min.js">	</script>
<script src="js/bootstrap.js">	</script>
</html>

