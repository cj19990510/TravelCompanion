package cn.com.zx.travelcompanion.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.daoimp.HotelInfoDaoImp;

public class HotelInfoDao extends JdbcTemplate implements HotelInfoDaoImp{
	@Override
	public List<HotelInfoPictureBean> getHotelInfo(String type) {
		Object[] object=new Object[] {type};
		String sql="SELECT c.cityname,h.hotelid,h.hotelInfomation,h.hotelLevel,h.hotelname,h.hotelPhone,p.pictureurl FROM hotelinfo h,pictureinfo p,cityinfo c WHERE h.type=? AND h.cityid=c.cityid AND h.hotelid=p.hotelid  GROUP BY h.`hotelId` LIMIT 10";
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
	//获得排行榜
	public List<HotelInfoPictureBean> getTop20HotelInfo(String type) {
		Object[] object=new Object[] {type};
		String sql="SELECT c.cityname,h.hotelid,h.hotelInfomation,h.hotelLevel,h.hotelname,h.hotelPhone,p.pictureurl FROM hotelinfo h,pictureinfo p,cityinfo c WHERE h.type=? and h.cityid=c.cityid AND p.hotelid=h.hotelid  GROUP BY h.`hotelId` order by hotelLevel desc LIMIT 10";
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
	public List<HotelInfoPictureBean> getRecommendHotelInfo(String type, String[] recimmendiion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HotelInfoPictureBean> getHotelInfo(int hotelid) {
		Object[] object=new Object[] {hotelid};
		String sql="SELECT c.cityname,h.hotelid,h.hotelInfomation,h.hotelLevel,h.hotelname,h.hotelPhone,p.pictureurl FROM hotelinfo h,pictureinfo p,cityinfo c WHERE h.hotelid=? AND h.cityid=c.cityid AND p.hotelid=h.hotelid";
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
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list.isEmpty())
			return null;
		else
		return list;
	}
	//分页
	@Override
	public List<HotelInfoPictureBean> getHotelInfo1(int number, String type) {
		Object[] object=new Object[] {type,(number-1)*6};
		String sql="SELECT c.cityname,h.hotelid,h.hotelInfomation,h.hotelLevel,h.hotelname,h.hotelPhone,p.pictureurl FROM hotelinfo h,pictureinfo p,cityinfo c WHERE h.type=? AND h.cityid=c.cityid AND p.hotelid=h.hotelid  GROUP BY h.`hotelId` limit ?,6";
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
