<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'HotelzhuCe.jsp' starting page</title>
    
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
     <script src="dist/js/city.js"></script>
     <script src="dist/js/method.js"></script>
     <script src="dist/js/jquery-3.3.1.js"></script>
			<script>
			
			function checkHotelName(){
			var hotelName=$("#hotelName").val();
			var flag=!(hotelName=="");
			
			if(flag){
				$("#hotelName").css("border","");
			}else{
				$("#hotelName").css("border","1px solid red");
			}
			return flag;
		}
			
		function checkTelephone(){
			var telephone=$("#telephone").val();
			var flag=!(telephone=="");
			
			if(flag){
				$("#telephone").css("border","");
			}else{
				$("#telephone").css("border","1px solid red");
			}
			return flag;
		}
			
			function checkXinxi(){
			var hotelName=$("#xinxi").val();
			var flag=!(hotelName=="");
			
			if(flag){
				$("#xinxi").css("border","");
			}else{
				$("#xinxi").css("border","1px solid red");
			}
			return flag;
		}
			
			function checkCCity(){
			var hotelName=$("#ccity").val();
			var flag=!(hotelName=="");
			
			if(flag){
				$("#ccity").css("border","");
			}else{
				$("#ccity").css("border","1px solid red");
			}
			return flag;
		}
			
			function checkSqnr(){
			var hotelName=$("#sqnr").val();
			var flag=!(hotelName=="");
			
			if(flag){
				$("#sqnr").css("border","");
			}else{
				$("#sqnr").css("border","1px solid red");
			}
			return flag;
		}
				
				function checkYyzzh(){
			var hotelName=$("#yyzzh").val();
			var flag=!(hotelName=="");
			
			if(flag){
				$("#yyzzh").css("border","");
			}else{
				$("#yyzzh").css("border","1px solid red");
			}
			return flag;
		}
				
				$(function(){
					$("#jdzcb").blur(checkHotelName);
				  $("#telephone").blur(checkTelephone);
					$("#xinxi").blur(checkXinxi);
					$("#ccity").blur(checkCCity);
					$("#sqnr").blur(checkSqnr);
					$("#yyzzh").blur(checkYyzzh);
				});
						
			</script>


  </head>
  <form class="form" id="formkk" action="HotelApply" method="post" enctype="multipart/form-data">
 
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
                            <li>Form</li>
                            <li class="active">酒店注册表</li>
                        </ol>
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs" id="jdzcb">
                            <i class="fa fa-th icon"></i>
                        </button>
                    </div>
                   
                        
                       
                        <li class="dropdown profile">
 
                    <ul class="dropdown-menu animated fadeInDown">
                                <li class="profile-img">
                                    <img src="../../img/profile/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
                                </li>
                                <li>
                                    <div class="profile-info">
                                  
                                      
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
         
            <!-- 主界面-->
            <div class="container-fluid">
                <div class="side-body">
                    <div class="page-title">
                        <span class="title">加盟申请</span>
                        <div class="description" id="xinxi">请准确输入您的公司信息</div>
                    </div>
                    
                    
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="card">
                                <div class="card-header">
                                    <div class="card-title">
                                        <div class="title">酒店/景点/农家乐信息</div>
                                    </div>
                                </div>
                                
                                <div class="card-body">
                                                       <div class="sub-title">加盟类型</div>
                                    <div>
                                          <div class="radio3 radio-check radio-inline">
                                            <input type="radio" id="radio4" name="radio2" value="酒店" checked="">
                                            <label for="radio4">
                                                                               酒店
                                            </label>
                                          </div>
                                          <div class="radio3 radio-check radio-success radio-inline">
                                            <input type="radio" id="radio5" name="radio2" value="农家乐">
                                            <label for="radio5">
                                                                              农家乐
                                            </label>
                                          </div>
                                          <div class="radio3 radio-check radio-warning radio-inline">
                                            <input type="radio" id="radio6" name="radio2" value="景点">
                                            <label for="radio6">
                                                                              景点 
                                            </label>
                                          </div>
                                        </div>
                                    选择您所加盟的类型
                                    <div class="sub-title">公司名称</div>
                                    <div>
                                        <input type="text" class="form-control" id="hotelname" name="hotelName" placeholder="Text input">
                                    </div>
                                         <div class="sub-title" id="telephone">联系电话</div>
                                    <div>
                                        <input type="text" class="form-control" name="telephone" placeholder="Text input">
                                    </div>
                                    <div class="sub-title">公司信息</div>
                                    <div>
                                        <textarea class="form-control" name="hotelInfo" rows="3"></textarea>
                                    </div>
                                    
          <div class="card-header">
                                    <div class="card-title">
                                        <div class="title" class="ccity">选择城市</div>
                                    </div>
                                </div>                 
    <fieldset>
      
            <label for="addr-show">您选择的是：
                <input type="text" name="city1" value="" id="addr-show">
            </label>
            <br/>
 
            <!--省份选择-->
            <select id="prov" name="province" onchange="showCity(this)">
                <option>=请选择省份=</option>
 
            </select>
 
            <!--城市选择-->
            <select id="city" name="city" onchange="showCountry(this)">
                <option>=请选择城市=</option>
            </select>
 
            <!--县区选择-->
            <select id="country" onchange="selecCountry(this)">
                <option>=请选择县区=</option>
            </select>
            <button type="button" class="btn met1" onClick="showAddr()" id="button-show" >确定</button>
     
    </fieldset>

                                   <div class="sub-title" id="sqnr">申请内容</div>
                                    <div>
                                        <textarea class="form-control" name="apply" rows="3"></textarea>
                                    </div>
                                    
                                    </div>
                                    </div>
                                    </div>
                                                                                                                                     
                     <div class="row">
                        <div class="col-xs-12">
                            <div class="card">
                                <div class="card-header">
                                    <div class="card-title">
                                        <div class="title">资质信息</div>
                                    </div>
                                </div>
                                <div class="card-body">
                                
                                            <div class="sub-title" id="yyzzh">营业执照号</div>
                                    <div>
                                        <input type="text" class="form-control" name="zhizhao" placeholder="Text input">
                                    </div>
                                  
                                        <div class="form-group">
                                            <label for="exampleInputFile">营业执照图片</label>
                                            <input type="file" name="lpicture" id="exampleInputFile" >
                                            <p class="help-block">Example block-level help text here.</p>
                                        </div>
                                        <div class="checkbox">
                                          <div class="checkbox3 checkbox-round">
                                            <input type="checkbox" id="checkbox-1">
                                            <label for="checkbox-1">
                                              Check me out
                                            </label>
                                          </div>
                                        </div>
                                        <button type="submit" class="btn btn-default">提交</button>                                
                                </div>
                            </div>
                        </div>
                    </div>
             </form>
                   
         
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
               <script src="dist/js/city.js"></script>
               <script src="dist/js/method.js"></script>
              <script src="dist/jd/jquery.min.js"></script>
</body>

</html>
