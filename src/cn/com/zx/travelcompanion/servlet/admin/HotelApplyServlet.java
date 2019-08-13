package cn.com.zx.travelcompanion.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import cn.com.zx.travelcompanion.bean.HotelApply;
import cn.com.zx.travelcompanion.service.admin.HotelApplyService;
import cn.com.zx.travelcompanion.service.admin.HotelService;

@WebServlet("/hotelapply")
public class HotelApplyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setHeader("Content-Type", "text/html;charset=utf-8");
		
		String ApplyId=req.getParameter("applyId");
		HotelApplyService hotelApplyService=new HotelApplyService();
		hotelApplyService.delete(ApplyId);
		
		HotelService hotelService=new HotelService();
		List<HotelApply> list=hotelService.chaxun();
		
		HttpSession session = req.getSession();
		session.setAttribute("list4", list);
		req.getRequestDispatcher("jiudian.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
	}

	
}
