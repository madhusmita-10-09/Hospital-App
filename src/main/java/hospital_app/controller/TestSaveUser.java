package hospital_app.controller;

import hospital_app.dto.User;
import hospital_app.service.UserService;

public class TestSaveUser {

	public static void main(String[] args) {
      UserService userservice=new UserService();
		
		User user1=new User();
		user1.setName("smita");
		user1.setEmail("smita@gmail.com");
		user1.setPhone(76366339l);
		user1.setRole("nurse");
		user1.setPassword("smita3450");
		user1.setBranchId(1);
		
		 userservice.saveUser(user1);
		
		
		
		
	}


}
