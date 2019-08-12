<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
      <title>我的订单</title>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

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
		<script src="js/jquery-latest.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<script src="js/wow.min.js"></script>
		<script src="js/custom.js"></script>

		<script src="js/bootstrap.js"></script>
	
		<link rel="shortcut icon" type="image/x-icon" href="theme/icon/favicon.ico">
		<link rel="stylesheet" type="text/css" href="theme/css/base.css">
		<link rel="stylesheet" type="text/css" href="theme/css/member.css">
		<style type="text/css">
		     a:link{font-family:Verdana, Geneva, sans-serif; color:#000;}
		     a.visited{font-family:"黑体"; color:#F00;}
		</style>
		<script>
			 $(document).ready(function(){
			    
			 	$.ajax({
			 	   type:"post",
			 	   url:"GetUserInfoServlet",
			 	   success:function(data){
			 	      console.log(data);                             
			 	      var obj=eval('('+data+')');
			 	         $("#userna").append(obj.userName);
			 	         $("#username").val(obj.userName);
			 	         $("#userpassword").val(obj.userPassword);
			 	         $("#reuserpassword").val(obj.userPassword);
			 	         $("#userphone").val(obj.userPhone); 
			 	         $("#useremail").val(obj.userEmail);
			 	         $("#userid").val(obj.userId);
 
			 	   }
			 	});
			 	
			
			 	
			 
			 
	    });
		</script>
		
	
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
											<a href="# "><i class="fa fa-bookmark-o " aria-hidden="true "></i> 个人中心</a>
											<a href="# "><i class="fa fa-umbrella " aria-hidden="true "></i>我的订单</a>
											<a href="# "><i class="fa fa-bed " aria-hidden="true "></i>账单</a>
											<a href="# "><i class="fa fa-ban " aria-hidden="true "></i> 我的消息</a>
											<a href="# "><i class="fa fa-sign-in " aria-hidden="true "></i>退出账号</a>	

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
		<section id="member" style="margin-top:15px;">
		    <div class="member-center clearfix">
		        <div class="member-left fl" >
		            <div class="member-apart clearfix" >
		                <div class="fl"><a href="#"><img src="theme/img/bg/mem.png"></a></div>
		                <div class="fl" style="margin-left:10px;margin-top:10px;font-size:30px">
		                    <p>用&nbsp;&nbsp;户：</p>
		                    <text id="userna"></text>
		                    
		                </div>
		            </div>
		            <div class="member-lists" style="margin-top:40px;">
		                <dl style="margin-top:40px;+;">
		                    <dt>个人中心</dt>
		                    <dd class="cur" ><a href="#userinfo.html">我的信息</a></dd>
		                    <dd><a href="#myOrder.jsp">我的订单</a></dd>		                    
		                    <dd><a href="#myProperty.jsp">我的财产</a></dd> 
		                   
		                  
		                   
		                </dl>
		                <dl>
		                    <dt>客户服务</dt>
		                    <dd><a href="#">退货申请</a></dd>
		                    <dd><a href="#">退货/退款记录</a></dd>
		                </dl>		                
		            </div>
		        </div>
		        <!-- 我的订单 -->
		        <div class="member-right fr id="div1">
		            <div class="member-head" >
		                <div class="member-heels fl">
		                    <h3 style="display:inline;">&nbsp;我的订单</h3>
		                    <button style="margin-left:320px;margin-top:-12px;height:30px;width:80px;" id="xiugai"><p style="margin-top:5px;color:#8B0A50">修改</p></button>
		                </div>  
		            </div>
		            <div class="member-border">
		               <div class="member-order">
		                   <dl class="member-custom clearfix ">
		                       <dt>
		                            <input >
		                            <input type="text" name="username" id="username" readonly="readonly">
		                            <span ></span>
		                            <input type="hidden" name="userid" id="userid" > 
                               </dt>		                      
		                   </dl>
		                   <dl class="member-custom clearfix ">
		                       <dt>
		                             <b>用户密码：</b>
		                             <input type="password" name="userpassword" id="userpassword" readonly="readonly" >  
		                             <span ></span>                              
		                       </dt>
		                   </dl>
		                   <dl class="member-custom clearfix ">
		                       <dt>
		                             <b>重输密码：</b>
		                             <input type="password" name="reuserpassword" id="reuserpassword" readonly="readonly" > 
		                             <span ></span>                                   
		                       </dt>		                      
		                   </dl>
		               </div>
		            </div>
		           
		        </div>
		     </div>
		</section>
  </body>
</html>
