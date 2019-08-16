package cn.com.zx.travelcompanion.service.hotelAdmin;

import cn.com.zx.travelcompanion.bean.CityInfoBean;

public interface CityService {
	public int Cityid(String city);
	public boolean cityInsert(String city,String pro);
	public CityInfoBean getCityById(int cityId);
}
