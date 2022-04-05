package com.company.javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/demoServlet")
public class MyFirstServlet implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("Inside JavaServlet Project Init Method My First Servlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Inside ServletConfig");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Inside service");
		
		res.setContentType("text/html");
		res.getWriter().write("This is my first servlet::");
		
//		PrintWriter out = res.getWriter();
//		out.print("<html><body>");
//		out.print("<b>Hello Simple Servlet</b>");
//		out.print("<a href=\"index.jsp\"> </a>");
//		out.print("</body></html>");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "It is my first servlet.";
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy");

	}

}
