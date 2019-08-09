package cn.com.zx.travelcompanion.bean;

import java.sql.Timestamp;

//记录信息
public class SearchInfoBean {
	private int searchId;//记录id
	private int hotelId;//酒店id
	private int cityId;//城市id
	private Timestamp searchtime;//
	
	public Timestamp getSearchtime() {
		return searchtime;
	}
	public void setSearchtime(Timestamp searchtime) {
		this.searchtime = searchtime;
	}
	public int getSearchId() {
		return searchId;
	}
	public void setSearchId(int searchId) {
		this.searchId = searchId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
}
