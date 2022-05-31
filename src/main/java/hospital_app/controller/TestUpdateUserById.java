package hospital_app.controller;

import hospital_app.dto.User;
import hospital_app.service.UserService;

public class TestUpdateUserById {

	public static void main(String[] args) {
		User user=new User();
		user.setBranchId(1);
		user.setName("madhu");
		user.setEmail("madhu@gmail.com");
		user.setPassword("madhu3535");
		user.setPhone(638388339l);
		user.setRole("nurse");
		user.setUserId(1);
		UserService userService=new UserService();
		User user1=userService.updateUserById(1, user);
		if(user!=null)
		{
			System.out.println("data insertd");
		}
		else
		{
			System.out.println("data not inserted");
		}

	}

}
