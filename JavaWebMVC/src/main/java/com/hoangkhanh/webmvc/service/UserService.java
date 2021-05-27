package com.hoangkhanh.webmvc.service;

import com.hoangkhanh.webmvc.model.User;

public class UserService {
	public boolean checkLogin(User user) {
		if("admin".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			return true;
		}
			return false;
	
	}
}
