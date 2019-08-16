<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		
	<div id="d1" style="width:1100px;height:900px;background-color: white;float:right ">
	<a >  
	<span  style="left:260px;top:20px;position: fixed; font-size:30px; color:burlywood">
	        <script type="text/javascript">
            var date = new Date();
            document.write(date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
           </script></span>
	<span style="right:30px;top:20px;position: fixed; font-size:30px;">${adminid}号管理员</span>
	</a>
	
	<div class="d3" style="background:#f5f5fa;width:1400px;height:700px; left:220px;top:80px;position: fixed;">
    <form action="chaping" method="post">
    <div style="border-top: 1px solid  black;"></div>
	    
					<div style="text-align: center;background-color: white;width: 100%;" >
					
					 <select name="s1" style="position:absolute;height:30px;top:30px;left:60px;" >
		                <option value="请选择查询类型" selected>请选择查询类型</option>
		                <option value="按用户查询">按用户查询</option>
		                <option value="按酒店查询">按酒店查询</option>
		              </select>
		             
						<div class="input-group input-group-sm" style="width:250px; margin-left:35%;margin-top:30px;">
							<input type="text" class="form-control" aria-describedby="sizing-addon1" name="userid1">
							<button class="input-group-addon" TYPE="submit" id="btn" 
							style="top:0;left:250px;position:absolute;width:40px;" >查询</button>
	                 <span style="color: red;">${msg1}</span>
	</div>
	<span style="color: skyblue;top:90px;left:700px;position:absolute;font-family:STXingkai;font-size:30px;">差评率:<span color="yellowgreen">${remark}</span></span>
	
</div>
     <div align="center" >
         <table class="sui-table table-primary"  width="100%" align="center" style="position: absolute;top:140px;">
            <thead>
            <tr>
                <th  style="width:15%"><b>评论id</b></th>
                <th  style="width:15%"><b>评论用户</b></th>
				<th  style="width:15%"><b>评论时间</b></th>
                <th  style="width:15%"><b>评论商家</b></th>
                <th  style="width:40%; text-align:center;"><b>评论</b></th>
            </tr>
            </thead>
            <tbody>
					<c:forEach var="item" items="${list3}">
						<tr>
							<td><b><c:out value="${item.remarkId}"></c:out></b></td>
							<td><b><c:out value="${item.userId}"></c:out></b></td>
							<td><b><c:out value="${item.remarkTime}"></c:out></b></td>
						    <td><b><c:out value="${item.hotleName}"></c:out></b></td>
						    <td><b><c:out value="${item.remark}"></c:out></b></td>
						</tr>
					
					</c:forEach>
				</tbody>
            
        </table>
        </form>
    </div>
     </div>	
	</div>
	</div>
  </body>
  <script src="js/core/jquery.3.2.1.min.js">	</script>
<script src="js/bootstrap.js">	</script>
</html>
