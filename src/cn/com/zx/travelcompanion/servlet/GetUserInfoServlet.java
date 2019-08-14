package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.UserInfoDao;

/**
 * 获取用户信息  
 * author：dai
 */
@WebServlet("/GetUserInfoServlet")
public class GetUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html;;charset=utf-8");
		UserInfoBean userinfo=(UserInfoBean)request.getSession().getAttribute("userInfomation");
		System.out.println(userinfo);
		
		Gson gson=new Gson();
		String a=gson.toJson(userinfo);
        System.out.println("a+"+a);
        PrintWriter out=response.getWriter();
		out.print(a);
		out.flush();
	}

}
