package cn.com.zx.travelcompanion.dao.admin;

import cn.com.zx.travelcompanion.bean.Admin;

public interface loginDao {

	public Admin getAdmin(String adminid, String password);


}
