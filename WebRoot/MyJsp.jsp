<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table>
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
			</table>
  </body>
</html>
