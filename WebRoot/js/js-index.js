/**
 * 主页js方法
 */
$(document).ready(function(){
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
	});
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
		$.ajax({
	     type:"post",
	     url:"HotelInfoLevelServlet",
	     data:{
	    	 type:"景点" 
	     },
	     success:function(data){
	    	 $.spotLevel.poster(data);
	     }
	})
	$.head={
		poster:function(e){
			var obj = eval('(' + e + ')');
			$.each(obj,function(i,item){
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
	$.spotLevel={
		poster:function(e){
			console.log(e)
			var obj = eval('(' + e + ')');
			$.each(obj,function(i,item){
				var c=Number(i)+Number(1);
				$("#myTablebody").append("<tr><td>"+c+
				"</td><td><img src='"+item.picture+"'/>"+
				"<a href=''class='events-title'>"+item.hotelName+"</a></td>"+
				"<td class='e_h1 '>"+item.hotelLevel+"</td>"+
				"<td class='e_h1 '>"+item.hotelPhone+"</td>"+
				"<td class='e_h1 '>"+item.cityName+"</td>"+
				"<td><a href=''booking.html' class='link-btn'>查看详细</a></td></tr>"
			)
			})
		}
	}
})