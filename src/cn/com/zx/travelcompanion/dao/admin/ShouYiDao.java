package cn.com.zx.travelcompanion.dao.admin;

import java.text.ParseException;

public interface ShouYiDao {

	public int month(String stime,String etime);
	
	public int months(String stime,String etime);

	public int chaxun(String time)throws ParseException;
}
