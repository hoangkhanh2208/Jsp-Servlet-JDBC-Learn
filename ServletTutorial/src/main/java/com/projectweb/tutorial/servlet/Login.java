package com.projectweb.tutorial.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		ServletOutputStream out = resp.getOutputStream();

		String user = req.getParameter("username");

		if (user.equals("hoangkhanhhs")) {
			req.setAttribute("abc", "thoi anh khong choi dau");
			
			RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/welcome");

			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/formlogin");
			out.print("user khong dung!");
			dispatcher.include(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
