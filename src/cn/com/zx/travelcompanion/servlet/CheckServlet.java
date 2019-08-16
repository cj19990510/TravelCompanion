package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.bean.OrderInfoHotelBean;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.OrderInfoDao;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		
		int year =Integer.parseInt(request.getParameter("year"));
		int month =Integer.parseInt(request.getParameter("month"));
		System.out.println(year+" "+month);
		int userid=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserId();
		OrderInfoDao orderinfo=new OrderInfoDao();
		List<OrderInfoHotelBean> orderList=null;
		try {
			orderList=orderinfo.chaXunOrder(year, month, userid);
			//System.out.println(orderList.get(0).toString());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Writer out=response.getWriter();
		HttpSession session=request.getSession();
		if(orderList.isEmpty()){
			out.write("0");
			int sum=0;
			session.setAttribute("TotalMoney", sum);
			session.removeAttribute("orderlist");	
		}
		else{			
			session.setAttribute("orderlist", orderList);
			BigDecimal sum= BigDecimal.ZERO;
			for(int i=0;i<orderList.size();i++){
				sum=sum.add(orderList.get(i).getOrderMoney());
			}
			System.out.println(sum);
			session.setAttribute("TotalMoney", sum.toString());
			out.write("1");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
