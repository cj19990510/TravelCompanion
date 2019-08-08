package cn.com.zx.travelcompanion.controller;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// http://localhost:8080/bank/XXXX?method=login

		String method = req.getParameter("method");
		if (method == null || method.isEmpty()) {
			method = "execute";
		}
		System.out.println("BaseController method  : " + method);

		Class c = this.getClass();
		System.out.println("BaseController Class  : " + c.getName());

		try {
			// 通过方法的名称获取方法的反射对象
			Method m = c.getMethod(method, HttpServletRequest.class, HttpServletResponse.class);
			// 反射方法的目标方法，也就是说，假设methodName为add，那么就调用add方法
			String result = (String) m.invoke(this, req, resp);
			System.out.println("BaseController result  : " + result);

			if (result != null && !result.isEmpty()) {
				req.getRequestDispatcher(result).forward(req, resp);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
