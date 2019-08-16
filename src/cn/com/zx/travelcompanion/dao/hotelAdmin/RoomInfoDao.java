package cn.com.zx.travelcompanion.dao.hotelAdmin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.RoomInfoBean;

public interface RoomInfoDao {
  //获取房间信息
  //改变房间状态
  //添加房间信息״̬
  public List<RoomInfoBean> getRoomInfoByHotel(int hotelId);
  public Boolean changeRoomState(int roomId, String roomState);
  public Boolean insertRoomInfoBean(int hotelId,String roomType,String roomPrice) ;
  
  public RoomInfoBean getRoomInfoByRoomId(int roomId);
}
