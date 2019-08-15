package cn.com.zx.travelcompanion.daoimp.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.dao.admin.HotelApplyDao;

public class HotelApplyDaoImpl implements HotelApplyDao {

	@Override
	public void insert(String applyId,String hotelName,String hotelPhone,String hotelInfomation,
			String type,int cityid) {

		String sql1="insert into hotelinfo (hotelName,hotelPhone,cityId,hotelInfomation,type) values(?,?,?,?,?)";
	
		String sql2="delete from hotelapply where applyId=?";
		String sql3="insert into hoteladmininfo (hotelAdminName,hotelAdminPsw,hotelid) values(?,?,?)";

		 Connection conn = null;
		 PreparedStatement ps1 = null;
		 PreparedStatement ps2 = null;
		 PreparedStatement ps3 = null;
	     ResultSet rs=null;
	     long id=0;
	      try {
			conn = DbUtil.getConnection();
			conn.setAutoCommit(false);
			ps1=conn.prepareStatement(sql1);
			ps2=conn.prepareStatement(sql2);
			ps3=conn.prepareStatement(sql3,Statement.RETURN_GENERATED_KEYS);
			
			ps1.setObject(1, hotelName);
		    ps1.setObject(2, hotelPhone);
		    ps1.setObject(3, cityid);
		    ps1.setObject(4, hotelInfomation); 
		    ps1.setObject(5, type);
		    
		    ps2.setObject(1, applyId);
		    
		    ps1.executeUpdate();
			ps2.executeUpdate();
		    rs=ps1.getGeneratedKeys();
			 while(rs.next()){
			       id=rs.getLong(1);
			      }

			 ps3.setObject(1, hotelName);
			 ps3.setObject(2, "123456");
			 ps3.setObject(3, id);
			 
			 ps3.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
	    	DbUtil.closeConnection(conn,ps1,rs);
		}
	
	
	}


	@Override
	public void delete(String applyid) {

		String sql="delete from hotelapply where applyId=?";
		 Connection conn = null;
		 PreparedStatement ps = null;
	     ResultSet rs=null;
	     
	      try {
			conn = DbUtil.getConnection();
			ps=conn.prepareStatement(sql);
			
			ps.setObject(1, applyid);
			ps.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
	    	DbUtil.closeConnection(conn,ps,rs);
		}
	}

}
