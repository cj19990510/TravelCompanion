package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;
import java.io.Writer;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.DB.Md5;
import cn.com.zx.travelcompanion.dao.UserInfoDao;

/**
 * 用户注册
 * dai
 **
 **/
@WebServlet("/userRegisterServlet")
public class UserRegisterServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	 response.setHeader("Content-type", "text/html;;charset=utf-8");
    	 String userName=request.getParameter("username");
    	 String userPassword=request.getParameter("userpassword");
    	 String userPhone=request.getParameter("userphone");
    	 String userEmail=request.getParameter("useremail");
    	 System.out.println(userName+"11111..."+userPassword+"11...."+userPhone+"111.."+userEmail);
    	 UserInfoDao userinfo=new UserInfoDao();
    	 System.out.println(userName+"11111..."+userPassword+"11...."+userPhone+"111.."+userEmail);
    	 Md5 md5=new Md5();
    	 
    	 if((userName!=null||!"".equals(userName))&&(userPassword!=null||!"".equals(userPassword))&&(userPhone!=null||!"".equals(userPhone))&&(userEmail!=null||!"".equals(userEmail))){
    		 String newuserPassword;
			try {
				newuserPassword = md5.EncoderByMd5(userPassword);
				System.out.println("newuserPassword+"+newuserPassword);
				int i=userinfo.userRegister(userName, newuserPassword,userPhone,userEmail);
				System.out.println("!+i"+i);
				if(i==1){
	        		 response.getWriter().write("1");
	        	}else
	        	{
	    		   response.getWriter().write("0");
	    	     }
	    	 }catch (NoSuchAlgorithmException e) 
			 {			
				e.printStackTrace();
			 }
    	 }	   
     }
}
