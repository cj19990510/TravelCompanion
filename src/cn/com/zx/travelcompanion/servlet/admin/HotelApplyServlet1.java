package cn.com.zx.travelcompanion.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.HotelApply;
import cn.com.zx.travelcompanion.service.admin.HotelApplyService;
import cn.com.zx.travelcompanion.service.admin.HotelService;

@WebServlet("/hotelapply1")
public class HotelApplyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setHeader("Content-Type", "text/html;charset=utf-8");
		
		String ApplyId=req.getParameter("applyId");
		String hotelName=req.getParameter("hotelName");
		String hotelPhone=req.getParameter("hotelPhone");
		String hotelInfomation=req.getParameter("hotelInfomation");
		String type=req.getParameter("type");
		String cityId=req.getParameter("cityId");
		int cityid=Integer.parseInt(cityId); 
		
		HotelApplyService hotelApplyService=new HotelApplyService();
		hotelApplyService.insert(ApplyId, hotelName, hotelPhone, hotelInfomation, type, cityid);
		
		HotelService hotelService=new HotelService();
		List<HotelApply> list=hotelService.chaxun();
		HttpSession session = req.getSession();
		session.setAttribute("list4", list);
		req.getRequestDispatcher("jiudian.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//this.doPost(req, resp);
	}
}
