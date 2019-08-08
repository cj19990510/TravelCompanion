<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

</head>

<body>
	<div class="d1"
		style="width:180px;height:700px;position: fixed;float:left;background-color: rosybrown; ">
		<img src="images/logo.png" style="left:12px;top:10px;" />
		<h1
			style="text-align: center; color:midnightblue;font-family:STXingkai;top:50px;position: absolute;">后台管理</h1>

		<div class="d2" style="top:130px;position: absolute;">

			<button type="button" class="btn btn-default btn-lg ">
				<span class="glyphicon glyphicon-star" aria-hidden="true"></span> <a
					href="shouyi.jsp">查看收益</a>
			</button>
			</br>
			</br>

			<button type="button" class="btn btn-default btn-lg ">
				<span class="glyphicon glyphicon-th-list" aria-hidden="true"></span>
				<a href="dingdan.jsp">查看订单</a>
			</button>
			</br>
			</br>

			<button type="button" class="btn btn-default btn-lg ">
				<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				<a href="chaping.jsp">查看差评</a>
			</button>
			</br>
			</br>

			<button type="button" class="btn btn-default btn-lg ">
				<span class="glyphicon glyphicon-user" aria-hidden="true"></span><a
					href="yonghu.jsp">用户管理</a>
			</button>
			</br>
			</br>

			<button type="button" class="btn btn-default btn-lg ">
				<span class="glyphicon glyphicon-glass" aria-hidden="true"></span><a
					href="jiudian.jsp"> 酒店管理</a>
			</button>
			</br>
			</br>

		</div>
	</div>

	<div id="d1"
		style="width:1100px;height:900px;background-color: white;float:right ">
		<a> <span
			style="left:210px;top:20px;position: fixed; font-size:30px; color:burlywood">
				<script type="text/javascript">
					var date = new Date();
					console.log("123");
					document.write(date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
				</script>
		</span> <span style="right:30px;top:20px;position: fixed; font-size:30px;">${adminid}号管理员</span>
		</a>

		<div class="d3"
			style="background:#f5f5fa;width:1150px;height:700px; left:190px;top:80px;position: fixed;">

          <form action="houtai" method="post" >
          
			<INPUT TYPE="submit" id="btn" value="查询">
				<input TYPE="text" NAME="userid"
				style="position: absolute;left:110px;top:26px" id="jieguo"> 
				<button
				style="color:red;font-size:25px;position: absolute;left:350px;top:20px;font-family:FZShuTi;">
				删除</button>
			<span>${msg1}</span>

			<div align="center">
				<table class="divTab" width="100%" align="center"
					style="position: absolute;top:80px;">
					<tr>
						<td><b>用户id</b></td>
						<td><b>用户名称</b></td>
						<td><b>用户手机号</b></td>
						<td><b>用户订单数量</b></td>
						<td><b>用户订单成功数量</b></td>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td><b><c:out value="${item.userId}"></c:out></b></td>
							<td><b><c:out value="${item.userName}"></c:out></b></td>
							<td><b><c:out value="${item.userPassword}"></c:out></b></td>
						</tr>
					
					</c:forEach>
					<tr height="100px">
					</tr>

					<tr>
						<td><b>酒店名</b></td>
						<td><b>订单号</b></td>
						<td><b>房间号</b></td>
						<td><b>预定天数</b></td>
						<td><b>订单金额</b></td>
						<td><b>订单时间</b></td>
						<td><b>订单状态</b></td>
						<td><b>入住时间</b></td>
					</tr>
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
				</table>
				</form>
			</div>
		</div>

	</div>
</body>

</html>

