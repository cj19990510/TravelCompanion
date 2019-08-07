package cn.com.zx.travelcompanion.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.daoimp.UserInfoDaoImp;

public class UserInfoDao extends JdbcTemplate implements UserInfoDaoImp{
	@Override
	public UserInfoBean getUserName(String userName){
		String sql="select * from userinfo where username=?";
		List<UserInfoBean> list=new ArrayList<UserInfoBean>();
		Object[] params=new Object[]{userName};
		try {
			list=this.queryForList(new RowMapper<UserInfoBean>(){
				public UserInfoBean mappingRow(ResultSet rs,int rownum){
					UserInfoBean userInfo=new UserInfoBean();
					userInfo.setUserName("userName");
					userInfo.setUserPassword("userPassword");
					userInfo.setUserPhone("userPhone");
					userInfo.setUserPicture("userPicture");
					return userInfo;
				}			
			}, sql, params);
		} catch (ClassNotFoundException|SQLException|IOException e) {	
			e.printStackTrace();
		}
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else
		   return null;
	}
}
