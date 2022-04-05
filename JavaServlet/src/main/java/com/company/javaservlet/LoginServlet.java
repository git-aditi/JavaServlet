package com.company.javaservlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(value = "/login", initParams = {
		@WebInitParam(name = "email", value = "webmaster@domain.com", description = "Email from Webmaster") })
public class LoginServlet extends HttpServlet {

	public void init() { // overridden from http from generic - inheritance

		System.out.println("Inside JavaServlet Project Init Method Login Servlet");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet");
		resp.getWriter().write("<h1> Registration success: GET:</h1>");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// Specific to this servlet only
		// Following code in different servlet will give null as specifications are in
		// this servlet only
		ServletConfig sc = getServletConfig();
		String email = sc.getInitParameter("email");
		System.out.println("email :: " + email);

		// Shared object across all servlets
		ServletContext sco = getServletContext();
		ServletContext sco1 = getServletConfig().getServletContext();
		sco.getInitParameter("uname");
		System.out.println("Sco is :" + sco);

		String n = req.getParameter("userName");
		String p = req.getParameter("userPass");

		String connection = (String) sco.getAttribute("connection");
		
		System.out.println("object is :: " + connection);
		// connection.createStatement, get data from DB

		if (p.equals("servlet")) {

			out.print("In redirection::");
			RequestDispatcher rd = req.getRequestDispatcher("home");

			// Write logic for homepage here that is not correct

			rd.forward(req, resp);

			// resp.sendRedirect("home");
		} else {
			out.print("Sorry UserName or Password Error!");
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.include(req, resp);

		}
	}

	public void destroy() {

	}
}
