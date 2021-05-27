package com.javaServlet.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet1"})
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		writer.print("Hello");
		
		Cookie cookie = new Cookie("name", "CHU HOANG KHANH");
		cookie.setMaxAge(10);
		
		resp.addCookie(cookie);
	
		
		Cookie cookie2 = new Cookie("age", "4324324");
		cookie2.setMaxAge(10);
		
		resp.addCookie(cookie2);
	}
}
