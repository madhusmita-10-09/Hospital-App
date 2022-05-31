package hospital_app.controller;

import hospital_app.service.UserService;

public class TestDeleteUserById {

	public static void main(String[] args) {
		
		UserService userService=new UserService();
		userService.deleteUserById(1);
	}

}
