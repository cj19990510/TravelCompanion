package cn.com.zx.travelcompanion.daoimp.hotelAdmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.batch.Main;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.dao.hotelAdmin.HotelApplyDao;

public class HotelApplyDaoImpl extends JdbcTemplate implements HotelApplyDao{

	@Override
	public boolean insertApply(String hotelName, String hotelPhone, int cityId, String hotelInfomation,
			String type, String apply, String licenseNumber, String licensePicture) {
		Connection conn = null; 
		PreparedStatement pre = null; 
		ResultSet rs = null; 
		int flag=0;
	
		String sql1="insert into hotelapply (hotelName,hotelPhone,cityId,hotelInfomation,type,Apply,licenseNumber,licensePicture) values(?,?,?,?,?,?,?,?,?)";
	    Object[]inparams=new Object[] {hotelName,hotelPhone,cityId,hotelInfomation,type,apply,licenseNumber,licensePicture};
	    try {    	    	
	    	conn = DbUtil.getConnection();
			conn.setAutoCommit(false);
			pre=conn.prepareStatement(sql1);
			  setParams(inparams,pre);
			 flag = pre.executeUpdate();
			
			  conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DbUtil.closeConnection(conn, pre, rs);
		}
	  
		if(flag==1)
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("");
	}
}

	 

