package cn.com.zx.travelcompanion.service.admin;

import java.text.ParseException;
import java.util.List;

import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.dao.admin.DingDanDao;
import cn.com.zx.travelcompanion.daoimp.admin.DingDanDaoImpl;

public class DingDanService {

	public List<OrderInfoBean> chaXunDan(String time,int currentPage) throws ParseException {
	   DingDanDao dingDanDao=new DingDanDaoImpl();
	   return dingDanDao.chaXunDan(time,currentPage);
	
	}
	
	public int totapage(String time) throws ParseException{
		 DingDanDao dingDanDao=new DingDanDaoImpl();
		   return dingDanDao.totalPage(time);
	}
}
