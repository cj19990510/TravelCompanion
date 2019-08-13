package cn.com.zx.travelcompanion.dao.hotelAdmin;


import cn.com.zx.travelcompanion.bean.HotelInfoBean;


public interface HotelInfoDao {
	//通过酒店id获取酒店信息	
	public HotelInfoBean getHotelInfoById(int hotelId);
	
	
}
