package cn.com.zx.travelcompanion.daoimp;

import java.util.List;

import cn.com.zx.travelcompanion.bean.HotelInfoBean;

public interface HotelInfoDaoImp {
	     //获得景点信息
		public List<HotelInfoBean> getHotelInfo(String type);
		//添加酒店信息
		public int addHotelInfo(HotelInfoBean hotel);
		//
		public int updateHotelInfo(HotelInfoBean hotel);
		public int deleteHotelInfo(HotelInfoBean hotel);

}
