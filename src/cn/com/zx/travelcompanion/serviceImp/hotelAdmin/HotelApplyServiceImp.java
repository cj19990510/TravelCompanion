package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;


import cn.com.zx.travelcompanion.dao.hotelAdmin.HotelApplyDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.HotelApplyDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelApplyService;

public class HotelApplyServiceImp implements HotelApplyService{
	HotelApplyDao hotelApplyDao=new HotelApplyDaoImpl();
	@Override
	public Boolean hotelApply(String hotelName, String hotelPhone, int cityId, String hotelInfomation,
			String type, String apply, String licenseNumber, String licensePicture) {	
		Boolean ha=hotelApplyDao.insertApply(hotelName, hotelPhone, cityId, hotelInfomation, type, apply, licenseNumber, licensePicture);
		return ha;
		
	}

}
