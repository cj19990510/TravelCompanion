package cn.com.zx.travelcompanion.daoimp.admin;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.Admin;
import cn.com.zx.travelcompanion.dao.admin.loginDao;

public class LoginDaoImpl extends JdbcTemplate implements loginDao{

	@Override
	public Admin getAdmin(String adminid, String password)  {
		String sql="select * from admininfo where adminId=? and adminPassword=?";
		
		Object [] params = new Object[] {adminid, password};
		List<Admin> ulist=null;
		try {
			ulist = this.queryForList(new RowMapper<Admin>() {
				
			public Admin mappingRow(ResultSet rs,int rownum) throws SQLException {
					Admin admin=new Admin();
					admin.setAdminID(rs.getString("adminid"));
					admin.setAdminPassword(rs.getString("adminPassword"));
					admin.setAdminName(rs.getString("adminName"));
					
			return admin;
				}
				
			},sql,params);
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(ulist!=null && ulist.size()!=0) {
			return ulist.get(0);
		}else {
			return null;
		}//将结果集
		
	}

	

}
