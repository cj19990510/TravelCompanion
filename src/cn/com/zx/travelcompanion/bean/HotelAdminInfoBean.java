package cn.com.zx.travelcompanion.bean;

//酒店管理员信息
public class HotelAdminInfoBean {
	public int hotelAdminId;//酒管id	
	public String hotelAdminName;//酒管名
    public String hotelAdminPsw;//酒管密码
    private int hotelId;
    
    
    public int getHotelAdminId() {
		return hotelAdminId;
	}
	public void setHotelAdminId(int hotelAdminId) {
		this.hotelAdminId = hotelAdminId;
	}
	public String getHotelAdminName() {
		return hotelAdminName;
	}
	public void setHotelAdminName(String hotelAdminName) {
		this.hotelAdminName = hotelAdminName;
	}
	public String getHotelAdminPsw() {
		return hotelAdminPsw;
	}
	public void setHotelAdminPsw(String hotelAdminPsw) {
		this.hotelAdminPsw = hotelAdminPsw;
	}
	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		// TODO Auto-generated method stub
		this.hotelId= hotelId;
	}

}
