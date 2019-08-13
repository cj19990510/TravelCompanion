package cn.com.zx.travelcompanion.servlet.admin;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.RemarkInfoBean;
import cn.com.zx.travelcompanion.service.admin.ChaPingService;

@WebServlet("/chaping")
public class ChaPingServlet extends HttpServlet {

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
		
		String userid=req.getParameter("userid1");
		String s1=req.getParameter("s1");
		
		HttpSession session = req.getSession();
		ChaPingService chaPingService=new ChaPingService();

		NumberFormat num = NumberFormat.getPercentInstance(); 
		num.setMaximumIntegerDigits(3); 
		num.setMaximumFractionDigits(2);
		
		if(s1.equals("请选择查询类型")){
			req.setAttribute("msg1", "请选择查询类型！");
			req.getRequestDispatcher("/chaping.jsp").forward(req, resp);
		}else if(s1.equals("按用户查询")){
             String res=chaPingService.show1(userid);
			if(res.equals("0")){
				req.setAttribute("msg1", "输入账号有误！");
				req.getRequestDispatcher("/chaping.jsp").forward(req, resp);
			}else{
			List<RemarkInfoBean> list=chaPingService.chaxun(userid);
			double count=chaPingService.remarkuser(userid);
			session.setAttribute("remark", num.format(count));
			session.setAttribute("list3", list);
    		req.getRequestDispatcher("/chaping.jsp").forward(req, resp);
			}
		}else {
			String res=chaPingService.show(userid);
			if(res.equals("0")){
				req.setAttribute("msg1", "输入酒店名有误！");
				req.getRequestDispatcher("/chaping.jsp").forward(req, resp);
			}else{
			
			List<RemarkInfoBean> list=chaPingService.chaxunName(userid);
			double count = chaPingService.remarkhotel(userid);
			session.setAttribute("remark", num.format(count));
			session.setAttribute("list3", list);
    		req.getRequestDispatcher("/chaping.jsp").forward(req, resp);
		}
		
	   }
		
	}
}
