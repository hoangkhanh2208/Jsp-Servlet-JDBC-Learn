package com.servletfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Log2Filter implements Filter{
	
	private String logFile;
	
	@Override
	public void destroy() {
		System.out.println("Log2Filter destroy!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(this.logFile != null) {
			this.logToFile(this.logFile);
		}
		
		chain.doFilter(request, response);
		
	}
	
	private void logToFile(String fileName) {
		 System.out.println("Write log to file " + fileName);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
//		this.logFile = filterConfig.getInitParameter("logFile");
//		
//		System.out.println("Log File " + logFile);
		
	}
	
}
