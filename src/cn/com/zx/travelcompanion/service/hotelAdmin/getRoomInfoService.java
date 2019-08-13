package cn.com.zx.travelcompanion.service.hotelAdmin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.RoomInfoBean;
//获取房间信息
public interface getRoomInfoService {
	public List<RoomInfoBean> getRoomInfo(int hotelId);
}
