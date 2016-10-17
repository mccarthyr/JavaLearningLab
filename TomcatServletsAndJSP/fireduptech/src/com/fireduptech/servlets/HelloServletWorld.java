package com.fireduptech.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServletWorld extends HttpServlet {


	public void init() throws ServletException {
		// Servlet initialisation code
		super.init();
	}


	public void doGet( HttpServletRequest request, 
		HttpServletResponse response ) throws ServletException, IOException {

		// Set the response content type
		response.setContentType( "text/html" );

		PrintWriter out = response.getWriter();
		out.println( "<h1>Hello Servlet World!</h1>" );

	}


	public void destroy() {
		// releasing resources
		super.destroy();
	}


}
