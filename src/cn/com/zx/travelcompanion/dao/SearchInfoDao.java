package cn.com.zx.travelcompanion.dao;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import cn.com.zx.travelcompanion.DB.GetNowTime;
import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.SearchInfoBean;
import cn.com.zx.travelcompanion.daoimp.SearchInfoDaoImp;

public class SearchInfoDao  extends JdbcTemplate implements SearchInfoDaoImp {

	@Override
	public int getSerchInfoNumber(String type, int id) {
		Object[] object=new Object[] {id};
		String sql=null;
		if(type.equals("酒店")){
			sql="SELECT COUNT(*) FROM searchinfo WHERE hotelid=? AND DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= DATE(searchtime)";
		}
		else{
			sql="SELECT COUNT(*) FROM searchinfo WHERE cityid=? AND DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= DATE(searchtime)";
		}
		List<Integer> list=null;
		try {
			list = this.queryForList(new RowMapper<Integer>() {
				public Integer mappingRow(ResultSet rs, int rownum) throws SQLException {
					int c=rs.getInt(0);
					return 0;
				}
				
			},sql,object);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list.isEmpty())
			return 0;
		else
		return list.get(0);
	}

	@Override
	public Timestamp getSerchInfoTime(String type, int id) {
		Object[] object=new Object[] {id};
		String sql=null;
		if(type.equals("酒店")){
			sql="SELECT MAX(searchtime) FROM searchinfo WHERE hotelId=? AND DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= DATE(searchtime)";
		}
		else{
			sql="SELECT MAX(searchtime) FROM searchinfo WHERE cityId=? AND DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= DATE(searchtime)";
		}
		List<Timestamp> list=null;
		try {
			list = this.queryForList(new RowMapper<Timestamp>() {
				public Timestamp mappingRow(ResultSet rs, int rownum) throws SQLException {
					Timestamp c=rs.getTimestamp(0);
					return c;
				}
				
			},sql,object);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list.isEmpty())
			return null;
		else
		return list.get(0);
	}

	@Override
	public int addSerchInfo(SearchInfoBean search) {
		Date date=new Date(System.currentTimeMillis());
		Object[] object=new Object[]{search.getHotelId(),search.getCityId(),GetNowTime.getNowTime()};
		String sql="insert into searchinfo(hotelId,cityId,searchtime) values(?,?,?)";
		try {
			this.set(sql,object);
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
