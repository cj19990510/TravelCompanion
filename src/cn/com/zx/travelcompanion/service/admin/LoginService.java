package cn.com.zx.travelcompanion.service.admin;

import cn.com.zx.travelcompanion.bean.Admin;
import cn.com.zx.travelcompanion.dao.admin.loginDao;
import cn.com.zx.travelcompanion.daoimp.admin.LoginDaoImpl;

public class LoginService {

	public Admin getAdmin(String adminid, String password) {
		loginDao loginDao=new LoginDaoImpl();
		return loginDao.getAdmin(adminid, password);
	}
	

}
