package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet{
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("Start servlet!");
	}
	
	@Override
	public void destroy() {
		System.out.println("End servlet!");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		
		System.out.println("phuong thuc cua request " + req.getMethod());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter waiter = resp.getWriter();
		
		waiter.println("<h1>Hello Khanhs</h1>");
		waiter.close();
	}
}
