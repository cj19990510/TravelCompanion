package cn.com.zx.travelcompanion.dao.admin;

import java.text.ParseException;
import java.util.List;

import cn.com.zx.travelcompanion.bean.OrderInfoBean;

public interface DingDanDao {

	public List<OrderInfoBean> chaXunDan(String time,int currentPage) throws ParseException;
	
	public int totalPage(String time)throws ParseException;
}
