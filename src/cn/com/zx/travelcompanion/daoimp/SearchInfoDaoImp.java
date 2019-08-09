package cn.com.zx.travelcompanion.daoimp;

import java.sql.Timestamp;

import cn.com.zx.travelcompanion.bean.SearchInfoBean;

public interface SearchInfoDaoImp {
	public int getSerchInfoNumber(String type,int id);
	public Timestamp getSerchInfoTime(String type,int id);
	public  int addSerchInfo(SearchInfoBean search);

}
