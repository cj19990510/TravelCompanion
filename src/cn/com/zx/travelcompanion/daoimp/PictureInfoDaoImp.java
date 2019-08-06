package cn.com.zx.travelcompanion.daoimp;

import cn.com.zx.travelcompanion.dao.PictureInfoDao;

public interface PictureInfoDaoImp {
	
	  //获取
      public PictureInfoDao  getPicture(String pictureUrl,String hotelId);
}
