/**
 * 主页js方法
 */
$(document).ready(function(){
	$.ajax({
	     type:"post",
	     url:"HotelInfoGetInfoServlet",
	     data:{
	    	 type:"景点" 
	     },
	     success:function(data){
	    	 console.log(data);
	     }
	})
})