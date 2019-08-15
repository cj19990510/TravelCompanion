package cn.com.zx.travelcompanion.dao;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.daoimp.RoomInfoDaoImp;

public class RoomInfoDao extends JdbcTemplate implements RoomInfoDaoImp{

	@Override
	public List<RoomInfoBean> getspot(String hotelid) {
		Object[] object=new Object[] {hotelid};
		String sql="SELECT * from roominfo WHERE hotelid=?";
		List<RoomInfoBean> list=null;
		try {
			list = this.queryForList(new RowMapper<RoomInfoBean>() {
				public RoomInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					RoomInfoBean room= new RoomInfoBean();
					room.setRoomPrice(rs.getBigDecimal("roomprice"));
					room.setRoomState(rs.getString("roomState"));
					room.setRoomType(rs.getString("roomType"));
					return room;
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

}
