/**
 * 
 */
 var ac=1;
$(document).ready(function() {
	$.ajax({
		type : "post",
		url : "HotelInfoGetInfo1Servlet",
		data : {
			type : "景点",
			number :ac,
		},
		success : function(data) {
			$.head.poster(data,0);
			ac=ac+1;
		}
	})
	$.head = {
		poster : function(e,j) {
			var obj = eval('('+e+')');
			$.each(obj,function(i,item){
				$("#inner-page-title").append("<div class='col-md-4 col-sm-6 col-xs-12 b_packages ' name='spot' onclick='turnToSpot(this)'>"+
						"<div class='v_place_img '><img src='images/t4.png ' alt='Tour Booking 'title='Tour Booking ' name='im' style='height:220px;width: 200px'/>"
						+"</div><div class='b_pack rows '><div class='col-md-8 col-sm-8 '><h4>"
						+"<a href='tour-details.html' name='aa'></a></h4></div><div class='col-md-4 col-sm-4 pack_icon '>"
						+"<ul><li><a href='# '><img src='images/clock.png 'alt='Date '  title='景区热度排名' name='spotLevel'/> </a></li>"
						+"<li><a href='# '><img src='images/info.png '"
							+"				alt='Details ' title='查看详情' name='spotInfomation'/> </a></li>"
						+"			<li><a href='# '><img src='images/price.png '"
						+"					alt='Price ' title='价格详细' name='spotPrice'/> </a></li>"
						+"			<li><a href='# '><img src='images/map.png '"
						+"					alt='Location ' title='咨询热线 ' name='spotPhone'/> </a></li>"
						+"		</ul></div></div></div>")
				$($("div[name='spot']")[j+i]).attr('id', item.hotelId);
				$($("img[name='im']")[j+i]).attr('src', item.picture);
				$($("img[name='spotLevel']")[j+i]).attr('title', "景区排名：" + item.hotelLevel);
				$($("img[name='spotInfomation']")[j+i]).attr('title', "景区介绍：" + item.hotelInfomation);
				$($("img[name='spotPrice']")[j+i]).attr('title', "请点击查询查看详细：");
				$($("img[name='spotPhone']")[j+i]).attr('title', "景区电话：" + item.hotelPhone);
				$($("a[name='aa']")[j+i]).text(item.hotelName);
				$($("a[name='aa']")[j+i]).append("<span class='v_pl_name'>(" + item.cityName + ")</span>")

			})
		}
	}

})
function turnToSpot(e) {
	window.location.href = "GetDetailSpotServlet?hotelId=" + e.id;
}
$(window).scroll(function() {
	var h = $(document.body).height(); //网页文档的高度
	var c = $(document).scrollTop(); //滚动条距离网页顶部的高度
	var wh = $(window).height(); //页面可视化区域高度

	if (Math.ceil(wh + c) >= h) {
		ac = ac + 1;
		$.ajax({
			type : "post",
			url : "HotelInfoGetInfo1Servlet",
			data : {
				type : "景点",
				number :ac,
			},
			success : function(data) {
				$.head.poster(data,ac-1);
			}
		})
	}
})