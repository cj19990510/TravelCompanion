package cn.com.zx.travelcompanion.servlet.hotelAdmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.service.hotelAdmin.getOrderInfoService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.getOrderInfoServiceImpl;



/**
 * Servlet implementation class OrderInfoServlet
 */
@WebServlet("/OrderInfoServlet")
public class OrderInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	  //通过酒店id获取用户订单
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getOrderInfoService goi=new getOrderInfoServiceImpl();//获取订单信息
		HttpSession session = req.getSession();	 
		HotelAdminInfoBean hai1=(HotelAdminInfoBean) session.getAttribute("user");
		//保存此酒店id的信息
	     List<OrderInfoBean> oi=goi.getOrderInfo(hai1.getHotelId());
	     for(int i=0;i<oi.size();i++)
	     {
	    	 System.out.println(oi.get(i).toString());

	     }
	     System.out.println("oi保存的ֵ"+oi.get(0).getOrderState());	     
	     session.setAttribute("oi", oi);
		req.getRequestDispatcher("dist/html/table/datatable.jsp").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
