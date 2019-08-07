package cn.com.zx.travelcompanion.daoimp;

import cn.com.zx.travelcompanion.bean.UserInfoBean;

public interface UserInfoDaoImp {
     /**
 	 * 根据userName获取用户信息
 	 */
 	 public UserInfoBean getUserName(String userName);
}
