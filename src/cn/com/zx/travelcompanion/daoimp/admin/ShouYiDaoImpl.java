package cn.com.zx.travelcompanion.daoimp.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.dao.admin.ShouYiDao;

public class ShouYiDaoImpl implements ShouYiDao {

	@Override
	public int month(String stime,String etime)  {
		// TODO Auto-generated method stub
		String sql = "select SUM(orderMoney)*0.1 from orderinfo where orderinfo.orderTime>? and orderinfo.orderTime<?";
		
	
	        Connection con = null;
		    PreparedStatement pre = null;
		    ResultSet rs = null;
		    int total=0;
		    try {
		     con = DbUtil.getConnection();
		     pre = con.prepareStatement(sql);
		     pre.setObject(1,stime);
		     pre.setObject(2,etime);
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

	@Override
	public int months(String stime,String etime) {
		String sql = "select SUM(orderMoney)*0.1 from orderinfo where orderinfo.orderTime>? and orderinfo.orderTime<?";
		
	
	        Connection con = null;
		    PreparedStatement pre = null;
		    ResultSet rs = null;
		    int total=0;
		    try {
		     con = DbUtil.getConnection();
		     pre = con.prepareStatement(sql);
		     pre.setObject(1,stime);
		     pre.setObject(2,etime);
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

	@Override
	public int chaxun(String time) throws ParseException {
		String sql = "select SUM(orderMoney)*0.1 from orderinfo where orderinfo.orderTime>? and orderinfo.orderTime<?";
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
