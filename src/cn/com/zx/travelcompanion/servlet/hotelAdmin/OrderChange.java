package cn.com.zx.travelcompanion.servlet.hotelAdmin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.dao.hotelAdmin.OrderInfoDao;
import cn.com.zx.travelcompanion.dao.hotelAdmin.RoomInfoDao;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.OrderInfoDaoImpl;
import cn.com.zx.travelcompanion.daoimp.hotelAdmin.RoomInfoDaoImpl;
import cn.com.zx.travelcompanion.service.hotelAdmin.ChangeOrderInfoService;
import cn.com.zx.travelcompanion.service.hotelAdmin.ChangeRoomStateService;
import cn.com.zx.travelcompanion.service.hotelAdmin.getOrderInfoService;
import cn.com.zx.travelcompanion.service.hotelAdmin.getRoomInfoService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.ChangeOrderInfoServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.ChangeRoomStateServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.getOrderInfoServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.getRoomInfoServiceImpl;




/**
 * Servlet implementation class OrderInfoServlet
 */
@WebServlet("/OrderChange")
public class OrderChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	  //通过酒店id获取新的用户订单
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Orderid=req.getParameter("orderId");
		int oi=Integer.parseInt(Orderid);
				ChangeOrderInfoService co=new ChangeOrderInfoServiceImpl();
				co.changeOrder(oi, "预定成功");
				//获取订单信息
			 getOrderInfoService goi=new getOrderInfoServiceImpl();
			  OrderInfoBean oib=goi.getOrderInfoByOrderid(oi);
			  
			ChangeRoomStateService cr=new ChangeRoomStateServiceImpl();
			cr.changeRoomState(oib.roomId);
			   
				//改变房间类型为 满
			
			 
		req.getRequestDispatcher("OrderInfoServlet").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  this.doGet(req, resp);
	}

}
