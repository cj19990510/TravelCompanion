<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
      <title>您的订单</title>
   <!--   <meta name="viewport" content="width=device-width, initial-scale=1"> -->
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS Libs -->
    <link rel="stylesheet" type="text/css" href="dist/lib/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="dist/lib/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="dist/lib/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="dist/lib/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="dist/lib/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css" href="dist/lib/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="dist/lib/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="dist/lib/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="dist/css/style.css">
    <link rel="stylesheet" type="text/css" href="dist/css/themes/flat-blue.css">

  </head>
  
  <body class="flat-blue">
  
    <div class="app-container">
        <div class="row content-container">
            <nav class="navbar navbar-default navbar-fixed-top navbar-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-expand-toggle">
                            <i class="fa fa-bars icon"></i>
                        </button>
                        <ol class="breadcrumb navbar-breadcrumb">
                            <li>订单服务</li>
                            <li class="active">新的用户订单表</li>
                        </ol>
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-th icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav navbar-right">
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-comments-o"></i></a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li class="title">
                                    新的订单<span class="badge pull-right">0</span>
                                </li>
                                <li class="message">
                                    没有新的消息
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown danger">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-star-half-o"></i> 4</a>
                            <ul class="dropdown-menu danger  animated fadeInDown">
                                <li class="title">
                                    Notification <span class="badge pull-right">4</span>
                                </li>
                                <li>
                                    <ul class="list-group notifications">
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge">1</span> <i class="fa fa-exclamation-circle icon"></i> new registration
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge success">1</span> <i class="fa fa-check icon"></i> new orders
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item">
                                                <span class="badge danger">2</span> <i class="fa fa-comments icon"></i> customers messages
                                            </li>
                                        </a>
                                        <a href="#">
                                            <li class="list-group-item message">
                                                view all
                                            </li>
                                        </a>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown profile">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Emily Hart <span class="caret"></span></a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li class="profile-img">
                                    <img src="dist/img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
                                </li>
                                <li>
                                    <div class="profile-info">
                                        <h4 class="username">Emily Hart</h4>
                                        <p>emily_hart@email.com</p>
                                        <div class="btn-group margin-bottom-2x" role="group">
                                            <button type="button" class="btn btn-default"><i class="fa fa-user"></i> Profile</button>
                                            <button type="button" class="btn btn-default"><i class="fa fa-sign-out"></i> Logout</button>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
            <div class="side-menu sidebar-inverse">
                <nav class="navbar navbar-default" role="navigation">
                    <div class="side-menu-container">
                        <div class="navbar-header">
                            <a class="navbar-brand" href="dist/html/index.jsp">
                                <div class="icon fa fa-paper-plane"></div>
                                <div class="title">回到主页</div>
                            </a>
                            <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                                <i class="fa fa-times icon"></i>
                            </button>
                        </div>
                        <ul class="nav navbar-nav">
                            <li>
                                <a href="../index.html">
                                    <span class="icon fa fa-tachometer"></span><span class="title">Dashboard</span>
                                </a>
                            </li>
                          <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-table">
                                    <span class="icon fa fa-table"></span><span class="title">订单表</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-table" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="table/table.html">新的用户订单表</a>
                                            </li>
                                            <li><a href="OrderInfoServlet">用户订单</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#dropdown-form">
                                    <span class="icon fa fa-file-text-o"></span><span class="title">Form</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="dropdown-form" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="dist/html/form/ui-kits.html">酒店注册</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <!-- Dropdown-->
                            <li class="panel panel-default dropdown">
                                <a data-toggle="collapse" href="#component-example">
                                    <span class="icon fa fa-cubes"></span><span class="title">Components</span>
                                </a>
                                <!-- Dropdown level 1 -->
                                <div id="component-example" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul class="nav navbar-nav">
                                            <li><a href="components/pricing-table.html">Pricing Table</a>
                                            </li>
                                            <li><a href="components/chartjs.html">Chart.JS</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                </nav>
            </div>
            <!-- Main Content -->
             
            <div class="container-fluid">
                <div class="side-body">
                    <div class="page-title">
                        <span class="title">请添加您的房间信息</span>
                        <div class="description">房间</div>
                    </div>
                                <div class="card-title">
                                    <div class="title">房间信息</div>
                                    </div>                            
                                
                                <div class="card-body">
                                <div class="btn-toolbar" role="toolbar">
                                            <div class="btn-group">
                                                <button class="btn btn-default btn-lg dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
                                                    Large button <span class="caret"></span>
                                                </button>
                                                <ul class="dropdown-menu" role="menu">
                                                    <li><a href="#">Action</a></li>
                                                    <li><a href="#">Another action</a></li>
                                                    <li><a href="#">Something else here</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="#">Separated link</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th>房间类型</th>
                                                <th>房间价格</th>
                                                <th>房间总数</th>
                                                <th>剩余空房数</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                         <tr>
                                                <th scope="row">1</th>
                                                <td>单人床</td>
                                                <td>100</td>
                                                <td></td>
                                            </tr>
                                            <tr>
                                                <th scope="row">2</th>
                                                <td>双人床</td>
                                                <td>200</td>
                                                <td>30</td>
                                            </tr>
                                            <tr>
                                                <th scope="row">3</th>
                                                <td>三人床</td>
                                                <td>400</td>
                                                <td>40</td>
                                            </tr>
                                            <tr>
                                                <th scope="row">4</th>
                                                <td>豪华单人间</td>
                                                <td>500</td>
                                                <td>20</td>
                                            </tr>
                                             <tr>
                                                <th scope="row">1</th>
                                                <td>豪华双人间</td>
                                                <td>600</td>
                                                <td>30</td>
                                            </tr>
                                        </tbody>
                                    </table>
                            </div>
             </div>            
                         
                                
        
        <footer class="app-footer">
            <div class="wrapper"> <span class="pull-right">2.1 <a href="#"><i class="fa fa-long-arrow-up"></i></a></span> 2019年8月15日制作
            </div>
        </footer>
    <div>
    <!-- Javascript Libs -->
    <script type="text/javascript" src="dist/lib/js/jquery.min.js"></script>
    <script type="text/javascript" src="dist/lib/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="dist/lib/js/Chart.min.js"></script>
    <script type="text/javascript" src="dist/lib/js/bootstrap-switch.min.js"></script>

    <script type="text/javascript" src="dist/lib/js/jquery.matchHeight-min.js"></script>
    <script type="text/javascript" src="dist/lib/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="dist/lib/js/dataTables.bootstrap.min.js"></script>
    <script type="text/javascript" src="dist/lib/js/select2.full.min.js"></script>
    <script type="text/javascript" src="dist/lib/js/ace/ace.js"></script>
    <script type="text/javascript" src="dist/lib/js/ace/mode-html.js"></script>
    <script type="text/javascript" src="dist/lib/js/ace/theme-github.js"></script>
    <!-- Javascript -->
    <script type="text/javascript" src="dist/js/app.js"></script>
</body>

</html>
