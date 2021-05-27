package com.hoangkhanh.beans;

public class Authenticator {
	public static boolean authenticator(String userName ,String password) {
		if("admin".equals(userName) && "123".equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
