package cn.com.zx.travelcompanion.service.hotelAdmin;

//统计全部房间
//获取空房间
//获取不同类型空房间

public interface TongJiRoomService {
	public int getAllRoom(int hotelId);
	public int getEmptyRoom(int hotelId, String state);
}
