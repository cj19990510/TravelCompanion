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
 * Servlet implementation class GetUserInfosServlet
 */
@WebServlet("/GetUserInfosServlet")
public class GetUserInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserInfosServlet() {
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
          response.setHeader("Content-type", "text/html;;charset=utf-8");
          int userid=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserId();
          System.out.println("userid+"+userid);
          UserInfoDao userinfo=new UserInfoDao();
          UserInfoBean userbean=new UserInfoBean();
          userbean=userinfo.getUserInfoByuserId(userid);
          System.out.println("userbean+++++"+userbean.toString());
          Gson json=new Gson();
          String str=json.toJson(userbean);
          System.out.println("str+"+str);
          PrintWriter out=response.getWriter();
          out.write(str);
          out.flush();
          
          
  
          
	}

}
