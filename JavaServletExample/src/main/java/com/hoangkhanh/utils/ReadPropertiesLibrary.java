package com.hoangkhanh.utils;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesLibrary {
	public Properties readFileProperties() {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		Properties properties = new Properties();
		
		try {
			properties.load(classLoader.getResourceAsStream("/config.properties"));
			String user = properties.getProperty("user");
			String pass = properties.getProperty("pass");
			String url = properties.getProperty("url");
			
			System.out.println("USER : "+user);
			System.out.println("PASS : "+pass);
			System.out.println("URL : "+url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	
	public static void main(String[] args) {
		ReadPropertiesLibrary library = new ReadPropertiesLibrary();
		library.readFileProperties();
	}
}
