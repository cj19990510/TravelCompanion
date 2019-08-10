<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>酒店管理</title>
    
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
			<div style="width:13%;background-color:#265A88;height:750px;text-align: center;">
				<div class="jumbotron" style="background-color:#265A88;">
					<h2 style="font-family:STXingkai;font-size:30px;left:25px;top:20px;position: absolute; color:rosybrown;">
					伴旅后台</br>管理系统</h2>
				</div>
				<ul class="nav nav-pills nav-stacked" >
					<li role="presentation" >
						<a href="shouyi.jsp">
							<h4>收益管理</h4></a>
					</li>
					<li role="presentation">
						<a href="dingdan.jsp">
							<h4>订单管理</h4></a>
					</li>
					<li role="presentation">
						<a href="yonghu.jsp">
							<h4>用户管理</h4></a>
					</li>
					<li role="presentation">
						<a href="jiudian.jsp">
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
	<span  style="left:210px;top:20px;position: fixed; font-size:30px; color:burlywood">
	        <script type="text/javascript">
            var date = new Date();
            document.write(date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
           </script></span>
	<span style="right:30px;top:20px;position: fixed; font-size:30px;">${adminid}号管理员</span>
	</a>
	
	<div class="d3" style="background:#f5f5fa;width:1150px;height:700px; left:190px;top:80px;position: fixed;">
	
	<div align="center" >
         <table class="divTab" width="100%" align="center" style="position: absolute;top:130px;">
            <thead>
            <tr>
                <th><b>申请id</b></th>
                <th><b>酒店名称</b></th>
				<th><b>酒店电话</b></th>
                <th><b>所属城市</b></th>
                <th><b>酒店信息</b></th>
                <th><b>类型</b></th>
                <th><b>申请内容</b></th>
                <th><b>是否同意</b></th>
            </tr>
            </thead>
            
        </table>
    </div>
  </div>  
	</div>	
	</div>
  </body>
  <script src="js/core/jquery.3.2.1.min.js">	</script>
<script src="js/bootstrap.js">	</script>
</html>
