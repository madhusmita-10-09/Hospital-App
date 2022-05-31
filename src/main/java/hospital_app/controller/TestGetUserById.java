package hospital_app.controller;

import hospital_app.dto.User;
import hospital_app.service.UserService;

public class TestGetUserById {

	public static void main(String[] args) {
		UserService userService=new UserService();
		User user=userService.getUserById(1);
		System.out.println(user.getUserId());
		System.out.println(user.getBranchId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getPhone());
		System.out.println(user.getRole());
		

	}

}
