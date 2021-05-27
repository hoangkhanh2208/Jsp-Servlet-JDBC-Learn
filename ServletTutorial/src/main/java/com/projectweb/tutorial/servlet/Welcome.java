package com.projectweb.tutorial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/welcome")
public class Welcome extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		ServletOutputStream out = resp.getOutputStream();
		
		String login = req.getParameter("user");
		if(login == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/formlogin");
			out.print("Ban can phai dang nhap!");
			dispatcher.include(req, resp);
		}else {
			String user = req.getParameter("username");
			String name = (String)req.getAttribute("abc");
			
			out.println("Xin chao " + user);
			out.print("name: " + name);
		}
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
