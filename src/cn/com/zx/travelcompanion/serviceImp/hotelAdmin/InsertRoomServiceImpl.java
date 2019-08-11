package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.dao.hotelAdmin.RoomInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.RoomInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.InsertRoomService;

public class InsertRoomServiceImpl implements InsertRoomService{
      RoomInfoDao ri=new RoomInfoDaoImpl();
      
	@Override
	public Boolean insertRoomByHotel(int hotelId,String roomType,String roomPrice,String roomState) {
		Boolean  rib=ri.insertRoomInfoBean(hotelId, roomType, roomPrice, roomState);
		return rib;
	}

}
