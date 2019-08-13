package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.HotelInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.HotelInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelInfoService;

public class HotelInfoServiceImpl implements HotelInfoService{

	private HotelInfoDao HotelDao=new HotelInfoDaoImpl();  
	
	@Override
	public HotelInfoBean getHotelInfo(int HotelId) {
			HotelInfoBean hi=HotelDao.getHotelInfoById(HotelId);	
		return hi;
	}

	



}
