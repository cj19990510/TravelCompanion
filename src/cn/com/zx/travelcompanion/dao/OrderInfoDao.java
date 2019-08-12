package cn.com.zx.travelcompanion.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.com.zx.travelcompanion.AI.StringUtil;
import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.IntAndInt;
import cn.com.zx.travelcompanion.daoimp.OrderInfoDaoImp;

public class OrderInfoDao extends JdbcTemplate implements OrderInfoDaoImp{

	@Override
	public String[] getValueToAI(String type) {
		Object[] object=new Object[] {type};
		String sql="SELECT c.userid,h.hotelid FROM hotelinfo h,orderinfo c WHERE h.type=? AND h.hotelid=c.hotelid LIMIT 1024 order by c.userid";
		String[] test=null;
		List<IntAndInt> list=null;
		try {
			list = this.queryForList(new RowMapper<IntAndInt>() {
				public IntAndInt mappingRow(ResultSet rs, int rownum) throws SQLException {
					IntAndInt iToI= new IntAndInt();
					iToI.setI(rs.getInt(0));
					iToI.setI(rs.getInt(1));
					return iToI;
				}
				
			},sql,object);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test=StringUtil.ListToString(list);
		if(list.isEmpty())
			return null;
		else
		return test;
	}

	@Override
	public String getPersonValueToAI(String type, int userid) {
		Object[] object=new Object[] {type,userid};
		String sql="SELECT h.hotelid FROM hotelinfo h,orderinfo c WHERE h.type=? AND h.userid=? h.hotelid=c.hotelid LIMIT 1024 order by c.userid";
		String test=null;
		List<Integer> list=null;
		try {
			list = this.queryForList(new RowMapper<Integer>() {
				public Integer mappingRow(ResultSet rs, int rownum) throws SQLException {
					Integer i=new Integer(rs.getInt(0));
					return i;
				}
				
			},sql,object);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list.isEmpty())
			return null;
		else
		{
			int i=0;
			for (Integer integer : list) {
				if(i==list.size()){
					test=test+integer;
				}
				test=test+integer+" ";	
			}
			return test;
		}
		
	}

}
