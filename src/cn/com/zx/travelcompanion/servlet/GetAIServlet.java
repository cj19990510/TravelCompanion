package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.google.gson.Gson;

import cn.com.zx.travelcompanion.AI.SortAI;
import cn.com.zx.travelcompanion.AI.StringUtil;
import cn.com.zx.travelcompanion.AI.recommend;
import cn.com.zx.travelcompanion.bean.HotelInfoPictureBean;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.HotelInfoDao;
import cn.com.zx.travelcompanion.dao.OrderInfoDao;

/**
 * Servlet implementation class GetAIServlet
 */
@WebServlet("/GetAIServlet")
public class GetAIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html;;charset=utf-8");
		String type =request.getParameter("type");
		List<HotelInfoPictureBean> list=new ArrayList<HotelInfoPictureBean>();
		HttpSession session=request.getSession();
		UserInfoBean user=(UserInfoBean)session.getAttribute("userinfo");
		OrderInfoDao od=new OrderInfoDao();
		String[] s=od.getValueToAI(type);
		String s1=od.getPersonValueToAI(type, user.getUserId());
		recommend rec = new recommend();
        rec.fit(s);
        double[] doubles = rec.recommendFun(s1);
        System.out.println(Arrays.toString(doubles));
        System.out.println(StringUtil.StringArrayDistincted(rec.getProduct()));
        SortAI cccc=new SortAI();
        //对数据进行排序，获取前十的值
        String[] c= cccc.sort(doubles,(String[])StringUtil.StringArrayDistincted(rec.getProduct()).toArray(new String[0]));
        for (String string : c) {
			HotelInfoDao hd=new HotelInfoDao();
			list.add(hd.getHotelInfo(Integer.valueOf(string)).get(0));
			
		}
        Gson gosn=new Gson();
        PrintWriter out=response.getWriter();
        out.print(gosn.toJson(list));
        out.flush();
        
	}
	public static void main(String[] args) {
		String type ="酒店";
		List<HotelInfoPictureBean> list=new ArrayList<HotelInfoPictureBean>();
		OrderInfoDao od=new OrderInfoDao();
		String[] s=StringUtil.deleteArrayNull(od.getValueToAI(type));
		String s1=od.getPersonValueToAI(type,1);
		System.out.println(s1);
		recommend rec = new recommend();
        rec.fit(s);
        double[] doubles = rec.recommendFun(s1);
        SortAI cccc=new SortAI();
        //对数据进行排序，获取前十的值
        String[] c= cccc.sort(doubles,(String[])StringUtil.StringArrayDistincted(rec.getProduct()).toArray(new String[0]));
/*       for (String string : c) {
			HotelInfoDao hd=new HotelInfoDao();
			list.add(hd.getHotelInfo(Integer.valueOf(string)).get(0));
			
		}*/
        Gson gosn=new Gson();
        System.out.println(gosn.toJson(list));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
