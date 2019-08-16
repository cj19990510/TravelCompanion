package cn.com.zx.travelcompanion.service.hotelAdmin;

import java.math.BigDecimal;
import java.util.List;

import cn.com.zx.travelcompanion.bean.RoomInfoBean;

//统计全部房间
//获取空房间
//获取不同类型空房间

public interface TongJiRoomService {
	public int getAllRoom(int hotelId);
	public int getEmptyRoom(int hotelId, String state);
	public int getEmRoom(int hoteId);
	public int getAllRoomByType(String type,int hotelId);
	public int getEmRoomByType(String type,int hotelId);
	public  BigDecimal getPriceByType(String type,int hoteId);

}
