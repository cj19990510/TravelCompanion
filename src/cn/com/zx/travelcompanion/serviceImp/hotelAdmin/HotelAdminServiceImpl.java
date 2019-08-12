package cn.com.zx.travelcompanion.serviceImp.hotelAdmin;

import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.HotelAdminInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.HotelAdminInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelAdminService;

public class HotelAdminServiceImpl implements HotelAdminService{
	
	
	private HotelAdminInfoDao adminDao=new HotelAdminInfoDaoImpl();
			
		
	public HotelAdminInfoBean getHotelAdminInfo(String id, String password) {  //ssesion存储的id 账号
		HotelAdminInfoBean ha=adminDao.getHotelAI(id);
//		HotelAdminInfoBean hai = HotelAdminInfoDao.("accountId");//hai酒店管理员账号
		if(ha == null) {
			System.out.println("此账号不存在");
		}
		System.out.println(ha.getHotelAdminPsw());
		if(!(ha.getHotelAdminPsw().equals(password))) {
			System.out.println("密码不正确");
		}
		return ha;	
		
	}



	@Override
	public HotelAdminInfoBean getHotelAdminInfoById(String Id) {
		// TODO Auto-generated method stub
	 HotelAdminInfoBean haib=adminDao.getHotelAI(Id);
	 System.out.println("haib是："+haib);
		return haib;
		
	}



	
//	public HotelAdminInfoBean getHotelAdminInfoById(String Id) {
//		// TODO Auto-generated method stub
//	HotelAdminInfoBean haib=adminDao.getUserByName(Id);
//		return haib;
//	}
	
//	public 	HotelAdminInfoBean get(String accountId) {
//		// TODO Auto-generated method stub
//		Account account = accountDao.getAccount(accountId);
//		return account;
//	}





}
