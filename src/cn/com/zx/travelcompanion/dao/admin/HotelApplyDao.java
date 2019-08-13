package cn.com.zx.travelcompanion.dao.admin;

public interface HotelApplyDao {

	public void insert(String applyId,String hotelName,String hotelPhone,String hotelInfomation,
			String type,int cityid);
	
	public void delete(String applyid);
}
