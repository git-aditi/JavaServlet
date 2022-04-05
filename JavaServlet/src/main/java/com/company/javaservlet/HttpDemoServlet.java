package com.company.javaservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/demoHttpServlet")
public class HttpDemoServlet extends HttpServlet {

	public void init() { //overridden from http from generic - inheritance 
		
		System.out.println("Inside JavaServlet Project Init Method Http Demo Servlet");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet");
		resp.getWriter().write("This is my first http servlet using get::");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost");
		resp.getWriter().write("This is my first http servlet using post::");

	}

	public void destroy() {

	}

}
