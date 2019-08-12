<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

	<head>
		<title>ä¸ªäººä¸­å¿</title>
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
		<script>
			 $(document).ready(function(){
			    
			 	$.ajax({
			 	   type:"post",
			 	   url:"GetUserInfoServlet",
			 	   success:function(data){
			 	      console.log(data);
			 	      var obj=eval('('+data+')');
			 	      console.log("data+"+obj);
			 	      $.each(obj,function(item){
			 	          alert(obj.userName);
			 	         $("#username").val(item.userName);
			 	         $("#userpassword").val(item.userPassword);
			 	         $("#reuserpassword").val(item.userPassword);
			 	         $("#userphone").val(item.userPhone); 
			 	         $("#useremail").val(item.userEmail);
			 	      });
			 	      
			 	      
			 	      
			 	   }
			 	});
			 });
		</script>
		

	</head>
	<body>
		 <div id="preloader">
			<div id="status">&nbsp;</div>
		 </div>
		 <!--==å¯¼èªæ ========== -->
		 <section>
			<div class="rows head" data-spy="affix" data-offset-top="120" style="background-color:#1B6D85">
				<div class="container" style="margin-left: 10px;width: 90%;">
					<div style="display: flex;">
						<!--====== BRANDING LOGO ==========-->
						<div class="col-md-4 col-sm-12 col-xs-12 col-lg-4" style="display: flex;">
							<a href="index.html"><img alt="" src="images/logo.png" style="position: absolute;"></a>
							<p style="color:white;margin-left:60px;margin-top: 10px;">ç±çæ´»ï¼ç±æè¡</p>
						</div>
						<!--
                        	ä½èï¼1875763391@qq.com
                        	æ¶é´ï¼2019-08-06
                        	æè¿°ï¼
                      -->
						<!-- NAVIGATION MENU -->
						<div class="collapse navbar-collapse " id="myNavbar" style="width: 80%;margin-left: 100px;">
							<ul class="nav navbar-nav " >
								<li>
									<a href="index.html " >ä¸»é¡µ</a>
								</li>
								<li>
									<a href="family-package.html ">ææ¸¸</a>
								</li>
								<li>
									<a href="hotels-list.html ">éåº</a>
								<li>
									<a href="blog.html ">è½°è¶´</a>
								</li>
								<li>
									<a href="places.html ">åå®¶ä¹</a>
								</li>
								<li>
									<a href="contact.html ">èç³»æä»¬</a>
								</li>
							</ul>
						</div>
						<!--æè¿°ï¼æç´¢æ¡-->
						<div class="col-lg-6">
							<div class="input-group" style="margin-top: 9px;">
								<input type="text" class="form-control" style="height: 34px;" placeholder="æç´¢...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">æç´¢</button>
								</span>
							</div>
							<!-- /input-group -->
						</div>
						
						<div class="col-md-3 col-sm-4 col-xs-4 head_right head_right_all">
							<ul>
								<li>
									<div class="dropdown ">
										<button class="dropbtn " style="width: 80px; margin-top: 10px;margin-left: 20px;">ä¸ªäººä¸­å¿</button>
										<div class="dropdown-content " style="margin-left: 130px; ">								
											<a href="# "><i class="fa fa-bookmark-o " aria-hidden="true "></i> ä¸ªäººä¸­å¿</a>
											<a href="# "><i class="fa fa-umbrella " aria-hidden="true "></i>æçè®¢å</a>
											<a href="# "><i class="fa fa-bed " aria-hidden="true "></i>è´¦å</a>
											<a href="# "><i class="fa fa-ban " aria-hidden="true "></i> æçæ¶æ¯</a>
											<a href="# "><i class="fa fa-sign-in " aria-hidden="true "></i>éåºè´¦å·</a>	

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
		   <div class="pc-nav-item" style="font-size:20px;"><a href="#" style="font-size:20px;">é¦é¡µ</a> &gt; <a href="#" style="font-size:20px;">ä¸ªäººä¸­å¿ </a></div>
		</div>


		<!-- ä¸ªäººä¸­å¿ begin -->
		<section id="member" style="margin-top:15px;">
		    <div class="member-center clearfix">
		        <div class="member-left fl" >
		            <div class="member-apart clearfix" >
		                <div class="fl"><a href="#"><img src="theme/img/bg/mem.png"></a></div>
		                <div class="fl" style="margin-left:10px;margin-top:10px;">
		                    <p>ç¨&nbsp;&nbsp;æ·ï¼</p>
		                    <p><a href="#">${username}</a></p>
		                    
		                </div>
		            </div>
		            <div class="member-lists" style="margin-top:40px;">
		                <dl style="margin-top:40px;font-size:100px;">
		                    <dt>ä¸ªäººä¸­å¿</dt>
		                    <dd class="cur"><a href="#">æçä¿¡æ¯</a></dd>
		                    <dd><a href="#">æçè®¢å</a></dd>
		                    
		                    <dd><a href="#">æçè¯è®º</a></dd>
		                    
		                   
		                </dl>
		                <dl>
		                    <dt>å®¢æ·æå¡</dt>
		                    <dd><a href="#">éè´§ç³è¯·</a></dd>
		                    <dd><a href="#">éè´§/éæ¬¾è®°å½</a></dd>
		                </dl>
		                
		            </div>
		        </div>
		        <div class="member-right fr">
		            <div class="member-head">
		                <div class="member-heels fl"><h3>&nbsp;ä¿®æ¹ä¸ªäººä¸­å¿</h3></div>
		                
		            </div>
		            <div class="member-border">
		               <div class="member-order">
		                  
		                   <dl class="member-custom clearfix ">
		                       <dt>
                                  
		                            <b>ç¨æ·åï¼&nbsp;&nbsp;&nbsp;&nbsp;</b>
		                            <input type="text" name="username" id="username" >
		                            <span ></span>
                               </dt>
		                      
		                   </dl>
		                   <dl class="member-custom clearfix ">
		                       <dt>
		                         
		                             <b>ç¨æ·å¯ç ï¼</b>
		                             <input type="password" name="userpassword" id="userpassword"  >  
		                             <span ></span>                              
		                       </dt>
		                      
		                   </dl>
		                   <dl class="member-custom clearfix ">
		                       <dt>
		                             <b>éè¾å¯ç ï¼</b>
		                             <input type="password" name="reuserpassword" id="reuserpassword" > 
		                             <span ></span>                                   
		                       </dt>		                      
		                   </dl>
		                   <dl class="member-custom clearfix ">
		                       <dt>
		                             <b>ç¨æ·ææºï¼</b>
		                             <input type="text" name="userphone" id="userphone" >
		                             <span ></span>                                  
		                       </dt>		                      
		                   </dl>
		                   <dl class="member-custom clearfix ">
		                       <dt>
		                              <b>ç¨æ·é®ç®±ï¼</b>
		                             <input type="text" name="useremail" id="useremail"  > 
		                             <span ></span>                                
		                       </dt> 
		                   </dl>
		                   <div style="margin-left:200px;height:50px;">
		                        <button style="height:30px;font-size:20px;background:#AFEEEE">ç¡®å®ä¿®æ¹</button>
		                        <button style="margin-left:100px;height:30px;font-size:20px;background:#AFEEEE;width:80px;">åæ¶</button>
		                   </div>
          
		               </div>
		            </div>
		           
		        </div>
		    </div>
		</section>
     
		
		

	</body>

</html>
