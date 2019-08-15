package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.DB.GetNowTime;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.bean.UserInfoBean;

/**
 * Servlet implementation class OrderInsertServlet
 */
@WebServlet("/OrderInsertServlet")
public class OrderInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		UserInfoBean user=(UserInfoBean)session.getAttribute("userinfo");
		OrderInfoBean order=new OrderInfoBean();
		order.setUserId(user.getUserId());
		int hotel=Integer.valueOf(request.getParameter("hotelId"));
		int room=Integer.valueOf(request.getParameter("roomId"));
		BigDecimal mon=BigDecimal.valueOf(Integer.valueOf(request.getParameter("money")));
		order.setHotelId(hotel);
		order.setRoomId(room);
		order.setDayNum(1);
		order.setOrderMoney(mon);
		order.setOrderTime(GetNowTime.getNowTime());
		order.setOrderState("待接单");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
