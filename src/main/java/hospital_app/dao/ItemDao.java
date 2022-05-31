package hospital_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Item;

public class ItemDao implements ItemInterfaceDao {

	public Item saveItem(Item item) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		System.out.println("item added");
		return item;
		
	}

	public double calculateCost(double price,int quantity) {
		double sum=0;
		sum=sum+price*quantity;
		System.out.println("Amount of item "+sum);
		return sum;
		
	}

}
