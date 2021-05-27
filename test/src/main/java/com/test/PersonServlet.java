package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/them-nguoi-dung"})
public class PersonServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		writer.print("doPost");
		
		String ten = req.getParameter("ten");
		String tuoi = req.getParameter("tuoi");
		String diachi = req.getParameter("diachi");
		
		writer.println("Ten: " + ten + "Tuoi: " + tuoi + "Dia chi: " + diachi);
		
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("doGet");
		doPost(req, resp);
	}
}
