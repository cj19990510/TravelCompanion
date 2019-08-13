package cn.com.zx.travelcompanion.servlet.hotelAdmin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.HotelAdminInfoBean;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelAdminService;
import cn.com.zx.travelcompanion.service.hotelAdmin.HotelApplyService;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.HotelAdminServiceImpl;
import cn.com.zx.travelcompanion.serviceImp.hotelAdmin.HotelApplyServiceImp;

public class HotelApply extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setHeader("Content-Type", "text/html;charset=utf-8");
		
		String ht=req.getParameter("radio2"); //酒店类型
		String hn=req.getParameter("hotelName");//酒店名字
		String hp=req.getParameter("telephone");//酒店电话
		String hi=req.getParameter("hotelInfo");//公司信息     
		String city=req.getParameter("city");//城市
		String LN=req.getParameter("zhizhao");//营业执照号 LN
        String apply=req.getParameter("apply");//申请内容
        String lp=req.getParameter("lpicture");//图片
        HotelApplyService ha=new HotelApplyServiceImp();
     //   ha.hotelApply("hn", "hp", 1,null , "ht", "null", "187156461", "null");
        System.out.println("添加完成");
        
        
	
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		
      
	}            

}
