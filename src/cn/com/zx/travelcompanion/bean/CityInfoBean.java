package cn.com.zx.travelcompanion.bean;

//城市信息
public class CityInfoBean {
	public int cityId;//城市id
	public String cityName;//城市名
    public String province;//所属省（国家）
    public int cityLevel;//城市排名
    
    public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getCityLevel() {
		return cityLevel;
	}
	public void setCityLevel(int cityLevel) {
		this.cityLevel = cityLevel;
	}
	
}
