package cn.com.zx.travelcompanion.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.Admin;
import cn.com.zx.travelcompanion.service.admin.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

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
		
		String adminid=req.getParameter("adminid");
		String password=req.getParameter("password");
		
		LoginService loginService=new LoginService();
		
		Admin admin=loginService.getAdmin(adminid, password);
		
		if(admin != null) {
			HttpSession session = req.getSession();
			session.setAttribute("adminid", adminid);
			req.getRequestDispatcher("/main-houtai.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "用户名或密码错误");
			req.getRequestDispatcher("/login-houtai.jsp").forward(req, resp);
		}
	}
	
	

}
