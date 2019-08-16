package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.dao.HotelInfoDao;

/**
 * Servlet implementation class HotelInfoGetInfo
 */

/**
 * @author 陈杰
 * 获得酒店等信息（只获取一张图片）
 *
 */
@WebServlet("/HotelInfoGetInfoServlet")
public class HotelInfoGetInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotelInfoGetInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html;;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String type=request.getParameter("type");
		HotelInfoDao hotelDao=new HotelInfoDao();
		List<HotelInfoPictureBean> list=hotelDao.getHotelInfo(type);
		Gson gson=new Gson();
		String hotel=gson.toJson(list);
		PrintWriter out=response.getWriter();
		out.print(hotel);
		out.flush();
		
	}
	public static void main(String[] args) {
		HotelInfoDao hotelDao=new HotelInfoDao();
		List<HotelInfoPictureBean> list=hotelDao.getHotelInfo("景点");
		Gson gson=new Gson();
		String hotel=gson.toJson(list);
		System.out.println(hotel);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
