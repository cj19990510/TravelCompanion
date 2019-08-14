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
<link href="css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/jquery-ui1.css">
<link rel="stylesheet" href="css/flexslider.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/mob.css">
<link rel="stylesheet" href="css/animate.css">
<!--========= Scripts ===========-->
<script src="js/jquery-1.5.1.min.js "></script>
<script src="js/jquery-latest.min.js "></script>
<script src="js/bootstrap.js "></script>
<script src="js/wow.min.js "></script>
<script src="js/respond.min.js "></script>
<script src="html5shiv.js "></script>
<script src="js/custom.js "></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=A6HyQTlMFwu3LzpiUCXg4HdKKSC7OrT4"></script>
</head>
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800"
	rel="stylesheet">
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
			<!-- tittle heading -->

			<!-- //tittle heading -->
			<div class="col-md-5 single-right-left ">
				<div class="grid images_3_of_2">
					<div class="flexslider">
						<ul class="slides">
							<li data-thumb="images/si.jpg">
								<div class="thumb-image">
								<%List<HotelInfoPictureBean> spot=(List<HotelInfoPictureBean>)request.getAttribute("spot");%>
									<img src="<%=spot.get(0).getPicture()%>" data-imagezoom="true"
										class="img-responsive" alt="">
								</div>
							</li>
							<li data-thumb="images/si2.jpg">
								<div class="thumb-image">
									<img src="<%=spot.get(0).getPicture()%>" data-imagezoom="true"
										class="img-responsive" alt="">
								</div>
							</li>
							<li data-thumb="images/si3.jpg">
								<div class="thumb-image">
									<img src="<%=spot.get(0).getPicture()%>" data-imagezoom="true"
										class="img-responsive" alt="">
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-6 col-sm-6 col-xs-12 p2">
				<h3 class="tittle-w3l">
				商品详细 <span class="heading-style"> <i></i> <i></i> <i></i>
				</span>
			</h3>
				<h3>
					武陵源(张家界)<span><i class="fa fa-star" aria-hidden="true"></i>
						<i class="fa fa-star" aria-hidden="true"></i><i class="fa fa-star"
						aria-hidden="true"></i><i class="fa fa-star" aria-hidden="true"></i>
						<i class="fa fa-star-half-o" aria-hidden="true"></i></span>
				</h3>

				<p>武陵源双飞二人游</p>
				<div class="ticket">
					<ul>
						<li>门票状态 :充裕</li>
						<li>成人票价格 :358</li>
						<li>学生票/老人票价格 :218</li>
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
				<p>武陵源双飞二人游</p>
				<div class="ticket">
					<ul>
						<li>门票状态 :充裕</li>
						<li>成人票价格 :358</li>
						<li>学生票/老人票价格 :218</li>
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
												
				<div class="featur">
					<h4>当前热度：2035&nbsp 排名 1</h4>
					<span class="glyphicon glyphicon-phone-alt">&nbsp咨询电话：15211180672</span>
				</div>
			</div>

		</div>
		<div class="clearfix"></div>
	</div>
	</div>
	<script src="js/jquery-2.1.4.min.js"></script>
	<!-- //jquery -->

	<!-- popup modal (for signin & signup)-->
	<script src="js/jquery.magnific-popup.js"></script>
	<script>
		$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
				type : 'inline',
				fixedContentPos : false,
				fixedBgPos : true,
				overflowY : 'auto',
				closeBtnInside : true,
				preloader : false,
				midClick : true,
				removalDelay : 300,
				mainClass : 'my-mfp-zoom-in'
			});
	
		});
	</script>
	<!-- Large modal -->
	<!-- <script>
		$('#').modal('show');
	</script> -->
	<!-- //popup modal (for signin & signup)-->

	<!-- cart-js -->
	<script src="js/minicart.js"></script>
	<script>
		paypalm.minicartk.render(); //use only unique class names other than paypal1.minicart1.Also Replace same class name in css and minicart.min.js
	
		paypalm.minicartk.cart.on('checkout', function(evt) {
			var items = this.items(),
				len = items.length,
				total = 0,
				i;
	
			// Count the number of each item in the cart
			for (i = 0; i < len; i++) {
				total += items[i].get('quantity');
			}
	
			if (total < 3) {
				alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');
				evt.preventDefault();
			}
		});
	</script>

	<!-- smoothscroll -->
	<script src="js/SmoothScroll.min.js"></script>
	<!-- //smoothscroll -->

	<!-- start-smooth-scrolling -->
	<script src="js/move-top.js"></script>
	<script src="js/easing.js"></script>
	<script>
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
	
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- //end-smooth-scrolling -->

	<!-- smooth-scrolling-of-move-up -->
	<script>
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			$().UItoTop({
				easingType : 'easeOutQuart'
			});
	
		});
	</script>
	<!-- FlexSlider -->
	<script src="js/jquery.flexslider.js"></script>
	<script>
		// Can also be used with $(document).ready()
		$(window).load(function() {
			$('.flexslider').flexslider({
				animation : "slide",
				controlNav : "thumbnails"
			});
		});
	</script>
	<script src="js/jquery.flexisel.js"></script>
	<script src="js/bootstrap.js"></script>
</body>


</html>