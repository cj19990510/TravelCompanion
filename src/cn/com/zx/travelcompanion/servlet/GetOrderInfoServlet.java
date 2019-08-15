package cn.com.zx.travelcompanion.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.OrderInfoBean;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.HotelInfoDao;
import cn.com.zx.travelcompanion.dao.OrderInfoDao;
import cn.com.zx.travelcompanion.dao.UserInfoDao;

/**
 * 获取订单信息
 * dai
 */
@WebServlet("/GetOrderInfoServlet")
public class GetOrderInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetOrderInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		int userid=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserId();
		OrderInfoDao orderinfo=new OrderInfoDao();
		List<OrderInfoBean> orderlist=orderinfo.getOrderInfoByuserid(userid);
		
		HotelInfoDao hoteldao=new HotelInfoDao();
		List<HotelInfoPictureBean> hlist=new LinkedList<HotelInfoPictureBean>();
		for(int i=0;i<orderlist.size();i++){
			System.out.println("orderlist+"+orderlist.get(i));
			int hotelId=orderlist.get(i).getHotelId();
			List<HotelInfoPictureBean> newhlist=new LinkedList<HotelInfoPictureBean>();
			System.out.println("hotelId"+hotelId);
			newhlist=hoteldao.getHotelInfo(hotelId);
			
			System.out.println("hotelInfo"+newhlist.get(0).toString());
			if(newhlist.get(0)!=null){
				hlist.add(newhlist.get(0));
			}			
		}
		System.out.println("长度"+hlist.size());
        HttpSession session=request.getSession();
       
  		session.setAttribute("orderlist", orderlist);
  		session.setAttribute("hlist", hlist);
  		
  		
  		request.getRequestDispatcher("myOrder.jsp").forward(request,response);
 	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
