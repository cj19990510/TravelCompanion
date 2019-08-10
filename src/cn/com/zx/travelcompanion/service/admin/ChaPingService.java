package cn.com.zx.travelcompanion.service.admin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.RemarkInfoBean;
import cn.com.zx.travelcompanion.dao.admin.ChaPingDao;
import cn.com.zx.travelcompanion.daoimp.admin.ChaPingDaoImpl;

public class ChaPingService {
	
   public List<RemarkInfoBean> chaxunName(String hotelName){
	   ChaPingDao ChaPingDao=new ChaPingDaoImpl();
	   return ChaPingDao.chaxunName(hotelName);
   }
	
	public List<RemarkInfoBean> chaxun(String userId){
		 ChaPingDao ChaPingDao=new ChaPingDaoImpl();
		   return ChaPingDao.chaxun(userId);
	}
	
	public String show(String hotelname){
		ChaPingDao ChaPingDao=new ChaPingDaoImpl();
		return ChaPingDao.show(hotelname);
	}
	
	public String show1(String userid){
		ChaPingDao ChaPingDao=new ChaPingDaoImpl();
		return ChaPingDao.show1(userid);
	}

}
