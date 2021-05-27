package util;

import java.util.HashMap;
import java.util.Map;

import bean.UserAccount;
import config.SecurityConfig;

public class DataDAO {
	private static final Map<String, UserAccount> mapUsers = new HashMap<String, UserAccount>();
	
	static {
		initUsers();
	}
	
	private static void initUsers() {
		UserAccount emp = new UserAccount("employee1", UserAccount.GENDER_MALE, "123", SecurityConfig.ROLE_EMPLOYEE);
		
		UserAccount mng = new UserAccount("manager1", UserAccount.GENDER_FEMALE, "123", SecurityConfig.ROLE_EMPLOYEE, SecurityConfig.ROLE_MANAGER);
	
		mapUsers.put(emp.getUserName(), emp);
		mapUsers.put(mng.getUserName(), mng);
		
	}
	
	public static UserAccount findUser(String userName, String password) {
		UserAccount userAccount = mapUsers.get(userName);
		if(userAccount != null && userAccount.getPassword().equals(password)) {
			return userAccount;
		}
		return null;
	}
}
