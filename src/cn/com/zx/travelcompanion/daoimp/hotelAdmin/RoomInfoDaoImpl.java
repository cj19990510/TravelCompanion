package cn.com.zx.travelcompanion.daoimp.hotelAdmin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.zx.travelcompanion.DB.DbUtil;
import cn.com.zx.travelcompanion.DB.JdbcTemplate;
import cn.com.zx.travelcompanion.DB.RowMapper;
import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.RoomInfoDao;




public class RoomInfoDaoImpl extends JdbcTemplate implements RoomInfoDao {
	  //获取房间信息   获取房间状态信息
	  //增加房间信息
	  //修改房间状态
	@Override
	
	public List<RoomInfoBean> getRoomInfoByHotel(int hotelId) {
		// TODO Auto-generated method stub
		String sql="select*from RoomInfo where hotelId=?";
		List<RoomInfoBean> list = new ArrayList<RoomInfoBean>();
		Object[] params = new Object[]{hotelId};
		try {
			list = this.queryForList(new RowMapper<RoomInfoBean>(){
     
				@Override
				public RoomInfoBean mappingRow(ResultSet rs, int rownum) throws SQLException {
					
					// TODO Auto-generated method stub
					RoomInfoBean ri =new RoomInfoBean();
					ri.setHotelId(rs.getInt("hotelId"));
					ri.setRoomId(rs.getInt("roomId"));
				    ri.setRoomPrice(rs.getBigDecimal("roomPrice"));
					ri.setRoomState(rs.getString("roomState"));		
					ri.setRoomType(rs.getString("roomType"));
					return ri ;
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
		if(list != null && list.size() > 0) {
			return list;
		}else {
			return null;
		}
	}
    //改变房间状态 ： 1.自动改变为空 2.收到订单自动改变为
	@Override
	public Boolean changeRoomState(int roomId, String roomState) {
		// TODO Auto-generated method stub
		Connection conn = null; 
		PreparedStatement pre = null; 
		ResultSet rs = null;
		String sql="update RoomInfo set roomState=?  where roomId = ?";		
     	Object[]inparams=new Object[] {roomState,roomId};
     	int flag=0;
     	 try {    	    	
 	    	conn = DbUtil.getConnection();
 			conn.setAutoCommit(false);
 			pre=conn.prepareStatement(sql);
 			  setParams(inparams,pre);
 			 flag = pre.executeUpdate();
 			
 			  conn.commit();
 		} catch (SQLException e) {
 			e.printStackTrace();
 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}finally{
 			DbUtil.closeConnection(conn, pre, rs);
 		}
 	  
 		if(flag==1)
 		return true;
 		else
 			return false;
 	}
		
	
	//加入房间信息
	public Boolean insertRoomInfoBean(int hotelId,String roomType,String roomPrice) {
		Connection conn = null; 
		PreparedStatement pre = null; 
		ResultSet rs = null; 
		int flag=0;
		String insertsql="insert into RoomInfo(hotelId,roomType,roomPrice,roomState)"
				 +"values(?,?,?,?)";
	    Object[]inparams=new Object[] {hotelId,roomPrice,roomType,"空闲"};
	    try {    	    	
	    	conn = DbUtil.getConnection();
			conn.setAutoCommit(false);
			pre=conn.prepareStatement(insertsql);
			  setParams(inparams,pre);
			 flag = pre.executeUpdate();
			
			  conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DbUtil.closeConnection(conn, pre, rs);
		}
	  
		if(flag==1)
		return true;
		else
			return false;
	}
	

//	  public static void main(String[] args) {
//			RoomInfoDao rd=new RoomInfoDaoImpl();
//			rd.changeRoomState(1001, "空闲");
//	  }
}

   

    
	
	

