<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="cn.com.zx.travelcompanion.bean.OrderInfoBean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
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
		<link rel="stylesheet" href="css/fronts/order.css">
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
			 /* $(document).ready(function(){
			    
			 	$.ajax({
			 	   type:"get",
			 	   url:"GetOrderInfoServlet",
			 	   success:function(data){			 	                            
			 	      
			 	         
 
			 	   }
			 	}); 
	    	}); */
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
		                    <dd class="cur" ><a href="#userinfo.html"><h3>我的信息</h3></a></dd>
		                    <dd><a href="#myOrder.jsp"><h3>我的订单</h3></a></dd>		                    
		                    <dd><a href="#myProperty.jsp"><h3>我的财产</h3></a></dd> 
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
		                    <h3 style="display:inline;">&nbsp;我的订单</h3>
		                    <button style="margin-left:320px;margin-top:-12px;height:30px;width:80px;" id="xiugai"><p style="margin-top:5px;color:#8B0A50">修改</p></button>
		                </div>  
		            </div>
		            <div class="order-body" style="height:800px;">
		               <div style="height:800px;">
			               	
			               	<c:forEach var="i" begin="0" end="${fn:length(orderlist)-1}" step="1">	
			               		<div class="order-item clearfix" style="width:100%;display:inline;">	
			               			           
			                    <div class="order-img" style="float:left;width:25%;display:inline;">
			                       	 <a class="link" href="" target="_blank">
			                       	    <div>
			                       	         <img src="${hlist.get(i).picture}" style="width:150px;height:100px;"  class="">
			                       	    </div>
			                       	 </a>                     
			                    </div>
			                    <div class="order-info " style="float:left;width:25%;display:inline;">
			                       	  <div class="info-box">
			                       	       <a class="link" href="" target="_blank">
			                       	           <p class="order-title">酒店名称:${hlist.get(i).hotelName}</p>
			                       	       </a>
			                       	       <p class="info">酒店描述</p>
			                       	       <p class="info">时间:${orderlist.get(i).orderTime}</p>
			                       	  </div>                      
			                    </div>
			                    <div class="order-price" style="float:left;width:25%;display:inline;">预定价格：￥${orderlist.get(i).orderMoney}  
			                    	                      
			                    </div>
			                    <div class="order-state" style="float:left;width:25%;display:inline;">预定状态：${orderlist.get(i).orderState}		                    	                      
			                    </div>
			                   
			                     </div> 
			                     <br>
			                </c:forEach>
			                
			                <tr align = "center">
								<td colspan="5">
								第<c:out value="${curPage }"/>页/共<c:out value="${ totalPage}" />页
								<c:if test="${curPage != 1 }">
									<a href="OrderInfoPages?page=1">首页</a> | 
									<a href="OrderInfoPages?page=<c:out value="${curPage -1 }" />">上一页</a>|
								</c:if>
								
								<c:if test="${curPage != totalPage }">
								 	<a href="OrderInfoPages?page=<c:out value="${curPage + 1 }" />">下一页</a> |
								 	<a href="OrderInfoPages?page=<c:out value="${totalPage }" />">尾页</a> | 
								</c:if>
								</td>
							</tr>
								</tbody>
				        </table>
		              
		            </div>
		        </div>	
		     </div>	     
		</section>
  </body>
</html>
