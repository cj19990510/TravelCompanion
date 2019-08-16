package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.google.gson.Gson;

import cn.com.zx.travelcompanion.bean.HotelInfoBean;
import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.RoomInfoBean;
import cn.com.zx.travelcompanion.dao.HotelInfoDao;
import cn.com.zx.travelcompanion.dao.RoomInfoDao;
@WebServlet("/GetDetailSpotServlet")
public class GetDetailSpotServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html;;charset=utf-8");
		HotelInfoDao hotelDao=new HotelInfoDao();
		int c=Integer.valueOf(request.getParameter("hotelId"));
		List<HotelInfoPictureBean> list=hotelDao.getHotelInfo(c);
		List<RoomInfoBean> listRoom=new RoomInfoDao().getspot(String.valueOf(c));
		HotelInfoPictureBean weq=list.get(0);
		request.setAttribute("spot",list);
		request.setAttribute("room",listRoom);
		request.getRequestDispatcher("single.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
