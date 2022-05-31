package hospital_app.service;

import java.util.List;

import hospital_app.dao.UserDao;
import hospital_app.dto.User;

public class UserService {
	UserDao userDao=new UserDao();
	public User saveUser(User user) {
		
		
		return userDao.saveUser(user);
	}

	public User getUserById(int id) {
		return userDao.getUserById(id);
		
	}

	public User validateUser(String email, String password) {
		return userDao.validateUser(email, password);
		
	}

	public User updateUserById(int id, User user) {
		
		return userDao.updateUserById(id, user);
	}

	public List<User> getAllUser() {
		
		return userDao.getAllUser();
	}

	public List<User> getAllUserByRole() {
		return null;
	}

	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
		
	}

}
