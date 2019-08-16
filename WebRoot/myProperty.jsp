<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="cn.com.zx.travelcompanion.bean.OrderInfoBean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>账单</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="css/fronts/bootstrap.min.css" />
		<link rel="stylesheet" href="css/fronts/camera.css" />
		<link rel="stylesheet" href="css/fronts/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="css/fronts/matrix-login.css" />
		<link rel="stylesheet" href="css/fronts/font-awesome.css" />

		<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700%7CMontserrat:400,700" rel="stylesheet">
		<link rel="stylesheet" href="css/font-awesome.min.css">
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="css/mob.css">
		<link rel="stylesheet" href="css/animate.css">
		<link rel="stylesheet" href="css/fronts/order.css">
		<script src="js/jquery-latest.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<script src="js/wow.min.js"></script>
		<script src="js/custom.js"></script>
 <script>
     $(document).ready(function(){
          $("#check").click(function(){
              var year=$("#year").val();
              var month=$("#month").val();
              //alert(year+month);
              $.ajax({
                    type:"post",
                    url:"CheckServlet",
                    data:{year:year,
                          month:month,
                    },
                    success:function(data){
                        var c=data;
                        //alert(data);
                        if(c=="0"){
                        	$(".order-item").css('display','none');
                        	$("#totalMoney").val("0");
                            alert("该月没有产生账单");
                        }else{
                            window.location.href="myProperty.jsp";
                        }
                    }
                });
          });
     });
 
 </script>
		<script src="js/bootstrap.js"></script>
	
		<link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
		<link rel="stylesheet" type="text/css" href="theme/css/base.css">
		<link rel="stylesheet" type="text/css" href="theme/css/member.css">
		<style type="text/css">
		     a:link{font-family:Verdana, Geneva, sans-serif; color:#000;}
		     a.visited{font-family:"黑体"; color:#F00;}
		</style>
  </head>
  
  <body>
    <div id="preloader">
			<div id="status">&nbsp;</div>
		 </div>
		 <!--==导航栏========== -->
		 <section>
			<div class="rows head" data-spy="affix" data-offset-top="120" style="background-color:#1B6D85">
				<div class="container" style="margin-left: 10px;width: 90%;">
					<div style="display: flex;">
						<!--====== BRANDING LOGO ==========-->
						<div class="col-md-4 col-sm-12 col-xs-12 col-lg-4" style="display: flex;">
							<a href="index.html"><img alt="" src="images/logo.png" style="position: absolute;"></a>
							<p style="color:white;margin-left:60px;margin-top: 10px;">爱生活，爱旅行</p>
						</div>
						<!--
                        	作者：1875763391@qq.com
                        	时间：2019-08-06
                        	描述：
                      -->
						<!-- NAVIGATION MENU -->
						<div class="collapse navbar-collapse " id="myNavbar" style="width: 80%;margin-left: 100px;">
							<ul class="nav navbar-nav " >
								<li>
									<a href="index.html " >主页</a>
								</li>
								<li>
									<a href="family-package.html ">旅游</a>
								</li>
								<li>
									<a href="hotels-list.html ">酒店</a>
								<li>
									<a href="blog.html ">轰趴</a>
								</li>
								<li>
									<a href="places.html ">农家乐</a>
								</li>
								<li>
									<a href="contact.html ">联系我们</a>
								</li>
							</ul>
						</div>
						<!--描述：搜索框-->
						<div class="col-lg-6">
							<div class="input-group" style="margin-top: 9px;">
								<input type="text" class="form-control" style="height: 34px;" placeholder="搜索...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">搜索</button>
								</span>
							</div>
							<!-- /input-group -->
						</div>
						
						<div class="col-md-3 col-sm-4 col-xs-4 head_right head_right_all">
							<ul>
								<li>
									<div class="dropdown ">
										<button class="dropbtn " style="width: 80px; margin-top: 10px;margin-left: 20px;">个人中心</button>
										<div class="dropdown-content " style="margin-left: 130px; ">								
											<a href="SelectUserInfoServlet"><i class="fa fa-bookmark-o " aria-hidden="true "></i> 个人中心</a>
											<a href="OrderInfoPages"><i class="fa fa-umbrella " aria-hidden="true "></i>我的订单</a>
											<a href="myProperty.jsp"><i class="fa fa-bed " aria-hidden="true "></i>账单</a>
											<a href="# "><i class="fa fa-ban " aria-hidden="true "></i> 我的消息</a>
											<a href="userlogin.html"><i class="fa fa-sign-in " aria-hidden="true "></i>退出账号</a>	

										</div>
									</div>
								</li>
							</ul>
						</div>

					</div>
				</div>

			</div>
	    </section>
		
		
		
		<div class="containers"  style="margin-top:10px;" >
		   <div class="pc-nav-item" style="font-size:20px;"><a href="#" style="font-size:20px;">首页</a> &gt; <a href="#" style="font-size:20px;">个人中心 </a></div>
		</div>


		<!-- 个人中心 begin -->
		<section id="member" style="margin-top:15px;height:800px">
		    <div class="member-center clearfix" style="height:800px">
		        <div class="member-left fl" >
		            <div class="member-apart clearfix" >
		                <div class="fl"><a href="#"><img src="theme/img/bg/mem.png"></a></div>
		                <div class="fl" style="margin-left:10px;margin-top:10px;font-size:30px">
		                    <p>用&nbsp;&nbsp;户：</p>
		                    <text id="userName">${userinfo.userName}</text>
		                    
		                </div>
		            </div>
		            <div class="member-lists" style="margin-top:40px;">
		                <dl style="margin-top:40px;">
		                    <dt>个人中心</dt>
		                    <dd class="cur" ><a href="userinfo.html">我的信息</a></dd>
		                    <dd><a href="OrderInfoPages">我的订单</a></dd>		                    
		                    <dd><a href="myProperty.jsp">我的财产</a></dd> 
		                </dl>
		                <dl>
		                    <dt>客户服务</dt>
		                    <dd><a href="#">退货申请</a></dd>
		                    <dd><a href="#">退货/退款记录</a></dd>
		                </dl>		                
		            </div>
		        </div>
		        <!-- 我的订单 -->
		        <div class="member-right fr id="div1" style="height:800px;">
		            <div class="member-head" >
		                <div class="member-heels fl">
		                    <h3 style="display:inline;">&nbsp;我的账单</h3>
		               </div>  
		            </div>
		            <div class="order-body" style="height:800px;">
		               <div style="height:800px;">
			               	
			               	<label for="pet-select">请选择年份:</label>
								<select id="year">
    								<option value="2021">2021</option>
    								<option value="2020">2020</option>
    								<option value="2019" selected>2019</option>
   	 								<option value="2018">2018</option>
    								<option value="2017">2017</option>
    								<option value="2016">2016</option>
    								<option value="2015">2015</option>
								</select>
			               	<label for="pet-select">请选择月份:</label>
								<select id="month">
    								<option value="1" selected>1</option>
    								<option value="2">2</option>
    								<option value="3">3</option>
   	 								<option value="4">4</option>
    								<option value="5">5</option>
    								<option value="6">6</option>
    								<option value="7">7</option>
    								<option value="8">8</option>
    								<option value="9">9</option>
    								<option value="10">10</option>
    								<option value="11">11</option>
    								<option value="12">12</option>
								</select>
							<input type="button" value="查询" id="check">
			               	<c:forEach  var="orderlist" items="${orderlist}">	
			               		<div class="order-item clearfix" style="width:100%;display:inline;">	
			               			           
			                    
			                    <div class="order-info " style="float:left;width:25%;display:inline;">
			                       	  <div class="info-box">
			                       	       <a class="link" href="" target="_blank">
			                       	           <p class="order-title">酒店名称:${orderlist.hotelName }</p>
			                       	       </a>
			                       	      
			                       	       <p class="info">时间:${orderlist.orderTime}</p>
			                       	  </div>                      
			                    </div>
			                    <div class="order-price" style="float:left;width:25%;display:inline;">价格：￥${orderlist.orderMoney}  
			                    	                      
			                    <%-- </div>
			                    <div class="order-state" style="float:left;width:25%;display:inline;">预定状态：${orderlist.orderState}		                    	                      
			                    </div> --%>
			                   
			                     </div> 
			                     <br>
			                </c:forEach>
			                
			                <br><br><br>
			                <c:if test="${empty TotalMoney}">
			                	本月总共花费：<input type="text" value="0元" readonly>
			                </c:if>
			                 <c:if test="${not empty TotalMoney}">
								本月总共花费：<input type="text" value="${TotalMoney}" readonly id="totalMoney">
			                </c:if>			                		              
		            </div>
		        </div>	
		     </div>	     
		</section>
  </body>
</html>
