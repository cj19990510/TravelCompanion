package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.HotelInfoDao;
import cn.com.zx.travelcompanion.dao.OrderInfoDao;

/**
 * Servlet implementation class OrderInfoPages
 */
@WebServlet("/OrderInfoPages")
public class OrderInfoPages extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderInfoPages() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		
		int userid=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserId();
		OrderInfoDao orderinfo=new OrderInfoDao();
		int currentPage = 1;
		String page = request.getParameter("page");
		if(page != null && page != "") {
			currentPage = Integer.parseInt(page);
		}
		HttpSession session = request.getSession();

		int totalPage=0;
		List<OrderInfoBean> orderlist=null;
		try {
			orderlist=orderinfo.chaXunDan(currentPage,userid);
			totalPage=orderinfo.totalPage(userid);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("orderlist+"+orderlist);
		System.out.println("totalPage+"+totalPage);
		
		
		request.setAttribute("totalPage", totalPage%2 == 0 ?(totalPage/2):(totalPage/2+1));
		request.setAttribute("orderlist", orderlist);
		request.setAttribute("curPage", currentPage);
        
		request.getRequestDispatcher("/myOrder.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
