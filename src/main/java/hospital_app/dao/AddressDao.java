package hospital_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.dto.Person;

public class AddressDao implements AddressInterfaceDao{
	

	// save address using reference of address,it will save your data in your database//
	public Address saveAddress( Address address) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		System.out.println("address added");
		return address;

	}

	//get address by using id//
	//here if you give existsing id in your data base which is already present in your data base it will 
	//give all details about the address//
	public Address getAddressById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Address address=enityManager.find(Address.class,id);
		if(address!=null)
		{
			System.out.println("address id :"+address.getAddressId());
			System.out.println("Steet is: "+address.getStreet());
			System.out.println("pincode: "+address.getPincode());
			System.out.println("city: "+address.getCity());
			System.out.println("state: "+address.getState());
			System.out.println("country: "+address.getCountry());
		}
		else
		{
			System.out.println("No record to deelect");
		}
		
		return null;
		
	
	}

	//update address by using id,
	//here if id is already existing then it will update whatever you want to update it will update,
	//if id is not existing in your data base then new data will create in your data base//
	public Address updateAddressById(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Address address=entityManager.find(Address.class, id);
		if(address!=null)
			
		{
			entityTransaction.begin();
			entityManager.merge(address);
			entityTransaction.commit();
			return entityManager.find(Address.class,id);
		}
		else
		{
			return null;
		
	   }
		
	}

}
