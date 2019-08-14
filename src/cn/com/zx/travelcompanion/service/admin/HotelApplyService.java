package cn.com.zx.travelcompanion.service.admin;

import cn.com.zx.travelcompanion.dao.admin.HotelApplyDao;
import cn.com.zx.travelcompanion.daoimp.admin.HotelApplyDaoImpl;

public class HotelApplyService {

	public void insert(String applyId,String hotelName,String hotelPhone,String hotelInfomation,
			String type,int cityid){
		HotelApplyDao hotelApplyDao=new HotelApplyDaoImpl();
		 hotelApplyDao.insert(applyId, hotelName, hotelPhone, hotelInfomation, type, cityid);
	}
	
	public void delete(String applyid){
		HotelApplyDao hotelApplyDao=new HotelApplyDaoImpl();
         hotelApplyDao.delete(applyid);
	}
}
