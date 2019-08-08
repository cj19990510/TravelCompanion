package cn.com.zx.travelcompanion.service.admin;

import java.util.List;

import cn.com.zx.travelcompanion.dao.admin.DingDanDao;
import cn.com.zx.travelcompanion.daoimp.admin.DingDanDaoImpl;

public class DingDanService {

	public List chaXunDan(String time) {
	   DingDanDao dingDanDao=new DingDanDaoImpl();
	   return dingDanDao.chaXunDan(time);
	
	}
}
