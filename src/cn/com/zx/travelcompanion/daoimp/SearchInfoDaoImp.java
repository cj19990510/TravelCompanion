package cn.com.zx.travelcompanion.daoimp;

import java.sql.Timestamp;

public interface SearchInfoDaoImp {
	public int getSerchInfoNumber(String type,int id);
	public Timestamp getSerchInfoTime(String type,int id);
	public int addSerchInfo(int hotelId,int Cityid,Timestamp time);

}
