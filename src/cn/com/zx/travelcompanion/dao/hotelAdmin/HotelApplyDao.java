package cn.com.zx.travelcompanion.dao.hotelAdmin;
//写入酒店的申请信息
public interface HotelApplyDao {
	public boolean 	insertApply( 
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
