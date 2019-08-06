package cn.com.zx.travelcompanion.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.daoimp.HotelInfoDaoImp;

public class HotelInfoDao extends JdbcTemplate implements HotelInfoDaoImp{
	@Override
	public List<HotelInfoBean> getHotelInfo(String type) {
		Object[] object=new Object[] {type};
		String sql="select * from hotelinfo where type=?";
		List<HotelInfoBean> list=null;
		try {
			list = this.queryForList(new RowMapper<HotelInfoBean>() {
				public HotelInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					HotelInfoBean hotel= new HotelInfoBean();
				
					return hotel;
				}
				
			},sql,object);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list.isEmpty())
			return null;
		else
		return list;
		
	}

	@Override
	public int addHotelInfo(HotelInfoBean hotel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateHotelInfo(HotelInfoBean hotel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteHotelInfo(HotelInfoBean hotel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<HotelInfoBean> getHotelInfo(String type, String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
