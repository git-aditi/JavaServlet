package com.company.javaservlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener2 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub

		System.out.println("Inside JavaServlet Context Initialized of MyServletContextListener2");
		
		//JDBC code to make some connection - Factory/ Singleton Design pattern
		sce.getServletContext().setAttribute("connection", "jdbcConnection");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

		System.out.println("Inside JavaServlet Context Destroyed of MyServletContextListener2");

	}

}
