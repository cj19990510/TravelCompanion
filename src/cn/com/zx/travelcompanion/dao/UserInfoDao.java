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
	//根据用户名和密码查询用户信息
	public UserInfoBean getUserInfoByuserName(String userName,String userPassword){
		Object[] object=new Object[]{userName,userPassword};
		String sql="select * from userinfo where username=? and userpassword=?";
		List<UserInfoBean> list=new ArrayList<UserInfoBean>();
		try {
			list=this.queryForList(new RowMapper<UserInfoBean>(){
				public UserInfoBean mappingRow(ResultSet rs,int rownum) throws SQLException{
					UserInfoBean userInfo=new UserInfoBean();
					userInfo.setUserName(rs.getString("userName"));
					userInfo.setUserPassword(rs.getString("userPassword"));
					userInfo.setUserPhone(rs.getString("userPhone"));
					userInfo.setUserPicture(rs.getString("userPicture"));
					userInfo.setUserId(rs.getInt("userId"));
					userInfo.setUserEmail(rs.getString("useremail"));
					return userInfo;
				}			
			}, sql, object);
		} catch (ClassNotFoundException|SQLException|IOException e) {	
			e.printStackTrace();
		}
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else
		   return null;
	}
	
	
	//根据用户名查询用户信息
	public  boolean getUserName(String userName){
		Object[] object=new Object[]{userName};
		String sql="select * from userinfo where username=?";
		List<UserInfoBean> list=new ArrayList<UserInfoBean>();
		try{
			list=this.queryForList(new RowMapper<UserInfoBean>(){
				public UserInfoBean mappingRow(ResultSet rs,int rownum) throws SQLException{
					UserInfoBean userinfo=new UserInfoBean();
					userinfo.setUserName(rs.getString("userName"));
					userinfo.setUserPassword(rs.getString("userPassword"));
					userinfo.setUserPhone(rs.getString("userPhone"));
					userinfo.setUserPicture(rs.getString("userPicture"));
					userinfo.setUserId(rs.getInt("userId"));
					userinfo.setUserEmail(rs.getString("useremail"));
					return userinfo;
				}
			}, sql, object);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(list.isEmpty()){
			return false;
		}else
		return true;
	}
	
	//用户注册
	public int userRegister(String userName,String userPassword,String userPhone,String userEmail){
		Object object[]=new Object[]{userName,userPassword,userPhone,userEmail};
		String sql="insert into userinfo(username,userpassword,userPhone,userEmail) values(?,?,?,?)";
		int i=0;
		try{
			i=this.set(sql, object);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}
	
	@Override
	 public int updateUserInfo(UserInfoBean userinfo){		
		 int userid=userinfo.getUserId();
		 String username=userinfo.getUserName();
		 String userphone=userinfo.getUserPhone();
		 String userpassword=userinfo.getUserPassword();
		 String userpicture=userinfo.getUserPicture();
		 String useremail=userinfo.getUserEmail();
		 String sql="update userinfo set username=?,userphone=? , userpassword=?,userpicture=?,useremail=? where userid=?";
		 Object[] object=new Object[]{username,userphone,userpassword,userpicture,useremail,userid};
		 int i=0;
		 try{
			 i=this.set(sql, object);
		 }catch(Exception e){
			 e.printStackTrace();
		 }		 
		 return 1; 
	 };
	 
	 
	 public UserInfoBean getUserInfoByuserid(int userid,String userName,String userPassword){
			Object[] object=new Object[]{userid,userName,userPassword};
			String sql="select * from userinfo where userid=? and username=? and userpassword=?";
			List<UserInfoBean> list=new ArrayList<UserInfoBean>();
			try {
				list=this.queryForList(new RowMapper<UserInfoBean>(){
					public UserInfoBean mappingRow(ResultSet rs,int rownum) throws SQLException{
						UserInfoBean userInfo=new UserInfoBean();
						userInfo.setUserName(rs.getString("userName"));
						userInfo.setUserPassword(rs.getString("userPassword"));
						userInfo.setUserPhone(rs.getString("userPhone"));
						userInfo.setUserPicture(rs.getString("userPicture"));
						userInfo.setUserId(rs.getInt("userId"));
						userInfo.setUserEmail(rs.getString("useremail"));
						return userInfo;
					}			
				}, sql, object);
			} catch (ClassNotFoundException|SQLException|IOException e) {	
				e.printStackTrace();
			}
			if(list!=null&&list.size()>0){
				return list.get(0);
			}else
			   return null;
		}
		
		
	 public UserInfoBean getUserInfoByuserId(int userid){
			Object[] object=new Object[]{userid};
			String sql="select * from userinfo where userid=?";
			List<UserInfoBean> list=new ArrayList<UserInfoBean>();
			try {
				list=this.queryForList(new RowMapper<UserInfoBean>(){
					public UserInfoBean mappingRow(ResultSet rs,int rownum) throws SQLException{
						UserInfoBean userInfo=new UserInfoBean();
						userInfo.setUserName(rs.getString("userName"));
						userInfo.setUserPassword(rs.getString("userPassword"));
						userInfo.setUserPhone(rs.getString("userPhone"));
						userInfo.setUserPicture(rs.getString("userPicture"));
						userInfo.setUserId(rs.getInt("userId"));
						userInfo.setUserEmail(rs.getString("useremail"));
						return userInfo;
					}			
				}, sql, object);
			} catch (ClassNotFoundException|SQLException|IOException e) {	
				e.printStackTrace();
			}
			if(list!=null&&list.size()>0){
				return list.get(0);
			}else
			   return null;
		}
		
	 
}
