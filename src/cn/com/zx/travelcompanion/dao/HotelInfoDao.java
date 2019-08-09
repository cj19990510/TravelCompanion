package cn.com.zx.travelcompanion.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.daoimp.HotelInfoDaoImp;

public class HotelInfoDao extends JdbcTemplate implements HotelInfoDaoImp{
	@Override
	public List<HotelInfoPictureBean> getHotelInfo(String type) {
		Object[] object=new Object[] {type};
		String sql="SELECT c.cityname,h.hotelid,h.hotelInfomation,h.hotelLevel,h.hotelname,h.hotelPhone,p.pictureurl FROM hotelinfo h,pictureinfo p,cityinfo c WHERE h.type=? AND h.cityid=c.cityid AND p.hotelid=h.hotelid  GROUP BY h.`hotelId` LIMIT 20";
		List<HotelInfoPictureBean> list=null;
		try {
			list = this.queryForList(new RowMapper<HotelInfoPictureBean>() {
				public HotelInfoPictureBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					HotelInfoPictureBean hotel= new HotelInfoPictureBean();
				    hotel.setCityName(rs.getString("cityname"));
				    hotel.setHotelId(rs.getInt("hotelId"));
				    hotel.setHotelInfomation(rs.getString("hotelInfomation"));
				    hotel.setHotelLevel(rs.getInt("hotelLevel"));
				    hotel.setHotelName(rs.getString("hotelname"));
				    hotel.setHotelPhone(rs.getString("hotelPhone"));
				    hotel.setPicture(rs.getString("pictureurl"));
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

	@Override
	public List<HotelInfoPictureBean> getTop20HotelInfo(String type, String city) {
		Object[] object=new Object[] {type,city};
		String sql="SELECT c.cityname,h.hotelid,h.hotelInfomation,h.hotelLevel,h.hotelname,h.hotelPhone,p.pictureurl FROM hotelinfo h,pictureinfo p,cityinfo c WHERE h.type=? AND h.cityid=? and h.cityid=c.cityid AND p.hotelid=h.hotelid  GROUP BY h.`hotelId` order by hotelLevel LIMIT 20";
		List<HotelInfoPictureBean> list=null;
		try {
			list = this.queryForList(new RowMapper<HotelInfoPictureBean>() {
				public HotelInfoPictureBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					HotelInfoPictureBean hotel= new HotelInfoPictureBean();
				    hotel.setCityName(rs.getString("cityname"));
				    hotel.setHotelId(rs.getInt("hotelId"));
				    hotel.setHotelInfomation(rs.getString("hotelInfomation"));
				    hotel.setHotelLevel(rs.getInt("hotelLevel"));
				    hotel.setHotelName(rs.getString("hotelname"));
				    hotel.setHotelPhone(rs.getString("hotelPhone"));
				    hotel.setPicture(rs.getString("pictureurl"));
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

}
