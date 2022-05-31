package hospital_app.controller;

import java.util.List;

import hospital_app.dto.Hospital;
import hospital_app.dto.User;
import hospital_app.service.HospitalService;
import hospital_app.service.UserService;

public class TestGetAllUserDetails {

	public static void main(String[] args) {
		
		UserService userService=new UserService();
		
		List<User> users=userService.getAllUser();
		
		for(User user:users)
		{
			System.out.println(""+user.getBranchId());
			System.out.println(""+user.getEmail());
			System.out.println(""+user.getEmail());
			System.out.println(""+user.getPassword());
			System.out.println(""+user.getPhone());
			System.out.println(""+user.getRole());
			System.out.println(""+user.getUserId());
		}


	}

}
