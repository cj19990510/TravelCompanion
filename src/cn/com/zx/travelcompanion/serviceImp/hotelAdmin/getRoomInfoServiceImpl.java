package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.RoomInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.RoomInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.getRoomInfoService;


public class getRoomInfoServiceImpl implements getRoomInfoService{
     RoomInfoDao rid=new RoomInfoDaoImpl();
	@Override
	public List<RoomInfoBean> getRoomInfo(int hotelId) {
		// TODO Auto-generated method stub
		List<RoomInfoBean> ri=rid.getRoomInfoByHotel(hotelId);
		return ri;
	}
	@Override
	public RoomInfoBean getRoomInfobyRoomid(int roomid) {
		// TODO Auto-generated method stub
		RoomInfoBean ri=rid.getRoomInfoByRoomId(roomid);
		return ri;
	}
	


	
	

}
