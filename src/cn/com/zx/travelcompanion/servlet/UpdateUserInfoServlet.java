package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.DB.Md5;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.UserInfoDao;

/**
 * 更新个人信息  
 * dai
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-type", "text/html;;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String userName=request.getParameter("username");
		String userPassword=request.getParameter("userpassword");
		String userPhone=request.getParameter("userphone");
		String userPicture=request.getParameter("userpicture");
		String userEmail=request.getParameter("useremail");
		int userId=Integer.parseInt(request.getParameter("userid"));
		//int userid=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserId();
		
		Md5 md5=new Md5();
		String newuserPassword;
		try{
			newuserPassword=md5.EncoderByMd5(userPassword);
			UserInfoBean userinfobean=new UserInfoBean(userId, userName, newuserPassword, userPhone, userPicture,userEmail);
			UserInfoDao userinfo=new UserInfoDao();
			String olduserName=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserName();
			String oldpassword=((UserInfoBean)request.getSession().getAttribute("userinfo")).getUserPassword();
            System.out.println("新密码"+newuserPassword);
            System.out.println("旧密码"+oldpassword);
			if(!newuserPassword.equals(oldpassword)||!userName.equals(olduserName)){			
				int i=userinfo.updateUserInfo(userinfobean);
				if(i==1){
					response.getWriter().write("1");
				}else{
					response.getWriter().write("0");
				}
			}else{
				HttpSession session=request.getSession();
				int i=userinfo.updateUserInfo(userinfobean);						
				if(i==1){
					response.getWriter().write("2");
				}				
			}		
		}catch(Exception e){
			e.printStackTrace();
		}				
	}
}
