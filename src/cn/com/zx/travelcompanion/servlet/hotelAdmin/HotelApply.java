package cn.com.zx.travelcompanion.servlet.hotelAdmin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.service.hotelAdmin.CityService;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelAdminService;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelApplyService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.CityServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.HotelAdminServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.HotelApplyServiceImp;
@WebServlet("/HotelApply")
public class HotelApply extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		this.doPost(req, resp);
	
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
				resp.setCharacterEncoding("utf-8");
				req.setCharacterEncoding("utf-8");
				resp.setHeader("Content-Type", "text/html;charset=utf-8");
				
				String ht=req.getParameter("radio2"); //酒店类型
				String hn=req.getParameter("hotelName");//酒店名字
				String hp=req.getParameter("telephone");//酒店电话
				String hi=req.getParameter("hotelInfo");//公司信息     
			
				String LN=req.getParameter("zhizhao");//营业执照号 LN
		        String apply=req.getParameter("apply");//申请内容
		        String lp=req.getParameter("lpicture");//图片

			 	req.getRequestDispatcher("dist/html/index.jsp").forward(req, resp);
		        String city1=req.getParameter("city1");
		        String []arr=city1.split("-");
		       
		    	String city=arr[1];//城市
		  	    String pro=arr[0];//省份
		        System.out.println("省会"+pro);
		        System.out.println("城市"+city);
		        CityService cityi=new CityServiceImpl();//插入数据库中没有的city
		        cityi.cityInsert(city, pro);
		  
		        int cityid=cityi.Cityid(city);
		        
		        HotelApplyService ha=new HotelApplyServiceImp();
		        
		    ha.hotelApply(hn, hp, cityid,hi , ht, apply, LN, lp);//申请进入
		
		 	req.getRequestDispatcher("dist/html/index.jsp").forward(req, resp);
			
		
      
	}            

}
