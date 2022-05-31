package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.User;

public class UserDao implements UserInterfaceDao {

	public User saveUser(User user) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);

		entityTransaction.commit();

		return user;

	}

	public User getUserById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager.find(User.class, id);

	}

	public User validateUser(String email, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String sql="SELECT u FROM User u FROM u.email=?1 AND u.password=?2";
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User> users=query.getResultList();
		return users.get(0);
	}

	public User updateUserById(int id, User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user1=entityManager.find(User.class, id);
		if(user1!=null)
			
		{
			entityTransaction.begin();
			entityManager.merge(user1);
			entityTransaction.commit();
			return entityManager.find(User.class,id);
		}
		else
		{
		
		return null;
	   }
	}

	public List<User> getAllUser() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String sql="SELECT u FROM User u";
		Query query=entityManager.createQuery(sql);
		return query.getResultList();

	}

	public List<User> getAllUserByRole() {
		return null;
	}

	public boolean deleteUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = enityManager.getTransaction();

		User user = enityManager.find(User.class, id);
		if (user != null) {
			entityTransaction.begin();
			enityManager.remove(user);
			entityTransaction.commit();
			System.out.println("delecting id is: " + id);
		} else {
			System.out.println("No record to deelect");
		}

		return false;
	}

}
