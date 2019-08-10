package cn.com.zx.travelcompanion.daoimp.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.dao.admin.DingDanDao;

public class DingDanDaoImpl implements DingDanDao {

	@Override
	public List<OrderInfoBean> chaXunDan(String time,int currentPage) throws ParseException {
		
		int pageSize = 2;
		int startIndex = 0;
		if(currentPage >= 1) {
			startIndex = pageSize*(currentPage-1);
		}
		
		String sql="select orderinfo.orderId,hotelinfo.hotelname,orderinfo.roomId,orderinfo.dayNum,orderinfo.orderMoney,orderinfo.orderState,orderinfo.intime "
                    +"from orderinfo,hotelinfo "
                    +"where orderinfo.hotelId=hotelinfo.hotelId "
                   +" and orderinfo.orderTime>? "
                    +"and orderinfo.orderTime<? "
                   +"order by orderinfo.orderTime desc limit ?, ?";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  

		String str=time+" 00:00:00";
	     Date dt = sdf.parse(str);  
	     Calendar rightNow = Calendar.getInstance();  
	     rightNow.setTime(dt);  
	     rightNow.add(Calendar.DAY_OF_YEAR, 1);
	     String time1=sdf.format(rightNow.getTime());
	     String t= time1.substring(0,str.indexOf(" "));

		List<OrderInfoBean> list1=new ArrayList<OrderInfoBean>();

		Connection con = null;
	    PreparedStatement pre = null;
	    ResultSet rs = null;
	    try {
	     con = DbUtil.getConnection();
	     pre = con.prepareStatement(sql);
	     pre.setObject(1,time);
	     pre.setObject(2,t);
	     pre.setObject(3,startIndex);
	     pre.setObject(4,pageSize);
	     rs = pre.executeQuery();
	     while (rs.next()) {
	    	 OrderInfoBean order =new OrderInfoBean();
	    	 order.setHotelName(rs.getString(2));
	    	 order.setOrderId(rs.getInt(1));
	    	 order.setRoomId(rs.getInt(3));
	    	 order.setDayNum(rs.getInt(4));
	    	 order.setOrderMoney(rs.getBigDecimal(5));
	    	 order.setOrderState(rs.getString(6));
	    	 order.setInTime(rs.getTimestamp(7));
	    	 
	        list1.add(order);

	     }
	     } catch (Exception e) {
	     e.printStackTrace();
	     }	finally {
	     DbUtil.closeConnection(con,pre,rs);
	    }
	      return list1;
	}

	public int totalPage(String time) throws ParseException {
		// TODO Auto-generated method stub
		String sql = "select count(*) from orderinfo where orderinfo.orderTime>? and orderinfo.orderTime<?";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  

		String str=time+" 00:00:00";
	     Date dt = sdf.parse(str);  
	     Calendar rightNow = Calendar.getInstance();  
	     rightNow.setTime(dt);  
	     rightNow.add(Calendar.DAY_OF_YEAR, 1);
	     String time1=sdf.format(rightNow.getTime());
	     String t= time1.substring(0,str.indexOf(" "));
	
	        Connection con = null;
		    PreparedStatement pre = null;
		    ResultSet rs = null;
		    int total=0;
		    try {
		     con = DbUtil.getConnection();
		     pre = con.prepareStatement(sql);
		     pre.setObject(1,time);
		     pre.setObject(2,t);
		     rs = pre.executeQuery();
		    while(rs.next()){
		    	total = rs.getInt(1);
		    }
           } catch (Exception e) {
                e.printStackTrace();
            }	finally {
             DbUtil.closeConnection(con,pre,rs);
          }
		    return total;
	}
	
	
	
}
