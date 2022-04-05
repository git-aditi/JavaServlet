package com.company.javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class MyFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

		System.out.println("Inside JavaServlet Project Init Method MyFilter");

	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("Inside JavaServlet Project DoFilter Method MyFilter");

		PrintWriter out = resp.getWriter();
		out.print("filter is invoked before");

		String password = req.getParameter("password");
		if (password.equals("admin123")) {
			chain.doFilter(req, resp);// sends request to next resource
		} else {
			out.println("username or password error!");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}

		out.print("filter is invoked after");
	}

	public void destroy() {
	}
}