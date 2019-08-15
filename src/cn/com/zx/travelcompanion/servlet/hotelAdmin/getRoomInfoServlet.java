package cn.com.zx.travelcompanion.servlet.hotelAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.zx.travelcompanion.service.hotelAdmin.getRoomInfoService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.getRoomInfoServiceImpl;




@WebServlet("/getRoomInfoServlet")
public class getRoomInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//获取房间信息 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    getRoomInfoService sri=new getRoomInfoServiceImpl();
	    
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
