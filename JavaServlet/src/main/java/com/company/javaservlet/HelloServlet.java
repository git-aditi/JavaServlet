package com.company.javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Inside JavaServlet Project DoGet Method HelloServlet");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<br>welcome to servlet<br>");
		out.close();

	}

}