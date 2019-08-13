package cn.com.zx.travelcompanion.dao.admin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.HotelApply;

public interface HotelDao {
 
	public List<HotelApply> chaxun();
	
	public byte[] chaxunPic(String applyid);
}
