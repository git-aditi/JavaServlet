package com.company.javaservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/demoGeneric")
public class DemoGenericServlet extends GenericServlet{
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		System.out.println("Inside JavaServlet Project Init Method Demo Generic Servlet");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Inside service");
		res.getWriter().write("This is my demo generic servlet::");
		
	}

}
