package cn.com.zx.travelcompanion.service.admin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.HotelApply;
import cn.com.zx.travelcompanion.dao.admin.HotelDao;
import cn.com.zx.travelcompanion.daoimp.admin.HotelDaoImpl;

public class HotelService {

    public List<HotelApply> chaxun(){
    	HotelDao hotelDao=new HotelDaoImpl();
    	return hotelDao.chaxun();
    }
	
	public byte[] chaxunPic(String applyid){
		HotelDao hotelDao=new HotelDaoImpl();
    	return hotelDao.chaxunPic(applyid);
	}
}
