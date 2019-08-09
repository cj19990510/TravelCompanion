package cn.com.zx.travelcompanion.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.Admin;
import cn.com.zx.travelcompanion.service.admin.InsertService;
import cn.com.zx.travelcompanion.service.admin.LoginService;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setHeader("Content-Type", "text/html;charset=utf-8");
		
		String adminName=req.getParameter("accountName");
		String password=req.getParameter("password2");
		
		InsertService insertService=new InsertService();
		long adminid=insertService.insert(adminName, password);
		
		
		HttpSession session = req.getSession();
		session.setAttribute("adminid", adminid);

		
		req.getRequestDispatcher("/login-houtai.jsp").forward(req, resp);

	}
	
}
