package cn.com.zx.travelcompanion.servlet.admin;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.service.admin.DingDanService;

@WebServlet("/dingdan")
public class DingDanServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setHeader("Content-Type", "text/html;charset=utf-8");
		
		int currentPage = 1;
		String page = req.getParameter("page");
		if(page != null && page != "") {
			currentPage = Integer.parseInt(page);
		}
		HttpSession session = req.getSession();

		String time=req.getParameter("time");
		session.setAttribute("time1", time);
		DingDanService dingDanService=new DingDanService();
		int totalPage=0;
		List<OrderInfoBean> list=null;
		try {
			list = dingDanService.chaXunDan(time,currentPage);
			totalPage=dingDanService.totapage(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("totalPage", totalPage%2 == 0 ?(totalPage/2):(totalPage/2+1));
		req.setAttribute("list2", list);
		req.setAttribute("curPage", currentPage);
        
		req.getRequestDispatcher("/dingdan.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		/*resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setHeader("Content-Type", "text/html;charset=utf-8");
		
		int currentPage = 1;
		String page = req.getParameter("page");
		if(page != null && page != "") {
			currentPage = Integer.parseInt(page);
		}
		
		String time=req.getParameter("time");
		
		DingDanService dingDanService=new DingDanService();
		int totalPage=0;
		List<OrderInfoBean> list=null;
		try {
			list = dingDanService.chaXunDan(time,currentPage);
			totalPage=dingDanService.totapage(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = req.getSession();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}
		req.setAttribute("totalPage", totalPage%2 == 0 ?(totalPage/2):(totalPage/2+1));
		req.setAttribute("list2", list);
		req.setAttribute("curPage", currentPage);
        
		req.getRequestDispatcher("/dingdan.jsp").forward(req, resp);*/
	}
	
	

}
