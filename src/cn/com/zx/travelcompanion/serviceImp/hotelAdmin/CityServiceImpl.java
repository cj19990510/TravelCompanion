package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.bean.CityInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.CityDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.CityDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.CityService;

public class CityServiceImpl implements CityService{

	//如果数据库中没有此城市 则加入 如果有则返回id
    CityDao cd=new CityDaoImpl();	
	public int Cityid(String city) {
		int a=cd.cityId(city).cityId;
		return a;
	}

	public boolean cityInsert(String city, String pro) {
		if(cd.cityId(city)!=null)
			return true;
		else
			return cd.insertCity(city, pro);			
		
	}

	@Override
	public CityInfoBean getCityById(int cityId) {
		CityInfoBean ci=cd.cityInfo(cityId);
		return ci;
	}
	
}
