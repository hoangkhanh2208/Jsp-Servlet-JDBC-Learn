package com.hoangkhanh.jstltutorial.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hoangkhanh.jstltutorial.beans.Dept;
import com.hoangkhanh.jstltutorial.utils.DBUtils;

@WebServlet(urlPatterns = "/jstlCoreExample01")
public class JstlCoreEx01Servlet extends HttpServlet{
	
	public JstlCoreEx01Servlet() {
        super();
    }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Dept> list = DBUtils.queryDepartments();

		req.setAttribute("departments", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsps/jstl_core_example02.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
