package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form-nguoi-dung"})
public class FormPerson extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();
		
		writer.println("<form action='/test/them-nguoi-dung' method='get'>");
		writer.println("Ten: <input type='text' name='ten' >");
		writer.println("Tuoi: <input type='text' name='tuoi' >");
		writer.println("Dia chi: <input type='text' name='diachi' >");
		writer.println("<input type='submit' value='OK'>");
		writer.println("</form>");
	}
}
