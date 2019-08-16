package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.dao.hotelAdmin.RoomInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.RoomInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.ChangeRoomStateService;

public class ChangeRoomStateServiceImpl implements ChangeRoomStateService{
    RoomInfoDao rid=new RoomInfoDaoImpl();
	
	public Boolean changeRoomState(int roomid) {
		// TODO Auto-generated method stub
		rid.changeRoomState(roomid, "住满");
		return null;
	}
	
}
