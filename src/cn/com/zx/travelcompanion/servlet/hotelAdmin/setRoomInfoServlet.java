package cn.com.zx.travelcompanion.servlet.hotelAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.service.hotelAdmin.InsertRoomService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.InsertRoomServiceImpl;


/**
 * Servlet implementation class setRoomInfoServlet
 */
@WebServlet("/setRoomInfoServlet")
public class setRoomInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

//设置酒店房间
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
     this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String type=req.getParameter("type");
		String price=req.getParameter("price");
		String number=req.getParameter("number");
		int i=Integer.parseInt(number);
	    InsertRoomService ir=new InsertRoomServiceImpl();
		HttpSession session = req.getSession();	      
		Object a=session.getAttribute("hotelid");//获取酒店id
		int hotelid=(int) a;
	for(;i>0;i--){
	    ir.insertRoomByHotel(hotelid, type, price);
	}
	req.getRequestDispatcher("getRoomInfoServlet").forward(req, resp);
	}

}
