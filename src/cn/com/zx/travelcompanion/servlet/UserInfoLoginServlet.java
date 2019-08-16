package cn.com.zx.travelcompanion.servlet;

import java.io.IOException;


import java.io.Writer;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.DB.Md5;
import cn.com.zx.travelcompanion.bean.UserInfoBean;
import cn.com.zx.travelcompanion.dao.UserInfoDao;





@WebServlet("/LoginServlet")
public class UserInfoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	UserInfoBean userinfo = (UserInfoBean) session.getAttribute("userinfo");
    	if(userinfo!=null){
    		request.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(request,response);
    	}else{
    		request.setAttribute("msg", "您还没有登录,请登录！");
    		request.getRequestDispatcher("userlogin.html").forward(request,response);
    	}
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  response.setHeader("Content-Type","text/html;;charset=utf-8");
    	  UserInfoBean userinfo=new UserInfoBean();
    	  String userName=request.getParameter("username");//得到页面js里面的data
    	  String userPassword=request.getParameter("userpassword");
    	  
    	  
    	  System.out.println("userpassword"+userPassword);
    	  Md5 md5=new Md5();
    	  try{
    		  String newuserPassword=md5.EncoderByMd5(userPassword);
    		  UserInfoDao userdao=new UserInfoDao();
        	  //
        	  userinfo=userdao.getUserInfoByuserName(userName, newuserPassword);
        	  Writer out=response.getWriter();
        	  if(userinfo==null){
        		  out.write("0");
        	  }else{
        		  HttpSession session=request.getSession();
        		  session.setAttribute("userinfo", userinfo);
        		  out.write("1");
        		  out.flush();
        	  }
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  
    	 
    }

}
