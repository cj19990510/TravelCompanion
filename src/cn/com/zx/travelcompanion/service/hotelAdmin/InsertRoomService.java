package cn.com.zx.travelcompanion.service.hotelAdmin;

public interface InsertRoomService {
	//ͨ插入房间信息 通过类型自增
	public Boolean insertRoomByHotel(int hotelId,String roomType,String roomPrice);
	
}
