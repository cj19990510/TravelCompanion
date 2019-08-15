package cn.com.zx.travelcompanion.dao.hotelAdmin;

import cn.com.zx.travelcompanion.bean.CityInfoBean;

public interface CityDao {
	//插入数据库中未保存的城市
	public Boolean insertCity(String city,String prvovince);
	//获取数据库中的城市id 通过此城市名
	public CityInfoBean cityId(String city);
}
