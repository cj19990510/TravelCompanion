package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.RoomInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.RoomInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.TongJiRoomService;



public class TongJiRoomServiceImpl implements TongJiRoomService{

	RoomInfoDao rid=new RoomInfoDaoImpl();
	
	@Override
	public int getAllRoom(int hotelId) {
		List<RoomInfoBean> ri=rid.getRoomInfoByHotel(hotelId);
		return ri.size();
	}

	@Override
	//获取全部房间 
	
	public int getEmptyRoom(int hotelId,String state) {
		List<RoomInfoBean> ri=rid.getRoomInfoByHotel(hotelId);
		int count=0;
	for(int i=0;i<ri.size();i++)
	{
		if(ri.get(i).getRoomState().equals(state))
		{
		count++;	
		}
	}
	    return count;
		
	}
	//获取空房间
	public int getEmRoom(int hoteId)
	{
		List<RoomInfoBean> ri=rid.getRoomInfoByHotel(hoteId);
		
		int count=0;
		for(int i=0;i<ri.size();i++)
		{
			if(ri.get(i).getRoomState().equals("空闲"));
			{
			count++;	
			}
		}
		return count;
	}

}
