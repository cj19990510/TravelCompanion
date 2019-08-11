package cn.com.zx.travelcompanion.daoimp.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.bean.YongHuGL;
import cn.com.zx.travelcompanion.dao.admin.YongHuGLDao;

public class YongHuGLDaoImpl implements YongHuGLDao{

	@Override
	public List<UserInfoBean> chaxun(int userId) {
		String sql="select userinfo.userid,userinfo.username,userinfo.userphone,COUNT(orderinfo.orderId),orders.c "
                    +"from userinfo,orderinfo,(select count(*) c  from orderinfo where orderinfo.orderState='预订成功') as orders "
                    +"where  orderinfo.userid=?"
                    +" and userinfo.userid=orderinfo.userId";

		List<UserInfoBean> list=new ArrayList<UserInfoBean>();

		Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            con = DbUtil.getConnection();
            pre = con.prepareStatement(sql);
            pre.setObject(1,userId);
            rs = pre.executeQuery();
            while (rs.next()) {
               UserInfoBean user =new UserInfoBean();
               user.setUserId(rs.getInt(1));
               user.setUserName(rs.getString(2));
               user.setUserPhone(rs.getString(3));
               user.setCount(rs.getString(4));
               user.setCountSuccess(rs.getString(5));
               
               list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }	finally {
            DbUtil.closeConnection(con,pre,rs);
        }
        
        return list;
	}

	@Override
	public String show(int userId) {
		String sql ="select * from userinfo where userid=?";
		
		Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        String res="0";
        try {
            con = DbUtil.getConnection();
            pre = con.prepareStatement(sql);
            pre.setObject(1,userId);
            rs = pre.executeQuery();
            while (rs.next()){
                res="1";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeConnection(con,pre,rs);
        }
        return res;
		}

	@Override
	public List<YongHuGL> chaxunDingDan(int userId) {
		String sql="select orderinfo.orderId,hotelinfo.hotelname,orderinfo.roomId,orderinfo.dayNum,orderinfo.orderMoney,orderinfo.orderTime,orderinfo.orderState,orderinfo.intime\r\n"
                +"from orderinfo,hotelinfo\r\n"
                +"where orderinfo.hotelId=hotelinfo.hotelId and orderinfo.userid=?";
	List<YongHuGL> list1=new ArrayList<YongHuGL>();

	Connection con = null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    try {
     con = DbUtil.getConnection();
     pre = con.prepareStatement(sql);
     pre.setObject(1,userId);
     rs = pre.executeQuery();
     while (rs.next()) {
    	 YongHuGL yongHuGL =new YongHuGL();
    	 yongHuGL.setHotelName(rs.getString(2));
    	 yongHuGL.setOrderId(rs.getInt(1));
    	 yongHuGL.setRoomId(rs.getInt(3));
    	 yongHuGL.setDayNum(rs.getInt(4));
    	 yongHuGL.setOrderMoney(rs.getBigDecimal(5));
    	 yongHuGL.setOrderTime(rs.getTimestamp(6));
    	 yongHuGL.setOrderState(rs.getString(7));
    	 yongHuGL.setInTime(rs.getTimestamp(8));
    	 
        list1.add(yongHuGL);

     }
     } catch (Exception e) {
     e.printStackTrace();
     }	finally {
     DbUtil.closeConnection(con,pre,rs);
    }
      return list1;
	}

}
