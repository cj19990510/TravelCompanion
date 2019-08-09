package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.UserInfoDao;

/**
 * 更新个人信息
 */
@WebServlet("/UpdateUserInfoServlet")
public class UpdateUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-type", "text/html;;charset=utf-8");
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPassword");
		String userPhone=request.getParameter("userPhone");
		String userPicture=request.getParameter("userPicture");
		String userEmail=request.getParameter("userEmail");
		int userid=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserId();
		UserInfoBean userinfobean=new UserInfoBean(userid, userName, userPassword, userPhone, userPicture,userEmail);
		UserInfoDao userinfo=new UserInfoDao();
		int i=userinfo.updateUserInfo(userinfobean);
		if(i==1){
			response.getWriter().write("1");
		}else{
			response.getWriter().write("0");
		}
		
		
	}
}
