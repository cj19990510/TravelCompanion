package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.UserInfoDao;

/**
 * 获取用户信息dai
 */
@WebServlet("/SelectUserInfoServlet")
public class SelectUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectUserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-type", "text/html;;charset=utf-8");
		System.out.println("22222222");
		int  userid=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserId();
		String userName=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserName();
		String userPassword=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserPassword();
		UserInfoBean userinfobean=new UserInfoBean();
		System.out.println("userid+"+userid+"userName+"+userName+"+userPassword"+userPassword);
		UserInfoDao userinfo=new UserInfoDao();
		userinfobean=userinfo.getUserInfoByuserid(userid,userName,userPassword);
		System.out.println(userinfobean.toString());
		if(userinfobean!=null){
		    HttpSession session=request.getSession();
   		    session.setAttribute("userInfomation", userinfobean);
			request.getRequestDispatcher("userinfo.html").forward(request,response);
			
		}else{
			request.setAttribute("msg", "您还没有登录,请登录！");
    		request.getRequestDispatcher("userlogin.html").forward(request,response);
		}

	}

}
