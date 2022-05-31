package hospital_app.controller;

import hospital_app.service.UserService;

public class TestValidateUser {

	public static void main(String[] args) {
		
		UserService userService=new UserService();
		userService.validateUser("madhu@gmail.com", "madhu2435");

	}

}
