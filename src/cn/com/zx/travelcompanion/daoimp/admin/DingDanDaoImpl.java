package cn.com.zx.travelcompanion.daoimp.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.dao.admin.DingDanDao;

public class DingDanDaoImpl implements DingDanDao {

	@Override
	public List chaXunDan(String time) {
		String sql="select orderinfo.orderId,hotelinfo.hotelname,orderinfo.roomId,orderinfo.dayNum,orderinfo.orderMoney,orderinfo.orderState,orderinfo.intime"
                    +"from orderinfo,hotelinfo"
                    +"where orderinfo.hotelId=hotelinfo.hotelId"
                   +" and orderinfo.orderTime>?"
                    +"and orderinfo.orderTime<?";
		
		List list1=new ArrayList();

		Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet rs = null;
	    try {
	     con = DbUtil.getConnection();
	     pre = con.prepareStatement(sql);
	     pre.setObject(1,time);
	     pre.setObject(1,time+1);
	     rs = pre.executeQuery();
	     while (rs.next()) {
	    	 OrderInfoBean order =new OrderInfoBean();
	    	 HotelInfoBean hotel =new HotelInfoBean();
	    	 hotel.setHotelName(rs.getString(2));
	    	 order.setOrderId(rs.getInt(1));
	    	 order.setRoomId(rs.getInt(3));
	    	 order.setDayNum(rs.getInt(4));
	    	 order.setOrderMoney(rs.getBigDecimal(5));
	    	 order.setOrderState(rs.getString(7));
	    	 order.setInTime(rs.getTimestamp(8));
	    	 
	        list1.add(hotel);
	        list1.add(order);

	     }
	     } catch (Exception e) {
	     e.printStackTrace();
	     }	finally {
	     DbUtil.closeConnection(con,pre,rs);
	    }
	      return list1;
	}

}
