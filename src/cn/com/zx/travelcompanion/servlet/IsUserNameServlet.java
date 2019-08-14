package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.zx.travelcompanion.dao.UserInfoDao;

/**
 * 判断用户名是否在数据库已经存在
 * dai
 */
@WebServlet("/IsUserNameServlet")
public class IsUserNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IsUserNameServlet() {
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
	     String userName=request.getParameter("username");
	     UserInfoDao userinfo=new UserInfoDao();
	     boolean username=userinfo.getUserName(userName);//查数据库
	     if(username){//数据库查到已有该用户名
	    	 response.getWriter().write("用户名已存在");
	     }
	}

}
