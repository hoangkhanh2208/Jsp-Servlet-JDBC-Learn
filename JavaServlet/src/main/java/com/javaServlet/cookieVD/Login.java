package com.javaServlet.cookieVD;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<form action='/JavaServlet/login' method='post'>");
		writer.println("UserName: <input type='text' name='username'>" );
		writer.println("PassWord: <input type='password' name='password'>" );
		writer.println("<input type='submit' value='login'>" );
		writer.println("</form>");
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		
		if(userName.equals("hoangkhanhhs") && passWord.equals("Nhanphamtot")) {
			Cookie cookie = new Cookie("username", userName);
			
			cookie.setMaxAge(30);
			
			resp.addCookie(cookie);
			resp.sendRedirect("/JavaServlet/welcome");
		}else {
			resp.sendRedirect("/JavaServlet/login");
		}
	}
}
