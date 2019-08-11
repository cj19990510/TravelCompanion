package cn.com.zx.travelcompanion.bean;

public class UserInfoBean {
	private  int userId;//用户id
    private  String userName;//用户名
    private  String userPassword;//用户密码
    private  String userPhone;//用户手机号
    private  String userPicture;//用户头像
    private String count;
    private String countSuccess;
    
    public UserInfoBean(){};
    
    public UserInfoBean(int userId, String userName, String userPassword, String userPhone, String userPicture,String count,String countSuccess) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userPicture = userPicture;
		this.count=count;
		this.countSuccess=countSuccess;
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

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getCountSuccess() {
		return countSuccess;
	}

	public void setCountSuccess(String countSuccess) {
		this.countSuccess = countSuccess;
	}

	@Override
	public String toString() {
		return "UserInfoBean [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", userPicture=" + userPicture + ", count=" + count + ", countSuccess="
				+ countSuccess + "]";
	}
	
	
	
       
}
