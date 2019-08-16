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

import cn.com.zx.travelcompanion.service.hotelAdmin.ChangeOrderInfoService;
import cn.com.zx.travelcompanion.service.hotelAdmin.getOrderInfoService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.ChangeOrderInfoServiceImpl;


@WebServlet("/OrderNo")
public class OrderNo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	  //通过酒店id获取新的用户订单
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Orderid=req.getParameter("orderId");
		
		int oi=Integer.parseInt(Orderid);
		ChangeOrderInfoService co=new ChangeOrderInfoServiceImpl();
		co.changeOrder(oi, "预定失败");
		
		req.getRequestDispatcher("OrderInfoServlet").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  this.doGet(req, resp);
	}

}
