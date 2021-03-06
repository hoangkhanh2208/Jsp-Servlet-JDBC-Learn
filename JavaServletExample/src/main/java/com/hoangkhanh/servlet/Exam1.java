package com.hoangkhanh.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hoangkhanh.beans.Authenticator;
import com.hoangkhanh.beans.UserAccount;

@WebServlet(urlPatterns = "/exam1", initParams = {
		@WebInitParam(name = "message", value = "Xin chao Khanh nhe")
})
public class Exam1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ServletConfig config = getServletConfig();
		RequestDispatcher rd =  null;
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		boolean checkAcc = Authenticator.authenticator(userName,password);
		if(checkAcc) {
			rd = req.getRequestDispatcher("/views/home.jsp");
			UserAccount userAccount = new UserAccount();
			userAccount.setUserName(userName);
			userAccount.setPassword(password);
			req.setAttribute("user", userAccount);
			rd.forward(req, resp);
		}else {
			rd = req.getRequestDispatcher("/views/error.jsp");
			rd.forward(req, resp);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
