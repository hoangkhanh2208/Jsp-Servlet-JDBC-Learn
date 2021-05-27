package com.projectweb.tutorial.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/formlogin")
public class FormLogin extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		ServletOutputStream out = resp.getOutputStream();
		
		out.println("<form action='/ServletTutorial/login' method='get'>");
		out.println("User name: <input type='text' name='username' >");
		out.println("<input type='submit' value='Submit' >");
		out.println("</form >");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
