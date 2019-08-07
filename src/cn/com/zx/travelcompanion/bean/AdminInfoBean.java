package cn.com.zx.travelcompanion.bean;

//管理员信息
public class AdminInfoBean {
     public int adminId;//管理员id
     public String adminName;//管理员名
     public String adminPassword;//管理员密码
     
     public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
