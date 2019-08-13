package cn.com.zx.travelcompanion.daoimp.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.bean.HotelApply;
import cn.com.zx.travelcompanion.dao.admin.HotelDao;

public class HotelDaoImpl implements HotelDao {

	@Override
	public List<HotelApply> chaxun() {
		String sql="select hotelapply.*,cityinfo.cityName from hotelapply,cityinfo where hotelapply.cityId=cityinfo.cityId";
		List<HotelApply> list=new ArrayList<HotelApply>();
		
		Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
         try {
			conn=DbUtil.getConnection();
			pre=conn.prepareStatement(sql);
			rs=pre.executeQuery();
			while(rs.next()){
				HotelApply hotelApply=new HotelApply();
				hotelApply.setApplyId(rs.getInt(1));
				hotelApply.setHotelName(rs.getString(2));
				hotelApply.setHotelPhone(rs.getString(3));
				hotelApply.setCityName(rs.getString(10));
				hotelApply.setHotelInfomation(rs.getString(5));
				hotelApply.setType(rs.getString(6));
				hotelApply.setApply(rs.getString(7));
				hotelApply.setLicenseNumber(rs.getString(8));
				hotelApply.setCityId(rs.getInt(4));

				list.add(hotelApply);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DbUtil.closeConnection(conn, pre, rs);
		}
         
		return list;
	}

	@Override
	public byte[] chaxunPic(String applyid) {
		return null;
	}

}
