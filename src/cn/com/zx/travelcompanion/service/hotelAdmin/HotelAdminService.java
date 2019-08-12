package cn.com.zx.travelcompanion.service.hotelAdmin;

import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;

public interface HotelAdminService {
 //获取酒店管理员信息
		
	public HotelAdminInfoBean getHotelAdminInfo(String Id, String password);
	
	public HotelAdminInfoBean  getHotelAdminInfoById(String Id);
	
	//public HotelAdminInfoBean getHotelAdminInfoById(String id); //
	
	
	
	}


