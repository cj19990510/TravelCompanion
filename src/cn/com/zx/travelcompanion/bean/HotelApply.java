package cn.com.zx.travelcompanion.bean;

public class HotelApply {
	private int applyId;
	private String hotelName;//	酒店名
	private String hotelPhone;//	酒店电话
	private int cityId;//	所属城市
	private String hotelInfomation;//	酒店信息
	private String type;//	类型
	private String apply;//	申请内容
	private String licenseNumber;//	营业执照号
	private String licensePicture;//	营业执照图片
	private String cityName;
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
	public void setCityId(int cityId) {
		this.cityId = cityId;
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
	
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLicensePicture() {
		return licensePicture;
	}
	public void setLicensePicture(String licensePicture) {
		this.licensePicture = licensePicture;
	}
	public int getApplyId() {
		return applyId;
	}
	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}
	public String getApply() {
		return apply;
	}
	public void setApply(String apply) {
		this.apply = apply;
	}
	@Override
	public String toString() {
		return "HotelApply [applyId=" + applyId + ", hotelName=" + hotelName + ", hotelPhone=" + hotelPhone
				+ ", cityId=" + cityId + ", hotelInfomation=" + hotelInfomation + ", type=" + type + ", apply=" + apply
				+ ", licenseNumber=" + licenseNumber + ", licensePicture=" + licensePicture + ", cityName=" + cityName
				+ "]";
	}
	
	

}
