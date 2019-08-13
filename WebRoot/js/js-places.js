/**
 * 
 */
$(document).ready(function(){
/*	alert(111);
	var map = new BMap.Map("container");
	var point = new BMap.Point(116.3964,39.9093);
	map.centerAndZoom(point,13);
	map.enableScrollWheelZoom();
	//定位到当前位置
	var geolocation = new BMap.Geolocation();
	geolocation.getCurrentPosition(function(r){
		if(this.getStatus() == BMAP_STATUS_SUCCESS){
			var mk = new BMap.Marker(r.point);
			map.addOverlay(mk);
			map.panTo(r.point);
			var city=r.address.city;
			$("#loaction").append(city)
		}
		else {
			alert('failed'+this.getStatus());
		}        
	});*/
	//获得用户信息
/*	$.ajax({
	     type:"post",
	     url:"getUserInfoServlet",
	     data:{
	    	 type:"景点" 
	     },
	     success:function(data){
	    	if(data==0){
	    		$("#login").css("display","none")
	    		$("#regin").css("display","none")
	    	}
	    	else{
	    		$(document).click(function(){
	    			window.location.href="login.html";
	    		})
	    	}
	     }
	})*/
	//获得景点信息
	$.ajax({
	     type:"post",
	     url:"HotelInfoGetInfoServlet",
	     data:{
	    	 type:"景点" 
	     },
	     success:function(data){
	    	 $.head.poster(data);
	     }
	})
	$.head={
		poster:function(e){
			var obj = eval('(' + e + ')');
			$.each(obj,function(i,item){
				$($("div[name='spot']")[i]).attr('id',item.hotelId);
				$($("img[name='im']")[i]).attr('src',item.picture);
				$($("img[name='spotLevel']")[i]).attr('title',"景区排名："+item.hotelLevel);
				$($("img[name='spotInfomation']")[i]).attr('title',"景区介绍："+item.hotelInfomation);
				$($("img[name='spotPrice']")[i]).attr('title',"请点击查询查看详细：");
				$($("img[name='spotPhone']")[i]).attr('title',"景区电话："+item.hotelPhone);
				$($("a[name='aa']")[i]).text(item.hotelName);
				$($("a[name='aa']")[i]).append("<span class='v_pl_name'>("+item.cityName+")</span>")
				
			})
		}
	}

	})
		function turnToSpot(e){
		window.location.href="GetDetailSpotServlet?hotelId="+e.id;
	}