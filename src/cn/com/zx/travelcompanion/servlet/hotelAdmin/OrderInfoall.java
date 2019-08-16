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

import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.service.hotelAdmin.getOrderInfoService;
import cn.com.zx.travelcompanion.service.hotelAdmin.getRoomInfoService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.getOrderInfoServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.getRoomInfoServiceImpl;



/**
 * Servlet implementation class OrderInfoServlet
 */
@WebServlet("/OrderInfoall")
public class OrderInfoall extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	  //通过酒店id获取新的用户订单
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getOrderInfoService goi=new getOrderInfoServiceImpl();//获取订单信息
		HttpSession session = req.getSession();	 
		 Object a=session.getAttribute("hotelid");//获取酒店id
			int hotelid=(int) a;
		//保存此酒店id的信息
		
	     List<OrderInfoBean> oi=goi.getOrderInfo(hotelid);
	     for(int i=0;i<oi.size();i++)
	     {
	    	 System.out.println(oi.get(i).toString());

	     }     
	     getRoomInfoService r=new getRoomInfoServiceImpl();
	     RoomInfoBean ri=new RoomInfoBean();
	     List<String> type=new ArrayList<String>();
	     for(int i=0;i<oi.size();i++){
	    	ri= r.getRoomInfobyRoomid(oi.get(i).roomId);
	    	type.add(ri.roomType);
	     }
	     session.setAttribute("type", type);
	     session.setAttribute("oi", oi);
	     //获取未接单信息
		req.getRequestDispatcher("dist/html/table/Order.jsp").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
