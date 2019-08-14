package cn.com.zx.travelcompanion.service.hotelAdmin;

public interface HotelApplyService {
	public Boolean hotelApply( 
	 String hotelName,//	酒店名
	 String hotelPhone,//	酒店电话
	 int cityId,//	所属城市
	 String hotelInfomation,//	酒店信息
	 String type,//	类型
     String apply,//	申请内容
	 String licenseNumber,//	营业执照号
	 String licensePicture//	营业执照图片
	 );
}
