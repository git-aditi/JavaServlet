package com.company.javaservlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub

		System.out.println("Inside JavaServlet Context Initialized of MyServletContextListener");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

		System.out.println("Inside JavaServlet Context Destroyed of MyServletContextListener");

	}

}
