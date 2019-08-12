package cn.com.zx.travelcompanion.dao.admin;

import java.util.List;

import cn.com.zx.travelcompanion.bean.RemarkInfoBean;

public interface ChaPingDao {

	public List<RemarkInfoBean> chaxunName(String hotelName);
	
	public List<RemarkInfoBean> chaxun(String userId);
	
	public String show(String hotelname);
	
	public String show1(String userid);

}
