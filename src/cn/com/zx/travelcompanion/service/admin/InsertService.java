package cn.com.zx.travelcompanion.service.admin;

import cn.com.zx.travelcompanion.dao.admin.InsertDao;
import cn.com.zx.travelcompanion.daoimp.admin.InsertDaoImpl;

public class InsertService {

	public long insert(String adminName, String password) {
		InsertDao insertDaoImpl=new InsertDaoImpl();
		return insertDaoImpl.insert(adminName, password);
	}
}
