package cn.com.zx.travelcompanion.daoimp.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.dao.admin.InsertDao;

public class InsertDaoImpl implements InsertDao {

	@Override
	public long insert(String adminName, String password) {

		String sql="insert into adminInfo (adminName,adminPassword) values(?,?)";	    
	    Connection conn = null;
	    PreparedStatement ps = null;
	    
		ResultSet rs=null;
		
		long id=0;
	    try {
	      conn = DbUtil.getConnection();
	      ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);


	      ps.setObject(1, adminName);
	      ps.setObject(2, password);
	     
	      
	      ps.executeUpdate();
	      rs=ps.getGeneratedKeys();//这一句代码就是得到插入的记录的id
	      while(rs.next()){
	       id=rs.getLong(1);
	      }
	      
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	    	DbUtil.closeConnection(conn,ps,rs);
	    }
	   return id; 
	}

}
