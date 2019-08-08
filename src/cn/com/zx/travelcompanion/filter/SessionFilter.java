package cn.com.zx.travelcompanion.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cn.com.zx.travelcompanion.bean.Admin;

public class SessionFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		String url = req.getRequestURI();

		if (url.equals("/travelcompanion/login-houtai.jsp") || url.equals("/travelcompanion/houtai-insert.jsp")) {
			chain.doFilter(request, response);
		} else {
			Admin user = (Admin) req.getSession().getAttribute("user");

			if (user != null) {
				chain.doFilter(request, response);
			} else {
				System.out.println("session没通过验证，跳至首页");
				resp.sendRedirect("/travelcompanion/login-houtai.jsp");
			}
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}