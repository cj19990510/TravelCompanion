package cn.com.zx.travelcompanion.bean;

public class HotelApply {
	private String hotelName;//	酒店名
	private String hotelPhone;//	酒店电话
	private int cityId;//	所属城市
	private String hotelInfomation;//	酒店信息
	private String type;//	类型
	private String Apply;//	申请内容
	private String licenseNumber;//	营业执照号
	private String licensePicture;//	营业执照图片
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
	public String getApply() {
		return Apply;
	}
	public void setApply(String apply) {
		Apply = apply;
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

}
