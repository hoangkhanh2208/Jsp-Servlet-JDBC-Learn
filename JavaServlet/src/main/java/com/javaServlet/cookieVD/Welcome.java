package com.javaServlet.cookieVD;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/welcome"})
public class Welcome extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
			
		String name = "";
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("username")) {
					name = c.getValue();
				}
			}
		}
		 
		if(name.equals("")) {
			resp.sendRedirect("/JavaServlet/login");
		}
		writer.print("Xin chao" + name);
	}
}
