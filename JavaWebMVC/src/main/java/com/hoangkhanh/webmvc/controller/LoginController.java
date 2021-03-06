package com.hoangkhanh.webmvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hoangkhanh.webmvc.model.User;
import com.hoangkhanh.webmvc.service.UserService;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	 public LoginController() {
	        super();
	    }
	 
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/login.jsp");
		requestDispatcher.forward(req, resp);
	}
	 
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		
		UserService userService = new UserService();
		User user = new User(userName, passWord);
		
		if(userService.checkLogin(user)) {
			resp.sendRedirect("welcome");
		}else {
			resp.sendRedirect("login?err=1");
		}
	}
}
