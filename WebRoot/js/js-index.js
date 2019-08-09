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
	    	 $.head.poster(data);
	     }
	})
	$.head={
		poster:function(e){
			var obj = eval('(' + e + ')');
			$.each(obj,function(i,item){
				$("#travel").append;
			       })
		}
	}
})