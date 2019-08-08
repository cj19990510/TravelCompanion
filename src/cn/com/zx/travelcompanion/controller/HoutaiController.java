package cn.com.zx.travelcompanion.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.zx.travelcompanion.bean.Admin;
import cn.com.zx.travelcompanion.service.admin.YongHuService;

//@WebServlet("/houtai")
public class HoutaiController extends BaseController {

	private static final long serialVersionUID = 1L;

	public String chaxun(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid=req.getParameter("userid");
		System.out.println(userid);

		//HttpSession session = req.getSession();
		YongHuService yongHuService=new YongHuService();
		List list=yongHuService.chaxun(userid);
		List list1=yongHuService.chaxunDingDan(userid);
		
		req.setAttribute("list", list);
		req.setAttribute("list1", list1);

		System.out.println("----");
		return "yonghu.jsp";
	}
	
	public String shanchu(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid=req.getParameter("userid");
		
		//HttpSession session = req.getSession();
		YongHuService yongHuService=new YongHuService();
		yongHuService.shanchu(userid);
		List list=null;
		List list1=null;
		
		req.setAttribute("list", list);
		req.setAttribute("list1", list1);

		return "yonghu.jsp";
	}
}
