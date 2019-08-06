package cn.com.zx.travelcompanion.daoimp;

import java.util.List;

import cn.com.zx.travelcompanion.bean.HotelInfoBean;

public interface HotelInfoDaoImp {

		//添加酒店信息
		public int addHotelInfo(HotelInfoBean hotel);
		//更新酒店信息
		public int updateHotelInfo(HotelInfoBean hotel);
		//删除酒店信息
		public int deleteHotelInfo(HotelInfoBean hotel);
		//按城市查询酒店信息
		public List<HotelInfoBean> getHotelInfo(String type, String city);
		List<HotelInfoBean> getHotelInfo(String type);

}
