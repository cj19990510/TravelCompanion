package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.dao.hotelAdmin.CityDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.CityDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.CityService;

public class CityServiceImpl implements CityService{

	//如果数据库中没有此城市 则加入 如果有则返回id
    CityDao c=new CityDaoImpl();	
	public int Cityid(String city) {
		int a=c.cityId(city).cityId;
		return a;
	}

	public boolean cityInsert(String city, String pro) {
		if(c.cityId(city)!=null)
			return true;
		else
			return c.insertCity(city, pro);			
		
	}
	
}
