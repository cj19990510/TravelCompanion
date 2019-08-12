package cn.com.zx.travelcompanion.daoimp.hotelAdmin;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.HotelInfoDao;





public class HotelInfoDaoImpl extends JdbcTemplate implements HotelInfoDao{
	
	
	public HotelInfoBean getHotelInfoById(int HotelId) {
		// TODO Auto-generated method stub
		String sql ="select * from HotelInfo where hotelId=?";//获取酒店信息
		List<HotelInfoBean> list = new ArrayList<HotelInfoBean>();
		Object[] params = new Object[]{HotelId};
		try {
			list = this.queryForList(new RowMapper<HotelInfoBean>(){
     
				@Override
				public HotelInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					
					// TODO Auto-generated method stub
					HotelInfoBean hi =new HotelInfoBean();
					hi.setHotelId(rs.getInt("hotelId"));
					hi.setCityName(rs.getInt("cityId"));
					hi.setHotelName(rs.getString("hotelName"));
					System.out.println("酒店名"+hi.getHotelName());
					hi.setType(rs.getString("type"));			
					hi.setHotelInfomation(rs.getString("hotelInfomation"));
					return hi;
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

     //添加酒店信息
	//修改酒店信息

	

	
}
