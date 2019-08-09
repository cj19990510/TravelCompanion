package cn.com.zx.travelcompanion.bean;

public class UserInfoBean {
	private  int userId;//用户id
    private  String userName;//用户名
    private  String userPassword;//用户密码
    private  String userPhone;//用户手机号
    private  String userPicture;//用户头像
    private  String userEmail;//用户邮箱
    
    public UserInfoBean(){
    	
    }
    public UserInfoBean(int userId, String userName, String userPassword, String userPhone, String userPicture,
			String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userPicture = userPicture;
		this.userEmail = userEmail;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPicture() {
		return userPicture;
	}
	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}
       
}
