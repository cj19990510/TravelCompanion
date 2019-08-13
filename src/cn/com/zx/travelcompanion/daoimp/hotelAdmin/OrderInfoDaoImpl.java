package cn.com.zx.travelcompanion.daoimp.hotelAdmin;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.OrderInfoDao;


public class OrderInfoDaoImpl extends JdbcTemplate implements OrderInfoDao{
    //获取订单信息
	//用户选择类型
	@Override
	public List<OrderInfoBean> getOrderInfo(int HotelId) {
		String sql ="select * from OrderInfo where hotelId=?";//获取此酒店的订单信息
		List<OrderInfoBean> list = new ArrayList<OrderInfoBean>();
		Object[] params = new Object[]{HotelId};
		try {
			list = this.queryForList(new RowMapper<OrderInfoBean>(){    
				@Override
				public OrderInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					
					// TODO Auto-generated method stub
					OrderInfoBean oi=new OrderInfoBean();
					oi.setOrderId(rs.getInt("orderId"));   //订单号
					oi.setOrderTime(rs.getTimestamp("orderTime")); //订单金额
					oi.setDayNum(rs.getInt("dayNum"));	//预定天数
					oi.setOrderMoney(rs.getBigDecimal("orderMoney"));
					oi.setOrderState(rs.getString("orderState"));
					return oi;
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
		return list;
	
	}
	
		
	//获取此酒店的订单信息
	

}
