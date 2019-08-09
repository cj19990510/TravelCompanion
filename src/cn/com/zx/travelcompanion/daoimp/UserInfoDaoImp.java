package cn.com.zx.travelcompanion.daoimp;

import cn.com.zx.travelcompanion.bean.UserInfoBean;

public interface UserInfoDaoImp {
     /**
 	 * 根据userName获取用户信息
 	 */
 	 public UserInfoBean getUserInfoByuserName(String userName,String userPassword);
 	 
 	 //修改个人信息
 	 public int updateUserInfo(UserInfoBean userinfo);	
}
