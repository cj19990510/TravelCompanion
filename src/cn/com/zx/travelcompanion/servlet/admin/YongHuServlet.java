package cn.com.zx.travelcompanion.servlet.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.bean.YongHuGL;
import cn.com.zx.travelcompanion.service.admin.YongHuService;

@WebServlet("/houtai")
public class YongHuServlet extends HttpServlet {

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
		
		String userid=req.getParameter("userid");
		int userId=Integer.parseInt(userid);

		YongHuService yongHuService=new YongHuService();
		List<UserInfoBean> list=yongHuService.chaxun(userId);
		
		List<YongHuGL> list1=yongHuService.chaxunDingDan(userId);
		String res=yongHuService.show(userId);
		
		if(res.equals("0")) {
			req.setAttribute("msg", "输入账号有误！");
			req.getRequestDispatcher("/yonghu.jsp").forward(req, resp);
    	 }else {
    		 HttpSession session = req.getSession();
    		session.setAttribute("list", list);
    		session.setAttribute("list1", list1);
    		req.getRequestDispatcher("/yonghu.jsp").forward(req, resp);
		}
		
	}
	
	

}
