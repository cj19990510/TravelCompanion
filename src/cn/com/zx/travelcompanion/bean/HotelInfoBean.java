package cn.com.zx.travelcompanion.bean;

//酒店信息
public class HotelInfoBean {
	@Override
	public String toString() {
		return "HotelInfoBean [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelPhone=" + hotelPhone
				+ ", cityId=" + cityId + ", hotelLevel=" + hotelLevel + ", hotelInfomation=" + hotelInfomation
				+ ", type=" + type + "]";
	}
	public int hotelId;//酒店id
    public String hotelName;//名称
    public String hotelPhone;//酒店电话
    public int cityId;//所属城市
    public int hotelLevel;//酒店排名
    public String hotelInfomation;//酒店信息
    public String type;//类型
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
	public int getCityId() {
		return cityId;
	}
	public void setCityName(int cityId) {
		this.cityId = cityId;
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
    
}
