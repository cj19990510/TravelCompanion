<%@page import="cn.com.zx.travelcompanion.bean.RoomInfoBean"%>
<%@page import="cn.com.zx.travelcompanion.bean.HotelInfoPictureBean"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="en">

<head>
<title>Single</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/styles.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.css">
<script type="text/javascript"
	src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=A6HyQTlMFwu3LzpiUCXg4HdKKSC7OrT4"></script>
<!--========= Scripts ===========-->

<script src="js/custom.js "></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=A6HyQTlMFwu3LzpiUCXg4HdKKSC7OrT4"></script>
<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css"
	rel="stylesheet">

<script type="text/javascript"
	src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>
<style type="text/css">
.alert {
	filter: alpha(opacity = 100); /* IE */
}
</style>
</head>
</head>

<body>

	<div id="container"></div>
	<div id="preloader">
		<div id="status">&nbsp;</div>
	</div>
	<!--==导航栏========== -->
	<section>
		<div class="rows head" data-spy="affix" data-offset-top="120"
			style="background-color:#1B6D85;height:80px">
			<div class="container" style="margin-left: 10px;width: 90%;">
				<div style="display: flex;">
					<!--====== BRANDING LOGO ==========-->
					<div class="col-md-4 col-sm-12 col-xs-12 col-lg-4"
						style="display: flex;">
						<a href="index.html"><img alt="" src="images/logo.png"
							style="position: absolute;"></a>
						<p style="color:white;margin-left:55px;margin-top: 10px;">爱生活，爱旅行</p>
					</div>
					<!-- NAVIGATION MENU -->
					<div class="collapse navbar-collapse " id="myNavbar"
						style="width:100%;margin-left: 100px;">
						<ul class="nav navbar-nav">
							<li><a href="index.html ">主页</a></li>
							<li><a href="family-package.html ">旅游</a></li>
							<li><a href="hotels-list.html ">酒店</a>
							<li><a href="blog.html ">轰趴</a></li>
							<li><a href="places.html ">农家乐</a></li>
							<li><a href="contact.html ">联系我们</a></li>
						</ul>
					</div>
					<!--描述：搜索框-->
					<div class="col-lg-6">
						<div class="input-group" style="margin-top: 9px;">
							<input type="text" class="form-control" placeholder="搜索...">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button">搜索</button>
							</span>
						</div>
						<!-- /input-group -->
					</div>
					<!--====== HELP LINE & EMAIL ID ==========-->
					<div class="col-md-3 col-sm-4 col-xs-4 head_right head_right_all">
						<ul>
							<li>
								<div class="dropdown ">
									<button class="dropbtn "
										style="width: 80px; margin-top: 10px;margin-left: 20px;">个人中心</button>
									<div class="dropdown-content " style="margin-left: 130px; ">
										<a href="# "><i class="fa fa-sign-in " aria-hidden="true "></i>登录</a>
										<a href="# "><i class="fa fa-address-book-o "
											aria-hidden="true "></i> 注册</a> <a href="# "><i
											class="fa fa-bookmark-o " aria-hidden="true "></i> 个人中心</a> <a
											href="# "><i class="fa fa-umbrella " aria-hidden="true "></i>我的订单</a>
										<a href="# "><i class="fa fa-bed " aria-hidden="true "></i>账单</a>
										<a href="# "><i class="fa fa-ban " aria-hidden="true "></i>
											我的消息</a>

									</div>
								</div>
							</li>
						</ul>
					</div>
					<div style="margin-left:20px; width: 180px;" id="loaction">
						<div class="glyphicon glyphicon-map-marker"
							style="margin-top: 15px;"></div>
					</div>
				</div>
				</nav>
			</div>

		</div>
		</div>

	</section>
	<div class="banner-bootom-w3-agileits">

		<div class="container">
			<h3 class="tittle-w3l">
				商品详细 <span class="heading-style"> <i></i> <i></i> <i></i>
				</span>
			</h3>
			<!-- tittle heading -->
			<%
				List<HotelInfoPictureBean> spot = (List<HotelInfoPictureBean>) request.getAttribute("spot");
				List<RoomInfoBean> room = (List<RoomInfoBean>) request.getAttribute("room");
			%>
			<!-- //tittle heading -->
			<div class="col-md-5 single-right-left " style="margin-top:20px;">
				<div id="myCarousel" data-ride="carousel" data-interval="4000"
					class="sui-carousel slide">
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<%
							for (int i = 1; i < spot.size(); i++) {
						%>
						<li data-target="#myCarousel" data-slide-to="<%=i%>"></li>
						<%
							}
						%>
					</ol>
					<div class="carousel-inner">
						<%
							for (int i = 0; i < spot.size(); i++) {
						%>
						<div class="active item">
							<img src="<%=spot.get(i).getPicture()%>" data-imagezoom="true"
								class="img-responsive" alt="">
						</div>
						<%
							}
						%>
					</div>
					<a href="#myCarousel" data-slide="prev"
						class="carousel-control left">‹</a><a href="#myCarousel"
						data-slide="next" class="carousel-control right">›</a>
				</div>
			</div>
			<div class="col-md-6 col-sm-6 col-xs-12 p2" style="margin-left: 50px">

				<h3>
					<%=spot.get(0).getHotelName()%>(<%=spot.get(0).getCityName()%>)<span><i
						class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star"
						aria-hidden="true"></i><i class="fa fa-star" aria-hidden="true"></i><i
						class="fa fa-star" aria-hidden="true"></i> <i
						class="fa fa-star-half-o" aria-hidden="true"></i></span>
				</h3>
				<%
					for (int i = 0; i < spot.size(); i++) {
				%>
				<p><%=room.get(i).getRoomType()%></p>
				<div class="ticket">
					<ul>
						<li>门票状态 :<%=room.get(i).getRoomState()%></
						</li>
						<li>成人票价格 :<%=room.get(i).getRoomPrice()%></
						</li>
						<li>学生票/老人票价格 :<%=room.get(i).getRoomPrice()%></
						</li>
					</ul>
				</div>
				<div class="ticket">
					<ul>
						<li>营业时间 :夏 8:00~7:00</li>
						<li>冬 8:30~6:00</li>
					</ul>
				</div>

				<div class="p2_book">
					<ul>
						<li><a href="booking.html" class="link-btn">立即预定</a></li>
						<li><a href="tour-details.html" class="link-btn">更多优惠</a></li>
					</ul>
				</div>
				<%
					}
				%>
				<div class="featur">
					<h4>
						当前热度：<%=spot.get(0).getHotelLevel()%>&nbsp 排名 1
					</h4>
					<span class="glyphicon glyphicon-phone-alt">&nbsp咨询电话：<%=spot.get(0).getHotelPhone()%></span>
				</div>
			</div>

		</div>
		<div class="clearfix"></div>
	</div>

	<button id="J_addsuppliers" data-toggle="modal"
		data-target="#J_addsuppliersDialog" data-width="large"
		data-backdrop="static" class="sui-btn btn-primary">添加供应商</button>
	<div id="J_addsuppliersDialog" tabindex="-1" role="dialog"
		class="sui-modal alert fade modal-dialog" style="background: ">
			<div class="modal-content" style="width: 100%;height: 100%">
				<div class="modal-header">
					<button type="button" data-dismiss="modal" aria-hidden="true"
						class="sui-close">×</button>
					<h4 id="myModalLabel" class="modal-title">供应商收编</h4>
				</div>
				<div class="modal-body sui-form form-horizontal">
					<div class="sui-msg msg-block msg-default msg-tips">
						<div class="msg-con">以下为供销平台上已经获得小二授权经营您的品牌但还未被您进行收编的供应商</div>
						<s class="msg-icon"></s>
					</div>
					<table class="sui-table table-bordered-simple">
						<thead>
							<tr>
								<th>供应商昵称</th>
								<th>公司名称</th>
								<th>供应商类型</th>
								<th>分销商数量</th>
								<th>授权品牌</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><span>only淘宝商城官方旗舰店</span></td>
								<td><span>九牧官方旗舰店</span></td>
								<td><span>企业</span></td>
								<td><span class="distributor-num">432</span></td>
								<td>
									<ul class="authorize-brand">
										<li>海尔</li>
										<li>统帅</li>
									</ul>
								</td>
								<td data-supplierid="111">
									<button class="sui-btn btn-small J_addOneSupplier">添加</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>


</body>


</html>