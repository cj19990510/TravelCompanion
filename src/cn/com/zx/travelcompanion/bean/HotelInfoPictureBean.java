package cn.com.zx.travelcompanion.bean;

import java.util.List;

public class HotelInfoPictureBean {

	public int hotelId;//酒店id
    public String hotelName;//名称
    public String hotelPhone;//酒店电话
    public String cityName;//所属城市
    public int hotelLevel;//酒店排名
    public String hotelInfomation;//酒店信息
    public String type;//类型
    public String picture;//图片
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelPhone() {
		return hotelPhone;
	}
	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getHotelLevel() {
		return hotelLevel;
	}
	public void setHotelLevel(int hotelLevel) {
		this.hotelLevel = hotelLevel;
	}
	public String getHotelInfomation() {
		return hotelInfomation;
	}
	public void setHotelInfomation(String hotelInfomation) {
		this.hotelInfomation = hotelInfomation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "HotelInfoPictureBean [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelPhone=" + hotelPhone
				+ ", cityName=" + cityName + ", hotelLevel=" + hotelLevel + ", hotelInfomation=" + hotelInfomation
				+ ", type=" + type + ", picture=" + picture + "]";
	}
    
}
