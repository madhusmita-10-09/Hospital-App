package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class MedOrderDao implements MedOrderInterfaceDao{

	public MedOrder saveMedOrder(MedOrder medOrder) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		System.out.println("medorder added");
		return medOrder;

	}

	public double totalBill(List<Item> items,MedOrder medOrder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		double sum=0;
		for(Item item:items)
		{
			entityTransaction.begin();
			sum=sum+item.getCost()*item.getQuantity();
			medOrder.setTotalcost(sum);
			entityManager.merge(medOrder);
			entityTransaction.commit();
		}
		return sum;
		
	}

	public MedOrder getMedOrderById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(MedOrder.class, id);
		
		
	}

}
