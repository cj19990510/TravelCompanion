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

import cn.com.zx.travelcompanion.AI.StringUtil;
import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.IntAndInt;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.daoimp.OrderInfoDaoImp;

public class OrderInfoDao extends JdbcTemplate implements OrderInfoDaoImp{

	@Override
	public String[] getValueToAI(String type) {
		Object[] object=new Object[] {type};
		String sql="SELECT c.userid,h.hotelid FROM hotelinfo h,orderinfo c WHERE h.type=? AND h.hotelid=c.hotelid order by c.userid  LIMIT 1024 ";
		String[] test=null;
		List<IntAndInt> list=null;
		try {
			list = this.queryForList(new RowMapper<IntAndInt>() {
				public IntAndInt mappingRow(ResultSet rs, int rownum) throws SQLException {
					IntAndInt iToI= new IntAndInt();
					iToI.setI(rs.getInt(1));
					iToI.setI(rs.getInt(2));
					return iToI;
				}
				
			},sql,object);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test=StringUtil.ListToString(list);
		if(list.isEmpty())
			return null;
		else
		return test;
	}

	@Override
	public String getPersonValueToAI(String type, int userid) {
		Object[] object=new Object[] {type,userid};
		String sql="SELECT h.hotelid FROM hotelinfo h,orderinfo c WHERE h.type=? AND c.userid=? and h.hotelid=c.hotelid";
		String test=new String();
		List<Integer> list=null;
		try {
			list = this.queryForList(new RowMapper<Integer>() {
				public Integer mappingRow(ResultSet rs, int rownum) throws SQLException {
					Integer i=new Integer(rs.getInt(1));
					return i;
				}
				
			},sql,object);
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(list.isEmpty())
			return null;
		else
		{
			int i=0;
			for (Integer integer : list) {
				if(i==list.size()){
					test=test+integer;
				}
				test=test+integer+" ";	
			}
			return test;
		}
		
	}
	
	@Override
	public List<OrderInfoBean> getOrderInfoByuserid(int userid){
		Object[] params=new Object[]{userid};
		String sql="select t.* ,a.hotelname from orderinfo t,hotelinfo a where t.hotelid=a.hotelid and t.userid=?";
		List<OrderInfoBean> list=null;
		try{
			list=this.queryForList(new RowMapper<OrderInfoBean>(){
				public OrderInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					OrderInfoBean orderinfo=new OrderInfoBean();
					orderinfo.setOrderId(rs.getInt("orderid"));
					orderinfo.setUserId(rs.getInt("userid"));
					orderinfo.setHotelId(rs.getInt("hotelid"));
					//orderinfo.setRoomId(rs.getInt("roomlid"));
					orderinfo.setDayNum(rs.getInt("dayNum"));
					orderinfo.setOrderMoney(rs.getBigDecimal("ordermoney"));
					orderinfo.setOrderState(rs.getString("orderstate"));
					orderinfo.setOrderTime(rs.getTimestamp("ordertime"));
					orderinfo.setInTime(rs.getTimestamp("intime"));
					return orderinfo;
				}	
			}, sql, params);
		}catch(Exception e){
			e.printStackTrace();
		};
		if(list.isEmpty()){
			return null;	
		}else{
			/*System.out.println(list);
			for(int i=0;i<list.size();i++){
				  System.out.println(list.get(i));
				  System.out.println(list.get(i));
			}*/
			 System.out.println(list);
			 return list;
		}
	  
	}
	//根据用户id查出订单信息，图片信息，酒店信息
	public List<OrderInfoBean> getOrderInfoandHotelInfoByuserid(int userid){
		Object[] params=new Object[]{userid};
		String sql="select t.* ,h.hotelname,p.pictureUrl from orderinfo t,hotelinfo h,pictureinfo p where t.hotelid=h.hotelid and h.hotelid=p.hotelid and t.userid=?";
		List<OrderInfoBean> list=null;
		try{
			list=this.queryForList(new RowMapper<OrderInfoBean>(){
				public OrderInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					OrderInfoBean orderinfo=new OrderInfoBean();
					orderinfo.setOrderId(rs.getInt("orderid"));
					orderinfo.setUserId(rs.getInt("userid"));
					orderinfo.setHotelId(rs.getInt("hotelid"));
					//orderinfo.setRoomId(rs.getInt("roomlid"));
					orderinfo.setDayNum(rs.getInt("dayNum"));
					orderinfo.setOrderMoney(rs.getBigDecimal("ordermoney"));
					orderinfo.setOrderState(rs.getString("orderstate"));
					orderinfo.setOrderTime(rs.getTimestamp("ordertime"));
					orderinfo.setInTime(rs.getTimestamp("intime"));
					orderinfo.setPictureUrl(rs.getString("pictureUrl"));
					return orderinfo;
				}	
			}, sql, params);
		}catch(Exception e){
			e.printStackTrace();
		};
		if(list.isEmpty()){
			return null;	
		}else{	
			 System.out.println(list);
			 return list;
		}
	  
	}
	
	
	
	
	//订单分页查询
		public List<OrderInfoBean> chaXunDan(int currentPage,int userId) throws ParseException {
			
			int pageSize = 2;
			int startIndex = 0;
			if(currentPage >= 1) {
				startIndex = pageSize*(currentPage-1);
			}
			
			//String sql="select * from orderinfo where userId=? order by orderTime desc limit ?, ?";
			String sql="select t.* ,h.hotelname,p.pictureUrl from orderinfo t,hotelinfo h,pictureinfo p where t.hotelid=h.hotelid and h.hotelid=p.hotelid and t.userid=? order by orderTime desc limit ?, ?";
			/*String str=time+" 00:00:00";
		     Date dt = sdf.parse(str);  
		     Calendar rightNow = Calendar.getInstance();  
		     rightNow.setTime(dt);  
		     rightNow.add(Calendar.DAY_OF_YEAR, 1);
		     String time1=sdf.format(rightNow.getTime());
		     String t= time1.substring(0,str.indexOf(" "));*/

			List<OrderInfoBean> list1=new ArrayList<OrderInfoBean>();

			Connection con = null;
		    PreparedStatement pre = null;
		    ResultSet rs = null;
		    try {
		     con = DbUtil.getConnection();
		     pre = con.prepareStatement(sql);
		     pre.setObject(1,userId);
		     pre.setObject(2,startIndex);
		     pre.setObject(3,pageSize);
		     rs = pre.executeQuery();
		     while (rs.next()) {
		    	 OrderInfoBean order =new OrderInfoBean();
		    	 
		    	 order.setOrderId(rs.getInt(1));
		    	 order.setUserId(rs.getInt(2));
		    	 order.setHotelId(rs.getInt(3));
		    	 order.setRoomId(rs.getInt(4));
		    	 order.setDayNum(rs.getInt(5));
		    	 order.setOrderMoney(rs.getBigDecimal(6));
		    	 order.setOrderTime(rs.getTimestamp(7));
		    	 order.setOrderState(rs.getString(8));
		    	 order.setInTime(rs.getTimestamp(9));
		    	 order.setHotelName(rs.getString(10));
		    	 order.setPictureUrl(rs.getString(11));
		        list1.add(order);

		     }
		     } catch (Exception e) {
		     e.printStackTrace();
		     }	finally {
		     DbUtil.closeConnection(con,pre,rs);
		    }
		      return list1;
		}

		public int totalPage(int userId) throws ParseException {
			// TODO Auto-generated method stub
			String sql = "select count(*) from orderinfo t,hotelinfo h,pictureinfo p where t.hotelid=h.hotelid and h.hotelid=p.hotelid and t.userid=?";
			
//			String str=time+" 00:00:00";
//		     Date dt = sdf.parse(str);  
//		     Calendar rightNow = Calendar.getInstance();  
//		     rightNow.setTime(dt);  
//		     rightNow.add(Calendar.DAY_OF_YEAR, 1);
//		     String time1=sdf.format(rightNow.getTime());
//		     String t= time1.substring(0,str.indexOf(" "));
		
		        Connection con = null;
			    PreparedStatement pre = null;
			    ResultSet rs = null;
			    int total=0;
			    try {
			     con = DbUtil.getConnection();
			     pre = con.prepareStatement(sql);
			
			     pre.setObject(1, userId);
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
		
		
		//账单查询
			public List<OrderInfoBean> chaXunOrder(int year,int month,int userId) throws ParseException {
					int day=getMonthDay(year,month);
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String startMonth="";
					String EndMonth="";
					if(month>=1&&month<=9){
						startMonth=year+"-"+"0"+month+"-"+"01"+" 00:00:00";
						EndMonth=year+"-"+"0"+month+"-"+day+" 00:00:00";
					}else{
						startMonth=year+"-"+month+"-"+"01"+" 00:00:00";
						EndMonth=year+"-"+month+"-"+day+" 00:00:00";
					}
					Date startTime = simpleDateFormat.parse(startMonth);
					Date endTime = simpleDateFormat.parse(EndMonth);
					//String sql="select * from orderinfo where userId=? order by orderTime desc limit ?, ?";
					String sql="SELECT t.* ,h.hotelname,p.pictureUrl FROM orderinfo t,hotelinfo h,pictureinfo p WHERE t.hotelid=h.hotelid AND h.hotelid=p.hotelid AND t.userid=?  AND t.orderTime>=? AND  t.orderTime<=?  AND t.orderState='预订成功'  ORDER BY t.orderTime DESC";
					List<OrderInfoBean> list1=new ArrayList<OrderInfoBean>();

					Connection con = null;
				    PreparedStatement pre = null;
				    ResultSet rs = null;
				    try {
				     con = DbUtil.getConnection();
				     pre = con.prepareStatement(sql);
				     pre.setObject(1,userId);
				     pre.setObject(2,startTime);
				     pre.setObject(3,endTime);
				     rs = pre.executeQuery();
				     while (rs.next()) {
				    	 OrderInfoBean order =new OrderInfoBean();
				    	 
				    	 order.setOrderId(rs.getInt(1));
				    	 order.setUserId(rs.getInt(2));
				    	 order.setHotelId(rs.getInt(3));
				    	 order.setRoomId(rs.getInt(4));
				    	 order.setDayNum(rs.getInt(5));
				    	 order.setOrderMoney(rs.getBigDecimal(6));
				    	 order.setOrderTime(rs.getTimestamp(7));
				    	 order.setOrderState(rs.getString(8));
				    	 order.setInTime(rs.getTimestamp(9));
				    	 order.setHotelName(rs.getString(10));
				    	 order.setPictureUrl(rs.getString(11));
				        list1.add(order);

				     }
				     } catch (Exception e) {
				     e.printStackTrace();
				     }	finally {
				     DbUtil.closeConnection(con,pre,rs);
				    }
				      return list1;
				}		
		
		public int getMonthDay(int year,int month){
			Calendar c = Calendar.getInstance();
			c.set(year, month, 0); //输入类型为int类型
			int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
			return dayOfMonth;
		}

		@Override
		public int insertOrderInfoByuserid(OrderInfoBean order) {
			int id=(int) System.currentTimeMillis();
			String sql = "insert into orderinfo values(?,?,?,?,?,?,?,?,?)";
			Object[] params = {id,order.getUserId(),order.getHotelId(),
					order.getRoomId(),order.getDayNum(),order.getOrderMoney(),
					order.getOrderTime(),order.getOrderState(),order.getOrderTime()};
			try {
				this.set(sql, params);
			} catch (ClassNotFoundException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			        return 0;
		}
		
}
