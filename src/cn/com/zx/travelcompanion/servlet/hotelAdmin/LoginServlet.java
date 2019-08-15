package cn.com.zx.travelcompanion.servlet.hotelAdmin;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelAdminService;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelInfoService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.HotelAdminServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.HotelInfoServiceImpl;


//
/**
 * Servlet implementation class HotelAdminServlet
 */
@WebServlet("/HotelAdminServlet")
public class LoginServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;


		//登录成功 前往主页面 同时写入一些酒店属性
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub	
			String haid = req.getParameter("uname");//酒管id
			String pwd = req.getParameter("upwd");	
			HttpSession session = req.getSession();	           
			HotelAdminService hai=new HotelAdminServiceImpl();		
			hai.getHotelAdminInfo(haid, pwd);     
			HotelAdminInfoBean haib = hai.getHotelAdminInfo(haid, pwd);
			
			//获取此管理id的酒店id  hi
			session.setAttribute("user", haib);	   
			HotelAdminInfoBean hai2=(HotelAdminInfoBean) session.getAttribute("user");			
//
		    //获取酒店Id从管理员表
			HotelInfoService hi=new HotelInfoServiceImpl();
		
			HotelAdminInfoBean hai1=(HotelAdminInfoBean)session.getAttribute("user");
			//保存此酒店id的信息
			HotelInfoBean hib=hi.getHotelInfo(hai1.getHotelId());//通过酒店id获取此酒店的信息
			int hotelid=hai1.getHotelId();
			session.setAttribute("hotel",hib);	
			session.setAttribute("hotelid", hotelid);
		    session.setAttribute("user", haib);	    
			req.getRequestDispatcher("dist/html/index.jsp").forward(req, resp);
				
				
		
		}


		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String account = req.getParameter("uname");
			String pwd = req.getParameter("psw");
			System.out.println(account);
			HotelAdminService accountService = new HotelAdminServiceImpl();
			}
			
		}

