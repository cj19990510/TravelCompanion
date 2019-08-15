package cn.com.zx.travelcompanion.service.hotelAdmin;

public interface InrestCity {
	//获取城市id
public int cityId(String id);
//插入数据库没有的城市
public boolean insertCity(String city,String province);
}
