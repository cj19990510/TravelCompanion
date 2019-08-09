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
	    	 console.log(data);
	    	 $.head.poster(data);
	     }
	})
	$.head={
		poster:function(e){
			
			
			var obj = eval('(' + e + ')');
			$.each(obj,function(i,item){
				$('img[name="ima"]')[i].attr('src',item.picture); 
				
			})
		}
	}
})