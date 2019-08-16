package cn.com.zx.travelcompanion.daoimp.hotelAdmin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.CityInfoBean;
import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.CityDao;

public class CityDaoImpl extends JdbcTemplate implements CityDao{

	@Override
	public Boolean insertCity(String city,String province) {
		Connection conn = null; 
		PreparedStatement pre = null; 
		ResultSet rs = null; 
		int flag=0;
	
		String sql1="insert into  cityinfo (cityName,province,cityLevel)values(?,?,2)";
	    Object[]inparams=new Object[] {city,province};
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
	@Override
	public  CityInfoBean cityId(String city) {
		// TODO Auto-generated method stub
		String sql="select * from cityInfo where cityName=?";
		List<CityInfoBean> list = new ArrayList<CityInfoBean>();
		Object[] params = new Object[]{city};
		try {
			list = this.queryForList(new RowMapper<CityInfoBean>(){
     
				@Override
				public CityInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					
					// TODO Auto-generated method stub
					CityInfoBean city =new CityInfoBean();
					city.setCityId(rs.getInt("cityId"));
					city.setCityName(rs.getString("cityName"));
					city.setProvince(rs.getString("province"));
					return city;
				}
				
			}, sql, params);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list != null && list.size() > 0) {
			return list.get(0);
		}else {
			return null;
		}
	
	}

@Override
public CityInfoBean cityInfo(int cityid) {
	String sql ="select * from cityinfo where cityId=?";
	List<CityInfoBean> list = new ArrayList<CityInfoBean>();
	Object[] params = new Object[]{cityid};
	try {
		list = this.queryForList(new RowMapper<CityInfoBean>(){

			@Override
			public CityInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
				// TODO Auto-generated method stub
				CityInfoBean cib=new CityInfoBean();
				cib.setProvince(rs.getString("province"));
				cib.setCityName(rs.getString("cityName"));
				return cib;
			}
			
		}, sql, params);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(list != null && list.size() > 0) {
		return list.get(0);
	}else {
		return null;
	}


}
}
