/**
 * 
 */
function cc(){
	var c=$("#order").find("span")[1].id;
	var b=$("#order").find("span")[0].id;
	var a=$("#order").find("span")[2].id;
	$.ajax({
	     type:"post",
	     url:"OrderInsertServlet",
	     data:{
	    	 hotelId:b,
	    	 roomId:c,
	    	 money:a,
	     },
	     success:function(data){
	    	window.location.href="OrderInfoPages";
	    	alert("购买成功，请去我的订单查看");
	     }
	})
}