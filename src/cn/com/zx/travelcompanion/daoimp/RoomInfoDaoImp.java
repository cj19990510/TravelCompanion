package cn.com.zx.travelcompanion.daoimp;

import java.util.List;

import cn.com.zx.travelcompanion.bean.RoomInfoBean;

public interface RoomInfoDaoImp {
	public List<RoomInfoBean> getspot(String hotelid);
}
