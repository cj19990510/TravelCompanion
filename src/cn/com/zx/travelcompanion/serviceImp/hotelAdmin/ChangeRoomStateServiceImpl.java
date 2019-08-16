package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.dao.hotelAdmin.RoomInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.RoomInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.ChangeRoomStateService;

public class ChangeRoomStateServiceImpl implements ChangeRoomStateService{
    RoomInfoDao rid=new RoomInfoDaoImpl();
	//更改状态为住满
	public Boolean changeRoomState(int roomid) {
		// TODO Auto-generated method stub
		return rid.changeRoomState(roomid, "住满");
		
	}
	
}
