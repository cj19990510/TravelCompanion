package cn.com.zx.travelcompanion.daoimp.hotelAdmin;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.HotelAdminInfoDao;





public class HotelAdminInfoDaoImpl extends JdbcTemplate implements HotelAdminInfoDao {

	@Override
	public HotelAdminInfoBean getHotelAI(String id) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			String sql ="select * from HotelAdminInfo where hotelAdminId=?";
			List<HotelAdminInfoBean> list = new ArrayList<HotelAdminInfoBean>();
			Object[] params = new Object[]{id};
			try {
				list = this.queryForList(new RowMapper<HotelAdminInfoBean>(){

					@Override
					public HotelAdminInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
						// TODO Auto-generated method stub
						HotelAdminInfoBean hotelAdminInfoBean = new HotelAdminInfoBean();
						hotelAdminInfoBean.setHotelAdminId(rs.getInt("hotelAdminId"));
						hotelAdminInfoBean.setHotelAdminPsw(rs.getString("hotelAdminPsw"));
						hotelAdminInfoBean.setHotelAdminName(rs.getString("hotelAdminName"));
				        hotelAdminInfoBean.setHotelId(rs.getInt("hotelId"));

						return hotelAdminInfoBean;
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



