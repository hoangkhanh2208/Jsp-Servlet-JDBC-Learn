package com.demodownload;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/download")
public class Download extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = request.getServletContext();

		String fullPath = context.getRealPath("/file/demo.txt");

		Path path = Paths.get(fullPath);
		byte[] data = Files.readAllBytes(path);

		// Set return information
		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition", "attachment; filename=demo.txt");
		response.setContentLength(data.length);
		InputStream inputStream = new BufferedInputStream(new ByteArrayInputStream(data));

		// Write response output stream file.

		OutputStream outputStream = response.getOutputStream();
		byte[] buffer = new byte[4096];
		int bytesRead = -1;
		
		while ((bytesRead = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, bytesRead);
		}
		
		inputStream.close();
		outputStream.close();
	}
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    doGet(request, response);
		  }
}
